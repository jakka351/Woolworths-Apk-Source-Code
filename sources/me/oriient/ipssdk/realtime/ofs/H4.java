package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.services.systemStateManager.SystemStateManager;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* loaded from: classes8.dex */
public final class H4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final H4 f25952a = new H4();

    public H4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (SystemStateManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(SystemStateManager.class));
    }
}
