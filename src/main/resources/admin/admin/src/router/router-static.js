import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import huiyuangoumaidingdan from '@/views/modules/huiyuangoumaidingdan/list'
    import discussshuiguo from '@/views/modules/discussshuiguo/list'
    import jiajifenjilu from '@/views/modules/jiajifenjilu/list'
    import huiyuanshuiguo from '@/views/modules/huiyuanshuiguo/list'
    import huiyuanka from '@/views/modules/huiyuanka/list'
    import goumaishuiguodingdan from '@/views/modules/goumaishuiguodingdan/list'
    import huiyuan from '@/views/modules/huiyuan/list'
    import jifenduihuanjilu from '@/views/modules/jifenduihuanjilu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import jianjifenjilu from '@/views/modules/jianjifenjilu/list'
    import jifen from '@/views/modules/jifen/list'
    import kaitonghuiyuanjilu from '@/views/modules/kaitonghuiyuanjilu/list'
    import config from '@/views/modules/config/list'
    import shuiguo from '@/views/modules/shuiguo/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '水果新闻',
        component: news
      }
      ,{
	path: '/huiyuangoumaidingdan',
        name: '会员购买订单',
        component: huiyuangoumaidingdan
      }
      ,{
	path: '/discussshuiguo',
        name: '水果评论',
        component: discussshuiguo
      }
      ,{
	path: '/jiajifenjilu',
        name: '加积分记录',
        component: jiajifenjilu
      }
      ,{
	path: '/huiyuanshuiguo',
        name: '会员水果',
        component: huiyuanshuiguo
      }
      ,{
	path: '/huiyuanka',
        name: '会员卡',
        component: huiyuanka
      }
      ,{
	path: '/goumaishuiguodingdan',
        name: '购买水果订单',
        component: goumaishuiguodingdan
      }
      ,{
	path: '/huiyuan',
        name: '会员',
        component: huiyuan
      }
      ,{
	path: '/jifenduihuanjilu',
        name: '积分兑换记录',
        component: jifenduihuanjilu
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/jianjifenjilu',
        name: '减积分记录',
        component: jianjifenjilu
      }
      ,{
	path: '/jifen',
        name: '积分',
        component: jifen
      }
      ,{
	path: '/kaitonghuiyuanjilu',
        name: '开通会员记录',
        component: kaitonghuiyuanjilu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/shuiguo',
        name: '水果',
        component: shuiguo
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
