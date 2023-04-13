Skip to content
Search or jump to�
Pull requests
Issues
Codespaces
Marketplace
Explore
 
@rammolankula 
Java-Techie-jt
/
spring-boot-email-freemarker
Public
Fork your own copy of Java-Techie-jt/spring-boot-email-freemarker
Code
Issues
Pull requests
Actions
Projects
Security
Insights
spring-boot-email-freemarker/src/main/resources/templates/email-template.ftl
@basahota
basahota #code
Latest commit b3170ae on Nov 14, 2018
 History
 1 contributor
41 lines (38 sloc)  1.45 KB
 

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Java Techie Mail</title>
</head>

<body>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td align="center" valign="top" bgcolor="#838383"
				style="background-color: #838383;"><br> <br>
				<table width="600" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="center" valign="top" bgcolor="#d3be6c"
							style="background-color: #d3be6c; font-family: Arial, Helvetica, sans-serif; font-size: 13px; color: #000000; padding: 0px 15px 10px 15px;">
							
							<div style="font-size: 48px; color:blue;">
								<b>Ram iT</b>
							</div>
							
							<div style="font-size: 24px; color: #555100;">
								<br> Sending Email using Spring Boot with <b>FreeMarker
									template !!! <br>
							</div>
							<div>
								<br>Ram iT
								<br> ""lEARN SOMETHING"<br>
								<br>"Sharing the knowledge is biggest learning" <br> <br>
								<br> <br> <b>${Name}</b><br>${location}<br>
								<br>
							</div>
						</td>
					</tr>
				</table> <br> <br></td>
		</tr>
	</table>
</body>
</html>