package au.com.woolworths.feature.shop.bundles;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BundlesActivity extends Hilt_BundlesActivity {
    public static final /* synthetic */ int A = 0;
    public final Lazy x = LazyKt.b(new Function0<Activities.BundlesActivity.Extras>() { // from class: au.com.woolworths.feature.shop.bundles.BundlesActivity$special$$inlined$extraOrNull$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (Parcelable) IntentCompat.a(this.d.getIntent(), "EXTRA_DATA", Activities.BundlesActivity.Extras.class);
        }
    });
    public final ViewModelLazy y;
    public ShopAppNavigator z;

    public BundlesActivity() {
        final b bVar = new b(this, 0);
        this.y = new ViewModelLazy(Reflection.f24268a.b(BundlesViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.bundles.BundlesActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.bundles.BundlesActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>(this) { // from class: au.com.woolworths.feature.shop.bundles.BundlesActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (CreationExtras) this.h.invoke();
            }
        });
    }

    @Override // au.com.woolworths.feature.shop.bundles.Hilt_BundlesActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.BundlesActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final BundlesActivity bundlesActivity = BundlesActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-583733368, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.BundlesActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                BundlesActivity bundlesActivity2 = bundlesActivity;
                                BundlesViewModel bundlesViewModel = (BundlesViewModel) bundlesActivity2.y.getD();
                                Activities.BundlesActivity.Extras extras = (Activities.BundlesActivity.Extras) bundlesActivity2.x.getD();
                                boolean z = extras != null ? extras.d : false;
                                composer2.o(5004770);
                                boolean zI = composer2.I(bundlesActivity2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    objG = new b(bundlesActivity2, 1);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(bundlesActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == obj5) {
                                    objG2 = new b(bundlesActivity2, 2);
                                    composer2.A(objG2);
                                }
                                Function0 function02 = (Function0) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(bundlesActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == obj5) {
                                    objG3 = new c(bundlesActivity2, 1);
                                    composer2.A(objG3);
                                }
                                Function1 function1 = (Function1) objG3;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(bundlesActivity2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == obj5) {
                                    objG4 = new c(bundlesActivity2, 2);
                                    composer2.A(objG4);
                                }
                                composer2.l();
                                BundlesScreenKt.a(z, bundlesViewModel, function0, function02, function1, (Function1) objG4, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 63182948));
    }
}
