package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.dynatrace.android.callback.Callback;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.n8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0748n8 implements InterfaceC0732m8 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17860a;

    public C0748n8(Context context) {
        Intrinsics.h(context, "context");
        this.f17860a = context;
    }

    private static final void a(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$a$--Landroid-widget-FrameLayout-, reason: not valid java name */
    public static /* synthetic */ void m300instrumented$0$a$LandroidwidgetFrameLayout(View view) {
        Callback.g(view);
        try {
            a(view);
        } finally {
            Callback.h();
        }
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0732m8
    public final FrameLayout a() {
        FrameLayout frameLayout = new FrameLayout(this.f17860a);
        frameLayout.setOnClickListener(new rf(0));
        return frameLayout;
    }
}
