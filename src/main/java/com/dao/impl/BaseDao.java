package com.dao.impl;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 所有Service的基类，用来注入sqlSession
 */
public class BaseDao {
    /**
     * 可写的sqlSession
     */protected SqlSession writableSQLSession;

    /**
     * 只读的sqlSession
     */protected SqlSession readonlySQLSession;

    public void setWritableSQLSession(SqlSession writableSQLSession) {
        this.writableSQLSession = writableSQLSession;
    }

    public void setReadonlySQLSession(SqlSession readonlySQLSession) {
        this.readonlySQLSession = readonlySQLSession;
    }
}
