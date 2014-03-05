package com.mvp4g.example.mvp.api.client;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;
import com.mvp4g.example.mvp.api.client.IHeaderView.IHeaderPresenter;

//for this example, our header is so simple, it does nothing ;)
//I created an header just to illustrate how layout works
public interface IHeaderView extends IsWidget, ReverseViewInterface<IHeaderPresenter> {

	public interface IHeaderPresenter {

	}

}
