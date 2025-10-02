package au.com.woolworths.feature.shop.countryselector.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.feature.product.list.compose.productsearch.c;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorContract;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorContract$ViewState;", "viewState", "country-selector_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CountrySelectorScreenKt {
    public static final void a(CountrySelectorViewModel countrySelectorViewModel, Function0 navigateToOnboarding, Function1 navigateToHomePage, Function0 navigateToBack, Function0 onPerformLogout, Function0 finish, Composer composer, int i) {
        ComposerImpl composerImpl;
        CountrySelectorViewModel countrySelectorViewModel2 = countrySelectorViewModel;
        Intrinsics.h(navigateToOnboarding, "navigateToOnboarding");
        Intrinsics.h(navigateToHomePage, "navigateToHomePage");
        Intrinsics.h(navigateToBack, "navigateToBack");
        Intrinsics.h(onPerformLogout, "onPerformLogout");
        Intrinsics.h(finish, "finish");
        ComposerImpl composerImplV = composer.v(-2006415052);
        int i2 = i | (composerImplV.I(countrySelectorViewModel2) ? 4 : 2) | (composerImplV.I(navigateToOnboarding) ? 32 : 16) | (composerImplV.I(navigateToHomePage) ? 256 : 128) | (composerImplV.I(navigateToBack) ? 2048 : 1024) | (composerImplV.I(onPerformLogout) ? 16384 : 8192) | (composerImplV.I(finish) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            MutableState mutableStateA = SnapshotStateKt.a(countrySelectorViewModel2.h, composerImplV);
            Flow flow = countrySelectorViewModel2.j;
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(countrySelectorViewModel2) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 57344) == 16384);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                CountrySelectorScreenKt$CountrySelectorScreen$1$1 countrySelectorScreenKt$CountrySelectorScreen$1$1 = new CountrySelectorScreenKt$CountrySelectorScreen$1$1(countrySelectorViewModel2, navigateToOnboarding, navigateToHomePage, onPerformLogout, null);
                countrySelectorViewModel2 = countrySelectorViewModel2;
                composerImplV.A(countrySelectorScreenKt$CountrySelectorScreen$1$1);
                objG = countrySelectorScreenKt$CountrySelectorScreen$1$1;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG);
            CountrySelectorContract.ViewStateBySource viewStateBySource = ((CountrySelectorContract.ViewState) mutableStateA.getD()).g;
            if (viewStateBySource instanceof CountrySelectorContract.ViewStateBySource.MoreCountrySelectorViewState) {
                composerImplV.o(275487126);
                CountrySelectorContract.ViewStateBySource.MoreCountrySelectorViewState moreCountrySelectorViewState = (CountrySelectorContract.ViewStateBySource.MoreCountrySelectorViewState) viewStateBySource;
                composerImplV.o(5004770);
                boolean zI2 = composerImplV.I(countrySelectorViewModel2);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    CountrySelectorScreenKt$CountrySelectorScreen$2$1 countrySelectorScreenKt$CountrySelectorScreen$2$1 = new CountrySelectorScreenKt$CountrySelectorScreen$2$1(1, countrySelectorViewModel2, CountrySelectorViewModel.class, "onRegionSelected", "onRegionSelected(Lau/com/woolworths/android/onesite/modules/common/Region;)V", 0);
                    composerImplV.A(countrySelectorScreenKt$CountrySelectorScreen$2$1);
                    objG2 = countrySelectorScreenKt$CountrySelectorScreen$2$1;
                }
                composerImplV.V(false);
                Function1 function1 = (Function1) ((KFunction) objG2);
                composerImplV.o(5004770);
                boolean zI3 = composerImplV.I(countrySelectorViewModel2);
                Object objG3 = composerImplV.G();
                if (zI3 || objG3 == composer$Companion$Empty$1) {
                    CountrySelectorScreenKt$CountrySelectorScreen$3$1 countrySelectorScreenKt$CountrySelectorScreen$3$1 = new CountrySelectorScreenKt$CountrySelectorScreen$3$1(0, countrySelectorViewModel2, CountrySelectorViewModel.class, "onConfirmRegionSelected", "onConfirmRegionSelected()V", 0);
                    composerImplV.A(countrySelectorScreenKt$CountrySelectorScreen$3$1);
                    objG3 = countrySelectorScreenKt$CountrySelectorScreen$3$1;
                }
                composerImplV.V(false);
                Function0 function0 = (Function0) ((KFunction) objG3);
                composerImplV.o(5004770);
                boolean zI4 = composerImplV.I(countrySelectorViewModel2);
                Object objG4 = composerImplV.G();
                if (zI4 || objG4 == composer$Companion$Empty$1) {
                    CountrySelectorScreenKt$CountrySelectorScreen$4$1 countrySelectorScreenKt$CountrySelectorScreen$4$1 = new CountrySelectorScreenKt$CountrySelectorScreen$4$1(0, countrySelectorViewModel2, CountrySelectorViewModel.class, "onCancelRegionSelected", "onCancelRegionSelected()V", 0);
                    composerImplV.A(countrySelectorScreenKt$CountrySelectorScreen$4$1);
                    objG4 = countrySelectorScreenKt$CountrySelectorScreen$4$1;
                }
                composerImplV.V(false);
                MoreCountrySelectorScreenKt.b(moreCountrySelectorViewState, function1, function0, (Function0) ((KFunction) objG4), navigateToBack, composerImplV, (i2 << 3) & 57344);
                composerImplV.V(false);
                composerImpl = composerImplV;
            } else {
                if (!(viewStateBySource instanceof CountrySelectorContract.ViewStateBySource.OnboardingCountrySelectorViewState)) {
                    throw a.w(275482960, composerImplV, false);
                }
                composerImplV.o(275500345);
                Region region = ((CountrySelectorContract.ViewStateBySource.OnboardingCountrySelectorViewState) viewStateBySource).f7037a;
                composerImplV.o(5004770);
                boolean zI5 = composerImplV.I(countrySelectorViewModel2);
                Object objG5 = composerImplV.G();
                if (zI5 || objG5 == composer$Companion$Empty$1) {
                    CountrySelectorScreenKt$CountrySelectorScreen$5$1 countrySelectorScreenKt$CountrySelectorScreen$5$1 = new CountrySelectorScreenKt$CountrySelectorScreen$5$1(1, countrySelectorViewModel2, CountrySelectorViewModel.class, "onRegionSelected", "onRegionSelected(Lau/com/woolworths/android/onesite/modules/common/Region;)V", 0);
                    composerImplV.A(countrySelectorScreenKt$CountrySelectorScreen$5$1);
                    objG5 = countrySelectorScreenKt$CountrySelectorScreen$5$1;
                }
                composerImplV.V(false);
                Function1 function12 = (Function1) ((KFunction) objG5);
                composerImplV.o(5004770);
                boolean zI6 = composerImplV.I(countrySelectorViewModel2);
                Object objG6 = composerImplV.G();
                if (zI6 || objG6 == composer$Companion$Empty$1) {
                    CountrySelectorScreenKt$CountrySelectorScreen$6$1 countrySelectorScreenKt$CountrySelectorScreen$6$1 = new CountrySelectorScreenKt$CountrySelectorScreen$6$1(0, countrySelectorViewModel2, CountrySelectorViewModel.class, "finishCountrySelection", "finishCountrySelection()V", 0);
                    composerImplV.A(countrySelectorScreenKt$CountrySelectorScreen$6$1);
                    objG6 = countrySelectorScreenKt$CountrySelectorScreen$6$1;
                }
                composerImplV.V(false);
                composerImpl = composerImplV;
                OnboardingCountrySelectorScreenKt.a(region, function12, (Function0) ((KFunction) objG6), finish, composerImpl, (i2 >> 6) & 7168);
                composerImpl.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(countrySelectorViewModel, navigateToOnboarding, navigateToHomePage, navigateToBack, onPerformLogout, finish, i);
        }
    }
}
