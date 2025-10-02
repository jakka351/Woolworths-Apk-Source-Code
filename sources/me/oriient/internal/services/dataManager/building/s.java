package me.oriient.internal.services.dataManager.building;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;

/* loaded from: classes7.dex */
public final class s extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WorldCoordinate f25115a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(WorldCoordinate worldCoordinate, float f) {
        super(1);
        this.f25115a = worldCoordinate;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List allBuildings = (List) obj;
        Intrinsics.h(allBuildings, "allBuildings");
        WorldCoordinate worldCoordinate = this.f25115a;
        float f = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : allBuildings) {
            if (((BuildingSearchResult) obj2).isInsideRadius$internal_publishRelease(worldCoordinate, f)) {
                arrayList.add(obj2);
            }
        }
        return new BuildingsSearchResult(arrayList, null);
    }
}
