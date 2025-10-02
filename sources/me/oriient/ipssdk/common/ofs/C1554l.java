package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.database.CommonDatabaseDriverProviderImpl;

/* renamed from: me.oriient.ipssdk.common.ofs.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1554l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1554l f25758a = new C1554l();

    public C1554l() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new CommonDatabaseDriverProviderImpl((ContextProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(ContextProvider.class)));
    }
}
