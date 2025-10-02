package au.com.woolworths.foundation.rewards.common.ui.info;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.component.experimental.badge.a;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FeatureInfoTextItemUiKt {
    public static final void a(int i, Composer composer, final Modifier modifier, final String markdownContent) {
        Intrinsics.h(markdownContent, "markdownContent");
        ComposerImpl composerImplV = composer.v(1221473863);
        if ((((composerImplV.n(markdownContent) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(517684970, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.info.FeatureInfoTextItemUiKt$FeatureInfoTextItemUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        MarkdownCompatKt.b(markdownContent, R.layout.infotext_markdown, modifier, new Color(CoreTheme.b(composer2).f4782a.d.b.f4798a), null, null, composer2, 0, 232);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(markdownContent, modifier, i, 11);
        }
    }
}
