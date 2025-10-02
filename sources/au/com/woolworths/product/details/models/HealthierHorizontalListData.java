package au.com.woolworths.product.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006,"}, d2 = {"Lau/com/woolworths/product/details/models/HealthierHorizontalListData;", "Landroid/os/Parcelable;", "healthierOptions", "", "Lau/com/woolworths/product/details/models/HealthierOption;", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "linkedInfo", "Lau/com/woolworths/product/details/models/HealthierLinkedInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/product/details/models/HealthierLinkedInfo;)V", "getHealthierOptions", "()Ljava/util/List;", "setHealthierOptions", "(Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getSubtitle", "setSubtitle", "getLinkedInfo", "()Lau/com/woolworths/product/details/models/HealthierLinkedInfo;", "setLinkedInfo", "(Lau/com/woolworths/product/details/models/HealthierLinkedInfo;)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HealthierHorizontalListData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<HealthierHorizontalListData> CREATOR = new Creator();

    @NotNull
    private List<HealthierOption> healthierOptions;

    @Nullable
    private HealthierLinkedInfo linkedInfo;

    @Nullable
    private String subtitle;

    @NotNull
    private String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HealthierHorizontalListData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthierHorizontalListData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(HealthierOption.CREATOR, parcel, arrayList, iE, 1);
            }
            return new HealthierHorizontalListData(arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : HealthierLinkedInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthierHorizontalListData[] newArray(int i) {
            return new HealthierHorizontalListData[i];
        }
    }

    public HealthierHorizontalListData(@NotNull List<HealthierOption> healthierOptions, @NotNull String title, @Nullable String str, @Nullable HealthierLinkedInfo healthierLinkedInfo) {
        Intrinsics.h(healthierOptions, "healthierOptions");
        Intrinsics.h(title, "title");
        this.healthierOptions = healthierOptions;
        this.title = title;
        this.subtitle = str;
        this.linkedInfo = healthierLinkedInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthierHorizontalListData copy$default(HealthierHorizontalListData healthierHorizontalListData, List list, String str, String str2, HealthierLinkedInfo healthierLinkedInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            list = healthierHorizontalListData.healthierOptions;
        }
        if ((i & 2) != 0) {
            str = healthierHorizontalListData.title;
        }
        if ((i & 4) != 0) {
            str2 = healthierHorizontalListData.subtitle;
        }
        if ((i & 8) != 0) {
            healthierLinkedInfo = healthierHorizontalListData.linkedInfo;
        }
        return healthierHorizontalListData.copy(list, str, str2, healthierLinkedInfo);
    }

    @NotNull
    public final List<HealthierOption> component1() {
        return this.healthierOptions;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final HealthierLinkedInfo getLinkedInfo() {
        return this.linkedInfo;
    }

    @NotNull
    public final HealthierHorizontalListData copy(@NotNull List<HealthierOption> healthierOptions, @NotNull String title, @Nullable String subtitle, @Nullable HealthierLinkedInfo linkedInfo) {
        Intrinsics.h(healthierOptions, "healthierOptions");
        Intrinsics.h(title, "title");
        return new HealthierHorizontalListData(healthierOptions, title, subtitle, linkedInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthierHorizontalListData)) {
            return false;
        }
        HealthierHorizontalListData healthierHorizontalListData = (HealthierHorizontalListData) other;
        return Intrinsics.c(this.healthierOptions, healthierHorizontalListData.healthierOptions) && Intrinsics.c(this.title, healthierHorizontalListData.title) && Intrinsics.c(this.subtitle, healthierHorizontalListData.subtitle) && Intrinsics.c(this.linkedInfo, healthierHorizontalListData.linkedInfo);
    }

    @NotNull
    public final List<HealthierOption> getHealthierOptions() {
        return this.healthierOptions;
    }

    @Nullable
    public final HealthierLinkedInfo getLinkedInfo() {
        return this.linkedInfo;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = b.c(this.healthierOptions.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        HealthierLinkedInfo healthierLinkedInfo = this.linkedInfo;
        return iHashCode + (healthierLinkedInfo != null ? healthierLinkedInfo.hashCode() : 0);
    }

    public final void setHealthierOptions(@NotNull List<HealthierOption> list) {
        Intrinsics.h(list, "<set-?>");
        this.healthierOptions = list;
    }

    public final void setLinkedInfo(@Nullable HealthierLinkedInfo healthierLinkedInfo) {
        this.linkedInfo = healthierLinkedInfo;
    }

    public final void setSubtitle(@Nullable String str) {
        this.subtitle = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "HealthierHorizontalListData(healthierOptions=" + this.healthierOptions + ", title=" + this.title + ", subtitle=" + this.subtitle + ", linkedInfo=" + this.linkedInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.healthierOptions, dest);
        while (itU.hasNext()) {
            ((HealthierOption) itU.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        HealthierLinkedInfo healthierLinkedInfo = this.linkedInfo;
        if (healthierLinkedInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            healthierLinkedInfo.writeToParcel(dest, flags);
        }
    }
}
