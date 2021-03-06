/**
 *
 */
package com.chriszou.androidlibs;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

import static com.chriszou.androidlibs.L.l;

/**
 * Listener when user presses "Enter" on the keyboard
 * @author Chris
 *
 */
public abstract class OnEnterListener implements OnKeyListener {

	/*
	 * (non-Javadoc)
	 *
	 * @see android.view.View.OnKeyListener#onKey(android.view.View, int,
	 * android.view.KeyEvent)
	 */
	@Override
	public boolean onKey(View v, int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_ENTER && event.getAction()==KeyEvent.ACTION_UP) {
			onEnter();
			return true;
		}
		return false;
	}

	public abstract void onEnter();

}
