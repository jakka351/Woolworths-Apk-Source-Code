package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.runtimeDataProvider.RuntimeDataManagerImpl;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* renamed from: me.oriient.ipssdk.common.ofs.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1562u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1562u f25768a = new C1562u();

    public C1562u() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new RuntimeDataManagerImpl(CoroutineScopeKt.a(((CoroutineContextProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CoroutineContextProvider.class))).getDefault()));
    }
}
