package au.com.woolworths.android.onesite.modules.checkout.common;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/common/BaseWindowExpiredDialogActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BaseWindowExpiredDialogActionData extends Action {
    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: a */
    default String getT() {
        return "Collection window unavailable";
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: b */
    default Category getS() {
        return Category.u;
    }
}
