package au.com.woolworths.shop.ratings.and.reviews.submitreviews;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
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
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubmitReviewActivity extends Hilt_SubmitReviewActivity {
    public static final /* synthetic */ int z = 0;
    public FeatureToggleManager w;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(SubmitReviewViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final SubmitReviewActivity submitReviewActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<SubmitReviewViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    SubmitReviewViewModel.Factory factory = (SubmitReviewViewModel.Factory) obj;
                    String stringExtra = submitReviewActivity.getIntent().getStringExtra("id");
                    if (stringExtra != null) {
                        return factory.a(stringExtra);
                    }
                    throw new IllegalArgumentException("id must be provided");
                }
            });
        }
    });
    public final ActivityResultLauncher y = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new androidx.activity.compose.a(this, 19));

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.Hilt_SubmitReviewActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.b(getWindow(), false);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SubmitReviewActivity submitReviewActivity = SubmitReviewActivity.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1774351924, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = SubmitReviewActivity.z;
                                SubmitReviewActivity submitReviewActivity2 = submitReviewActivity;
                                SubmitReviewViewModel submitReviewViewModel = (SubmitReviewViewModel) submitReviewActivity2.x.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(submitReviewActivity2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    SubmitReviewActivity$onCreate$1$1$1$1 submitReviewActivity$onCreate$1$1$1$1 = new SubmitReviewActivity$onCreate$1$1$1$1(0, submitReviewActivity2, SubmitReviewActivity.class, "finish", "finish()V", 0);
                                    composer2.A(submitReviewActivity$onCreate$1$1$1$1);
                                    objG = submitReviewActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                SubmitReviewScreenKt.f(submitReviewViewModel, (Function0) ((KFunction) objG), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1538844692));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new SubmitReviewActivity$observeActions$1(this, null), 3);
    }
}
