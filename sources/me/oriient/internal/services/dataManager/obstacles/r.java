package me.oriient.internal.services.dataManager.obstacles;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.DbError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.database.DbObstacles;
import me.oriient.internal.services.dataManager.database.ObstaclesQueries;

/* loaded from: classes7.dex */
public final class r extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1348t f25260a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1348t c1348t, String str, String str2, String str3) {
        super(1);
        this.f25260a = c1348t;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ObstaclesQueries queries = (ObstaclesQueries) obj;
        Intrinsics.h(queries, "queries");
        DbObstacles dbObstacles = (DbObstacles) queries.transactionWithResult(false, new C1346q(queries, this.b, this.c, this.d, this.f25260a));
        if (dbObstacles == null) {
            return new Outcome.Success(null);
        }
        File fileOrNull = this.f25260a.c.getFileOrNull(dbObstacles.getFilePath());
        if (fileOrNull != null) {
            return this.f25260a.c.readFile(fileOrNull).map(new C1345p(this.d, this.b, this.c));
        }
        return new Outcome.Failure(new DbError("obstacles file was deleted, buildingId = " + this.b + ", floorId = " + this.c + ", spaceId = " + this.d));
    }
}
