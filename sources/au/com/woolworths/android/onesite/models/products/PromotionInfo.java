package au.com.woolworths.android.onesite.models.products;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.products.models.ProductPromotionTypes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lau/com/woolworths/android/onesite/models/products/PromotionInfo;", "Landroid/os/Parcelable;", "type", "Lau/com/woolworths/android/onesite/products/models/ProductPromotionTypes;", AnnotatedPrivateKey.LABEL, "", "<init>", "(Lau/com/woolworths/android/onesite/products/models/ProductPromotionTypes;Ljava/lang/String;)V", "getType", "()Lau/com/woolworths/android/onesite/products/models/ProductPromotionTypes;", "setType", "(Lau/com/woolworths/android/onesite/products/models/ProductPromotionTypes;)V", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromotionInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PromotionInfo> CREATOR = new Creator();

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private String label;

    @SerializedName("type")
    @NotNull
    private ProductPromotionTypes type;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromotionInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromotionInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PromotionInfo(ProductPromotionTypes.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromotionInfo[] newArray(int i) {
            return new PromotionInfo[i];
        }
    }

    public PromotionInfo(@NotNull ProductPromotionTypes type, @NotNull String label) {
        Intrinsics.h(type, "type");
        Intrinsics.h(label, "label");
        this.type = type;
        this.label = label;
    }

    public static /* synthetic */ PromotionInfo copy$default(PromotionInfo promotionInfo, ProductPromotionTypes productPromotionTypes, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            productPromotionTypes = promotionInfo.type;
        }
        if ((i & 2) != 0) {
            str = promotionInfo.label;
        }
        return promotionInfo.copy(productPromotionTypes, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductPromotionTypes getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final PromotionInfo copy(@NotNull ProductPromotionTypes type, @NotNull String label) {
        Intrinsics.h(type, "type");
        Intrinsics.h(label, "label");
        return new PromotionInfo(type, label);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionInfo)) {
            return false;
        }
        PromotionInfo promotionInfo = (PromotionInfo) other;
        return this.type == promotionInfo.type && Intrinsics.c(this.label, promotionInfo.label);
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final ProductPromotionTypes getType() {
        return this.type;
    }

    public int hashCode() {
        return this.label.hashCode() + (this.type.hashCode() * 31);
    }

    public final void setLabel(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.label = str;
    }

    public final void setType(@NotNull ProductPromotionTypes productPromotionTypes) {
        Intrinsics.h(productPromotionTypes, "<set-?>");
        this.type = productPromotionTypes;
    }

    @NotNull
    public String toString() {
        return "PromotionInfo(type=" + this.type + ", label=" + this.label + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        this.type.writeToParcel(dest, flags);
        dest.writeString(this.label);
    }
}
