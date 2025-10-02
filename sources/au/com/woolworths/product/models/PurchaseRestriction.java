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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/product/models/PurchaseRestriction;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "LEGAL_AGE_RESTRICTION", "NO_RESTRICTION", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PurchaseRestriction implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PurchaseRestriction[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PurchaseRestriction> CREATOR;

    @SerializedName("LEGAL_AGE_RESTRICTION")
    public static final PurchaseRestriction LEGAL_AGE_RESTRICTION = new PurchaseRestriction("LEGAL_AGE_RESTRICTION", 0);

    @DefaultValue
    @SerializedName("NO_RESTRICTION")
    public static final PurchaseRestriction NO_RESTRICTION = new PurchaseRestriction("NO_RESTRICTION", 1);

    private static final /* synthetic */ PurchaseRestriction[] $values() {
        return new PurchaseRestriction[]{LEGAL_AGE_RESTRICTION, NO_RESTRICTION};
    }

    static {
        PurchaseRestriction[] purchaseRestrictionArr$values = $values();
        $VALUES = purchaseRestrictionArr$values;
        $ENTRIES = EnumEntriesKt.a(purchaseRestrictionArr$values);
        CREATOR = new Parcelable.Creator<PurchaseRestriction>() { // from class: au.com.woolworths.product.models.PurchaseRestriction.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PurchaseRestriction createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return PurchaseRestriction.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PurchaseRestriction[] newArray(int i) {
                return new PurchaseRestriction[i];
            }
        };
    }

    private PurchaseRestriction(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PurchaseRestriction> getEntries() {
        return $ENTRIES;
    }

    public static PurchaseRestriction valueOf(String str) {
        return (PurchaseRestriction) Enum.valueOf(PurchaseRestriction.class, str);
    }

    public static PurchaseRestriction[] values() {
        return (PurchaseRestriction[]) $VALUES.clone();
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
