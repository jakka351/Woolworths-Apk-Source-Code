package au.com.woolworths.promotion.banner.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/promotion/banner/data/PromotionMarkdownContent;", "Lau/com/woolworths/promotion/banner/data/PromotionContent;", "", "promotionMarkdownTitle", "promotionMarkdownText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "promotion-banner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PromotionMarkdownContent implements PromotionContent {

    @NotNull
    public static final Parcelable.Creator<PromotionMarkdownContent> CREATOR = new Creator();

    @SerializedName("promotionMarkdownText")
    @NotNull
    private final String promotionMarkdownText;

    @SerializedName("promotionMarkdownTitle")
    @NotNull
    private final String promotionMarkdownTitle;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromotionMarkdownContent> {
        @Override // android.os.Parcelable.Creator
        public final PromotionMarkdownContent createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PromotionMarkdownContent(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionMarkdownContent[] newArray(int i) {
            return new PromotionMarkdownContent[i];
        }
    }

    public PromotionMarkdownContent(@NotNull String promotionMarkdownTitle, @NotNull String promotionMarkdownText) {
        Intrinsics.h(promotionMarkdownTitle, "promotionMarkdownTitle");
        Intrinsics.h(promotionMarkdownText, "promotionMarkdownText");
        this.promotionMarkdownTitle = promotionMarkdownTitle;
        this.promotionMarkdownText = promotionMarkdownText;
    }

    /* renamed from: a, reason: from getter */
    public final String getPromotionMarkdownText() {
        return this.promotionMarkdownText;
    }

    /* renamed from: b, reason: from getter */
    public final String getPromotionMarkdownTitle() {
        return this.promotionMarkdownTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionMarkdownContent)) {
            return false;
        }
        PromotionMarkdownContent promotionMarkdownContent = (PromotionMarkdownContent) obj;
        return Intrinsics.c(this.promotionMarkdownTitle, promotionMarkdownContent.promotionMarkdownTitle) && Intrinsics.c(this.promotionMarkdownText, promotionMarkdownContent.promotionMarkdownText);
    }

    public final int hashCode() {
        return this.promotionMarkdownText.hashCode() + (this.promotionMarkdownTitle.hashCode() * 31);
    }

    public final String toString() {
        return a.j("PromotionMarkdownContent(promotionMarkdownTitle=", this.promotionMarkdownTitle, ", promotionMarkdownText=", this.promotionMarkdownText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.promotionMarkdownTitle);
        dest.writeString(this.promotionMarkdownText);
    }
}
