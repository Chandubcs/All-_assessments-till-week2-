<%@page contentType="text/html" %>
<h1>THIS IS JSP</h1>
<h3>
Before start of the block
</h3>
<%
for(int i=0;i<10;i++)
{
out.println("<br>i value="+i);
}
%>
<h3>
after the end of the code of block </h3>
<% ...this is jspcomment..%>
