package au.com.woolworths.shop.ratingsandreviews.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/ui/ReviewsPreviewButtonType;", "", "ratingsandreviews-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReviewsPreviewButtonType {
    public static final /* synthetic */ ReviewsPreviewButtonType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ReviewsPreviewButtonType[] reviewsPreviewButtonTypeArr = {new ReviewsPreviewButtonType("SUBMIT_RATINGS_AND_REVIEWS", 0), new ReviewsPreviewButtonType("PRODUCT_RATINGS_AND_REVIEWS", 1)};
        d = reviewsPreviewButtonTypeArr;
        e = EnumEntriesKt.a(reviewsPreviewButtonTypeArr);
    }

    public static ReviewsPreviewButtonType valueOf(String str) {
        return (ReviewsPreviewButtonType) Enum.valueOf(ReviewsPreviewButtonType.class, str);
    }

    public static ReviewsPreviewButtonType[] values() {
        return (ReviewsPreviewButtonType[]) d.clone();
    }
}
