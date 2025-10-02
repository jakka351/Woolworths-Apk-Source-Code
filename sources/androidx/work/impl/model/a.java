package androidx.work.impl.model;

import androidx.arch.core.util.Function;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function {
    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        List list = (List) obj;
        String str = WorkSpec.y;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkSpec.WorkInfoPojo) it.next()).a());
        }
        return arrayList;
    }
}
