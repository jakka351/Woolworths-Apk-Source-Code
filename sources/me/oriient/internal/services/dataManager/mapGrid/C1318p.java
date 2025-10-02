package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.database.DbMapGrid;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1318p extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DbMapGrid f25221a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1318p(DbMapGrid dbMapGrid, String str) {
        super(1);
        this.f25221a = dbMapGrid;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte[] it = (byte[]) obj;
        Intrinsics.h(it, "it");
        return new MapGridRecord(this.f25221a.getBuildingId(), this.f25221a.getFloorId(), this.b, it, this.f25221a.getVector(), this.f25221a.getTag(), this.f25221a.getEngineVersion(), this.f25221a.getMapVersion(), this.f25221a.getGridType(), this.f25221a.getMajorVersion(), this.f25221a.getCreatedBy());
    }
}
