package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.A0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final /* synthetic */ class n extends FunctionReference implements Function1 {
    public n() {
        super(CameraFactory.d);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "getCameraDelegateFactory";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f24268a.b(A0.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "getCameraDelegateFactory(Lcom/scandit/datacapture/core/internal/module/source/NativeCameraApi;)Lcom/scandit/datacapture/core/internal/module/source/CameraDelegateFactory;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeCameraApi p0 = (NativeCameraApi) obj;
        Intrinsics.h(p0, "p0");
        return A0.a((A0) this.receiver, p0);
    }
}
