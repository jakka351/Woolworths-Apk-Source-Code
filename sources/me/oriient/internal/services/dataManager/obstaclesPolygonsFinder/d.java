package me.oriient.internal.services.dataManager.obstaclesPolygonsFinder;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.FindPolygonResult;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.obstacles.Obstacles;

/* loaded from: classes7.dex */
public final class d implements ObstaclesPolygonsFinder {

    /* renamed from: a, reason: collision with root package name */
    public final String f25271a;
    public final String b;
    public final double c;
    public final List d;
    public final List e;
    public final List f;

    public d(String buildingId, String floorId, Obstacles obstacles) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(obstacles, "obstacles");
        this.f25271a = buildingId;
        this.b = floorId;
        this.c = 10.0d;
        this.f = CollectionsKt.G(obstacles.getPR().getValue());
        ArrayList arrayList = new ArrayList();
        int size = obstacles.getPCenter().getValue().size();
        for (int i = 0; i < size; i++) {
            if (((List) obstacles.getPCenter().getValue().get(i)).size() != 2) {
                me.oriient.internal.services.uploadingManager.temp.a.a("Incorrect obstacles");
            } else {
                arrayList.add(new IndoorCoordinate(((Number) ((List) obstacles.getPCenter().getValue().get(i)).get(0)).doubleValue(), ((Number) ((List) obstacles.getPCenter().getValue().get(i)).get(1)).doubleValue(), 0.0d, 4, (DefaultConstructorMarker) null));
            }
        }
        List listG0 = CollectionsKt.G0(arrayList);
        this.e = listG0;
        if (this.f.size() != listG0.size()) {
            me.oriient.internal.services.uploadingManager.temp.a.a("Incorrect obstacles format");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayListG = CollectionsKt.G(obstacles.getPoly().getValue());
        int size2 = arrayListG.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ArrayList arrayListG2 = CollectionsKt.G(((Obstacles.Polygon) arrayListG.get(i2)).getX().getValue());
            ArrayList arrayListG3 = CollectionsKt.G(((Obstacles.Polygon) arrayListG.get(i2)).getY().getValue());
            ArrayList arrayList3 = new ArrayList();
            int iMin = Math.min(arrayListG2.size(), arrayListG3.size());
            for (int i3 = 0; i3 < iMin; i3++) {
                arrayList3.add(new IndoorCoordinate(((Number) arrayListG2.get(i3)).doubleValue(), ((Number) arrayListG3.get(i3)).doubleValue(), 0.0d, 4, (DefaultConstructorMarker) null));
            }
            arrayList2.add(arrayList3);
        }
        List listG02 = CollectionsKt.G0(arrayList2);
        this.d = listG02;
        if (listG02.size() != this.f.size()) {
            me.oriient.internal.services.uploadingManager.temp.a.a("Incorrect obstacles format");
        }
    }

    @Override // me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.ObstaclesPolygonsFinder
    public final FindPolygonResult findClosestPolygon(IndoorCoordinate point) {
        Intrinsics.h(point, "point");
        if (this.d.size() != this.e.size() || this.e.size() != this.f.size()) {
            return null;
        }
        List list = this.d;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            if (point.plainDistanceTo((IndoorCoordinate) this.e.get(i)) <= ((Number) this.f.get(i)).doubleValue() + this.c) {
                arrayList.add(obj);
            }
            i = i2;
        }
        FindPolygonResult findPolygonResultFindClosestPolygon = point.findClosestPolygon(arrayList);
        return findPolygonResultFindClosestPolygon == null ? point.findClosestPolygon(this.d) : findPolygonResultFindClosestPolygon;
    }

    @Override // me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.ObstaclesPolygonsFinder
    public final String getBuildingId() {
        return this.f25271a;
    }

    @Override // me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.ObstaclesPolygonsFinder
    public final String getFloorId() {
        return this.b;
    }
}
