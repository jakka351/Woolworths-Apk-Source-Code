package au.com.woolworths.feature.product.list.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.insetbanner.ActionPlacement;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.feature.product.list.ui.ChildFilterItem;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003JI\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020&HÖ\u0001J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00062"}, d2 = {"Lau/com/woolworths/feature/product/list/data/FilterInsetBannerData;", "Landroid/os/Parcelable;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBanner;", "Lau/com/woolworths/feature/product/list/ui/ChildFilterItem;", "errorType", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorType;", "title", "Lau/com/woolworths/android/onesite/models/text/Text;", "messageText", "placement", "Lau/com/woolworths/android/onesite/modules/insetbanner/ActionPlacement;", UrlHandler.ACTION, "Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction;", "filterPageKey", "", "<init>", "(Lau/com/woolworths/android/onesite/modules/common/InlineErrorType;Lau/com/woolworths/android/onesite/models/text/Text;Lau/com/woolworths/android/onesite/models/text/Text;Lau/com/woolworths/android/onesite/modules/insetbanner/ActionPlacement;Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction;Ljava/lang/String;)V", "getErrorType", "()Lau/com/woolworths/android/onesite/modules/common/InlineErrorType;", "getTitle", "()Lau/com/woolworths/android/onesite/models/text/Text;", "getMessageText", "getPlacement", "()Lau/com/woolworths/android/onesite/modules/insetbanner/ActionPlacement;", "getAction", "()Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction;", "getFilterPageKey", "()Ljava/lang/String;", "setFilterPageKey", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilterInsetBannerData implements Parcelable, InsetBanner, ChildFilterItem {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FilterInsetBannerData> CREATOR = new Creator();

    @NotNull
    private final InlineErrorAction action;

    @NotNull
    private final InlineErrorType errorType;

    @NotNull
    private String filterPageKey;

    @NotNull
    private final Text messageText;

    @Nullable
    private final ActionPlacement placement;

    @Nullable
    private final Text title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FilterInsetBannerData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterInsetBannerData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new FilterInsetBannerData(InlineErrorType.valueOf(parcel.readString()), (Text) parcel.readParcelable(FilterInsetBannerData.class.getClassLoader()), (Text) parcel.readParcelable(FilterInsetBannerData.class.getClassLoader()), parcel.readInt() == 0 ? null : ActionPlacement.valueOf(parcel.readString()), (InlineErrorAction) parcel.readParcelable(FilterInsetBannerData.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterInsetBannerData[] newArray(int i) {
            return new FilterInsetBannerData[i];
        }
    }

    public FilterInsetBannerData(@NotNull InlineErrorType errorType, @Nullable Text text, @NotNull Text messageText, @Nullable ActionPlacement actionPlacement, @NotNull InlineErrorAction action, @NotNull String filterPageKey) {
        Intrinsics.h(errorType, "errorType");
        Intrinsics.h(messageText, "messageText");
        Intrinsics.h(action, "action");
        Intrinsics.h(filterPageKey, "filterPageKey");
        this.errorType = errorType;
        this.title = text;
        this.messageText = messageText;
        this.placement = actionPlacement;
        this.action = action;
        this.filterPageKey = filterPageKey;
    }

    public static /* synthetic */ FilterInsetBannerData copy$default(FilterInsetBannerData filterInsetBannerData, InlineErrorType inlineErrorType, Text text, Text text2, ActionPlacement actionPlacement, InlineErrorAction inlineErrorAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            inlineErrorType = filterInsetBannerData.errorType;
        }
        if ((i & 2) != 0) {
            text = filterInsetBannerData.title;
        }
        if ((i & 4) != 0) {
            text2 = filterInsetBannerData.messageText;
        }
        if ((i & 8) != 0) {
            actionPlacement = filterInsetBannerData.placement;
        }
        if ((i & 16) != 0) {
            inlineErrorAction = filterInsetBannerData.action;
        }
        if ((i & 32) != 0) {
            str = filterInsetBannerData.filterPageKey;
        }
        InlineErrorAction inlineErrorAction2 = inlineErrorAction;
        String str2 = str;
        return filterInsetBannerData.copy(inlineErrorType, text, text2, actionPlacement, inlineErrorAction2, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InlineErrorType getErrorType() {
        return this.errorType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Text getMessageText() {
        return this.messageText;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ActionPlacement getPlacement() {
        return this.placement;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final InlineErrorAction getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getFilterPageKey() {
        return this.filterPageKey;
    }

    @NotNull
    public final FilterInsetBannerData copy(@NotNull InlineErrorType errorType, @Nullable Text title, @NotNull Text messageText, @Nullable ActionPlacement placement, @NotNull InlineErrorAction action, @NotNull String filterPageKey) {
        Intrinsics.h(errorType, "errorType");
        Intrinsics.h(messageText, "messageText");
        Intrinsics.h(action, "action");
        Intrinsics.h(filterPageKey, "filterPageKey");
        return new FilterInsetBannerData(errorType, title, messageText, placement, action, filterPageKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterInsetBannerData)) {
            return false;
        }
        FilterInsetBannerData filterInsetBannerData = (FilterInsetBannerData) other;
        return this.errorType == filterInsetBannerData.errorType && Intrinsics.c(this.title, filterInsetBannerData.title) && Intrinsics.c(this.messageText, filterInsetBannerData.messageText) && this.placement == filterInsetBannerData.placement && Intrinsics.c(this.action, filterInsetBannerData.action) && Intrinsics.c(this.filterPageKey, filterInsetBannerData.filterPageKey);
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    @NotNull
    /* renamed from: getAction */
    public InlineErrorAction getH() {
        return this.action;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    @NotNull
    /* renamed from: getErrorType */
    public InlineErrorType getD() {
        return this.errorType;
    }

    @NotNull
    public final String getFilterPageKey() {
        return this.filterPageKey;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    @NotNull
    /* renamed from: getIconConfig */
    public /* bridge */ /* synthetic */ InlineErrorCause.IconConfig getF() {
        return InlineErrorCause.IconConfig.Default.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    @NotNull
    /* renamed from: getMessageText */
    public Text getF() {
        return this.messageText;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner
    @Nullable
    /* renamed from: getPlacement */
    public ActionPlacement getG() {
        return this.placement;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    public /* bridge */ /* synthetic */ boolean getShowAction() {
        return super.getShowAction();
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    public /* bridge */ /* synthetic */ boolean getShowBorder() {
        return true;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner
    @Nullable
    /* renamed from: getTitle */
    public Text getE() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.errorType.hashCode() * 31;
        Text text = this.title;
        int iHashCode2 = (this.messageText.hashCode() + ((iHashCode + (text == null ? 0 : text.hashCode())) * 31)) * 31;
        ActionPlacement actionPlacement = this.placement;
        return this.filterPageKey.hashCode() + ((this.action.hashCode() + ((iHashCode2 + (actionPlacement != null ? actionPlacement.hashCode() : 0)) * 31)) * 31);
    }

    public final void setFilterPageKey(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.filterPageKey = str;
    }

    @NotNull
    public String toString() {
        return "FilterInsetBannerData(errorType=" + this.errorType + ", title=" + this.title + ", messageText=" + this.messageText + ", placement=" + this.placement + ", action=" + this.action + ", filterPageKey=" + this.filterPageKey + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.errorType.name());
        dest.writeParcelable(this.title, flags);
        dest.writeParcelable(this.messageText, flags);
        ActionPlacement actionPlacement = this.placement;
        if (actionPlacement == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(actionPlacement.name());
        }
        dest.writeParcelable(this.action, flags);
        dest.writeString(this.filterPageKey);
    }

    public /* synthetic */ FilterInsetBannerData(InlineErrorType inlineErrorType, Text text, Text text2, ActionPlacement actionPlacement, InlineErrorAction inlineErrorAction, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inlineErrorType, text, text2, actionPlacement, inlineErrorAction, (i & 32) != 0 ? "" : str);
    }
}
