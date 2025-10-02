package au.com.woolworths.rewards.base.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lau/com/woolworths/rewards/base/data/PartnerCustomMessage;", "Landroid/os/Parcelable;", "title", "", lqlqqlq.mmm006Dm006Dm, "links", "", "Lau/com/woolworths/rewards/base/data/PartnerCustomMessageLink;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getLinks", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PartnerCustomMessage implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PartnerCustomMessage> CREATOR = new Creator();

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @Nullable
    private final String description;

    @SerializedName("links")
    @NotNull
    private final List<PartnerCustomMessageLink> links;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PartnerCustomMessage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PartnerCustomMessage createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(PartnerCustomMessageLink.CREATOR, parcel, arrayList, iE, 1);
            }
            return new PartnerCustomMessage(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PartnerCustomMessage[] newArray(int i) {
            return new PartnerCustomMessage[i];
        }
    }

    public PartnerCustomMessage(@NotNull String title, @Nullable String str, @NotNull List<PartnerCustomMessageLink> links) {
        Intrinsics.h(title, "title");
        Intrinsics.h(links, "links");
        this.title = title;
        this.description = str;
        this.links = links;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartnerCustomMessage copy$default(PartnerCustomMessage partnerCustomMessage, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerCustomMessage.title;
        }
        if ((i & 2) != 0) {
            str2 = partnerCustomMessage.description;
        }
        if ((i & 4) != 0) {
            list = partnerCustomMessage.links;
        }
        return partnerCustomMessage.copy(str, str2, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<PartnerCustomMessageLink> component3() {
        return this.links;
    }

    @NotNull
    public final PartnerCustomMessage copy(@NotNull String title, @Nullable String description, @NotNull List<PartnerCustomMessageLink> links) {
        Intrinsics.h(title, "title");
        Intrinsics.h(links, "links");
        return new PartnerCustomMessage(title, description, links);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerCustomMessage)) {
            return false;
        }
        PartnerCustomMessage partnerCustomMessage = (PartnerCustomMessage) other;
        return Intrinsics.c(this.title, partnerCustomMessage.title) && Intrinsics.c(this.description, partnerCustomMessage.description) && Intrinsics.c(this.links, partnerCustomMessage.links);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<PartnerCustomMessageLink> getLinks() {
        return this.links;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        return this.links.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        return android.support.v4.media.session.a.t(YU.a.v("PartnerCustomMessage(title=", str, ", description=", str2, ", links="), this.links, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.description);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.links, dest);
        while (itU.hasNext()) {
            ((PartnerCustomMessageLink) itU.next()).writeToParcel(dest, flags);
        }
    }
}
