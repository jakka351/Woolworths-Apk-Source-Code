package me.oriient.navigation.turnByTurn;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.navigation.common.DiKt;
import me.oriient.navigation.common.InterfaceC1781w;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d implements a {

    @NotNull
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26364a;
    public final Lazy b;

    public d() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26364a = dependencyInjectionA.inject(reflectionFactory.b(Logger.class));
        this.b = DiKt.a().inject(reflectionFactory.b(InterfaceC1781w.class));
    }
}
