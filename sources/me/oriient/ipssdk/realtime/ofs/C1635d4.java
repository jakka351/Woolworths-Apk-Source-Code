package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.powerManager.PowerManagerAndroid;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* renamed from: me.oriient.ipssdk.realtime.ofs.d4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1635d4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1635d4 f26062a = new C1635d4();

    public C1635d4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new PowerManagerAndroid(((ContextProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(ContextProvider.class))).getContext());
    }
}
