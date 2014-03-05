package com.mvp4g.example.presenter.client;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.mvp4g.example.client.LayoutExampleEventBus;
import com.mvp4g.example.mvp.api.client.IRootView;
import com.mvp4g.example.mvp.api.client.IRootView.IRootPresenter;
import com.mvp4g.example.view.client.RootView;

@Presenter( view = IRootView.class )
public class RootPresenter extends BasePresenter<IRootView, LayoutExampleEventBus> implements IRootPresenter {

	public void onSetBody( IsWidget body ) {
		view.setBody( body );
	}

	public void onStart() {
		eventBus.goToPage1( "The application started." );
	}

}
