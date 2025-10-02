package au.com.woolworths.feature.product.list.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.MappedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lau/com/woolworths/feature/product/list/data/SortOption;", "Landroid/os/Parcelable;", "id", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isApplied", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "()Z", "setApplied", "(Z)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SortOption implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SortOption> CREATOR = new Creator();

    @MappedName
    @NotNull
    private final String id;
    private boolean isApplied;

    @Nullable
    private final String subtitle;

    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SortOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SortOption createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new SortOption(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SortOption[] newArray(int i) {
            return new SortOption[i];
        }
    }

    public SortOption(@NotNull String id, @NotNull String title, @Nullable String str, boolean z) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        this.id = id;
        this.title = title;
        this.subtitle = str;
        this.isApplied = z;
    }

    public static /* synthetic */ SortOption copy$default(SortOption sortOption, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sortOption.id;
        }
        if ((i & 2) != 0) {
            str2 = sortOption.title;
        }
        if ((i & 4) != 0) {
            str3 = sortOption.subtitle;
        }
        if ((i & 8) != 0) {
            z = sortOption.isApplied;
        }
        return sortOption.copy(str, str2, str3, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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

    /* renamed from: component4, reason: from getter */
    public final boolean getIsApplied() {
        return this.isApplied;
    }

    @NotNull
    public final SortOption copy(@NotNull String id, @NotNull String title, @Nullable String subtitle, boolean isApplied) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        return new SortOption(id, title, subtitle, isApplied);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortOption)) {
            return false;
        }
        SortOption sortOption = (SortOption) other;
        return Intrinsics.c(this.id, sortOption.id) && Intrinsics.c(this.title, sortOption.title) && Intrinsics.c(this.subtitle, sortOption.subtitle) && this.isApplied == sortOption.isApplied;
    }

    @NotNull
    public final String getId() {
        return this.id;
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
        int iC = b.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        return Boolean.hashCode(this.isApplied) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isApplied() {
        return this.isApplied;
    }

    public final void setApplied(boolean z) {
        this.isApplied = z;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        return d.r(this.subtitle, ", isApplied=", ")", a.v("SortOption(id=", str, ", title=", str2, ", subtitle="), this.isApplied);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeInt(this.isApplied ? 1 : 0);
    }
}
