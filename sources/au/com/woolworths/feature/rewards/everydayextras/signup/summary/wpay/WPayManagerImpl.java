package au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.appdata.EnvironmentName;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator;
import au.com.woolworths.base.wallet.digipay.DigipayToken;
import au.com.woolworths.base.wallet.digipay.DigipayUtils;
import au.com.woolworths.base.wallet.digipay.framesview.CardCaptureOptions;
import au.com.woolworths.base.wallet.digipay.framesview.FramesOptions;
import au.com.woolworths.base.wallet.digipay.framesview.FramesSDKConfig;
import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.foundation.bark.Bark;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/summary/wpay/WPayManagerImpl;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/summary/wpay/WPayManager;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class WPayManagerImpl implements WPayManager {

    /* renamed from: a, reason: collision with root package name */
    public final DigipayUtils f6222a;
    public final AppConfig b;

    public WPayManagerImpl(ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, DigipayUtils digipayUtils, AppConfig appConfig) {
        Intrinsics.h(appConfig, "appConfig");
        this.f6222a = digipayUtils;
        this.b = appConfig;
    }

    public final void a(boolean z, l lVar, h hVar, FramesWebView.Callback framesWebViewCallback) throws Exception {
        Boolean boolValueOf;
        DigipayToken digipayTokenA;
        Intrinsics.h(framesWebViewCallback, "framesWebViewCallback");
        DigipayUtils digipayUtils = this.f6222a;
        String str = (String) digipayUtils.f4636a.b().get("Authorization");
        String str2 = null;
        if (str != null) {
            DigipayToken digipayTokenA2 = digipayUtils.a(str);
            if (digipayTokenA2 != null) {
                boolValueOf = Boolean.valueOf(digipayTokenA2.b < 900);
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.c(boolValueOf, Boolean.TRUE) || z) {
                RewardsAppTokenAuthenticator rewardsAppTokenAuthenticator = digipayUtils.b;
                String strL = StringsKt.L("Bearer ", str);
                rewardsAppTokenAuthenticator.getClass();
                String strE = rewardsAppTokenAuthenticator.e(strL);
                if (strE != null && (digipayTokenA = digipayUtils.a(strE)) != null) {
                    str2 = digipayTokenA.f4635a;
                }
            } else if (digipayTokenA2 != null) {
                str2 = digipayTokenA2.f4635a;
            }
        }
        if (str2 == null) {
            hVar.invoke();
            return;
        }
        AppConfig appConfig = this.b;
        FramesSDKConfig framesSDKConfig = new FramesSDKConfig(appConfig.getS(), str2, a.g(appConfig.getR(), appConfig.w()));
        CardCaptureOptions cardCaptureOptions = new CardCaptureOptions(AppEnvironment.Production.INSTANCE.getName() == EnvironmentName.h, new FramesOptions(framesWebViewCallback, new WPayManagerImpl$createDigipayToken$1$cardCaptureOptions$1()));
        Bark.f8483a.a("WPay token created successfully");
        lVar.invoke(new WPayData(framesSDKConfig, cardCaptureOptions));
    }
}
