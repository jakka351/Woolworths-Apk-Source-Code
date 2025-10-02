package au.com.woolworths.product.details.ui;

import au.com.woolworths.shop.ratingsandreviews.ui.ReviewsPreviewButtonType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;

    public /* synthetic */ b(String str, Function0 function0, Function0 function02, int i) {
        this.d = i;
        this.e = str;
        this.f = function0;
        this.g = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Function0 function0 = this.g;
        Function0 function02 = this.f;
        String str = this.e;
        switch (i) {
            case 0:
                ReviewsPreviewButtonType[] reviewsPreviewButtonTypeArr = ReviewsPreviewButtonType.d;
                if (!Intrinsics.c(str, "productRatingsAndReviews")) {
                    if (Intrinsics.c(str, "submitRatingsAndReviews")) {
                        function0.invoke();
                        break;
                    }
                } else {
                    function02.invoke();
                    break;
                }
                break;
            case 1:
                ReviewsPreviewButtonType[] reviewsPreviewButtonTypeArr2 = ReviewsPreviewButtonType.d;
                if (!Intrinsics.c(str, "productRatingsAndReviews")) {
                    if (Intrinsics.c(str, "submitRatingsAndReviews")) {
                        function0.invoke();
                        break;
                    }
                } else {
                    function02.invoke();
                    break;
                }
                break;
            default:
                ReviewsPreviewButtonType[] reviewsPreviewButtonTypeArr3 = ReviewsPreviewButtonType.d;
                if (!Intrinsics.c(str, "productRatingsAndReviews")) {
                    if (Intrinsics.c(str, "submitRatingsAndReviews")) {
                        function0.invoke();
                        break;
                    }
                } else {
                    function02.invoke();
                    break;
                }
                break;
        }
        return unit;
    }
}
