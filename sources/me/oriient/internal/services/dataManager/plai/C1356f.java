package me.oriient.internal.services.dataManager.plai;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.plai.database.DbPlaiStatistics;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* renamed from: me.oriient.internal.services.dataManager.plai.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1356f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f25298a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1364n d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356f(C1364n c1364n, int i, Continuation continuation) {
        super(2, continuation);
        this.d = c1364n;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1356f c1356f = new C1356f(this.d, this.e, continuation);
        c1356f.c = obj;
        return c1356f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1356f) create((PlaiSqlDatabase) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1364n c1364n;
        Iterator it;
        Unit unit;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.b;
        if (i == 0) {
            ResultKt.b(obj);
            List<DbPlaiStatistics> listExecuteAsList = ((PlaiSqlDatabase) this.c).getPlaiStatisticsQueries().getExpiredStatistics(((TimeProvider) this.d.d.getD()).getCurrentTimeMillis() - TimeUnit.DAYS.toMillis(this.e)).executeAsList();
            c1364n = this.d;
            it = listExecuteAsList.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f25298a;
            c1364n = (C1364n) this.c;
            ResultKt.b(obj);
        }
        do {
            boolean zHasNext = it.hasNext();
            unit = Unit.f24250a;
            if (!zHasNext) {
                return unit;
            }
            String buildingId = ((DbPlaiStatistics) it.next()).getBuildingId();
            this.c = c1364n;
            this.f25298a = it;
            this.b = 1;
            c1364n.getClass();
            BuildersKt.c(c1364n.f25306a, null, null, new C1357g(new C1354d(buildingId, null), c1364n, null), 3);
        } while (unit != coroutineSingletons);
        return coroutineSingletons;
    }
}
