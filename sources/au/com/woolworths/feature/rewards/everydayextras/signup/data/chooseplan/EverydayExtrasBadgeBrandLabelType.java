package au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan;

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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/chooseplan/EverydayExtrasBadgeBrandLabelType;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EverydayExtrasBadgeBrandLabelType implements BrandLabelType {

    @NotNull
    public static final Parcelable.Creator<EverydayExtrasBadgeBrandLabelType> CREATOR;
    public static final EverydayExtrasBadgeBrandLabelType d;
    public static final /* synthetic */ EverydayExtrasBadgeBrandLabelType[] e;
    public static final /* synthetic */ EnumEntries f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EverydayExtrasBadgeBrandLabelType> {
        @Override // android.os.Parcelable.Creator
        public final EverydayExtrasBadgeBrandLabelType createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return EverydayExtrasBadgeBrandLabelType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EverydayExtrasBadgeBrandLabelType[] newArray(int i) {
            return new EverydayExtrasBadgeBrandLabelType[i];
        }
    }

    static {
        EverydayExtrasBadgeBrandLabelType everydayExtrasBadgeBrandLabelType = new EverydayExtrasBadgeBrandLabelType() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasBadgeBrandLabelType.SPECIAL
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
        d = everydayExtrasBadgeBrandLabelType;
        EverydayExtrasBadgeBrandLabelType[] everydayExtrasBadgeBrandLabelTypeArr = {everydayExtrasBadgeBrandLabelType};
        e = everydayExtrasBadgeBrandLabelTypeArr;
        f = EnumEntriesKt.a(everydayExtrasBadgeBrandLabelTypeArr);
        CREATOR = new Creator();
    }

    public static EverydayExtrasBadgeBrandLabelType valueOf(String str) {
        return (EverydayExtrasBadgeBrandLabelType) Enum.valueOf(EverydayExtrasBadgeBrandLabelType.class, str);
    }

    public static EverydayExtrasBadgeBrandLabelType[] values() {
        return (EverydayExtrasBadgeBrandLabelType[]) e.clone();
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
}
