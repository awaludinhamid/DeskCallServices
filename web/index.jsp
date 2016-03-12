<%-- 
    Document   : index
    Created on : Mar 23, 2013, 9:39:10 PM
    Author     : awal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deskcall Web Service</title>
    </head>
    <body>
        <script type="text/javascript">
          var str="'Currently running";
          for(i=1;i<10000;i++) {
                var t1=setTimeout("document.getElementById('txtInit').value="+str+"'",i*300);
                str=str+".";
                if((i % 20) == 0)
                    str="'Currently running";
          }
        </script>
        <input type="text" id="txtInit" style="border: none"/>
    </body>
</html>
