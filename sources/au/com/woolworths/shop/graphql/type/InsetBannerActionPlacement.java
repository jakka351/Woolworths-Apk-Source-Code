package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InsetBannerActionPlacement {
    public static final Companion e;
    public static final EnumType f;
    public static final InsetBannerActionPlacement g;
    public static final /* synthetic */ InsetBannerActionPlacement[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static EnumType a() {
            return InsetBannerActionPlacement.f;
        }
    }

    static {
        InsetBannerActionPlacement insetBannerActionPlacement = new InsetBannerActionPlacement("BOTTOM", 0, "BOTTOM");
        InsetBannerActionPlacement insetBannerActionPlacement2 = new InsetBannerActionPlacement("RIGHT", 1, "RIGHT");
        InsetBannerActionPlacement insetBannerActionPlacement3 = new InsetBannerActionPlacement("UNKNOWN__", 2, "UNKNOWN__");
        g = insetBannerActionPlacement3;
        InsetBannerActionPlacement[] insetBannerActionPlacementArr = {insetBannerActionPlacement, insetBannerActionPlacement2, insetBannerActionPlacement3};
        h = insetBannerActionPlacementArr;
        i = EnumEntriesKt.a(insetBannerActionPlacementArr);
        e = new Companion();
        f = new EnumType("InsetBannerActionPlacement", CollectionsKt.R("BOTTOM", "RIGHT"));
    }

    public InsetBannerActionPlacement(String str, int i2, String str2) {
        this.d = str2;
    }

    public static InsetBannerActionPlacement valueOf(String str) {
        return (InsetBannerActionPlacement) Enum.valueOf(InsetBannerActionPlacement.class, str);
    }

    public static InsetBannerActionPlacement[] values() {
        return (InsetBannerActionPlacement[]) h.clone();
    }
}
