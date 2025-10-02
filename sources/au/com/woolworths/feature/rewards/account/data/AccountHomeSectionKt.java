package au.com.woolworths.feature.rewards.account.data;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountHomeSectionKt {
    public static final boolean a(List list) {
        Intrinsics.h(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            List list3 = ((AccountHomeSection) it.next()).b;
            if (list3 != null) {
                List list4 = list3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.c(((AccountHomeOption) it2.next()).getC(), Boolean.TRUE)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
