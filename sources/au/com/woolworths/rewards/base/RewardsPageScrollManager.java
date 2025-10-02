package au.com.woolworths.rewards.base;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/base/RewardsPageScrollManager;", "", "Kind", "Status", "StickyFilter", "Companion", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsPageScrollManager {
    public static final Status c = new Status(Kind.d, 0, new d(0));
    public static final StickyFilter d = new StickyFilter(0, EmptyList.d, new au.com.woolworths.foundation.shop.olive.voice.ui.search.a(24));

    /* renamed from: a, reason: collision with root package name */
    public final SharedFlowImpl f9350a = SharedFlowKt.b(1, 10, null, 4);
    public final SharedFlowImpl b = SharedFlowKt.b(1, 10, null, 4);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/RewardsPageScrollManager$Companion;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/RewardsPageScrollManager$Kind;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Kind {
        public static final Kind d;
        public static final Kind e;
        public static final Kind f;
        public static final /* synthetic */ Kind[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            Kind kind = new Kind("ScrollingUnknown", 0);
            d = kind;
            Kind kind2 = new Kind("ScrollingKnown", 1);
            e = kind2;
            Kind kind3 = new Kind("FixedSize", 2);
            f = kind3;
            Kind[] kindArr = {kind, kind2, kind3};
            g = kindArr;
            h = EnumEntriesKt.a(kindArr);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/RewardsPageScrollManager$Status;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Status {

        /* renamed from: a, reason: collision with root package name */
        public final Kind f9351a;
        public final int b;
        public final Function0 c;

        public Status(Kind kind, int i, Function0 function0) {
            this.f9351a = kind;
            this.b = i;
            this.c = function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            return this.f9351a == status.f9351a && this.b == status.b && Intrinsics.c(this.c, status.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + androidx.camera.core.impl.b.a(this.b, this.f9351a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Status(kind=" + this.f9351a + ", heightPx=" + this.b + ", topPx=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/RewardsPageScrollManager$StickyFilter;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StickyFilter {

        /* renamed from: a, reason: collision with root package name */
        public final List f9352a;
        public final int b;
        public final Function1 c;

        public StickyFilter(int i, List labels, Function1 onSelectedIndexChanged) {
            Intrinsics.h(labels, "labels");
            Intrinsics.h(onSelectedIndexChanged, "onSelectedIndexChanged");
            this.f9352a = labels;
            this.b = i;
            this.c = onSelectedIndexChanged;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StickyFilter)) {
                return false;
            }
            StickyFilter stickyFilter = (StickyFilter) obj;
            return Intrinsics.c(this.f9352a, stickyFilter.f9352a) && this.b == stickyFilter.b && Intrinsics.c(this.c, stickyFilter.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + androidx.camera.core.impl.b.a(this.b, this.f9352a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "StickyFilter(labels=" + this.f9352a + ", selectedIndex=" + this.b + ", onSelectedIndexChanged=" + this.c + ")";
        }
    }
}
