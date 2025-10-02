package com.halilibo.richtext.markdown;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.ui.RichTextScope;
import com.halilibo.richtext.ui.TableKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-markdown_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RenderTableKt {
    public static final void a(RichTextScope richTextScope, AstNode node, Composer composer, int i) {
        int i2;
        RichTextScope richTextScope2;
        Intrinsics.h(richTextScope, "<this>");
        Intrinsics.h(node, "node");
        ComposerImpl composerImplV = composer.v(1246740314);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(richTextScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(node) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            richTextScope2 = richTextScope;
        } else {
            composerImplV.o(-1265661332);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new c(node, 0);
                composerImplV.A(objG);
            }
            Function1 function1 = (Function1) objG;
            composerImplV.V(false);
            composerImplV.o(-1265651420);
            boolean z2 = i3 == 32;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new c(node, 2);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            richTextScope2 = richTextScope;
            TableKt.a(richTextScope2, null, function1, (Function1) objG2, composerImplV, i2 & 14);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(richTextScope2, i, 17, node);
        }
    }
}
