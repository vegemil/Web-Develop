package com.euna.first;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfigApiDao {
    @Autowired
    private SqlSessionTemplate sqlSession;

    public void create(ConfigApi api) {
        sqlSession.insert("insert", api);
    }

    public ConfigApi retrieve(String id) {
        return sqlSession.selectOne("read", id);
    }

    public int update(ConfigApi api) {
        return sqlSession.insert("update", api);
    }

    public int delete(String id) {
        return sqlSession.delete(id);
    }

    public List<ConfigApi> list() {
        return sqlSession.selectList("selectList");
    }
}