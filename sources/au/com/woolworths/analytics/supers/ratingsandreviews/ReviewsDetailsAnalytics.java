package au.com.woolworths.analytics.supers.ratingsandreviews;

import androidx.lifecycle.a;
import au.com.woolworths.analytics.Screen;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/ratingsandreviews/ReviewsDetailsAnalytics;", "", "ReviewsDetails", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsDetailsAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/ratingsandreviews/ReviewsDetailsAnalytics$ReviewsDetails;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ReviewsDetails implements Screen {
        public final Object d;
        public final Pair[] e;
        public final Action f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/ratingsandreviews/ReviewsDetailsAnalytics$ReviewsDetails$Action;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final ReviewsDetails f4049a;
            public final Lazy b = LazyKt.b(new a(this, 3));

            public Action(ReviewsDetails reviewsDetails) {
                this.f4049a = reviewsDetails;
            }
        }

        public ReviewsDetails(List list) {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "reviews screen"), new Pair("screen.Type", "ratings & reviews"), new Pair("product.ID", list), new Pair("app.Section", "Products"));
            this.d = mapJ;
            this.e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
            this.f = new Action(this);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getD() {
            return "reviewsscreen_impression";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "reviews screen".equals(screen.getD()) && "reviewsscreen_impression".equals(screen.getD()) && Intrinsics.c(this.d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "reviews screen";
        }

        public final int hashCode() {
            return this.d.hashCode() - 1389068560;
        }
    }
}
