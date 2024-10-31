
var projectName = '水果购物网站';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '会员卡',
	url: './pages/huiyuanka/list.html'
}, 
{
	name: '水果',
	url: './pages/shuiguo/list.html'
}, 

{
	name: '水果新闻',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot51rqt/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","开通会员"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","通过会员"],"menu":"会员","menuJump":"列表","tableName":"huiyuan"}],"menu":"会员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"会员卡","menuJump":"列表","tableName":"huiyuanka"}],"menu":"会员卡管理"},{"child":[{"buttons":["查看","修改","删除","审核","通过会员"],"menu":"开通会员记录","menuJump":"列表","tableName":"kaitonghuiyuanjilu"}],"menu":"开通会员记录管理"},{"child":[{"buttons":["新增","查看","修改","删除","加积分","减积分"],"menu":"积分","menuJump":"列表","tableName":"jifen"}],"menu":"积分管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"水果","menuJump":"列表","tableName":"shuiguo"}],"menu":"水果管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"购买水果订单","menuJump":"列表","tableName":"goumaishuiguodingdan"}],"menu":"购买水果订单管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"积分兑换记录","menuJump":"列表","tableName":"jifenduihuanjilu"}],"menu":"积分兑换记录管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"加积分记录","menuJump":"列表","tableName":"jiajifenjilu"}],"menu":"加积分记录管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"减积分记录","menuJump":"列表","tableName":"jianjifenjilu"}],"menu":"减积分记录管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"会员水果","menuJump":"列表","tableName":"huiyuanshuiguo"}],"menu":"会员水果管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"会员购买订单","menuJump":"列表","tableName":"huiyuangoumaidingdan"}],"menu":"会员购买订单管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"水果新闻","tableName":"news"},{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"会员卡列表","menuJump":"列表","tableName":"huiyuanka"}],"menu":"会员卡模块"},{"child":[{"buttons":["查看","购买","积分兑换"],"menu":"水果列表","menuJump":"列表","tableName":"shuiguo"}],"menu":"水果模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","支付"],"menu":"开通会员记录","menuJump":"列表","tableName":"kaitonghuiyuanjilu"}],"menu":"开通会员记录管理"},{"child":[{"buttons":["查看"],"menu":"积分","menuJump":"列表","tableName":"jifen"}],"menu":"积分管理"},{"child":[{"buttons":["查看","支付"],"menu":"购买水果订单","menuJump":"列表","tableName":"goumaishuiguodingdan"}],"menu":"购买水果订单管理"},{"child":[{"buttons":["查看"],"menu":"积分兑换记录","menuJump":"列表","tableName":"jifenduihuanjilu"}],"menu":"积分兑换记录管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"会员卡列表","menuJump":"列表","tableName":"huiyuanka"}],"menu":"会员卡模块"},{"child":[{"buttons":["查看","购买","积分兑换"],"menu":"水果列表","menuJump":"列表","tableName":"shuiguo"}],"menu":"水果模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","会员购买"],"menu":"会员水果","menuJump":"列表","tableName":"huiyuanshuiguo"}],"menu":"会员水果管理"},{"child":[{"buttons":["查看","支付"],"menu":"会员购买订单","menuJump":"列表","tableName":"huiyuangoumaidingdan"}],"menu":"会员购买订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"会员卡列表","menuJump":"列表","tableName":"huiyuanka"}],"menu":"会员卡模块"},{"child":[{"buttons":["查看","购买","积分兑换"],"menu":"水果列表","menuJump":"列表","tableName":"shuiguo"}],"menu":"水果模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"会员","tableName":"huiyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
