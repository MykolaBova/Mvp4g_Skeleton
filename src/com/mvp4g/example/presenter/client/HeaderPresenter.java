package com.mvp4g.example.presenter.client;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.mvp4g.example.client.LayoutExampleEventBus;
import com.mvp4g.example.mvp.api.client.IHeaderView;
import com.mvp4g.example.mvp.api.client.IHeaderView.IHeaderPresenter;
import com.mvp4g.example.view.client.HeaderView;

@Presenter( view = IHeaderView.class )
public class HeaderPresenter extends BasePresenter<IHeaderView, LayoutExampleEventBus> implements IHeaderPresenter {

}
