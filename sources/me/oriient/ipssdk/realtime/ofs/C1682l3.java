package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticNotLockedSessionStopper;

/* renamed from: me.oriient.ipssdk.realtime.ofs.l3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1682l3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1682l3 f26106a = new C1682l3();

    public C1682l3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new AutomaticNotLockedSessionStopper(Positioning.P, Positioning.access$getCoroutineScope(Positioning.INSTANCE));
    }
}
