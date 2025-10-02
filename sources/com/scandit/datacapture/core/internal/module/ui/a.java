package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.A2;
import com.scandit.datacapture.core.source.FrameSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FrameSource f18617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FrameSource frameSource) {
        super(1);
        this.f18617a = frameSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        A2 use = (A2) obj;
        Intrinsics.h(use, "$this$use");
        use.a(this.f18617a != null);
        return Unit.f24250a;
    }
}
