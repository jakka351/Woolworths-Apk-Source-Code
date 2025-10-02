package me.oriient.internal.infra.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DependencyInjectionImpl f24924a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DependencyInjectionImpl dependencyInjectionImpl, Class cls, String str) {
        super(0);
        this.f24924a = dependencyInjectionImpl;
        this.b = cls;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f24924a.getJava(this.b, this.c);
    }
}
