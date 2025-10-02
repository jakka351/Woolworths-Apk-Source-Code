package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BarcodeCountViewLayerManager {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f17718a;
    private final RelativeLayout b;
    private final RelativeLayout c;
    private final FrameLayout d;
    private final FrameLayout e;
    private final FrameLayout f;
    private final FrameLayout g;
    private final List h;

    public BarcodeCountViewLayerManager(Context context) {
        Intrinsics.h(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17718a = frameLayout;
        this.b = new RelativeLayout(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.c = relativeLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.e = frameLayout3;
        this.f = new FrameLayout(context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.g = frameLayout4;
        this.h = CollectionsKt.R(frameLayout, frameLayout2, relativeLayout, frameLayout3, frameLayout4);
    }

    public final FrameLayout a() {
        return this.e;
    }

    public final FrameLayout b() {
        return this.d;
    }

    public final FrameLayout c() {
        return this.f;
    }

    public final FrameLayout d() {
        return this.g;
    }

    public final FrameLayout e() {
        return this.f17718a;
    }

    public final RelativeLayout f() {
        return this.c;
    }

    public final RelativeLayout g() {
        return this.b;
    }

    public final void a(ViewGroup container) {
        Intrinsics.h(container, "container");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        container.addView(this.f17718a, layoutParams);
        container.addView(this.b, layoutParams);
        container.addView(this.d, layoutParams);
        container.addView(this.f, layoutParams);
        container.addView(this.c, layoutParams);
        container.addView(this.e, layoutParams);
        container.addView(this.g, layoutParams);
    }

    public final void a(RelativeLayout.LayoutParams floatLayerLayoutParams) {
        Intrinsics.h(floatLayerLayoutParams, "floatLayerLayoutParams");
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((ViewGroup) it.next()).setLayoutParams(floatLayerLayoutParams);
        }
    }
}
