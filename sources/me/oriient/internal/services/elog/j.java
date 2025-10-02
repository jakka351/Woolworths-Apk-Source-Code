package me.oriient.internal.services.elog;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MetricImpl f25445a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ double c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MetricImpl metricImpl, Function0 function0, double d) {
        super(0);
        this.f25445a = metricImpl;
        this.b = function0;
        this.c = d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f25445a.addValueToParams((Map) this.b.invoke(), this.c);
    }
}
