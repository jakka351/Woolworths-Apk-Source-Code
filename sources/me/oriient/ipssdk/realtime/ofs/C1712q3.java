package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* renamed from: me.oriient.ipssdk.realtime.ofs.q3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1712q3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1712q3 f26134a = new C1712q3();

    public C1712q3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoroutineScopeKt.a(((CoroutineContextProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CoroutineContextProvider.class))).newSingleThreadCoroutineContext());
    }
}
