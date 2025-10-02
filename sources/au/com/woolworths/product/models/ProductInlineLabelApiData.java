package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lau/com/woolworths/product/models/ProductInlineLabelApiData;", "Landroid/os/Parcelable;", "type", "Lau/com/woolworths/product/models/ProductInlineTypeApiData;", AnnotatedPrivateKey.LABEL, "", "priority", "", "<init>", "(Lau/com/woolworths/product/models/ProductInlineTypeApiData;Ljava/lang/String;Ljava/lang/Integer;)V", "getType", "()Lau/com/woolworths/product/models/ProductInlineTypeApiData;", "getLabel", "()Ljava/lang/String;", "getPriority", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lau/com/woolworths/product/models/ProductInlineTypeApiData;Ljava/lang/String;Ljava/lang/Integer;)Lau/com/woolworths/product/models/ProductInlineLabelApiData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductInlineLabelApiData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ProductInlineLabelApiData> CREATOR = new Creator();

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    @SerializedName("priority")
    @Nullable
    private final Integer priority;

    @SerializedName("type")
    @NotNull
    private final ProductInlineTypeApiData type;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductInlineLabelApiData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductInlineLabelApiData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductInlineLabelApiData(ProductInlineTypeApiData.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductInlineLabelApiData[] newArray(int i) {
            return new ProductInlineLabelApiData[i];
        }
    }

    public ProductInlineLabelApiData(@NotNull ProductInlineTypeApiData type, @NotNull String label, @Nullable Integer num) {
        Intrinsics.h(type, "type");
        Intrinsics.h(label, "label");
        this.type = type;
        this.label = label;
        this.priority = num;
    }

    public static /* synthetic */ ProductInlineLabelApiData copy$default(ProductInlineLabelApiData productInlineLabelApiData, ProductInlineTypeApiData productInlineTypeApiData, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            productInlineTypeApiData = productInlineLabelApiData.type;
        }
        if ((i & 2) != 0) {
            str = productInlineLabelApiData.label;
        }
        if ((i & 4) != 0) {
            num = productInlineLabelApiData.priority;
        }
        return productInlineLabelApiData.copy(productInlineTypeApiData, str, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductInlineTypeApiData getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getPriority() {
        return this.priority;
    }

    @NotNull
    public final ProductInlineLabelApiData copy(@NotNull ProductInlineTypeApiData type, @NotNull String label, @Nullable Integer priority) {
        Intrinsics.h(type, "type");
        Intrinsics.h(label, "label");
        return new ProductInlineLabelApiData(type, label, priority);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductInlineLabelApiData)) {
            return false;
        }
        ProductInlineLabelApiData productInlineLabelApiData = (ProductInlineLabelApiData) other;
        return this.type == productInlineLabelApiData.type && Intrinsics.c(this.label, productInlineLabelApiData.label) && Intrinsics.c(this.priority, productInlineLabelApiData.priority);
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final Integer getPriority() {
        return this.priority;
    }

    @NotNull
    public final ProductInlineTypeApiData getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = b.c(this.type.hashCode() * 31, 31, this.label);
        Integer num = this.priority;
        return iC + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        ProductInlineTypeApiData productInlineTypeApiData = this.type;
        String str = this.label;
        Integer num = this.priority;
        StringBuilder sb = new StringBuilder("ProductInlineLabelApiData(type=");
        sb.append(productInlineTypeApiData);
        sb.append(", label=");
        sb.append(str);
        sb.append(", priority=");
        return a.p(sb, num, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.type.name());
        dest.writeString(this.label);
        Integer num = this.priority;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }
}
