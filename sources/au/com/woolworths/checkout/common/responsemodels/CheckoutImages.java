package au.com.woolworths.checkout.common.responsemodels;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutImages;", "", "images360", "", "", "thumbnail", ErrorBundle.DETAIL_ENTRY, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getImages360", "()Ljava/util/List;", "getThumbnail", "()Ljava/lang/String;", "getDetails", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutImages {

    @SerializedName("Details")
    @NotNull
    private final List<String> details;

    @SerializedName("360")
    @NotNull
    private final List<String> images360;

    @SerializedName("Thumbnail")
    @NotNull
    private final String thumbnail;

    public CheckoutImages(@NotNull List<String> images360, @NotNull String thumbnail, @NotNull List<String> details) {
        Intrinsics.h(images360, "images360");
        Intrinsics.h(thumbnail, "thumbnail");
        Intrinsics.h(details, "details");
        this.images360 = images360;
        this.thumbnail = thumbnail;
        this.details = details;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutImages copy$default(CheckoutImages checkoutImages, List list, String str, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = checkoutImages.images360;
        }
        if ((i & 2) != 0) {
            str = checkoutImages.thumbnail;
        }
        if ((i & 4) != 0) {
            list2 = checkoutImages.details;
        }
        return checkoutImages.copy(list, str, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.images360;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    @NotNull
    public final List<String> component3() {
        return this.details;
    }

    @NotNull
    public final CheckoutImages copy(@NotNull List<String> images360, @NotNull String thumbnail, @NotNull List<String> details) {
        Intrinsics.h(images360, "images360");
        Intrinsics.h(thumbnail, "thumbnail");
        Intrinsics.h(details, "details");
        return new CheckoutImages(images360, thumbnail, details);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutImages)) {
            return false;
        }
        CheckoutImages checkoutImages = (CheckoutImages) other;
        return Intrinsics.c(this.images360, checkoutImages.images360) && Intrinsics.c(this.thumbnail, checkoutImages.thumbnail) && Intrinsics.c(this.details, checkoutImages.details);
    }

    @NotNull
    public final List<String> getDetails() {
        return this.details;
    }

    @NotNull
    public final List<String> getImages360() {
        return this.images360;
    }

    @NotNull
    public final String getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        return this.details.hashCode() + b.c(this.images360.hashCode() * 31, 31, this.thumbnail);
    }

    @NotNull
    public String toString() {
        List<String> list = this.images360;
        String str = this.thumbnail;
        List<String> list2 = this.details;
        StringBuilder sb = new StringBuilder("CheckoutImages(images360=");
        sb.append(list);
        sb.append(", thumbnail=");
        sb.append(str);
        sb.append(", details=");
        return a.t(sb, list2, ")");
    }
}
