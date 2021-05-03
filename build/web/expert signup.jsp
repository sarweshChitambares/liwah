
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <script>
        function check()
        {
        if(sge.expName.value==0)
        alert("your name is required")
        if(sge.expID.value==0)
        alert("your id is required")
        if(sge.age.value==0)
        alert("age is required")
        if(sge.eMail.value==0)
        alert("email id is required")
        if(sge.contact.value==0)
        alert("contact no is required")
        if(sge.pass.value==0)
        alert("password is required")
        }
    </script>
     <style>
        .themeorange
        {
            background:#F6A600;
            font-family:arial;
            font-weight: bold;
        }
        .themeblack
        {
            background:#69696;
            font-family:arial;
            font-weight: bold;
        }
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>expert sign up</title>
    </head>
    <body>
<div style="background-image:url(bg0.png); background-repeat:no-repeat; background-position:center; background-size:120% 100%" ;>
    <marquee><h1>Show Your skill's Expert </h1></marquee>
    <table bgcolor="#F6A600" width="100%">
            <tr>
                <td class="theme" colspan="4"><img src="liwahfixit.png" >
                </td>
            <td align="center" >
                <table >
                    <tr>
                        <td><a href="contactus.jsp">contact us</a></td>
                        <td><a href="aboutus.jsp">about us</a></td>
                        <td><a href="customer care.jsp">help</a></td>
                    </tr>
                </table>
            </td>
            </tr>
        <tr width="60%">
            <td>
                <table align="center"><tr><td>
            <select>
                     <option>view services
                     <option>Hardware Related
                     <option>Software Related
                     <option>network related
                     <option>pc related    
                     <option>console related    
                     <option>android rooting related
                     <option>hacking related
                     <option>booting related
                     <option>custom rom related    
                 </select></td>
                 <td align ="center">
                 <select>
                     <option>view support
                     <option>problem request's
                     <option>solution's
                     <option>suggestions
                     <option>get personal help    
                     <option>about us     
                 </select>
                 </td>
                 <td height="10%" align ="center">
                 <select>
                     <option>view queries
                     <option>windows 
                     <option>android 
                        <option>ios 
                        <option>hardware 
                         <option>network 
                         <option>dll's      
                 </select>
                 </td>  
                   <td align ="center">
                  <select>  <option>doorstep services
                    <option>hardware expert's
                    <option>software expert's     
                  </select>
                </td>    
            
                </table></td></tr>
        </table>
    
    <table >
        <tr><td><marquee behavior="scroll" direction="down" >latest news</marquee></td>
            <td>
                <form action="addexpert.jsp" name="sge">
                <table>
                    <tr><td>expert Name</td>
                    <td><input type="text" name="expNmae" style="border-radius:30px"></td></tr>
                   
                    <tr><td>expert Id</td>
                     <td><input type="text" name="expId" style="border-radius:30px"></td></tr>
                    <tr><td>age</td>
                     <td><input type="text" name="age" style="border-radius:30px"></td></tr>
                    
                    <tr><td>Email Id</td>
                    <td><input type="text" name="eMail" style="border-radius:30px"></td></tr>
                    <tr><td>Contact no.</td>
                     <td><input type="text" name="contact" style="border-radius:30px"></td></tr>
                    <tr><td>Create Password</td>
                    <td><input type="password" name="pass" style="border-radius:30px"></td></tr>
                   
                   <tr><td><a href="login page.jsp">already member</a></td><td><button style="border-radius:30px">submit</button></td></tr> 
                    
                </table>
                </form>
            </td></tr>
           
    </table>
     <table align="center">
        <tr>
            <td>
                <table><br><br><br><br><br><br><br>
                    <tr><td><a href="customer care.jsp">customer care </a></td></tr>
                    <tr><td><a href="contactus.jsp">contact no.</a></td></tr>
                    <tr><td><a href="location.jsp">location's</a></td></tr>
                    
                </table>
            </td>
        </tr>
    </table>
        </div>
    </body>
</html>
