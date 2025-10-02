package com.scandit.datacapture.barcode;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class I9 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ J9 f17195a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I9(J9 j9) {
        super(0);
        this.f17195a = j9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$a$--Lcom-scandit-datacapture-barcode-E9-, reason: not valid java name */
    public static /* synthetic */ void m273instrumented$0$a$LcomscanditdatacapturebarcodeE9(J9 j9, View view) {
        Callback.g(view);
        try {
            a(j9, view);
        } finally {
            Callback.h();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E9 invoke() {
        E9 e9A = ((C0948z9) this.f17195a.f17207a).a();
        e9A.setOnClickListener(new df(this.f17195a, 0));
        return e9A;
    }

    private static final void a(J9 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        Function0 function0D = this$0.d();
        if (function0D != null) {
            function0D.invoke();
        }
    }
}
