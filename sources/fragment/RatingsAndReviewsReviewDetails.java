package fragment;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.a;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetails;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Item", "Section", "OnRatingsAndReviewsReviewItemRating", "OnRatingsAndReviewsReviewItemReviewTitle", "OnRatingsAndReviewsReviewItemRecommendation", "OnRatingsAndReviewsReviewItemInfo", "OnRatingsAndReviewsReviewItemBody", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RatingsAndReviewsReviewDetails implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23817a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetails$Item;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23818a;

        public Item(ArrayList arrayList) {
            this.f23818a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Item) && this.f23818a.equals(((Item) obj).f23818a);
        }

        public final int hashCode() {
            return this.f23818a.hashCode();
        }

        public final String toString() {
            return a.k("Item(sections=", ")", this.f23818a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetails$OnRatingsAndReviewsReviewItemBody;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsReviewItemBody {

        /* renamed from: a, reason: collision with root package name */
        public final String f23819a;

        public OnRatingsAndReviewsReviewItemBody(String str) {
            this.f23819a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRatingsAndReviewsReviewItemBody) && Intrinsics.c(this.f23819a, ((OnRatingsAndReviewsReviewItemBody) obj).f23819a);
        }

        public final int hashCode() {
            return this.f23819a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnRatingsAndReviewsReviewItemBody(content=", this.f23819a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetails$OnRatingsAndReviewsReviewItemInfo;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsReviewItemInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f23820a;
        public final String b;

        public OnRatingsAndReviewsReviewItemInfo(String str, String str2) {
            this.f23820a = str;
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
            return Intrinsics.c(this.f23820a, onRatingsAndReviewsReviewItemInfo.f23820a) && Intrinsics.c(this.b, onRatingsAndReviewsReviewItemInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23820a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnRatingsAndReviewsReviewItemInfo(userName=", this.f23820a, ", createdAt=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetails$OnRatingsAndReviewsReviewItemRating;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsReviewItemRating {

        /* renamed from: a, reason: collision with root package name */
        public final int f23821a;
        public final int b;
        public final String c;

        public OnRatingsAndReviewsReviewItemRating(int i, int i2, String str) {
            this.f23821a = i;
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
            return this.f23821a == onRatingsAndReviewsReviewItemRating.f23821a && this.b == onRatingsAndReviewsReviewItemRating.b && Intrinsics.c(this.c, onRatingsAndReviewsReviewItemRating.c);
        }

        public final int hashCode() {
            int iA = b.a(this.b, Integer.hashCode(this.f23821a) * 31, 31);
            String str = this.c;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.o(YU.a.q(this.f23821a, this.b, "OnRatingsAndReviewsReviewItemRating(rating=", ", maximumRating=", ", text="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetails$OnRatingsAndReviewsReviewItemRecommendation;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsReviewItemRecommendation {

        /* renamed from: a, reason: collision with root package name */
        public final String f23822a;

        public OnRatingsAndReviewsReviewItemRecommendation(String str) {
            this.f23822a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRatingsAndReviewsReviewItemRecommendation) && Intrinsics.c(this.f23822a, ((OnRatingsAndReviewsReviewItemRecommendation) obj).f23822a);
        }

        public final int hashCode() {
            String str = this.f23822a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnRatingsAndReviewsReviewItemRecommendation(recommendationText=", this.f23822a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetails$OnRatingsAndReviewsReviewItemReviewTitle;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsReviewItemReviewTitle {

        /* renamed from: a, reason: collision with root package name */
        public final String f23823a;

        public OnRatingsAndReviewsReviewItemReviewTitle(String str) {
            this.f23823a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRatingsAndReviewsReviewItemReviewTitle) && Intrinsics.c(this.f23823a, ((OnRatingsAndReviewsReviewItemReviewTitle) obj).f23823a);
        }

        public final int hashCode() {
            return this.f23823a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnRatingsAndReviewsReviewItemReviewTitle(title=", this.f23823a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetails$Section;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f23824a;
        public final OnRatingsAndReviewsReviewItemRating b;
        public final OnRatingsAndReviewsReviewItemReviewTitle c;
        public final OnRatingsAndReviewsReviewItemRecommendation d;
        public final OnRatingsAndReviewsReviewItemInfo e;
        public final OnRatingsAndReviewsReviewItemBody f;

        public Section(String __typename, OnRatingsAndReviewsReviewItemRating onRatingsAndReviewsReviewItemRating, OnRatingsAndReviewsReviewItemReviewTitle onRatingsAndReviewsReviewItemReviewTitle, OnRatingsAndReviewsReviewItemRecommendation onRatingsAndReviewsReviewItemRecommendation, OnRatingsAndReviewsReviewItemInfo onRatingsAndReviewsReviewItemInfo, OnRatingsAndReviewsReviewItemBody onRatingsAndReviewsReviewItemBody) {
            Intrinsics.h(__typename, "__typename");
            this.f23824a = __typename;
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
            return Intrinsics.c(this.f23824a, section.f23824a) && Intrinsics.c(this.b, section.b) && Intrinsics.c(this.c, section.c) && Intrinsics.c(this.d, section.d) && Intrinsics.c(this.e, section.e) && Intrinsics.c(this.f, section.f);
        }

        public final int hashCode() {
            int iHashCode = this.f23824a.hashCode() * 31;
            OnRatingsAndReviewsReviewItemRating onRatingsAndReviewsReviewItemRating = this.b;
            int iHashCode2 = (iHashCode + (onRatingsAndReviewsReviewItemRating == null ? 0 : onRatingsAndReviewsReviewItemRating.hashCode())) * 31;
            OnRatingsAndReviewsReviewItemReviewTitle onRatingsAndReviewsReviewItemReviewTitle = this.c;
            int iHashCode3 = (iHashCode2 + (onRatingsAndReviewsReviewItemReviewTitle == null ? 0 : onRatingsAndReviewsReviewItemReviewTitle.f23823a.hashCode())) * 31;
            OnRatingsAndReviewsReviewItemRecommendation onRatingsAndReviewsReviewItemRecommendation = this.d;
            int iHashCode4 = (iHashCode3 + (onRatingsAndReviewsReviewItemRecommendation == null ? 0 : onRatingsAndReviewsReviewItemRecommendation.hashCode())) * 31;
            OnRatingsAndReviewsReviewItemInfo onRatingsAndReviewsReviewItemInfo = this.e;
            int iHashCode5 = (iHashCode4 + (onRatingsAndReviewsReviewItemInfo == null ? 0 : onRatingsAndReviewsReviewItemInfo.hashCode())) * 31;
            OnRatingsAndReviewsReviewItemBody onRatingsAndReviewsReviewItemBody = this.f;
            return iHashCode5 + (onRatingsAndReviewsReviewItemBody != null ? onRatingsAndReviewsReviewItemBody.f23819a.hashCode() : 0);
        }

        public final String toString() {
            return "Section(__typename=" + this.f23824a + ", onRatingsAndReviewsReviewItemRating=" + this.b + ", onRatingsAndReviewsReviewItemReviewTitle=" + this.c + ", onRatingsAndReviewsReviewItemRecommendation=" + this.d + ", onRatingsAndReviewsReviewItemInfo=" + this.e + ", onRatingsAndReviewsReviewItemBody=" + this.f + ")";
        }
    }

    public RatingsAndReviewsReviewDetails(ArrayList arrayList) {
        this.f23817a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RatingsAndReviewsReviewDetails) && this.f23817a.equals(((RatingsAndReviewsReviewDetails) obj).f23817a);
    }

    public final int hashCode() {
        return this.f23817a.hashCode();
    }

    public final String toString() {
        return a.k("RatingsAndReviewsReviewDetails(items=", ")", this.f23817a);
    }
}
