package au.com.woolworths.design.core.ui.component.stable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CheckboxKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier, Function1 function1, boolean z, boolean z2) {
        int i3;
        int i4;
        Function1 function12;
        Modifier modifier2;
        boolean z3;
        ComposerImpl composerImplV = composer.v(-1288298820);
        if ((i & 6) == 0) {
            i3 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | KyberEngine.KyberPolyBytes;
        } else {
            i4 = i3 | (composerImplV.n(modifier) ? 256 : 128);
        }
        int i6 = i4 | 3072;
        if ((i6 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            z3 = z2;
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.d;
            }
            Modifier modifier3 = modifier;
            CheckBoxState checkBoxState = z ? CheckBoxState.d : CheckBoxState.e;
            composerImplV.o(-1104575046);
            if (function1 == null) {
                function12 = null;
            } else {
                composerImplV.o(-1633490746);
                boolean zN = ((i6 & 14) == 4) | composerImplV.n(function1);
                Object objG = composerImplV.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new b(function1, z, 0);
                    composerImplV.A(objG);
                }
                function12 = (Function1) objG;
                composerImplV.V(false);
            }
            Function1 function13 = function12;
            composerImplV.V(false);
            b(checkBoxState, function13, modifier3, true, composerImplV, i6 & 8064, 0);
            modifier2 = modifier3;
            z3 = true;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(z, function1, modifier2, z3, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.design.core.ui.component.stable.CheckBoxState r42, final kotlin.jvm.functions.Function1 r43, androidx.compose.ui.Modifier r44, final boolean r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.stable.CheckboxKt.b(au.com.woolworths.design.core.ui.component.stable.CheckBoxState, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
