package me.oriient.internal.services.dataManager.building;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class D implements w {

    @NotNull
    private static final x Companion = new x();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25093a;
    public final Lazy b;

    public D() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25093a = di.inject(reflectionFactory.b(OriientApiProvider.class));
        this.b = InternalDiKt.getDi().inject(reflectionFactory.b(RestHelper.class));
    }
}
