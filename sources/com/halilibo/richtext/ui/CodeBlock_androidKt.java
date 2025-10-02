package com.halilibo.richtext.ui;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CodeBlock_androidKt {
    public static final void a(RichTextScope richTextScope, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Intrinsics.h(richTextScope, "<this>");
        ComposerImpl composerImplV = composer.v(407108909);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(richTextScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            if (z) {
                composerImplV.o(-1583170062);
                composableLambdaImpl.invoke(richTextScope, companion, composerImplV, Integer.valueOf((i2 & 896) | (i2 & 14) | 48));
                composerImplV.V(false);
            } else {
                composerImplV.o(-1583274904);
                composableLambdaImpl.invoke(richTextScope, ScrollKt.b(companion, ScrollKt.a(composerImplV), false), composerImplV, Integer.valueOf(i2 & 910));
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(richTextScope, z, composableLambdaImpl, i, 20);
        }
    }
}
