<HTML>

<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.lang.*" %>

<%@ page session="true" %>
<%
	String rFrom = (String)session.getAttribute("rFrom");
	String NoPass = (String)session.getAttribute("NoPass");

%>
<head>
	<LINK href="styles.css" type="text/css" rel="stylesheet">
<SCRIPT LANGUAGE="JavaScript">
<!--
var SCount = 0;


function toggleSelection(Obj)
	{
		var s = Obj.src;
		var Seats = document.forms(0).Seats;
		var NoSeats = "<%=NoPass%>";
		
		if (s.indexOf("images/grey_seat.PNG")>-1)
		{
			if(SCount>=parseInt(NoSeats)){
				alert("Already You have selected the required seats");
				return;
			}
			Obj.src = "images/green_seat.PNG";
			//alert("--"+Obj.alt);
			if(Seats.value==""){
				Seats.value = Obj.alt+",";
			}else{
				Seats.value += Obj.alt+",";
			}
			SCount++;
		}else if (s.indexOf("selectedSeat.gif")>-1)
		{
			Obj.src = "images/grey_seat.PNG";
			Seats.value=Seats.value.replace(Obj.alt+",","");
			SCount--;
		}else{
			alert("seat already booked");
		}
	}
//-->
</SCRIPT>
<head>
<body Class='SC'>
<HR>
<B><FONT COLOR="#CC00CC" face='verdana'>Seat Selection</FONT></B>
<HR>
<BR><BR>
<FORM ACTION="<%=request.getContextPath() %>/controller" method="post">
<%
/*Declaration of variables*/

Connection con=null;
Statement stmt=null;
ResultSet rs1=null;


String Fare = "100";


System.out.println(Fare);
int iNoPass=0,iFare=0;
if(Fare!=null){
	 iFare = Integer.parseInt(Fare);
}
System.out.println(iFare);
if(NoPass!=null){
	 iNoPass = Integer.parseInt(NoPass);
}
System.out.println(iNoPass);
int tFare = iFare*iNoPass;
System.out.println("Total Fare:"+tFare);
session.setAttribute("Fare",tFare+"");


int count=0,NumRows=0;
String BookedSeats="";
try
{
	/*Connection to MySQL database is made with JDBC class one driver*/
	con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gat?useSSL=false","root", "Tejasgr108@");
	
	stmt = con.createStatement();
	String Qry1 = "Select seat2 from book2";
	System.out.println(Qry1);
	rs1 = stmt.executeQuery(Qry1);
	while(rs1.next()){
		BookedSeats+=rs1.getString(1);
	}
	System.out.println("Seats already booked"+BookedSeats);
	stmt.close();
	con.close();
}
catch(Exception e)
{
	System.out.println("Exception"+e);
}
%>
<style>
.img{
WIDTH:50px;
HEIGHT:50px; 
BORDER:0;
}
</style>

UserName:<input type="text" name="username" placeholder="enter your username" required><br/>
Choose your seats <FONT COLOR="red">*</FONT>&nbsp;<INPUT TYPE="text" NAME="Seats" class="TextField">
<BR>
<FONT COLOR="#333399" size="-1" face='Times new roman'><I>select from the available seats from the layout below</I></FONT>
<H5>Bus Layout</H5>
<INPUT TYPE="image" SRC="images/grey_seat.PNG" WIDTH="18" HEIGHT="17" BORDER="0">Available&nbsp;
<IMG SRC="images/red_seat.PNG" WIDTH="18" HEIGHT="17" BORDER="0" ALT=""></IMG>Booked&nbsp;
<IMG SRC="images/green_seat.PNG" WIDTH="18" HEIGHT="17" BORDER="0" ALT=""></IMG>Selected&nbsp;
<BR><BR>
<TABLE>
<TR>
	<SCRIPT LANGUAGE="JavaScript">
	<!--
		var BookedSeats = "<%=BookedSeats%>";
		//alert(BookedSeats);
		for(i=1;i<=10;i++){
			if(BookedSeats.indexOf("a"+i)>-1){
			document.writeln("<TD><IMG SRC=\"images/red_seat.PNG \" style=\"cursor:hand\" alt='a"+i+"' class=\"img\" onclick=\"alert('seat already booked');\"></TD>");
			}else{
			document.writeln("<TD><IMG SRC=\"images/grey_seat.PNG\" style=\"cursor:hand\" alt='a"+i+"' class=\"img\" onclick='toggleSelection(this)'></TD>");
			}
		}
	//-->
	</SCRIPT>
</TR>
<TR>
	<SCRIPT LANGUAGE="JavaScript">
	<!--
		var BookedSeats = "<%=BookedSeats%>";
		//alert(BookedSeats);
		for(i=1;i<=10;i++){
			if(BookedSeats.indexOf("b"+i)>-1){
			document.writeln("<TD><IMG SRC=\"images/red_seat.PNG\" style=\"cursor:hand\" alt='b"+i+"' class=\"img\" onclick=\"alert('seat already booked');\"></TD>");
			}else{
			document.writeln("<TD><IMG SRC=\"images/grey_seat.PNG\" style=\"cursor:hand\" alt='b"+i+"' class=\"img\" onclick='toggleSelection(this)'></TD>");
			}
		}
	//-->
	</SCRIPT></TR>
<TR>
	<TD colspan=10 >&nbsp;</TD>
</TR>
<TR>
	<SCRIPT LANGUAGE="JavaScript">
	<!--
		var BookedSeats = "<%=BookedSeats%>";
		//alert(BookedSeats);
		for(i=1;i<=10;i++){
			if(BookedSeats.indexOf("c"+i)>-1){
			document.writeln("<TD><IMG SRC=\"images/red_seat.PNG\" style=\"cursor:hand\" alt='c"+i+"' class=\"img\" onclick=\"alert('seat already booked');\"></TD>");
			}else{
			document.writeln("<TD><IMG SRC=\"images/grey_seat.PNG\" style=\"cursor:hand\" alt='c"+i+"' class=\"img\" onclick='toggleSelection(this)'></TD>");
			}
		}
	//-->
	</SCRIPT></TR>
<TR>
	<SCRIPT LANGUAGE="JavaScript">
	<!--
		var BookedSeats = "<%=BookedSeats%>";
		//alert(BookedSeats);
		for(i=1;i<=10;i++){
			if(BookedSeats.indexOf("d"+i)>-1){
			document.writeln("<TD><IMG SRC=\"images/red_seat.PNG\" style=\"cursor:hand\" alt='d"+i+"' class=\"img\" onclick=\"alert('seat already booked');\"></TD>");
			}else{
			document.writeln("<TD><IMG SRC=\"images/grey_seat.PNG\" style=\"cursor:hand\" alt='d"+i+"' class=\"img\" onclick='toggleSelection(this)'></TD>");
			}
		}
	//-->
	</SCRIPT></TR>
	 <input type="hidden" name="form" value="bookticketsmethod3">
     <input type="submit" name="book" class="btn btn-primary" value="book">
	
</TABLE>

</FORM>
</BODY>
</HTML>