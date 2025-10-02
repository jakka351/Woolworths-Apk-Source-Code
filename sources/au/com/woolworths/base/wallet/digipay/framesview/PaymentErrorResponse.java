package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/PaymentErrorResponse;", "Lau/com/woolworths/base/wallet/digipay/framesview/CompleteResponse;", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class PaymentErrorResponse implements CompleteResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.d, new h(17))};

    /* renamed from: a, reason: collision with root package name */
    public final ThreeDSError f4683a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/PaymentErrorResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/PaymentErrorResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<PaymentErrorResponse> serializer() {
            return PaymentErrorResponse$$serializer.f4684a;
        }
    }

    public /* synthetic */ PaymentErrorResponse(int i, ThreeDSError threeDSError) {
        if (1 == (i & 1)) {
            this.f4683a = threeDSError;
        } else {
            PluginExceptionsKt.a(i, 1, PaymentErrorResponse$$serializer.f4684a.getB());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentErrorResponse) && this.f4683a == ((PaymentErrorResponse) obj).f4683a;
    }

    public final int hashCode() {
        return this.f4683a.hashCode();
    }

    public final String toString() {
        return "PaymentErrorResponse(threeDSError=" + this.f4683a + ")";
    }
}
