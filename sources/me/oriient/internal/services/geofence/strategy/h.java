package me.oriient.internal.services.geofence.strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.building.BuildingSearchResult;
import me.oriient.internal.services.dataManager.building.BuildingsSearchResult;
import me.oriient.internal.services.geofence.models.GeofenceBuildingKt;

/* loaded from: classes7.dex */
public final class h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f25503a = new h();

    public h() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BuildingsSearchResult buildingsSearchResult = (BuildingsSearchResult) obj;
        Intrinsics.h(buildingsSearchResult, "buildingsSearchResult");
        List<BuildingSearchResult> results = buildingsSearchResult.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(GeofenceBuildingKt.toGeofenceBuilding((BuildingSearchResult) it.next()));
        }
        return arrayList;
    }
}
