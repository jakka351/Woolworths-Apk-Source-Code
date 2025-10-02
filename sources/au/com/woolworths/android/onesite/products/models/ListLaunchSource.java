package au.com.woolworths.android.onesite.products.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/products/models/ListLaunchSource;", "Landroid/os/Parcelable;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListLaunchSource implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ListLaunchSource> CREATOR;
    public static final ListLaunchSource d;
    public static final ListLaunchSource e;
    public static final /* synthetic */ ListLaunchSource[] f;
    public static final /* synthetic */ EnumEntries g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ListLaunchSource> {
        @Override // android.os.Parcelable.Creator
        public final ListLaunchSource createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return ListLaunchSource.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ListLaunchSource[] newArray(int i) {
            return new ListLaunchSource[i];
        }
    }

    static {
        ListLaunchSource listLaunchSource = new ListLaunchSource("SHOP_APP", 0);
        d = listLaunchSource;
        ListLaunchSource listLaunchSource2 = new ListLaunchSource("SNG", 1);
        e = listLaunchSource2;
        ListLaunchSource[] listLaunchSourceArr = {listLaunchSource, listLaunchSource2};
        f = listLaunchSourceArr;
        g = EnumEntriesKt.a(listLaunchSourceArr);
        CREATOR = new Creator();
    }

    public static ListLaunchSource valueOf(String str) {
        return (ListLaunchSource) Enum.valueOf(ListLaunchSource.class, str);
    }

    public static ListLaunchSource[] values() {
        return (ListLaunchSource[]) f.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}
