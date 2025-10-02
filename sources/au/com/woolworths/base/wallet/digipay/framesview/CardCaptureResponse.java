package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardCaptureResponse;", "Lau/com/woolworths/base/wallet/digipay/framesview/CompleteResponse;", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class CardCaptureResponse implements CompleteResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.d, new h(13)), null, null, null};

    /* renamed from: a, reason: collision with root package name */
    public final FraudResponse f4648a;
    public final PaymentInstrument b;
    public final Status c;
    public final String d;
    public final ThreeDSError e;
    public final String f;
    public final String g;
    public final String h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardCaptureResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/CardCaptureResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<CardCaptureResponse> serializer() {
            return CardCaptureResponse$$serializer.f4649a;
        }
    }

    public /* synthetic */ CardCaptureResponse(int i2, FraudResponse fraudResponse, PaymentInstrument paymentInstrument, Status status, String str, ThreeDSError threeDSError, String str2, String str3, String str4) {
        if ((i2 & 1) == 0) {
            this.f4648a = null;
        } else {
            this.f4648a = fraudResponse;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = paymentInstrument;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = status;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = threeDSError;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardCaptureResponse)) {
            return false;
        }
        CardCaptureResponse cardCaptureResponse = (CardCaptureResponse) obj;
        return Intrinsics.c(this.f4648a, cardCaptureResponse.f4648a) && Intrinsics.c(this.b, cardCaptureResponse.b) && Intrinsics.c(this.c, cardCaptureResponse.c) && Intrinsics.c(this.d, cardCaptureResponse.d) && this.e == cardCaptureResponse.e && Intrinsics.c(this.f, cardCaptureResponse.f) && Intrinsics.c(this.g, cardCaptureResponse.g) && Intrinsics.c(this.h, cardCaptureResponse.h);
    }

    public final int hashCode() {
        FraudResponse fraudResponse = this.f4648a;
        int iHashCode = (fraudResponse == null ? 0 : fraudResponse.hashCode()) * 31;
        PaymentInstrument paymentInstrument = this.b;
        int iHashCode2 = (iHashCode + (paymentInstrument == null ? 0 : paymentInstrument.hashCode())) * 31;
        Status status = this.c;
        int iHashCode3 = (iHashCode2 + (status == null ? 0 : status.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ThreeDSError threeDSError = this.e;
        int iHashCode5 = (iHashCode4 + (threeDSError == null ? 0 : threeDSError.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardCaptureResponse(fraudResponse=");
        sb.append(this.f4648a);
        sb.append(", paymentInstrument=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", stepUpToken=");
        sb.append(this.d);
        sb.append(", threeDSError=");
        sb.append(this.e);
        sb.append(", message=");
        sb.append(this.f);
        sb.append(", threeDSToken=");
        return androidx.constraintlayout.core.state.a.l(sb, this.g, ", itemId=", this.h, ")");
    }

    public CardCaptureResponse() {
        ThreeDSError threeDSError = ThreeDSError.f;
        this.f4648a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = threeDSError;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}
