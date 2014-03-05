package com.mvp4g.example.mvp.api.client;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;
import com.mvp4g.example.mvp.api.client.IFooterView.IFooterPresenter;

//for this example, our footer is so simple, it does nothing ;)
//I created a footer just to illustrate how layout works
public interface IFooterView extends IsWidget, ReverseViewInterface<IFooterPresenter> {

	public interface IFooterPresenter {

	}

}
