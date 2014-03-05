package com.mvp4g.example.view.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.mvp4g.example.mvp.api.client.IRootView;
import com.mvp4g.example.mvp.api.client.IRootView.IRootPresenter;

public class RootView extends ReverseCompositeView<IRootPresenter> implements
		IRootView {

	private static RootViewUiBinder uiBinder = GWT
			.create(RootViewUiBinder.class);

	@UiField(provided = true)
	Widget header, menu, footer;

	@UiField
	SimplePanel body;

	interface RootViewUiBinder extends UiBinder<Widget, RootView> {
	}

	@Inject
	public RootView(HeaderView header, MenuView menu, FooterView footer) {
		this.header = header;
		this.menu = menu;
		this.footer = footer;
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setBody(IsWidget body) {
		this.body.setWidget(body);
	}

}
