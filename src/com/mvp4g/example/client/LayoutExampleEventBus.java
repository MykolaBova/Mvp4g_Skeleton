package com.mvp4g.example.client;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBus;
import com.mvp4g.example.presenter.client.FooterPresenter;
import com.mvp4g.example.presenter.client.HeaderPresenter;
import com.mvp4g.example.presenter.client.MenuPresenter;
import com.mvp4g.example.presenter.client.Page1Presenter;
import com.mvp4g.example.presenter.client.Page2Presenter;
import com.mvp4g.example.presenter.client.RootPresenter;

@Events( startPresenter = RootPresenter.class, ginModuleProperties = "ginViewsModule" )
public interface LayoutExampleEventBus extends EventBus {

	@Start
	@Event( bind = { MenuPresenter.class, FooterPresenter.class, HeaderPresenter.class }, handlers = RootPresenter.class )
	void start();

	/*
	 * Layout events
	 */
	@Event( handlers = RootPresenter.class )
	void setBody( IsWidget body );

	/*
	 * Place events
	 */
	@Event( handlers = Page1Presenter.class )
	void goToPage1( String name );

	@Event( handlers = Page2Presenter.class )
	void goToPage2( String name );

}
