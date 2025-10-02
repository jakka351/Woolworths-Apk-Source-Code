package au.com.woolworths.feature.rewards.account.callback;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract;", "", "ViewState", "Actions", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsCallbackUrlContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract$Actions;", "", "Retry", "CloseScreen", "OpenInWebView", "Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract$Actions$OpenInWebView;", "Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract$Actions$Retry;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseScreen extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseScreen);
            }

            public final int hashCode() {
                return Boolean.hashCode(true);
            }

            public final String toString() {
                return "CloseScreen(success=true)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract$Actions$OpenInWebView;", "Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenInWebView extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5677a;
            public final Map b;

            public OpenInWebView(String str, Map headers) {
                Intrinsics.h(headers, "headers");
                this.f5677a = str;
                this.b = headers;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenInWebView)) {
                    return false;
                }
                OpenInWebView openInWebView = (OpenInWebView) obj;
                return Intrinsics.c(this.f5677a, openInWebView.f5677a) && Intrinsics.c(this.b, openInWebView.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f5677a.hashCode() * 31);
            }

            public final String toString() {
                return "OpenInWebView(url=" + this.f5677a + ", headers=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract$Actions$Retry;", "Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Retry extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Retry f5678a = new Retry();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/callback/RewardsCallbackUrlContract$ViewState;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f5679a;
        public final String b;
        public final String c;
        public final RewardsCallbackUrlErrorState d;

        public ViewState(boolean z, String str, String str2, RewardsCallbackUrlErrorState rewardsCallbackUrlErrorState) {
            this.f5679a = z;
            this.b = str;
            this.c = str2;
            this.d = rewardsCallbackUrlErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f5679a == viewState.f5679a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d;
        }

        public final int hashCode() {
            int iC = androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(Boolean.hashCode(this.f5679a) * 31, 31, this.b), 31, this.c);
            RewardsCallbackUrlErrorState rewardsCallbackUrlErrorState = this.d;
            return iC + (rewardsCallbackUrlErrorState == null ? 0 : rewardsCallbackUrlErrorState.hashCode());
        }

        public final String toString() {
            StringBuilder sbT = au.com.woolworths.android.onesite.a.t("ViewState(isLoading=", ", title=", this.b, ", url=", this.f5679a);
            sbT.append(this.c);
            sbT.append(", errorState=");
            sbT.append(this.d);
            sbT.append(")");
            return sbT.toString();
        }
    }
}
