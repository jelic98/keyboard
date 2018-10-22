<?php 
$connect = mysql_connect(".", ".", ".") or die(mysql_error()); 
   
mysql_select_db("jelic98_database") or die(mysql_error()); 

$link = $_GET['link']; 

$query = "SELECT * FROM keyboard WHERE link=" . "'" . $link. "'";
$result = mysql_query($query); 

if($result){
     while($row = mysql_fetch_array( $result )) {
         echo $row['link'] 
         . " " . $row['prilang']
         . " " . $row['seclang']
         . " " . $row['premium']
         . " " . $row['store']
         . " " . $row['size']
         . " " . $row['sound_v']
         . " " . $row['sound_c']
         . " " . $row['sound_h']
         . " " . $row['bgcolor']
         . " " . $row['autocapitalize']
         . " " . $row['volumebuttons']
         . " " . $row['allcaps']
         . " " . $row['autospacing']
         . " " . $row['changekeyboard']
         . " " . $row['shakedelete']
         . " " . $row['doublespace']
         . " " . $row['popup']
         . " " . $row['oppositecase']
         . " " . $row['keypresscounter1']
         . " " . $row['keypresscounter2']
         . " " . $row['keypresscounter3']
         . " " . $row['time1']
         . " " . $row['time2']
         . " " . $row['time3']
         . " " . $row['keypresses']
         . " " . $row['time']
         . " " . $row['voiceinput']
         . " " . $row['vibration'];
    }
  }
  
mysql_close($connect);
?> 
