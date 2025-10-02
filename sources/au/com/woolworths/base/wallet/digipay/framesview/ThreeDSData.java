package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ThreeDSData;", "", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class ThreeDSData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f4691a;
    public final String b;
    public final Integer c;
    public final Payment d;
    public final Boolean e;
    public final Data f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ThreeDSData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ThreeDSData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ThreeDSData> serializer() {
            return ThreeDSData$$serializer.f4692a;
        }
    }

    public /* synthetic */ ThreeDSData(int i, String str, String str2, Integer num, Payment payment, Boolean bool, Data data) {
        if ((i & 1) == 0) {
            this.f4691a = null;
        } else {
            this.f4691a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = payment;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = data;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSData)) {
            return false;
        }
        ThreeDSData threeDSData = (ThreeDSData) obj;
        return Intrinsics.c(this.f4691a, threeDSData.f4691a) && Intrinsics.c(this.b, threeDSData.b) && Intrinsics.c(this.c, threeDSData.c) && Intrinsics.c(this.d, threeDSData.d) && Intrinsics.c(this.e, threeDSData.e) && Intrinsics.c(this.f, threeDSData.f);
    }

    public final int hashCode() {
        String str = this.f4691a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Payment payment = this.d;
        int iHashCode4 = (iHashCode3 + (payment == null ? 0 : payment.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Data data = this.f;
        return iHashCode5 + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("ThreeDSData(actionCode=", this.f4691a, ", errorDescription=", this.b, ", errorNumber=");
        sbV.append(this.c);
        sbV.append(", payment=");
        sbV.append(this.d);
        sbV.append(", validated=");
        sbV.append(this.e);
        sbV.append(", data=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
