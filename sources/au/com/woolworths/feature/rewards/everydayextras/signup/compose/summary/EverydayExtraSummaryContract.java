package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.wallet.digipay.framesview.CardDetails;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSubscribeAlertDialog;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayData;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayError;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayLoadingState;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract;", "", "Action", "ViewState", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtraSummaryContract {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action;", "", "ClearWPayFramesForm", "SubmitWPayFramesForm", "ShowErrorAlert", "ShowSubscribeAlert", "ScanCard", "RequestCameraPermission", "ShowCameraPermissionRationale", "ShowGoogleWalletScanner", "ScrollToCardPayment", "InjectCardDetails", "OpenUrl", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ClearWPayFramesForm;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$InjectCardDetails;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$OpenUrl;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$RequestCameraPermission;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ScanCard;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ScrollToCardPayment;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ShowCameraPermissionRationale;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ShowErrorAlert;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ShowGoogleWalletScanner;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ShowSubscribeAlert;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$SubmitWPayFramesForm;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ClearWPayFramesForm;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ClearWPayFramesForm implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ClearWPayFramesForm f6120a = new ClearWPayFramesForm();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ClearWPayFramesForm);
            }

            public final int hashCode() {
                return -1268995530;
            }

            public final String toString() {
                return "ClearWPayFramesForm";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$InjectCardDetails;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class InjectCardDetails implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final CardDetails f6121a;

            public InjectCardDetails(CardDetails cardDetails) {
                Intrinsics.h(cardDetails, "cardDetails");
                this.f6121a = cardDetails;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InjectCardDetails) && Intrinsics.c(this.f6121a, ((InjectCardDetails) obj).f6121a);
            }

            public final int hashCode() {
                return this.f6121a.hashCode();
            }

            public final String toString() {
                return "InjectCardDetails(cardDetails=" + this.f6121a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$OpenUrl;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6122a;

            public OpenUrl(String str) {
                this.f6122a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f6122a, ((OpenUrl) obj).f6122a);
            }

            public final int hashCode() {
                return this.f6122a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f6122a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$RequestCameraPermission;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RequestCameraPermission implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final RequestCameraPermission f6123a = new RequestCameraPermission();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequestCameraPermission);
            }

            public final int hashCode() {
                return 2064611569;
            }

            public final String toString() {
                return "RequestCameraPermission";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ScanCard;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ScanCard implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ScanCard f6124a = new ScanCard();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ScanCard);
            }

            public final int hashCode() {
                return -1955202177;
            }

            public final String toString() {
                return "ScanCard";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ScrollToCardPayment;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ScrollToCardPayment implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ScrollToCardPayment f6125a = new ScrollToCardPayment();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ScrollToCardPayment);
            }

            public final int hashCode() {
                return 888092156;
            }

            public final String toString() {
                return "ScrollToCardPayment";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ShowCameraPermissionRationale;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCameraPermissionRationale implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowCameraPermissionRationale f6126a = new ShowCameraPermissionRationale();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowCameraPermissionRationale);
            }

            public final int hashCode() {
                return 1338820340;
            }

            public final String toString() {
                return "ShowCameraPermissionRationale";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ShowErrorAlert;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowErrorAlert implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final int f6127a;
            public final int b;

            public ShowErrorAlert(int i, int i2) {
                this.f6127a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowErrorAlert)) {
                    return false;
                }
                ShowErrorAlert showErrorAlert = (ShowErrorAlert) obj;
                return this.f6127a == showErrorAlert.f6127a && this.b == showErrorAlert.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.f6127a) * 31);
            }

            public final String toString() {
                return androidx.camera.core.impl.b.j(this.f6127a, this.b, "ShowErrorAlert(title=", ", message=", ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ShowGoogleWalletScanner;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowGoogleWalletScanner implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowGoogleWalletScanner f6128a = new ShowGoogleWalletScanner();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowGoogleWalletScanner);
            }

            public final int hashCode() {
                return -899726019;
            }

            public final String toString() {
                return "ShowGoogleWalletScanner";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$ShowSubscribeAlert;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSubscribeAlert implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final EverydayExtraSubscribeAlertDialog f6129a;

            public ShowSubscribeAlert(EverydayExtraSubscribeAlertDialog everydayExtraSubscribeAlertDialog) {
                this.f6129a = everydayExtraSubscribeAlertDialog;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSubscribeAlert) && Intrinsics.c(this.f6129a, ((ShowSubscribeAlert) obj).f6129a);
            }

            public final int hashCode() {
                return this.f6129a.hashCode();
            }

            public final String toString() {
                return "ShowSubscribeAlert(alertDialog=" + this.f6129a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action$SubmitWPayFramesForm;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SubmitWPayFramesForm implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final SubmitWPayFramesForm f6130a = new SubmitWPayFramesForm();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SubmitWPayFramesForm);
            }

            public final int hashCode() {
                return 480700837;
            }

            public final String toString() {
                return "SubmitWPayFramesForm";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState;", "", "Content", "Loading", "Error", "ServiceMessage", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState$ServiceMessage;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final EverydayExtrasSummaryFeed f6131a;
            public final boolean b;
            public final WPayLoadingState c;
            public final WPayData d;
            public final WPayError e;
            public final boolean f;
            public final boolean g;
            public final boolean h;
            public final CardDetails i;
            public final RewardsServiceMessage j;

            public /* synthetic */ Content(EverydayExtrasSummaryFeed everydayExtrasSummaryFeed, WPayLoadingState wPayLoadingState, RewardsServiceMessage rewardsServiceMessage, int i) {
                this(everydayExtrasSummaryFeed, false, wPayLoadingState, null, null, false, false, false, null, rewardsServiceMessage);
            }

            public static Content c(Content content, EverydayExtrasSummaryFeed everydayExtrasSummaryFeed, boolean z, WPayLoadingState wPayLoadingState, WPayData wPayData, WPayError wPayError, boolean z2, boolean z3, boolean z4, CardDetails cardDetails, RewardsServiceMessage rewardsServiceMessage, int i) {
                if ((i & 1) != 0) {
                    everydayExtrasSummaryFeed = content.f6131a;
                }
                EverydayExtrasSummaryFeed summaryFeed = everydayExtrasSummaryFeed;
                if ((i & 2) != 0) {
                    z = content.b;
                }
                boolean z5 = z;
                if ((i & 4) != 0) {
                    wPayLoadingState = content.c;
                }
                WPayLoadingState wPayLoadingState2 = wPayLoadingState;
                if ((i & 8) != 0) {
                    wPayData = content.d;
                }
                WPayData wPayData2 = wPayData;
                WPayError wPayError2 = (i & 16) != 0 ? content.e : wPayError;
                boolean z6 = (i & 32) != 0 ? content.f : z2;
                boolean z7 = (i & 64) != 0 ? content.g : z3;
                boolean z8 = (i & 128) != 0 ? content.h : z4;
                CardDetails cardDetails2 = (i & 256) != 0 ? content.i : cardDetails;
                RewardsServiceMessage rewardsServiceMessage2 = (i & 512) != 0 ? content.j : rewardsServiceMessage;
                content.getClass();
                Intrinsics.h(summaryFeed, "summaryFeed");
                Intrinsics.h(wPayLoadingState2, "wPayLoadingState");
                return new Content(summaryFeed, z5, wPayLoadingState2, wPayData2, wPayError2, z6, z7, z8, cardDetails2, rewardsServiceMessage2);
            }

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState
            public final int a() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.c(this.f6131a, content.f6131a) && this.b == content.b && this.c == content.c && Intrinsics.c(this.d, content.d) && Intrinsics.c(this.e, content.e) && this.f == content.f && this.g == content.g && this.h == content.h && Intrinsics.c(this.i, content.i) && Intrinsics.c(this.j, content.j);
            }

            public final int hashCode() {
                int iHashCode = (this.c.hashCode() + androidx.camera.core.impl.b.e(this.f6131a.hashCode() * 31, 31, this.b)) * 31;
                WPayData wPayData = this.d;
                int iHashCode2 = (iHashCode + (wPayData == null ? 0 : wPayData.hashCode())) * 31;
                WPayError wPayError = this.e;
                int iE = androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((iHashCode2 + (wPayError == null ? 0 : wPayError.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
                CardDetails cardDetails = this.i;
                int iHashCode3 = (iE + (cardDetails == null ? 0 : cardDetails.hashCode())) * 31;
                RewardsServiceMessage rewardsServiceMessage = this.j;
                return iHashCode3 + (rewardsServiceMessage != null ? rewardsServiceMessage.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(summaryFeed=");
                sb.append(this.f6131a);
                sb.append(", summaryFeedReload=");
                sb.append(this.b);
                sb.append(", wPayLoadingState=");
                sb.append(this.c);
                sb.append(", wPayData=");
                sb.append(this.d);
                sb.append(", wPayError=");
                sb.append(this.e);
                sb.append(", subscriptionSubmitting=");
                sb.append(this.f);
                sb.append(", userAgreementChecked=");
                au.com.woolworths.android.onesite.a.D(sb, this.g, ", showUserAgreementError=", this.h, ", pendingInjectionScannedCardDetails=");
                sb.append(this.i);
                sb.append(", partialServiceMessage=");
                sb.append(this.j);
                sb.append(")");
                return sb.toString();
            }

            public Content(EverydayExtrasSummaryFeed summaryFeed, boolean z, WPayLoadingState wPayLoadingState, WPayData wPayData, WPayError wPayError, boolean z2, boolean z3, boolean z4, CardDetails cardDetails, RewardsServiceMessage rewardsServiceMessage) {
                Intrinsics.h(summaryFeed, "summaryFeed");
                this.f6131a = summaryFeed;
                this.b = z;
                this.c = wPayLoadingState;
                this.d = wPayData;
                this.e = wPayError;
                this.f = z2;
                this.g = z3;
                this.h = z4;
                this.i = cardDetails;
                this.j = rewardsServiceMessage;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageError f6132a;

            public Error(FullPageError fullPageError) {
                this.f6132a = fullPageError;
            }

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState
            public final int a() {
                return 2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f6132a, ((Error) obj).f6132a);
            }

            public final int hashCode() {
                return this.f6132a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f6132a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f6133a = new Loading();

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState
            public final int a() {
                return 1;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 2106177300;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState$ServiceMessage;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/summary/EverydayExtraSummaryContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ServiceMessage implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final RewardsServiceMessage f6134a;

            static {
                RewardsServiceMessage.Companion companion = RewardsServiceMessage.INSTANCE;
            }

            public ServiceMessage(RewardsServiceMessage serviceMessage) {
                Intrinsics.h(serviceMessage, "serviceMessage");
                this.f6134a = serviceMessage;
            }

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState
            public final int a() {
                return 3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ServiceMessage) && Intrinsics.c(this.f6134a, ((ServiceMessage) obj).f6134a);
            }

            public final int hashCode() {
                return this.f6134a.hashCode();
            }

            public final String toString() {
                return "ServiceMessage(serviceMessage=" + this.f6134a + ")";
            }
        }

        int a();

        default Content b() {
            if (this instanceof Content) {
                return (Content) this;
            }
            return null;
        }
    }
}
