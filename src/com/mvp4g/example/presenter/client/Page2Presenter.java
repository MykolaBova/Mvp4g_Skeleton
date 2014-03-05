package com.mvp4g.example.presenter.client;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.LazyPresenter;
import com.mvp4g.example.client.LayoutExampleEventBus;
import com.mvp4g.example.mvp.api.client.IPage2View;
import com.mvp4g.example.mvp.api.client.IPage2View.IPage2Presenter;
import com.mvp4g.example.view.client.Page2View;

@Presenter(view = IPage2View.class)
public class Page2Presenter extends LazyPresenter<IPage2View, LayoutExampleEventBus> implements IPage2Presenter {

	public void onGoToPage2(String name){
		view.setName( name );
		eventBus.setBody( view );
	}
	
}
