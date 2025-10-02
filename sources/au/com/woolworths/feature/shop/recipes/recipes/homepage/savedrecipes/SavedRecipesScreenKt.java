package au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.component.experimental.pullrefresh.PullRefreshBoxKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesContract;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesFullPageErrorState;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SavedRecipesScreenKt {
    public static final void a(FullPageErrorCause fullPageErrorCause, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Function0 function03;
        FullPageMessageSpec fullPageMessageSpecE;
        FullPageMessageSpec fullPageMessageSpec;
        ComposerImpl composerImpl2;
        ComposerImpl composerImplV = composer.v(-1825118082);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(fullPageErrorCause) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            function03 = function0;
            composerImpl2 = composerImplV;
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function04 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            if (fullPageErrorCause == SavedRecipesFullPageErrorState.d) {
                composerImplV.o(1334663169);
                composerImpl = composerImplV;
                FullPageMessageSpec fullPageMessageSpecC = FullPageMessageSpec.Companion.c(null, null, fullPageErrorCause.getE().getText(context).toString(), null, function0, composerImpl, 23);
                composerImpl.V(false);
                fullPageMessageSpec = fullPageMessageSpecC;
                function03 = function0;
            } else {
                composerImpl = composerImplV;
                if (fullPageErrorCause == SavedRecipesFullPageErrorState.e) {
                    composerImpl.o(1334978501);
                    fullPageMessageSpecE = FullPageMessageSpec.Companion.f(null, null, null, fullPageErrorCause.getE().getText(context).toString(), null, function0, composerImpl, 23);
                    function03 = function0;
                    composerImpl = composerImpl;
                    composerImpl.V(false);
                } else {
                    function03 = function0;
                    if (fullPageErrorCause == SavedRecipesFullPageErrorState.h) {
                        composerImpl.o(1335290578);
                        Painter painterA = PainterResources_androidKt.a(fullPageErrorCause.getG(), 0, composerImpl);
                        Text title = fullPageErrorCause.getD();
                        fullPageMessageSpecE = FullPageMessageSpec.Companion.d(painterA, String.valueOf(title != null ? title.getText(context) : null), fullPageErrorCause.getE().getText(context).toString(), StringResources_androidKt.c(composerImpl, fullPageErrorCause.getPrimaryActionRes()), function02);
                        composerImpl.V(false);
                    } else if (fullPageErrorCause == SavedRecipesFullPageErrorState.g) {
                        composerImpl.o(1335842564);
                        Painter painterA2 = PainterResources_androidKt.a(fullPageErrorCause.getG(), 0, composerImpl);
                        Text title2 = fullPageErrorCause.getD();
                        fullPageMessageSpecE = FullPageMessageSpec.Companion.g(painterA2, String.valueOf(title2 != null ? title2.getText(context) : null), fullPageErrorCause.getE().getText(context).toString());
                        composerImpl.V(false);
                    } else {
                        composerImpl.o(1336220051);
                        SavedRecipesFullPageErrorState.NO_RECIPES no_recipes = (SavedRecipesFullPageErrorState.NO_RECIPES) SavedRecipesFullPageErrorState.f;
                        fullPageMessageSpecE = FullPageMessageSpec.Companion.e(PainterResources_androidKt.a(R.drawable.ic_no_catalogue, 0, composerImpl), String.valueOf(no_recipes.getD().getText(context)), no_recipes.getE().getText(context).toString(), StringResources_androidKt.c(composerImpl, R.string.try_again_button_text), function03);
                        composerImpl.V(false);
                    }
                }
                fullPageMessageSpec = fullPageMessageSpecE;
            }
            ComposerImpl composerImpl3 = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpec, null, null, composerImpl3, 0, 6);
            composerImpl2 = composerImpl3;
            composerImpl2.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(fullPageErrorCause, function03, function02, i, 27);
        }
    }

    public static final void b(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-342074327);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierA = TestTagKt.a(SizeKt.c, "loading");
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            CircularProgressIndicatorKt.b(null, 0L, BitmapDescriptorFactory.HUE_RED, 0, composerImplV, 0, 15);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.modeselector.ui.b(i, 17);
        }
    }

    public static final void c(SavedRecipesViewModel viewModel, Modifier modifier, Function0 onPageRefresh, Composer composer, int i) {
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onPageRefresh, "onPageRefresh");
        ComposerImpl composerImplV = composer.v(593664363);
        int i2 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.n(modifier) ? 32 : 16) | (composerImplV.I(onPageRefresh) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MutableState mutableStateA = LiveDataAdapterKt.a(viewModel.i, composerImplV);
            Modifier modifierX0 = modifier.x0(SizeKt.c);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            SavedRecipesContract.ViewState viewState = (SavedRecipesContract.ViewState) mutableStateA.getD();
            composerImplV.o(-2110109474);
            if (viewState != null) {
                FullPageErrorCause fullPageErrorCause = viewState.b;
                List list = viewState.c;
                if (viewState.f8071a && list.isEmpty()) {
                    composerImplV.o(447314743);
                    b(composerImplV, 0);
                    composerImplV.V(false);
                } else {
                    boolean zIsEmpty = list.isEmpty();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (!zIsEmpty) {
                        composerImplV.o(447420763);
                        List list2 = viewState.c;
                        SavedRecipesContract.ViewState viewState2 = (SavedRecipesContract.ViewState) mutableStateA.getD();
                        boolean z = (viewState2 == null || !viewState2.f8071a || viewState2.c.isEmpty()) ? false : true;
                        composerImplV.o(5004770);
                        boolean zI = composerImplV.I(viewModel);
                        Object objG = composerImplV.G();
                        if (zI || objG == composer$Companion$Empty$1) {
                            SavedRecipesScreenKt$SavedRecipesContent$1$1$1$1 savedRecipesScreenKt$SavedRecipesContent$1$1$1$1 = new SavedRecipesScreenKt$SavedRecipesContent$1$1$1$1(1, viewModel, SavedRecipesViewModel.class, "onCardSummaryClicked", "onCardSummaryClicked(Lau/com/woolworths/shop/aem/components/model/recipe/RecipeCardSummaryData;)V", 0);
                            composerImplV.A(savedRecipesScreenKt$SavedRecipesContent$1$1$1$1);
                            objG = savedRecipesScreenKt$SavedRecipesContent$1$1$1$1;
                        }
                        composerImplV.V(false);
                        d((i2 << 3) & 7168, composerImplV, list2, onPageRefresh, (Function1) ((KFunction) objG), z);
                        composerImplV.V(false);
                    } else if (fullPageErrorCause != null) {
                        composerImplV.o(447795429);
                        composerImplV.o(5004770);
                        boolean zI2 = composerImplV.I(viewModel);
                        Object objG2 = composerImplV.G();
                        if (zI2 || objG2 == composer$Companion$Empty$1) {
                            SavedRecipesScreenKt$SavedRecipesContent$1$1$2$1 savedRecipesScreenKt$SavedRecipesContent$1$1$2$1 = new SavedRecipesScreenKt$SavedRecipesContent$1$1$2$1(0, viewModel, SavedRecipesViewModel.class, "onPrimaryErrorActionClicked", "onPrimaryErrorActionClicked()V", 0);
                            composerImplV.A(savedRecipesScreenKt$SavedRecipesContent$1$1$2$1);
                            objG2 = savedRecipesScreenKt$SavedRecipesContent$1$1$2$1;
                        }
                        composerImplV.V(false);
                        a(fullPageErrorCause, onPageRefresh, (Function0) ((KFunction) objG2), composerImplV, (i2 >> 3) & 112);
                        composerImplV.V(false);
                    } else {
                        composerImplV.o(448060138);
                        composerImplV.V(false);
                    }
                }
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(viewModel, modifier, onPageRefresh, i, 6);
        }
    }

    public static final void d(int i, Composer composer, final List content, Function0 onPageRefresh, final Function1 onRecipeCardClick, boolean z) {
        int i2;
        Function0 function0;
        boolean z2;
        Intrinsics.h(content, "content");
        Intrinsics.h(onRecipeCardClick, "onRecipeCardClick");
        Intrinsics.h(onPageRefresh, "onPageRefresh");
        ComposerImpl composerImplV = composer.v(1819494718);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onRecipeCardClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onPageRefresh) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            function0 = onPageRefresh;
            z2 = z;
        } else {
            final LazyGridState lazyGridStateA = LazyGridStateKt.a(0, 3, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new SnapshotStateMap();
                composerImplV.A(objG);
            }
            final SnapshotStateMap snapshotStateMap = (SnapshotStateMap) objG;
            composerImplV.V(false);
            function0 = onPageRefresh;
            z2 = z;
            PullRefreshBoxKt.a(((i2 >> 3) & 14) | 3456 | ((i2 >> 6) & 112), composerImplV, ComposableLambdaKt.c(2006843842, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt$SavedRecipesList$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScope PullRefreshBox = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(PullRefreshBox, "$this$PullRefreshBox");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        GridCells.Fixed fixed = new GridCells.Fixed(2);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        float f = 12;
                        Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
                        Arrangement.SpacedAligned spacedAlignedG2 = Arrangement.g(f);
                        FillElement fillElement = SizeKt.c;
                        float f2 = 16;
                        PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, f2, f2, f2);
                        composer2.o(-1746271574);
                        List list = content;
                        boolean zI = composer2.I(list);
                        Function1 function1 = onRecipeCardClick;
                        boolean zN = zI | composer2.n(function1);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == Composer.Companion.f1624a) {
                            objG2 = new androidx.lifecycle.compose.b(23, list, snapshotStateMap, function1);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        LazyGridDslKt.b(fixed, fillElement, lazyGridStateA, paddingValuesImpl, false, spacedAlignedG, spacedAlignedG2, null, false, null, (Function1) objG2, composer2, 1772592, 0, 912);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), SizeKt.c, function0, z2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.facets.b(content, z2, onRecipeCardClick, function0, i);
        }
    }

    public static final void e(final SavedRecipesViewModel viewModel, final Function0 onNavigateUp, final Function0 onPageRefresh, Composer composer, int i) {
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onPageRefresh, "onPageRefresh");
        ComposerImpl composerImplV = composer.v(1184994177);
        if (((i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(onNavigateUp) ? 32 : 16) | (composerImplV.I(onPageRefresh) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(viewModel);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new a(viewModel, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            final ManagedActivityResultLauncher managedActivityResultLauncherA = ActivityResultRegistryKt.a(startActivityForResult, (Function1) objG, composerImplV, 0);
            ActivityResultContracts.StartActivityForResult startActivityForResult2 = new ActivityResultContracts.StartActivityForResult();
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(viewModel);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new a(viewModel, 1);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            final ManagedActivityResultLauncher managedActivityResultLauncherA2 = ActivityResultRegistryKt.a(startActivityForResult2, (Function1) objG2, composerImplV, 0);
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-1937189819, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt$SavedRecipesScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.recipe_home_saved_recipes_tab_title);
                        final Function0 function0 = onNavigateUp;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(943904695, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt$SavedRecipesScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_back_button), function0, null, false, null, 0L, composer3, 0, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 766);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, WindowInsets_androidKt.b(composerImplV), ComposableLambdaKt.c(668588558, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt$SavedRecipesScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues paddings = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddings, "paddings");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddings) ? 4 : 2;
                    }
                    int i2 = iIntValue & 19;
                    Unit unit = Unit.f24250a;
                    if (i2 == 18 && composer2.c()) {
                        composer2.j();
                        return unit;
                    }
                    Modifier modifierE = PaddingKt.e(Modifier.Companion.d, paddings);
                    Function0 function0 = onPageRefresh;
                    SavedRecipesViewModel savedRecipesViewModel = viewModel;
                    SavedRecipesScreenKt.c(savedRecipesViewModel, modifierE, function0, composer2, 0);
                    composer2.o(-1746271574);
                    boolean zI3 = composer2.I(savedRecipesViewModel);
                    ManagedActivityResultLauncher managedActivityResultLauncher = managedActivityResultLauncherA2;
                    boolean zI4 = zI3 | composer2.I(managedActivityResultLauncher);
                    ManagedActivityResultLauncher managedActivityResultLauncher2 = managedActivityResultLauncherA;
                    boolean zI5 = zI4 | composer2.I(managedActivityResultLauncher2);
                    Object objG3 = composer2.G();
                    if (zI5 || objG3 == Composer.Companion.f1624a) {
                        objG3 = new SavedRecipesScreenKt$SavedRecipesScreen$2$1$1(savedRecipesViewModel, managedActivityResultLauncher, managedActivityResultLauncher2, null);
                        composer2.A(objG3);
                    }
                    composer2.l();
                    EffectsKt.e(composer2, unit, (Function2) objG3);
                    return unit;
                }
            }, composerImplV), composerImplV, 12582966, 60);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(viewModel, onNavigateUp, onPageRefresh, i, 5);
        }
    }
}
