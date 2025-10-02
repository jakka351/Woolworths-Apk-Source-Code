package au.com.woolworths.android.onesite.modules.insetbanner;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006'"}, d2 = {"Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionApiData;", "Landroid/os/Parcelable;", AnnotatedPrivateKey.LABEL, "", "url", "actionType", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionTypeApiData;", "placement", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionPlacementTypeApiData;", "actionAccessibilityHint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionTypeApiData;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionPlacementTypeApiData;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getUrl", "getActionType", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionTypeApiData;", "getPlacement", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionPlacementTypeApiData;", "getActionAccessibilityHint", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InsetBannerActionApiData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InsetBannerActionApiData> CREATOR = new Creator();

    @SerializedName("actionAccessibilityHint")
    @Nullable
    private final String actionAccessibilityHint;

    @SerializedName("type")
    @MappedName
    @NotNull
    private final InsetBannerActionTypeApiData actionType;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    @SerializedName("placement")
    @NotNull
    private final InsetBannerActionPlacementTypeApiData placement;

    @SerializedName("url")
    @Nullable
    private final String url;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InsetBannerActionApiData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsetBannerActionApiData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new InsetBannerActionApiData(parcel.readString(), parcel.readString(), InsetBannerActionTypeApiData.valueOf(parcel.readString()), InsetBannerActionPlacementTypeApiData.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsetBannerActionApiData[] newArray(int i) {
            return new InsetBannerActionApiData[i];
        }
    }

    public InsetBannerActionApiData(@NotNull String label, @Nullable String str, @NotNull InsetBannerActionTypeApiData actionType, @NotNull InsetBannerActionPlacementTypeApiData placement, @Nullable String str2) {
        Intrinsics.h(label, "label");
        Intrinsics.h(actionType, "actionType");
        Intrinsics.h(placement, "placement");
        this.label = label;
        this.url = str;
        this.actionType = actionType;
        this.placement = placement;
        this.actionAccessibilityHint = str2;
    }

    public static /* synthetic */ InsetBannerActionApiData copy$default(InsetBannerActionApiData insetBannerActionApiData, String str, String str2, InsetBannerActionTypeApiData insetBannerActionTypeApiData, InsetBannerActionPlacementTypeApiData insetBannerActionPlacementTypeApiData, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = insetBannerActionApiData.label;
        }
        if ((i & 2) != 0) {
            str2 = insetBannerActionApiData.url;
        }
        if ((i & 4) != 0) {
            insetBannerActionTypeApiData = insetBannerActionApiData.actionType;
        }
        if ((i & 8) != 0) {
            insetBannerActionPlacementTypeApiData = insetBannerActionApiData.placement;
        }
        if ((i & 16) != 0) {
            str3 = insetBannerActionApiData.actionAccessibilityHint;
        }
        String str4 = str3;
        InsetBannerActionTypeApiData insetBannerActionTypeApiData2 = insetBannerActionTypeApiData;
        return insetBannerActionApiData.copy(str, str2, insetBannerActionTypeApiData2, insetBannerActionPlacementTypeApiData, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InsetBannerActionTypeApiData getActionType() {
        return this.actionType;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final InsetBannerActionPlacementTypeApiData getPlacement() {
        return this.placement;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getActionAccessibilityHint() {
        return this.actionAccessibilityHint;
    }

    @NotNull
    public final InsetBannerActionApiData copy(@NotNull String label, @Nullable String url, @NotNull InsetBannerActionTypeApiData actionType, @NotNull InsetBannerActionPlacementTypeApiData placement, @Nullable String actionAccessibilityHint) {
        Intrinsics.h(label, "label");
        Intrinsics.h(actionType, "actionType");
        Intrinsics.h(placement, "placement");
        return new InsetBannerActionApiData(label, url, actionType, placement, actionAccessibilityHint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetBannerActionApiData)) {
            return false;
        }
        InsetBannerActionApiData insetBannerActionApiData = (InsetBannerActionApiData) other;
        return Intrinsics.c(this.label, insetBannerActionApiData.label) && Intrinsics.c(this.url, insetBannerActionApiData.url) && this.actionType == insetBannerActionApiData.actionType && this.placement == insetBannerActionApiData.placement && Intrinsics.c(this.actionAccessibilityHint, insetBannerActionApiData.actionAccessibilityHint);
    }

    @Nullable
    public final String getActionAccessibilityHint() {
        return this.actionAccessibilityHint;
    }

    @NotNull
    public final InsetBannerActionTypeApiData getActionType() {
        return this.actionType;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final InsetBannerActionPlacementTypeApiData getPlacement() {
        return this.placement;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        String str = this.url;
        int iHashCode2 = (this.placement.hashCode() + ((this.actionType.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.actionAccessibilityHint;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.label;
        String str2 = this.url;
        InsetBannerActionTypeApiData insetBannerActionTypeApiData = this.actionType;
        InsetBannerActionPlacementTypeApiData insetBannerActionPlacementTypeApiData = this.placement;
        String str3 = this.actionAccessibilityHint;
        StringBuilder sbV = a.v("InsetBannerActionApiData(label=", str, ", url=", str2, ", actionType=");
        sbV.append(insetBannerActionTypeApiData);
        sbV.append(", placement=");
        sbV.append(insetBannerActionPlacementTypeApiData);
        sbV.append(", actionAccessibilityHint=");
        return a.o(sbV, str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.label);
        dest.writeString(this.url);
        dest.writeString(this.actionType.name());
        dest.writeString(this.placement.name());
        dest.writeString(this.actionAccessibilityHint);
    }
}
