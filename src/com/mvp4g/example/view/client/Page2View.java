package com.mvp4g.example.view.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.example.mvp.api.client.IPage2View;
import com.mvp4g.example.mvp.api.client.IPage2View.IPage2Presenter;

public class Page2View extends ReverseCompositeView<IPage2Presenter> implements IPage2View {

	private static Page2ViewUiBinder uiBinder = GWT.create( Page2ViewUiBinder.class );

	interface Page2ViewUiBinder extends UiBinder<Widget, Page2View> {
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
		text.setText( "Welcome to page 2. " + name );
	}

}
