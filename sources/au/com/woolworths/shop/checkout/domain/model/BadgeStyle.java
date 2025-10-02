package au.com.woolworths.shop.checkout.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/BadgeStyle;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BadgeStyle implements BrandLabelType {

    @NotNull
    public static final Parcelable.Creator<BadgeStyle> CREATOR;
    public static final BadgeStyle d;
    public static final BadgeStyle e;
    public static final BadgeStyle f;
    public static final BadgeStyle g;
    public static final /* synthetic */ BadgeStyle[] h;
    public static final /* synthetic */ EnumEntries i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BadgeStyle> {
        @Override // android.os.Parcelable.Creator
        public final BadgeStyle createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return BadgeStyle.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeStyle[] newArray(int i) {
            return new BadgeStyle[i];
        }
    }

    static {
        BadgeStyle badgeStyle = new BadgeStyle() { // from class: au.com.woolworths.shop.checkout.domain.model.BadgeStyle.PLAIN
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.white;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.badge_status_border;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.badge_status_text;
            }
        };
        d = badgeStyle;
        BadgeStyle badgeStyle2 = new BadgeStyle() { // from class: au.com.woolworths.shop.checkout.domain.model.BadgeStyle.PRIMARY
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.white;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.badge_primary_border;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.badge_primary_text;
            }
        };
        e = badgeStyle2;
        BadgeStyle badgeStyle3 = new BadgeStyle() { // from class: au.com.woolworths.shop.checkout.domain.model.BadgeStyle.PRIMARY_SOLID
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.color_tint_primary;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.badge_primary_border;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.badge_primary_text;
            }
        };
        f = badgeStyle3;
        BadgeStyle badgeStyle4 = new BadgeStyle() { // from class: au.com.woolworths.shop.checkout.domain.model.BadgeStyle.DEFAULT
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.white;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.badge_default_border;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.badge_default_text;
            }
        };
        g = badgeStyle4;
        BadgeStyle[] badgeStyleArr = {badgeStyle, badgeStyle2, badgeStyle3, badgeStyle4};
        h = badgeStyleArr;
        i = EnumEntriesKt.a(badgeStyleArr);
        CREATOR = new Creator();
    }

    public static BadgeStyle valueOf(String str) {
        return (BadgeStyle) Enum.valueOf(BadgeStyle.class, str);
    }

    public static BadgeStyle[] values() {
        return (BadgeStyle[]) h.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}
