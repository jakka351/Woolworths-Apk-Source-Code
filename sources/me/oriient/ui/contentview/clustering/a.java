package me.oriient.ui.contentview.clustering;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public abstract class a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list, Function2 function2) {
        Object next;
        ArrayList arrayListZ = CollectionsKt.Z(new ArrayList());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Clusterable clusterable = (Clusterable) it.next();
            Iterator it2 = arrayListZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((Boolean) function2.invoke(clusterable, (List) next)).booleanValue()) {
                    break;
                }
            }
            List list2 = (List) next;
            if (list2 == null) {
                arrayListZ.add(CollectionsKt.Z(clusterable));
            } else {
                list2.add(clusterable);
            }
        }
        return arrayListZ;
    }
}
