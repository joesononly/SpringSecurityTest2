CREATE TABLE S_RESP(
                     ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键' ,
                     CREATED DATETIME NOT NULL COMMENT '创建时间',
                     CREATED_BY INT NOT NULL COMMENT  '创建人Id',
                     LAST_UP_DATE DATETIME NOT NULL COMMENT  '修改时间',
                     LAST_UP_BY INT NOT NULL COMMENT  '修改人Id',
                     UPDATE_VERSION INT NOT NULL COMMENT  '修改版本号',
                     NAME VARCHAR(50) NOT NULL COMMENT '菜单标题',
                     COMMENT VARCHAR(300) COMMENT '备注'
)