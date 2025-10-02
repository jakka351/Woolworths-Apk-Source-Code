package au.com.woolworths.feature.shop.instore.cart;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/instore/cart/InstoreCartActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "instore-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstoreCartActivity extends Hilt_InstoreCartActivity {
    public AnalyticsManager w;
    public ShopAppNavigator x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(InstoreCartViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.instore.cart.InstoreCartActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.instore.cart.InstoreCartActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.instore.cart.InstoreCartActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Override // au.com.woolworths.feature.shop.instore.cart.Hilt_InstoreCartActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.b(getWindow(), false);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.InstoreCartActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final InstoreCartActivity instoreCartActivity = InstoreCartActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(923376621, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.InstoreCartActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                InstoreCartActivity instoreCartActivity2 = instoreCartActivity;
                                InstoreCartViewModel instoreCartViewModel = (InstoreCartViewModel) instoreCartActivity2.y.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(instoreCartActivity2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    objG = new f(instoreCartActivity2, 20);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(instoreCartActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == obj5) {
                                    Object instoreCartActivity$onCreate$1$1$2$1 = new InstoreCartActivity$onCreate$1$1$2$1(1, instoreCartActivity2, InstoreCartActivity.class, "openInStoreMap", "openInStoreMap(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(instoreCartActivity$onCreate$1$1$2$1);
                                    objG2 = instoreCartActivity$onCreate$1$1$2$1;
                                }
                                composer2.l();
                                InstoreCartScreenKt.h(instoreCartViewModel, function0, (Function1) ((KFunction) objG2), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 854898833));
    }
}
