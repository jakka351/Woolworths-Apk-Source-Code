package me.oriient.internal.services.remoteLog.di;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.scheduler.SchedulerAndroid;

/* loaded from: classes7.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f25530a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(0);
        this.f25530a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SchedulerAndroid(this.f25530a);
    }
}
