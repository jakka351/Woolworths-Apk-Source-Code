package me.oriient.ipssdk.realtime.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.ipssdk.realtime.utils.models.Position;

/* renamed from: me.oriient.ipssdk.realtime.ofs.r3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1717r3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26139a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717r3(String str) {
        super(0);
        this.f26139a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Pair pair = new Pair("buildingId", this.f26139a);
        Positioning positioning = Positioning.INSTANCE;
        Position lastKnownPosition = positioning.getLastKnownPosition();
        Pair pair2 = new Pair("lockProgress", lastKnownPosition != null ? Double.valueOf(lastKnownPosition.getL()) : comparable);
        Position lastKnownPosition2 = positioning.getLastKnownPosition();
        return MapsKt.j(pair, pair2, new Pair("traveledDistance", lastKnownPosition2 != null ? Double.valueOf(lastKnownPosition2.getM()) : 0));
    }
}
