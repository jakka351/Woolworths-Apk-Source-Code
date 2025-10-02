package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.g2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0630g2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0710l2 f17676a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0630g2(C0710l2 c0710l2) {
        super(0);
        this.f17676a = c0710l2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f17676a.a().getContext();
        Intrinsics.g(context, "backingView.context");
        C0535b7 c0535b7 = new C0535b7(context);
        C0710l2 c0710l2 = this.f17676a;
        c0535b7.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c0710l2.a().addView(c0535b7, 0);
        return c0535b7;
    }
}
