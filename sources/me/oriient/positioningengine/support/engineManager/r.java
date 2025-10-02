package me.oriient.positioningengine.support.engineManager;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;

/* loaded from: classes8.dex */
public final class r extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final r f26542a = new r();

    public r() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair it = (Pair) obj;
        Intrinsics.h(it, "it");
        return (OnDeviceEngineSession) it.d;
    }
}
