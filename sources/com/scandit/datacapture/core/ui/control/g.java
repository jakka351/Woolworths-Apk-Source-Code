package com.scandit.datacapture.core.ui.control;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LinearLayout f18915a;
    final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LinearLayout linearLayout, View view) {
        super(0);
        this.f18915a = linearLayout;
        this.b = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18915a.addView(this.b);
        return Unit.f24250a;
    }
}
