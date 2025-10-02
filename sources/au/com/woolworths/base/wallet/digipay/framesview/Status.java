package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/Status;", "", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class Status {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f4687a;
    public final ErrorDescription b;
    public final ESResponse c;
    public final String d;
    public final String e;
    public final long f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/Status$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/Status;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<Status> serializer() {
            return Status$$serializer.f4688a;
        }
    }

    public /* synthetic */ Status(int i, String str, ErrorDescription errorDescription, ESResponse eSResponse, String str2, String str3, long j) {
        if (57 != (i & 57)) {
            PluginExceptionsKt.a(i, 57, Status$$serializer.f4688a.getB());
            throw null;
        }
        this.f4687a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = errorDescription;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = eSResponse;
        }
        this.d = str2;
        this.e = str3;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return Intrinsics.c(this.f4687a, status.f4687a) && Intrinsics.c(this.b, status.b) && Intrinsics.c(this.c, status.c) && Intrinsics.c(this.d, status.d) && Intrinsics.c(this.e, status.e) && this.f == status.f;
    }

    public final int hashCode() {
        int iHashCode = this.f4687a.hashCode() * 31;
        ErrorDescription errorDescription = this.b;
        int iHashCode2 = (iHashCode + (errorDescription == null ? 0 : errorDescription.hashCode())) * 31;
        ESResponse eSResponse = this.c;
        return Long.hashCode(this.f) + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c((iHashCode2 + (eSResponse != null ? eSResponse.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "Status(auditID=" + this.f4687a + ", error=" + this.b + ", esResponse=" + this.c + ", responseCode=" + this.d + ", responseText=" + this.e + ", txnTime=" + this.f + ")";
    }
}
