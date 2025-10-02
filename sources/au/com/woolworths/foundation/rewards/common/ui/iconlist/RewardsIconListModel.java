package au.com.woolworths.foundation.rewards.common.ui.iconlist;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel;", "", "Content", "Item", "ItemAction", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsIconListModel {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel$Content;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f8586a;
        public final List b;

        public Content(String str, List list) {
            this.f8586a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.c(this.f8586a, content.f8586a) && Intrinsics.c(this.b, content.b);
        }

        public final int hashCode() {
            String str = this.f8586a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.i("Content(iconUrl=", this.f8586a, ", items=", ")", this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel$Item;", "", "Action", "MarkdownContent", "Ordered", "Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel$Item$Action;", "Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel$Item$MarkdownContent;", "Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel$Item$Ordered;", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Item {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel$Item$Action;", "Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel$Item;", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Action implements Item {

            /* renamed from: a, reason: collision with root package name */
            public final ItemAction f8587a;

            public Action(ItemAction itemAction) {
                this.f8587a = itemAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Action) && Intrinsics.c(this.f8587a, ((Action) obj).f8587a);
            }

            public final int hashCode() {
                return 37329585;
            }

            public final String toString() {
                return "Action(itemAction=" + this.f8587a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel$Item$MarkdownContent;", "Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel$Item;", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class MarkdownContent implements Item {

            /* renamed from: a, reason: collision with root package name */
            public final ItemAction f8588a;

            public MarkdownContent(ItemAction itemAction) {
                this.f8588a = itemAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MarkdownContent) && this.f8588a.equals(((MarkdownContent) obj).f8588a);
            }

            public final int hashCode() {
                return 1948265187 + 37329585;
            }

            public final String toString() {
                return "MarkdownContent(content=Share your unique link, itemAction=" + this.f8588a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel$Item$Ordered;", "Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel$Item;", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Ordered implements Item {

            /* renamed from: a, reason: collision with root package name */
            public final String f8589a;
            public final String b;
            public final String c;
            public final ItemAction d;

            public Ordered(String str, String str2, String str3, ItemAction itemAction) {
                this.f8589a = str;
                this.b = str2;
                this.c = str3;
                this.d = itemAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Ordered)) {
                    return false;
                }
                Ordered ordered = (Ordered) obj;
                if (!this.f8589a.equals(ordered.f8589a) || !Intrinsics.c(this.b, ordered.b) || !Intrinsics.c(this.c, ordered.c)) {
                    return false;
                }
                Object obj2 = Boolean.FALSE;
                return obj2.equals(obj2) && Intrinsics.c(this.d, ordered.d);
            }

            public final int hashCode() {
                int iHashCode = this.f8589a.hashCode() * 31;
                String str = this.b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                return ((Boolean.FALSE.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31) + (this.d != null ? 37329585 : 0);
            }

            public final String toString() {
                Boolean bool = Boolean.FALSE;
                StringBuilder sbV = YU.a.v("Ordered(bulletNumber=", this.f8589a, ", title=", this.b, ", markdownDescription=");
                au.com.woolworths.android.onesite.a.A(sbV, this.c, ", isEmojiBulletText=", bool, ", itemAction=");
                sbV.append(this.d);
                sbV.append(")");
                return sbV.toString();
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/iconlist/RewardsIconListModel$ItemAction;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ItemAction {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ItemAction);
        }

        public final int hashCode() {
            return 37329585;
        }

        public final String toString() {
            return "ItemAction(url=, label=Click Me!)";
        }
    }
}
