package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManager;

/* loaded from: classes8.dex */
public final class z4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z4 f26186a = new z4();

    public z4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (ProximityStatsManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(ProximityStatsManager.class));
    }
}
