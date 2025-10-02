package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LinearControlGroup f18913a;
    final /* synthetic */ Control b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LinearControlGroup linearControlGroup, Control control) {
        super(0);
        this.f18913a = linearControlGroup;
        this.b = control;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18913a.get_view().removeView(this.b.get_view());
        return Unit.f24250a;
    }
}
