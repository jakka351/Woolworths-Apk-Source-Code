package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.networkManager.NetworkManagerAndroid;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* renamed from: me.oriient.ipssdk.common.ofs.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1549g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1549g f25749a = new C1549g();

    public C1549g() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new NetworkManagerAndroid(((ContextProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(ContextProvider.class))).getContext(), null, 2, null);
    }
}
