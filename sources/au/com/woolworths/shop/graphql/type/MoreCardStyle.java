package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/MoreCardStyle;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MoreCardStyle {
    public static final Companion e;
    public static final EnumType f;
    public static final MoreCardStyle g;
    public static final /* synthetic */ MoreCardStyle[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/MoreCardStyle$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static EnumType a() {
            return MoreCardStyle.f;
        }
    }

    static {
        MoreCardStyle moreCardStyle = new MoreCardStyle("ROUNDED_CIRCLE", 0, "ROUNDED_CIRCLE");
        MoreCardStyle moreCardStyle2 = new MoreCardStyle("ROUNDED_CORNER", 1, "ROUNDED_CORNER");
        MoreCardStyle moreCardStyle3 = new MoreCardStyle("UNKNOWN__", 2, "UNKNOWN__");
        g = moreCardStyle3;
        MoreCardStyle[] moreCardStyleArr = {moreCardStyle, moreCardStyle2, moreCardStyle3};
        h = moreCardStyleArr;
        i = EnumEntriesKt.a(moreCardStyleArr);
        e = new Companion();
        f = new EnumType("MoreCardStyle", CollectionsKt.R("ROUNDED_CIRCLE", "ROUNDED_CORNER"));
    }

    public MoreCardStyle(String str, int i2, String str2) {
        this.d = str2;
    }

    public static MoreCardStyle valueOf(String str) {
        return (MoreCardStyle) Enum.valueOf(MoreCardStyle.class, str);
    }

    public static MoreCardStyle[] values() {
        return (MoreCardStyle[]) h.clone();
    }
}
