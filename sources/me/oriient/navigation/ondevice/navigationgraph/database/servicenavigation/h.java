package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class h extends Lambda implements Function7 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f26339a = new h();

    public h() {
        super(7);
    }

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        String buildingId_ = (String) obj;
        String floorId_ = (String) obj2;
        String mapId = (String) obj3;
        String spaceId_ = (String) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String filePath = (String) obj6;
        long jLongValue = ((Number) obj7).longValue();
        Intrinsics.h(buildingId_, "buildingId_");
        Intrinsics.h(floorId_, "floorId_");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(spaceId_, "spaceId_");
        Intrinsics.h(filePath, "filePath");
        return new me.oriient.navigation.ondevice.navigationgraph.database.a(buildingId_, floorId_, mapId, spaceId_, iIntValue, filePath, jLongValue);
    }
}
