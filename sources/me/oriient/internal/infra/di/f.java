package me.oriient.internal.infra.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* loaded from: classes7.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DependencyInjectionImpl f24926a;
    public final /* synthetic */ KClass b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DependencyInjectionImpl dependencyInjectionImpl, KClass kClass, String str) {
        super(0);
        this.f24926a = dependencyInjectionImpl;
        this.b = kClass;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f24926a.getOrNull(this.b, this.c);
    }
}
