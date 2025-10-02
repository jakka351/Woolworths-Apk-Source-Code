package au.com.woolworths.rewards.base.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsAppLink;", "", UrlHandler.ACTION, "Lau/com/woolworths/rewards/base/data/LinkAction;", "url", "", "<init>", "(Lau/com/woolworths/rewards/base/data/LinkAction;Ljava/lang/String;)V", "getAction", "()Lau/com/woolworths/rewards/base/data/LinkAction;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsAppLink {
    public static final int $stable = 0;

    @SerializedName(UrlHandler.ACTION)
    @NotNull
    private final LinkAction action;

    @SerializedName("url")
    @NotNull
    private final String url;

    public RewardsAppLink(@NotNull LinkAction action, @NotNull String url) {
        Intrinsics.h(action, "action");
        Intrinsics.h(url, "url");
        this.action = action;
        this.url = url;
    }

    public static /* synthetic */ RewardsAppLink copy$default(RewardsAppLink rewardsAppLink, LinkAction linkAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            linkAction = rewardsAppLink.action;
        }
        if ((i & 2) != 0) {
            str = rewardsAppLink.url;
        }
        return rewardsAppLink.copy(linkAction, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LinkAction getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final RewardsAppLink copy(@NotNull LinkAction action, @NotNull String url) {
        Intrinsics.h(action, "action");
        Intrinsics.h(url, "url");
        return new RewardsAppLink(action, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsAppLink)) {
            return false;
        }
        RewardsAppLink rewardsAppLink = (RewardsAppLink) other;
        return this.action == rewardsAppLink.action && Intrinsics.c(this.url, rewardsAppLink.url);
    }

    @NotNull
    public final LinkAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.action.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RewardsAppLink(action=" + this.action + ", url=" + this.url + ")";
    }
}
