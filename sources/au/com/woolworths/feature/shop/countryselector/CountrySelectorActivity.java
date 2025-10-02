package au.com.woolworths.feature.shop.countryselector;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel;
import au.com.woolworths.feature.shop.countryselector.ui.CountrySelectorScreenKt;
import au.com.woolworths.shop.auth.ShopAuthManager;
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

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lau/com/woolworths/android/onesite/navigation/Activities$CountrySelector$Extras;", "extra", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CountrySelectorActivity extends Hilt_CountrySelectorActivity {
    public static final /* synthetic */ int y = 0;
    public ShopAuthManager w;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(CountrySelectorViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.countryselector.CountrySelectorActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.countryselector.CountrySelectorActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.countryselector.CountrySelectorActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final CountrySelectorActivity countrySelectorActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<CountrySelectorViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.feature.shop.countryselector.CountrySelectorActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    final CountrySelectorActivity countrySelectorActivity2 = countrySelectorActivity;
                    Lazy lazyB = LazyKt.b(new Function0<Activities.CountrySelector.Extras>() { // from class: au.com.woolworths.feature.shop.countryselector.CountrySelectorActivity$viewModel_delegate$lambda$1$$inlined$extraOrThrow$1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Parcelable parcelable = (Parcelable) IntentCompat.a(countrySelectorActivity2.getIntent(), "EXTRA_SOURCE", Activities.CountrySelector.Extras.class);
                            if (parcelable != null) {
                                return parcelable;
                            }
                            throw new IllegalArgumentException("Value for EXTRA_SOURCE must be provided and not null.");
                        }
                    });
                    int i = CountrySelectorActivity.y;
                    return ((CountrySelectorViewModel.Factory) obj).a(Activities.CountrySelector.Source.valueOf(((Activities.CountrySelector.Extras) lazyB.getD()).d));
                }
            });
        }
    });

    @Override // au.com.woolworths.feature.shop.countryselector.Hilt_CountrySelectorActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.b(this);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.countryselector.CountrySelectorActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final CountrySelectorActivity countrySelectorActivity = CountrySelectorActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1467560700, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.countryselector.CountrySelectorActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                CountrySelectorActivity countrySelectorActivity2 = countrySelectorActivity;
                                CountrySelectorViewModel countrySelectorViewModel = (CountrySelectorViewModel) countrySelectorActivity2.x.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(countrySelectorActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    CountrySelectorActivity$onCreate$1$1$1$1 countrySelectorActivity$onCreate$1$1$1$1 = new CountrySelectorActivity$onCreate$1$1$1$1(0, countrySelectorActivity2, CountrySelectorActivity.class, "navigateToOnboarding", "navigateToOnboarding()V", 0);
                                    composer2.A(countrySelectorActivity$onCreate$1$1$1$1);
                                    objG = countrySelectorActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(countrySelectorActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    CountrySelectorActivity$onCreate$1$1$2$1 countrySelectorActivity$onCreate$1$1$2$1 = new CountrySelectorActivity$onCreate$1$1$2$1(1, countrySelectorActivity2, CountrySelectorActivity.class, "navigateToHomePage", "navigateToHomePage(Lau/com/woolworths/android/onesite/modules/common/Region;)V", 0);
                                    composer2.A(countrySelectorActivity$onCreate$1$1$2$1);
                                    objG2 = countrySelectorActivity$onCreate$1$1$2$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG2);
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(countrySelectorActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    CountrySelectorActivity$onCreate$1$1$3$1 countrySelectorActivity$onCreate$1$1$3$1 = new CountrySelectorActivity$onCreate$1$1$3$1(0, countrySelectorActivity2, CountrySelectorActivity.class, "finish", "finish()V", 0);
                                    composer2.A(countrySelectorActivity$onCreate$1$1$3$1);
                                    objG3 = countrySelectorActivity$onCreate$1$1$3$1;
                                }
                                composer2.l();
                                Function0 function02 = (Function0) ((KFunction) objG3);
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(countrySelectorActivity2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    objG4 = new CountrySelectorActivity$onCreate$1$1$4$1(0, countrySelectorActivity2, CountrySelectorActivity.class, "performLogout", "performLogout()V", 0);
                                    composer2.A(objG4);
                                }
                                composer2.l();
                                Function0 function03 = (Function0) ((KFunction) objG4);
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(countrySelectorActivity2);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$1) {
                                    objG5 = new CountrySelectorActivity$onCreate$1$1$5$1(0, countrySelectorActivity2, CountrySelectorActivity.class, "finishAffinity", "finishAffinity()V", 0);
                                    composer2.A(objG5);
                                }
                                composer2.l();
                                CountrySelectorScreenKt.a(countrySelectorViewModel, function0, function1, function02, function03, (Function0) ((KFunction) objG5), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -140500512));
    }
}
