package androidx.room;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/FtsOptions;", "", "MatchInfo", "Order", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FtsOptions {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/FtsOptions$MatchInfo;", "", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MatchInfo {
        public static final MatchInfo d;
        public static final /* synthetic */ MatchInfo[] e;

        /* JADX INFO: Fake field, exist only in values array */
        MatchInfo EF0;

        static {
            MatchInfo matchInfo = new MatchInfo("FTS3", 0);
            MatchInfo matchInfo2 = new MatchInfo("FTS4", 1);
            d = matchInfo2;
            e = new MatchInfo[]{matchInfo, matchInfo2};
        }

        public static MatchInfo valueOf(String str) {
            return (MatchInfo) Enum.valueOf(MatchInfo.class, str);
        }

        public static MatchInfo[] values() {
            return (MatchInfo[]) e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/FtsOptions$Order;", "", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Order {
        public static final Order d;
        public static final /* synthetic */ Order[] e;

        static {
            Order order = new Order("ASC", 0);
            d = order;
            e = new Order[]{order, new Order("DESC", 1)};
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) e.clone();
        }
    }
}
