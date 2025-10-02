package me.oriient.internal.services.dataManager.obstacles;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.database.ObstaclesQueries;

/* renamed from: me.oriient.internal.services.dataManager.obstacles.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1336g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1348t f25249a;
    public final /* synthetic */ double b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1336g(C1348t c1348t, double d) {
        super(1);
        this.f25249a = c1348t;
        this.b = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ObstaclesQueries queries = (ObstaclesQueries) obj;
        Intrinsics.h(queries, "queries");
        queries.transaction(false, new C1335f(this.f25249a, this.b, queries));
        return Unit.f24250a;
    }
}
