package com.mvp4g.example.view.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.example.mvp.api.client.IPage1View;
import com.mvp4g.example.mvp.api.client.IPage1View.IPage1Presenter;

public class Page1View extends ReverseCompositeView<IPage1Presenter> implements IPage1View {

	private static Page1ViewUiBinder uiBinder = GWT.create( Page1ViewUiBinder.class );

	interface Page1ViewUiBinder extends UiBinder<Widget, Page1View> {
	}

	@UiField
	Label text;

	@Override
	public void createView() {
		//don't create the view before to take advantage of the lazy loading mechanism
		initWidget( uiBinder.createAndBindUi( this ) );
	}

	@Override
	public void setName( String name ) {
		text.setText( "Welcome to page 1. " + name );
	}

}
