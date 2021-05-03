<html>
    <script>
        function check()
        {
        if(lg.userId.value==0)
        alert("user id is required")
        if(lg.password.value==0)
        alert("password is required")
        }
    </script>
<style>
        .themeorange
        {
            background:#F6A600;
            font-family:arial;
            font-weight: bold;
		width:100%;
        }
        .themeblack
        {
            background:#69696;
            font-family:arial;
            font-weight: bold;
        }
    </style>
    <head>
        <title>login page</title>
    </head>
    <body>
<div style="background-image:url(bg0.png); background-repeat:no-repeat; background-position:center; background-size:120% 100%" ;>
    <marquee><h1>Best Place for Solution</h1></marquee>
        <table class="themeorange" width="100%">
            <tr>
                <td class="theme" colspan="4"><img src="liwahfixit.png" ></td>
          <td align="center" >
                <table >
                    <tr>
                        <td><a href="contactus.jsp">contact us</a></td>
                        <td><a href="aboutus.jsp">about us</a></td>
                        <td><a href="customer care.jsp">help</a></td>
                    </tr>
                </table>
            </td>
        <tr width="60%"><td  height="10%" align ="center">
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
                 </select>
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
                     <option>view experts
                     <option>windows expert
                     <option>android expert
                        <option>ios expert
                        <option>hardware experts
                         <option>network experts
                         <option>dll's expert     
                 </select>
                 </td>  
                   <td align ="center">
                  <select>  <option>doorstep services
                    <option>hardware expert's
                    <option>software expert's     
                  </select>
                </td>    
            </td></tr>
        </table>
        <table  width="100%">
            <tr>
                
                <td>
                    <form action="logincode.jsp" name="lg">
                    <table align="center">
                        <tr><td>user id</td><td><input type="text" name="userId" placeholder="your id" style="border-radius:30px"></td></tr>
                        <tr><td>password</td><td><input type="text" name="password" style="border-radius:30px" placeholder="password"></td></tr>
                        <tr><td></td><td><button name="login" style="border-radius:30px">login</button><a href="">forget password</a></td></tr>
                    </table>
                    </form>
                </td>
                
                   
             
             
            </tr>
            
            
          
        <table width="30%"  align="center">
            <tr>
              <td align="center">
                  <table>
                <tr><td ><a href="">register as employee</a></td></tr>       
                <tr><td ><a href="">about us</a> </td></tr>
                <tr><td><a href=""></a></td></tr>
                <tr><td ><a href="">help center</a></td></tr>
            <tr><td ><a href="">contact us</a></td></tr> 
            <tr><td ><a href="">support</a></td></tr> 
            
           </table> 
        </table>
             <table align="center">
        <tr>
            <td>
                <table><br><br><br><br><br>
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
