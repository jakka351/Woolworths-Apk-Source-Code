package me.oriient.positioningengine.support.engineManager;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataModel.engine.EngineConfig;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final PositioningEngineCredentials f26533a;
    public EngineConfig b;

    public h(PositioningEngineCredentials credentials, EngineConfig config) {
        Intrinsics.h(credentials, "credentials");
        Intrinsics.h(config, "config");
        this.f26533a = credentials;
        this.b = config;
    }
}
