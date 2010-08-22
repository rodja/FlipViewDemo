package net.rodja.demos.flipviews;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;

public class DemoActivity extends Activity {

	private ViewSwitcher	viewSwitcher;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ViewGroup container = (ViewGroup) findViewById(R.id.container);
		viewSwitcher = new ViewSwitcher(container);

		container.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					viewSwitcher.swap();
					return true;
				}
				return false;
			}
		});
	}
}
