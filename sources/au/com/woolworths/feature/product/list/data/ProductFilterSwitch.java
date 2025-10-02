package au.com.woolworths.feature.product.list.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductFilterSwitch;", "Landroid/os/Parcelable;", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "imageUrl", "value", "", "buttonCta", "Lau/com/woolworths/android/onesite/data/ContentCta;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLau/com/woolworths/android/onesite/data/ContentCta;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImageUrl", "getValue", "()Z", "getButtonCta", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductFilterSwitch implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ProductFilterSwitch> CREATOR = new Creator();

    @Nullable
    private final ContentCta buttonCta;

    @Nullable
    private final String imageUrl;

    @Nullable
    private final String subtitle;

    @NotNull
    private final String title;
    private final boolean value;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductFilterSwitch> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductFilterSwitch createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductFilterSwitch(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (ContentCta) parcel.readParcelable(ProductFilterSwitch.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductFilterSwitch[] newArray(int i) {
            return new ProductFilterSwitch[i];
        }
    }

    public ProductFilterSwitch(@NotNull String title, @Nullable String str, @Nullable String str2, boolean z, @Nullable ContentCta contentCta) {
        Intrinsics.h(title, "title");
        this.title = title;
        this.subtitle = str;
        this.imageUrl = str2;
        this.value = z;
        this.buttonCta = contentCta;
    }

    public static /* synthetic */ ProductFilterSwitch copy$default(ProductFilterSwitch productFilterSwitch, String str, String str2, String str3, boolean z, ContentCta contentCta, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productFilterSwitch.title;
        }
        if ((i & 2) != 0) {
            str2 = productFilterSwitch.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = productFilterSwitch.imageUrl;
        }
        if ((i & 8) != 0) {
            z = productFilterSwitch.value;
        }
        if ((i & 16) != 0) {
            contentCta = productFilterSwitch.buttonCta;
        }
        ContentCta contentCta2 = contentCta;
        String str4 = str3;
        return productFilterSwitch.copy(str, str2, str4, z, contentCta2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final ContentCta getButtonCta() {
        return this.buttonCta;
    }

    @NotNull
    public final ProductFilterSwitch copy(@NotNull String title, @Nullable String subtitle, @Nullable String imageUrl, boolean value, @Nullable ContentCta buttonCta) {
        Intrinsics.h(title, "title");
        return new ProductFilterSwitch(title, subtitle, imageUrl, value, buttonCta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductFilterSwitch)) {
            return false;
        }
        ProductFilterSwitch productFilterSwitch = (ProductFilterSwitch) other;
        return Intrinsics.c(this.title, productFilterSwitch.title) && Intrinsics.c(this.subtitle, productFilterSwitch.subtitle) && Intrinsics.c(this.imageUrl, productFilterSwitch.imageUrl) && this.value == productFilterSwitch.value && Intrinsics.c(this.buttonCta, productFilterSwitch.buttonCta);
    }

    @Nullable
    public final ContentCta getButtonCta() {
        return this.buttonCta;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iE = b.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.value);
        ContentCta contentCta = this.buttonCta;
        return iE + (contentCta != null ? contentCta.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.imageUrl;
        boolean z = this.value;
        ContentCta contentCta = this.buttonCta;
        StringBuilder sbV = a.v("ProductFilterSwitch(title=", str, ", subtitle=", str2, ", imageUrl=");
        d.A(str3, ", value=", ", buttonCta=", sbV, z);
        sbV.append(contentCta);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.imageUrl);
        dest.writeInt(this.value ? 1 : 0);
        dest.writeParcelable(this.buttonCta, flags);
    }
}
