package au.com.woolworths.android.onesite.modules.main;

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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/ChangeBrandLabelType;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ChangeBrandLabelType implements BrandLabelType {

    @NotNull
    public static final Parcelable.Creator<ChangeBrandLabelType> CREATOR;
    public static final ChangeBrandLabelType d;
    public static final /* synthetic */ ChangeBrandLabelType[] e;
    public static final /* synthetic */ EnumEntries f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChangeBrandLabelType> {
        @Override // android.os.Parcelable.Creator
        public final ChangeBrandLabelType createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return ChangeBrandLabelType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChangeBrandLabelType[] newArray(int i) {
            return new ChangeBrandLabelType[i];
        }
    }

    static {
        ChangeBrandLabelType changeBrandLabelType = new ChangeBrandLabelType() { // from class: au.com.woolworths.android.onesite.modules.main.ChangeBrandLabelType.CHANGE
            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBackgroundColour() {
                return R.color.white;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getBorderColour() {
                return R.color.color_accent;
            }

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
            public final int getTextColourAttr() {
                return R.attr.colorPrimary;
            }
        };
        d = changeBrandLabelType;
        ChangeBrandLabelType[] changeBrandLabelTypeArr = {changeBrandLabelType};
        e = changeBrandLabelTypeArr;
        f = EnumEntriesKt.a(changeBrandLabelTypeArr);
        CREATOR = new Creator();
    }

    public static ChangeBrandLabelType valueOf(String str) {
        return (ChangeBrandLabelType) Enum.valueOf(ChangeBrandLabelType.class, str);
    }

    public static ChangeBrandLabelType[] values() {
        return (ChangeBrandLabelType[]) e.clone();
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
