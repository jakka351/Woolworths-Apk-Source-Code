package com.scandit.datacapture.core.internal.module.ui.control.layout;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ControlLayout f18628a;
    final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ControlLayout controlLayout, View view) {
        super(0);
        this.f18628a = controlLayout;
        this.b = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18628a.removeView(this.b);
        return Unit.f24250a;
    }
}
