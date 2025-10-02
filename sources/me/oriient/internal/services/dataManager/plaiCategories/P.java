package me.oriient.internal.services.dataManager.plaiCategories;

import com.squareup.sqldelight.TransactionWithoutReturn;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* loaded from: classes7.dex */
public final class P extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlaiSqlDatabase f25331a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ S d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(PlaiSqlDatabase plaiSqlDatabase, String str, List list, S s) {
        super(1);
        this.f25331a = plaiSqlDatabase;
        this.b = str;
        this.c = list;
        this.d = s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransactionWithoutReturn transaction = (TransactionWithoutReturn) obj;
        Intrinsics.h(transaction, "$this$transaction");
        this.f25331a.getPlaiCategoriesQueries().removeBuildingCategories(this.b);
        List<PlaiCategoryRecord> list = this.c;
        PlaiSqlDatabase plaiSqlDatabase = this.f25331a;
        for (PlaiCategoryRecord plaiCategoryRecord : list) {
            plaiSqlDatabase.getPlaiCategoriesQueries().upsertCategories(plaiCategoryRecord.getBuildingId(), plaiCategoryRecord.getFloorId(), plaiCategoryRecord.getCategoryName(), plaiCategoryRecord.getCategoryId(), plaiCategoryRecord.getBottomLeftX(), plaiCategoryRecord.getBottomLeftY(), plaiCategoryRecord.getTopRightX(), plaiCategoryRecord.getTopRightY(), plaiCategoryRecord.getCategoryArea(), plaiCategoryRecord.isAppropriateSize(), plaiCategoryRecord.getNumberOfProductsWithinArea(), plaiCategoryRecord.getLastUsedScanTime());
        }
        this.f25331a.getPlaiCategoriesStatisticsQueries().upsertCategoriesStatistics(this.b, ((TimeProvider) this.d.d.getD()).getCurrentTimeMillis());
        return Unit.f24250a;
    }
}
