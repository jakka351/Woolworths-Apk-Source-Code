package au.com.woolworths.base.wallet.digipay.framesview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardDetails;", "Landroid/os/Parcelable;", "Companion", "$serializer", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class CardDetails implements Parcelable {
    public final String d;
    public final String e;
    public final String f;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CardDetails> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/CardDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<CardDetails> serializer() {
            return CardDetails$$serializer.f4651a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardDetails> {
        @Override // android.os.Parcelable.Creator
        public final CardDetails createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CardDetails(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CardDetails[] newArray(int i) {
            return new CardDetails[i];
        }
    }

    public /* synthetic */ CardDetails(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, CardDetails$$serializer.f4651a.getDescriptor());
            throw null;
        }
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardDetails)) {
            return false;
        }
        CardDetails cardDetails = (CardDetails) obj;
        return Intrinsics.c(this.d, cardDetails.d) && Intrinsics.c(this.e, cardDetails.e) && Intrinsics.c(this.f, cardDetails.f);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Json.Default r0 = Json.d;
        r0.getClass();
        return r0.c(INSTANCE.serializer(), this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }

    public CardDetails(String cardNo, String str, String str2) {
        Intrinsics.h(cardNo, "cardNo");
        this.d = cardNo;
        this.e = str;
        this.f = str2;
    }
}
