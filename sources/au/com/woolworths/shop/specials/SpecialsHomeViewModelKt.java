package au.com.woolworths.shop.specials;

import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.PromotionCard;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"specials_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SpecialsHomeViewModelKt {
    public static final boolean a(HorizontalListData horizontalListData) {
        List<Object> h = horizontalListData.getH();
        if ((h instanceof Collection) && h.isEmpty()) {
            return false;
        }
        Iterator<T> it = h.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof ProductCard) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(HorizontalListData horizontalListData) {
        List<Object> h = horizontalListData.getH();
        if ((h instanceof Collection) && h.isEmpty()) {
            return false;
        }
        Iterator<T> it = h.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof PromotionCard) {
                return true;
            }
        }
        return false;
    }
}
