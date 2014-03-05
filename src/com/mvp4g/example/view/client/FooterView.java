package com.mvp4g.example.view.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;
import com.mvp4g.example.mvp.api.client.IFooterView;
import com.mvp4g.example.mvp.api.client.IFooterView.IFooterPresenter;

@Singleton
public class FooterView extends ReverseCompositeView<IFooterPresenter> implements IFooterView {

	private static FooterViewUiBinder uiBinder = GWT.create( FooterViewUiBinder.class );

	interface FooterViewUiBinder extends UiBinder<Widget, FooterView> {
	}

	public FooterView() {
		initWidget( uiBinder.createAndBindUi( this ) );
	}	

}
