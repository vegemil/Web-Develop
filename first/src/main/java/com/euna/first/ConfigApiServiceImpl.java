package com.euna.first;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigApiServiceImpl implements ConfigApiService {
	
	@Autowired
    private ConfigApiDao apiDao;

	@Override
	public List<ConfigApi> list() {
		// TODO Auto-generated method stub
		return apiDao.list();
	}

	@Override
    public void create(ConfigApi api) {
        apiDao.create(api);
        
    }

    @Override
    public ConfigApi retrieve(String id) {
        return apiDao.retrieve(id);
    }

    @Override
    public void update(ConfigApi api) {
        int result = apiDao.update(api);
    }

    @Override
    public void delete(String id) {
        int result = apiDao.delete(id);
    }
}
