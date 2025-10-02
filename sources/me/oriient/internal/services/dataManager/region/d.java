package me.oriient.internal.services.dataManager.region;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.building.Floor;
import me.oriient.internal.services.dataManager.floorMetadata.FloorExitRegion;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata;

/* loaded from: classes7.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25394a;
    public final /* synthetic */ Floor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, Floor floor) {
        super(1);
        this.f25394a = str;
        this.b = floor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FloorMetadata mapMetadata = (FloorMetadata) obj;
        Intrinsics.h(mapMetadata, "mapMetadata");
        List<FloorExitRegion> exitRegions = mapMetadata.getExitRegions();
        String str = this.f25394a;
        Floor floor = this.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(exitRegions, 10));
        for (FloorExitRegion floorExitRegion : exitRegions) {
            arrayList.add(new BuildingExitRegion(floorExitRegion.getId(), str, floor.getOrder(), floorExitRegion.getShape()));
        }
        return arrayList;
    }
}
