package keyboard.ecloga.com.eclogakeyboard;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private LayoutInflater inflater;
    private Context context;
    private ClickListener clickListener;
    private static final int TYPE_HEADER=0;
    private static final int TYPE_ITEM=1;
    List<Information> data = Collections.emptyList();

    public Adapter(Context context, List<Information> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == TYPE_HEADER){
            View view=inflater.inflate(R.layout.header_drawer, parent,false);
            HeaderHolder holder = new HeaderHolder(view);
            return holder;
        }
        else{
            View view=inflater.inflate(R.layout.item_drawer, parent,false);
            ItemHolder holder = new ItemHolder(view);
            return holder;
        }

    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0){
            return TYPE_HEADER;
        }
        else {
            return TYPE_ITEM;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof HeaderHolder ){

        }
        else{
            ItemHolder itemHolder = (ItemHolder) holder;
            Information current = data.get(position-1);
            itemHolder.title.setText(current.title);
            itemHolder.icon.setImageResource(current.iconId);
        }
    }

    @Override
    public int getItemCount() {
        return data.size() + 1;
    }

    class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title;
        ImageView icon;
        public ItemHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = (TextView) itemView.findViewById(R.id.listTitle);
            icon = (ImageView) itemView.findViewById(R.id.listIcon);
        }

        @Override
        public void onClick(View v) {
            if(clickListener != null) {
                clickListener.itemClicked(v, getPosition(), title, icon);

                itemView.setBackgroundResource(R.color.silver);
                icon.setColorFilter(Color.parseColor("#1976D2"));
                title.setTextColor(Color.parseColor("#FFFFFF"));
            }
        }
    }

    class HeaderHolder extends RecyclerView.ViewHolder {

        public HeaderHolder(View itemView) {
            super(itemView);

        }
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public interface ClickListener {
        public void itemClicked(View view, int position, TextView title, ImageView icon);
    }
}
