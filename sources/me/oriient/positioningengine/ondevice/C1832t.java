package me.oriient.positioningengine.ondevice;

import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.positioningengine.common.PositioningEngineState;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* renamed from: me.oriient.positioningengine.ondevice.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1832t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MappingData.Building f26479a;
    public final /* synthetic */ PositioningEngineState.Positioning b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1832t(MappingData.Building building, PositioningEngineState.Positioning positioning) {
        super(0);
        this.f26479a = building;
        this.b = positioning;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("buildingId", this.f26479a.getBuildingInfo().getBuildingId()), new Pair("floorIds", CollectionsKt.M(this.b.getContext().getInitialFloorIds(), ",", null, null, null, 62)), new Pair("errorMessage", "Building doesn't contain floorIds"));
    }
}
