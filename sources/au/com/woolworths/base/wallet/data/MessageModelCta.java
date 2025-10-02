package au.com.woolworths.base.wallet.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/base/wallet/data/MessageModelCta;", "Landroid/os/Parcelable;", "", AnnotatedPrivateKey.LABEL, "Lau/com/woolworths/base/wallet/data/CtaAction;", UrlHandler.ACTION, "url", "<init>", "(Ljava/lang/String;Lau/com/woolworths/base/wallet/data/CtaAction;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lau/com/woolworths/base/wallet/data/CtaAction;", "a", "()Lau/com/woolworths/base/wallet/data/CtaAction;", "c", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MessageModelCta implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageModelCta> CREATOR = new Creator();

    @SerializedName(UrlHandler.ACTION)
    @Nullable
    private final CtaAction action;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @Nullable
    private final String label;

    @SerializedName("url")
    @Nullable
    private final String url;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageModelCta> {
        @Override // android.os.Parcelable.Creator
        public final MessageModelCta createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new MessageModelCta(parcel.readString(), parcel.readInt() == 0 ? null : CtaAction.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessageModelCta[] newArray(int i) {
            return new MessageModelCta[i];
        }
    }

    public MessageModelCta() {
        this(null, null, null, 7, null);
    }

    /* renamed from: a, reason: from getter */
    public final CtaAction getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageModelCta)) {
            return false;
        }
        MessageModelCta messageModelCta = (MessageModelCta) obj;
        return Intrinsics.c(this.label, messageModelCta.label) && this.action == messageModelCta.action && Intrinsics.c(this.url, messageModelCta.url);
    }

    public final int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CtaAction ctaAction = this.action;
        int iHashCode2 = (iHashCode + (ctaAction == null ? 0 : ctaAction.hashCode())) * 31;
        String str2 = this.url;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.label;
        CtaAction ctaAction = this.action;
        String str2 = this.url;
        StringBuilder sb = new StringBuilder("MessageModelCta(label=");
        sb.append(str);
        sb.append(", action=");
        sb.append(ctaAction);
        sb.append(", url=");
        return a.o(sb, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.label);
        CtaAction ctaAction = this.action;
        if (ctaAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ctaAction.writeToParcel(dest, i);
        }
        dest.writeString(this.url);
    }

    public MessageModelCta(@Nullable String str, @Nullable CtaAction ctaAction, @Nullable String str2) {
        this.label = str;
        this.action = ctaAction;
        this.url = str2;
    }

    public /* synthetic */ MessageModelCta(String str, CtaAction ctaAction, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : ctaAction, (i & 4) != 0 ? null : str2);
    }
}
