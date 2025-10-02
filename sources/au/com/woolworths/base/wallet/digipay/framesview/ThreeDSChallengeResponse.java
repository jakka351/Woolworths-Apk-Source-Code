package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ThreeDSChallengeResponse;", "Lau/com/woolworths/base/wallet/digipay/framesview/CompleteResponse;", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class ThreeDSChallengeResponse implements CompleteResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final ChallengeResponse f4689a;
    public final ThreeDSData b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ThreeDSChallengeResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ThreeDSChallengeResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ThreeDSChallengeResponse> serializer() {
            return ThreeDSChallengeResponse$$serializer.f4690a;
        }
    }

    public /* synthetic */ ThreeDSChallengeResponse(int i, ChallengeResponse challengeResponse, ThreeDSData threeDSData) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.a(i, 2, ThreeDSChallengeResponse$$serializer.f4690a.getB());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f4689a = null;
        } else {
            this.f4689a = challengeResponse;
        }
        this.b = threeDSData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSChallengeResponse)) {
            return false;
        }
        ThreeDSChallengeResponse threeDSChallengeResponse = (ThreeDSChallengeResponse) obj;
        return Intrinsics.c(this.f4689a, threeDSChallengeResponse.f4689a) && Intrinsics.c(this.b, threeDSChallengeResponse.b);
    }

    public final int hashCode() {
        ChallengeResponse challengeResponse = this.f4689a;
        return this.b.hashCode() + ((challengeResponse == null ? 0 : challengeResponse.hashCode()) * 31);
    }

    public final String toString() {
        Json.Default r0 = Json.d;
        r0.getClass();
        return r0.c(INSTANCE.serializer(), this);
    }
}
