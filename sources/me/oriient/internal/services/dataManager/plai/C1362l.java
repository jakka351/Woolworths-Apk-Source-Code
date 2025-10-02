package me.oriient.internal.services.dataManager.plai;

import com.squareup.sqldelight.TransactionWithoutReturn;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* renamed from: me.oriient.internal.services.dataManager.plai.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1362l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlaiSqlDatabase f25304a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ C1364n d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1362l(PlaiSqlDatabase plaiSqlDatabase, String str, List list, C1364n c1364n) {
        super(1);
        this.f25304a = plaiSqlDatabase;
        this.b = str;
        this.c = list;
        this.d = c1364n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransactionWithoutReturn transaction = (TransactionWithoutReturn) obj;
        Intrinsics.h(transaction, "$this$transaction");
        this.f25304a.getPlaiProductsQueries().removeBuildingProducts(this.b);
        List<PlaiRecord> list = this.c;
        PlaiSqlDatabase plaiSqlDatabase = this.f25304a;
        for (PlaiRecord plaiRecord : list) {
            plaiSqlDatabase.getPlaiProductsQueries().upsertProducts(plaiRecord.getBuildingId(), plaiRecord.getFloorId(), plaiRecord.getCustomerTagId(), plaiRecord.getX(), plaiRecord.getY(), plaiRecord.getConfidence(), plaiRecord.getLastUsedScanTime(), plaiRecord.getRegionIds(), plaiRecord.getRegionNames());
        }
        this.f25304a.getPlaiStatisticsQueries().upsertStatistics(this.b, ((TimeProvider) this.d.d.getD()).getCurrentTimeMillis());
        return Unit.f24250a;
    }
}
