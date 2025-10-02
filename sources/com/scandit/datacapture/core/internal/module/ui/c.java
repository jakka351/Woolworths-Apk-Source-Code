package com.scandit.datacapture.core.internal.module.ui;

import android.graphics.SurfaceTexture;
import com.scandit.datacapture.core.A2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SurfaceTexture f18619a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SurfaceTexture surfaceTexture) {
        super(1);
        this.f18619a = surfaceTexture;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        A2 use = (A2) obj;
        Intrinsics.h(use, "$this$use");
        use.a(this.f18619a);
        return Unit.f24250a;
    }
}
