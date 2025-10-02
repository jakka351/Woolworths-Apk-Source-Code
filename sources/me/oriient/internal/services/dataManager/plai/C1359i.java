package me.oriient.internal.services.dataManager.plai;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.services.plai.database.DbPlaiProducts;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* renamed from: me.oriient.internal.services.dataManager.plai.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1359i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25301a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359i(String str) {
        super(1);
        this.f25301a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PlaiSqlDatabase db = (PlaiSqlDatabase) obj;
        Intrinsics.h(db, "db");
        List<DbPlaiProducts> listExecuteAsList = db.getPlaiProductsQueries().getProducts(this.f25301a).executeAsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listExecuteAsList, 10));
        for (DbPlaiProducts dbPlaiProducts : listExecuteAsList) {
            arrayList.add(new PlaiRecord(dbPlaiProducts.getBuildingId(), dbPlaiProducts.getFloorId(), dbPlaiProducts.getCustomerTagId(), dbPlaiProducts.getX(), dbPlaiProducts.getY(), dbPlaiProducts.getConfidence(), dbPlaiProducts.getLastUsedScanTimeMillis(), dbPlaiProducts.getRegionIds(), dbPlaiProducts.getRegionNames()));
        }
        return OutcomeKt.toOutcomeSuccess(arrayList);
    }
}
