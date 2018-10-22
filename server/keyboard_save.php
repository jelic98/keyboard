<?php 
$connect = mysql_connect(".", ".", ".") or die(mysql_error()); 
   
mysql_select_db("jelic98_database") or die(mysql_error()); 

$link = $_GET['link']; 
$prilang = $_GET['prilang'];
$seclang = $_GET['seclang'];
$premium = $_GET['premium'];
$store = $_GET['store'];
$size = $_GET['size'];
$sound_v = $_GET['sound_v'];
$sound_c = $_GET['sound_c'];
$sound_h = $_GET['sound_h'];
$bgcolor= $_GET['bgcolor'];
$autocapitalize = $_GET['autocapitalize'];
$volumebuttons = $_GET['volumebuttons'];
$allcaps = $_GET['allcaps'];
$autospacing = $_GET['autospacing'];
$changekeyboard = $_GET['changekeyboard'];
$shakedelete = $_GET['shakedelete'];
$doublespace = $_GET['doublespace'];
$popup = $_GET['popup'];
$oppositecase = $_GET['oppositecase'];
$keypresscounter1 = $_GET['keypresscounter1'];
$keypresscounter2 = $_GET['keypresscounter2'];
$keypresscounter3 = $_GET['keypresscounter3'];
$time1 = $_GET['time1'];
$time2 = $_GET['time2'];
$time3 = $_GET['time3'];
$keypresses = $_GET['keypresses'];
$time = $_GET['time'];
$voiceinput = $_GET['voiceinput'];
$vibration = $_GET['vibration'];
 
$query = "SELECT * FROM keyboard WHERE link=" . "'" . $link. "'";
$result = mysql_query($query); 
$num_rows = mysql_num_rows($result);

if ($num_rows > 0) {
	$query = "DELETE FROM keyboard WHERE link=" . "'" . $link. "'";
	$result = mysql_query($query); 
}

$query = "INSERT INTO keyboard (link, prilang, seclang, premium, store, size, sound_v, sound_c, sound_h, bgcolor, autocapitalize, volumebuttons, allcaps, autospacing, changekeyboard, shakedelete, doublespace, popup, oppositecase, keypresscounter1, keypresscounter2, keypresscounter3, time1, time2, time3, keypresses, time, voiceinput, vibration) VALUES (" . "'" . $link ."', " . "'" . $prilang . "', " . "'" . $seclang."', " . "'" . $premium."', " . "'" . $store."', " . "'" . $size."', " . "'" . $sound_v."', " . "'" . $sound_c."', " . "'" . $sound_h."', " . "'" . $bgcolor."', " . "'" . $autocapitalize."', " . "'" . $volumebuttons."', " . "'" . $allcaps."', " . "'" . $autospacing."', " . "'" . $changekeyboard."', " . "'" . $shakedelete."', " . "'" . $doublespace."', " . "'" . $popup."', " . "'" . $oppositecase."', " . "'" . $keypresscounter1."', " . "'" . $keypresscounter2."', " . "'" . $keypresscounter3."', " . "'" . $time1."', " . "'" . $time2."', " . "'" . $time3."', " . "'" . $keypresses."', " . "'" . $time."', " . "'" . $voiceinput."', " . "'" . $vibration."'" . ")";

$result = mysql_query($query); 
  
mysql_close($connect);
?> 
