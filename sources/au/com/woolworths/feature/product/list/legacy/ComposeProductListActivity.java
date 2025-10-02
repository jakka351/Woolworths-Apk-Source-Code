package au.com.woolworths.feature.product.list.legacy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.products.ProductListAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.haptic.HapticExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.legacy.ComposeProductListActivityContract;
import au.com.woolworths.feature.product.list.legacy.ProductListFragment;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListActions;
import au.com.woolworths.feature.product.list.legacy.compose.productfinder.FindInfoBottomSheetContentKt;
import au.com.woolworths.feature.product.list.legacy.compose.productfinder.ProductListScreenKt;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetViewModel;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.ui.OliveVoiceScreenKt;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/feature/product/list/legacy/ProductListFragment$ProductListFragmentCaller;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposeProductListActivity extends Hilt_ComposeProductListActivity implements ProductListFragment.ProductListFragmentCaller, AddToListBottomSheetFragment.BottomSheetHost {
    public static final /* synthetic */ int H = 0;
    public final ViewModelLazy A;
    public final ViewModelLazy B;
    public final ViewModelLazy C;
    public final ViewModelLazy D;
    public final ViewModelLazy E;
    public Function1 F;
    public final ActivityResultLauncher G;
    public AnalyticsManager x;
    public ShopAppNavigator y;
    public FeatureToggleManager z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ComposeProductListActivity$Companion;", "", "", "FEEDBACK_FORM_ID", "Ljava/lang/String;", "MAIN_OPTIONS", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Activities.ProductList.ProductListType.values().length];
            try {
                iArr[Activities.ProductList.ProductListType.I.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.H.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.J.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ComposeProductListActivity() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        };
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.A = new ViewModelLazy(reflectionFactory.b(ComposeProductListActivityViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.B = new ViewModelLazy(reflectionFactory.b(ProductListViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.C = new ViewModelLazy(reflectionFactory.b(EducationBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$9
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.D = new ViewModelLazy(reflectionFactory.b(ProductListOptionsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$11
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$10
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$12
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.E = new ViewModelLazy(reflectionFactory.b(OliveVoiceViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$14
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$13
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$special$$inlined$viewModels$default$15
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.F = new au.com.woolworths.feature.product.list.compose.filter.a(20);
        this.G = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new au.com.woolworths.feature.product.list.b(1));
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return ViewModelKt.a(S4());
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) listChangeEvent;
            View decorView = getWindow().getDecorView();
            Intrinsics.g(decorView, "getDecorView(...)");
            ListChangeEventKt.a(addToListSuccessEvent, this, decorView, false, 28);
            S4().H6(addToListSuccessEvent.h);
        }
    }

    public final void O4(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1854814701);
        if ((((composerImplV.I(this) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(this);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new c(this, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.c(Unit.f24250a, (Function1) objG, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(this, i, 0);
        }
    }

    public final void P4(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1649101538);
        if ((((composerImplV.I(this) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(683638594, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$OliveUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    final ComposeProductListActivity composeProductListActivity = this.d;
                    ViewModelLazy viewModelLazy = composeProductListActivity.E;
                    final int i2 = 3;
                    final int i3 = 2;
                    if ((iIntValue & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        int i4 = ComposeProductListActivity.H;
                        OliveVoiceViewModel oliveVoiceViewModel = (OliveVoiceViewModel) viewModelLazy.getD();
                        VoiceAnalytics voiceAnalyticsP6 = ((OliveVoiceViewModel) viewModelLazy.getD()).p6();
                        composer2.o(5004770);
                        boolean zI = composer2.I(composeProductListActivity);
                        Object objG = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (zI || objG == obj3) {
                            final int i5 = 0;
                            objG = new Function0() { // from class: au.com.woolworths.feature.product.list.legacy.e
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i6 = i5;
                                    Unit unit = Unit.f24250a;
                                    ComposeProductListActivity composeProductListActivity2 = composeProductListActivity;
                                    switch (i6) {
                                        case 0:
                                            int i7 = ComposeProductListActivity.H;
                                            if (!composeProductListActivity2.Q4().n) {
                                                composeProductListActivity2.finish();
                                                break;
                                            } else {
                                                composeProductListActivity2.Q4().p6(false);
                                                break;
                                            }
                                        case 1:
                                            ActivityExtKt.b(composeProductListActivity2);
                                            break;
                                        case 2:
                                            composeProductListActivity2.startActivity(new Intent("android.settings.SETTINGS"));
                                            break;
                                        case 3:
                                            ActivityResultLauncher activityResultLauncher = composeProductListActivity2.G;
                                            Map map = EmptyMap.d;
                                            ApplicationType applicationType = ApplicationType.d;
                                            activityResultLauncher.a(Activities.Feedback2Form.f4473a.b("10498", map), null);
                                            break;
                                        case 4:
                                            int i8 = ComposeProductListActivity.H;
                                            composeProductListActivity2.U4();
                                            break;
                                        case 5:
                                            HapticExtKt.c(composeProductListActivity2);
                                            break;
                                        default:
                                            HapticExtKt.a(composeProductListActivity2);
                                            break;
                                    }
                                    return unit;
                                }
                            };
                            composer2.A(objG);
                        }
                        Function0 function0 = (Function0) objG;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI2 = composer2.I(composeProductListActivity);
                        Object objG2 = composer2.G();
                        if (zI2 || objG2 == obj3) {
                            objG2 = new c(composeProductListActivity, i2);
                            composer2.A(objG2);
                        }
                        Function1 function1 = (Function1) objG2;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI3 = composer2.I(composeProductListActivity);
                        Object objG3 = composer2.G();
                        if (zI3 || objG3 == obj3) {
                            final int i6 = 1;
                            objG3 = new Function0() { // from class: au.com.woolworths.feature.product.list.legacy.e
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i62 = i6;
                                    Unit unit = Unit.f24250a;
                                    ComposeProductListActivity composeProductListActivity2 = composeProductListActivity;
                                    switch (i62) {
                                        case 0:
                                            int i7 = ComposeProductListActivity.H;
                                            if (!composeProductListActivity2.Q4().n) {
                                                composeProductListActivity2.finish();
                                                break;
                                            } else {
                                                composeProductListActivity2.Q4().p6(false);
                                                break;
                                            }
                                        case 1:
                                            ActivityExtKt.b(composeProductListActivity2);
                                            break;
                                        case 2:
                                            composeProductListActivity2.startActivity(new Intent("android.settings.SETTINGS"));
                                            break;
                                        case 3:
                                            ActivityResultLauncher activityResultLauncher = composeProductListActivity2.G;
                                            Map map = EmptyMap.d;
                                            ApplicationType applicationType = ApplicationType.d;
                                            activityResultLauncher.a(Activities.Feedback2Form.f4473a.b("10498", map), null);
                                            break;
                                        case 4:
                                            int i8 = ComposeProductListActivity.H;
                                            composeProductListActivity2.U4();
                                            break;
                                        case 5:
                                            HapticExtKt.c(composeProductListActivity2);
                                            break;
                                        default:
                                            HapticExtKt.a(composeProductListActivity2);
                                            break;
                                    }
                                    return unit;
                                }
                            };
                            composer2.A(objG3);
                        }
                        Function0 function02 = (Function0) objG3;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI4 = composer2.I(composeProductListActivity);
                        Object objG4 = composer2.G();
                        if (zI4 || objG4 == obj3) {
                            objG4 = new Function0() { // from class: au.com.woolworths.feature.product.list.legacy.e
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i62 = i3;
                                    Unit unit = Unit.f24250a;
                                    ComposeProductListActivity composeProductListActivity2 = composeProductListActivity;
                                    switch (i62) {
                                        case 0:
                                            int i7 = ComposeProductListActivity.H;
                                            if (!composeProductListActivity2.Q4().n) {
                                                composeProductListActivity2.finish();
                                                break;
                                            } else {
                                                composeProductListActivity2.Q4().p6(false);
                                                break;
                                            }
                                        case 1:
                                            ActivityExtKt.b(composeProductListActivity2);
                                            break;
                                        case 2:
                                            composeProductListActivity2.startActivity(new Intent("android.settings.SETTINGS"));
                                            break;
                                        case 3:
                                            ActivityResultLauncher activityResultLauncher = composeProductListActivity2.G;
                                            Map map = EmptyMap.d;
                                            ApplicationType applicationType = ApplicationType.d;
                                            activityResultLauncher.a(Activities.Feedback2Form.f4473a.b("10498", map), null);
                                            break;
                                        case 4:
                                            int i8 = ComposeProductListActivity.H;
                                            composeProductListActivity2.U4();
                                            break;
                                        case 5:
                                            HapticExtKt.c(composeProductListActivity2);
                                            break;
                                        default:
                                            HapticExtKt.a(composeProductListActivity2);
                                            break;
                                    }
                                    return unit;
                                }
                            };
                            composer2.A(objG4);
                        }
                        Function0 function03 = (Function0) objG4;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI5 = composer2.I(composeProductListActivity);
                        Object objG5 = composer2.G();
                        if (zI5 || objG5 == obj3) {
                            objG5 = new Function0() { // from class: au.com.woolworths.feature.product.list.legacy.e
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i62 = i2;
                                    Unit unit = Unit.f24250a;
                                    ComposeProductListActivity composeProductListActivity2 = composeProductListActivity;
                                    switch (i62) {
                                        case 0:
                                            int i7 = ComposeProductListActivity.H;
                                            if (!composeProductListActivity2.Q4().n) {
                                                composeProductListActivity2.finish();
                                                break;
                                            } else {
                                                composeProductListActivity2.Q4().p6(false);
                                                break;
                                            }
                                        case 1:
                                            ActivityExtKt.b(composeProductListActivity2);
                                            break;
                                        case 2:
                                            composeProductListActivity2.startActivity(new Intent("android.settings.SETTINGS"));
                                            break;
                                        case 3:
                                            ActivityResultLauncher activityResultLauncher = composeProductListActivity2.G;
                                            Map map = EmptyMap.d;
                                            ApplicationType applicationType = ApplicationType.d;
                                            activityResultLauncher.a(Activities.Feedback2Form.f4473a.b("10498", map), null);
                                            break;
                                        case 4:
                                            int i8 = ComposeProductListActivity.H;
                                            composeProductListActivity2.U4();
                                            break;
                                        case 5:
                                            HapticExtKt.c(composeProductListActivity2);
                                            break;
                                        default:
                                            HapticExtKt.a(composeProductListActivity2);
                                            break;
                                    }
                                    return unit;
                                }
                            };
                            composer2.A(objG5);
                        }
                        Function0 function04 = (Function0) objG5;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI6 = composer2.I(composeProductListActivity);
                        Object objG6 = composer2.G();
                        if (zI6 || objG6 == obj3) {
                            final int i7 = 4;
                            objG6 = new Function0() { // from class: au.com.woolworths.feature.product.list.legacy.e
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i62 = i7;
                                    Unit unit = Unit.f24250a;
                                    ComposeProductListActivity composeProductListActivity2 = composeProductListActivity;
                                    switch (i62) {
                                        case 0:
                                            int i72 = ComposeProductListActivity.H;
                                            if (!composeProductListActivity2.Q4().n) {
                                                composeProductListActivity2.finish();
                                                break;
                                            } else {
                                                composeProductListActivity2.Q4().p6(false);
                                                break;
                                            }
                                        case 1:
                                            ActivityExtKt.b(composeProductListActivity2);
                                            break;
                                        case 2:
                                            composeProductListActivity2.startActivity(new Intent("android.settings.SETTINGS"));
                                            break;
                                        case 3:
                                            ActivityResultLauncher activityResultLauncher = composeProductListActivity2.G;
                                            Map map = EmptyMap.d;
                                            ApplicationType applicationType = ApplicationType.d;
                                            activityResultLauncher.a(Activities.Feedback2Form.f4473a.b("10498", map), null);
                                            break;
                                        case 4:
                                            int i8 = ComposeProductListActivity.H;
                                            composeProductListActivity2.U4();
                                            break;
                                        case 5:
                                            HapticExtKt.c(composeProductListActivity2);
                                            break;
                                        default:
                                            HapticExtKt.a(composeProductListActivity2);
                                            break;
                                    }
                                    return unit;
                                }
                            };
                            composer2.A(objG6);
                        }
                        Function0 function05 = (Function0) objG6;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI7 = composer2.I(composeProductListActivity);
                        Object objG7 = composer2.G();
                        if (zI7 || objG7 == obj3) {
                            final int i8 = 5;
                            objG7 = new Function0() { // from class: au.com.woolworths.feature.product.list.legacy.e
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i62 = i8;
                                    Unit unit = Unit.f24250a;
                                    ComposeProductListActivity composeProductListActivity2 = composeProductListActivity;
                                    switch (i62) {
                                        case 0:
                                            int i72 = ComposeProductListActivity.H;
                                            if (!composeProductListActivity2.Q4().n) {
                                                composeProductListActivity2.finish();
                                                break;
                                            } else {
                                                composeProductListActivity2.Q4().p6(false);
                                                break;
                                            }
                                        case 1:
                                            ActivityExtKt.b(composeProductListActivity2);
                                            break;
                                        case 2:
                                            composeProductListActivity2.startActivity(new Intent("android.settings.SETTINGS"));
                                            break;
                                        case 3:
                                            ActivityResultLauncher activityResultLauncher = composeProductListActivity2.G;
                                            Map map = EmptyMap.d;
                                            ApplicationType applicationType = ApplicationType.d;
                                            activityResultLauncher.a(Activities.Feedback2Form.f4473a.b("10498", map), null);
                                            break;
                                        case 4:
                                            int i82 = ComposeProductListActivity.H;
                                            composeProductListActivity2.U4();
                                            break;
                                        case 5:
                                            HapticExtKt.c(composeProductListActivity2);
                                            break;
                                        default:
                                            HapticExtKt.a(composeProductListActivity2);
                                            break;
                                    }
                                    return unit;
                                }
                            };
                            composer2.A(objG7);
                        }
                        Function0 function06 = (Function0) objG7;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI8 = composer2.I(composeProductListActivity);
                        Object objG8 = composer2.G();
                        if (zI8 || objG8 == obj3) {
                            final int i9 = 6;
                            objG8 = new Function0() { // from class: au.com.woolworths.feature.product.list.legacy.e
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i62 = i9;
                                    Unit unit = Unit.f24250a;
                                    ComposeProductListActivity composeProductListActivity2 = composeProductListActivity;
                                    switch (i62) {
                                        case 0:
                                            int i72 = ComposeProductListActivity.H;
                                            if (!composeProductListActivity2.Q4().n) {
                                                composeProductListActivity2.finish();
                                                break;
                                            } else {
                                                composeProductListActivity2.Q4().p6(false);
                                                break;
                                            }
                                        case 1:
                                            ActivityExtKt.b(composeProductListActivity2);
                                            break;
                                        case 2:
                                            composeProductListActivity2.startActivity(new Intent("android.settings.SETTINGS"));
                                            break;
                                        case 3:
                                            ActivityResultLauncher activityResultLauncher = composeProductListActivity2.G;
                                            Map map = EmptyMap.d;
                                            ApplicationType applicationType = ApplicationType.d;
                                            activityResultLauncher.a(Activities.Feedback2Form.f4473a.b("10498", map), null);
                                            break;
                                        case 4:
                                            int i82 = ComposeProductListActivity.H;
                                            composeProductListActivity2.U4();
                                            break;
                                        case 5:
                                            HapticExtKt.c(composeProductListActivity2);
                                            break;
                                        default:
                                            HapticExtKt.a(composeProductListActivity2);
                                            break;
                                    }
                                    return unit;
                                }
                            };
                            composer2.A(objG8);
                        }
                        composer2.l();
                        OliveVoiceScreenKt.a(function0, function1, function02, function03, function04, function05, function06, (Function0) objG8, oliveVoiceViewModel, voiceAnalyticsP6, null, composer2, 1073741824);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(this, i, 1);
        }
    }

    public final ComposeProductListActivityViewModel Q4() {
        return (ComposeProductListActivityViewModel) this.A.getD();
    }

    public final Activities.ProductList.Extras R4() {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_PRODUCT_LIST_INFO");
        if (parcelableExtra != null) {
            return (Activities.ProductList.Extras) parcelableExtra;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final ProductListViewModel S4() {
        return (ProductListViewModel) this.B.getD();
    }

    public final boolean T4() {
        Activities.ProductList.ProductListType e = R4().e.getE();
        if (e.l) {
            return true;
        }
        return e.k && ((Boolean) Q4().o.getD()).booleanValue();
    }

    public final void U4() {
        Intent intentB;
        int iOrdinal = R4().e.getE().ordinal();
        Activities.Search search = Activities.Search.f4526a;
        switch (iOrdinal) {
            case 19:
                intentB = search.b(new Activities.Search.Extras.VoiceProductFinder(null));
                intentB.addFlags(131072);
                break;
            case 20:
                intentB = search.b(new Activities.Search.Extras.Generic(null));
                intentB.addFlags(131072);
                break;
            case 21:
                intentB = search.b(new Activities.Search.Extras.VoiceWithMapsProductFinder(null));
                intentB.addFlags(131072);
                break;
            default:
                intentB = search.b(new Activities.Search.Extras.ProductFinder(null));
                break;
        }
        startActivity(intentB);
    }

    @Override // au.com.woolworths.feature.product.list.legacy.Hilt_ComposeProductListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String d;
        super.onCreate(bundle);
        Q4().q6(R4());
        ((OliveVoiceViewModel) this.E.getD()).q6(R4().e.getE());
        ComposeProductListActivityViewModel composeProductListActivityViewModelQ4 = Q4();
        boolean z = false;
        if (T4()) {
            Activities.ProductList.ExtraProductListSource extraProductListSource = R4().e;
            Activities.ProductList.ExtrasBySearch extrasBySearch = extraProductListSource instanceof Activities.ProductList.ExtrasBySearch ? (Activities.ProductList.ExtrasBySearch) extraProductListSource : null;
            if ((extrasBySearch == null || (d = extrasBySearch.getD()) == null) ? false : StringsKt.D(d)) {
                z = true;
            }
        }
        composeProductListActivityViewModelQ4.p6(z);
        if (R4().e.getE().j) {
            OnBackPressedDispatcherKt.a(getF(), this, new c(this, 1), 2);
        }
        final FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(com.woolworths.R.id.fragment_container);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$initUi$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = ComposeProductListActivity.H;
                    final ComposeProductListActivity composeProductListActivity = this.d;
                    final ComposeProductListActivityContract.ViewState viewState = (ComposeProductListActivityContract.ViewState) FlowExtKt.a(composeProductListActivity.Q4().k, composer).getD();
                    composer.o(1857071429);
                    if (composeProductListActivity.T4()) {
                        composeProductListActivity.O4(composer, 0);
                    }
                    composer.l();
                    boolean z2 = viewState.e;
                    au.com.woolworths.feature.shop.recipes.recipes.list.b bVar = new au.com.woolworths.feature.shop.recipes.recipes.list.b(23);
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    final FrameLayout frameLayout2 = frameLayout;
                    AnimatedContentKt.b(boolValueOf, null, bVar, null, "showContent", null, ComposableLambdaKt.c(121788007, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$initUi$1.1
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                            AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj3;
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            Composer composer2 = (Composer) obj5;
                            ((Number) obj6).intValue();
                            Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                            final ComposeProductListActivity composeProductListActivity2 = composeProductListActivity;
                            if (zBooleanValue) {
                                composer2.o(1074160240);
                                int i2 = ComposeProductListActivity.H;
                                composeProductListActivity2.P4(composer2, 0);
                                composer2.l();
                            } else {
                                if (zBooleanValue) {
                                    throw au.com.woolworths.android.onesite.a.x(composer2, 1074161316);
                                }
                                composer2.o(-1060655482);
                                final FrameLayout frameLayout3 = frameLayout2;
                                final ComposeProductListActivityContract.ViewState viewState2 = viewState;
                                ThemeKt.b(6, composer2, ComposableLambdaKt.c(1132699088, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity.initUi.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj7, Object obj8) {
                                        Composer composer3 = (Composer) obj7;
                                        if ((((Number) obj8).intValue() & 3) == 2 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            final ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(ModalBottomSheetValue.d, null, composer3, 6, 14);
                                            Object objG = composer3.G();
                                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                            if (objG == composer$Companion$Empty$1) {
                                                objG = android.support.v4.media.session.a.i(composer3.y(), composer3);
                                            }
                                            final CoroutineScope coroutineScope = (CoroutineScope) objG;
                                            composer3.o(-1746271574);
                                            final ComposeProductListActivity composeProductListActivity3 = composeProductListActivity2;
                                            boolean zI = composer3.I(composeProductListActivity3) | composer3.I(coroutineScope) | composer3.I(modalBottomSheetStateC);
                                            Object objG2 = composer3.G();
                                            if (zI || objG2 == composer$Companion$Empty$1) {
                                                objG2 = new ComposeProductListActivity$initUi$1$1$1$1$1(composeProductListActivity3, coroutineScope, modalBottomSheetStateC, null);
                                                composer3.A(objG2);
                                            }
                                            composer3.l();
                                            EffectsKt.e(composer3, coroutineScope, (Function2) objG2);
                                            FillElement fillElement = SizeKt.c;
                                            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-2134878110, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity.initUi.1.1.1.2
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                    ColumnScope ModalBottomSheetLayout = (ColumnScope) obj9;
                                                    Composer composer4 = (Composer) obj10;
                                                    int iIntValue = ((Number) obj11).intValue();
                                                    Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                                                    if ((iIntValue & 6) == 0) {
                                                        iIntValue |= composer4.n(ModalBottomSheetLayout) ? 4 : 2;
                                                    }
                                                    if ((iIntValue & 19) == 18 && composer4.c()) {
                                                        composer4.j();
                                                    } else {
                                                        composer4.o(-1746271574);
                                                        CoroutineScope coroutineScope2 = coroutineScope;
                                                        boolean zI2 = composer4.I(coroutineScope2);
                                                        ComposeProductListActivity composeProductListActivity4 = composeProductListActivity3;
                                                        boolean zI3 = zI2 | composer4.I(composeProductListActivity4);
                                                        ModalBottomSheetState modalBottomSheetState = modalBottomSheetStateC;
                                                        boolean zI4 = zI3 | composer4.I(modalBottomSheetState);
                                                        Object objG3 = composer4.G();
                                                        if (zI4 || objG3 == Composer.Companion.f1624a) {
                                                            objG3 = new g(0, coroutineScope2, composeProductListActivity4, modalBottomSheetState);
                                                            composer4.A(objG3);
                                                        }
                                                        composer4.l();
                                                        FindInfoBottomSheetContentKt.a(ModalBottomSheetLayout, (Function0) objG3, composer4, iIntValue & 14);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, composer3);
                                            final FrameLayout frameLayout4 = frameLayout3;
                                            final ComposeProductListActivityContract.ViewState viewState3 = viewState2;
                                            ModalBottomSheetLayoutKt.a(composableLambdaImplC, fillElement, modalBottomSheetStateC, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, ComposableLambdaKt.c(-1412460469, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity.initUi.1.1.1.3
                                                /* JADX WARN: Type inference failed for: r3v0, types: [au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$initUi$1$1$1$3$1] */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj9, Object obj10) {
                                                    Composer composer4 = (Composer) obj9;
                                                    if ((((Number) obj10).intValue() & 3) == 2 && composer4.c()) {
                                                        composer4.j();
                                                    } else {
                                                        int i3 = ComposeProductListActivity.H;
                                                        final ComposeProductListActivity composeProductListActivity4 = composeProductListActivity3;
                                                        ProductListFragment.Extras extras = new ProductListFragment.Extras(composeProductListActivity4.R4());
                                                        FragmentManager supportFragmentManager = composeProductListActivity4.getSupportFragmentManager();
                                                        Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
                                                        ProductListScreenKt.b(extras, supportFragmentManager, frameLayout4, new ComposeProductListCallbacks() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity.initUi.1.1.1.3.1
                                                            @Override // au.com.woolworths.feature.product.list.legacy.ComposeProductListCallbacks
                                                            public final void b() {
                                                                int i4 = ComposeProductListActivity.H;
                                                                composeProductListActivity4.Q4().l.f(ComposeProductListActivityContract.Action.LaunchSearch.f5279a);
                                                            }

                                                            @Override // au.com.woolworths.feature.product.list.legacy.ComposeProductListCallbacks
                                                            public final void h() {
                                                                ComposeProductListActivity composeProductListActivity5 = composeProductListActivity4;
                                                                ComposeProductListActivityViewModel composeProductListActivityViewModelQ42 = composeProductListActivity5.Q4();
                                                                TrackingMetadata trackingMetadataX6 = composeProductListActivity5.S4().x6();
                                                                composeProductListActivityViewModelQ42.p6(true);
                                                                composeProductListActivityViewModelQ42.f.j(new ProductListActions.VoiceProductFinderClick(), trackingMetadataX6);
                                                            }

                                                            @Override // au.com.woolworths.feature.product.list.legacy.ComposeProductListCallbacks
                                                            public final void i() {
                                                                int i4 = ComposeProductListActivity.H;
                                                                composeProductListActivity4.Q4().l.f(ComposeProductListActivityContract.Action.NavigateUp.f5280a);
                                                            }
                                                        }, viewState3, composer4, 0);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, composer3), composer3, 12583478, 120);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2));
                                composer2.l();
                            }
                            return Unit.f24250a;
                        }
                    }, composer), composer, 1597440, 42);
                }
                return Unit.f24250a;
            }
        }, true, -1334378934));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ComposeProductListActivity$initActionsCollection$1(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ComposeProductListActivity$initActionsCollection$2(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ComposeProductListActivity$initActionsCollection$3(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ComposeProductListActivity$initActionsCollection$4(this, null), 3);
        getSupportFragmentManager().b(new FragmentOnAttachListener() { // from class: au.com.woolworths.feature.product.list.legacy.a
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void a(FragmentManager fragmentManager, Fragment fragment2) {
                int i = ComposeProductListActivity.H;
                Intrinsics.h(fragmentManager, "fragmentManager");
                ComposeProductListActivity composeProductListActivity = this.d;
                ComposeProductListActivityViewModel composeProductListActivityViewModelQ42 = composeProductListActivity.Q4();
                boolean z2 = ((fragment2 instanceof ProductListOptionsFragment) || (fragment2 instanceof ProductListOptionsFilterFragment)) ? false : composeProductListActivity.R4().e.getE().j;
                MutableStateFlow mutableStateFlow = composeProductListActivityViewModelQ42.j;
                mutableStateFlow.setValue(ComposeProductListActivityContract.ViewState.a((ComposeProductListActivityContract.ViewState) mutableStateFlow.getValue(), null, null, z2, false, false, false, 59));
                Timber.f27013a.b("current fragment: " + fragment2, new Object[0]);
            }
        });
        getSupportFragmentManager().o.add(new FragmentManager.OnBackStackChangedListener() { // from class: au.com.woolworths.feature.product.list.legacy.b
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                int i = ComposeProductListActivity.H;
                ComposeProductListActivity composeProductListActivity = this.f5343a;
                Fragment fragmentF = composeProductListActivity.getSupportFragmentManager().F(com.woolworths.R.id.fragment_container);
                if (fragmentF != null) {
                    ComposeProductListActivityViewModel composeProductListActivityViewModelQ42 = composeProductListActivity.Q4();
                    boolean z2 = ((fragmentF instanceof ProductListOptionsFragment) || (fragmentF instanceof ProductListOptionsFilterFragment)) ? false : composeProductListActivity.R4().e.getE().j;
                    MutableStateFlow mutableStateFlow = composeProductListActivityViewModelQ42.j;
                    mutableStateFlow.setValue(ComposeProductListActivityContract.ViewState.a((ComposeProductListActivityContract.ViewState) mutableStateFlow.getValue(), null, null, z2, false, false, false, 59));
                    Timber.f27013a.b("current fragment: " + fragmentF, new Object[0]);
                }
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (menuItem.getItemId() == 16908332) {
                onBackPressed();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // au.com.woolworths.feature.product.list.legacy.ProductListFragment.ProductListFragmentCaller
    public final void r() {
        ComposeProductListActivityViewModel composeProductListActivityViewModelQ4 = Q4();
        composeProductListActivityViewModelQ4.p6(true);
        composeProductListActivityViewModelQ4.f.g(ProductListAnalytics.ProductList.Action.d);
    }
}
