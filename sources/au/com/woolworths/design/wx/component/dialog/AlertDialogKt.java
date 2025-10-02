package au.com.woolworths.design.wx.component.dialog;

import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.foundation.ThemeContext;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AlertDialogKt {
    public static final void a(final long j, final long j2, final Function0 function0, final ComposableLambdaImpl composableLambdaImpl, final Modifier modifier, final Function2 function2, final String str, final String str2, Composer composer, final int i) {
        long j3;
        int i2;
        long j4;
        ComposableLambdaImpl composableLambdaImpl2;
        Modifier modifier2;
        Function2 function22;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1762237322);
        if ((i & 6) == 0) {
            j3 = j;
            i2 = (composerImplV.s(j3) ? 4 : 2) | i;
        } else {
            j3 = j;
            i2 = i;
        }
        if ((i & 48) == 0) {
            j4 = j2;
            i2 |= composerImplV.s(j4) ? 32 : 16;
        } else {
            j4 = j2;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i2 |= composerImplV.I(composableLambdaImpl2) ? 2048 : 1024;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
        }
        if ((i & 24576) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if ((196608 & i) == 0) {
            function22 = function2;
            i2 |= composerImplV.I(function22) ? 131072 : 65536;
        } else {
            function22 = function2;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(str) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.n(str2) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1292968573);
            ComposableLambdaImpl composableLambdaImplC = str == null ? null : ComposableLambdaKt.c(-777717110, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.component.dialog.AlertDialogKt$AlertDialogImpl$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextStyle textStyle = WxTheme.b(composer2).i;
                        TextKt.b(str, null, WxTheme.a(composer2).c(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, 0, 0, 65530);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            composerImplV.V(false);
            composerImplV.o(1292977085);
            ComposableLambdaImpl composableLambdaImplC2 = str2 != null ? ComposableLambdaKt.c(507345419, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.component.dialog.AlertDialogKt$AlertDialogImpl$2$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextStyle textStyle = WxTheme.b(composer2).l;
                        TextKt.b(str2, null, WxTheme.a(composer2).c(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, 0, 0, 65530);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV) : null;
            composerImplV.V(false);
            int i3 = (i2 >> 6) & 8190;
            int i4 = i2 << 21;
            composerImpl = composerImplV;
            AndroidAlertDialog_androidKt.a(function0, composableLambdaImpl2, modifier2, function22, composableLambdaImplC, composableLambdaImplC2, null, j3, j4, null, composerImpl, i3 | (29360128 & i4) | (i4 & 234881024), 576);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.wx.component.dialog.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AlertDialogKt.a(j, j2, function0, composableLambdaImpl, modifier, function2, str, str2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(String str, Function0 function0, Composer composer, int i) {
        String str2;
        Function0 function02;
        ComposerImpl composerImplV = composer.v(-663147746);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.n(null) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            str2 = str;
            function02 = function0;
        } else {
            str2 = str;
            function02 = function0;
            TertiaryButtonKt.a(str2, function02, null, false, false, null, null, composerImplV, (i2 & 126) | ((i2 << 12) & 3670016), 60);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(i, 0, str2, function02);
        }
    }

    public static final void c(String str, Function0 function0, Composer composer, int i) {
        String str2;
        Function0 function02;
        ComposerImpl composerImplV = composer.v(888276024);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.n(null) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            str2 = str;
            function02 = function0;
        } else if (composerImplV.x(ThemeKt.f5160a) == ThemeContext.e) {
            composerImplV.o(1337762626);
            str2 = str;
            function02 = function0;
            SecondaryButtonKt.b(str2, function02, null, false, false, null, null, composerImplV, (i2 & 126) | ((i2 << 12) & 3670016), 60);
            composerImplV.V(false);
        } else {
            str2 = str;
            composerImplV.o(1337871715);
            function02 = function0;
            TertiaryButtonKt.a(str2, function02, null, false, false, null, null, composerImplV, (i2 & 126) | ((i2 << 12) & 3670016), 60);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(i, 1, str2, function02);
        }
    }
}
