import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import chongwuleixingList from '../pages/chongwuleixing/list'
import chongwuleixingDetail from '../pages/chongwuleixing/detail'
import chongwuleixingAdd from '../pages/chongwuleixing/add'
import chongwuxiuList from '../pages/chongwuxiu/list'
import chongwuxiuDetail from '../pages/chongwuxiu/detail'
import chongwuxiuAdd from '../pages/chongwuxiu/add'
import shenqinglingyangList from '../pages/shenqinglingyang/list'
import shenqinglingyangDetail from '../pages/shenqinglingyang/detail'
import shenqinglingyangAdd from '../pages/shenqinglingyang/add'
import lingyangdingdanList from '../pages/lingyangdingdan/list'
import lingyangdingdanDetail from '../pages/lingyangdingdan/detail'
import lingyangdingdanAdd from '../pages/lingyangdingdan/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'chongwuleixing',
					component: chongwuleixingList
				},
				{
					path: 'chongwuleixingDetail',
					component: chongwuleixingDetail
				},
				{
					path: 'chongwuleixingAdd',
					component: chongwuleixingAdd
				},
				{
					path: 'chongwuxiu',
					component: chongwuxiuList
				},
				{
					path: 'chongwuxiuDetail',
					component: chongwuxiuDetail
				},
				{
					path: 'chongwuxiuAdd',
					component: chongwuxiuAdd
				},
				{
					path: 'shenqinglingyang',
					component: shenqinglingyangList
				},
				{
					path: 'shenqinglingyangDetail',
					component: shenqinglingyangDetail
				},
				{
					path: 'shenqinglingyangAdd',
					component: shenqinglingyangAdd
				},
				{
					path: 'lingyangdingdan',
					component: lingyangdingdanList
				},
				{
					path: 'lingyangdingdanDetail',
					component: lingyangdingdanDetail
				},
				{
					path: 'lingyangdingdanAdd',
					component: lingyangdingdanAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
