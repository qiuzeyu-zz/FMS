﻿<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title> Personal Infomation </title>

    
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.no-icons.min.css" />
    <link rel="stylesheet" type="text/css" href="../css/style.css" />
    <style type="text/css">

        #container{ width:930px; margin:auto}
      
      .out{border-width:1px;border-style:solid;border-color:#dddddd #777777 #777777 #dddddd}
      .in{border-width:1px;border-style:solid;border-color:#777777 #dddddd #dddddd #777777;background:000;text-align: right }
      .h{color: blue; text-align: center}
      .p{text-align:center }
      .table{margin:auto}
      .show{text-align: left;}
    </style>
      
  </head>



<body>


  <div id ="container">


        


        

         <div class="tab-content">

               <div class="tab-pane fade active in" id="about">


             
                 

               
                             <h2 class="h">北京师范大学珠海分校贫困生认定申请表</h2>
                <p class="p">
                    提示：以下基本个人信息由学院老师新增修改，如发现有任何不符之处，请及时通知老师修改。
                </p>

                <p class="p">
                    以下带*号的个人信息为必填信息，如有缺漏，请及时到修改个人信息页面完善自己的信息。
                </p>
                  

                <table cellspacing ="1px" class="out" align="center">
                     <tr class="in" height="50">
                        <th ></th>
                          <th align="right">学生个人基本情况表</th>
                          <th></th><th ></th>
                    </tr>
                     <tr>
                        <td class="in" height="30" >姓名：</td><td class="in"> <label class="show">某某</label></td>
                        <td class="in">学号：</td><td class="in"><label>1201010000</label></td>
                     </tr>
                     <tr>
                        <td class ="in" height="30" >学院：</td><td class="in"><label class="show">信息技术学院</label></td>
                        <td class="in">专业：</td><td class="in"><label class="show">软件工程</label></td>
                     </tr>
                     <tr>
                        <td class="in" height="30">班级贫困排名：</td><td class="in"><label class="show">1</label class="show"></td>
                        <td class="in">年级贫困排名：</td><td class="in"><lable class="show">2</label></td>
                     </tr>
                 </table>   

           
                 
         </div>
</div>


 </body>

 </html>