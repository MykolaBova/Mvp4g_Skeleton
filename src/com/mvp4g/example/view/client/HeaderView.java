package com.mvp4g.example.view.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;
import com.mvp4g.example.mvp.api.client.IHeaderView;
import com.mvp4g.example.mvp.api.client.IHeaderView.IHeaderPresenter;

@Singleton
public class HeaderView extends ReverseCompositeView<IHeaderPresenter> implements IHeaderView {

	private static HeaderViewUiBinder uiBinder = GWT.create( HeaderViewUiBinder.class );

	interface HeaderViewUiBinder extends UiBinder<Widget, HeaderView> {
	}

	public HeaderView() {
		initWidget( uiBinder.createAndBindUi( this ) );
	}	

}
