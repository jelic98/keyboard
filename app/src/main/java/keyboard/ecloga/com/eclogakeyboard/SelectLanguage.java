package keyboard.ecloga.com.eclogakeyboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.CheckBox;

import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.SnackbarManager;

public class SelectLanguage extends Activity {

    private int counter_pri, counter_sec;
    private String index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.8), (int) (height * 0.8));

        counter_pri = 1;
        counter_sec = 1;

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                index = null;
            } else {
                index = extras.getString("index");
            }
        } else {
            index = (String) savedInstanceState.getSerializable("index");
        }

        assert index != null;
        if(index.equals("primary")) {
            final CheckBox cbEnglish = (CheckBox) findViewById(R.id.cbEnglish);
            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("en")) {
                cbEnglish.setChecked(true);
            }else{
                cbEnglish.setChecked(false);
            }
            cbEnglish.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(cbEnglish.isChecked()) {
                        if(counter_pri == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbEnglish.setChecked(false);
                        }else {
                            counter_pri++;
                            Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("prilang", "en", getApplicationContext());
                            }else {
                                Preferences.setDefaults("seclang", "en", getApplicationContext());
                            }
                        }
                    }else {
                        counter_pri--;
                        Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                        Preferences.setDefaults("prilang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbSerbian = (CheckBox) findViewById(R.id.cbSerbian);
            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("sr")) {
                cbSerbian.setChecked(true);
            }else{
                cbSerbian.setChecked(false);
            }
            cbSerbian.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbSerbian.isChecked()) {
                        if (counter_pri == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbSerbian.setChecked(false);
                        } else {
                            counter_pri++;
                            Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                            if (Preferences.getDefaults("prilang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("prilang", "sr", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "sr", getApplicationContext());
                            }
                        }
                    } else {
                        counter_pri--;
                        Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                        Preferences.setDefaults("prilang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbGreek = (CheckBox) findViewById(R.id.cbGreek);
            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("el")) {
                cbGreek.setChecked(true);
            }else{
                cbGreek.setChecked(false);
            }
            cbGreek.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbGreek.isChecked()) {
                        if (counter_pri == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbGreek.setChecked(false);
                        } else {
                            counter_pri++;
                            Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                            if (Preferences.getDefaults("prilang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("prilang", "el", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "el", getApplicationContext());
                            }
                        }
                    } else {
                        counter_pri--;
                        Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                        Preferences.setDefaults("prilang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbRussian = (CheckBox) findViewById(R.id.cbRussian);
            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("ru")) {
                cbRussian.setChecked(true);
            }else{
                cbRussian.setChecked(false);
            }
            cbRussian.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbRussian.isChecked()) {
                        if (counter_pri == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbRussian.setChecked(false);
                        } else {
                            counter_pri++;
                            Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                            if (Preferences.getDefaults("prilang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("prilang", "ru", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "ru", getApplicationContext());
                            }
                        }
                    } else {
                        counter_pri--;
                        Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                        Preferences.setDefaults("prilang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbSpanish = (CheckBox) findViewById(R.id.cbSpanish);
            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("es")) {
                cbSpanish.setChecked(true);
            }else{
                cbSpanish.setChecked(false);
            }
            cbSpanish.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbSpanish.isChecked()) {
                        if (counter_pri == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbSpanish.setChecked(false);
                        } else {
                            counter_pri++;
                            Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                            if (Preferences.getDefaults("prilang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("prilang", "es", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "es", getApplicationContext());
                            }
                        }
                    } else {
                        counter_pri--;
                        Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                        Preferences.setDefaults("prilang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbItalian = (CheckBox) findViewById(R.id.cbItalian);
            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("it")) {
                cbItalian.setChecked(true);
            }else{
                cbItalian.setChecked(false);
            }
            cbItalian.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbItalian.isChecked()) {
                        if (counter_pri == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbItalian.setChecked(false);
                        } else {
                            counter_pri++;
                            Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                            if (Preferences.getDefaults("prilang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("prilang", "it", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "it", getApplicationContext());
                            }
                        }
                    } else {
                        counter_pri--;
                        Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                        Preferences.setDefaults("prilang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbGerman = (CheckBox) findViewById(R.id.cbGerman);
            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("de")) {
                cbGerman.setChecked(true);
            }else{
                cbGerman.setChecked(false);
            }
            cbGerman.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbGerman.isChecked()) {
                        if (counter_pri == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbGerman.setChecked(false);
                        } else {
                            counter_pri++;
                            Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                            if (Preferences.getDefaults("prilang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("prilang", "de", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "de", getApplicationContext());
                            }
                        }
                    } else {
                        counter_pri--;
                        Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                        Preferences.setDefaults("prilang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbCzech = (CheckBox) findViewById(R.id.cbCzech);
            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("cz")) {
                cbCzech.setChecked(true);
            }else{
                cbCzech.setChecked(false);
            }
            cbCzech.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbCzech.isChecked()) {
                        if (counter_pri == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one languacz")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbCzech.setChecked(false);
                        } else {
                            counter_pri++;
                            Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                            if (Preferences.getDefaults("prilang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("prilang", "cz", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "cz", getApplicationContext());
                            }
                        }
                    } else {
                        counter_pri--;
                        Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                        Preferences.setDefaults("prilang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbFrench = (CheckBox) findViewById(R.id.cbFrench);
            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("fr")) {
                cbFrench.setChecked(true);
            }else{
                cbFrench.setChecked(false);
            }
            cbFrench.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbFrench.isChecked()) {
                        if (counter_pri == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbFrench.setChecked(false);
                        } else {
                            counter_pri++;
                            Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                            if (Preferences.getDefaults("prilang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("prilang", "fr", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "fr", getApplicationContext());
                            }
                        }
                    } else {
                        counter_pri--;
                        Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                        Preferences.setDefaults("prilang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbHungarian = (CheckBox) findViewById(R.id.cbHungarian);
            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("hu")) {
                cbHungarian.setChecked(true);
            }else{
                cbHungarian.setChecked(false);
            }
            cbHungarian.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbHungarian.isChecked()) {
                        if (counter_pri == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbHungarian.setChecked(false);
                        } else {
                            counter_pri++;
                            Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                            if (Preferences.getDefaults("prilang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("prilang", "hu", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "hu", getApplicationContext());
                            }
                        }
                    } else {
                        counter_pri--;
                        Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                        Preferences.setDefaults("prilang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbTurkish = (CheckBox) findViewById(R.id.cbTurkish);
            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("tr")) {
                cbTurkish.setChecked(true);
            }else{
                cbTurkish.setChecked(false);
            }
            cbTurkish.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbTurkish.isChecked()) {
                        if (counter_pri == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbTurkish.setChecked(false);
                        } else {
                            counter_pri++;
                            Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                            if (Preferences.getDefaults("prilang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("prilang", "tr", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "tr", getApplicationContext());
                            }
                        }
                    } else {
                        counter_pri--;
                        Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                        Preferences.setDefaults("prilang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbRomanian = (CheckBox) findViewById(R.id.cbRomanian);
            if(Preferences.getDefaults("prilang", getApplicationContext()).equals("ro")) {
                cbRomanian.setChecked(true);
            }else{
                cbRomanian.setChecked(false);
            }
            cbRomanian.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbRomanian.isChecked()) {
                        if (counter_pri == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbRomanian.setChecked(false);
                        } else {
                            counter_pri++;
                            Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                            if (Preferences.getDefaults("prilang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("prilang", "ro", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "ro", getApplicationContext());
                            }
                        }
                    } else {
                        counter_pri--;
                        Preferences.setDefaults("counter_pri", String.valueOf(counter_pri), getApplicationContext());

                        Preferences.setDefaults("prilang", "null", getApplicationContext());
                    }
                }
            });
        }else if(index.equals("secondary")) {
            final CheckBox cbEnglish = (CheckBox) findViewById(R.id.cbEnglish);
            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("en")) {
                cbEnglish.setChecked(true);
            }else{
                cbEnglish.setChecked(false);
            }
            cbEnglish.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(cbEnglish.isChecked()) {
                        if(counter_sec == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbEnglish.setChecked(false);
                        }else {
                            counter_sec++;
                            Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("seclang", "en", getApplicationContext());
                            }else {
                                Preferences.setDefaults("seclang", "en", getApplicationContext());
                            }
                        }
                    }else {
                        counter_sec--;
                        Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                        Preferences.setDefaults("seclang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbSerbian = (CheckBox) findViewById(R.id.cbSerbian);
            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("sr")) {
                cbSerbian.setChecked(true);
            }else{
                cbSerbian.setChecked(false);
            }
            cbSerbian.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbSerbian.isChecked()) {
                        if (counter_sec == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbSerbian.setChecked(false);
                        } else {
                            counter_sec++;
                            Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                            if (Preferences.getDefaults("seclang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("seclang", "sr", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "sr", getApplicationContext());
                            }
                        }
                    } else {
                        counter_sec--;
                        Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                        Preferences.setDefaults("seclang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbGreek = (CheckBox) findViewById(R.id.cbGreek);
            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("el")) {
                cbGreek.setChecked(true);
            }else{
                cbGreek.setChecked(false);
            }
            cbGreek.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbGreek.isChecked()) {
                        if (counter_sec == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbGreek.setChecked(false);
                        } else {
                            counter_sec++;
                            Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                            if (Preferences.getDefaults("seclang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("seclang", "el", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "el", getApplicationContext());
                            }
                        }
                    } else {
                        counter_sec--;
                        Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                        Preferences.setDefaults("seclang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbRussian = (CheckBox) findViewById(R.id.cbRussian);
            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("ru")) {
                cbRussian.setChecked(true);
            }else{
                cbRussian.setChecked(false);
            }
            cbRussian.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbRussian.isChecked()) {
                        if (counter_sec == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbRussian.setChecked(false);
                        } else {
                            counter_sec++;
                            Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                            if (Preferences.getDefaults("seclang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("seclang", "ru", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "ru", getApplicationContext());
                            }
                        }
                    } else {
                        counter_sec--;
                        Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                        Preferences.setDefaults("seclang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbSpanish = (CheckBox) findViewById(R.id.cbSpanish);
            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("es")) {
                cbSpanish.setChecked(true);
            }else{
                cbSpanish.setChecked(false);
            }
            cbSpanish.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbSpanish.isChecked()) {
                        if (counter_sec == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbSpanish.setChecked(false);
                        } else {
                            counter_sec++;
                            Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                            if (Preferences.getDefaults("seclang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("seclang", "es", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "es", getApplicationContext());
                            }
                        }
                    } else {
                        counter_sec--;
                        Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                        Preferences.setDefaults("seclang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbItalian = (CheckBox) findViewById(R.id.cbItalian);
            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("it")) {
                cbItalian.setChecked(true);
            }else{
                cbItalian.setChecked(false);
            }
            cbItalian.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbItalian.isChecked()) {
                        if (counter_sec == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbItalian.setChecked(false);
                        } else {
                            counter_sec++;
                            Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                            if (Preferences.getDefaults("seclang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("seclang", "it", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "it", getApplicationContext());
                            }
                        }
                    } else {
                        counter_sec--;
                        Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                        Preferences.setDefaults("seclang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbGerman = (CheckBox) findViewById(R.id.cbGerman);
            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("de")) {
                cbGerman.setChecked(true);
            }else{
                cbGerman.setChecked(false);
            }
            cbGerman.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbGerman.isChecked()) {
                        if (counter_sec == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbGerman.setChecked(false);
                        } else {
                            counter_sec++;
                            Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                            if (Preferences.getDefaults("seclang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("seclang", "de", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "de", getApplicationContext());
                            }
                        }
                    } else {
                        counter_sec--;
                        Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                        Preferences.setDefaults("seclang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbCzech = (CheckBox) findViewById(R.id.cbCzech);
            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("cz")) {
                cbCzech.setChecked(true);
            }else{
                cbCzech.setChecked(false);
            }
            cbCzech.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbCzech.isChecked()) {
                        if (counter_sec == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one languacz")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbCzech.setChecked(false);
                        } else {
                            counter_sec++;
                            Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                            if (Preferences.getDefaults("seclang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("seclang", "cz", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "cz", getApplicationContext());
                            }
                        }
                    } else {
                        counter_sec--;
                        Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                        Preferences.setDefaults("seclang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbFrench = (CheckBox) findViewById(R.id.cbFrench);
            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("fr")) {
                cbFrench.setChecked(true);
            }else{
                cbFrench.setChecked(false);
            }
            cbFrench.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbFrench.isChecked()) {
                        if (counter_sec == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbFrench.setChecked(false);
                        } else {
                            counter_sec++;
                            Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                            if (Preferences.getDefaults("seclang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("seclang", "fr", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "fr", getApplicationContext());
                            }
                        }
                    } else {
                        counter_sec--;
                        Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                        Preferences.setDefaults("seclang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbHungarian = (CheckBox) findViewById(R.id.cbHungarian);
            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("hu")) {
                cbHungarian.setChecked(true);
            }else{
                cbHungarian.setChecked(false);
            }
            cbHungarian.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbHungarian.isChecked()) {
                        if (counter_sec == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbHungarian.setChecked(false);
                        } else {
                            counter_sec++;
                            Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                            if (Preferences.getDefaults("seclang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("seclang", "hu", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "hu", getApplicationContext());
                            }
                        }
                    } else {
                        counter_sec--;
                        Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                        Preferences.setDefaults("seclang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbTurkish = (CheckBox) findViewById(R.id.cbTurkish);
            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("tr")) {
                cbTurkish.setChecked(true);
            }else{
                cbTurkish.setChecked(false);
            }
            cbTurkish.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbTurkish.isChecked()) {
                        if (counter_sec == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbTurkish.setChecked(false);
                        } else {
                            counter_sec++;
                            Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                            if (Preferences.getDefaults("seclang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("seclang", "tr", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "tr", getApplicationContext());
                            }
                        }
                    } else {
                        counter_sec--;
                        Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                        Preferences.setDefaults("seclang", "null", getApplicationContext());
                    }
                }
            });

            final CheckBox cbRomanian = (CheckBox) findViewById(R.id.cbRomanian);
            if(Preferences.getDefaults("seclang", getApplicationContext()).equals("ro")) {
                cbRomanian.setChecked(true);
            }else{
                cbRomanian.setChecked(false);
            }
            cbRomanian.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cbRomanian.isChecked()) {
                        if (counter_sec == 1) {
                            SnackbarManager.show(
                                    Snackbar.with(getApplicationContext())
                                            .text("Select only one language")
                                            .duration(Snackbar.SnackbarDuration.LENGTH_SHORT)
                                            .color(getResources().getColor(R.color.accent))
                                            .textColor(getResources().getColor(R.color.gray))
                                    , SelectLanguage.this);

                            cbRomanian.setChecked(false);
                        } else {
                            counter_sec++;
                            Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                            if (Preferences.getDefaults("seclang", getApplicationContext()).equals("null")) {
                                Preferences.setDefaults("seclang", "ro", getApplicationContext());
                            } else {
                                Preferences.setDefaults("seclang", "ro", getApplicationContext());
                            }
                        }
                    } else {
                        counter_sec--;
                        Preferences.setDefaults("counter_sec", String.valueOf(counter_sec), getApplicationContext());

                        Preferences.setDefaults("seclang", "null", getApplicationContext());
                    }
                }
            });
        }
    }
}
