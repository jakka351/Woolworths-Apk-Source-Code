package me.oriient.internal.services.elog;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.remoteLog.InstanceOptions;

/* loaded from: classes7.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25439a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, int i2) {
        super(1);
        this.f25439a = i;
        this.b = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InstanceOptions configure = (InstanceOptions) obj;
        Intrinsics.h(configure, "$this$configure");
        configure.setMaxBatchSize(Integer.valueOf(this.f25439a));
        configure.setRetries(Integer.valueOf(this.b));
        configure.setSendingSchedule(me.oriient.internal.services.remoteLog.g.f25537a);
        return Unit.f24250a;
    }
}
