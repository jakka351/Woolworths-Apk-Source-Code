package au.com.woolworths.foundation.shop.deeplink.resolver.ui;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.compose.utils.modifier.ConditionalModifierKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkContract;
import au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkHandlerViewModel;
import au.com.woolworths.foundation.shop.onboarding.data.OnboardingInteractorImpl;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.airbnb.deeplinkdispatch.DeepLinkHandler;
import com.airbnb.deeplinkdispatch.DeepLinkResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@DeepLinkHandler
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/deeplink/resolver/ui/ShopAppDeepLinkHandlerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShopAppDeepLinkHandlerActivity extends Hilt_ShopAppDeepLinkHandlerActivity {
    public static final /* synthetic */ int G = 0;
    public FeatureToggleManager A;
    public ShopAccountInteractor B;
    public ShopAppRegionInteractor C;
    public final ViewModelLazy D = new ViewModelLazy(Reflection.f24268a.b(ShopAppDeepLinkHandlerViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final long E = ColorKt.b(1795162112);
    public DeepLinkResult F;
    public RewardsAccountInteractor x;
    public AnalyticsManager y;
    public OnboardingInteractorImpl z;

    public final void O4(Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(1179968508);
        if ((((composerImplV.I(this) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-230628520, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer$Companion$Empty$1 composer$Companion$Empty$1;
                    Unit unit;
                    SnackbarHostState snackbarHostState;
                    FullPageMessageSpec fullPageMessageSpecF;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue() & 3;
                    Unit unit2 = Unit.f24250a;
                    if (iIntValue == 2 && composer2.c()) {
                        composer2.j();
                        return unit2;
                    }
                    Context context = (Context) composer2.x(AndroidCompositionLocals_androidKt.b);
                    int i2 = ShopAppDeepLinkHandlerActivity.G;
                    final ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity = this.d;
                    ShopAppDeepLinkHandlerViewModel shopAppDeepLinkHandlerViewModel = (ShopAppDeepLinkHandlerViewModel) shopAppDeepLinkHandlerActivity.D.getD();
                    long j = shopAppDeepLinkHandlerActivity.E;
                    MutableState mutableStateA = SnapshotStateKt.a(shopAppDeepLinkHandlerViewModel.i, composer2);
                    composer2.o(1849434622);
                    Object objG = composer2.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                    if (objG == composer$Companion$Empty$12) {
                        objG = SnapshotStateKt.f(new Color(j));
                        composer2.A(objG);
                    }
                    MutableState mutableState = (MutableState) objG;
                    Object objE = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                    if (objE == composer$Companion$Empty$12) {
                        objE = new SnackbarHostState();
                        composer2.A(objE);
                    }
                    SnackbarHostState snackbarHostState2 = (SnackbarHostState) objE;
                    composer2.l();
                    Color color = new Color(((Color) mutableState.getD()).f1766a);
                    composer2.o(-1633490746);
                    boolean zI = composer2.I(shopAppDeepLinkHandlerActivity);
                    Object objG2 = composer2.G();
                    if (zI || objG2 == composer$Companion$Empty$12) {
                        objG2 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(21, shopAppDeepLinkHandlerActivity, mutableState);
                        composer2.A(objG2);
                    }
                    composer2.l();
                    EffectsKt.c(color, (Function1) objG2, composer2);
                    composer2.o(5004770);
                    boolean zI2 = composer2.I(shopAppDeepLinkHandlerActivity);
                    Object objG3 = composer2.G();
                    if (zI2 || objG3 == composer$Companion$Empty$12) {
                        objG3 = new Function1() { // from class: au.com.woolworths.foundation.shop.deeplink.resolver.ui.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                LifecycleResumePauseEffectScope LifecycleResumeEffect = (LifecycleResumePauseEffectScope) obj3;
                                Intrinsics.h(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
                                int i3 = ShopAppDeepLinkHandlerActivity.G;
                                ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity2 = shopAppDeepLinkHandlerActivity;
                                FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ShopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$2$1$1(2, shopAppDeepLinkHandlerActivity2, ShopAppDeepLinkHandlerActivity.class, "handleAction", "handleAction(Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkContract$Actions;)V", 4), ((ShopAppDeepLinkHandlerViewModel) shopAppDeepLinkHandlerActivity2.D.getD()).k), LifecycleOwnerKt.a(LifecycleResumeEffect));
                                return new ShopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$invoke$lambda$9$lambda$8$$inlined$onPauseOrDispose$1();
                            }
                        };
                        composer2.A(objG3);
                    }
                    composer2.l();
                    LifecycleEffectKt.a(null, (Function1) objG3, composer2, 6);
                    FillElement fillElement = SizeKt.c;
                    boolean z = ((ShopAppDeepLinkContract.ViewState) mutableStateA.getD()).b == null;
                    composer2.o(1849434622);
                    Object objG4 = composer2.G();
                    if (objG4 == composer$Companion$Empty$12) {
                        objG4 = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(20);
                        composer2.A(objG4);
                    }
                    composer2.l();
                    Modifier modifierB = BackgroundKt.b(ConditionalModifierKt.b(fillElement, z, (Function1) objG4, null, 4), ((Color) mutableState.getD()).f1766a, RectangleShapeKt.f1779a);
                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
                    ComposeUiNode.e3.getClass();
                    Function0 function0 = ComposeUiNode.Companion.b;
                    if (composer2.w() == null) {
                        ComposablesKt.b();
                        throw null;
                    }
                    composer2.i();
                    if (composer2.getO()) {
                        composer2.K(function0);
                    } else {
                        composer2.e();
                    }
                    Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                    Function2 function2 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        androidx.camera.core.impl.b.z(p, composer2, p, function2);
                    }
                    Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                    if (((ShopAppDeepLinkContract.ViewState) mutableStateA.getD()).f8711a) {
                        composer2.o(-1064313878);
                        mutableState.setValue(new Color(j));
                        LoadingScreenKt.a(composer2, 0);
                        composer2.l();
                        composer$Companion$Empty$1 = composer$Companion$Empty$12;
                        unit = unit2;
                        snackbarHostState = snackbarHostState2;
                    } else {
                        FullPageMessage.Error error = ((ShopAppDeepLinkContract.ViewState) mutableStateA.getD()).b;
                        Modifier.Companion companion = Modifier.Companion.d;
                        if (error != null) {
                            composer2.o(-1064079115);
                            mutableState.setValue(new Color(Color.f));
                            Modifier modifierG = SizeKt.g(PaddingKt.h(PaddingKt.e(companion, WindowInsetsKt.d(WindowInsets_androidKt.b(composer2), composer2)), 4, BitmapDescriptorFactory.HUE_RED, 2), 56);
                            ImageVector imageVector = CoreTheme.e(composer2).e.b;
                            String strC = StringResources_androidKt.c(composer2, R.string.content_description_back_button);
                            long j2 = CoreTheme.b(composer2).e.c.f4854a;
                            composer2.o(5004770);
                            boolean zI3 = composer2.I(shopAppDeepLinkHandlerActivity);
                            Object objG5 = composer2.G();
                            if (zI3 || objG5 == composer$Companion$Empty$12) {
                                objG5 = new c(shopAppDeepLinkHandlerActivity, 0);
                                composer2.A(objG5);
                            }
                            composer2.l();
                            unit = unit2;
                            snackbarHostState = snackbarHostState2;
                            IconButtonKt.c(imageVector, strC, (Function0) objG5, modifierG, false, null, j2, composer2, 0, 48);
                            FullPageMessage.Error error2 = ((ShopAppDeepLinkContract.ViewState) mutableStateA.getD()).b;
                            Intrinsics.e(error2);
                            if (error2.equals(FullPageMessage.Error.ConnectionError.f8915a)) {
                                composer2.o(1905374492);
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(shopAppDeepLinkHandlerActivity);
                                Object objG6 = composer2.G();
                                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                                if (zI4 || objG6 == composer$Companion$Empty$1) {
                                    objG6 = new c(shopAppDeepLinkHandlerActivity, 1);
                                    composer2.A(objG6);
                                }
                                composer2.l();
                                fullPageMessageSpecF = FullPageMessageSpec.Companion.c(null, null, null, null, (Function0) objG6, composer2, 31);
                                composer2.l();
                            } else {
                                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                                if (!error2.equals(FullPageMessage.Error.ServerError.f8916a)) {
                                    throw au.com.woolworths.android.onesite.a.x(composer2, 1905370824);
                                }
                                composer2.o(1905394323);
                                fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, null, null, null, null, composer2, 31);
                                composer2.l();
                            }
                            composer2 = composer2;
                            FullPageMessageUiKt.a(fullPageMessageSpecF, null, null, composer2, 0, 6);
                            composer2.l();
                        } else {
                            composer$Companion$Empty$1 = composer$Companion$Empty$12;
                            unit = unit2;
                            snackbarHostState = snackbarHostState2;
                            if (((ShopAppDeepLinkContract.ViewState) mutableStateA.getD()).c != null) {
                                composer2.o(-1062058132);
                                mutableState.setValue(new Color(Color.j));
                                SnackbarHostKt.b(snackbarHostState, PaddingKt.j(BoxScopeInstance.f944a.g(companion, Alignment.Companion.h), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, 7), composer2, 6, 0);
                                composer2.l();
                            } else {
                                composer2.o(-1061678940);
                                composer2.l();
                            }
                        }
                    }
                    composer2.f();
                    ShopAppDeepLinkContract.Snackbar snackbar = ((ShopAppDeepLinkContract.ViewState) mutableStateA.getD()).c;
                    composer2.o(-1224400529);
                    boolean zN = composer2.n(mutableStateA) | composer2.I(context) | composer2.I(shopAppDeepLinkHandlerActivity);
                    Object objG7 = composer2.G();
                    if (zN || objG7 == composer$Companion$Empty$1) {
                        ShopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$5$1 shopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$5$1 = new ShopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$5$1(mutableStateA, snackbarHostState, context, shopAppDeepLinkHandlerActivity, null);
                        composer2.A(shopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$5$1);
                        objG7 = shopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$5$1;
                    }
                    composer2.l();
                    EffectsKt.e(composer2, snackbar, (Function2) objG7);
                    return unit;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(i) { // from class: au.com.woolworths.foundation.shop.deeplink.resolver.ui.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i2 = ShopAppDeepLinkHandlerActivity.G;
                    int iA = RecomposeScopeImplKt.a(1);
                    this.d.O4((Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public final FeatureToggleManager P4() {
        FeatureToggleManager featureToggleManager = this.A;
        if (featureToggleManager != null) {
            return featureToggleManager;
        }
        Intrinsics.p("featureToggleManager");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x031d  */
    @Override // au.com.woolworths.foundation.shop.deeplink.resolver.ui.Hilt_ShopAppDeepLinkHandlerActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r26) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
