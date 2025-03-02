<%@ page import ='in.razorpay.shahid.main.*'%>
<h1 style='color:green;'>
	Generating wish message for the user :: 
	<%= new WishMessageService().wishUser("KOHLI") %>
</h1>