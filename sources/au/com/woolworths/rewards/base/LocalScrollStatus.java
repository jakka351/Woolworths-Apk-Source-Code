package au.com.woolworths.rewards.base;

import au.com.woolworths.rewards.base.RewardsPageScrollManager;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/base/LocalScrollStatus;", "", "Companion", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LocalScrollStatus {
    public static final WeakHashMap d = new WeakHashMap();
    public static LocalScrollStatus e = new LocalScrollStatus();

    /* renamed from: a, reason: collision with root package name */
    public boolean f9349a;
    public RewardsPageScrollManager.Status b;
    public RewardsPageScrollManager.StickyFilter c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/LocalScrollStatus$Companion;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public LocalScrollStatus() {
        this(false, RewardsPageScrollManager.c, RewardsPageScrollManager.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalScrollStatus)) {
            return false;
        }
        LocalScrollStatus localScrollStatus = (LocalScrollStatus) obj;
        return this.f9349a == localScrollStatus.f9349a && Intrinsics.c(this.b, localScrollStatus.b) && Intrinsics.c(this.c, localScrollStatus.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f9349a) * 31)) * 31);
    }

    public final String toString() {
        return "LocalScrollStatus(isVisible=" + this.f9349a + ", status=" + this.b + ", stickyFilter=" + this.c + ")";
    }

    public LocalScrollStatus(boolean z, RewardsPageScrollManager.Status status, RewardsPageScrollManager.StickyFilter stickyFilter) {
        Intrinsics.h(status, "status");
        Intrinsics.h(stickyFilter, "stickyFilter");
        this.f9349a = z;
        this.b = status;
        this.c = stickyFilter;
    }
}
