package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.database.MapGridQueries;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1309g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1321t f25212a;
    public final /* synthetic */ double b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309g(C1321t c1321t, double d) {
        super(1);
        this.f25212a = c1321t;
        this.b = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MapGridQueries queries = (MapGridQueries) obj;
        Intrinsics.h(queries, "queries");
        queries.transaction(false, new C1308f(this.f25212a, this.b, queries));
        return Unit.f24250a;
    }
}
