package me.oriient.internal.services.dataManager.obstacles;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.database.ObstaclesQueries;

/* renamed from: me.oriient.internal.services.dataManager.obstacles.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1342m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1348t f25255a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342m(C1348t c1348t) {
        super(1);
        this.f25255a = c1348t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ObstaclesQueries queries = (ObstaclesQueries) obj;
        Intrinsics.h(queries, "queries");
        this.f25255a.c.deleteFiles("/maps/", true, C1341l.f25254a);
        queries.clearObstacles();
        return Unit.f24250a;
    }
}
