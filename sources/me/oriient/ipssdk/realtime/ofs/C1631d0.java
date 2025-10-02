package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.ips.IPSCore;
import me.oriient.ipssdk.realtime.ips.Core;

/* renamed from: me.oriient.ipssdk.realtime.ofs.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1631d0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1631d0 f26058a = new C1631d0();

    public C1631d0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("connectionState", IPSCore.describeConnectionState(Core.INSTANCE.getConnectionState()));
    }
}
