package au.com.woolworths.shop.rewards.promo;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import au.com.woolworths.shop.rewards.promo.composable.PromoRewardsAppScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/rewards/promo/PromoAppActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PromoAppActivity extends Hilt_PromoAppActivity {
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(PromoAppViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.rewards.promo.PromoAppActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.rewards.promo.PromoAppActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.rewards.promo.PromoAppActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Override // au.com.woolworths.shop.rewards.promo.Hilt_PromoAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.b(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.promo.PromoAppActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final PromoAppActivity promoAppActivity = PromoAppActivity.this;
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(1849894939, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.promo.PromoAppActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                PromoAppActivity promoAppActivity2 = promoAppActivity;
                                PromoAppViewModel promoAppViewModel = (PromoAppViewModel) promoAppActivity2.x.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(promoAppActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new i(promoAppActivity2, 7);
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(promoAppActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new c(promoAppActivity2, 5);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                PromoRewardsAppScreenKt.b(promoAppViewModel, function1, (Function0) objG2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 915044104));
    }
}
