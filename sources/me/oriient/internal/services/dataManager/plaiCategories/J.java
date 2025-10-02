package me.oriient.internal.services.dataManager.plaiCategories;

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
import me.oriient.internal.services.plai.database.DbPlaiCategoriesStatistics;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* loaded from: classes7.dex */
public final class J extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f25325a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ S d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(S s, int i, Continuation continuation) {
        super(2, continuation);
        this.d = s;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        J j = new J(this.d, this.e, continuation);
        j.c = obj;
        return j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((PlaiSqlDatabase) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        S s;
        Iterator it;
        Unit unit;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.b;
        if (i == 0) {
            ResultKt.b(obj);
            List<DbPlaiCategoriesStatistics> listExecuteAsList = ((PlaiSqlDatabase) this.c).getPlaiCategoriesStatisticsQueries().getExpiredCategoriesStatistics(((TimeProvider) this.d.d.getD()).getCurrentTimeMillis() - TimeUnit.DAYS.toMillis(this.e)).executeAsList();
            s = this.d;
            it = listExecuteAsList.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f25325a;
            s = (S) this.c;
            ResultKt.b(obj);
        }
        do {
            boolean zHasNext = it.hasNext();
            unit = Unit.f24250a;
            if (!zHasNext) {
                return unit;
            }
            String buildingId = ((DbPlaiCategoriesStatistics) it.next()).getBuildingId();
            this.c = s;
            this.f25325a = it;
            this.b = 1;
            s.getClass();
            BuildersKt.c(s.f25334a, null, null, new K(new H(buildingId, null), s, null), 3);
        } while (unit != coroutineSingletons);
        return coroutineSingletons;
    }
}
