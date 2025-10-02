package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/product/models/ProductId;", "Landroid/os/Parcelable;", "value", "", "<init>", "(Ljava/lang/String;)V", "toString", "equals", "", "other", "", "hashCode", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductId implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ProductId> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0002¨\u0006\t"}, d2 = {"Lau/com/woolworths/product/models/ProductId$Companion;", "", "<init>", "()V", "create", "Lau/com/woolworths/product/models/ProductId;", "productId", "", "trimPaddedZeros", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String trimPaddedZeros(String str) {
            CharSequence charSequenceSubSequence;
            int i = 0;
            char[] cArr = {'0'};
            Intrinsics.h(str, "<this>");
            int length = str.length();
            while (true) {
                if (i >= length) {
                    charSequenceSubSequence = "";
                    break;
                }
                if (!ArraysKt.i(cArr, str.charAt(i))) {
                    charSequenceSubSequence = str.subSequence(i, str.length());
                    break;
                }
                i++;
            }
            return charSequenceSubSequence.toString();
        }

        @NotNull
        public final ProductId create(@NotNull String productId) {
            Intrinsics.h(productId, "productId");
            return new ProductId(trimPaddedZeros(productId), null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductId createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductId(parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductId[] newArray(int i) {
            return new ProductId[i];
        }
    }

    public /* synthetic */ ProductId(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!ProductId.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type au.com.woolworths.product.models.ProductId");
        return Intrinsics.c(this.value, ((ProductId) other).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @NotNull
    /* renamed from: toString, reason: from getter */
    public String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.value);
    }

    private ProductId(String str) {
        this.value = str;
    }
}
