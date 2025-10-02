package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/EnrollmentResponse;", "", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class EnrollmentResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.d, new h(15))};

    /* renamed from: a, reason: collision with root package name */
    public final EnrollmentResponseStatus f4664a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/EnrollmentResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/EnrollmentResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<EnrollmentResponse> serializer() {
            return EnrollmentResponse$$serializer.f4665a;
        }
    }

    public /* synthetic */ EnrollmentResponse(int i, EnrollmentResponseStatus enrollmentResponseStatus) {
        if ((i & 1) == 0) {
            this.f4664a = null;
        } else {
            this.f4664a = enrollmentResponseStatus;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EnrollmentResponse) && this.f4664a == ((EnrollmentResponse) obj).f4664a;
    }

    public final int hashCode() {
        EnrollmentResponseStatus enrollmentResponseStatus = this.f4664a;
        if (enrollmentResponseStatus == null) {
            return 0;
        }
        return enrollmentResponseStatus.hashCode();
    }

    public final String toString() {
        return "EnrollmentResponse(status=" + this.f4664a + ")";
    }
}
