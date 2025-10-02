package me.oriient.ipssdk.realtime.ofs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.plai.PlaiProductResult;
import me.oriient.internal.services.dataManager.plai.PlaiRecord;
import me.oriient.ipssdk.api.models.IPSProductLocation;
import me.oriient.ipssdk.api.models.IPSProductLocationSearchResult;
import me.oriient.ipssdk.ips.IPSDebugging;

/* renamed from: me.oriient.ipssdk.realtime.ofs.q2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1711q2 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1711q2 f26133a = new C1711q2();

    public C1711q2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<PlaiProductResult> plaiRecords = (List) obj;
        Intrinsics.h(plaiRecords, "plaiRecords");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(plaiRecords, 10));
        for (PlaiProductResult plaiProductResult : plaiRecords) {
            String buildingId = plaiProductResult.getBuildingId();
            String customerTagId = plaiProductResult.getCustomerTagId();
            IPSProductLocation iPSProductLocationCreateProduct = IPSDebugging.INSTANCE.createProduct(plaiProductResult.getPrimaryRecord());
            List<PlaiRecord> allRecords = plaiProductResult.getAllRecords();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(allRecords, 10));
            Iterator<T> it = allRecords.iterator();
            while (it.hasNext()) {
                arrayList2.add(IPSDebugging.INSTANCE.createProduct((PlaiRecord) it.next()));
            }
            arrayList.add(new IPSProductLocationSearchResult(buildingId, customerTagId, iPSProductLocationCreateProduct, arrayList2));
        }
        return arrayList;
    }
}
