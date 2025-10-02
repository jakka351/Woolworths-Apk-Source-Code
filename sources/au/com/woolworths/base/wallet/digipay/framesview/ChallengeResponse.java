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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ChallengeResponse;", "", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class ChallengeResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f4656a;
    public final String b;
    public final String c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ChallengeResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ChallengeResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ChallengeResponse> serializer() {
            return ChallengeResponse$$serializer.f4657a;
        }
    }

    public /* synthetic */ ChallengeResponse(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, ChallengeResponse$$serializer.f4657a.getB());
            throw null;
        }
        this.f4656a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeResponse)) {
            return false;
        }
        ChallengeResponse challengeResponse = (ChallengeResponse) obj;
        return Intrinsics.c(this.f4656a, challengeResponse.f4656a) && Intrinsics.c(this.b, challengeResponse.b) && Intrinsics.c(this.c, challengeResponse.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.camera.core.impl.b.c(this.f4656a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        Json.Default r0 = Json.d;
        r0.getClass();
        return r0.c(INSTANCE.serializer(), this);
    }
}
