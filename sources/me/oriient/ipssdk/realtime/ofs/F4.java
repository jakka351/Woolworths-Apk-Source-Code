package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.sensorsManager.ForegroundServiceMonitorImpl;

/* loaded from: classes8.dex */
public final class F4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final F4 f25940a = new F4();

    public F4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ForegroundServiceMonitorImpl();
    }
}
