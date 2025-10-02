package com.google.pay.button;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.c;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "showFallback", "compose-pay-button_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class PayButtonKt {
    public static final void a(final Function0 onClick, final String str, final Modifier modifier, ButtonTheme buttonTheme, final ButtonType buttonType, final float f, boolean z, Function1 function1, Composer composer, final int i) {
        int i2;
        String str2;
        final ButtonTheme buttonTheme2;
        final Function1 function12;
        final boolean z2;
        MutableState mutableState;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-268720185);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= composerImplV.n(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= composerImplV.n(buttonType) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.q(f) ? 131072 : 65536;
        }
        int i4 = i3 | 114819072;
        if ((38347923 & i4) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            buttonTheme2 = buttonTheme;
            z2 = z;
            function12 = function1;
        } else {
            ButtonTheme buttonTheme3 = ButtonTheme.d;
            composerImplV.o(-1137921778);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(7);
                composerImplV.A(objG);
            }
            Function1 function13 = (Function1) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(-1137919090, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objD);
            }
            MutableState mutableState2 = (MutableState) objD;
            composerImplV.V(false);
            int iT1 = (int) ((Density) composerImplV.x(CompositionLocalsKt.h)).T1(f);
            if (((Boolean) mutableState2.getD()).booleanValue()) {
                composerImplV.o(-914337774);
                composerImplV.V(false);
            } else {
                composerImplV.o(-915575883);
                composerImplV.o(-1137911450);
                boolean zR = ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | composerImplV.r(iT1) | ((i4 & 112) == 32) | ((29360128 & i4) == 8388608);
                Object objG2 = composerImplV.G();
                if (zR || objG2 == composer$Companion$Empty$1) {
                    c cVar = new c(buttonType, iT1, str2, function13, mutableState2);
                    mutableState = mutableState2;
                    composerImplV.A(cVar);
                    objG2 = cVar;
                } else {
                    mutableState = mutableState2;
                }
                Function1 function14 = (Function1) objG2;
                composerImplV.V(false);
                composerImplV.o(-1137888610);
                boolean z3 = ((3670016 & i4) == 1048576) | ((i4 & 14) == 4);
                Object objG3 = composerImplV.G();
                if (z3 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new m(mutableState, onClick, 2);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                AndroidView_androidKt.a(function14, modifier, (Function1) objG3, composerImplV, (i4 >> 3) & 112, 0);
                composerImplV.V(false);
            }
            buttonTheme2 = buttonTheme3;
            function12 = function13;
            z2 = true;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: com.google.pay.button.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    PayButtonKt.a(onClick, str, modifier, buttonTheme2, buttonType, f, z2, function12, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
