package com.mvp4g.example.view.client;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.mvp4g.example.mvp.api.client.IFooterView;
import com.mvp4g.example.mvp.api.client.IHeaderView;
import com.mvp4g.example.mvp.api.client.IMenuView;
import com.mvp4g.example.mvp.api.client.IPage1View;
import com.mvp4g.example.mvp.api.client.IPage2View;
import com.mvp4g.example.mvp.api.client.IRootView;

public class GinViewsModule extends AbstractGinModule {

    @Override
    protected void configure() {
    	bind(IFooterView.class).to(FooterView.class);
    	bind(IHeaderView.class).to(HeaderView.class);
    	bind(IPage1View.class).to(Page1View.class);
    	bind(IPage2View.class).to(Page2View.class);
    	bind(IRootView.class).to(RootView.class);
//    	
    	bind(IMenuView.class).to(MenuView.class).in(Singleton.class);;    	
    }
}
