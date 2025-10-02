package me.oriient.internal.services.dataManager.mapGrid;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.DbError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.database.DbMapGrid;
import me.oriient.internal.services.dataManager.database.MapGridQueries;

/* loaded from: classes7.dex */
public final class r extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1321t f25223a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1321t c1321t, String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.f25223a = c1321t;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MapGridQueries queries = (MapGridQueries) obj;
        Intrinsics.h(queries, "queries");
        DbMapGrid dbMapGrid = (DbMapGrid) queries.transactionWithResult(false, new C1319q(queries, this.b, this.c, this.d, this.e, this.f, this.f25223a));
        if (dbMapGrid == null) {
            return new Outcome.Success(null);
        }
        File fileOrNull = this.f25223a.c.getFileOrNull(dbMapGrid.getFilePath());
        if (fileOrNull != null) {
            return this.f25223a.c.readFile(fileOrNull).map(new C1318p(dbMapGrid, this.d));
        }
        return new Outcome.Failure(new DbError("map grid file was deleted, buildingId = " + this.b + ", floorId = " + this.c + ", mapId = " + this.d + ", spaceId " + this.e));
    }
}
