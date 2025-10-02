package me.oriient.internal.services.dataManager.plaiCategories;

import com.squareup.sqldelight.TransactionWithoutReturn;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* loaded from: classes7.dex */
public final class G extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlaiSqlDatabase f25322a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(PlaiSqlDatabase plaiSqlDatabase, String str) {
        super(1);
        this.f25322a = plaiSqlDatabase;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransactionWithoutReturn transaction = (TransactionWithoutReturn) obj;
        Intrinsics.h(transaction, "$this$transaction");
        this.f25322a.getPlaiCategoriesQueries().removeBuildingCategories(this.b);
        this.f25322a.getPlaiCategoriesStatisticsQueries().removeBuildingCategoriesStatistics(this.b);
        return Unit.f24250a;
    }
}
