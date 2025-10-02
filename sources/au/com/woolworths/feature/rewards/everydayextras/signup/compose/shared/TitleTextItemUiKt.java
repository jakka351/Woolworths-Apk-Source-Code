package au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.corerow.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TitleTextItemUiKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(int r23, int r24, androidx.compose.runtime.Composer r25, androidx.compose.ui.Modifier r26, java.lang.String r27) {
        /*
            r0 = r27
            java.lang.String r1 = "text"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            r1 = -920568208(0xffffffffc9213e70, float:-660455.0)
            r2 = r25
            androidx.compose.runtime.ComposerImpl r1 = r2.v(r1)
            boolean r2 = r1.n(r0)
            if (r2 == 0) goto L18
            r2 = 4
            goto L19
        L18:
            r2 = 2
        L19:
            r2 = r23 | r2
            r3 = r24 & 2
            if (r3 == 0) goto L24
            r2 = r2 | 48
        L21:
            r4 = r26
            goto L36
        L24:
            r4 = r23 & 48
            if (r4 != 0) goto L21
            r4 = r26
            boolean r5 = r1.n(r4)
            if (r5 == 0) goto L33
            r5 = 32
            goto L35
        L33:
            r5 = 16
        L35:
            r2 = r2 | r5
        L36:
            r5 = r2 & 19
            r6 = 18
            if (r5 != r6) goto L4a
            boolean r5 = r1.c()
            if (r5 != 0) goto L43
            goto L4a
        L43:
            r1.j()
            r19 = r1
            r2 = r4
            goto L8c
        L4a:
            if (r3 == 0) goto L4f
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion.d
            goto L50
        L4f:
            r3 = r4
        L50:
            au.com.woolworths.design.wx.foundation.WxTypography r4 = au.com.woolworths.design.wx.foundation.WxTheme.b(r1)
            androidx.compose.ui.text.TextStyle r5 = r4.v
            androidx.compose.ui.text.font.FontWeight r10 = androidx.compose.ui.text.font.FontWeight.k
            r18 = 0
            r19 = 16777211(0xfffffb, float:2.350988E-38)
            r6 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            androidx.compose.ui.text.TextStyle r18 = androidx.compose.ui.text.TextStyle.a(r5, r6, r8, r10, r11, r12, r14, r16, r17, r18, r19)
            r20 = r2 & 126(0x7e, float:1.77E-43)
            r21 = 0
            r22 = 65532(0xfffc, float:9.183E-41)
            r19 = r1
            r1 = r3
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            androidx.compose.material.TextKt.b(r0, r1, r2, r4, r6, r7, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = r1
        L8c:
            androidx.compose.runtime.RecomposeScopeImpl r6 = r19.X()
            if (r6 == 0) goto La0
            au.com.woolworths.feature.product.list.compose.productsearch.f r0 = new au.com.woolworths.feature.product.list.compose.productsearch.f
            r5 = 4
            r3 = r23
            r4 = r24
            r1 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.TitleTextItemUiKt.a(int, int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, java.lang.String):void");
    }

    public static final void b(String text, Composer composer, int i) {
        Intrinsics.h(text, "text");
        ComposerImpl composerImplV = composer.v(657857415);
        int i2 = (composerImplV.n(text) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            a((i2 & 14) | 48, 0, composerImplV, PaddingKt.f(SizeKt.e(Modifier.Companion.d, 1.0f), 16), text);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(text, i, 1);
        }
    }
}
