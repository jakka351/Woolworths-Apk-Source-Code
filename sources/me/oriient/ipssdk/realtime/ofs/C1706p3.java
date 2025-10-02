package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.p3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1706p3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1706p3 f26128a = new C1706p3();

    public C1706p3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ChargingBasedPositioningControllerImpl(Positioning.access$getCoroutineScope(Positioning.INSTANCE), Positioning.L);
    }
}
