const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm06a0y/",
            name: "ssm06a0y",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm06a0y/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社区宠物领养及养护知识分享管理系统"
        } 
    }
}
export default base
