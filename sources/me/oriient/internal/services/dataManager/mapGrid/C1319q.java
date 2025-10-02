package me.oriient.internal.services.dataManager.mapGrid;

import com.squareup.sqldelight.TransactionWithReturn;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.database.DbMapGrid;
import me.oriient.internal.services.dataManager.database.MapGridQueries;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1319q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapGridQueries f25222a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ C1321t g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1319q(MapGridQueries mapGridQueries, String str, String str2, String str3, String str4, String str5, C1321t c1321t) {
        super(1);
        this.f25222a = mapGridQueries;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = c1321t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransactionWithReturn transactionWithResult = (TransactionWithReturn) obj;
        Intrinsics.h(transactionWithResult, "$this$transactionWithResult");
        DbMapGrid dbMapGridExecuteAsOneOrNull = this.f25222a.getMapGrid(this.b, this.c, this.d, this.e, this.f).executeAsOneOrNull();
        if (dbMapGridExecuteAsOneOrNull == null) {
            return null;
        }
        MapGridQueries mapGridQueries = this.f25222a;
        C1321t c1321t = this.g;
        mapGridQueries.updateMapGridReadTimestamp(((TimeProvider) c1321t.e.getD()).getCurrentTimeMillis(), this.b, this.c, this.d, this.e);
        return dbMapGridExecuteAsOneOrNull;
    }
}
