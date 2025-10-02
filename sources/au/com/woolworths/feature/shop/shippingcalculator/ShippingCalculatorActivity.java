package au.com.woolworths.feature.shop.shippingcalculator;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.myorders.details.infomodal.a;
import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorContract;
import au.com.woolworths.feature.shop.shippingcalculator.ui.ShippingCalculatorScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorContract$ViewState;", "viewState", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShippingCalculatorActivity extends Hilt_ShippingCalculatorActivity {
    public static final /* synthetic */ int y = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(ShippingCalculatorViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Override // au.com.woolworths.feature.shop.shippingcalculator.Hilt_ShippingCalculatorActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.b(this);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorActivity$setViewContent$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ShippingCalculatorActivity shippingCalculatorActivity = this.d;
                    final MutableState mutableStateA = FlowExtKt.a(((ShippingCalculatorViewModel) shippingCalculatorActivity.x.getD()).h, composer);
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(1323818684, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorActivity$setViewContent$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            ShippingCalculatorActivity shippingCalculatorActivity2 = shippingCalculatorActivity;
                            ViewModelLazy viewModelLazy = shippingCalculatorActivity2.x;
                            if ((iIntValue & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ShippingCalculatorContract.ViewState viewState = (ShippingCalculatorContract.ViewState) mutableStateA.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(shippingCalculatorActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new a(shippingCalculatorActivity2, 13);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                ShippingCalculatorViewModel shippingCalculatorViewModel = (ShippingCalculatorViewModel) viewModelLazy.getD();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(shippingCalculatorViewModel);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    ShippingCalculatorActivity$setViewContent$1$1$2$1 shippingCalculatorActivity$setViewContent$1$1$2$1 = new ShippingCalculatorActivity$setViewContent$1$1$2$1(1, shippingCalculatorViewModel, ShippingCalculatorViewModel.class, "onSearchTextChanged", "onSearchTextChanged$shipping_calculator_release(Ljava/lang/String;)V", 0);
                                    composer2.A(shippingCalculatorActivity$setViewContent$1$1$2$1);
                                    objG2 = shippingCalculatorActivity$setViewContent$1$1$2$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG2);
                                ShippingCalculatorViewModel shippingCalculatorViewModel2 = (ShippingCalculatorViewModel) viewModelLazy.getD();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(shippingCalculatorViewModel2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    ShippingCalculatorActivity$setViewContent$1$1$3$1 shippingCalculatorActivity$setViewContent$1$1$3$1 = new ShippingCalculatorActivity$setViewContent$1$1$3$1(2, shippingCalculatorViewModel2, ShippingCalculatorViewModel.class, "onSuburbSelected", "onSuburbSelected$shipping_calculator_release(Ljava/lang/String;Ljava/lang/String;)V", 0);
                                    composer2.A(shippingCalculatorActivity$setViewContent$1$1$3$1);
                                    objG3 = shippingCalculatorActivity$setViewContent$1$1$3$1;
                                }
                                composer2.l();
                                ShippingCalculatorScreenKt.b(viewState, function0, function1, (Function2) ((KFunction) objG3), null, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -198557344));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ShippingCalculatorActivity$collectActions$1(this, null), 3);
    }
}
