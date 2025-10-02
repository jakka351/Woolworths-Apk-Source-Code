package au.com.woolworths.feature.rewards.account.sso;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract;", "", "Actions", "ViewState", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsMagicLinkContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions;", "", "OpenInChromeTab", "OpenInWebView", "RetryChatbotSessionId", "ForwardAccessTokenToWebview", "EndChat", "Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions$EndChat;", "Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions$ForwardAccessTokenToWebview;", "Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions$OpenInChromeTab;", "Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions$OpenInWebView;", "Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions$RetryChatbotSessionId;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions$EndChat;", "Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class EndChat extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final EndChat f5802a = new EndChat();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof EndChat);
            }

            public final int hashCode() {
                return 387707608;
            }

            public final String toString() {
                return "EndChat";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions$ForwardAccessTokenToWebview;", "Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ForwardAccessTokenToWebview extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5803a;

            public ForwardAccessTokenToWebview(String str) {
                this.f5803a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ForwardAccessTokenToWebview) && Intrinsics.c(this.f5803a, ((ForwardAccessTokenToWebview) obj).f5803a);
            }

            public final int hashCode() {
                return this.f5803a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ForwardAccessTokenToWebview(accessToken=", this.f5803a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions$OpenInChromeTab;", "Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenInChromeTab extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5804a;
            public final Map b;

            public OpenInChromeTab(String str, Map headers) {
                Intrinsics.h(headers, "headers");
                this.f5804a = str;
                this.b = headers;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenInChromeTab)) {
                    return false;
                }
                OpenInChromeTab openInChromeTab = (OpenInChromeTab) obj;
                return Intrinsics.c(this.f5804a, openInChromeTab.f5804a) && Intrinsics.c(this.b, openInChromeTab.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f5804a.hashCode() * 31);
            }

            public final String toString() {
                return "OpenInChromeTab(url=" + this.f5804a + ", headers=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions$OpenInWebView;", "Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenInWebView extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5805a;
            public final Map b;

            public OpenInWebView(String str, Map headers) {
                Intrinsics.h(headers, "headers");
                this.f5805a = str;
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
                return Intrinsics.c(this.f5805a, openInWebView.f5805a) && Intrinsics.c(this.b, openInWebView.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f5805a.hashCode() * 31);
            }

            public final String toString() {
                return "OpenInWebView(url=" + this.f5805a + ", headers=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions$RetryChatbotSessionId;", "Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RetryChatbotSessionId extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final RetryChatbotSessionId f5806a = new RetryChatbotSessionId();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RetryChatbotSessionId);
            }

            public final int hashCode() {
                return -463588945;
            }

            public final String toString() {
                return "RetryChatbotSessionId";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkContract$ViewState;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f5807a;
        public final String b;
        public final RewardsMagicLinkErrorState c;
        public final String d;

        public ViewState(boolean z, String str, RewardsMagicLinkErrorState rewardsMagicLinkErrorState, String str2) {
            this.f5807a = z;
            this.b = str;
            this.c = rewardsMagicLinkErrorState;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f5807a == viewState.f5807a && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && Intrinsics.c(this.d, viewState.d);
        }

        public final int hashCode() {
            int iC = androidx.camera.core.impl.b.c(Boolean.hashCode(this.f5807a) * 31, 31, this.b);
            RewardsMagicLinkErrorState rewardsMagicLinkErrorState = this.c;
            return this.d.hashCode() + ((iC + (rewardsMagicLinkErrorState == null ? 0 : rewardsMagicLinkErrorState.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbT = au.com.woolworths.android.onesite.a.t("ViewState(isLoading=", ", page=", this.b, ", errorState=", this.f5807a);
            sbT.append(this.c);
            sbT.append(", title=");
            sbT.append(this.d);
            sbT.append(")");
            return sbT.toString();
        }
    }
}
