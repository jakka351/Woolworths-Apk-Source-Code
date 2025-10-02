package me.oriient.internal.services.elog;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.remoteLog.InstanceOptions;

/* loaded from: classes7.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25438a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, int i2, long j) {
        super(1);
        this.f25438a = i;
        this.b = i2;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InstanceOptions configure = (InstanceOptions) obj;
        Intrinsics.h(configure, "$this$configure");
        configure.setMaxBatchSize(Integer.valueOf(this.f25438a));
        configure.setRetries(Integer.valueOf(this.b));
        configure.setSendingSchedule(new me.oriient.internal.services.remoteLog.h(this.c, TimeUnit.SECONDS));
        return Unit.f24250a;
    }
}
