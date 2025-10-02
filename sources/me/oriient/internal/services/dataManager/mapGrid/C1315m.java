package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.database.MapGridQueries;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1315m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1321t f25218a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1315m(C1321t c1321t) {
        super(1);
        this.f25218a = c1321t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MapGridQueries queries = (MapGridQueries) obj;
        Intrinsics.h(queries, "queries");
        this.f25218a.c.deleteFiles("/maps/", true, C1314l.f25217a);
        queries.clearMapGrid();
        return Unit.f24250a;
    }
}
