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
public final class o implements m {

    @NotNull
    private static final n Companion = new n();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26370a;
    public final Lazy b;

    public o() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26370a = dependencyInjectionA.inject(reflectionFactory.b(Logger.class));
        this.b = DiKt.a().inject(reflectionFactory.b(InterfaceC1781w.class));
    }
}
