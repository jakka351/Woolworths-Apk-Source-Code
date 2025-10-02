package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/PageCoverImagePosition;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PageCoverImagePosition {
    public static final Companion e;
    public static final EnumType f;
    public static final PageCoverImagePosition g;
    public static final /* synthetic */ PageCoverImagePosition[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/PageCoverImagePosition$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static EnumType a() {
            return PageCoverImagePosition.f;
        }
    }

    static {
        PageCoverImagePosition pageCoverImagePosition = new PageCoverImagePosition("TOP", 0, "TOP");
        PageCoverImagePosition pageCoverImagePosition2 = new PageCoverImagePosition("BOTTOM", 1, "BOTTOM");
        PageCoverImagePosition pageCoverImagePosition3 = new PageCoverImagePosition("UNKNOWN__", 2, "UNKNOWN__");
        g = pageCoverImagePosition3;
        PageCoverImagePosition[] pageCoverImagePositionArr = {pageCoverImagePosition, pageCoverImagePosition2, pageCoverImagePosition3};
        h = pageCoverImagePositionArr;
        i = EnumEntriesKt.a(pageCoverImagePositionArr);
        e = new Companion();
        f = new EnumType("PageCoverImagePosition", CollectionsKt.R("TOP", "BOTTOM"));
    }

    public PageCoverImagePosition(String str, int i2, String str2) {
        this.d = str2;
    }

    public static PageCoverImagePosition valueOf(String str) {
        return (PageCoverImagePosition) Enum.valueOf(PageCoverImagePosition.class, str);
    }

    public static PageCoverImagePosition[] values() {
        return (PageCoverImagePosition[]) h.clone();
    }
}
