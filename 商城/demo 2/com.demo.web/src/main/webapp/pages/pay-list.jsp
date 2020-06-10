<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title></title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/carts.css">
    <style type="text/css">
        body{
            position: relative;
            background: #EFF2F4;
            font: normal 13px "宋体" !important;
        }
        body,div,ul,li,p,a,img{
            padding: 0;
            margin: 0;
        }
        /*右侧悬浮菜单*/
        .slide{
            width: 50px;
            height: 250px;
            position: fixed;
            top: 50%;
            margin-top: -126px;
            background: #018D75;
            right: 0;
            border-radius: 5px 0 0 5px;
            z-index: 999;
        }
        .slide ul{
            list-style: none;
        }
        .slide .icon li{
            width: 49px;
            height: 50px;
            background: url(../images/icon.png) no-repeat;
        }
        .slide .icon .up{
            background-position:-330px -120px ;
        }
        .slide .icon li.qq{
            background-position:-385px -73px ;
        }
        .slide .icon li.tel{
            background-position:-385px -160px ;
        }
        .slide .icon li.wx{
            background-position:-385px -120px ;
        }
        .slide .icon li.down{
            background-position:-330px -160px ;
        }
        .slide .info{
            top: 50%;
            height: 147px;
            position: absolute;
            right: 100%;
            background: #018D75;
            width: 0px;
            overflow: hidden;
            margin-top: -73.5px;
            transition:0.5s;
            border-radius:4px 0 0 4px ;
        }
        .slide .info.hover{
            width: 145px;

        }
        .slide .info li{
            width: 145px;
            color: #CCCCCC;
            text-align: center;
        }
        .slide .info li p{
            font-size: 1.1em;
            line-height: 2em;
            padding: 15px;
            text-align: left;
        }
        .slide .info li.qq p a{
            display: block;
            margin-top: 12px;
            width: 100px;
            height: 32px;
            line-height: 32px;
            color: #00DFB9;
            font-size: 16px;
            text-align: center;
            text-decoration: none;
            border: 1px solid #00DFB9;
            border-radius: 5px;
        }
        .slide .info li.qq p a:hover{
            color: #FFFFFF;
            border: none;
            background: #00E0DB;
        }
        .slide .info li div.img{
            height: 100%;
            background: #DEFFF9;
            margin: 15px;
        }
        .slide .info li div.img img{
            width: 100%;
            height: 100%;
        }
        /*控制菜单的按钮*/
        .index_cy{
            width: 30px;
            height: 30px;
            background: url(../images/index_cy.png);
            position: fixed;
            right: 0;
            top: 50%;
            margin-top: 140px;
            background-position: 62px 0;
            cursor: pointer;
        }
        .index_cy2{
            width: 30px;
            height: 30px;
            background: url(../images/index_cy.png);
            position: fixed;
            right: 0;
            top: 50%;
            margin-top: 140px;
            background-position: 30px 0;
            cursor: pointer;
        }

        /*自适应 当屏小于1050时隐藏*/
        @media screen and (max-width: 1050px) {
            .slide{
                display: none;
            }
            #btn{
                display: none;
            }

        }
    </style>
</head>
<body>
<div class="slide">
    <ul class="icon">
        <li class="up" title="上一页"></li>
        <li class="qq"></li>
        <li class="tel"></li>
        <li class="wx"></li>
        <li class="down" title="下一页"></li>
    </ul>
    <ul class="info">
        <li class="qq">
            <p>在线沟通，请点我<a target="_blank" href="tencent://message/?uin=974906669&Site=qq&Menu=yes">在线客服</a></p>
        </li>
        <li class="tel">
            <p>咨询热线：<br>400-800-8888<br>客服qq：<br>123456789</p>
        </li>
        <li class="wx">
            <div class="img"><img src="img/1441956938.png" /></div>
        </li>
    </ul>
