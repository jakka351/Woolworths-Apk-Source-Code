package au.com.woolworths.base.shopapp.modules.badge;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/badge/BadgeApiData;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "Landroid/os/Parcelable;", "", AnnotatedPrivateKey.LABEL, "Lau/com/woolworths/base/shopapp/modules/badge/BadgeTypeApiData;", "badgeType", "Lau/com/woolworths/base/shopapp/modules/text/TextWithAltApiData;", "altLabel", "<init>", "(Ljava/lang/String;Lau/com/woolworths/base/shopapp/modules/badge/BadgeTypeApiData;Lau/com/woolworths/base/shopapp/modules/text/TextWithAltApiData;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lau/com/woolworths/base/shopapp/modules/badge/BadgeTypeApiData;", "a", "()Lau/com/woolworths/base/shopapp/modules/badge/BadgeTypeApiData;", "Lau/com/woolworths/base/shopapp/modules/text/TextWithAltApiData;", "getAltLabel", "()Lau/com/woolworths/base/shopapp/modules/text/TextWithAltApiData;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BadgeApiData implements BrandLabel, Parcelable {

    @NotNull
    public static final Parcelable.Creator<BadgeApiData> CREATOR = new Creator();

    @SerializedName("altLabel")
    @Nullable
    private final TextWithAltApiData altLabel;

    @SerializedName("type")
    @MappedName
    @NotNull
    private final BadgeTypeApiData badgeType;
    public final PlainText d;
    public final BadgeBrandLabelType e;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BadgeApiData> {
        @Override // android.os.Parcelable.Creator
        public final BadgeApiData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new BadgeApiData(parcel.readString(), BadgeTypeApiData.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : TextWithAltApiData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeApiData[] newArray(int i) {
            return new BadgeApiData[i];
        }
    }

    public BadgeApiData(@NotNull String label, @NotNull BadgeTypeApiData badgeType, @Nullable TextWithAltApiData textWithAltApiData) {
        String text;
        Intrinsics.h(label, "label");
        Intrinsics.h(badgeType, "badgeType");
        this.label = label;
        this.badgeType = badgeType;
        this.altLabel = textWithAltApiData;
        if (textWithAltApiData != null && (text = textWithAltApiData.getText()) != null) {
            label = text;
        }
        this.d = new PlainText(label);
        this.e = BadgeApiDataKt.a(badgeType);
    }

    /* renamed from: a, reason: from getter */
    public final BadgeTypeApiData getBadgeType() {
        return this.badgeType;
    }

    /* renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeApiData)) {
            return false;
        }
        BadgeApiData badgeApiData = (BadgeApiData) obj;
        return Intrinsics.c(this.label, badgeApiData.label) && this.badgeType == badgeApiData.badgeType && Intrinsics.c(this.altLabel, badgeApiData.altLabel);
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final Text getAccessibilityText() {
        String altText;
        TextWithAltApiData textWithAltApiData = this.altLabel;
        if (textWithAltApiData == null || (altText = textWithAltApiData.getAltText()) == null) {
            altText = this.label;
        }
        return new PlainText(altText);
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final Text getText() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final BrandLabelType getType() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.badgeType.hashCode() + (this.label.hashCode() * 31)) * 31;
        TextWithAltApiData textWithAltApiData = this.altLabel;
        return iHashCode + (textWithAltApiData == null ? 0 : textWithAltApiData.hashCode());
    }

    public final String toString() {
        return "BadgeApiData(label=" + this.label + ", badgeType=" + this.badgeType + ", altLabel=" + this.altLabel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.label);
        dest.writeString(this.badgeType.name());
        TextWithAltApiData textWithAltApiData = this.altLabel;
        if (textWithAltApiData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textWithAltApiData.writeToParcel(dest, i);
        }
    }
}
