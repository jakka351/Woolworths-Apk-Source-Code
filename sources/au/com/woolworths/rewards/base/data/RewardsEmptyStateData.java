package au.com.woolworths.rewards.base.data;

import androidx.annotation.DrawableRes;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsEmptyStateData;", "", BarcodePickDeserializer.FIELD_ICON, "", "title", "", "message", "button", "Lau/com/woolworths/rewards/base/data/EmptyStateButtonData;", "iconUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lau/com/woolworths/rewards/base/data/EmptyStateButtonData;Ljava/lang/String;)V", "getIcon", "()I", "getTitle", "()Ljava/lang/String;", "getMessage", "getButton", "()Lau/com/woolworths/rewards/base/data/EmptyStateButtonData;", "getIconUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsEmptyStateData {
    public static final int $stable = 0;

    @Nullable
    private final EmptyStateButtonData button;
    private final int icon;

    @Nullable
    private final String iconUrl;

    @NotNull
    private final String message;

    @NotNull
    private final String title;

    public RewardsEmptyStateData(@DrawableRes int i, @NotNull String title, @NotNull String message, @Nullable EmptyStateButtonData emptyStateButtonData, @Nullable String str) {
        Intrinsics.h(title, "title");
        Intrinsics.h(message, "message");
        this.icon = i;
        this.title = title;
        this.message = message;
        this.button = emptyStateButtonData;
        this.iconUrl = str;
    }

    public static /* synthetic */ RewardsEmptyStateData copy$default(RewardsEmptyStateData rewardsEmptyStateData, int i, String str, String str2, EmptyStateButtonData emptyStateButtonData, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rewardsEmptyStateData.icon;
        }
        if ((i2 & 2) != 0) {
            str = rewardsEmptyStateData.title;
        }
        if ((i2 & 4) != 0) {
            str2 = rewardsEmptyStateData.message;
        }
        if ((i2 & 8) != 0) {
            emptyStateButtonData = rewardsEmptyStateData.button;
        }
        if ((i2 & 16) != 0) {
            str3 = rewardsEmptyStateData.iconUrl;
        }
        String str4 = str3;
        String str5 = str2;
        return rewardsEmptyStateData.copy(i, str, str5, emptyStateButtonData, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final EmptyStateButtonData getButton() {
        return this.button;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final RewardsEmptyStateData copy(@DrawableRes int icon, @NotNull String title, @NotNull String message, @Nullable EmptyStateButtonData button, @Nullable String iconUrl) {
        Intrinsics.h(title, "title");
        Intrinsics.h(message, "message");
        return new RewardsEmptyStateData(icon, title, message, button, iconUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsEmptyStateData)) {
            return false;
        }
        RewardsEmptyStateData rewardsEmptyStateData = (RewardsEmptyStateData) other;
        return this.icon == rewardsEmptyStateData.icon && Intrinsics.c(this.title, rewardsEmptyStateData.title) && Intrinsics.c(this.message, rewardsEmptyStateData.message) && Intrinsics.c(this.button, rewardsEmptyStateData.button) && Intrinsics.c(this.iconUrl, rewardsEmptyStateData.iconUrl);
    }

    @Nullable
    public final EmptyStateButtonData getButton() {
        return this.button;
    }

    public final int getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = b.c(b.c(Integer.hashCode(this.icon) * 31, 31, this.title), 31, this.message);
        EmptyStateButtonData emptyStateButtonData = this.button;
        int iHashCode = (iC + (emptyStateButtonData == null ? 0 : emptyStateButtonData.hashCode())) * 31;
        String str = this.iconUrl;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.icon;
        String str = this.title;
        String str2 = this.message;
        EmptyStateButtonData emptyStateButtonData = this.button;
        String str3 = this.iconUrl;
        StringBuilder sbP = a.p("RewardsEmptyStateData(icon=", i, ", title=", str, ", message=");
        sbP.append(str2);
        sbP.append(", button=");
        sbP.append(emptyStateButtonData);
        sbP.append(", iconUrl=");
        return YU.a.o(sbP, str3, ")");
    }

    public /* synthetic */ RewardsEmptyStateData(int i, String str, String str2, EmptyStateButtonData emptyStateButtonData, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : emptyStateButtonData, (i2 & 16) != 0 ? null : str3);
    }
}
