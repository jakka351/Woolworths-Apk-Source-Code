package au.com.woolworths.feature.product.list.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001e"}, d2 = {"Lau/com/woolworths/feature/product/list/data/PopupMessage;", "Lau/com/woolworths/feature/product/list/data/CustomMessage;", "Landroid/os/Parcelable;", "title", "", lqlqqlq.mmm006Dm006Dm, "ctaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getCtaLabel", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PopupMessage implements CustomMessage, Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<PopupMessage> CREATOR = new Creator();

    @MappedName
    @Nullable
    private final String ctaLabel;

    @MappedName
    @Nullable
    private final String description;

    @MappedName
    @Nullable
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PopupMessage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PopupMessage createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PopupMessage(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PopupMessage[] newArray(int i) {
            return new PopupMessage[i];
        }
    }

    public PopupMessage(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.title = str;
        this.description = str2;
        this.ctaLabel = str3;
    }

    public static /* synthetic */ PopupMessage copy$default(PopupMessage popupMessage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popupMessage.title;
        }
        if ((i & 2) != 0) {
            str2 = popupMessage.description;
        }
        if ((i & 4) != 0) {
            str3 = popupMessage.ctaLabel;
        }
        return popupMessage.copy(str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCtaLabel() {
        return this.ctaLabel;
    }

    @NotNull
    public final PopupMessage copy(@Nullable String title, @Nullable String description, @Nullable String ctaLabel) {
        return new PopupMessage(title, description, ctaLabel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopupMessage)) {
            return false;
        }
        PopupMessage popupMessage = (PopupMessage) other;
        return Intrinsics.c(this.title, popupMessage.title) && Intrinsics.c(this.description, popupMessage.description) && Intrinsics.c(this.ctaLabel, popupMessage.ctaLabel);
    }

    @Nullable
    public final String getCtaLabel() {
        return this.ctaLabel;
    }

    @Override // au.com.woolworths.feature.product.list.data.CustomMessage
    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Override // au.com.woolworths.feature.product.list.data.CustomMessage
    @Nullable
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ctaLabel;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        return a.o(a.v("PopupMessage(title=", str, ", description=", str2, ", ctaLabel="), this.ctaLabel, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.ctaLabel);
    }
}
