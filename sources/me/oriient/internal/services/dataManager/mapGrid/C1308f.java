package me.oriient.internal.services.dataManager.mapGrid;

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
import me.oriient.internal.services.dataManager.database.MapGridQueries;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1308f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1321t f25211a;
    public final /* synthetic */ double b;
    public final /* synthetic */ MapGridQueries c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1308f(C1321t c1321t, double d, MapGridQueries mapGridQueries) {
        super(1);
        this.f25211a = c1321t;
        this.b = d;
        this.c = mapGridQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransactionWithoutReturn transaction = (TransactionWithoutReturn) obj;
        Intrinsics.h(transaction, "$this$transaction");
        long currentTimeMillis = (long) (((TimeProvider) this.f25211a.e.getD()).getCurrentTimeMillis() - (this.b * TimeUnit.DAYS.toMillis(1L)));
        List<String> listExecuteAsList = this.c.getExpiredMapGridFilePaths(currentTimeMillis).executeAsList();
        ((Logger) this.f25211a.d.getD()).d("MapGridDatabase", "deleteExpiredMapGrids: found " + listExecuteAsList.size() + " file paths");
        C1321t c1321t = this.f25211a;
        Iterator<T> it = listExecuteAsList.iterator();
        while (it.hasNext()) {
            c1321t.c.deleteFile((String) it.next());
        }
        this.c.removeExpiredMapGrids(currentTimeMillis);
        return Unit.f24250a;
    }
}
