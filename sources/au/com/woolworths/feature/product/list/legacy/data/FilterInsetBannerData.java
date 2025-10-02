package au.com.woolworths.feature.product.list.legacy.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.insetbanner.ActionPlacement;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.feature.product.list.legacy.ui.ChildFilterItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/FilterInsetBannerData;", "Landroid/os/Parcelable;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBanner;", "Lau/com/woolworths/feature/product/list/legacy/ui/ChildFilterItem;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilterInsetBannerData implements Parcelable, InsetBanner, ChildFilterItem {

    @NotNull
    public static final Parcelable.Creator<FilterInsetBannerData> CREATOR = new Creator();
    public final InlineErrorType d;
    public final Text e;
    public final Text f;
    public final ActionPlacement g;
    public final InlineErrorAction h;
    public String i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FilterInsetBannerData> {
        @Override // android.os.Parcelable.Creator
        public final FilterInsetBannerData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new FilterInsetBannerData(InlineErrorType.valueOf(parcel.readString()), (Text) parcel.readParcelable(FilterInsetBannerData.class.getClassLoader()), (Text) parcel.readParcelable(FilterInsetBannerData.class.getClassLoader()), parcel.readInt() == 0 ? null : ActionPlacement.valueOf(parcel.readString()), (InlineErrorAction) parcel.readParcelable(FilterInsetBannerData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FilterInsetBannerData[] newArray(int i) {
            return new FilterInsetBannerData[i];
        }
    }

    public FilterInsetBannerData(InlineErrorType errorType, Text text, Text messageText, ActionPlacement actionPlacement, InlineErrorAction action, String filterPageKey) {
        Intrinsics.h(errorType, "errorType");
        Intrinsics.h(messageText, "messageText");
        Intrinsics.h(action, "action");
        Intrinsics.h(filterPageKey, "filterPageKey");
        this.d = errorType;
        this.e = text;
        this.f = messageText;
        this.g = actionPlacement;
        this.h = action;
        this.i = filterPageKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterInsetBannerData)) {
            return false;
        }
        FilterInsetBannerData filterInsetBannerData = (FilterInsetBannerData) obj;
        return this.d == filterInsetBannerData.d && Intrinsics.c(this.e, filterInsetBannerData.e) && Intrinsics.c(this.f, filterInsetBannerData.f) && this.g == filterInsetBannerData.g && Intrinsics.c(this.h, filterInsetBannerData.h) && Intrinsics.c(this.i, filterInsetBannerData.i);
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* renamed from: getAction, reason: from getter */
    public final InlineErrorAction getH() {
        return this.h;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* renamed from: getErrorType, reason: from getter */
    public final InlineErrorType getD() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* renamed from: getMessageText, reason: from getter */
    public final Text getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner
    /* renamed from: getPlacement, reason: from getter */
    public final ActionPlacement getG() {
        return this.g;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner
    /* renamed from: getTitle, reason: from getter */
    public final Text getE() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        Text text = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (text == null ? 0 : text.hashCode())) * 31)) * 31;
        ActionPlacement actionPlacement = this.g;
        return this.i.hashCode() + ((this.h.hashCode() + ((iHashCode2 + (actionPlacement != null ? actionPlacement.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "FilterInsetBannerData(errorType=" + this.d + ", title=" + this.e + ", messageText=" + this.f + ", placement=" + this.g + ", action=" + this.h + ", filterPageKey=" + this.i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        ActionPlacement actionPlacement = this.g;
        if (actionPlacement == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(actionPlacement.name());
        }
        dest.writeParcelable(this.h, i);
        dest.writeString(this.i);
    }
}
