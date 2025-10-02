package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.dynatrace.android.callback.Callback;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ua {

    /* renamed from: a, reason: collision with root package name */
    private Ra f17318a;
    private final WeakReference b;
    private final View c;
    private final Sa d;

    public Ua(SparkScanViewMiniPreview container) {
        Intrinsics.h(container, "container");
        this.b = new WeakReference(container);
        View view = new View(container.getContext());
        view.setBackgroundColor(0);
        Context context = container.getContext();
        Intrinsics.g(context, "container.context");
        ViewOnTouchListenerC0829sa viewOnTouchListenerC0829sa = new ViewOnTouchListenerC0829sa(context);
        viewOnTouchListenerC0829sa.b(new Ta(this));
        view.setOnTouchListener(viewOnTouchListenerC0829sa);
        this.c = view;
        Context context2 = container.getContext();
        Intrinsics.g(context2, "container.context");
        Sa sa = new Sa(context2);
        sa.setOnClickListener(new df(this, 9));
        this.d = sa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$new$-Lcom-scandit-datacapture-barcode-internal-module-spark-ui-minipreview-SparkScanViewMiniPreview--V, reason: not valid java name */
    public static /* synthetic */ void m288xabc853ea(Ua ua, View view) {
        Callback.g(view);
        try {
            a(ua, view);
        } finally {
            Callback.h();
        }
    }

    public final Ra a() {
        return this.f17318a;
    }

    public final void a(Ra ra) {
        this.f17318a = ra;
    }

    private static final void a(Ua this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        Ra ra = this$0.f17318a;
        if (ra != null) {
            ((SparkScanViewPresenter) ra).y();
        }
    }

    public final void a(boolean z, boolean z2) {
        Sa sa = this.d;
        sa.b(z);
        sa.a(z2);
    }

    public final void a(boolean z) {
        RelativeLayout relativeLayout;
        if (!z) {
            if (z || (relativeLayout = (RelativeLayout) this.b.get()) == null) {
                return;
            }
            relativeLayout.removeView(this.c);
            relativeLayout.removeView(this.d);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) this.b.get();
        if (relativeLayout2 != null) {
            if (relativeLayout2.indexOfChild(this.c) > 0 && relativeLayout2.indexOfChild(this.d) > 0) {
                this.c.bringToFront();
                this.d.bringToFront();
                return;
            }
            relativeLayout2.addView(this.c, new RelativeLayout.LayoutParams(-1, -1));
            Sa sa = this.d;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Gc.i(), Gc.i());
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            relativeLayout2.addView(sa, layoutParams);
        }
    }
}
