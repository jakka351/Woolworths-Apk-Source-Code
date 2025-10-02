package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.android.WakeLockFactoryImpl;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* loaded from: classes2.dex */
public final class B extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final B f25716a = new B();

    public B() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new WakeLockFactoryImpl((ContextProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(ContextProvider.class)));
    }
}
