package com.leo.configurations;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * @className: MyMetaObjectHandler.java
 * @program: eladmin-cloud
 * @author: Jjcc
 * @create: 2021-07-20 12:59
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler{

    @Override
    public void insertFill(MetaObject metaObject) {
        strictInsertFill(metaObject, "gmtCreate", Timestamp.class, new Timestamp(System.currentTimeMillis()));
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        strictUpdateFill(metaObject, "gmtModified", Timestamp.class, new Timestamp(System.currentTimeMillis()));
    }
}
