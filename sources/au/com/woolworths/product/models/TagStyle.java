package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/product/models/TagStyle;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "UNAVAILABLE", "FEATURED", "UNKNOWN", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TagStyle implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TagStyle[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<TagStyle> CREATOR;

    @SerializedName("UNAVAILABLE")
    public static final TagStyle UNAVAILABLE = new TagStyle("UNAVAILABLE", 0);

    @SerializedName("FEATURED")
    public static final TagStyle FEATURED = new TagStyle("FEATURED", 1);

    @DefaultValue
    public static final TagStyle UNKNOWN = new TagStyle("UNKNOWN", 2);

    private static final /* synthetic */ TagStyle[] $values() {
        return new TagStyle[]{UNAVAILABLE, FEATURED, UNKNOWN};
    }

    static {
        TagStyle[] tagStyleArr$values = $values();
        $VALUES = tagStyleArr$values;
        $ENTRIES = EnumEntriesKt.a(tagStyleArr$values);
        CREATOR = new Parcelable.Creator<TagStyle>() { // from class: au.com.woolworths.product.models.TagStyle.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TagStyle createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return TagStyle.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TagStyle[] newArray(int i) {
                return new TagStyle[i];
            }
        };
    }

    private TagStyle(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TagStyle> getEntries() {
        return $ENTRIES;
    }

    public static TagStyle valueOf(String str) {
        return (TagStyle) Enum.valueOf(TagStyle.class, str);
    }

    public static TagStyle[] values() {
        return (TagStyle[]) $VALUES.clone();
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
