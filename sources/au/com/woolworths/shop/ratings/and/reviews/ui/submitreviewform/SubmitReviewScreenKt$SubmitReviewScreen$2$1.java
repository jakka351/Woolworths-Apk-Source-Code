package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class SubmitReviewScreenKt$SubmitReviewScreen$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SubmitReviewViewModel submitReviewViewModel = (SubmitReviewViewModel) this.receiver;
        AnalyticsManager analyticsManager = submitReviewViewModel.f;
        SubmitReviewAnalytics.SubmitReview submitReview = new SubmitReviewAnalytics.SubmitReview(CollectionsKt.Q(submitReviewViewModel.e));
        final List listQ = CollectionsKt.Q(submitReviewViewModel.m);
        final SubmitReviewAnalytics.SubmitReview.Action action = submitReview.f;
        action.getClass();
        analyticsManager.g(new Event(action, listQ) { // from class: au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics$SubmitReview$Action$backButtonClicked$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(action.f4050a.e);
                spreadBuilder.a(new Pair("event.Category", "Product Ratings and Reviews"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                spreadBuilder.a(new Pair("event.Label", "Close"));
                spreadBuilder.a(new Pair("product.Name", listQ));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "productratings&reviews_buttonclick";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "productratings&reviews_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        submitReviewViewModel.h.f(SubmitReviewContract.Action.OnNavigateUp.f12770a);
        return Unit.f24250a;
    }
}
