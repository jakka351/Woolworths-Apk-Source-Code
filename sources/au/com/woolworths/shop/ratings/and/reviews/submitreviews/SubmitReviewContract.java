package au.com.woolworths.shop.ratings.and.reviews.submitreviews;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.WriteReviewFormData;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract;", "", "Action", "ViewState", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SubmitReviewContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$Action;", "", "OnNavigateUp", "ShowSubmitFormSuccessToast", "LaunchLogin", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$Action$LaunchLogin;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$Action$OnNavigateUp;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$Action$ShowSubmitFormSuccessToast;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$Action$LaunchLogin;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$Action;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchLogin extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLogin f12769a = new LaunchLogin();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchLogin);
            }

            public final int hashCode() {
                return 707993586;
            }

            public final String toString() {
                return "LaunchLogin";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$Action$OnNavigateUp;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$Action;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnNavigateUp extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final OnNavigateUp f12770a = new OnNavigateUp();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OnNavigateUp);
            }

            public final int hashCode() {
                return 472447535;
            }

            public final String toString() {
                return "OnNavigateUp";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$Action$ShowSubmitFormSuccessToast;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$Action;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSubmitFormSuccessToast extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSubmitFormSuccessToast f12771a = new ShowSubmitFormSuccessToast();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSubmitFormSuccessToast);
            }

            public final int hashCode() {
                return 1372202593;
            }

            public final String toString() {
                return "ShowSubmitFormSuccessToast";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState;", "", "Content", "Failure", "DuplicateFailure", "InProgress", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState$Content;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState$DuplicateFailure;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState$Failure;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState$InProgress;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState$Content;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final WriteReviewFormData f12772a;

            public Content(WriteReviewFormData data) {
                Intrinsics.h(data, "data");
                this.f12772a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && Intrinsics.c(this.f12772a, ((Content) obj).f12772a);
            }

            public final int hashCode() {
                return this.f12772a.hashCode();
            }

            public final String toString() {
                return "Content(data=" + this.f12772a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState$DuplicateFailure;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DuplicateFailure implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final DuplicateFailure f12773a = new DuplicateFailure();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DuplicateFailure);
            }

            public final int hashCode() {
                return 1989348149;
            }

            public final String toString() {
                return "DuplicateFailure";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState$Failure;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Failure implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageMessage.Error f12774a;
            public final Text b;
            public final Text c;
            public final Function0 d;

            public Failure(FullPageMessage.Error error, ResText resText, Function0 onTryAgain, int i) {
                resText = (i & 2) != 0 ? new ResText(R.string.submit_review_form_error) : resText;
                ResText resText2 = new ResText(R.string.submit_review_form_error);
                Intrinsics.h(error, "error");
                Intrinsics.h(onTryAgain, "onTryAgain");
                this.f12774a = error;
                this.b = resText;
                this.c = resText2;
                this.d = onTryAgain;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) obj;
                return Intrinsics.c(this.f12774a, failure.f12774a) && Intrinsics.c(this.b, failure.b) && Intrinsics.c(this.c, failure.c) && Intrinsics.c(this.d, failure.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f12774a.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Failure(error=" + this.f12774a + ", connectionErrorMessage=" + this.b + ", serverErrorMessage=" + this.c + ", onTryAgain=" + this.d + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState$InProgress;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class InProgress implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final InProgress f12775a = new InProgress();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InProgress);
            }

            public final int hashCode() {
                return -729341912;
            }

            public final String toString() {
                return "InProgress";
            }
        }

        default String getTitle() {
            WriteReviewFormData writeReviewFormData;
            Content content = this instanceof Content ? (Content) this : null;
            return (content == null || (writeReviewFormData = content.f12772a) == null) ? "" : writeReviewFormData.f12747a;
        }
    }
}
