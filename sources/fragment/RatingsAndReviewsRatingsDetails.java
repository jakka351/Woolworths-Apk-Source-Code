package fragment;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetails;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Section", "OnRatingsAndReviewsRatingDistributionOverview", "RatingText", "Cta", "LinkAction", "LinkTextWithAlt", "OnRatingsAndReviewsRatingDistributionDetails", "Item", "OnRatingsAndReviewsRatingDistributionWriteReview", "Button", "ButtonAction", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RatingsAndReviewsRatingsDetails implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23793a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetails$Button;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f23794a;
        public final String b;
        public final boolean c;
        public final ButtonAction d;
        public final String e;
        public final String f;

        public Button(String str, String str2, boolean z, ButtonAction buttonAction, String str3, String str4) {
            this.f23794a = str;
            this.b = str2;
            this.c = z;
            this.d = buttonAction;
            this.e = str3;
            this.f = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f23794a, button.f23794a) && Intrinsics.c(this.b, button.b) && this.c == button.c && Intrinsics.c(this.d, button.d) && Intrinsics.c(this.e, button.e) && Intrinsics.c(this.f, button.f);
        }

        public final int hashCode() {
            String str = this.f23794a;
            int iE = b.e(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
            ButtonAction buttonAction = this.d;
            int iHashCode = (iE + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Button(buttonId=", this.f23794a, ", label=", this.b, ", enabled=");
            sbV.append(this.c);
            sbV.append(", buttonAction=");
            sbV.append(this.d);
            sbV.append(", iconUrl=");
            return androidx.constraintlayout.core.state.a.l(sbV, this.e, ", altText=", this.f, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetails$ButtonAction;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f23795a;
        public final String b;
        public final String c;

        public ButtonAction(ActionType actionType, String str, String str2) {
            this.f23795a = actionType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonAction)) {
                return false;
            }
            ButtonAction buttonAction = (ButtonAction) obj;
            return this.f23795a == buttonAction.f23795a && Intrinsics.c(this.b, buttonAction.b) && Intrinsics.c(this.c, buttonAction.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f23795a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.s("ButtonAction(type=", this.f23795a, ", action=", this.b, ", id="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetails$Cta;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f23796a;
        public final LinkAction b;
        public final LinkTextWithAlt c;

        public Cta(String str, LinkAction linkAction, LinkTextWithAlt linkTextWithAlt) {
            this.f23796a = str;
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
            return Intrinsics.c(this.f23796a, cta.f23796a) && Intrinsics.c(this.b, cta.b) && Intrinsics.c(this.c, cta.c);
        }

        public final int hashCode() {
            String str = this.f23796a;
            return this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            return "Cta(linkId=" + this.f23796a + ", linkAction=" + this.b + ", linkTextWithAlt=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetails$Item;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f23797a;
        public final double b;
        public final String c;

        public Item(double d, String str, String str2) {
            this.f23797a = str;
            this.b = d;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f23797a, item.f23797a) && Double.compare(this.b, item.b) == 0 && Intrinsics.c(this.c, item.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + android.support.v4.media.session.a.a(this.b, this.f23797a.hashCode() * 31, 31);
        }

        public final String toString() {
            return a.p(au.com.woolworths.android.onesite.a.r(this.b, "Item(ratingScore=", this.f23797a, ", percentage="), ", ratingCount=", this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetails$LinkAction;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f23798a;
        public final String b;
        public final String c;

        public LinkAction(ActionType actionType, String str, String str2) {
            this.f23798a = actionType;
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
            return this.f23798a == linkAction.f23798a && Intrinsics.c(this.b, linkAction.b) && Intrinsics.c(this.c, linkAction.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f23798a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.s("LinkAction(type=", this.f23798a, ", action=", this.b, ", id="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetails$LinkTextWithAlt;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkTextWithAlt {

        /* renamed from: a, reason: collision with root package name */
        public final String f23799a;
        public final String b;

        public LinkTextWithAlt(String str, String str2) {
            this.f23799a = str;
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
            return Intrinsics.c(this.f23799a, linkTextWithAlt.f23799a) && Intrinsics.c(this.b, linkTextWithAlt.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23799a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("LinkTextWithAlt(text=", this.f23799a, ", altText=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetails$OnRatingsAndReviewsRatingDistributionDetails;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsRatingDistributionDetails {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23800a;

        public OnRatingsAndReviewsRatingDistributionDetails(ArrayList arrayList) {
            this.f23800a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRatingsAndReviewsRatingDistributionDetails) && this.f23800a.equals(((OnRatingsAndReviewsRatingDistributionDetails) obj).f23800a);
        }

        public final int hashCode() {
            return this.f23800a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnRatingsAndReviewsRatingDistributionDetails(items=", ")", this.f23800a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetails$OnRatingsAndReviewsRatingDistributionOverview;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsRatingDistributionOverview {

        /* renamed from: a, reason: collision with root package name */
        public final double f23801a;
        public final double b;
        public final RatingText c;
        public final int d;
        public final String e;
        public final Cta f;

        public OnRatingsAndReviewsRatingDistributionOverview(double d, double d2, RatingText ratingText, int i, String str, Cta cta) {
            this.f23801a = d;
            this.b = d2;
            this.c = ratingText;
            this.d = i;
            this.e = str;
            this.f = cta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRatingsAndReviewsRatingDistributionOverview)) {
                return false;
            }
            OnRatingsAndReviewsRatingDistributionOverview onRatingsAndReviewsRatingDistributionOverview = (OnRatingsAndReviewsRatingDistributionOverview) obj;
            return Double.compare(this.f23801a, onRatingsAndReviewsRatingDistributionOverview.f23801a) == 0 && Double.compare(this.b, onRatingsAndReviewsRatingDistributionOverview.b) == 0 && Intrinsics.c(this.c, onRatingsAndReviewsRatingDistributionOverview.c) && this.d == onRatingsAndReviewsRatingDistributionOverview.d && Intrinsics.c(this.e, onRatingsAndReviewsRatingDistributionOverview.e) && Intrinsics.c(this.f, onRatingsAndReviewsRatingDistributionOverview.f);
        }

        public final int hashCode() {
            int iC = b.c(b.a(this.d, (this.c.hashCode() + android.support.v4.media.session.a.a(this.b, Double.hashCode(this.f23801a) * 31, 31)) * 31, 31), 31, this.e);
            Cta cta = this.f;
            return iC + (cta == null ? 0 : cta.hashCode());
        }

        public final String toString() {
            StringBuilder sbN = androidx.constraintlayout.core.state.a.n(this.f23801a, "OnRatingsAndReviewsRatingDistributionOverview(averageRating=", ", displayRatings=");
            sbN.append(this.b);
            sbN.append(", ratingText=");
            sbN.append(this.c);
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.t(this.d, ", maximumRating=", ", totalReviewsText=", this.e, sbN);
            sbN.append(", cta=");
            sbN.append(this.f);
            sbN.append(")");
            return sbN.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetails$OnRatingsAndReviewsRatingDistributionWriteReview;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsRatingDistributionWriteReview {

        /* renamed from: a, reason: collision with root package name */
        public final Button f23802a;

        public OnRatingsAndReviewsRatingDistributionWriteReview(Button button) {
            this.f23802a = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRatingsAndReviewsRatingDistributionWriteReview) && Intrinsics.c(this.f23802a, ((OnRatingsAndReviewsRatingDistributionWriteReview) obj).f23802a);
        }

        public final int hashCode() {
            return this.f23802a.hashCode();
        }

        public final String toString() {
            return "OnRatingsAndReviewsRatingDistributionWriteReview(button=" + this.f23802a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetails$RatingText;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RatingText {

        /* renamed from: a, reason: collision with root package name */
        public final String f23803a;
        public final String b;

        public RatingText(String str, String str2) {
            this.f23803a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RatingText)) {
                return false;
            }
            RatingText ratingText = (RatingText) obj;
            return Intrinsics.c(this.f23803a, ratingText.f23803a) && Intrinsics.c(this.b, ratingText.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23803a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("RatingText(text=", this.f23803a, ", altText=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetails$Section;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f23804a;
        public final OnRatingsAndReviewsRatingDistributionOverview b;
        public final OnRatingsAndReviewsRatingDistributionDetails c;
        public final OnRatingsAndReviewsRatingDistributionWriteReview d;

        public Section(String __typename, OnRatingsAndReviewsRatingDistributionOverview onRatingsAndReviewsRatingDistributionOverview, OnRatingsAndReviewsRatingDistributionDetails onRatingsAndReviewsRatingDistributionDetails, OnRatingsAndReviewsRatingDistributionWriteReview onRatingsAndReviewsRatingDistributionWriteReview) {
            Intrinsics.h(__typename, "__typename");
            this.f23804a = __typename;
            this.b = onRatingsAndReviewsRatingDistributionOverview;
            this.c = onRatingsAndReviewsRatingDistributionDetails;
            this.d = onRatingsAndReviewsRatingDistributionWriteReview;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.c(this.f23804a, section.f23804a) && Intrinsics.c(this.b, section.b) && Intrinsics.c(this.c, section.c) && Intrinsics.c(this.d, section.d);
        }

        public final int hashCode() {
            int iHashCode = this.f23804a.hashCode() * 31;
            OnRatingsAndReviewsRatingDistributionOverview onRatingsAndReviewsRatingDistributionOverview = this.b;
            int iHashCode2 = (iHashCode + (onRatingsAndReviewsRatingDistributionOverview == null ? 0 : onRatingsAndReviewsRatingDistributionOverview.hashCode())) * 31;
            OnRatingsAndReviewsRatingDistributionDetails onRatingsAndReviewsRatingDistributionDetails = this.c;
            int iHashCode3 = (iHashCode2 + (onRatingsAndReviewsRatingDistributionDetails == null ? 0 : onRatingsAndReviewsRatingDistributionDetails.f23800a.hashCode())) * 31;
            OnRatingsAndReviewsRatingDistributionWriteReview onRatingsAndReviewsRatingDistributionWriteReview = this.d;
            return iHashCode3 + (onRatingsAndReviewsRatingDistributionWriteReview != null ? onRatingsAndReviewsRatingDistributionWriteReview.f23802a.hashCode() : 0);
        }

        public final String toString() {
            return "Section(__typename=" + this.f23804a + ", onRatingsAndReviewsRatingDistributionOverview=" + this.b + ", onRatingsAndReviewsRatingDistributionDetails=" + this.c + ", onRatingsAndReviewsRatingDistributionWriteReview=" + this.d + ")";
        }
    }

    public RatingsAndReviewsRatingsDetails(ArrayList arrayList) {
        this.f23793a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RatingsAndReviewsRatingsDetails) && this.f23793a.equals(((RatingsAndReviewsRatingsDetails) obj).f23793a);
    }

    public final int hashCode() {
        return this.f23793a.hashCode();
    }

    public final String toString() {
        return au.com.woolworths.android.onesite.a.k("RatingsAndReviewsRatingsDetails(sections=", ")", this.f23793a);
    }
}
