package com.mvp4g.example.presenter.client;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.LazyPresenter;
import com.mvp4g.example.client.LayoutExampleEventBus;
import com.mvp4g.example.mvp.api.client.IPage1View;
import com.mvp4g.example.mvp.api.client.IPage1View.IPage1Presenter;
import com.mvp4g.example.view.client.Page1View;

@Presenter(view = IPage1View.class)
public class Page1Presenter extends LazyPresenter<IPage1View, LayoutExampleEventBus> implements IPage1Presenter {

	public void onGoToPage1(String name){
		view.setName( name );
		eventBus.setBody( view );
	}
	
}
