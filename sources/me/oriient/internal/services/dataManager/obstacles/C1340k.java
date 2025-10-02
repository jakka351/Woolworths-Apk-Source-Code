package me.oriient.internal.services.dataManager.obstacles;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.database.ObstaclesQueries;

/* renamed from: me.oriient.internal.services.dataManager.obstacles.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1340k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1348t f25253a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1340k(C1348t c1348t, String str) {
        super(1);
        this.f25253a = c1348t;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ObstaclesQueries queries = (ObstaclesQueries) obj;
        Intrinsics.h(queries, "queries");
        this.f25253a.c.deleteFiles(me.oriient.internal.infra.rest.e.a(new StringBuilder("/maps/"), this.b, '/'), true, C1339j.f25252a);
        queries.removeBuildingObstacles(this.b);
        return Unit.f24250a;
    }
}
