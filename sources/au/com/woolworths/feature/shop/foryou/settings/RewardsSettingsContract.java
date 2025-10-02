package au.com.woolworths.feature.shop.foryou.settings;

import au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract;", "", "ViewState", "Actions", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsSettingsContract {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions;", "", "DisplayRedemptionSettings", "NavigateToUrl", "RemoveCardNetworkError", "RemoveCardServerError", "RemoveRewardsCards", "CloseRewards", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions$CloseRewards;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions$DisplayRedemptionSettings;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions$NavigateToUrl;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions$RemoveCardNetworkError;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions$RemoveCardServerError;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions$RemoveRewardsCards;", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions$CloseRewards;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions;", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CloseRewards extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseRewards f7138a = new CloseRewards();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions$DisplayRedemptionSettings;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions;", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DisplayRedemptionSettings extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final DisplayRedemptionSettings f7139a = new DisplayRedemptionSettings();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions$RemoveCardNetworkError;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions;", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class RemoveCardNetworkError extends Actions {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions$RemoveCardServerError;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions;", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class RemoveCardServerError extends Actions {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions$RemoveRewardsCards;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions;", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RemoveRewardsCards extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final RemoveRewardsCards f7141a = new RemoveRewardsCards();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions$NavigateToUrl;", "Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$Actions;", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7140a;
            public final RewardsSettingsActionData b;

            public NavigateToUrl(String str) {
                this.f7140a = str;
                this.b = null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NavigateToUrl)) {
                    return false;
                }
                NavigateToUrl navigateToUrl = (NavigateToUrl) obj;
                return Intrinsics.c(this.f7140a, navigateToUrl.f7140a) && this.b == navigateToUrl.b;
            }

            public final int hashCode() {
                int iHashCode = this.f7140a.hashCode() * 31;
                RewardsSettingsActionData rewardsSettingsActionData = this.b;
                return iHashCode + (rewardsSettingsActionData == null ? 0 : rewardsSettingsActionData.hashCode());
            }

            public final String toString() {
                return "NavigateToUrl(url=" + this.f7140a + ", actionData=" + this.b + ")";
            }

            public NavigateToUrl(String str, RewardsSettingsActionData rewardsSettingsActionData) {
                this.f7140a = str;
                this.b = rewardsSettingsActionData;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/settings/RewardsSettingsContract$ViewState;", "", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7142a;
        public final List b;

        public ViewState(ArrayList options, boolean z) {
            Intrinsics.h(options, "options");
            this.f7142a = z;
            this.b = options;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7142a == viewState.f7142a && Intrinsics.c(this.b, viewState.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.f7142a) * 31);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f7142a + ", options=" + this.b + ")";
        }
    }
}
