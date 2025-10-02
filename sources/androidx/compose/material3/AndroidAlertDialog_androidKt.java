package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidAlertDialog_androidKt {
    public static final void a(final Function0 function0, final ComposableLambdaImpl composableLambdaImpl, final Modifier modifier, final Function2 function2, final Function2 function22, final Function2 function23, Shape shape, final long j, long j2, long j3, long j4, float f, DialogProperties dialogProperties, Composer composer, final int i) {
        Function0 function02;
        int i2;
        ComposableLambdaImpl composableLambdaImpl2;
        Modifier modifier2;
        Function2 function24;
        Function2 function25;
        Function2 function26;
        long j5;
        Shape shapeB;
        long jD;
        int i3;
        long jD2;
        long jD3;
        float f2;
        DialogProperties dialogProperties2;
        ComposerImpl composerImpl;
        final Shape shape2;
        final long j6;
        final long j7;
        final long j8;
        final float f3;
        final DialogProperties dialogProperties3;
        ComposerImpl composerImplV = composer.v(-2081346864);
        if ((i & 6) == 0) {
            function02 = function0;
            i2 = (composerImplV.I(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i2 = i;
        }
        if ((i & 48) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i2 |= composerImplV.I(composableLambdaImpl2) ? 32 : 16;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i & 3072) == 0) {
            function24 = function2;
            i2 |= composerImplV.I(function24) ? 2048 : 1024;
        } else {
            function24 = function2;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            function25 = function22;
            i4 |= composerImplV.I(function25) ? 131072 : 65536;
        } else {
            function25 = function22;
        }
        if ((1572864 & i) == 0) {
            function26 = function23;
            i4 |= composerImplV.I(function26) ? 1048576 : 524288;
        } else {
            function26 = function23;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            j5 = j;
            i4 |= composerImplV.s(j5) ? 67108864 : 33554432;
        } else {
            j5 = j;
        }
        if ((805306368 & i) == 0) {
            i4 |= 268435456;
        }
        if ((306783379 & i4) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            shape2 = shape;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            f3 = f;
            dialogProperties3 = dialogProperties;
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                float f4 = AlertDialogDefaults.f1393a;
                shapeB = ShapesKt.b(DialogTokens.f1575a, composerImplV);
                jD = ColorSchemeKt.d(DialogTokens.f, composerImplV);
                i3 = i4 & (-1908408321);
                jD2 = ColorSchemeKt.d(DialogTokens.b, composerImplV);
                jD3 = ColorSchemeKt.d(DialogTokens.d, composerImplV);
                f2 = AlertDialogDefaults.f1393a;
                composerImpl = composerImplV;
                dialogProperties2 = new DialogProperties(7);
            } else {
                composerImplV.j();
                i3 = i4 & (-1908408321);
                shapeB = shape;
                jD = j2;
                jD2 = j3;
                jD3 = j4;
                f2 = f;
                dialogProperties2 = dialogProperties;
                composerImpl = composerImplV;
            }
            composerImpl.W();
            int i5 = i3 & 2147483646;
            ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
            Modifier modifier3 = modifier2;
            Function2 function27 = function24;
            Function2 function28 = function25;
            Function2 function29 = function26;
            Shape shape3 = shapeB;
            long j9 = jD3;
            DialogProperties dialogProperties4 = dialogProperties2;
            float f5 = f2;
            long j10 = jD;
            long j11 = jD2;
            AlertDialogKt.c(function02, composableLambdaImpl3, modifier3, function27, function28, function29, shape3, j5, j10, j11, j9, f5, dialogProperties4, composerImpl, i5, 3456);
            shape2 = shape3;
            j6 = j10;
            j7 = j11;
            j8 = j9;
            f3 = f5;
            dialogProperties3 = dialogProperties4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    AndroidAlertDialog_androidKt.a(function0, composableLambdaImpl, modifier, function2, function22, function23, shape2, j, j6, j7, j8, f3, dialogProperties3, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
