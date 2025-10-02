package com.scandit.datacapture.barcode;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.v9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC0888v9 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0903w9 f18238a;

    public ViewOnAttachStateChangeListenerC0888v9(C0903w9 c0903w9) {
        this.f18238a = c0903w9;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.h(view, "view");
        if (this.f18238a.b == EnumC0873u9.FLOATING) {
            view.setOnTouchListener(this.f18238a.c);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.h(view, "view");
        if (this.f18238a.b == EnumC0873u9.FLOATING) {
            view.setOnTouchListener(null);
        }
    }
}
