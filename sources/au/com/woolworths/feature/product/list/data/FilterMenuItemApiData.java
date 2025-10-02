package au.com.woolworths.feature.product.list.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012¨\u0006&"}, d2 = {"Lau/com/woolworths/feature/product/list/data/FilterMenuItemApiData;", "Landroid/os/Parcelable;", "key", "", "title", "displayLabel", "parentKey", "hasChildren", "", "isApplied", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getKey", "()Ljava/lang/String;", "getTitle", "getDisplayLabel", "getParentKey", "getHasChildren", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilterMenuItemApiData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<FilterMenuItemApiData> CREATOR = new Creator();

    @MappedName
    @NotNull
    private final String displayLabel;
    private final boolean hasChildren;
    private final boolean isApplied;

    @NotNull
    private final String key;

    @Nullable
    private final String parentKey;

    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FilterMenuItemApiData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterMenuItemApiData createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new FilterMenuItemApiData(string, string2, string3, string4, z2, parcel.readInt() == 0 ? z : true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterMenuItemApiData[] newArray(int i) {
            return new FilterMenuItemApiData[i];
        }
    }

    public FilterMenuItemApiData(@NotNull String key, @NotNull String title, @NotNull String displayLabel, @Nullable String str, boolean z, boolean z2) {
        Intrinsics.h(key, "key");
        Intrinsics.h(title, "title");
        Intrinsics.h(displayLabel, "displayLabel");
        this.key = key;
        this.title = title;
        this.displayLabel = displayLabel;
        this.parentKey = str;
        this.hasChildren = z;
        this.isApplied = z2;
    }

    public static /* synthetic */ FilterMenuItemApiData copy$default(FilterMenuItemApiData filterMenuItemApiData, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterMenuItemApiData.key;
        }
        if ((i & 2) != 0) {
            str2 = filterMenuItemApiData.title;
        }
        if ((i & 4) != 0) {
            str3 = filterMenuItemApiData.displayLabel;
        }
        if ((i & 8) != 0) {
            str4 = filterMenuItemApiData.parentKey;
        }
        if ((i & 16) != 0) {
            z = filterMenuItemApiData.hasChildren;
        }
        if ((i & 32) != 0) {
            z2 = filterMenuItemApiData.isApplied;
        }
        boolean z3 = z;
        boolean z4 = z2;
        return filterMenuItemApiData.copy(str, str2, str3, str4, z3, z4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getParentKey() {
        return this.parentKey;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasChildren() {
        return this.hasChildren;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsApplied() {
        return this.isApplied;
    }

    @NotNull
    public final FilterMenuItemApiData copy(@NotNull String key, @NotNull String title, @NotNull String displayLabel, @Nullable String parentKey, boolean hasChildren, boolean isApplied) {
        Intrinsics.h(key, "key");
        Intrinsics.h(title, "title");
        Intrinsics.h(displayLabel, "displayLabel");
        return new FilterMenuItemApiData(key, title, displayLabel, parentKey, hasChildren, isApplied);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterMenuItemApiData)) {
            return false;
        }
        FilterMenuItemApiData filterMenuItemApiData = (FilterMenuItemApiData) other;
        return Intrinsics.c(this.key, filterMenuItemApiData.key) && Intrinsics.c(this.title, filterMenuItemApiData.title) && Intrinsics.c(this.displayLabel, filterMenuItemApiData.displayLabel) && Intrinsics.c(this.parentKey, filterMenuItemApiData.parentKey) && this.hasChildren == filterMenuItemApiData.hasChildren && this.isApplied == filterMenuItemApiData.isApplied;
    }

    @NotNull
    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final boolean getHasChildren() {
        return this.hasChildren;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getParentKey() {
        return this.parentKey;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = b.c(b.c(this.key.hashCode() * 31, 31, this.title), 31, this.displayLabel);
        String str = this.parentKey;
        return Boolean.hashCode(this.isApplied) + b.e((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.hasChildren);
    }

    public final boolean isApplied() {
        return this.isApplied;
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.title;
        String str3 = this.displayLabel;
        String str4 = this.parentKey;
        boolean z = this.hasChildren;
        boolean z2 = this.isApplied;
        StringBuilder sbV = a.v("FilterMenuItemApiData(key=", str, ", title=", str2, ", displayLabel=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", parentKey=", str4, ", hasChildren=");
        return au.com.woolworths.android.onesite.a.q(sbV, z, ", isApplied=", z2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.key);
        dest.writeString(this.title);
        dest.writeString(this.displayLabel);
        dest.writeString(this.parentKey);
        dest.writeInt(this.hasChildren ? 1 : 0);
        dest.writeInt(this.isApplied ? 1 : 0);
    }
}
