/*$(function(){
    var $table = $('#menu-list');
    $table.bootstrapTable("refreshOptions",{
        onClickRow:function(row,$element){
            console.log(row);
        }
    });
    window.operateEvents = {
        'click #addView': function (e, value, row, index) {
            alert('You click like action, row: ' + JSON.stringify(row))
        },
        'click .remove': function (e, value, row, index) {
            $table.bootstrapTable('remove', {
                field: 'id',
                values: [row.id]
            })
        }
    }
});*/

$(function(){
    InitMainTable();
});
var $table;
//初始化bootstrap-table的内容
function InitMainTable() {
    //记录页面bootstrap-table全局变量$table，方便应用
    var queryUrl = "/menu/query";
    var rows = 10;
    $table = $('#menu-list').bootstrapTable({
        url: queryUrl,                      //请求后台的URL（*）
        method: 'GET',                      //请求方式（*）
        local:"zh-CN",
        toolbar: '#toolbar',              //工具按钮用哪个容器
        striped: true,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,                   //是否显示分页（*）
        sortable: true,                     //是否启用排序
        sortOrder: "asc",                   //排序方式
        sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1,                      //初始化加载第一页，默认第一页,并记录
        pageSize: rows,                     //每页的记录行数（*）
        pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
        search: false,                      //是否显示表格搜索
        strictSearch: true,
        showColumns: true,                  //是否显示所有的列（选择显示的列）
        showRefresh: true,                  //是否显示刷新按钮
        minimumCountColumns: 2,             //最少允许的列数
        clickToSelect: true,                //是否启用点击选中行
        //height: 500,                      //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
        showToggle: true,                   //是否显示详细视图和列表视图的切换按钮
        cardView: false,                    //是否显示详细视图
        detailView: false,                  //是否显示父子表
        //得到查询的参数
        queryParams : function (params) {
            //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            var temp = {
                rows: params.limit,                         //页面大小
                page: (params.offset / params.limit) + 1,   //页码
                sort: params.sort,      //排序列名
                sortOrder: params.order //排位命令（desc，asc）
            };
            return temp;
        },
        columns: [
            {
                field: 'name',
                title: '菜单标题',
                sortable: true
            },
            {
                field:"view.name",
                title: '视图',
                sortable: true
            },
            {
                field:"parent.name",
                title: '父菜单',
                sortable: true
            },
            {
                field:"sequence",
                title: '序号',
                sortable: true
            },
            {
                field:"comment",
                title: '备注',
                sortable: false
            }

        ],
        onLoadSuccess: function () {
        },
        onLoadError: function () {
            //showTips("数据加载失败！");
        },
        onDblClickRow: function (row, $element) {
            var id = row.ID;
            //EditViewById(id, 'view');
        },
        onClickRow:function (row,$element) {
            console.log(row);
        }
    });
};

var app = new Vue({
    el:"#"
});
