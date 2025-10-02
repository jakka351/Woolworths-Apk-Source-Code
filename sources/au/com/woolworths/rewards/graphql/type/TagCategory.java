package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/TagCategory;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TagCategory {
    public static final Companion e;
    public static final TagCategory f;
    public static final /* synthetic */ TagCategory[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/TagCategory$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        TagCategory tagCategory = new TagCategory("UNKNOWN", 0, "UNKNOWN");
        TagCategory tagCategory2 = new TagCategory("REWARDS_MULTIPLIER", 1, "REWARDS_MULTIPLIER");
        TagCategory tagCategory3 = new TagCategory("SPECIAL", 2, "SPECIAL");
        TagCategory tagCategory4 = new TagCategory("PERCENTAGE_OFF", 3, "PERCENTAGE_OFF");
        TagCategory tagCategory5 = new TagCategory("FRACTION_OFF", 4, "FRACTION_OFF");
        TagCategory tagCategory6 = new TagCategory("STOCK", 5, "STOCK");
        TagCategory tagCategory7 = new TagCategory("FREE_SHIPPING", 6, "FREE_SHIPPING");
        TagCategory tagCategory8 = new TagCategory("BASE_POINTS_EARN", 7, "BASE_POINTS_EARN");
        TagCategory tagCategory9 = new TagCategory("FIXED_POINTS_OFFER", 8, "FIXED_POINTS_OFFER");
        TagCategory tagCategory10 = new TagCategory("TIERED_POINTS_OFFER", 9, "TIERED_POINTS_OFFER");
        TagCategory tagCategory11 = new TagCategory("PERCENTAGE_EXTRA", 10, "PERCENTAGE_EXTRA");
        TagCategory tagCategory12 = new TagCategory("REWARDS_MULTIPLIER_BOOSTABLE", 11, "REWARDS_MULTIPLIER_BOOSTABLE");
        TagCategory tagCategory13 = new TagCategory("REWARDS_FIXED_POINTS_BOOSTABLE", 12, "REWARDS_FIXED_POINTS_BOOSTABLE");
        TagCategory tagCategory14 = new TagCategory("UNKNOWN__", 13, "UNKNOWN__");
        f = tagCategory14;
        TagCategory[] tagCategoryArr = {tagCategory, tagCategory2, tagCategory3, tagCategory4, tagCategory5, tagCategory6, tagCategory7, tagCategory8, tagCategory9, tagCategory10, tagCategory11, tagCategory12, tagCategory13, tagCategory14};
        g = tagCategoryArr;
        h = EnumEntriesKt.a(tagCategoryArr);
        e = new Companion();
        CollectionsKt.R("UNKNOWN", "REWARDS_MULTIPLIER", "SPECIAL", "PERCENTAGE_OFF", "FRACTION_OFF", "STOCK", "FREE_SHIPPING", "BASE_POINTS_EARN", "FIXED_POINTS_OFFER", "TIERED_POINTS_OFFER", "PERCENTAGE_EXTRA", "REWARDS_MULTIPLIER_BOOSTABLE", "REWARDS_FIXED_POINTS_BOOSTABLE");
    }

    public TagCategory(String str, int i, String str2) {
        this.d = str2;
    }

    public static TagCategory valueOf(String str) {
        return (TagCategory) Enum.valueOf(TagCategory.class, str);
    }

    public static TagCategory[] values() {
        return (TagCategory[]) g.clone();
    }
}
