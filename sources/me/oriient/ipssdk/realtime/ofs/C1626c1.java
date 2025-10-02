package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.realtime.ips.positioning.CurrentBuildingAndFloor;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* renamed from: me.oriient.ipssdk.realtime.ofs.c1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1626c1 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CurrentBuildingAndFloor f26053a;

    public C1626c1(CurrentBuildingAndFloor currentBuildingAndFloor) {
        this.f26053a = currentBuildingAndFloor;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        CurrentBuildingAndFloor.access$handleFloorChange(this.f26053a, (MappingData.Building.BuildingInfo.FloorMetadata) obj);
        return Unit.f24250a;
    }
}
