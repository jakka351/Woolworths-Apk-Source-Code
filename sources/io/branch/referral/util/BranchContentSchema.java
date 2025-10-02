package io.branch.referral.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class BranchContentSchema {
    public static final /* synthetic */ BranchContentSchema[] d = {new BranchContentSchema("COMMERCE_AUCTION", 0), new BranchContentSchema("COMMERCE_BUSINESS", 1), new BranchContentSchema("COMMERCE_OTHER", 2), new BranchContentSchema("COMMERCE_PRODUCT", 3), new BranchContentSchema("COMMERCE_RESTAURANT", 4), new BranchContentSchema("COMMERCE_SERVICE", 5), new BranchContentSchema("COMMERCE_TRAVEL_FLIGHT", 6), new BranchContentSchema("COMMERCE_TRAVEL_HOTEL", 7), new BranchContentSchema("COMMERCE_TRAVEL_OTHER", 8), new BranchContentSchema("GAME_STATE", 9), new BranchContentSchema("MEDIA_IMAGE", 10), new BranchContentSchema("MEDIA_MIXED", 11), new BranchContentSchema("MEDIA_MUSIC", 12), new BranchContentSchema("MEDIA_OTHER", 13), new BranchContentSchema("MEDIA_VIDEO", 14), new BranchContentSchema("OTHER", 15), new BranchContentSchema("TEXT_ARTICLE", 16), new BranchContentSchema("TEXT_BLOG", 17), new BranchContentSchema("TEXT_OTHER", 18), new BranchContentSchema("TEXT_RECIPE", 19), new BranchContentSchema("TEXT_REVIEW", 20), new BranchContentSchema("TEXT_SEARCH_RESULTS", 21), new BranchContentSchema("TEXT_STORY", 22), new BranchContentSchema("TEXT_TECHNICAL_DOC", 23)};

    /* JADX INFO: Fake field, exist only in values array */
    BranchContentSchema EF5;

    public static BranchContentSchema valueOf(String str) {
        return (BranchContentSchema) Enum.valueOf(BranchContentSchema.class, str);
    }

    public static BranchContentSchema[] values() {
        return (BranchContentSchema[]) d.clone();
    }
}
