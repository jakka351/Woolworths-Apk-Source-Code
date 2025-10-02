package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.mapGrid.MapGrid;

/* loaded from: classes7.dex */
public final class D extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapGridRecord f25193a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(MapGridRecord mapGridRecord) {
        super(1);
        this.f25193a = mapGridRecord;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MapGrid.MapGridData mapGridAlgo = (MapGrid.MapGridData) obj;
        Intrinsics.h(mapGridAlgo, "mapGridAlgo");
        return new MapGrid(this.f25193a, mapGridAlgo);
    }
}
