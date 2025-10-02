package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManagerImpl;

/* loaded from: classes8.dex */
public final class y4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y4 f26180a = new y4();

    public y4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ProximityStatsManagerImpl();
    }
}
