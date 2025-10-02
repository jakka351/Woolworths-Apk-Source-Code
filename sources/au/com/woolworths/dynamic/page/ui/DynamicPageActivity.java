package au.com.woolworths.dynamic.page.ui;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.compose.a;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import au.com.woolworths.dynamic.page.ui.DynamicPageViewModel;
import au.com.woolworths.dynamic.page.ui.content.DynamicPageScreenKt;
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/ui/DynamicPageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$ViewState;", "viewState", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DynamicPageActivity extends Hilt_DynamicPageActivity {
    public static final /* synthetic */ int A = 0;
    public FeatureToggleManager x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(DynamicPageViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.dynamic.page.ui.DynamicPageActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.dynamic.page.ui.DynamicPageActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.dynamic.page.ui.DynamicPageActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final DynamicPageActivity dynamicPageActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<DynamicPageViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.dynamic.page.ui.DynamicPageActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DynamicPageViewModel.Factory factory = (DynamicPageViewModel.Factory) obj;
                    String stringExtra = dynamicPageActivity.getIntent().getStringExtra("EXTRA_PAGE_ID");
                    if (stringExtra != null) {
                        return factory.a(stringExtra);
                    }
                    throw new IllegalArgumentException("EXTRA_PAGE_ID must be provided");
                }
            });
        }
    });
    public final ActivityResultLauncher z = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 3));

    public final DynamicPageViewModel O4() {
        return (DynamicPageViewModel) this.y.getD();
    }

    @Override // au.com.woolworths.dynamic.page.ui.Hilt_DynamicPageActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.DynamicPageActivity$setViewContent$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = DynamicPageActivity.A;
                    final DynamicPageActivity dynamicPageActivity = this.d;
                    final MutableState mutableStateA = FlowExtKt.a(dynamicPageActivity.O4().m, composer);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-792889100, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.DynamicPageActivity$setViewContent$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                DynamicPageContract.ViewState viewState = (DynamicPageContract.ViewState) mutableStateA.getD();
                                Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                                int i2 = DynamicPageActivity.A;
                                DynamicPageActivity dynamicPageActivity2 = dynamicPageActivity;
                                DynamicPageViewModel dynamicPageViewModelO4 = dynamicPageActivity2.O4();
                                composer2.o(5004770);
                                boolean zI = composer2.I(dynamicPageViewModelO4);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    DynamicPageActivity$setViewContent$1$1$1$1 dynamicPageActivity$setViewContent$1$1$1$1 = new DynamicPageActivity$setViewContent$1$1$1$1(2, dynamicPageViewModelO4, DynamicPageViewModel.class, "onLinkClick", "onLinkClick(Ljava/lang/String;Lau/com/woolworths/analytics/model/AnalyticsData;)V", 0);
                                    composer2.A(dynamicPageActivity$setViewContent$1$1$1$1);
                                    objG = dynamicPageActivity$setViewContent$1$1$1$1;
                                }
                                KFunction kFunction = (KFunction) objG;
                                composer2.l();
                                DynamicPageViewModel dynamicPageViewModelO42 = dynamicPageActivity2.O4();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(dynamicPageViewModelO42);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    DynamicPageActivity$setViewContent$1$1$2$1 dynamicPageActivity$setViewContent$1$1$2$1 = new DynamicPageActivity$setViewContent$1$1$2$1(0, dynamicPageViewModelO42, DynamicPageViewModel.class, "onShareClick", "onShareClick()V", 0);
                                    composer2.A(dynamicPageActivity$setViewContent$1$1$2$1);
                                    objG2 = dynamicPageActivity$setViewContent$1$1$2$1;
                                }
                                KFunction kFunction2 = (KFunction) objG2;
                                composer2.l();
                                DynamicPageViewModel dynamicPageViewModelO43 = dynamicPageActivity2.O4();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(dynamicPageViewModelO43);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    DynamicPageActivity$setViewContent$1$1$3$1 dynamicPageActivity$setViewContent$1$1$3$1 = new DynamicPageActivity$setViewContent$1$1$3$1(0, dynamicPageViewModelO43, DynamicPageViewModel.class, "onCartClick", "onCartClick()V", 0);
                                    composer2.A(dynamicPageActivity$setViewContent$1$1$3$1);
                                    objG3 = dynamicPageActivity$setViewContent$1$1$3$1;
                                }
                                KFunction kFunction3 = (KFunction) objG3;
                                composer2.l();
                                DynamicPageViewModel dynamicPageViewModelO44 = dynamicPageActivity2.O4();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(dynamicPageViewModelO44);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    objG4 = new DynamicPageActivity$setViewContent$1$1$4$1(0, dynamicPageViewModelO44, DynamicPageViewModel.class, "onRetry", "onRetry()V", 0);
                                    composer2.A(objG4);
                                }
                                KFunction kFunction4 = (KFunction) objG4;
                                composer2.l();
                                DynamicPageViewModel dynamicPageViewModelO45 = dynamicPageActivity2.O4();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(dynamicPageViewModelO45);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$1) {
                                    objG5 = new DynamicPageActivity$setViewContent$1$1$5$1(0, dynamicPageViewModelO45, DynamicPageViewModel.class, "onBottomSheetShown", "onBottomSheetShown()V", 0);
                                    composer2.A(objG5);
                                }
                                KFunction kFunction5 = (KFunction) objG5;
                                composer2.l();
                                DynamicPageViewModel dynamicPageViewModelO46 = dynamicPageActivity2.O4();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(dynamicPageViewModelO46);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == composer$Companion$Empty$1) {
                                    objG6 = new DynamicPageActivity$setViewContent$1$1$6$1(0, dynamicPageViewModelO46, DynamicPageViewModel.class, "onBottomSheetDismissed", "onBottomSheetDismissed()V", 0);
                                    composer2.A(objG6);
                                }
                                KFunction kFunction6 = (KFunction) objG6;
                                composer2.l();
                                Function2 function2 = (Function2) kFunction;
                                composer2.o(5004770);
                                boolean zI7 = composer2.I(dynamicPageActivity2);
                                Object objG7 = composer2.G();
                                if (zI7 || objG7 == composer$Companion$Empty$1) {
                                    objG7 = new androidx.lifecycle.a(dynamicPageActivity2, 15);
                                    composer2.A(objG7);
                                }
                                composer2.l();
                                DynamicPageScreenKt.b(viewState, function2, (Function0) objG7, (Function0) kFunction2, (Function0) kFunction3, (Function0) kFunction4, (Function0) kFunction5, modifierE, (Function0) kFunction6, composer2, 12582912, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1973872580));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new DynamicPageActivity$observeActions$1(this, null), 3);
        O4().p6();
    }
}
