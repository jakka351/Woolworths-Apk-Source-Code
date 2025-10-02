package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/RatingsReviewSortType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RatingsReviewSortType {
    public static final Companion e;
    public static final RatingsReviewSortType f;
    public static final RatingsReviewSortType g;
    public static final RatingsReviewSortType h;
    public static final RatingsReviewSortType i;
    public static final /* synthetic */ RatingsReviewSortType[] j;
    public static final /* synthetic */ EnumEntries k;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/RatingsReviewSortType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        RatingsReviewSortType ratingsReviewSortType = new RatingsReviewSortType("LATEST", 0, "LATEST");
        f = ratingsReviewSortType;
        RatingsReviewSortType ratingsReviewSortType2 = new RatingsReviewSortType("HIGHEST_RATING", 1, "HIGHEST_RATING");
        g = ratingsReviewSortType2;
        RatingsReviewSortType ratingsReviewSortType3 = new RatingsReviewSortType("LOWEST_RATING", 2, "LOWEST_RATING");
        h = ratingsReviewSortType3;
        RatingsReviewSortType ratingsReviewSortType4 = new RatingsReviewSortType("UNKNOWN__", 3, "UNKNOWN__");
        i = ratingsReviewSortType4;
        RatingsReviewSortType[] ratingsReviewSortTypeArr = {ratingsReviewSortType, ratingsReviewSortType2, ratingsReviewSortType3, ratingsReviewSortType4};
        j = ratingsReviewSortTypeArr;
        k = EnumEntriesKt.a(ratingsReviewSortTypeArr);
        e = new Companion();
        CollectionsKt.R("LATEST", "HIGHEST_RATING", "LOWEST_RATING");
    }

    public RatingsReviewSortType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static RatingsReviewSortType valueOf(String str) {
        return (RatingsReviewSortType) Enum.valueOf(RatingsReviewSortType.class, str);
    }

    public static RatingsReviewSortType[] values() {
        return (RatingsReviewSortType[]) j.clone();
    }
}
