package au.com.woolworths.product.productmessagebottomsheet;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.compose.filter.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductMessageTitleRowKt {
    public static final void a(String title, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Intrinsics.h(title, "title");
        ComposerImpl composerImplV = composer.v(1026451871);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            InlineTextContentKt.a(builder, "inlineContent", "[icon]");
            builder.e(" ".concat(title));
            composerImpl = composerImplV;
            TextKt.c(builder.m(), SizeKt.e(Modifier.Companion.d, 1.0f), 0L, 0L, null, null, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, MapsKt.i(new Pair("inlineContent", new InlineTextContent(new Placeholder(TextUnitKt.c(20), TextUnitKt.c(20), 4), ComposableSingletons$ProductMessageTitleRowKt.f9331a))), null, WxTheme.b(composerImplV).i, composerImpl, 48, 0, 97788);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(title, i, 2, (byte) 0);
        }
    }
}
