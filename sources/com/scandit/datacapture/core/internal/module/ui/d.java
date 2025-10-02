package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.C1172y2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes6.dex */
final /* synthetic */ class d extends FunctionReference implements Function1 {
    public d(DataCaptureTextureView dataCaptureTextureView) {
        super(dataCaptureTextureView);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "doRender";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f24268a.b(DataCaptureTextureView.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "doRender(Lcom/scandit/datacapture/core/internal/module/gl/GlRenderThread$RenderData;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C1172y2 p0 = (C1172y2) obj;
        Intrinsics.h(p0, "p0");
        DataCaptureTextureView.a((DataCaptureTextureView) this.receiver, p0);
        return Unit.f24250a;
    }
}
