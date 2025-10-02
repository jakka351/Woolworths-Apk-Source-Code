package au.com.woolworths.base.wallet.digipay.framesview.cardcapture;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/cardcapture/FramesCardCaptureHtml;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FramesCardCaptureHtml {

    /* renamed from: a, reason: collision with root package name */
    public final String f4693a;
    public final String b;

    public FramesCardCaptureHtml(String str, String str2) {
        this.f4693a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FramesCardCaptureHtml)) {
            return false;
        }
        FramesCardCaptureHtml framesCardCaptureHtml = (FramesCardCaptureHtml) obj;
        return this.f4693a.equals(framesCardCaptureHtml.f4693a) && this.b.equals(framesCardCaptureHtml.b);
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() + (this.f4693a.hashCode() * 31)) * 31) - 1018595773) * 31) + 1125464345) * 31) - 221079991) * 31) + 2129626817;
    }

    public final String toString() {
        return a.j("FramesCardCaptureHtml(htmlString=", this.f4693a, ", cssString=", this.b, ", cardNumberElementId=cardNumberElement, cardExpiryElementId=cardExpiryElement, cardCVVElementId=cardCVVElement, ocrButtonId=ocr-button)");
    }
}
