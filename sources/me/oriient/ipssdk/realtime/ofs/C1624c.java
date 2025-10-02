package me.oriient.ipssdk.realtime.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.region.BuildingExitRegion;

/* renamed from: me.oriient.ipssdk.realtime.ofs.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1624c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BuildingExitRegion f26051a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1624c(BuildingExitRegion buildingExitRegion) {
        super(0);
        this.f26051a = buildingExitRegion;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("regionID", this.f26051a.getId()), new Pair("buildingId", this.f26051a.getBuildingId()), new Pair("floorOrder", Integer.valueOf(this.f26051a.getFloorOrder())));
    }
}
