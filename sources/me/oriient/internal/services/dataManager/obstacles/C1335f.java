package me.oriient.internal.services.dataManager.obstacles;

import com.squareup.sqldelight.TransactionWithoutReturn;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.database.ObstaclesQueries;

/* renamed from: me.oriient.internal.services.dataManager.obstacles.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1335f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1348t f25248a;
    public final /* synthetic */ double b;
    public final /* synthetic */ ObstaclesQueries c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1335f(C1348t c1348t, double d, ObstaclesQueries obstaclesQueries) {
        super(1);
        this.f25248a = c1348t;
        this.b = d;
        this.c = obstaclesQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransactionWithoutReturn transaction = (TransactionWithoutReturn) obj;
        Intrinsics.h(transaction, "$this$transaction");
        long currentTimeMillis = (long) (((TimeProvider) this.f25248a.e.getD()).getCurrentTimeMillis() - (this.b * TimeUnit.DAYS.toMillis(1L)));
        List<String> listExecuteAsList = this.c.getExpiredObstaclesFilePaths(currentTimeMillis).executeAsList();
        ((Logger) this.f25248a.d.getD()).d("ObstaclesDatabase", "deleteExpiredObstacles: found " + listExecuteAsList.size() + " file paths");
        C1348t c1348t = this.f25248a;
        Iterator<T> it = listExecuteAsList.iterator();
        while (it.hasNext()) {
            c1348t.c.deleteFile((String) it.next());
        }
        this.c.removeExpiredObstacles(currentTimeMillis);
        return Unit.f24250a;
    }
}
