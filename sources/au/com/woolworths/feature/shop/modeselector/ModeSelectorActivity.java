package au.com.woolworths.feature.shop.modeselector;

import android.os.Bundle;
import android.os.Parcelable;
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
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel;
import au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt;
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ModeSelectorActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lau/com/woolworths/android/onesite/navigation/Activities$ModeSelectorActivity$ExtraCollectionModeSelector;", "extraModeSelector", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ModeSelectorActivity extends Hilt_ModeSelectorActivity {
    public static final /* synthetic */ int x = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(ModeSelectorViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.modeselector.ModeSelectorActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.modeselector.ModeSelectorActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.modeselector.ModeSelectorActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final ModeSelectorActivity modeSelectorActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<ModeSelectorViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.feature.shop.modeselector.ModeSelectorActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    final ModeSelectorActivity modeSelectorActivity2 = modeSelectorActivity;
                    Lazy lazyB = LazyKt.b(new Function0<Activities.ModeSelectorActivity.ExtraCollectionModeSelector>() { // from class: au.com.woolworths.feature.shop.modeselector.ModeSelectorActivity$viewModel_delegate$lambda$1$$inlined$extraOrNull$1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return (Parcelable) IntentCompat.a(modeSelectorActivity2.getIntent(), "EXTRA_IS_HOME_BUTTON_VISIBLE", Activities.ModeSelectorActivity.ExtraCollectionModeSelector.class);
                        }
                    });
                    int i = ModeSelectorActivity.x;
                    return ((ModeSelectorViewModel.Factory) obj).a((Activities.ModeSelectorActivity.ExtraCollectionModeSelector) lazyB.getD());
                }
            });
        }
    });

    @Override // au.com.woolworths.feature.shop.modeselector.Hilt_ModeSelectorActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.modeselector.ModeSelectorActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ModeSelectorActivity modeSelectorActivity = ModeSelectorActivity.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1532163049, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.modeselector.ModeSelectorActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = ModeSelectorActivity.x;
                                ModeSelectorActivity modeSelectorActivity2 = modeSelectorActivity;
                                ModeSelectorViewModel modeSelectorViewModel = (ModeSelectorViewModel) modeSelectorActivity2.w.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(modeSelectorActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    ModeSelectorActivity$onCreate$1$1$1$1 modeSelectorActivity$onCreate$1$1$1$1 = new ModeSelectorActivity$onCreate$1$1$1$1(1, modeSelectorActivity2, ModeSelectorActivity.class, "openMapsApp", "openMapsApp(Ljava/lang/String;)V", 0);
                                    composer2.A(modeSelectorActivity$onCreate$1$1$1$1);
                                    objG = modeSelectorActivity$onCreate$1$1$1$1;
                                }
                                KFunction kFunction = (KFunction) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(modeSelectorActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new f(modeSelectorActivity2, 25);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                ModeSelectorScreenKt.b(modeSelectorViewModel, (Function0) objG2, (Function1) kFunction, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -95295695));
        getD().a((ModeSelectorViewModel) this.w.getD());
    }
}
