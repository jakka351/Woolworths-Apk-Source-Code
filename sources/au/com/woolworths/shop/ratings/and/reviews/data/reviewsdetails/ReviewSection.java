package au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection;", "", "Rating", "Title", "Recommendation", "Info", "Body", "Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection$Body;", "Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection$Info;", "Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection$Rating;", "Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection$Recommendation;", "Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection$Title;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ReviewSection {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection$Body;", "Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Body implements ReviewSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f12738a;

        public Body(String str) {
            this.f12738a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Body) && Intrinsics.c(this.f12738a, ((Body) obj).f12738a);
        }

        public final int hashCode() {
            return this.f12738a.hashCode();
        }

        public final String toString() {
            return a.h("Body(content=", this.f12738a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection$Info;", "Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Info implements ReviewSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f12739a;
        public final String b;

        public Info(String str, String str2) {
            this.f12739a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return Intrinsics.c(this.f12739a, info.f12739a) && Intrinsics.c(this.b, info.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12739a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Info(userName=", this.f12739a, ", createdAt=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection$Rating;", "Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Rating implements ReviewSection {

        /* renamed from: a, reason: collision with root package name */
        public final int f12740a;
        public final int b;
        public final String c;

        public Rating(int i, int i2, String str) {
            this.f12740a = i;
            this.b = i2;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rating)) {
                return false;
            }
            Rating rating = (Rating) obj;
            return this.f12740a == rating.f12740a && this.b == rating.b && Intrinsics.c(this.c, rating.c);
        }

        public final int hashCode() {
            int iA = b.a(this.b, Integer.hashCode(this.f12740a) * 31, 31);
            String str = this.c;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.q(this.f12740a, this.b, "Rating(rating=", ", maximumRating=", ", text="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection$Recommendation;", "Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Recommendation implements ReviewSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f12741a;

        public Recommendation(String str) {
            this.f12741a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Recommendation) && Intrinsics.c(this.f12741a, ((Recommendation) obj).f12741a);
        }

        public final int hashCode() {
            String str = this.f12741a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("Recommendation(text=", this.f12741a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection$Title;", "Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ReviewSection;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Title implements ReviewSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f12742a;

        public Title(String str) {
            this.f12742a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Title) && Intrinsics.c(this.f12742a, ((Title) obj).f12742a);
        }

        public final int hashCode() {
            return this.f12742a.hashCode();
        }

        public final String toString() {
            return a.h("Title(title=", this.f12742a, ")");
        }
    }
}
