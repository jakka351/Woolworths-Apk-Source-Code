package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.database.MapGridQueries;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1313k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1321t f25216a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1313k(C1321t c1321t, String str) {
        super(1);
        this.f25216a = c1321t;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MapGridQueries queries = (MapGridQueries) obj;
        Intrinsics.h(queries, "queries");
        this.f25216a.c.deleteFiles(me.oriient.internal.infra.rest.e.a(new StringBuilder("/maps/"), this.b, '/'), true, C1312j.f25215a);
        queries.removeMapGrids(this.b);
        return Unit.f24250a;
    }
}
