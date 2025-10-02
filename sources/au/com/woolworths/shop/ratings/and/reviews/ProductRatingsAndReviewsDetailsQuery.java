package au.com.woolworths.shop.ratings.and.reviews;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.ProductRatingsAndReviewsDetailsInput;
import au.com.woolworths.shop.graphql.type.adapter.ProductRatingsAndReviewsDetailsInput_InputAdapter;
import au.com.woolworths.shop.ratings.and.reviews.adapter.ProductRatingsAndReviewsDetailsQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import fragment.RatingsAndReviewsRatingsDetails;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$Data;", "Data", "ProductRatingsAndReviewsDetails", "Ratings", "Review", "Section", "OnRatingsAndReviewsReviewItemRating", "OnRatingsAndReviewsReviewItemReviewTitle", "OnRatingsAndReviewsReviewItemRecommendation", "OnRatingsAndReviewsReviewItemInfo", "OnRatingsAndReviewsReviewItemBody", "Cta", "LinkAction", "LinkTextWithAlt", "PageInfo", "Companion", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductRatingsAndReviewsDetailsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ProductRatingsAndReviewsDetailsInput f12668a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$Cta;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f12669a;
        public final LinkAction b;
        public final LinkTextWithAlt c;

        public Cta(String str, LinkAction linkAction, LinkTextWithAlt linkTextWithAlt) {
            this.f12669a = str;
            this.b = linkAction;
            this.c = linkTextWithAlt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f12669a, cta.f12669a) && Intrinsics.c(this.b, cta.b) && Intrinsics.c(this.c, cta.c);
        }

        public final int hashCode() {
            String str = this.f12669a;
            return this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            return "Cta(linkId=" + this.f12669a + ", linkAction=" + this.b + ", linkTextWithAlt=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ProductRatingsAndReviewsDetails f12670a;

        public Data(ProductRatingsAndReviewsDetails productRatingsAndReviewsDetails) {
            this.f12670a = productRatingsAndReviewsDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f12670a, ((Data) obj).f12670a);
        }

        public final int hashCode() {
            ProductRatingsAndReviewsDetails productRatingsAndReviewsDetails = this.f12670a;
            if (productRatingsAndReviewsDetails == null) {
                return 0;
            }
            return productRatingsAndReviewsDetails.hashCode();
        }

        public final String toString() {
            return "Data(productRatingsAndReviewsDetails=" + this.f12670a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$LinkAction;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f12671a;
        public final String b;
        public final String c;

        public LinkAction(ActionType actionType, String str, String str2) {
            this.f12671a = actionType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkAction)) {
                return false;
            }
            LinkAction linkAction = (LinkAction) obj;
            return this.f12671a == linkAction.f12671a && Intrinsics.c(this.b, linkAction.b) && Intrinsics.c(this.c, linkAction.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f12671a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.s("LinkAction(type=", this.f12671a, ", action=", this.b, ", id="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$LinkTextWithAlt;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkTextWithAlt {

        /* renamed from: a, reason: collision with root package name */
        public final String f12672a;
        public final String b;

        public LinkTextWithAlt(String str, String str2) {
            this.f12672a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkTextWithAlt)) {
                return false;
            }
            LinkTextWithAlt linkTextWithAlt = (LinkTextWithAlt) obj;
            return Intrinsics.c(this.f12672a, linkTextWithAlt.f12672a) && Intrinsics.c(this.b, linkTextWithAlt.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12672a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("LinkTextWithAlt(text=", this.f12672a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$OnRatingsAndReviewsReviewItemBody;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsReviewItemBody {

        /* renamed from: a, reason: collision with root package name */
        public final String f12673a;

        public OnRatingsAndReviewsReviewItemBody(String str) {
            this.f12673a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRatingsAndReviewsReviewItemBody) && Intrinsics.c(this.f12673a, ((OnRatingsAndReviewsReviewItemBody) obj).f12673a);
        }

        public final int hashCode() {
            return this.f12673a.hashCode();
        }

        public final String toString() {
            return a.h("OnRatingsAndReviewsReviewItemBody(content=", this.f12673a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$OnRatingsAndReviewsReviewItemInfo;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsReviewItemInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f12674a;
        public final String b;

        public OnRatingsAndReviewsReviewItemInfo(String str, String str2) {
            this.f12674a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRatingsAndReviewsReviewItemInfo)) {
                return false;
            }
            OnRatingsAndReviewsReviewItemInfo onRatingsAndReviewsReviewItemInfo = (OnRatingsAndReviewsReviewItemInfo) obj;
            return Intrinsics.c(this.f12674a, onRatingsAndReviewsReviewItemInfo.f12674a) && Intrinsics.c(this.b, onRatingsAndReviewsReviewItemInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12674a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnRatingsAndReviewsReviewItemInfo(userName=", this.f12674a, ", createdAt=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$OnRatingsAndReviewsReviewItemRating;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsReviewItemRating {

        /* renamed from: a, reason: collision with root package name */
        public final int f12675a;
        public final int b;
        public final String c;

        public OnRatingsAndReviewsReviewItemRating(int i, int i2, String str) {
            this.f12675a = i;
            this.b = i2;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRatingsAndReviewsReviewItemRating)) {
                return false;
            }
            OnRatingsAndReviewsReviewItemRating onRatingsAndReviewsReviewItemRating = (OnRatingsAndReviewsReviewItemRating) obj;
            return this.f12675a == onRatingsAndReviewsReviewItemRating.f12675a && this.b == onRatingsAndReviewsReviewItemRating.b && Intrinsics.c(this.c, onRatingsAndReviewsReviewItemRating.c);
        }

        public final int hashCode() {
            int iA = b.a(this.b, Integer.hashCode(this.f12675a) * 31, 31);
            String str = this.c;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.q(this.f12675a, this.b, "OnRatingsAndReviewsReviewItemRating(rating=", ", maximumRating=", ", text="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$OnRatingsAndReviewsReviewItemRecommendation;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsReviewItemRecommendation {

        /* renamed from: a, reason: collision with root package name */
        public final String f12676a;

        public OnRatingsAndReviewsReviewItemRecommendation(String str) {
            this.f12676a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRatingsAndReviewsReviewItemRecommendation) && Intrinsics.c(this.f12676a, ((OnRatingsAndReviewsReviewItemRecommendation) obj).f12676a);
        }

        public final int hashCode() {
            String str = this.f12676a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("OnRatingsAndReviewsReviewItemRecommendation(recommendationText=", this.f12676a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$OnRatingsAndReviewsReviewItemReviewTitle;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsReviewItemReviewTitle {

        /* renamed from: a, reason: collision with root package name */
        public final String f12677a;

        public OnRatingsAndReviewsReviewItemReviewTitle(String str) {
            this.f12677a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRatingsAndReviewsReviewItemReviewTitle) && Intrinsics.c(this.f12677a, ((OnRatingsAndReviewsReviewItemReviewTitle) obj).f12677a);
        }

        public final int hashCode() {
            return this.f12677a.hashCode();
        }

        public final String toString() {
            return a.h("OnRatingsAndReviewsReviewItemReviewTitle(title=", this.f12677a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$PageInfo;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PageInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f12678a;

        public PageInfo(Integer num) {
            this.f12678a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PageInfo) && Intrinsics.c(this.f12678a, ((PageInfo) obj).f12678a);
        }

        public final int hashCode() {
            Integer num = this.f12678a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "PageInfo(nextPage=" + this.f12678a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$ProductRatingsAndReviewsDetails;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductRatingsAndReviewsDetails {

        /* renamed from: a, reason: collision with root package name */
        public final Ratings f12679a;
        public final ArrayList b;
        public final Cta c;
        public final PageInfo d;

        public ProductRatingsAndReviewsDetails(Ratings ratings, ArrayList arrayList, Cta cta, PageInfo pageInfo) {
            this.f12679a = ratings;
            this.b = arrayList;
            this.c = cta;
            this.d = pageInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductRatingsAndReviewsDetails)) {
                return false;
            }
            ProductRatingsAndReviewsDetails productRatingsAndReviewsDetails = (ProductRatingsAndReviewsDetails) obj;
            return Intrinsics.c(this.f12679a, productRatingsAndReviewsDetails.f12679a) && this.b.equals(productRatingsAndReviewsDetails.b) && Intrinsics.c(this.c, productRatingsAndReviewsDetails.c) && Intrinsics.c(this.d, productRatingsAndReviewsDetails.d);
        }

        public final int hashCode() {
            Ratings ratings = this.f12679a;
            int iB = androidx.compose.ui.input.pointer.a.b((ratings == null ? 0 : ratings.hashCode()) * 31, 31, this.b);
            Cta cta = this.c;
            int iHashCode = (iB + (cta == null ? 0 : cta.hashCode())) * 31;
            PageInfo pageInfo = this.d;
            return iHashCode + (pageInfo != null ? pageInfo.hashCode() : 0);
        }

        public final String toString() {
            return "ProductRatingsAndReviewsDetails(ratings=" + this.f12679a + ", reviews=" + this.b + ", cta=" + this.c + ", pageInfo=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$Ratings;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Ratings {

        /* renamed from: a, reason: collision with root package name */
        public final String f12680a;
        public final RatingsAndReviewsRatingsDetails b;

        public Ratings(String str, RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetails) {
            this.f12680a = str;
            this.b = ratingsAndReviewsRatingsDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ratings)) {
                return false;
            }
            Ratings ratings = (Ratings) obj;
            return Intrinsics.c(this.f12680a, ratings.f12680a) && Intrinsics.c(this.b, ratings.b);
        }

        public final int hashCode() {
            return this.b.f23793a.hashCode() + (this.f12680a.hashCode() * 31);
        }

        public final String toString() {
            return "Ratings(__typename=" + this.f12680a + ", ratingsAndReviewsRatingsDetails=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$Review;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Review {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12681a;

        public Review(ArrayList arrayList) {
            this.f12681a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Review) && this.f12681a.equals(((Review) obj).f12681a);
        }

        public final int hashCode() {
            return this.f12681a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("Review(sections=", ")", this.f12681a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$Section;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f12682a;
        public final OnRatingsAndReviewsReviewItemRating b;
        public final OnRatingsAndReviewsReviewItemReviewTitle c;
        public final OnRatingsAndReviewsReviewItemRecommendation d;
        public final OnRatingsAndReviewsReviewItemInfo e;
        public final OnRatingsAndReviewsReviewItemBody f;

        public Section(String __typename, OnRatingsAndReviewsReviewItemRating onRatingsAndReviewsReviewItemRating, OnRatingsAndReviewsReviewItemReviewTitle onRatingsAndReviewsReviewItemReviewTitle, OnRatingsAndReviewsReviewItemRecommendation onRatingsAndReviewsReviewItemRecommendation, OnRatingsAndReviewsReviewItemInfo onRatingsAndReviewsReviewItemInfo, OnRatingsAndReviewsReviewItemBody onRatingsAndReviewsReviewItemBody) {
            Intrinsics.h(__typename, "__typename");
            this.f12682a = __typename;
            this.b = onRatingsAndReviewsReviewItemRating;
            this.c = onRatingsAndReviewsReviewItemReviewTitle;
            this.d = onRatingsAndReviewsReviewItemRecommendation;
            this.e = onRatingsAndReviewsReviewItemInfo;
            this.f = onRatingsAndReviewsReviewItemBody;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.c(this.f12682a, section.f12682a) && Intrinsics.c(this.b, section.b) && Intrinsics.c(this.c, section.c) && Intrinsics.c(this.d, section.d) && Intrinsics.c(this.e, section.e) && Intrinsics.c(this.f, section.f);
        }

        public final int hashCode() {
            int iHashCode = this.f12682a.hashCode() * 31;
            OnRatingsAndReviewsReviewItemRating onRatingsAndReviewsReviewItemRating = this.b;
            int iHashCode2 = (iHashCode + (onRatingsAndReviewsReviewItemRating == null ? 0 : onRatingsAndReviewsReviewItemRating.hashCode())) * 31;
            OnRatingsAndReviewsReviewItemReviewTitle onRatingsAndReviewsReviewItemReviewTitle = this.c;
            int iHashCode3 = (iHashCode2 + (onRatingsAndReviewsReviewItemReviewTitle == null ? 0 : onRatingsAndReviewsReviewItemReviewTitle.f12677a.hashCode())) * 31;
            OnRatingsAndReviewsReviewItemRecommendation onRatingsAndReviewsReviewItemRecommendation = this.d;
            int iHashCode4 = (iHashCode3 + (onRatingsAndReviewsReviewItemRecommendation == null ? 0 : onRatingsAndReviewsReviewItemRecommendation.hashCode())) * 31;
            OnRatingsAndReviewsReviewItemInfo onRatingsAndReviewsReviewItemInfo = this.e;
            int iHashCode5 = (iHashCode4 + (onRatingsAndReviewsReviewItemInfo == null ? 0 : onRatingsAndReviewsReviewItemInfo.hashCode())) * 31;
            OnRatingsAndReviewsReviewItemBody onRatingsAndReviewsReviewItemBody = this.f;
            return iHashCode5 + (onRatingsAndReviewsReviewItemBody != null ? onRatingsAndReviewsReviewItemBody.f12673a.hashCode() : 0);
        }

        public final String toString() {
            return "Section(__typename=" + this.f12682a + ", onRatingsAndReviewsReviewItemRating=" + this.b + ", onRatingsAndReviewsReviewItemReviewTitle=" + this.c + ", onRatingsAndReviewsReviewItemRecommendation=" + this.d + ", onRatingsAndReviewsReviewItemInfo=" + this.e + ", onRatingsAndReviewsReviewItemBody=" + this.f + ")";
        }
    }

    public ProductRatingsAndReviewsDetailsQuery(ProductRatingsAndReviewsDetailsInput productRatingsAndReviewsDetailsInput) {
        Intrinsics.h(productRatingsAndReviewsDetailsInput, "productRatingsAndReviewsDetailsInput");
        this.f12668a = productRatingsAndReviewsDetailsInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ProductRatingsAndReviewsDetailsQuery_ResponseAdapter.Data.f12703a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query productRatingsAndReviewsDetails($productRatingsAndReviewsDetailsInput: ProductRatingsAndReviewsDetailsInput!) { productRatingsAndReviewsDetails(productRatingsAndReviewsDetailsInput: $productRatingsAndReviewsDetailsInput) { ratings { __typename ...ratingsAndReviewsRatingsDetails } reviews { sections { __typename ... on RatingsAndReviewsReviewItemRating { rating maximumRating text } ... on RatingsAndReviewsReviewItemReviewTitle { title } ... on RatingsAndReviewsReviewItemRecommendation { recommendationText: text } ... on RatingsAndReviewsReviewItemInfo { userName createdAt } ... on RatingsAndReviewsReviewItemBody { content } } } cta { linkId linkAction { type action id } linkTextWithAlt { text altText } } pageInfo { nextPage } } }  fragment ratingsAndReviewsRatingsDetails on RatingsAndReviewsRatingsDetails { sections { __typename ... on RatingsAndReviewsRatingDistributionOverview { averageRating displayRatings ratingText { text altText } maximumRating totalReviewsText cta { linkId linkAction { type action id } linkTextWithAlt { text altText } } } ... on RatingsAndReviewsRatingDistributionDetails { items { ratingScore percentage ratingCount } } ... on RatingsAndReviewsRatingDistributionWriteReview { button { buttonId label enabled buttonAction { type action id } iconUrl altText } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductRatingsAndReviewsDetailsQuery) && Intrinsics.c(this.f12668a, ((ProductRatingsAndReviewsDetailsQuery) obj).f12668a);
    }

    public final int hashCode() {
        return this.f12668a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "d66abbbb15e70a75a39bcd7fb23c0eec584c093510b485fea54819c739ca5883";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "productRatingsAndReviewsDetails";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("productRatingsAndReviewsDetailsInput");
        Adapters.c(ProductRatingsAndReviewsDetailsInput_InputAdapter.f12103a, false).toJson(jsonWriter, customScalarAdapters, this.f12668a);
    }

    public final String toString() {
        return "ProductRatingsAndReviewsDetailsQuery(productRatingsAndReviewsDetailsInput=" + this.f12668a + ")";
    }
}
