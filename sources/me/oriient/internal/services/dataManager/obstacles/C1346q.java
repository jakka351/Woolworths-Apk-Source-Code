package me.oriient.internal.services.dataManager.obstacles;

import com.squareup.sqldelight.TransactionWithReturn;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.database.DbObstacles;
import me.oriient.internal.services.dataManager.database.ObstaclesQueries;

/* renamed from: me.oriient.internal.services.dataManager.obstacles.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1346q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ObstaclesQueries f25259a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ C1348t e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1346q(ObstaclesQueries obstaclesQueries, String str, String str2, String str3, C1348t c1348t) {
        super(1);
        this.f25259a = obstaclesQueries;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = c1348t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransactionWithReturn transactionWithResult = (TransactionWithReturn) obj;
        Intrinsics.h(transactionWithResult, "$this$transactionWithResult");
        DbObstacles dbObstaclesExecuteAsOneOrNull = this.f25259a.getObstacles(this.b, this.c, this.d).executeAsOneOrNull();
        if (dbObstaclesExecuteAsOneOrNull == null) {
            return null;
        }
        ObstaclesQueries obstaclesQueries = this.f25259a;
        C1348t c1348t = this.e;
        obstaclesQueries.updateObstaclesReadTimestamp(((TimeProvider) c1348t.e.getD()).getCurrentTimeMillis(), this.b, this.c, this.d);
        return dbObstaclesExecuteAsOneOrNull;
    }
}