</div>
<div id="btn" class="index_cy"></div>
<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
</div>
<section class="cartMain">
    <div class="cartMain_hd">
        <ul class="order_lists cartTop">
            <li class="list_con">订单日期</li>
            <li class="list_info">订单编号</li>
            <li class="list_op">商品信息</li>
            <li class="list_price">单价</li>
            <li class="list_amount">数量</li>
            <li class="list_sum">金额</li>
        </ul>
    </div>

    <div class="cartBox">
        <div class="shop_info">
            <div class="all_check">
                <!--店铺全选-->
                <input type="checkbox" id="shop_a" class="shopChoice">
                <label for="shop_a" class="shop"></label>
            </div>
            <div class="shop_name">
                店铺：<a href="javascript:;">天猫旗舰店</a>
            </div>
        </div>
        <div class="order_content">
            <ul class="order_lists">
            <c:forEach items="${payslist}" var="p">

                <li class="list_chk">
                    <input type="checkbox" id="checkbox_2" class="son_check">
                    <label for="checkbox_2"></label>
                </li>
                <li class="list_con">
                <div class="list_img">
                    <a href="javascript:;">${p.dateString }</a>
                </div>
                    <div class="list_text"><a href="javascript:;">${p.sid}</a>
                    </div>
                </li>
                <c:forEach items="${p.glist}" var="goodlist">
                <li class="list_info">
                    <p>${goodlist.goodsname}</p
                </li>
                <li class="list_price">
                    <p class="price">￥${goodlist.price }</p>
                </li>

                <li class="list_amount">
                    <div class="amount_box">
                        <a href="javascript:;" class="reduce reSty">-</a>
                        <input type="text" value="1" class="sum" name="sum">
                        <a href="javascript:;" class="plus">+</a>
                    </div>
                </li>
                <li class="list_sum">
                    <p class="sum_price">￥${goodlist.price }</p>
                </li>
            </ul>
            </c:forEach>
            </c:forEach>
        </div>

            <div style=" border: 1px solid #d9d9d9;">
                <div style="margin-top: 20px">
                <h2>请您选择在线支付银行</h2>
                </div>
                <div style="text-align: center;margin-top: 20px; margin-bottom: 10px;">
            <tr>
                <td><INPUT TYPE="radio" NAME="payment" value="CMBCHINA-NET"><img src="${pageContext.request.contextPath}/images/291447498880_02.jpg"></td>
                <td><INPUT TYPE="radio" NAME="payment" value="ICBC-NET"><img src="${pageContext.request.contextPath}/images/291447498880_04.jpg"></td>
                <td><INPUT TYPE="radio" NAME="payment" value="ABC-NET"><img src="${pageContext.request.contextPath}/images/291447498880_06.jpg"></td>
                <td><INPUT TYPE="radio" NAME="payment" value="CCB-NET"><img src="${pageContext.request.contextPath}/images/291447498880_07.jpg"></td>
            </tr>
                </div>
                <div style="text-align: center; margin-top: 20px ;margin-bottom: 10px;">
            <tr>
                <td><INPUT TYPE="radio" NAME="payment" value="CMBC-NET"><img src="${pageContext.request.contextPath}/images/291447498880_08.jpg"></td>
                <td><INPUT TYPE="radio" NAME="payment" value="CEB-NET" ><img src="${pageContext.request.contextPath}/images/291447498880_09.jpg"></td>
                <td><INPUT TYPE="radio" NAME="payment" value="BOCO-NET"><img src="${pageContext.request.contextPath}/images/291447498880_10.jpg"></td>
                <td><INPUT TYPE="radio" NAME="payment" value="SDB-NET"><img src="${pageContext.request.contextPath}/images/291447498880_11.jpg"></td>
            </tr>
                </div>
            </div>
            <div style=" border: 1px solid #d9d9d9;">
                <div style="margin-top: 20px">
                    <h2>请您选择其他支付方式</h2>
                </div>
                <div style="text-align: center;margin-top: 20px; margin-bottom: 10px;">
                    <tr>
                        <td><INPUT TYPE="radio" NAME="payment" value="CMBCHINA-NET"><img src="${pageContext.request.contextPath}/images/u=1035084434,1904731591&fm=26&gp=0.jpg" width="200" height="100"></td>
                        <td><INPUT TYPE="radio" NAME="payment" value="ICBC-NET"><img src="${pageContext.request.contextPath}/images/u=2729040577,2200773336&fm=26&gp=0.jpg" width="200" height="80"></td>
                        </tr>
                </div>
            </div>
    <!--底部-->
    <div class="bar-wrapper">
        <div class="bar-right">
            <div class="piece">已选商品<strong class="piece_num">0</strong>件</div>
            <div class="totalMoney">共计: <strong class="total_text">0.00</strong></div>
            <div class="calBtn"><a href="${pageContext.request.contextPath}/pages/seccess.jsp" >结算</a></div>
        </div>
    </div>
    </div>
</section>
</form>
<section class="model_bg"></section>

<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/carts.js"></script>
<script type="text/javascript">
    $(function(){

        $('.slide .icon li').not('.up,.down').mouseenter(function(){
            $('.slide .info').addClass('hover');
            $('.slide .info li').hide();
            $('.slide .info li.'+$(this).attr('class')).show();//.slide .info li.qq
        });
        $('.slide').mouseleave(function(){
            $('.slide .info').removeClass('hover');
        });

        $('#btn').click(function(){
            $('.slide').toggle();
            if($(this).hasClass('index_cy')){
                $(this).removeClass('index_cy');
                $(this).addClass('index_cy2');
            }else{
                $(this).removeClass('index_cy2');
                $(this).addClass('index_cy');
            }

        });

    });
</script>

<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
</div>
</body>
</html>

