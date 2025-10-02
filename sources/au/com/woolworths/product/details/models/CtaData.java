package au.com.woolworths.product.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.ratingsandreviews.data.CtaText;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lau/com/woolworths/product/details/models/CtaData;", "Landroid/os/Parcelable;", "ctaText", "Lau/com/woolworths/shop/ratingsandreviews/data/CtaText;", UrlHandler.ACTION, "Lau/com/woolworths/product/details/models/RatingsAndReviewsCtaAction;", "<init>", "(Lau/com/woolworths/shop/ratingsandreviews/data/CtaText;Lau/com/woolworths/product/details/models/RatingsAndReviewsCtaAction;)V", "getCtaText", "()Lau/com/woolworths/shop/ratingsandreviews/data/CtaText;", "getAction", "()Lau/com/woolworths/product/details/models/RatingsAndReviewsCtaAction;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CtaData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CtaData> CREATOR = new Creator();

    @NotNull
    private final RatingsAndReviewsCtaAction action;

    @NotNull
    private final CtaText ctaText;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CtaData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CtaData((CtaText) parcel.readParcelable(CtaData.class.getClassLoader()), RatingsAndReviewsCtaAction.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaData[] newArray(int i) {
            return new CtaData[i];
        }
    }

    public CtaData(@NotNull CtaText ctaText, @NotNull RatingsAndReviewsCtaAction action) {
        Intrinsics.h(ctaText, "ctaText");
        Intrinsics.h(action, "action");
        this.ctaText = ctaText;
        this.action = action;
    }

    public static /* synthetic */ CtaData copy$default(CtaData ctaData, CtaText ctaText, RatingsAndReviewsCtaAction ratingsAndReviewsCtaAction, int i, Object obj) {
        if ((i & 1) != 0) {
            ctaText = ctaData.ctaText;
        }
        if ((i & 2) != 0) {
            ratingsAndReviewsCtaAction = ctaData.action;
        }
        return ctaData.copy(ctaText, ratingsAndReviewsCtaAction);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CtaText getCtaText() {
        return this.ctaText;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RatingsAndReviewsCtaAction getAction() {
        return this.action;
    }

    @NotNull
    public final CtaData copy(@NotNull CtaText ctaText, @NotNull RatingsAndReviewsCtaAction action) {
        Intrinsics.h(ctaText, "ctaText");
        Intrinsics.h(action, "action");
        return new CtaData(ctaText, action);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CtaData)) {
            return false;
        }
        CtaData ctaData = (CtaData) other;
        return Intrinsics.c(this.ctaText, ctaData.ctaText) && Intrinsics.c(this.action, ctaData.action);
    }

    @NotNull
    public final RatingsAndReviewsCtaAction getAction() {
        return this.action;
    }

    @NotNull
    public final CtaText getCtaText() {
        return this.ctaText;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.ctaText.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CtaData(ctaText=" + this.ctaText + ", action=" + this.action + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.ctaText, flags);
        this.action.writeToParcel(dest, flags);
    }
}
