package au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal;

import android.content.Intent;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import au.com.woolworths.sdui.shop.broadcastbanner.BroadcastBannerKt$BroadcastBanner$lambda$4$lambda$3$$inlined$onDispose$1;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutDetailsActions;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActivity;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.domain.login.SignInUC;
import com.woolworths.scanlibrary.domain.survey.SurveyManager;
import com.woolworths.scanlibrary.models.authentication.AuthResponse;
import com.woolworths.scanlibrary.models.authentication.AuthResponseKt;
import com.woolworths.scanlibrary.models.authentication.Banner;
import com.woolworths.scanlibrary.models.profile.KioskFlags;
import com.woolworths.scanlibrary.models.profile.ProfileResponse;
import com.woolworths.scanlibrary.models.profile.Status;
import com.woolworths.scanlibrary.models.profile.Storeinfo;
import com.woolworths.scanlibrary.models.profile.Survey;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import io.reactivex.Single;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(Object obj, boolean z, int i) {
        this.d = i;
        this.f = obj;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function0 function0;
        String rewardsNumber;
        String bannerName;
        SignInUC.AuthState authState;
        Banner banner;
        String email;
        Banner banner2;
        switch (this.d) {
            case 0:
                String str = (String) this.f;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                if (str != null && this.e) {
                    SemanticsPropertiesKt.t(semantics, str);
                }
                return Unit.f24250a;
            case 1:
                Function0 function02 = (Function0) this.f;
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                if (this.e) {
                    SemanticsPropertiesKt.h(semantics2, "navigate", new k(2, function02));
                }
                return Unit.f24250a;
            case 2:
                MutableState mutableState = (MutableState) this.f;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                if (((Function0) mutableState.getD()) != null && this.e && (function0 = (Function0) mutableState.getD()) != null) {
                    function0.invoke();
                }
                return new BroadcastBannerKt$BroadcastBanner$lambda$4$lambda$3$$inlined$onDispose$1();
            case 3:
                CheckoutContentFragment checkoutContentFragment = (CheckoutContentFragment) this.f;
                Function0 dismiss = (Function0) obj;
                Intrinsics.h(dismiss, "dismiss");
                if (this.e) {
                    checkoutContentFragment.I1().c(CheckoutDetailsActions.IdVerificationRetry.e);
                } else {
                    checkoutContentFragment.I1().c(CheckoutDetailsActions.IdVerificationStart.e);
                }
                dismiss.invoke();
                checkoutContentFragment.k.a(new Intent(checkoutContentFragment.requireActivity(), (Class<?>) IdVerificationActivity.class), null);
                return Unit.f24250a;
            default:
                SignInUC signInUC = (SignInUC) this.f;
                ProfileResponse response = (ProfileResponse) obj;
                Intrinsics.h(response, "response");
                Status status = response.getStatus();
                AuthResponse profile = response.getProfile();
                KioskFlags kioskFlags = response.getKioskFlags();
                if (kioskFlags == null) {
                    kioskFlags = new KioskFlags(false, false, false, false, false, 31, null);
                }
                if (response.getSurvey() != null) {
                    SurveyManager surveyManager = signInUC.j;
                    Survey survey = response.getSurvey();
                    surveyManager.getClass();
                    Intrinsics.h(survey, "survey");
                    surveyManager.f21206a = survey;
                }
                AuthenticatedUser authenticatedUser = signInUC.i;
                DeviceInfoProvider deviceInfoProvider = signInUC.f;
                UserConfigurations userConfigurations = signInUC.h;
                String str2 = "";
                if (profile == null || (rewardsNumber = AuthResponseKt.getRewardsNumber(profile)) == null) {
                    rewardsNumber = "";
                }
                authenticatedUser.j(rewardsNumber);
                authenticatedUser.h(status.getIspaymentadded());
                Boolean isskippedrewardsadd = status.getIsskippedrewardsadd();
                authenticatedUser.d.setValue(authenticatedUser, AuthenticatedUser.i[3], Boolean.valueOf(isskippedrewardsadd != null ? isskippedrewardsadd.booleanValue() : false));
                authenticatedUser.d(status.getIstncaccepted());
                if (profile == null || (banner2 = profile.getBanner()) == null || (bannerName = banner2.getBannerName()) == null) {
                    bannerName = Banner.REWARDS.getBannerName();
                }
                authenticatedUser.k(bannerName);
                if (profile != null && (email = profile.getEmail()) != null) {
                    str2 = email;
                }
                authenticatedUser.f(str2);
                if (status.getIstncaccepted()) {
                    if (Intrinsics.c((profile == null || (banner = profile.getBanner()) == null) ? null : banner.getBannerName(), Banner.GUEST.getBannerName())) {
                        userConfigurations.e.setValue(userConfigurations, UserConfigurations.k[5], Integer.valueOf(deviceInfoProvider.getAppVersionCode()));
                        userConfigurations.b(deviceInfoProvider.getAppVersionName());
                        authenticatedUser.g(profile.getFirstname());
                        authenticatedUser.i(profile.getLastname());
                        authenticatedUser.f(profile.getEmail());
                    }
                }
                Boolean isrewardsavailable = status.getIsrewardsavailable();
                Boolean bool = Boolean.FALSE;
                if (!Intrinsics.c(isrewardsavailable, bool) || !Intrinsics.c(status.getIsskippedrewardsadd(), bool)) {
                    if (status.getIstncaccepted()) {
                        switch (SignInUC.WhenMappings.b[status.getStatus().ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                authState = SignInUC.AuthState.h;
                                break;
                            case 5:
                                authState = SignInUC.AuthState.j;
                                break;
                            case 6:
                                if (!kioskFlags.isBagCheckCompleted()) {
                                    authState = SignInUC.AuthState.h;
                                    break;
                                } else {
                                    authState = SignInUC.AuthState.f;
                                    break;
                                }
                            case 7:
                            case 8:
                            case 9:
                                Storeinfo storeinfo = response.getStoreinfo();
                                no = storeinfo != null ? storeinfo.getNo() : -1;
                                authState = SignInUC.AuthState.g;
                                break;
                            default:
                                if (!status.getIspaymentadded() && !this.e) {
                                    authState = SignInUC.AuthState.e;
                                    break;
                                } else {
                                    authState = SignInUC.AuthState.f;
                                    break;
                                }
                                break;
                        }
                    } else {
                        authState = SignInUC.AuthState.d;
                    }
                } else {
                    authState = SignInUC.AuthState.i;
                }
                return Single.e(new SignInUC.ResponseValue(authState, response, no));
        }
    }

    public /* synthetic */ b(boolean z, Object obj, int i) {
        this.d = i;
        this.e = z;
        this.f = obj;
    }
}
