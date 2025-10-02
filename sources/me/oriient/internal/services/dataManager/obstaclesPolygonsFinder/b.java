package me.oriient.internal.services.dataManager.obstaclesPolygonsFinder;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.obstacles.Obstacles;

/* loaded from: classes7.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ObstaclesPolygonsFinderFetchData f25269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ObstaclesPolygonsFinderFetchData obstaclesPolygonsFinderFetchData) {
        super(1);
        this.f25269a = obstaclesPolygonsFinderFetchData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Obstacles it = (Obstacles) obj;
        Intrinsics.h(it, "it");
        return new d(this.f25269a.getBuildingId(), this.f25269a.getFloorId(), it);
    }
}
