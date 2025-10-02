package au.com.woolworths.feature.shop.notification.preferences.controller;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/controller/NotificationLabelType;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationLabelType implements BrandLabelType {

    @NotNull
    public static final Parcelable.Creator<NotificationLabelType> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationLabelType> {
        @Override // android.os.Parcelable.Creator
        public final NotificationLabelType createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            parcel.readInt();
            return new NotificationLabelType();
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationLabelType[] newArray(int i) {
            return new NotificationLabelType[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    public final int getBackgroundColour() {
        return R.color.color_black_50;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    public final int getBorderColour() {
        return R.color.color_black_50;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    public final int getTextColourAttr() {
        return android.R.attr.textColorSecondary;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(1);
    }
}
