package au.com.woolworths.markdown;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import com.halilibo.richtext.markdown.AstBlockNodeComposer;
import com.halilibo.richtext.markdown.node.AstBlockNodeType;
import com.halilibo.richtext.markdown.node.AstHeading;
import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.markdown.node.AstNodeType;
import com.halilibo.richtext.markdown.node.AstText;
import com.halilibo.richtext.ui.HeadingKt;
import com.halilibo.richtext.ui.RichTextScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/markdown/CoreAstBlockNodeComposer;", "Lcom/halilibo/richtext/markdown/AstBlockNodeComposer;", "markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CoreAstBlockNodeComposer implements AstBlockNodeComposer {
    @Override // com.halilibo.richtext.markdown.AstBlockNodeComposer
    public final boolean a(AstBlockNodeType astBlockNodeType) {
        return astBlockNodeType instanceof AstHeading;
    }

    @Override // com.halilibo.richtext.markdown.AstBlockNodeComposer
    public final void b(final RichTextScope richTextScope, final AstNode astNode, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        Intrinsics.h(richTextScope, "<this>");
        Intrinsics.h(astNode, "astNode");
        ComposerImpl composerImplV = composer.v(895609521);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(richTextScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(astNode) : composerImplV.I(astNode) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            AstNodeType astNodeType = astNode.f16260a;
            if (astNodeType instanceof AstHeading) {
                AstNode astNode2 = astNode.b.b;
                AstNodeType astNodeType2 = astNode2 != null ? astNode2.f16260a : null;
                AstText astText = astNodeType2 instanceof AstText ? (AstText) astNodeType2 : null;
                String str = astText != null ? astText.f16272a : null;
                if (str != null) {
                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
                    int i3 = composerImplV.P;
                    PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                    Modifier.Companion companion = Modifier.Companion.d;
                    Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
                    ComposeUiNode.e3.getClass();
                    Function0 function0 = ComposeUiNode.Companion.b;
                    composerImplV.i();
                    if (composerImplV.O) {
                        composerImplV.K(function0);
                    } else {
                        composerImplV.e();
                    }
                    Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                    Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                    Function2 function2 = ComposeUiNode.Companion.j;
                    if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                        b.B(i3, composerImplV, i3, function2);
                    }
                    Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                    SpacerKt.a(composerImplV, SizeKt.g(companion, 20));
                    HeadingKt.b(richTextScope, ((AstHeading) astNodeType).f16252a, str, composerImplV, i2 & 14);
                    composerImplV.V(true);
                }
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.markdown.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.d.b(richTextScope, astNode, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
