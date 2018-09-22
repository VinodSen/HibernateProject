<%@ page import="com.vinod.USERDAO"%>
<jsp:useBean id="obj" class="com.vinod.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj" />
<%
	int i = USERDAO.register(obj);
	if(i > 0)
	{
		out.println("save sussfully in DB");
	}
%>