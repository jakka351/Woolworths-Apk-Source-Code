package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/QuickLinkHorizontalListData;", "Lau/com/woolworths/android/onesite/data/HorizontalListDataInterface;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QuickLinkHorizontalListData implements HorizontalListDataInterface {
    public final List d;

    public QuickLinkHorizontalListData(List list) {
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuickLinkHorizontalListData) && this.d.equals(((QuickLinkHorizontalListData) obj).d);
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    public final String getActionTitle() {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    public final String getDeepLink() {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    /* renamed from: getItems, reason: from getter */
    public final List getD() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    public final String getSubtitle() {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    public final String getTitle() {
        return null;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return a.l("QuickLinkHorizontalListData(title=null, subtitle=null, actionTitle=null, deepLink=null, items=", ")", this.d);
    }
}
