package au.com.woolworths.shop.checkout.ui.summary.promocode;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.intl.Locale;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f;
import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutPromoCodeResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PromoCodeConfirmationDialogKt {
    public static final void a(final ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeConfirmation confirmationDialogData, final Function0 onReplacePromoCode, final Function0 onCloseAlertDialogClick, Composer composer, final int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(confirmationDialogData, "confirmationDialogData");
        Intrinsics.h(onReplacePromoCode, "onReplacePromoCode");
        Intrinsics.h(onCloseAlertDialogClick, "onCloseAlertDialogClick");
        ComposerImpl composerImplV = composer.v(1523754252);
        int i2 = (composerImplV.n(confirmationDialogData) ? 4 : 2) | i | (composerImplV.I(onReplacePromoCode) ? 32 : 16) | (composerImplV.I(onCloseAlertDialogClick) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(5004770);
            boolean z = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new f(16, onCloseAlertDialogClick);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            AndroidAlertDialog_androidKt.a((Function0) objG, ComposableLambdaKt.c(1136515412, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeConfirmationDialogKt$PromoCodeConfirmationDialog$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.b, Alignment.Companion.j, composer2, 6);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
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
                        Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        composer2.o(5004770);
                        Function0 function02 = onCloseAlertDialogClick;
                        boolean zN = composer2.n(function02);
                        Object objG2 = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (zN || objG2 == obj3) {
                            objG2 = new f(17, function02);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        final ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeConfirmation applyCheckoutPromoCodeConfirmation = confirmationDialogData;
                        ButtonKt.c((Function0) objG2, null, false, null, null, null, null, null, ComposableLambdaKt.c(-1509626827, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeConfirmationDialogKt$PromoCodeConfirmationDialog$2$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                RowScope TextButton = (RowScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(TextButton, "$this$TextButton");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    TextKt.b(StringKt.a(applyCheckoutPromoCodeConfirmation.d, Locale.Companion.a()), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer3).f5120a.b.b, composer3, 0, 0, 65534);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306368, 510);
                        composer2.o(5004770);
                        Function0 function03 = onReplacePromoCode;
                        boolean zN2 = composer2.n(function03);
                        Object objG3 = composer2.G();
                        if (zN2 || objG3 == obj3) {
                            objG3 = new f(18, function03);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        ButtonKt.c((Function0) objG3, null, false, null, null, null, null, null, ComposableLambdaKt.c(2003189484, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeConfirmationDialogKt$PromoCodeConfirmationDialog$2$1$4
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                RowScope TextButton = (RowScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(TextButton, "$this$TextButton");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    TextKt.b(StringKt.a(applyCheckoutPromoCodeConfirmation.c, Locale.Companion.a()), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer3).f5120a.b.b, composer3, 0, 0, 65534);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306368, 510);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, ComposableLambdaKt.c(1371613591, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeConfirmationDialogKt$PromoCodeConfirmationDialog$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextKt.b(confirmationDialogData.f10558a, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).d.c.b, composer2, 0, 0, 65534);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-1413331880, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeConfirmationDialogKt$PromoCodeConfirmationDialog$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextKt.b(confirmationDialogData.b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).f5120a.b.f5123a, composer2, 0, 0, 65534);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, 0L, 0L, null, composerImpl, 224304, 964);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(onReplacePromoCode, onCloseAlertDialogClick, i) { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.a
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    PromoCodeConfirmationDialogKt.a(this.d, this.e, this.f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
