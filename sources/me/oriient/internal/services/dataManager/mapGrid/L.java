package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class L implements H {

    @NotNull
    private static final I Companion = new I();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25199a;
    public final Lazy b;

    public L() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25199a = di.inject(reflectionFactory.b(OriientApiProvider.class));
        this.b = InternalDiKt.getDi().inject(reflectionFactory.b(RestHelper.class));
    }
}
