package au.com.woolworths.feature.shop.wpay.ui.addgiftcard;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.input.d;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle;
import au.com.woolworths.design.core.ui.component.stable.alert.Placement;
import au.com.woolworths.design.core.ui.component.stable.corerow.SwitchRowKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.j;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardContract;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AddGiftCardContentKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    public static final void a(AddGiftCardContract.ViewState viewState, boolean z, String giftCardNumber, String pin, Function1 onGiftCardNumberChange, Function1 onPinChange, Function0 onInputChange, Function1 onToggleSaveGiftCard, Modifier modifier, Composer composer, int i) {
        Function2 function2;
        Function2 function22;
        Arrangement$Top$1 arrangement$Top$1;
        BiasAlignment.Horizontal horizontal;
        Function2 function23;
        ?? r2;
        ComposerImpl composerImpl;
        Modifier modifier2;
        ComposerImpl composerImpl2;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(giftCardNumber, "giftCardNumber");
        Intrinsics.h(pin, "pin");
        Intrinsics.h(onGiftCardNumberChange, "onGiftCardNumberChange");
        Intrinsics.h(onPinChange, "onPinChange");
        Intrinsics.h(onInputChange, "onInputChange");
        Intrinsics.h(onToggleSaveGiftCard, "onToggleSaveGiftCard");
        ComposerImpl composerImplV = composer.v(186449471);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(giftCardNumber) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(pin) ? 2048 : 1024;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onInputChange) ? 1048576 : 524288;
        }
        int i3 = i2 | 100663296;
        if ((i3 & 38347923) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl2 = composerImplV;
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function24 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function24);
            Function2 function25 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function25);
            Function2 function26 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function26);
            }
            Function2 function27 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function27);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 56, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            Arrangement$Top$1 arrangement$Top$12 = Arrangement.c;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$12, horizontal2, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function24);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function25);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function26);
            }
            Updater.b(composerImplV, modifierD2, function27);
            String str = viewState.b;
            composerImplV.o(-1353603872);
            if (str == null) {
                function23 = function26;
                composerImpl = composerImplV;
                function22 = function24;
                function2 = function25;
                arrangement$Top$1 = arrangement$Top$12;
                horizontal = horizontal2;
                r2 = 0;
            } else {
                AlertStyle alertStyle = AlertStyle.g;
                Placement placement = Placement.d;
                float f = 16;
                Modifier modifierJ2 = PaddingKt.j(companion, f, f, f, BitmapDescriptorFactory.HUE_RED, 8);
                function2 = function25;
                function22 = function24;
                arrangement$Top$1 = arrangement$Top$12;
                horizontal = horizontal2;
                function23 = function26;
                r2 = 0;
                AlertKt.c(alertStyle, placement, modifierJ2, null, str, null, null, composerImplV, 438, 104);
                composerImpl = composerImplV;
            }
            composerImpl.V(r2);
            float f2 = 16;
            Modifier modifierJ3 = PaddingKt.j(companion, f2, f2, f2, BitmapDescriptorFactory.HUE_RED, 8);
            Arrangement$Top$1 arrangement$Top$13 = arrangement$Top$1;
            BiasAlignment.Horizontal horizontal3 = horizontal;
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$13, horizontal3, composerImpl, r2);
            int i6 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImpl.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImpl, modifierJ3);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function0);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, columnMeasurePolicyA2, function22);
            Updater.b(composerImpl, persistentCompositionLocalMapQ3, function2);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImpl, i6, function23);
            }
            Updater.b(composerImpl, modifierD3, function27);
            float f3 = 8;
            ComposerImpl composerImpl3 = composerImpl;
            TextKt.b(StringResources_androidKt.c(composerImpl, R.string.checkout_payment_add_gift_card_modal_gift_card_number_title), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl).f5120a.b.b, composerImpl3, 0, 0, 65532);
            composerImpl3.o(1849434622);
            Object objG = composerImpl3.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new FocusRequester();
                composerImpl3.A(objG);
            }
            FocusRequester focusRequester = (FocusRequester) objG;
            composerImpl3.V(false);
            final boolean z2 = viewState.d;
            Modifier modifierE = SizeKt.e(FocusRequesterModifierKt.a(companion, focusRequester), 1.0f);
            TextStyle textStyle = CoreTheme.f(composerImpl3).f5120a.b.f5123a;
            Function2 function28 = function23;
            Function2 function29 = function22;
            KeyboardOptions keyboardOptionsA = KeyboardOptions.a(3, 6, 115);
            composerImpl3.o(1849434622);
            Object objG2 = composerImpl3.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new d(1);
                composerImpl3.A(objG2);
            }
            VisualTransformation visualTransformation = (VisualTransformation) objG2;
            composerImpl3.V(false);
            composerImpl3.o(-1633490746);
            int i7 = i3 & 3670016;
            boolean z3 = i7 == 1048576;
            Object objG3 = composerImpl3.G();
            if (z3 || objG3 == composer$Companion$Empty$1) {
                objG3 = new a(onInputChange, onGiftCardNumberChange, 0);
                composerImpl3.A(objG3);
            }
            composerImpl3.V(false);
            Function2 function210 = function2;
            OutlinedTextFieldKt.b(giftCardNumber, (Function1) objG3, modifierE, false, false, textStyle, null, null, ComposableSingletons$AddGiftCardContentKt.f8346a, ComposableLambdaKt.c(1719830198, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardContentKt$AddGiftCardContent$1$1$2$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else if (z2) {
                        IconKt.b(CoreTheme.e(composer2).i.b, null, null, CoreTheme.b(composer2).d.d.e.f4847a, composer2, 48, 4);
                    }
                    return Unit.f24250a;
                }
            }, composerImpl3), z2, visualTransformation, keyboardOptionsA, null, true, 0, 0, null, null, null, composerImpl3, ((i3 >> 6) & 14) | 905969664, 24624, 1024216);
            composerImpl3.o(-1544846932);
            if (z2) {
                b(StringResources_androidKt.c(composerImpl3, R.string.checkout_payment_add_gift_card_modal_card_number_error), composerImpl3, 0);
            }
            composerImpl3.V(false);
            composerImpl3.o(5004770);
            Object objG4 = composerImpl3.G();
            if (objG4 == composer$Companion$Empty$1) {
                objG4 = new AddGiftCardContentKt$AddGiftCardContent$1$1$2$4$1(focusRequester, null);
                composerImpl3.A(objG4);
            }
            composerImpl3.V(false);
            EffectsKt.e(composerImpl3, Unit.f24250a, (Function2) objG4);
            composerImpl3.V(true);
            Modifier modifierF = PaddingKt.f(companion, f2);
            ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$13, horizontal3, composerImpl3, 0);
            int i8 = composerImpl3.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImpl3.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImpl3, modifierF);
            composerImpl3.i();
            if (composerImpl3.O) {
                composerImpl3.K(function0);
            } else {
                composerImpl3.e();
            }
            Updater.b(composerImpl3, columnMeasurePolicyA3, function29);
            Updater.b(composerImpl3, persistentCompositionLocalMapQ4, function210);
            if (composerImpl3.O || !Intrinsics.c(composerImpl3.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImpl3, i8, function28);
            }
            Updater.b(composerImpl3, modifierD4, function27);
            TextKt.b(StringResources_androidKt.c(composerImpl3, R.string.checkout_payment_add_gift_card_modal_pin_title), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl3).f5120a.b.b, composerImpl3, 0, 0, 65532);
            final boolean z4 = viewState.c;
            Modifier modifierU = SizeKt.u(companion, 164);
            TextStyle textStyle2 = CoreTheme.f(composerImpl3).f5120a.b.f5123a;
            KeyboardOptions keyboardOptionsA2 = KeyboardOptions.a(3, 6, 115);
            composerImpl3.o(-1633490746);
            boolean z5 = i7 == 1048576;
            Object objG5 = composerImpl3.G();
            if (z5 || objG5 == composer$Companion$Empty$1) {
                objG5 = new a(onInputChange, onPinChange, 1);
                composerImpl3.A(objG5);
            }
            composerImpl3.V(false);
            modifier2 = companion;
            OutlinedTextFieldKt.b(pin, (Function1) objG5, modifierU, false, false, textStyle2, null, null, null, ComposableLambdaKt.c(1074708831, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardContentKt$AddGiftCardContent$1$1$3$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else if (z4) {
                        IconKt.b(CoreTheme.e(composer2).i.b, null, null, CoreTheme.b(composer2).d.d.e.f4847a, composer2, 48, 4);
                    }
                    return Unit.f24250a;
                }
            }, composerImpl3), z4, null, keyboardOptionsA2, null, true, 0, 0, null, null, null, composerImpl3, ((i3 >> 9) & 14) | 805306752, 24576, 1026520);
            composerImpl3.o(176779558);
            if (z4) {
                b(StringResources_androidKt.c(composerImpl3, R.string.checkout_payment_add_gift_card_modal_pin_error), composerImpl3, 0);
            }
            composerImpl3.V(false);
            composerImpl3.V(true);
            SwitchRowKt.a(StringResources_androidKt.c(composerImpl3, R.string.checkout_payment_add_gift_card_modal_save_title), z, onToggleSaveGiftCard, null, null, null, null, null, null, composerImpl3, (i3 & 112) | KyberEngine.KyberPolyBytes, 504);
            composerImpl2 = composerImpl3;
            composerImpl2.V(true);
            composerImpl2.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new j(viewState, z, giftCardNumber, pin, onGiftCardNumberChange, onPinChange, onInputChange, onToggleSaveGiftCard, modifier2, i);
        }
    }

    public static final void b(String str, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(802040958);
        int i2 = i | (composerImplV.n(str) ? 4 : 2);
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            TextKt.b(str, PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composerImplV).d.d.e.f4847a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.c.f5124a, composerImpl, (i2 & 14) | 48, 0, 65528);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.corerow.impl.b(str, i, 5);
        }
    }
}
