package me.oriient.internal.infra.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DependencyInjectionImpl f24923a;
    public final /* synthetic */ Class b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DependencyInjectionImpl dependencyInjectionImpl, Class cls) {
        super(0);
        this.f24923a = dependencyInjectionImpl;
        this.b = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f24923a.getJava(this.b, null);
    }
}
