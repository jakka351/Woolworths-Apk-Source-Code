package me.oriient.navigation.ondevice.navgraph;

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

/* renamed from: me.oriient.navigation.ondevice.navgraph.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1801g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f26311a;
    public final /* synthetic */ double b;
    public final /* synthetic */ me.oriient.navigation.ondevice.navigationgraph.database.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1801g(v vVar, double d, me.oriient.navigation.ondevice.navigationgraph.database.b bVar) {
        super(1);
        this.f26311a = vVar;
        this.b = d;
        this.c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransactionWithoutReturn transaction = (TransactionWithoutReturn) obj;
        Intrinsics.h(transaction, "$this$transaction");
        long currentTimeMillis = (long) (((TimeProvider) this.f26311a.d.getD()).getCurrentTimeMillis() - (this.b * TimeUnit.DAYS.toMillis(1L)));
        me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.s sVar = (me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.s) this.c;
        sVar.getClass();
        List listExecuteAsList = new me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.b(sVar, currentTimeMillis, me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.f.f26337a).executeAsList();
        ((Logger) this.f26311a.c.getD()).d("NavGraphDatabase", "deleteExpiredNavGraph: found " + listExecuteAsList.size() + " file paths");
        v vVar = this.f26311a;
        Iterator it = listExecuteAsList.iterator();
        while (it.hasNext()) {
            vVar.b.deleteFile((String) it.next());
        }
        ((me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.s) this.c).a(currentTimeMillis);
        return Unit.f24250a;
    }
}
