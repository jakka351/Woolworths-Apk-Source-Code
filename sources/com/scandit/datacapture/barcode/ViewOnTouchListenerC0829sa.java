package com.scandit.datacapture.barcode;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.sa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnTouchListenerC0829sa implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private Function1 f18004a;
    private final C0670ia b;
    private final int c;
    private final Handler d;
    private boolean e;
    private final Runnable f;
    private final D8 g;
    private final D8 h;
    private float i;
    private float j;
    private long k;

    public ViewOnTouchListenerC0829sa(Context context) {
        Intrinsics.h(context, "context");
        this.f18004a = C0814ra.f17993a;
        this.b = new C0670ia(context);
        this.c = ViewConfiguration.getLongPressTimeout();
        this.d = new Handler(Looper.getMainLooper());
        this.f = new kf(this, 5);
        this.g = new D8(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.h = new D8(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ViewOnTouchListenerC0829sa this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.f18004a.invoke(EnumC0654ha.LONG_PRESS_STARTED);
        this$0.e = true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        Intrinsics.h(v, "v");
        Intrinsics.h(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.f18004a.invoke(EnumC0654ha.TOUCH_DOWN);
            this.e = false;
            this.d.removeCallbacksAndMessages(null);
            this.d.postDelayed(this.f, this.c);
            this.k = System.currentTimeMillis();
            this.i = v.getX() - event.getRawX();
            this.j = v.getY() - event.getRawY();
            this.g.a(event.getRawX() + this.i);
            this.g.b(event.getRawY() + this.j);
            return true;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.h.b(event.getRawY() + this.j);
        this.h.a(event.getRawX() + this.i);
        if (this.e) {
            this.f18004a.invoke(EnumC0654ha.LONG_PRESS_FINISHED);
        }
        this.d.removeCallbacksAndMessages(null);
        if (System.currentTimeMillis() - this.k < 200) {
            this.f18004a.invoke(this.b.a(this.g, this.h));
        }
        return true;
    }

    public final void b(Function1 function1) {
        Intrinsics.h(function1, "<set-?>");
        this.f18004a = function1;
    }

    public final void b() {
        this.d.removeCallbacks(this.f);
    }
}
