package au.com.woolworths.shop.aem.components.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ParagraphMarkdownKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ParagraphTextItemType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParagraphTextItemType paragraphTextItemType = ParagraphTextItemType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(ParagraphTextItemData paragraphTextItemData, Modifier modifier, Function2 function2, Composer composer, int i) {
        Function2 function22;
        ComposerImpl composerImplV = composer.v(-1093614605);
        int i2 = i | (composerImplV.n(paragraphTextItemData) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            function22 = function2;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(11);
                composerImplV.A(objG);
            }
            Function2 function23 = (Function2) objG;
            composerImplV.V(false);
            int iOrdinal = paragraphTextItemData.c.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(1749549849);
                MarkdownCompatKt.b(paragraphTextItemData.b, R.layout.content_page_html_text_content, modifier, new Color(WxTheme.a(composerImplV).h()), function23, null, composerImplV, ((i3 << 3) & 896) | 12779520, 72);
                composerImplV.V(false);
            } else if (iOrdinal != 1) {
                composerImplV.o(1750423522);
                composerImplV.V(false);
            } else {
                composerImplV.o(1749966055);
                MarkdownCompatKt.b(paragraphTextItemData.b, R.layout.content_page_method_caption, modifier, new Color(WxTheme.a(composerImplV).h()), function23, null, composerImplV, ((i3 << 3) & 896) | 12779520, 72);
                composerImplV.V(false);
            }
            function22 = function23;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(paragraphTextItemData, modifier, function22, i, 11);
        }
    }
}
