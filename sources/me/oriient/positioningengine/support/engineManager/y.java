package me.oriient.positioningengine.support.engineManager;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;

/* loaded from: classes8.dex */
public final class y extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnDeviceEngineSession f26549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(OnDeviceEngineSession onDeviceEngineSession) {
        super(1);
        this.f26549a = onDeviceEngineSession;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PositioningEngine it = (PositioningEngine) obj;
        Intrinsics.h(it, "it");
        return new SupportPositioningEngineManager.ResolveEngineData(it, this.f26549a);
    }
}
