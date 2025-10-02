package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.positioning.ManualPositioningGeofenceCheckerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.s4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1724s4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1724s4 f26146a = new C1724s4();

    public C1724s4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ManualPositioningGeofenceCheckerImpl();
    }
}
