package me.oriient.internal.services.dataManager.plaiCategories;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.services.plai.database.DbPlaiCategories;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* loaded from: classes7.dex */
public final class M extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25328a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(String str, S s) {
        super(1);
        this.f25328a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PlaiSqlDatabase db = (PlaiSqlDatabase) obj;
        Intrinsics.h(db, "db");
        List<DbPlaiCategories> listExecuteAsList = db.getPlaiCategoriesQueries().getCategories(this.f25328a).executeAsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listExecuteAsList, 10));
        for (DbPlaiCategories dbPlaiCategories : listExecuteAsList) {
            arrayList.add(new PlaiCategoryRecord(dbPlaiCategories.getBuildingId(), dbPlaiCategories.getFloorId(), dbPlaiCategories.getCategoryName(), dbPlaiCategories.getCategoryId(), dbPlaiCategories.getBottomLeftX(), dbPlaiCategories.getBottomLeftY(), dbPlaiCategories.getTopRightX(), dbPlaiCategories.getTopRightY(), dbPlaiCategories.getCategoryArea(), dbPlaiCategories.isAppropriateSize(), dbPlaiCategories.getNumberOfProductsWithinArea(), dbPlaiCategories.getLastUsedScanTimeMillis()));
        }
        return OutcomeKt.toOutcomeSuccess(arrayList);
    }
}
