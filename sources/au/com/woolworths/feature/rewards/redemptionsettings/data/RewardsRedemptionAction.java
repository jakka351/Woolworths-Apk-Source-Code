package au.com.woolworths.feature.rewards.redemptionsettings.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/data/RewardsRedemptionAction;", "", "", "iconUrl", "title", "body", "actionUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "b", "a", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsRedemptionAction {

    @SerializedName("actionUrl")
    @NotNull
    private final String actionUrl;

    @SerializedName("body")
    @NotNull
    private final String body;

    @SerializedName("iconUrl")
    @NotNull
    private final String iconUrl;

    @SerializedName("title")
    @NotNull
    private final String title;

    public RewardsRedemptionAction(@NotNull String iconUrl, @NotNull String title, @NotNull String body, @NotNull String actionUrl) {
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(body, "body");
        Intrinsics.h(actionUrl, "actionUrl");
        this.iconUrl = iconUrl;
        this.title = title;
        this.body = body;
        this.actionUrl = actionUrl;
    }

    /* renamed from: a, reason: from getter */
    public final String getActionUrl() {
        return this.actionUrl;
    }

    /* renamed from: b, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: c, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsRedemptionAction)) {
            return false;
        }
        RewardsRedemptionAction rewardsRedemptionAction = (RewardsRedemptionAction) obj;
        return Intrinsics.c(this.iconUrl, rewardsRedemptionAction.iconUrl) && Intrinsics.c(this.title, rewardsRedemptionAction.title) && Intrinsics.c(this.body, rewardsRedemptionAction.body) && Intrinsics.c(this.actionUrl, rewardsRedemptionAction.actionUrl);
    }

    public final int hashCode() {
        return this.actionUrl.hashCode() + b.c(b.c(this.iconUrl.hashCode() * 31, 31, this.title), 31, this.body);
    }

    public final String toString() {
        String str = this.iconUrl;
        String str2 = this.title;
        return a.l(YU.a.v("RewardsRedemptionAction(iconUrl=", str, ", title=", str2, ", body="), this.body, ", actionUrl=", this.actionUrl, ")");
    }
}
