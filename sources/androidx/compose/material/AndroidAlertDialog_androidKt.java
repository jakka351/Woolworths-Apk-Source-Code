package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final kotlin.jvm.functions.Function0 r28, final androidx.compose.runtime.internal.ComposableLambdaImpl r29, androidx.compose.ui.Modifier r30, final kotlin.jvm.functions.Function2 r31, final kotlin.jvm.functions.Function2 r32, final kotlin.jvm.functions.Function2 r33, androidx.compose.ui.graphics.Shape r34, long r35, long r37, androidx.compose.ui.window.DialogProperties r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AndroidAlertDialog_androidKt.a(kotlin.jvm.functions.Function0, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.ui.window.DialogProperties, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final Function0 function0, final ComposableLambdaImpl composableLambdaImpl, final Modifier modifier, final Function2 function2, final Function2 function22, final Shape shape, final long j, final long j2, final DialogProperties dialogProperties, Composer composer, final int i) {
        int i2;
        Modifier modifier2;
        Function2 function23;
        Function2 function24;
        Shape shape2;
        long j3;
        long j4;
        ComposerImpl composerImplV = composer.v(1035523925);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i & 3072) == 0) {
            function23 = function2;
            i2 |= composerImplV.I(function23) ? 2048 : 1024;
        } else {
            function23 = function2;
        }
        if ((i & 24576) == 0) {
            function24 = function22;
            i2 |= composerImplV.I(function24) ? 16384 : 8192;
        } else {
            function24 = function22;
        }
        if ((196608 & i) == 0) {
            shape2 = shape;
            i2 |= composerImplV.n(shape2) ? 131072 : 65536;
        } else {
            shape2 = shape;
        }
        if ((1572864 & i) == 0) {
            j3 = j;
            i2 |= composerImplV.s(j3) ? 1048576 : 524288;
        } else {
            j3 = j;
        }
        if ((12582912 & i) == 0) {
            j4 = j2;
            i2 |= composerImplV.s(j4) ? 8388608 : 4194304;
        } else {
            j4 = j2;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.n(dialogProperties) ? 67108864 : 33554432;
        }
        if (composerImplV.z(i2 & 1, (38347923 & i2) != 38347922)) {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            final Modifier modifier3 = modifier2;
            final Function2 function25 = function23;
            final Function2 function26 = function24;
            final Shape shape3 = shape2;
            final long j5 = j3;
            final long j6 = j4;
            AndroidDialog_androidKt.a(function0, dialogProperties, ComposableLambdaKt.c(-66632952, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        AlertDialogKt.b(composableLambdaImpl, modifier3, function25, function26, shape3, j5, j6, composer2, 0);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i2 & 14) | KyberEngine.KyberPolyBytes | (((i2 & 268435454) >> 21) & 112));
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AndroidAlertDialog_androidKt.b(function0, composableLambdaImpl, modifier, function2, function22, shape, j, j2, dialogProperties, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
