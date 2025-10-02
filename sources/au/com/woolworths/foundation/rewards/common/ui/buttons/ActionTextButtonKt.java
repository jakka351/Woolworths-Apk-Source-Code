package au.com.woolworths.foundation.rewards.common.ui.buttons;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ActionTextButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r13, kotlin.jvm.functions.Function0 r14, androidx.compose.ui.Modifier r15, long r16, androidx.compose.ui.text.TextStyle r18, boolean r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.common.ui.buttons.ActionTextButtonKt.a(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, long, androidx.compose.ui.text.TextStyle, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final String str, final long j, final TextStyle textStyle, final Function0 function0, final Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1471081526);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(textStyle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(modifier) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CompositionLocalKt.a(InteractiveComponentSizeKt.f1291a.b(Boolean.FALSE), ComposableLambdaKt.c(-1248895114, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.buttons.ActionTextButtonKt$TextButtonWrapper$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 1;
                        Modifier modifierA = SizeKt.a(modifier, f, f);
                        float f2 = 0;
                        PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, f2, f2, f2);
                        final long j2 = j;
                        final TextStyle textStyle2 = textStyle;
                        final String str2 = str;
                        ButtonKt.c(function0, modifierA, false, null, null, null, null, paddingValuesImpl, ComposableLambdaKt.c(-1239239847, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.buttons.ActionTextButtonKt$TextButtonWrapper$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TextButton = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TextButton, "$this$TextButton");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ActionTextButtonKt.c(str2, j2, textStyle2, composer3, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 905969664, 252);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(str, j, textStyle, function0, modifier, i);
        }
    }

    public static final void c(String str, long j, TextStyle textStyle, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(260914785);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(textStyle) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(5004770);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(str, 16);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            TextKt.b(str, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG), j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImpl, i3 | ((i2 << 3) & 896), (i2 << 12) & 3670016, 65528);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(str, j, textStyle, i);
        }
    }
}
