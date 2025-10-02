package me.oriient.positioningengine.support.preloaders;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.positioningengine.common.util.PositioningEngineError;

/* loaded from: classes8.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f26568a = new c();

    public c() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PositioningEngineError it = (PositioningEngineError) obj;
        Intrinsics.h(it, "it");
        return it.toOriientError$service_positioning_engine_publishRelease();
    }
}
