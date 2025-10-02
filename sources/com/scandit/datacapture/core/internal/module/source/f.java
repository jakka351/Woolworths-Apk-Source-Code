package com.scandit.datacapture.core.internal.module.source;

import android.graphics.SurfaceTexture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f18581a;
    final /* synthetic */ Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, Function1 function1) {
        super(1);
        this.f18581a = mVar;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SurfaceTexture it = (SurfaceTexture) obj;
        Intrinsics.h(it, "it");
        m.b(this.f18581a, it, this.b);
        return Unit.f24250a;
    }
}
