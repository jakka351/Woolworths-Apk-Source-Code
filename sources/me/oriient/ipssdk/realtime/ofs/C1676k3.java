package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticLockedSessionStopper;

/* renamed from: me.oriient.ipssdk.realtime.ofs.k3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1676k3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1676k3 f26100a = new C1676k3();

    public C1676k3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new AutomaticLockedSessionStopper(Positioning.Q, Positioning.access$getCoroutineScope(Positioning.INSTANCE));
    }
}
