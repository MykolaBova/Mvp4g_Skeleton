package com.mvp4g.example.mvp.api.client;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.LazyView;

public interface IPage1View extends IsWidget, LazyView {

	public interface IPage1Presenter {

	}
	
	void setName(String name);

}
