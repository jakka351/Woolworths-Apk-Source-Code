package au.com.woolworths.feature.shop.contentpage.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/analytics/ContentPageActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "GoogleAdBannerClick", "GoogleAdBannerImpression", "Lau/com/woolworths/feature/shop/contentpage/analytics/ContentPageActions$GoogleAdBannerClick;", "Lau/com/woolworths/feature/shop/contentpage/analytics/ContentPageActions$GoogleAdBannerImpression;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ContentPageActions implements Action {
    public final Screen d = ContentPageScreens.d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/analytics/ContentPageActions$GoogleAdBannerClick;", "Lau/com/woolworths/feature/shop/contentpage/analytics/ContentPageActions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GoogleAdBannerClick extends ContentPageActions {
        public static final GoogleAdBannerClick e = new GoogleAdBannerClick();
        public static final Category f = Category.y;
        public static final String g = "Promotion";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoogleAdBannerClick);
        }

        public final int hashCode() {
            return -475640536;
        }

        public final String toString() {
            return "GoogleAdBannerClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/analytics/ContentPageActions$GoogleAdBannerImpression;", "Lau/com/woolworths/feature/shop/contentpage/analytics/ContentPageActions;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GoogleAdBannerImpression extends ContentPageActions {
        public static final GoogleAdBannerImpression e = new GoogleAdBannerImpression();
        public static final Category f = Category.z;
        public static final String g = "Promotion";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoogleAdBannerImpression);
        }

        public final int hashCode() {
            return 1483984489;
        }

        public final String toString() {
            return "GoogleAdBannerImpression";
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
