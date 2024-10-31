const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot51rqt/",
            name: "springboot51rqt",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot51rqt/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "水果购物网站"
        } 
    }
}
export default base
