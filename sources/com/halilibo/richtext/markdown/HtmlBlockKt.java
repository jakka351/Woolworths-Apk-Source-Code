package com.halilibo.richtext.markdown;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Html_androidKt;
import com.halilibo.richtext.ui.RichTextScope;
import com.halilibo.richtext.ui.string.RichTextString;
import com.halilibo.richtext.ui.string.TextKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-markdown_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class HtmlBlockKt {
    public static final void a(RichTextScope richTextScope, String str, Composer composer, int i) {
        RichTextScope richTextScope2;
        Intrinsics.h(richTextScope, "<this>");
        ComposerImpl composerImplV = composer.v(-166034923);
        int i2 = (composerImplV.n(richTextScope) ? 4 : 2) | i | (composerImplV.n(str) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            richTextScope2 = richTextScope;
        } else {
            composerImplV.o(115231289);
            boolean z = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                RichTextString.Builder builder = new RichTextString.Builder();
                AnnotatedString.Builder withAnnotatedString = builder.f16306a;
                Intrinsics.h(withAnnotatedString, "$this$withAnnotatedString");
                int i3 = AnnotatedString.h;
                withAnnotatedString.d(Html_androidKt.a(str));
                objG = builder.d();
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            richTextScope2 = richTextScope;
            TextKt.a(richTextScope2, (RichTextString) objG, null, null, false, 0, 0, composerImplV, i2 & 14, 62);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.productcard.ui.components.b(richTextScope2, i, 8, str);
        }
    }
}
