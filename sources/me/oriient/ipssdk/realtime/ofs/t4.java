package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManagerImpl;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventOrigin;

/* loaded from: classes8.dex */
public final class t4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProximityEventOrigin f26152a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(ProximityEventOrigin proximityEventOrigin) {
        super(0);
        this.f26152a = proximityEventOrigin;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ProximityEventManagerImpl(this.f26152a);
    }
}
