package com.euna.first;

import java.util.List;

public interface ConfigApiService {
	public List<ConfigApi> list();
	public void create(ConfigApi api);
	public void update(ConfigApi api);
	public void delete(String id);
	public ConfigApi retrieve(String id);
}
