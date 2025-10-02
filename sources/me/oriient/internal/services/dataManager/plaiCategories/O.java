package me.oriient.internal.services.dataManager.plaiCategories;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.services.plai.database.DbPlaiCategoriesStatistics;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* loaded from: classes7.dex */
public final class O extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25330a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(String str) {
        super(1);
        this.f25330a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PlaiSqlDatabase db = (PlaiSqlDatabase) obj;
        Intrinsics.h(db, "db");
        DbPlaiCategoriesStatistics dbPlaiCategoriesStatisticsExecuteAsOneOrNull = db.getPlaiCategoriesStatisticsQueries().getCategoriesStatistics(this.f25330a).executeAsOneOrNull();
        return dbPlaiCategoriesStatisticsExecuteAsOneOrNull == null ? new Outcome.Success(null) : OutcomeKt.toOutcomeSuccess(new Z(dbPlaiCategoriesStatisticsExecuteAsOneOrNull.getBuildingId(), dbPlaiCategoriesStatisticsExecuteAsOneOrNull.getLastUpdatedTimestampMillis()));
    }
}
