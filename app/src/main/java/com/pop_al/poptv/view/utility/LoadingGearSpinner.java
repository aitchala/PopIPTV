package com.pop_al.poptv.view.utility;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.pop_al.poptv.R;

/**
 * Created by DIVITECH ICT on 18-02-09.
 */

public class LoadingGearSpinner extends ImageView {
    private static final int IMAGE_RESOURCE_ID = 2131230848;
    private static final int ROTATE_ANIMATION_DURATION = 1000;

    public LoadingGearSpinner(Context context) {
        super(context, null);
    }

    public LoadingGearSpinner(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LoadingGearSpinner(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setImageResource(R.drawable.gear_orange);
        startAnimation();
    }

    private void startAnimation() {
        clearAnimation();
        RotateAnimation rotate = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotate.setDuration(1000);
        rotate.setRepeatCount(-1);
        startAnimation(rotate);
    }

    public void setVisibility(int visibility) {
        if (visibility == 0) {
            startAnimation();
        } else {
            clearAnimation();
        }
        super.setVisibility(visibility);
    }
}
