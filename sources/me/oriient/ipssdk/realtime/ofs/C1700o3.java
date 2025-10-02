package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.o3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1700o3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1700o3 f26122a = new C1700o3();

    public C1700o3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new AutomaticSessionStopperImpl(Positioning.P, Positioning.access$getCoroutineScope(Positioning.INSTANCE));
    }
}
