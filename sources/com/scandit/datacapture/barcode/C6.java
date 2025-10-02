package com.scandit.datacapture.barcode;

import android.view.View;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.Augmentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class C6 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ F6 f17118a;
    final /* synthetic */ Augmentation b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6(F6 f6, Augmentation augmentation) {
        super(1);
        this.f17118a = f6;
        this.b = augmentation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        Intrinsics.h(view, "view");
        F6.a(this.f17118a, this.b);
        view.setVisibility(0);
        return Unit.f24250a;
    }
}
