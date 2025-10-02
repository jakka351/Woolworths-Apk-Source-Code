package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.services.elog.Metric;
import me.oriient.internal.services.elog.MetricRestRequestReporter;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* loaded from: classes2.dex */
public final class K extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final K f25725a = new K();

    public K() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new MetricRestRequestReporter((Metric) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(Metric.class)));
    }
}
