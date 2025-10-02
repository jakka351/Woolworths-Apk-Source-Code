package au.com.woolworths.shop.checkout.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.google.gson.annotations.SerializedName;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/BadgeType;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS", "RESTRICTION", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BadgeType implements BrandLabelType {

    @NotNull
    public static final Parcelable.Creator<BadgeType> CREATOR;

    @SerializedName("RESTRICTION")
    public static final BadgeType RESTRICTION;

    @SerializedName("STATUS")
    public static final BadgeType STATUS;
    public static final /* synthetic */ BadgeType[] d;
    public static final /* synthetic */ EnumEntries e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BadgeType> {
        @Override // android.os.Parcelable.Creator
        public final BadgeType createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return BadgeType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeType[] newArray(int i) {
            return new BadgeType[i];
        }
    }

    static {
        BadgeType badgeType = new BadgeType() { // from class: au.com.woolworths.shop.checkout.domain.model.BadgeType.STATUS
            public final int f = R.color.white;
            public final int g = R.color.badge_status_border;
            public final int h = R.color.badge_status_text;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            /* renamed from: getBackgroundColour, reason: from getter */
            public final int getF() {
                return this.f;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            /* renamed from: getBorderColour, reason: from getter */
            public final int getG() {
                return this.g;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            /* renamed from: getTextColour, reason: from getter */
            public final int getH() {
                return this.h;
            }
        };
        STATUS = badgeType;
        BadgeType badgeType2 = new BadgeType() { // from class: au.com.woolworths.shop.checkout.domain.model.BadgeType.RESTRICTION
            public final int f = R.color.white;
            public final int g = R.color.badge_restriction_border;
            public final int h = R.color.badge_restriction_text;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            /* renamed from: getBackgroundColour, reason: from getter */
            public final int getF() {
                return this.f;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            /* renamed from: getBorderColour, reason: from getter */
            public final int getG() {
                return this.g;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            /* renamed from: getTextColour, reason: from getter */
            public final int getH() {
                return this.h;
            }
        };
        RESTRICTION = badgeType2;
        BadgeType[] badgeTypeArr = {badgeType, badgeType2, new BadgeType() { // from class: au.com.woolworths.shop.checkout.domain.model.BadgeType.UNKNOWN
            public final int f = R.color.white;
            public final int g = R.color.badge_default_border;
            public final int h = R.color.badge_default_text;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            /* renamed from: getBackgroundColour, reason: from getter */
            public final int getF() {
                return this.f;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            /* renamed from: getBorderColour, reason: from getter */
            public final int getG() {
                return this.g;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            /* renamed from: getTextColour, reason: from getter */
            public final int getH() {
                return this.h;
            }
        }};
        d = badgeTypeArr;
        e = EnumEntriesKt.a(badgeTypeArr);
        CREATOR = new Creator();
    }

    public /* synthetic */ BadgeType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static BadgeType valueOf(String str) {
        return (BadgeType) Enum.valueOf(BadgeType.class, str);
    }

    public static BadgeType[] values() {
        return (BadgeType[]) d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }

    private BadgeType(String str, int i) {
    }
}
