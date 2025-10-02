package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ErrorDescription;", "", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class ErrorDescription {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f4667a;
    public final String b;
    public final String c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/ErrorDescription$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ErrorDescription;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ErrorDescription> serializer() {
            return ErrorDescription$$serializer.f4668a;
        }
    }

    public /* synthetic */ ErrorDescription(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, ErrorDescription$$serializer.f4668a.getDescriptor());
            throw null;
        }
        this.f4667a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorDescription)) {
            return false;
        }
        ErrorDescription errorDescription = (ErrorDescription) obj;
        return Intrinsics.c(this.f4667a, errorDescription.f4667a) && Intrinsics.c(this.b, errorDescription.b) && Intrinsics.c(this.c, errorDescription.c);
    }

    public final int hashCode() {
        String str = this.f4667a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return YU.a.o(YU.a.v("ErrorDescription(context=", this.f4667a, ", description=", this.b, ", correction="), this.c, ")");
    }
}
