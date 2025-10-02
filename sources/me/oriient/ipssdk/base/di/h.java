package me.oriient.ipssdk.base.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.di.DependencyInjectionImpl;
import me.oriient.internal.infra.di.DiRepository;

/* loaded from: classes.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f25691a = new h();

    public h() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjectionImpl dependencyInjectionImpl = new DependencyInjectionImpl("me.oriient.michael's_idea", true);
        DiRepository.INSTANCE.putDi(dependencyInjectionImpl.getId(), dependencyInjectionImpl);
        DependencyInjectionKt.access$init(dependencyInjectionImpl);
        return dependencyInjectionImpl;
    }
}
