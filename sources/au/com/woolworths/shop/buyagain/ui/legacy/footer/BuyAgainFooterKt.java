package au.com.woolworths.shop.buyagain.ui.legacy.footer;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.sdui.legacy.button.ApiDrivenButtonKt;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-buy-again_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainFooterKt {
    public static final void a(final BuyAgainContractLegacy.FooterState footerState, final Function0 onAddToCartClicked, final Function0 onAddToListClicked, Composer composer, final int i) {
        String quantityString;
        int i2;
        Function0 function0;
        boolean z;
        Function0 function02;
        boolean z2;
        Intrinsics.h(onAddToCartClicked, "onAddToCartClicked");
        Intrinsics.h(onAddToListClicked, "onAddToListClicked");
        ComposerImpl composerImplV = composer.v(-1626048443);
        int i3 = (composerImplV.I(footerState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(onAddToCartClicked) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onAddToListClicked) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            function02 = onAddToCartClicked;
            function0 = onAddToListClicked;
        } else {
            if (!footerState.f10289a) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i4 = 0;
                    recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.footer.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    BuyAgainFooterKt.a(footerState, onAddToCartClicked, onAddToListClicked, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                default:
                                    BuyAgainFooterKt.a(footerState, onAddToCartClicked, onAddToListClicked, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            float f = 16;
            float d = WindowInsetsKt.d(WindowInsets_androidKt.a(composerImplV), composerImplV).getD();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierI = PaddingKt.i(companion, f, f, f, d);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierI);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Context ctx = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Intrinsics.h(ctx, "ctx");
            int i6 = footerState.d;
            if (i6 == 0) {
                quantityString = ctx.getResources().getString(R.string.buy_again_footer_no_product_selected);
                Intrinsics.e(quantityString);
            } else {
                quantityString = ctx.getResources().getQuantityString(R.plurals.buy_again_footer_products_selected, i6, Integer.valueOf(i6));
                Intrinsics.e(quantityString);
            }
            int i7 = i3;
            TextKt.b(quantityString, companion, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, 48, 0, 65532);
            composerImplV = composerImplV;
            float f2 = 8;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(f2), Alignment.Companion.j, composerImplV, 6);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            ButtonApiData buttonApiData = footerState.c;
            composerImplV.o(-167802464);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            if (buttonApiData == null) {
                function0 = onAddToListClicked;
                i2 = i7;
                z = false;
            } else {
                composerImplV.o(5004770);
                i2 = i7;
                boolean z3 = (i2 & 896) == 256;
                Object objG = composerImplV.G();
                if (z3 || objG == composer$Companion$Empty$1) {
                    function0 = onAddToListClicked;
                    objG = new j(9, function0);
                    composerImplV.A(objG);
                } else {
                    function0 = onAddToListClicked;
                }
                composerImplV.V(false);
                z = false;
                ApiDrivenButtonKt.a(buttonApiData, (Function1) objG, rowScopeInstance.a(SizeKt.e(companion, 1.0f), 1.0f, true), null, composerImplV, 0, 8);
            }
            composerImplV.V(z);
            ButtonApiData buttonApiData2 = footerState.b;
            composerImplV.o(-167792064);
            if (buttonApiData2 == null) {
                function02 = onAddToCartClicked;
                z2 = true;
            } else {
                composerImplV.o(5004770);
                boolean z4 = (i2 & 112) == 32 ? true : z;
                Object objG2 = composerImplV.G();
                if (z4 || objG2 == composer$Companion$Empty$1) {
                    function02 = onAddToCartClicked;
                    objG2 = new j(10, function02);
                    composerImplV.A(objG2);
                } else {
                    function02 = onAddToCartClicked;
                }
                composerImplV.V(z);
                z2 = true;
                ApiDrivenButtonKt.a(buttonApiData2, (Function1) objG2, rowScopeInstance.a(SizeKt.e(companion, 1.0f), 1.0f, true), null, composerImplV, 0, 8);
            }
            android.support.v4.media.session.a.C(composerImplV, z, z2, z2);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i9 = 1;
            final Function0 function04 = function02;
            final Function0 function05 = function0;
            recomposeScopeImplX2.d = new Function2() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.footer.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i9;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            BuyAgainFooterKt.a(footerState, function04, function05, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                        default:
                            BuyAgainFooterKt.a(footerState, function04, function05, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
