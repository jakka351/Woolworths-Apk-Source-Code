package me.oriient.ipssdk.realtime.ofs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoryRecord;
import me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoryResult;
import me.oriient.ipssdk.api.models.IPSCategoryLocation;
import me.oriient.ipssdk.api.models.IPSCategoryLocationSearchResult;
import me.oriient.ipssdk.ips.IPSDebugging;

/* renamed from: me.oriient.ipssdk.realtime.ofs.o2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1699o2 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1699o2 f26121a = new C1699o2();

    public C1699o2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<PlaiCategoryResult> categories = (List) obj;
        Intrinsics.h(categories, "categories");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(categories, 10));
        for (PlaiCategoryResult plaiCategoryResult : categories) {
            String buildingId = plaiCategoryResult.getBuildingId();
            String categoryId = plaiCategoryResult.getCategoryId();
            IPSCategoryLocation iPSCategoryLocationCreateCategory = IPSDebugging.INSTANCE.createCategory(plaiCategoryResult.getPrimaryRecord());
            List<PlaiCategoryRecord> allRecords = plaiCategoryResult.getAllRecords();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(allRecords, 10));
            Iterator<T> it = allRecords.iterator();
            while (it.hasNext()) {
                arrayList2.add(IPSDebugging.INSTANCE.createCategory((PlaiCategoryRecord) it.next()));
            }
            arrayList.add(new IPSCategoryLocationSearchResult(buildingId, categoryId, iPSCategoryLocationCreateCategory, arrayList2));
        }
        return arrayList;
    }
}
