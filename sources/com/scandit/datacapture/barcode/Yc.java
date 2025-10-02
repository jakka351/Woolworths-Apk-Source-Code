package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.BounceInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes6.dex */
public final class Yc implements SparkScanViewScanButtonTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanStateManager f17359a;
    private final C0670ia b;
    private float c;
    private float d;
    private float e;
    private final D8 f;
    private final D8 g;
    private long h;
    private Function1 i;
    private View j;
    private View k;

    public Yc(Context context, SparkScanStateManager stateManager) {
        Intrinsics.h(context, "context");
        Intrinsics.h(stateManager, "stateManager");
        this.f17359a = stateManager;
        this.b = new C0670ia(context);
        this.e = -1.0f;
        this.f = new D8(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.g = new D8(stateManager.t(), stateManager.l());
        this.i = Xc.f17347a;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final float a() {
        float fMax = Math.max(b(), this.f17359a.l());
        a(fMax);
        return fMax;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final float b(int i) {
        float fB = RangesKt.b(this.f17359a.l(), BitmapDescriptorFactory.HUE_RED, i - Gc.m());
        a(fB);
        return fB;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        Intrinsics.h(v, "v");
        Intrinsics.h(event, "event");
        View view = this.j;
        if (view != null) {
            v = view;
        }
        Object parent = v.getParent();
        Intrinsics.f(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        float fB = b();
        int action = event.getAction();
        if (action == 0) {
            this.h = System.currentTimeMillis();
            this.c = v.getX() - event.getRawX();
            this.d = v.getY() - event.getRawY();
            this.f.a(event.getRawX() + this.c);
            this.f.b(event.getRawY() + this.d);
        } else if (action == 1) {
            if (System.currentTimeMillis() - this.h < 200) {
                this.i.invoke(this.b.a(this.f, this.g));
            }
            this.f17359a.b(event.getRawX() + this.c);
            SparkScanStateManager sparkScanStateManager = this.f17359a;
            float fB2 = this.g.b();
            if (fB2 < fB) {
                fB2 = fB;
            }
            sparkScanStateManager.c(sparkScanStateManager.a(fB2));
            this.e = -1.0f;
            if (this.g.b() < fB) {
                v.animate().x(this.f.a()).y(this.f17359a.l()).setDuration(600L).setInterpolator(new BounceInterpolator()).start();
            }
        } else if (action == 2) {
            float fB3 = b();
            this.g.a(event.getRawX() + this.c < BitmapDescriptorFactory.HUE_RED ? 0.0f : (event.getRawX() + this.c) + ((float) v.getWidth()) >= ((float) view2.getWidth()) ? view2.getWidth() - v.getWidth() : event.getRawX() + this.c);
            float rawY = event.getRawY() + this.d;
            float height = view2.getHeight() - v.getHeight();
            D8 d8 = this.g;
            if (rawY >= fB3) {
                fB3 = rawY >= height ? height : rawY;
            } else if (fB3 > BitmapDescriptorFactory.HUE_RED) {
                if (this.e < BitmapDescriptorFactory.HUE_RED) {
                    this.e = event.getRawY();
                }
                fB3 -= (fB3 - (fB3 - (fB3 / 3))) * (1 - (event.getRawY() / this.e));
            }
            d8.b(fB3);
            v.animate().x(this.f.a()).y(this.g.b()).setDuration(0L).start();
        }
        return true;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a(float f) {
        SparkScanStateManager sparkScanStateManager = this.f17359a;
        sparkScanStateManager.c(sparkScanStateManager.a(f));
        this.g.b(f);
    }

    private final float b() {
        View view = this.k;
        return (this.f17359a.v() && view != null && view.getVisibility() == 0) ? view.getY() + view.getHeight() + Gc.l() : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final float a(int i) {
        Gc.b();
        float fL = this.f17359a.l();
        a(fL);
        return fL;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a(Function1 function1) {
        Intrinsics.h(function1, "<set-?>");
        this.i = function1;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a(View view) {
        this.j = view;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a(SparkScanViewMiniPreview sparkScanViewMiniPreview) {
        this.k = sparkScanViewMiniPreview;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener
    public final void a(boolean z) {
        this.f17359a.a(z);
    }
}
