package com.scandit.datacapture.barcode;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class T6 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ H6 f17305a;
    final /* synthetic */ V6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T6(H6 h6, V6 v6) {
        super(0);
        this.f17305a = h6;
        this.b = v6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$a$--Lcom-scandit-datacapture-barcode-J6-, reason: not valid java name */
    public static /* synthetic */ void m287instrumented$0$a$LcomscanditdatacapturebarcodeJ6(V6 v6, View view) {
        Callback.g(view);
        try {
            a(v6, view);
        } finally {
            Callback.h();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J6 invoke() {
        J6 j6A = ((I6) this.f17305a).a();
        j6A.setOnClickListener(new df(this.b, 1));
        return j6A;
    }

    private static final void a(V6 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        Function0 function0B = this$0.b();
        if (function0B != null) {
            function0B.invoke();
        }
    }
}
