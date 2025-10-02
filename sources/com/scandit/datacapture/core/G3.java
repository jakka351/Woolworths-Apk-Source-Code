package com.scandit.datacapture.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes6.dex */
final /* synthetic */ class G3 extends FunctionReference implements Function1 {
    public G3(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "storeLog";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f24268a.b(J3.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "storeLog(Ljava/lang/String;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        ((J3) this.receiver).a(p0);
        return Unit.f24250a;
    }
}
