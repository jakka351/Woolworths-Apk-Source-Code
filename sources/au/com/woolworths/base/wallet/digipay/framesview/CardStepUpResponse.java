package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardStepUpResponse;", "Lau/com/woolworths/base/wallet/digipay/framesview/CompleteResponse;", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class CardStepUpResponse implements CompleteResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final FraudResponse f4652a;
    public final int b;
    public final Status c;
    public final String d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardStepUpResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/CardStepUpResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<CardStepUpResponse> serializer() {
            return CardStepUpResponse$$serializer.f4653a;
        }
    }

    public /* synthetic */ CardStepUpResponse(int i, FraudResponse fraudResponse, int i2, Status status, String str) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, CardStepUpResponse$$serializer.f4653a.getB());
            throw null;
        }
        this.f4652a = fraudResponse;
        this.b = i2;
        this.c = status;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardStepUpResponse)) {
            return false;
        }
        CardStepUpResponse cardStepUpResponse = (CardStepUpResponse) obj;
        return Intrinsics.c(this.f4652a, cardStepUpResponse.f4652a) && this.b == cardStepUpResponse.b && Intrinsics.c(this.c, cardStepUpResponse.c) && Intrinsics.c(this.d, cardStepUpResponse.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + androidx.camera.core.impl.b.a(this.b, this.f4652a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "CardStepUpResponse(fraudResponse=" + this.f4652a + ", itemId=" + this.b + ", status=" + this.c + ", stepUpToken=" + this.d + ")";
    }
}
