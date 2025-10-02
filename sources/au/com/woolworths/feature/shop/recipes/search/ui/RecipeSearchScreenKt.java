package au.com.woolworths.feature.shop.recipes.search.ui;

import androidx.camera.core.impl.b;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.component.searchbar.SearchBarKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.offers.listpage.ui.e;
import au.com.woolworths.feature.rewards.offers.ui.a;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchContract;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchViewModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/search/RecipeSearchContract$ViewState;", "viewState", "recipes-search_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeSearchScreenKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 function0) {
        ComposerImpl composerImplV = composer.v(-881201960);
        int i2 = (composerImplV.n(modifier) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.k, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.recipe_search_recent_searches_label), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, 0, 0, 65534);
            composerImplV = composerImplV;
            TertiaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.recipe_search_clear_recent_searches_label), function0, null, false, false, null, null, composerImplV, i2 & 112, 124);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(modifier, function0, i, 3);
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, String str) {
        ComposerImpl composerImplV = composer.v(-1067200956);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            IconKt.b(VectorResources_androidKt.b(R.drawable.ic_recipe_search_history, 6, composerImplV), null, PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 11), WxTheme.a(composerImplV).h(), composerImplV, 432, 0);
            TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composerImplV).n, composerImplV, i2 & 14, 3120, 55294);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(str, modifier, i, 9);
        }
    }

    public static final void c(String str, final String str2, final RecipeSearchViewModel viewModel, final Function0 onNavigateUp, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(1372968048);
        if (((i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.I(viewModel) ? 256 : 128) | (composerImplV.I(onNavigateUp) ? 2048 : 1024)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final MutableState mutableStateA = FlowExtKt.a(viewModel.j, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                int length = str.length();
                objG = SnapshotStateKt.f(new TextFieldValue(str, TextRangeKt.a(length, length), 4));
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(-2081540043, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.search.ui.RecipeSearchScreenKt$RecipeSearchScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierA = ComposedModifierKt.a(SizeKt.e(companion, 1.0f), InspectableValueKt.a(), new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1(3));
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierA);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                        MutableState mutableState2 = mutableState;
                        TextFieldValue textFieldValue = (TextFieldValue) mutableState2.getD();
                        composer2.o(-140503636);
                        String strC = str2;
                        if (strC == null) {
                            strC = StringResources_androidKt.c(composer2, R.string.recipe_search_query_hint);
                        }
                        String str3 = strC;
                        Object objE = au.com.woolworths.android.onesite.a.e(composer2, 5004770);
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (objE == composer$Companion$Empty$1) {
                            objE = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState2, 14);
                            composer2.A(objE);
                        }
                        Function1 function1 = (Function1) objE;
                        composer2.l();
                        composer2.o(-1633490746);
                        RecipeSearchViewModel recipeSearchViewModel = viewModel;
                        boolean zI = composer2.I(recipeSearchViewModel);
                        Object objG2 = composer2.G();
                        if (zI || objG2 == composer$Companion$Empty$1) {
                            objG2 = new f(14, recipeSearchViewModel, mutableState2);
                            composer2.A(objG2);
                        }
                        Function0 function02 = (Function0) objG2;
                        Object objE2 = au.com.woolworths.android.onesite.a.e(composer2, 5004770);
                        if (objE2 == composer$Companion$Empty$1) {
                            objE2 = new e(mutableState2, 5);
                            composer2.A(objE2);
                        }
                        Function0 function03 = (Function0) objE2;
                        composer2.l();
                        final Function0 function04 = onNavigateUp;
                        SearchBarKt.a(textFieldValue, true, function1, function02, function03, modifierE, 0L, str3, ComposableLambdaKt.c(31094339, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.search.ui.RecipeSearchScreenKt$RecipeSearchScreen$1$1$4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = ArrowBackKt.a();
                                    String strC2 = StringResources_androidKt.c(composer3, R.string.back);
                                    long jH = WxTheme.a(composer3).h();
                                    composer3.o(5004770);
                                    Function0 function05 = function04;
                                    boolean zN = composer3.n(function05);
                                    Object objG3 = composer3.G();
                                    if (zN || objG3 == Composer.Companion.f1624a) {
                                        objG3 = new k(5, function05);
                                        composer3.A(objG3);
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC2, (Function0) objG3, null, false, jH, composer3, 0, 24);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 100884912, 64);
                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, ToneColors.i, composer2, null);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(1404621351, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.search.ui.RecipeSearchScreenKt$RecipeSearchScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        final State state = mutableStateA;
                        boolean z = !((RecipeSearchContract.ViewState) state.getD()).f8084a.isEmpty() && ((TextFieldValue) mutableState.getD()).f2127a.e.length() == 0;
                        EnterTransition enterTransitionE = EnterExitTransitionKt.e(null, 3);
                        ExitTransition exitTransitionF = EnterExitTransitionKt.f(null, 3);
                        final RecipeSearchViewModel recipeSearchViewModel = viewModel;
                        AnimatedVisibilityKt.d(z, null, enterTransitionE, exitTransitionF, null, ComposableLambdaKt.c(-1800501505, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.search.ui.RecipeSearchScreenKt$RecipeSearchScreen$2.1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                ((Number) obj6).intValue();
                                Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                                PaddingValues paddingValues2 = paddingValues;
                                Modifier.Companion companion = Modifier.Companion.d;
                                Modifier modifierE = PaddingKt.e(companion, paddingValues2);
                                ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                                int p = composer3.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                Modifier modifierD = ComposedModifierKt.d(composer3, modifierE);
                                ComposeUiNode.e3.getClass();
                                Function0 function0 = ComposeUiNode.Companion.b;
                                if (composer3.w() == null) {
                                    ComposablesKt.b();
                                    throw null;
                                }
                                composer3.i();
                                if (composer3.getO()) {
                                    composer3.K(function0);
                                } else {
                                    composer3.e();
                                }
                                Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                Function2 function2 = ComposeUiNode.Companion.j;
                                if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                    b.z(p, composer3, p, function2);
                                }
                                Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                float f = 16;
                                Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), f, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
                                composer3.o(5004770);
                                Object obj7 = recipeSearchViewModel;
                                boolean zI = composer3.I(obj7);
                                Object objG2 = composer3.G();
                                Object obj8 = Composer.Companion.f1624a;
                                if (zI || objG2 == obj8) {
                                    objG2 = new au.com.woolworths.feature.shop.myorders.details.infomodal.a(obj7, 12);
                                    composer3.A(objG2);
                                }
                                composer3.l();
                                RecipeSearchScreenKt.a(0, composer3, modifierJ, (Function0) objG2);
                                composer3.o(1885533738);
                                for (String str3 : ((RecipeSearchContract.ViewState) state.getD()).f8084a) {
                                    Modifier modifierE2 = SizeKt.e(companion, 1.0f);
                                    composer3.o(-1633490746);
                                    boolean zI2 = composer3.I(obj7) | composer3.n(str3);
                                    Object objG3 = composer3.G();
                                    if (zI2 || objG3 == obj8) {
                                        objG3 = new f(15, obj7, str3);
                                        composer3.A(objG3);
                                    }
                                    composer3.l();
                                    RecipeSearchScreenKt.b(0, composer3, PaddingKt.g(ClickableKt.d(modifierE2, false, null, null, (Function0) objG3, 7), f, 12), str3);
                                }
                                composer3.l();
                                composer3.f();
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 200064, 18);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 390, 1018);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(str, str2, viewModel, onNavigateUp, i);
        }
    }
}
