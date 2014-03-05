package com.mvp4g.example.presenter.client;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.mvp4g.example.client.LayoutExampleEventBus;
import com.mvp4g.example.mvp.api.client.IFooterView;
import com.mvp4g.example.mvp.api.client.IFooterView.IFooterPresenter;

@Presenter( view = IFooterView.class )
public class FooterPresenter extends BasePresenter<IFooterView, LayoutExampleEventBus> implements IFooterPresenter {

}
