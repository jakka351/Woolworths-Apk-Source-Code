package au.com.woolworths.feature.shop.more.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/more/data/MoreNotifications;", "", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getSubtitle", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MoreNotifications {

    @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    public MoreNotifications(@NotNull String title, @Nullable String str) {
        Intrinsics.h(title, "title");
        this.title = title;
        this.subtitle = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreNotifications)) {
            return false;
        }
        MoreNotifications moreNotifications = (MoreNotifications) obj;
        return Intrinsics.c(this.title, moreNotifications.title) && Intrinsics.c(this.subtitle, moreNotifications.subtitle);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.j("MoreNotifications(title=", this.title, ", subtitle=", this.subtitle, ")");
    }
}
