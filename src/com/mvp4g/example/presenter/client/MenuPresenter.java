package com.mvp4g.example.presenter.client;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.mvp4g.example.client.LayoutExampleEventBus;
import com.mvp4g.example.mvp.api.client.IMenuView;
import com.mvp4g.example.mvp.api.client.IMenuView.IMenuPresenter;

@Presenter( view = IMenuView.class )
public class MenuPresenter extends BasePresenter<IMenuView, LayoutExampleEventBus> implements IMenuPresenter {

	@Override
	public void goToPage1() {
		eventBus.goToPage1( "You clicked the menu." );
	}

	@Override
	public void goToPage2() {
		eventBus.goToPage2( "You clicked the menu." );
	}

}
