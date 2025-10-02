package com.woolworths.scanlibrary.domain.login;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.g;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.woolworths.scanlibrary.base.UseCase;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.domain.device.DeviceRegistrationUC;
import com.woolworths.scanlibrary.domain.survey.SurveyManager;
import com.woolworths.scanlibrary.models.authentication.AuthResponse;
import com.woolworths.scanlibrary.models.authentication.AuthResponseKt;
import com.woolworths.scanlibrary.models.authentication.Banner;
import com.woolworths.scanlibrary.models.authentication.Request;
import com.woolworths.scanlibrary.models.authentication.guest.GuestLoginRequest;
import com.woolworths.scanlibrary.models.authentication.reward.RewardLoginAPIRequest;
import com.woolworths.scanlibrary.models.authentication.reward.RewardLoginRequest;
import com.woolworths.scanlibrary.models.cart.CartStatus;
import com.woolworths.scanlibrary.models.profile.ProfileResponse;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleJust;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/domain/login/SignInUC;", "Lcom/woolworths/scanlibrary/base/UseCase;", "Lcom/woolworths/scanlibrary/domain/login/SignInUC$RequestValues;", "Lcom/woolworths/scanlibrary/domain/login/SignInUC$ResponseValue;", "RequestValues", "GuestRequestValues", "ResponseValue", "AuthState", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SignInUC extends UseCase<RequestValues, ResponseValue> {
    public final FirebaseApp c;
    public final ScanNGoRepository d;
    public final DefaultLocalTokenProvider e;
    public final DeviceInfoProvider f;
    public final DeviceRegistrationUC g;
    public final UserConfigurations h;
    public final AuthenticatedUser i;
    public final SurveyManager j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/login/SignInUC$AuthState;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuthState {
        public static final AuthState d;
        public static final AuthState e;
        public static final AuthState f;
        public static final AuthState g;
        public static final AuthState h;
        public static final AuthState i;
        public static final AuthState j;
        public static final /* synthetic */ AuthState[] k;
        public static final /* synthetic */ EnumEntries l;

        static {
            AuthState authState = new AuthState("PENDING_AUTHENTICATION", 0);
            AuthState authState2 = new AuthState("PENDING_USER_TC_ACCEPTANCE", 1);
            d = authState2;
            AuthState authState3 = new AuthState("PENDING_PAYMENT_SETUP", 2);
            e = authState3;
            AuthState authState4 = new AuthState("NO_ACTIVE_CART", 3);
            f = authState4;
            AuthState authState5 = new AuthState("ACTIVE_CART", 4);
            g = authState5;
            AuthState authState6 = new AuthState("PENDING_TAP_OFF", 5);
            h = authState6;
            AuthState authState7 = new AuthState("NO_REWARDS_WITHOUT_SKIP", 6);
            i = authState7;
            AuthState authState8 = new AuthState("TRANSFERED_TO_POS", 7);
            j = authState8;
            AuthState[] authStateArr = {authState, authState2, authState3, authState4, authState5, authState6, authState7, authState8};
            k = authStateArr;
            l = EnumEntriesKt.a(authStateArr);
        }

        public static AuthState valueOf(String str) {
            return (AuthState) Enum.valueOf(AuthState.class, str);
        }

        public static AuthState[] values() {
            return (AuthState[]) k.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/login/SignInUC$GuestRequestValues;", "Lcom/woolworths/scanlibrary/domain/login/SignInUC$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GuestRequestValues extends RequestValues {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/login/SignInUC$RequestValues;", "Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class RequestValues implements UseCase.RequestValues {

        /* renamed from: a, reason: collision with root package name */
        public final String f21186a;
        public final byte[] b;
        public final String c;
        public final String d;
        public final boolean e;
        public final Banner f;
        public final boolean g;

        public RequestValues(boolean z) {
            Banner banner = Banner.ONLINE;
            Intrinsics.h(banner, "banner");
            this.f21186a = "";
            this.b = new byte[0];
            this.c = "";
            this.d = "";
            this.e = true;
            this.f = banner;
            this.g = z;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/login/SignInUC$ResponseValue;", "Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResponseValue implements UseCase.ResponseValue {

        /* renamed from: a, reason: collision with root package name */
        public final AuthState f21187a;
        public final ProfileResponse b;
        public final int c;

        public ResponseValue(AuthState authState, ProfileResponse profileResponse, int i) {
            Intrinsics.h(profileResponse, "profileResponse");
            this.f21187a = authState;
            this.b = profileResponse;
            this.c = i;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21188a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Banner.values().length];
            try {
                iArr[Banner.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Banner.REWARDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21188a = iArr;
            int[] iArr2 = new int[CartStatus.values().length];
            try {
                iArr2[CartStatus.PAID.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CartStatus.KIOSK_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CartStatus.KIOSK_CHECKOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CartStatus.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CartStatus.TRANSFERED_TO_POS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CartStatus.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CartStatus.OPEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CartStatus.CHECKOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CartStatus.INTERVENTIONED.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInUC(FirebaseApp firebaseApp, ScanNGoRepository scanNGoRepository, DefaultLocalTokenProvider defaultLocalTokenProvider, DeviceInfoProvider deviceInfoProvider, DeviceRegistrationUC deviceRegistrationUC, UserConfigurations userConfigurations, AuthenticatedUser authenticatedUser, SurveyManager surveyManager, Scheduler scheduler) {
        super(scheduler, true);
        Intrinsics.h(firebaseApp, "firebaseApp");
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.h(userConfigurations, "userConfigurations");
        Intrinsics.h(surveyManager, "surveyManager");
        this.c = firebaseApp;
        this.d = scanNGoRepository;
        this.e = defaultLocalTokenProvider;
        this.f = deviceInfoProvider;
        this.g = deviceRegistrationUC;
        this.h = userConfigurations;
        this.i = authenticatedUser;
        this.j = surveyManager;
    }

    @Override // com.woolworths.scanlibrary.base.UseCase
    public final Single a(UseCase.RequestValues requestValues) {
        RequestValues requestValues2 = (RequestValues) requestValues;
        Banner banner = requestValues2.f;
        boolean z = requestValues2.e;
        ScanNGoRepository scanNGoRepository = this.d;
        if (z) {
            return new SingleFlatMap(c((SingleSubscribeOn) scanNGoRepository.c(), requestValues2.g), new com.woolworths.scanlibrary.data.authentication.token.b(new a(this, 0), 17));
        }
        int i = WhenMappings.f21188a[banner.ordinal()];
        DeviceInfoProvider deviceInfoProvider = this.f;
        if (i == 1) {
            return new SingleFlatMap(new SingleFlatMap(new SingleFlatMap(scanNGoRepository.f21149a.f21163a.x(new Request(requestValues2.f21186a, new String(requestValues2.b, Charsets.f24671a), deviceInfoProvider.c(), banner)).h(scanNGoRepository.b), new com.woolworths.scanlibrary.data.authentication.token.b(new a(this, 2), 19)), new com.woolworths.scanlibrary.data.authentication.token.b(new b(this, requestValues2, 0), 20)), new com.woolworths.scanlibrary.data.authentication.token.b(new a(this, 3), 21));
        }
        if (i != 2) {
            return new SingleFlatMap(new SingleFlatMap(new SingleFlatMap(new SingleMap(scanNGoRepository.f21149a.f21163a.z(new GuestLoginRequest(deviceInfoProvider.c(), "", "")).h(scanNGoRepository.b), new com.woolworths.scanlibrary.data.authentication.token.b(new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(23), 26)), new com.woolworths.scanlibrary.data.authentication.token.b(new a(this, 6), 27)), new com.woolworths.scanlibrary.data.authentication.token.b(new b(this, requestValues2, 2), 16)), new com.woolworths.scanlibrary.data.authentication.token.b(new a(this, 1), 18));
        }
        RewardLoginRequest rewardLoginRequest = new RewardLoginRequest(requestValues2.c, requestValues2.d, deviceInfoProvider.c());
        return new SingleFlatMap(new SingleFlatMap(new SingleFlatMap(scanNGoRepository.f21149a.f21163a.s(rewardLoginRequest.getAuthcode(), YU.a.A(" Bearer ", rewardLoginRequest.getTempToken()), new RewardLoginAPIRequest(rewardLoginRequest.getDeviceInfo())).h(scanNGoRepository.b), new com.woolworths.scanlibrary.data.authentication.token.b(new a(this, 4), 22)), new com.woolworths.scanlibrary.data.authentication.token.b(new b(this, requestValues2, 1), 24)), new com.woolworths.scanlibrary.data.authentication.token.b(new a(this, 5), 25));
    }

    public final SingleFlatMap c(SingleSubscribeOn singleSubscribeOn, boolean z) {
        return new SingleFlatMap(singleSubscribeOn, new com.woolworths.scanlibrary.data.authentication.token.b(new au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.b(this, z, 4), 23));
    }

    public final SingleJust d(ResponseValue responseValue, boolean z) {
        Object objB = this.c.b(FirebaseMessaging.class);
        Intrinsics.f(objB, "null cannot be cast to non-null type com.google.firebase.messaging.FirebaseMessaging");
        ((FirebaseMessaging) objB).d().addOnCompleteListener(new g(this, z, 4));
        return Single.e(responseValue);
    }

    public final SingleJust e(AuthResponse authResponse) {
        String accessToken = authResponse.getAccessToken();
        DefaultLocalTokenProvider defaultLocalTokenProvider = this.e;
        defaultLocalTokenProvider.c(accessToken);
        defaultLocalTokenProvider.d(authResponse.getRefreshToken());
        String firstname = authResponse.getFirstname();
        AuthenticatedUser authenticatedUser = this.i;
        authenticatedUser.g(firstname);
        authenticatedUser.i(authResponse.getLastname());
        authenticatedUser.j(AuthResponseKt.getRewardsNumber(authResponse));
        authenticatedUser.f(authResponse.getEmail());
        return Single.e(authResponse);
    }
}
