package com.halilibo.richtext.markdown;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.ui.RichTextScope;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-markdown_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BasicMarkdownKt {

    /* renamed from: a, reason: collision with root package name */
    public static final BasicMarkdownKt$DefaultAstNodeComposer$1 f16244a = new BasicMarkdownKt$DefaultAstNodeComposer$1();

    public static final void a(RichTextScope richTextScope, AstNode astNode, AstBlockNodeComposer astBlockNodeComposer, Composer composer, int i) {
        int i2;
        Intrinsics.h(richTextScope, "<this>");
        Intrinsics.h(astNode, "astNode");
        ComposerImpl composerImplV = composer.v(-928065917);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(richTextScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(astNode) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? composerImplV.n(astBlockNodeComposer) : composerImplV.I(astBlockNodeComposer) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            b(richTextScope, astNode, astBlockNodeComposer, composerImplV, i2 & 1022);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(richTextScope, astNode, astBlockNodeComposer, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.halilibo.richtext.ui.RichTextScope r7, com.halilibo.richtext.markdown.node.AstNode r8, final com.halilibo.richtext.markdown.AstBlockNodeComposer r9, androidx.compose.runtime.Composer r10, int r11) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.halilibo.richtext.markdown.BasicMarkdownKt.b(com.halilibo.richtext.ui.RichTextScope, com.halilibo.richtext.markdown.node.AstNode, com.halilibo.richtext.markdown.AstBlockNodeComposer, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(RichTextScope richTextScope, AstNode astNode, AstBlockNodeComposer astBlockNodeComposer, Composer composer, int i) {
        int i2;
        Intrinsics.h(richTextScope, "<this>");
        ComposerImpl composerImplV = composer.v(1194519785);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(richTextScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(astNode) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? composerImplV.n(astBlockNodeComposer) : composerImplV.I(astBlockNodeComposer) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Sequence sequenceA = astNode != null ? TraverseUtilsKt.a(astNode, false) : null;
            if (sequenceA != null) {
                Iterator f24664a = sequenceA.getF24664a();
                while (f24664a.hasNext()) {
                    b(richTextScope, (AstNode) f24664a.next(), astBlockNodeComposer, composerImplV, i2 & 910);
                }
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(richTextScope, astNode, astBlockNodeComposer, i, 1);
        }
    }
}
