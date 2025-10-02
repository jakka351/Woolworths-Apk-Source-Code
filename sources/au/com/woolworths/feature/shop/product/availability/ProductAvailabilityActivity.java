package au.com.woolworths.feature.shop.product.availability;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.product.availability.ui.ProductAvailabilityScreenKt;
import au.com.woolworths.product.models.ProductCard;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductAvailabilityActivity extends Hilt_ProductAvailabilityActivity {
    public static final /* synthetic */ int x = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(ProductAvailabilityViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.product.availability.ProductAvailabilityActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.product.availability.ProductAvailabilityActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.product.availability.ProductAvailabilityActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Override // au.com.woolworths.feature.shop.product.availability.Hilt_ProductAvailabilityActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activities.ProductAvailabilityActivity.ProductAvailabilityExtras productAvailabilityExtras = (Activities.ProductAvailabilityActivity.ProductAvailabilityExtras) getIntent().getParcelableExtra("EXTRA_DATA");
        if (productAvailabilityExtras != null) {
            ProductAvailabilityViewModel productAvailabilityViewModel = (ProductAvailabilityViewModel) this.w.getD();
            Parcelable parcelable = productAvailabilityExtras.d;
            Intrinsics.f(parcelable, "null cannot be cast to non-null type au.com.woolworths.product.models.ProductCard");
            productAvailabilityViewModel.l = (ProductCard) parcelable;
            productAvailabilityViewModel.p6();
        } else {
            finish();
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ProductAvailabilityActivity$listenForActions$1(this, null), 3);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.product.availability.ProductAvailabilityActivity.onCreate.2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ProductAvailabilityActivity productAvailabilityActivity = ProductAvailabilityActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(2127256629, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.product.availability.ProductAvailabilityActivity.onCreate.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProductAvailabilityActivity productAvailabilityActivity2 = productAvailabilityActivity;
                                ProductAvailabilityViewModel productAvailabilityViewModel2 = (ProductAvailabilityViewModel) productAvailabilityActivity2.w.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(productAvailabilityActivity2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    ProductAvailabilityActivity$onCreate$2$1$1$1 productAvailabilityActivity$onCreate$2$1$1$1 = new ProductAvailabilityActivity$onCreate$2$1$1$1(0, productAvailabilityActivity2, ProductAvailabilityActivity.class, "finish", "finish()V", 0);
                                    composer2.A(productAvailabilityActivity$onCreate$2$1$1$1);
                                    objG = productAvailabilityActivity$onCreate$2$1$1$1;
                                }
                                composer2.l();
                                ProductAvailabilityScreenKt.d(productAvailabilityViewModel2, (Function0) ((KFunction) objG), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 554945753));
    }
}
