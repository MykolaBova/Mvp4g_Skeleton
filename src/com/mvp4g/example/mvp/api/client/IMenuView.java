package com.mvp4g.example.mvp.api.client;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;
import com.mvp4g.example.mvp.api.client.IMenuView.IMenuPresenter;

public interface IMenuView extends IsWidget, ReverseViewInterface<IMenuPresenter> {

	public interface IMenuPresenter {

		void goToPage1();
		
		void goToPage2();
		
	}

}
