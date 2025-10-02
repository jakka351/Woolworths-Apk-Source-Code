package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.dynatrace.android.callback.Callback;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class W6 extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ X6 f17334a;

    public W6(X6 x6) {
        this.f17334a = x6;
    }

    private static final void a(X6 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        this$0.e.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$getView$-ILandroid-view-View-Landroid-view-ViewGroup--Landroid-view-View-, reason: not valid java name */
    public static /* synthetic */ void m290x8a0d6ca1(X6 x6, View view) {
        Callback.g(view);
        try {
            a(x6, view);
        } finally {
            Callback.h();
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f17334a.a().size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f17334a.a().get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup container) {
        Intrinsics.h(container, "container");
        Object item = getItem(i);
        Intrinsics.f(item, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.find.ui.cards.CardData");
        C0914x5 c0914x5 = (C0914x5) item;
        C5 c5 = view instanceof C5 ? (C5) view : null;
        if (c5 == null) {
            Context context = container.getContext();
            Intrinsics.g(context, "container.context");
            c5 = new C5(context);
            X6 x6 = this.f17334a;
            c5.setElevation(((Number) C5.h.getD()).floatValue());
            c5.setOnClickListener(new lf(x6, 0));
        }
        c5.a(c0914x5);
        return c5;
    }
}
