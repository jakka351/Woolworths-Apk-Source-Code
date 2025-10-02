package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.A2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeCameraDelegateSettings f18582a;
    final /* synthetic */ m b;
    final /* synthetic */ Function1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(NativeCameraDelegateSettings nativeCameraDelegateSettings, m mVar, Function1 function1) {
        super(1);
        this.f18582a = nativeCameraDelegateSettings;
        this.b = mVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        A2 use = (A2) obj;
        Intrinsics.h(use, "$this$use");
        f fVar = new f(this.b, this.c);
        int width = (int) this.f18582a.frameResolution.getWidth();
        int height = (int) this.f18582a.frameResolution.getHeight();
        int i = A2.A;
        use.a(fVar, width, height, 0);
        use.b(false);
        return Unit.f24250a;
    }
}
