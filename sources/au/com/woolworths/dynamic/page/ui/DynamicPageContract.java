package au.com.woolworths.dynamic.page.ui;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.dynamic.page.data.BottomSheetType;
import au.com.woolworths.dynamic.page.data.DynamicPageErrorState;
import au.com.woolworths.dynamic.page.data.DynamicPageFeedData;
import au.com.woolworths.dynamic.page.data.DynamicPageHeaderData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/dynamic/page/ui/DynamicPageContract;", "", "Actions", "ViewState", "Companion", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DynamicPageContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions;", "", "ShowShareSheet", "LaunchDeepLink", "LaunchLogin", "ShowCartScreen", "Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions$LaunchLogin;", "Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions$ShowCartScreen;", "Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions$ShowShareSheet;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5191a;

            public LaunchDeepLink(String deepLink) {
                Intrinsics.h(deepLink, "deepLink");
                this.f5191a = deepLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f5191a, ((LaunchDeepLink) obj).f5191a);
            }

            public final int hashCode() {
                return this.f5191a.hashCode();
            }

            public final String toString() {
                return a.h("LaunchDeepLink(deepLink=", this.f5191a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions$LaunchLogin;", "Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchLogin extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLogin f5192a = new LaunchLogin();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchLogin);
            }

            public final int hashCode() {
                return -1283026880;
            }

            public final String toString() {
                return "LaunchLogin";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions$ShowCartScreen;", "Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCartScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowCartScreen f5193a = new ShowCartScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowCartScreen);
            }

            public final int hashCode() {
                return 322905471;
            }

            public final String toString() {
                return "ShowCartScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions$ShowShareSheet;", "Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowShareSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5194a;

            public ShowShareSheet(String url) {
                Intrinsics.h(url, "url");
                this.f5194a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowShareSheet) && Intrinsics.c(this.f5194a, ((ShowShareSheet) obj).f5194a);
            }

            public final int hashCode() {
                return this.f5194a.hashCode();
            }

            public final String toString() {
                return a.h("ShowShareSheet(url=", this.f5194a, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Companion;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$ViewState;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f5195a;
        public final Integer b;
        public final DynamicPageFeedData c;
        public final DynamicPageErrorState d;
        public final BottomSheetType e;

        public /* synthetic */ ViewState(DynamicPageFeedData dynamicPageFeedData, DynamicPageErrorState dynamicPageErrorState, int i) {
            this((i & 1) == 0, (i & 2) != 0 ? null : 1, (i & 4) != 0 ? null : dynamicPageFeedData, (i & 8) != 0 ? null : dynamicPageErrorState, null);
        }

        public final String a() {
            DynamicPageHeaderData dynamicPageHeaderData;
            AnalyticsData analyticsData;
            String screenName;
            DynamicPageFeedData dynamicPageFeedData = this.c;
            if (dynamicPageFeedData != null && (analyticsData = dynamicPageFeedData.e) != null && (screenName = analyticsData.getScreenName()) != null) {
                return screenName;
            }
            Timber.f27013a.o(a.h("Missing analytics.screenName from BFF for campaign \"", (dynamicPageFeedData == null || (dynamicPageHeaderData = dynamicPageFeedData.f5185a) == null) ? null : dynamicPageHeaderData.f5187a, "\"; using fallback \"Campaign screen name missing\""), new Object[0]);
            return "Campaign screen name missing";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f5195a == viewState.f5195a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d && Intrinsics.c(this.e, viewState.e);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f5195a) * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            DynamicPageFeedData dynamicPageFeedData = this.c;
            int iHashCode3 = (iHashCode2 + (dynamicPageFeedData == null ? 0 : dynamicPageFeedData.hashCode())) * 31;
            DynamicPageErrorState dynamicPageErrorState = this.d;
            int iHashCode4 = (iHashCode3 + (dynamicPageErrorState == null ? 0 : dynamicPageErrorState.hashCode())) * 31;
            BottomSheetType bottomSheetType = this.e;
            return iHashCode4 + (bottomSheetType != null ? bottomSheetType.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f5195a + ", cartItemCount=" + this.b + ", feedData=" + this.c + ", errorState=" + this.d + ", visibleBottomSheet=" + this.e + ")";
        }

        public ViewState(boolean z, Integer num, DynamicPageFeedData dynamicPageFeedData, DynamicPageErrorState dynamicPageErrorState, BottomSheetType bottomSheetType) {
            this.f5195a = z;
            this.b = num;
            this.c = dynamicPageFeedData;
            this.d = dynamicPageErrorState;
            this.e = bottomSheetType;
        }
    }
}
