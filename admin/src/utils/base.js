const base = {
    get() {
        return {
            url : "http://localhost:8080/fuzhuangshangcheng/",
            name: "fuzhuangshangcheng",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/fuzhuangshangcheng/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "服装销售管理系统"
        } 
    }
}
export default base
