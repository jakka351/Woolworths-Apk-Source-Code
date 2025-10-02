package io.branch.referral;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes7.dex */
public class AnimatedDialog extends Dialog {
    public static final /* synthetic */ int d = 0;

    /* renamed from: io.branch.referral.AnimatedDialog$1, reason: invalid class name */
    class AnonymousClass1 implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return true;
            }
            int i2 = AnimatedDialog.d;
            throw null;
        }
    }

    /* renamed from: io.branch.referral.AnimatedDialog$2, reason: invalid class name */
    class AnonymousClass2 implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            throw null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().addFlags(2);
        getWindow().addFlags(1024);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 80;
        layoutParams.dimAmount = 0.8f;
        getWindow().setAttributes(layoutParams);
        getWindow().setWindowAnimations(android.R.anim.slide_in_left);
        setCanceledOnTouchOutside(true);
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void show() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, 1.0f, 1, BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration(500L);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
        super.show();
    }
}
