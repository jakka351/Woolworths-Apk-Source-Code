package au.com.woolworths.base.shopapp.modules.badge;

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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/badge/BadgeBrandLabelType;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BadgeBrandLabelType implements BrandLabelType {

    @NotNull
    public static final Parcelable.Creator<BadgeBrandLabelType> CREATOR;
    public static final BadgeBrandLabelType d;
    public static final BadgeBrandLabelType e;
    public static final BadgeBrandLabelType f;
    public static final BadgeBrandLabelType g;
    public static final BadgeBrandLabelType h;
    public static final BadgeBrandLabelType i;
    public static final BadgeBrandLabelType j;
    public static final BadgeBrandLabelType k;
    public static final BadgeBrandLabelType l;
    public static final BadgeBrandLabelType m;
    public static final /* synthetic */ BadgeBrandLabelType[] n;
    public static final /* synthetic */ EnumEntries o;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BadgeBrandLabelType> {
        @Override // android.os.Parcelable.Creator
        public final BadgeBrandLabelType createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return BadgeBrandLabelType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeBrandLabelType[] newArray(int i) {
            return new BadgeBrandLabelType[i];
        }
    }

    static {
        BadgeBrandLabelType badgeBrandLabelType = new BadgeBrandLabelType() { // from class: au.com.woolworths.base.shopapp.modules.badge.BadgeBrandLabelType.ALWAYS
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.color_brand_always;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.color_brand_always;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.white;
            }
        };
        d = badgeBrandLabelType;
        BadgeBrandLabelType badgeBrandLabelType2 = new BadgeBrandLabelType() { // from class: au.com.woolworths.base.shopapp.modules.badge.BadgeBrandLabelType.DEFAULT
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.white;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.color_black_500;
            }
        };
        e = badgeBrandLabelType2;
        BadgeBrandLabelType badgeBrandLabelType3 = new BadgeBrandLabelType() { // from class: au.com.woolworths.base.shopapp.modules.badge.BadgeBrandLabelType.DISABLED
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.color_black_300;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.color_black_300;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.white;
            }
        };
        f = badgeBrandLabelType3;
        BadgeBrandLabelType badgeBrandLabelType4 = new BadgeBrandLabelType() { // from class: au.com.woolworths.base.shopapp.modules.badge.BadgeBrandLabelType.INFO
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.color_fill_info;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.color_fill_info;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.white;
            }
        };
        g = badgeBrandLabelType4;
        BadgeBrandLabelType badgeBrandLabelType5 = new BadgeBrandLabelType() { // from class: au.com.woolworths.base.shopapp.modules.badge.BadgeBrandLabelType.NEW
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.color_brand_new;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.color_brand_new;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.white;
            }
        };
        h = badgeBrandLabelType5;
        BadgeBrandLabelType badgeBrandLabelType6 = new BadgeBrandLabelType() { // from class: au.com.woolworths.base.shopapp.modules.badge.BadgeBrandLabelType.PRIMARY
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.color_accent;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.color_accent;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.white;
            }
        };
        i = badgeBrandLabelType6;
        BadgeBrandLabelType badgeBrandLabelType7 = new BadgeBrandLabelType() { // from class: au.com.woolworths.base.shopapp.modules.badge.BadgeBrandLabelType.REWARDS
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.color_fill_rewards;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.color_fill_rewards;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.white;
            }
        };
        j = badgeBrandLabelType7;
        BadgeBrandLabelType badgeBrandLabelType8 = new BadgeBrandLabelType() { // from class: au.com.woolworths.base.shopapp.modules.badge.BadgeBrandLabelType.SPECIAL
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.color_brand_specials;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.color_brand_specials;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.color_black_900;
            }
        };
        k = badgeBrandLabelType8;
        BadgeBrandLabelType badgeBrandLabelType9 = new BadgeBrandLabelType() { // from class: au.com.woolworths.base.shopapp.modules.badge.BadgeBrandLabelType.TEMPORARY
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.color_black_100;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.color_black_100;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.color_black_900;
            }
        };
        l = badgeBrandLabelType9;
        BadgeBrandLabelType badgeBrandLabelType10 = new BadgeBrandLabelType() { // from class: au.com.woolworths.base.shopapp.modules.badge.BadgeBrandLabelType.UNAVAILABLE
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.color_black_900;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.color_black_900;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColour() {
                return R.color.white;
            }
        };
        m = badgeBrandLabelType10;
        BadgeBrandLabelType[] badgeBrandLabelTypeArr = {badgeBrandLabelType, badgeBrandLabelType2, badgeBrandLabelType3, badgeBrandLabelType4, badgeBrandLabelType5, badgeBrandLabelType6, badgeBrandLabelType7, badgeBrandLabelType8, badgeBrandLabelType9, badgeBrandLabelType10};
        n = badgeBrandLabelTypeArr;
        o = EnumEntriesKt.a(badgeBrandLabelTypeArr);
        CREATOR = new Creator();
    }

    public static BadgeBrandLabelType valueOf(String str) {
        return (BadgeBrandLabelType) Enum.valueOf(BadgeBrandLabelType.class, str);
    }

    public static BadgeBrandLabelType[] values() {
        return (BadgeBrandLabelType[]) n.clone();
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
