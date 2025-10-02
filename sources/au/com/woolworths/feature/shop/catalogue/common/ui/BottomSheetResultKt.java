package au.com.woolworths.feature.shop.catalogue.common.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.feature.shop.catalogue.common.BottomSheetResult;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BottomSheetResultKt {
    public static final void a(final BottomSheetResult bottomSheetResult, Function0 function0, final Function1 onViewShoppingListAction, Composer composer, final int i) {
        int i2;
        BottomSheetResult bottomSheetResult2;
        final Function0 onSnackbarDismissed = function0;
        Intrinsics.h(onSnackbarDismissed, "onSnackbarDismissed");
        Intrinsics.h(onViewShoppingListAction, "onViewShoppingListAction");
        ComposerImpl composerImplV = composer.v(958287631);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(bottomSheetResult) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onSnackbarDismissed) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onViewShoppingListAction) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            bottomSheetResult2 = bottomSheetResult;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            composerImplV.V(false);
            Modifier modifierA = WindowInsetsPadding_androidKt.a(SizeKt.c);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            SnackbarHostKt.b(snackbarHostState, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.h), ComposableSingletons$BottomSheetResultKt.f6818a, composerImplV, 390, 0);
            composerImplV.V(true);
            if (bottomSheetResult == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i4 = 0;
                    recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.catalogue.common.ui.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    BottomSheetResultKt.a(bottomSheetResult, onSnackbarDismissed, onViewShoppingListAction, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                default:
                                    BottomSheetResultKt.a(bottomSheetResult, onSnackbarDismissed, onViewShoppingListAction, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            bottomSheetResult2 = bottomSheetResult;
            if (bottomSheetResult2 instanceof BottomSheetResult.AddToListSuccess) {
                composerImplV.o(-299980850);
                ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = ((BottomSheetResult.AddToListSuccess) bottomSheetResult2).d;
                String str = addToListSuccessEvent.f;
                if (str == null) {
                    str = "";
                }
                String strB = StringResources_androidKt.b(R.string.product_add_to_list_successfully, new Object[]{str, addToListSuccessEvent.e}, composerImplV);
                String upperCase = StringResources_androidKt.c(composerImplV, R.string.view_list).toUpperCase(Locale.ROOT);
                Intrinsics.g(upperCase, "toUpperCase(...)");
                composerImplV.o(-1224400529);
                boolean zN = composerImplV.n(strB) | composerImplV.n(upperCase) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | composerImplV.I(addToListSuccessEvent);
                Object objG2 = composerImplV.G();
                if (zN || objG2 == composer$Companion$Empty$1) {
                    BottomSheetResultKt$BottomSheetResult$3$1 bottomSheetResultKt$BottomSheetResult$3$1 = new BottomSheetResultKt$BottomSheetResult$3$1(snackbarHostState, strB, upperCase, function0, onViewShoppingListAction, addToListSuccessEvent, null);
                    onSnackbarDismissed = function0;
                    composerImplV.A(bottomSheetResultKt$BottomSheetResult$3$1);
                    objG2 = bottomSheetResultKt$BottomSheetResult$3$1;
                } else {
                    onSnackbarDismissed = function0;
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, bottomSheetResult2, (Function2) objG2);
                composerImplV.V(false);
            } else {
                onSnackbarDismissed = function0;
                if (!(bottomSheetResult2 instanceof BottomSheetResult.AddToCartError)) {
                    throw au.com.woolworths.android.onesite.a.w(1791435569, composerImplV, false);
                }
                composerImplV.o(-299244972);
                String strC = StringResources_androidKt.c(composerImplV, ((BottomSheetResult.AddToCartError) bottomSheetResult2).d.d);
                composerImplV.o(-1746271574);
                boolean zN2 = composerImplV.n(strC) | ((i2 & 112) == 32);
                Object objG3 = composerImplV.G();
                if (zN2 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new BottomSheetResultKt$BottomSheetResult$4$1(snackbarHostState, strC, onSnackbarDismissed, null);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, bottomSheetResult2, (Function2) objG3);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i5 = 1;
            final BottomSheetResult bottomSheetResult3 = bottomSheetResult2;
            recomposeScopeImplX2.d = new Function2() { // from class: au.com.woolworths.feature.shop.catalogue.common.ui.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i5;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i52) {
                        case 0:
                            BottomSheetResultKt.a(bottomSheetResult3, onSnackbarDismissed, onViewShoppingListAction, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                        default:
                            BottomSheetResultKt.a(bottomSheetResult3, onSnackbarDismissed, onViewShoppingListAction, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
