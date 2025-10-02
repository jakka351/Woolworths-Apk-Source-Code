package au.com.woolworths.shop.checkout.domain.model;

import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LegacyNotificationsKt$sortByPriority$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = LegacyNotificationsKt.f10619a;
        Integer num = (Integer) LegacyNotificationsKt.a(list).get(Integer.valueOf(((CheckoutLegacyErrors) obj).f10563a));
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        Integer num2 = (Integer) LegacyNotificationsKt.a(list).get(Integer.valueOf(((CheckoutLegacyErrors) obj2).f10563a));
        return ComparisonsKt.a(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
    }
}
