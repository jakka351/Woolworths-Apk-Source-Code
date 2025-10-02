package com.skydoves.balloon;

import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements PopupWindow.OnDismissListener {
    public final /* synthetic */ Balloon d;
    public final /* synthetic */ OnBalloonDismissListener e;

    public /* synthetic */ b(Balloon balloon, OnBalloonDismissListener onBalloonDismissListener) {
        this.d = balloon;
        this.e = onBalloonDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        Balloon balloon = this.d;
        FrameLayout frameLayout = balloon.f.e;
        Animation animation = frameLayout.getAnimation();
        if (animation != null) {
            animation.cancel();
            animation.reset();
        }
        frameLayout.clearAnimation();
        balloon.c();
        OnBalloonDismissListener onBalloonDismissListener = this.e;
        if (onBalloonDismissListener != null) {
            onBalloonDismissListener.a();
        }
    }
}
