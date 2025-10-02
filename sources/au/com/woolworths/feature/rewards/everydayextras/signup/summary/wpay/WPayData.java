package au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.wallet.digipay.framesview.CardCaptureOptions;
import au.com.woolworths.base.wallet.digipay.framesview.FramesSDKConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/summary/wpay/WPayData;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WPayData {

    /* renamed from: a, reason: collision with root package name */
    public final FramesSDKConfig f6220a;
    public final CardCaptureOptions b;

    static {
        FramesSDKConfig.Companion companion = FramesSDKConfig.INSTANCE;
    }

    public WPayData(FramesSDKConfig framesSDKConfig, CardCaptureOptions cardCaptureOptions) {
        this.f6220a = framesSDKConfig;
        this.b = cardCaptureOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WPayData)) {
            return false;
        }
        WPayData wPayData = (WPayData) obj;
        return Intrinsics.c(this.f6220a, wPayData.f6220a) && Intrinsics.c(this.b, wPayData.b);
    }

    public final int hashCode() {
        FramesSDKConfig framesSDKConfig = this.f6220a;
        int iHashCode = (framesSDKConfig == null ? 0 : framesSDKConfig.hashCode()) * 31;
        CardCaptureOptions cardCaptureOptions = this.b;
        return iHashCode + (cardCaptureOptions != null ? cardCaptureOptions.hashCode() : 0);
    }

    public final String toString() {
        return "WPayData(framesSdkConfig=" + this.f6220a + ", cardCaptureOptions=" + this.b + ")";
    }
}
