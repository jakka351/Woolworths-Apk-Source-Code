package me.oriient.positioningengine.support;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.engine.EngineVersionProvider;
import me.oriient.internal.services.elog.Metric;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;
import org.jetbrains.annotations.NotNull;

/* renamed from: me.oriient.positioningengine.support.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1846f implements InterfaceC1840b {

    @NotNull
    private static final C1841c Companion = new C1841c();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26551a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public OnDeviceEngineSession h;

    public C1846f() {
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26551a = di.inject(reflectionFactory.b(Logger.class));
        this.b = DiKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.c = DiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.d = DiKt.getDi().inject(reflectionFactory.b(me.oriient.positioningengine.common.config.c.class));
        this.e = DiKt.getDi().inject(reflectionFactory.b(EngineVersionProvider.class));
        this.f = DiKt.getDi().inject(reflectionFactory.b(InterfaceC1847g.class));
        this.g = DiKt.getDi().inject(reflectionFactory.b(Metric.class));
    }
}
