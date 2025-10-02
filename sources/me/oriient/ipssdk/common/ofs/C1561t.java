package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* renamed from: me.oriient.ipssdk.common.ofs.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1561t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1561t f25767a = new C1561t();

    public C1561t() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (RuntimeDataManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(RuntimeDataManager.class));
    }
}
