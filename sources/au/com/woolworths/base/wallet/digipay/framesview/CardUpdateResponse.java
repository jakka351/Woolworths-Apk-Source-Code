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
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardUpdateResponse;", "Lau/com/woolworths/base/wallet/digipay/framesview/CompleteResponse;", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class CardUpdateResponse implements CompleteResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, LazyKt.a(LazyThreadSafetyMode.d, new h(14)), null};

    /* renamed from: a, reason: collision with root package name */
    public final FraudResponse f4654a;
    public final Integer b;
    public final Status c;
    public final ThreeDSError d;
    public final String e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardUpdateResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/CardUpdateResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<CardUpdateResponse> serializer() {
            return CardUpdateResponse$$serializer.f4655a;
        }
    }

    public /* synthetic */ CardUpdateResponse(int i, FraudResponse fraudResponse, Integer num, Status status, ThreeDSError threeDSError, String str) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.a(i, 1, CardUpdateResponse$$serializer.f4655a.getB());
            throw null;
        }
        this.f4654a = fraudResponse;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = status;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = threeDSError;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardUpdateResponse)) {
            return false;
        }
        CardUpdateResponse cardUpdateResponse = (CardUpdateResponse) obj;
        return Intrinsics.c(this.f4654a, cardUpdateResponse.f4654a) && Intrinsics.c(this.b, cardUpdateResponse.b) && Intrinsics.c(this.c, cardUpdateResponse.c) && this.d == cardUpdateResponse.d && Intrinsics.c(this.e, cardUpdateResponse.e);
    }

    public final int hashCode() {
        int iHashCode = this.f4654a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Status status = this.c;
        int iHashCode3 = (iHashCode2 + (status == null ? 0 : status.hashCode())) * 31;
        ThreeDSError threeDSError = this.d;
        int iHashCode4 = (iHashCode3 + (threeDSError == null ? 0 : threeDSError.hashCode())) * 31;
        String str = this.e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardUpdateResponse(fraudResponse=");
        sb.append(this.f4654a);
        sb.append(", itemId=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", threeDSError=");
        sb.append(this.d);
        sb.append(", stepUpToken=");
        return YU.a.o(sb, this.e, ")");
    }
}
