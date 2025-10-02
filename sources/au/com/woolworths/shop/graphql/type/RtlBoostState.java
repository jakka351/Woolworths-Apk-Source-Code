package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/RtlBoostState;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RtlBoostState {
    public static final Companion e;
    public static final EnumType f;
    public static final RtlBoostState g;
    public static final /* synthetic */ RtlBoostState[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/RtlBoostState$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        RtlBoostState rtlBoostState = new RtlBoostState("BOOSTED", 0, "BOOSTED");
        RtlBoostState rtlBoostState2 = new RtlBoostState("NOT_BOOSTED", 1, "NOT_BOOSTED");
        RtlBoostState rtlBoostState3 = new RtlBoostState("UNKNOWN__", 2, "UNKNOWN__");
        g = rtlBoostState3;
        RtlBoostState[] rtlBoostStateArr = {rtlBoostState, rtlBoostState2, rtlBoostState3};
        h = rtlBoostStateArr;
        i = EnumEntriesKt.a(rtlBoostStateArr);
        e = new Companion();
        f = new EnumType("RtlBoostState", CollectionsKt.R("BOOSTED", "NOT_BOOSTED"));
    }

    public RtlBoostState(String str, int i2, String str2) {
        this.d = str2;
    }

    public static RtlBoostState valueOf(String str) {
        return (RtlBoostState) Enum.valueOf(RtlBoostState.class, str);
    }

    public static RtlBoostState[] values() {
        return (RtlBoostState[]) h.clone();
    }
}
