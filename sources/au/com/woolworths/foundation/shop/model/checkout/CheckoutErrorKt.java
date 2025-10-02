package au.com.woolworths.foundation.shop.model.checkout;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"model"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutErrorKt {
    public static final boolean a(List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        List list2 = list;
        boolean z = list2 instanceof Collection;
        if (z && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((CheckoutError) it.next()).c()) {
                if (z && list2.isEmpty()) {
                    return true;
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((CheckoutError) it2.next()).d()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
