<html>
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
        <title>Welcome Admin</title>
    </head>
    <body>
<div style="background-image:url(bg0.png); background-repeat:no-repeat; background-position:center; background-size:120% 100%" ;>
<marquee><h1>Get all Control!!!</h1></marquee>
        
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
                        <td><a href="login page.jsp">logout</a></td>
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
    
    <table width="75%" align="center" >
        
        <tr>
            <td>
                <h3>online experts</h3>
                <table>
                    <tr>
                        <td>hardware experts</td>
                        <td>no. of experts</td>
                    </tr>
                    <tr><td>software experts</td><td>no. of experts=100</td></tr>
                    <tr><td>network experts</td><td>no. of experts=80</td></tr>
                    <tr><td>rooting experts</td><td>no. of experts=60</td></tr>
                </table>
                   
            </td>
            <td>
                <table>
                <h3>doorstep experts</h3>
                <tr><td>hardware experts </td><td>no. of experts=60</td></tr>
                <tr><td>network experts</td><td>no. of experts=10</td></tr>
                </table>    
            </td>
            <td>
                <table>
                 <h3>all users</h3>
                 <tr><td>online</td><td>no. of user=1000</td></tr>
                 <tr><td>doorstep</td><td>no. of users=410</td></tr>
                
                 
                </table>
                </td>
        </tr>
    </table>
    <table width="100%" align="center" >
        
        <tr><h3 align='center'>updte information's</h3>
            <td>
                <form action="admincontrol_addexp.jsp">
                <table><th>online expert</th>
                    <tr><td>expert id</td></tr>
                    <tr><td><input type='text' name="expId" style="border-radius:30px"></td></tr>
                    <tr><td>expert name</td></tr>
                    <tr><td><input type='text'name="expName" style="border-radius:30px"></td></tr>
                    <tr><td>email address</td></tr>
                    <tr><td><input type='text'name="eMail" style="border-radius:30px"></td></tr>
                    <tr><td><input type=submit value="update" style="border-radius:30px"></td></tr>
                </table></form>
            </td>
            <td>
                <form action="admincontrol_addexp.jsp">
                <table><th>doorstep expert</th>
                    <tr><td>expert id</td></tr>
                    <tr><td><input type='text'name="expId" style="border-radius:30px"></td></tr>
                    <tr><td>expert name</td></tr>
                    <tr><td><input type='text' name="expName" style="border-radius:30px"></td></tr>
                    <tr><td>emal address</td></tr>
                    <tr><td><input type='text'name="eMail" style="border-radius:30px"></td></tr>
                    <tr><td><input type=submit value="update" style="border-radius:30px"></td></tr>
                </table>
                    </form>
            </td>
            <td>
            <form action="admincontrol_adduser.jsp">
                <table >
                    <th>user</th>
                    <tr><td>user id</td></tr>
                    <tr><td><input type='text' name="uId" style="border-radius:30px"></td></tr>
                    <tr><td>user name</td></tr>
                    <tr><td><input type='text' name="uName" style="border-radius:30px"></td></tr>
                    <tr><td>email address</td></tr>
                    <tr><td><input type='text' name="eMail"style="border-radius:30px"></td></tr>
                    <tr><td><input type=submit value="update" style="border-radius:30px"></td></tr>
                </table>
                    </form>
            </td>    
        </tr>
    </table>
     <table align="center">
        <tr>
            <td>
                <table>
                    <tr><td><a href="expert signup.jsp">become a affiliate</a></td></tr>
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
