package me.oriient.positioningengine.ondevice;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* renamed from: me.oriient.positioningengine.ondevice.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1818e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MappingData.Building.BuildingInfo.FloorMetadata f26429a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818e(MappingData.Building.BuildingInfo.FloorMetadata floorMetadata) {
        super(0);
        this.f26429a = floorMetadata;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("newFloorId", this.f26429a.getFloorId()), new Pair("newFloorOrder", Double.valueOf(this.f26429a.getFloorIndex())), new Pair("engineType", me.oriient.positioningengine.common.u.ON_DEVICE.getValue$service_positioning_engine_publishRelease()));
    }
}
