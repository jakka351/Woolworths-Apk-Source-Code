package me.oriient.ipssdk.realtime.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSFloorLayoutPartFindingResult;
import me.oriient.ipssdk.realtime.ips.SdkFloorCoordinateConverter;
import me.oriient.ipssdk.realtime.utils.models.Coordinate;

/* loaded from: classes8.dex */
public final class M4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SdkFloorCoordinateConverter f25977a;
    public final /* synthetic */ IPSCoordinate b;
    public final /* synthetic */ Coordinate c;
    public final /* synthetic */ IPSFloorLayoutPartFindingResult d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4(SdkFloorCoordinateConverter sdkFloorCoordinateConverter, IPSCoordinate iPSCoordinate, Coordinate coordinate, IPSFloorLayoutPartFindingResult iPSFloorLayoutPartFindingResult) {
        super(0);
        this.f25977a = sdkFloorCoordinateConverter;
        this.b = iPSCoordinate;
        this.c = coordinate;
        this.d = iPSFloorLayoutPartFindingResult;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("buildingId", this.f25977a.f25858a), new Pair("floorId", this.f25977a.b.getFloorId()), new Pair("clientX", Double.valueOf(this.b.getD())), new Pair("clientY", Double.valueOf(this.b.getE())), new Pair("oriientX", Double.valueOf(this.c.getD())), new Pair("oriientY", Double.valueOf(this.c.getE())), new Pair("distanceToLayout", Double.valueOf(this.d.getDistance())));
    }
}
