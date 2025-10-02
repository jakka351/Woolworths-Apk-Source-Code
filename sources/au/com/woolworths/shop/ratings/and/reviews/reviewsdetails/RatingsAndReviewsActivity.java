package au.com.woolworths.shop.ratings.and.reviews.reviewsdetails;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsViewModel;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/RatingsAndReviewsActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RatingsAndReviewsActivity extends Hilt_RatingsAndReviewsActivity {
    public static final /* synthetic */ int z = 0;
    public FeatureToggleManager w;
    public final Lazy x = LazyKt.b(new c(this, 28));
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(ReviewsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final RatingsAndReviewsActivity ratingsAndReviewsActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<ReviewsViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ((ReviewsViewModel.Factory) obj).a((String) ratingsAndReviewsActivity.x.getD());
                }
            });
        }
    });

    @Override // au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.Hilt_RatingsAndReviewsActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.b(getWindow(), false);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final RatingsAndReviewsActivity ratingsAndReviewsActivity = RatingsAndReviewsActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(1120752924, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                RatingsAndReviewsActivity ratingsAndReviewsActivity2 = ratingsAndReviewsActivity;
                                ReviewsViewModel reviewsViewModel = (ReviewsViewModel) ratingsAndReviewsActivity2.y.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(ratingsAndReviewsActivity2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    RatingsAndReviewsActivity$onCreate$1$1$1$1 ratingsAndReviewsActivity$onCreate$1$1$1$1 = new RatingsAndReviewsActivity$onCreate$1$1$1$1(0, ratingsAndReviewsActivity2, RatingsAndReviewsActivity.class, "finish", "finish()V", 0);
                                    composer2.A(ratingsAndReviewsActivity$onCreate$1$1$1$1);
                                    objG = ratingsAndReviewsActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                ReviewsDetailsScreenKt.g(reviewsViewModel, (Function0) ((KFunction) objG), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1958489280));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new RatingsAndReviewsActivity$observeActions$1(this, null), 3);
    }
}
