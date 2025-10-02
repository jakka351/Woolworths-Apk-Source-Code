package au.com.woolworths.product.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.graphql.DefaultValue;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/product/details/models/BannerStyle;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "WARNING", "ERROR", "UNKNOWN", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BannerStyle implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BannerStyle[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<BannerStyle> CREATOR;
    public static final BannerStyle INFO = new BannerStyle("INFO", 0);
    public static final BannerStyle WARNING = new BannerStyle("WARNING", 1);
    public static final BannerStyle ERROR = new BannerStyle("ERROR", 2);

    @DefaultValue
    public static final BannerStyle UNKNOWN = new BannerStyle("UNKNOWN", 3);

    private static final /* synthetic */ BannerStyle[] $values() {
        return new BannerStyle[]{INFO, WARNING, ERROR, UNKNOWN};
    }

    static {
        BannerStyle[] bannerStyleArr$values = $values();
        $VALUES = bannerStyleArr$values;
        $ENTRIES = EnumEntriesKt.a(bannerStyleArr$values);
        CREATOR = new Parcelable.Creator<BannerStyle>() { // from class: au.com.woolworths.product.details.models.BannerStyle.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BannerStyle createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return BannerStyle.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BannerStyle[] newArray(int i) {
                return new BannerStyle[i];
            }
        };
    }

    private BannerStyle(String str, int i) {
    }

    @NotNull
    public static EnumEntries<BannerStyle> getEntries() {
        return $ENTRIES;
    }

    public static BannerStyle valueOf(String str) {
        return (BannerStyle) Enum.valueOf(BannerStyle.class, str);
    }

    public static BannerStyle[] values() {
        return (BannerStyle[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}
