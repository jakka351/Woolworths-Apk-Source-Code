package me.oriient.internal.services.dataManager.plai;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.services.plai.database.DbPlaiStatistics;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* renamed from: me.oriient.internal.services.dataManager.plai.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1361k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25303a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1361k(String str) {
        super(1);
        this.f25303a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PlaiSqlDatabase db = (PlaiSqlDatabase) obj;
        Intrinsics.h(db, "db");
        DbPlaiStatistics dbPlaiStatisticsExecuteAsOneOrNull = db.getPlaiStatisticsQueries().getStatistics(this.f25303a).executeAsOneOrNull();
        return dbPlaiStatisticsExecuteAsOneOrNull == null ? new Outcome.Success(null) : OutcomeKt.toOutcomeSuccess(new Z(dbPlaiStatisticsExecuteAsOneOrNull.getBuildingId(), dbPlaiStatisticsExecuteAsOneOrNull.getLastUpdatedTimestampMillis()));
    }
}
