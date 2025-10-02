package me.oriient.internal.infra.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* loaded from: classes7.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DependencyInjectionImpl f24921a;
    public final /* synthetic */ KClass b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DependencyInjectionImpl dependencyInjectionImpl, KClass kClass) {
        super(0);
        this.f24921a = dependencyInjectionImpl;
        this.b = kClass;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f24921a.get(this.b, null);
    }
}
