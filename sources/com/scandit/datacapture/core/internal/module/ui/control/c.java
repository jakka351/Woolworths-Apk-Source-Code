package com.scandit.datacapture.core.internal.module.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ToggleImageButton f18623a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ToggleImageButton toggleImageButton, boolean z) {
        super(0);
        this.f18623a = toggleImageButton;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18623a.setVisibility(this.b ? 0 : 8);
        return Unit.f24250a;
    }
}
