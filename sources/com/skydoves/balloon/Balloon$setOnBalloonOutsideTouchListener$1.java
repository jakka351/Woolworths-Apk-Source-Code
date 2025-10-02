package com.skydoves.balloon;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/skydoves/balloon/Balloon$setOnBalloonOutsideTouchListener$1", "Landroid/view/View$OnTouchListener;", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Balloon$setOnBalloonOutsideTouchListener$1 implements View.OnTouchListener {
    public final /* synthetic */ Balloon d;
    public final /* synthetic */ OnBalloonOutsideTouchListener e;

    public Balloon$setOnBalloonOutsideTouchListener$1(Balloon balloon, OnBalloonOutsideTouchListener onBalloonOutsideTouchListener) {
        this.d = balloon;
        this.e = onBalloonOutsideTouchListener;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        Intrinsics.h(view, "view");
        Intrinsics.h(event, "event");
        if (event.getAction() != 4) {
            return false;
        }
        Balloon balloon = this.d;
        if (balloon.e.M) {
            balloon.c();
        }
        OnBalloonOutsideTouchListener onBalloonOutsideTouchListener = this.e;
        if (onBalloonOutsideTouchListener == null) {
            return true;
        }
        onBalloonOutsideTouchListener.a(view, event);
        return true;
    }
}
