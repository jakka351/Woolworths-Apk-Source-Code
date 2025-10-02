package au.com.woolworths.android.onesite.modules.insetbanner;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BJ\u0012\r\u0010\u0003\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000b\u0010\b\u001a\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000b\u0010\r\u001a\u00070\u000e¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001c\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000e\u0010\u001e\u001a\u00070\u0004¢\u0006\u0002\b\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\u000e\u0010!\u001a\u00070\u000e¢\u0006\u0002\b\u0005HÆ\u0003JX\u0010\"\u001a\u00020\u00002\u000f\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\r\b\u0002\u0010\b\u001a\u00070\u0004¢\u0006\u0002\b\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\r\b\u0002\u0010\r\u001a\u00070\u000e¢\u0006\u0002\b\u0005HÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020$R\u001b\u0010\u0003\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00070\u0004¢\u0006\u0002\b\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\r\u001a\u00070\u000e¢\u0006\u0002\b\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerData;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBanner;", "Landroid/os/Parcelable;", "title", "Lau/com/woolworths/android/onesite/models/text/Text;", "Lkotlinx/parcelize/RawValue;", "placement", "Lau/com/woolworths/android/onesite/modules/insetbanner/ActionPlacement;", "messageText", UrlHandler.ACTION, "Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction;", "errorType", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorType;", "iconConfig", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig;", "<init>", "(Lau/com/woolworths/android/onesite/models/text/Text;Lau/com/woolworths/android/onesite/modules/insetbanner/ActionPlacement;Lau/com/woolworths/android/onesite/models/text/Text;Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction;Lau/com/woolworths/android/onesite/modules/common/InlineErrorType;Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig;)V", "getTitle", "()Lau/com/woolworths/android/onesite/models/text/Text;", "getPlacement", "()Lau/com/woolworths/android/onesite/modules/insetbanner/ActionPlacement;", "getMessageText", "getAction", "()Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction;", "getErrorType", "()Lau/com/woolworths/android/onesite/modules/common/InlineErrorType;", "getIconConfig", "()Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InsetBannerData implements InsetBanner, Parcelable {

    @NotNull
    public static final Parcelable.Creator<InsetBannerData> CREATOR = new Creator();

    @NotNull
    private final InlineErrorAction action;

    @NotNull
    private final InlineErrorType errorType;

    @NotNull
    private final InlineErrorCause.IconConfig iconConfig;

    @NotNull
    private final Text messageText;

    @Nullable
    private final ActionPlacement placement;

    @Nullable
    private final Text title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InsetBannerData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsetBannerData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new InsetBannerData((Text) parcel.readParcelable(InsetBannerData.class.getClassLoader()), parcel.readInt() == 0 ? null : ActionPlacement.valueOf(parcel.readString()), (Text) parcel.readParcelable(InsetBannerData.class.getClassLoader()), (InlineErrorAction) parcel.readParcelable(InsetBannerData.class.getClassLoader()), InlineErrorType.valueOf(parcel.readString()), (InlineErrorCause.IconConfig) parcel.readParcelable(InsetBannerData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsetBannerData[] newArray(int i) {
            return new InsetBannerData[i];
        }
    }

    public InsetBannerData(@Nullable Text text, @Nullable ActionPlacement actionPlacement, @NotNull Text messageText, @NotNull InlineErrorAction action, @NotNull InlineErrorType errorType, @NotNull InlineErrorCause.IconConfig iconConfig) {
        Intrinsics.h(messageText, "messageText");
        Intrinsics.h(action, "action");
        Intrinsics.h(errorType, "errorType");
        Intrinsics.h(iconConfig, "iconConfig");
        this.title = text;
        this.placement = actionPlacement;
        this.messageText = messageText;
        this.action = action;
        this.errorType = errorType;
        this.iconConfig = iconConfig;
    }

    public static /* synthetic */ InsetBannerData copy$default(InsetBannerData insetBannerData, Text text, ActionPlacement actionPlacement, Text text2, InlineErrorAction inlineErrorAction, InlineErrorType inlineErrorType, InlineErrorCause.IconConfig iconConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            text = insetBannerData.title;
        }
        if ((i & 2) != 0) {
            actionPlacement = insetBannerData.placement;
        }
        if ((i & 4) != 0) {
            text2 = insetBannerData.messageText;
        }
        if ((i & 8) != 0) {
            inlineErrorAction = insetBannerData.action;
        }
        if ((i & 16) != 0) {
            inlineErrorType = insetBannerData.errorType;
        }
        if ((i & 32) != 0) {
            iconConfig = insetBannerData.iconConfig;
        }
        InlineErrorType inlineErrorType2 = inlineErrorType;
        InlineErrorCause.IconConfig iconConfig2 = iconConfig;
        return insetBannerData.copy(text, actionPlacement, text2, inlineErrorAction, inlineErrorType2, iconConfig2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ActionPlacement getPlacement() {
        return this.placement;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Text getMessageText() {
        return this.messageText;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final InlineErrorAction getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final InlineErrorType getErrorType() {
        return this.errorType;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final InlineErrorCause.IconConfig getIconConfig() {
        return this.iconConfig;
    }

    @NotNull
    public final InsetBannerData copy(@Nullable Text title, @Nullable ActionPlacement placement, @NotNull Text messageText, @NotNull InlineErrorAction action, @NotNull InlineErrorType errorType, @NotNull InlineErrorCause.IconConfig iconConfig) {
        Intrinsics.h(messageText, "messageText");
        Intrinsics.h(action, "action");
        Intrinsics.h(errorType, "errorType");
        Intrinsics.h(iconConfig, "iconConfig");
        return new InsetBannerData(title, placement, messageText, action, errorType, iconConfig);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetBannerData)) {
            return false;
        }
        InsetBannerData insetBannerData = (InsetBannerData) other;
        return Intrinsics.c(this.title, insetBannerData.title) && this.placement == insetBannerData.placement && Intrinsics.c(this.messageText, insetBannerData.messageText) && Intrinsics.c(this.action, insetBannerData.action) && this.errorType == insetBannerData.errorType && Intrinsics.c(this.iconConfig, insetBannerData.iconConfig);
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    @NotNull
    public InlineErrorAction getAction() {
        return this.action;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    @NotNull
    /* renamed from: getErrorType */
    public InlineErrorType getE() {
        return this.errorType;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    @NotNull
    /* renamed from: getIconConfig */
    public InlineErrorCause.IconConfig getF() {
        return this.iconConfig;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    @NotNull
    public Text getMessageText() {
        return this.messageText;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner
    @Nullable
    public ActionPlacement getPlacement() {
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
    public Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        Text text = this.title;
        int iHashCode = (text == null ? 0 : text.hashCode()) * 31;
        ActionPlacement actionPlacement = this.placement;
        return this.iconConfig.hashCode() + ((this.errorType.hashCode() + ((this.action.hashCode() + ((this.messageText.hashCode() + ((iHashCode + (actionPlacement != null ? actionPlacement.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "InsetBannerData(title=" + this.title + ", placement=" + this.placement + ", messageText=" + this.messageText + ", action=" + this.action + ", errorType=" + this.errorType + ", iconConfig=" + this.iconConfig + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.title, flags);
        ActionPlacement actionPlacement = this.placement;
        if (actionPlacement == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(actionPlacement.name());
        }
        dest.writeParcelable(this.messageText, flags);
        dest.writeParcelable(this.action, flags);
        dest.writeString(this.errorType.name());
        dest.writeParcelable(this.iconConfig, flags);
    }
}
