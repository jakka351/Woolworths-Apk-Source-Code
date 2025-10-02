package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SummaryParagraphTextKt {
    public static final void a(final String str, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-597717516);
        if ((((composerImplV.n(str) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-57820649, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryParagraphTextKt$SummaryParagraphText$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        MarkdownCompatKt.a(str, TestTagKt.a(PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), "paragraphText"), new MarkdownTextViewStyle((Density) composer2.x(CompositionLocalsKt.h), WxTheme.a(composer2).c(), WxTheme.b(composer2).l, (TextAlign) null, 24), null, false, new Color(CoreTheme.b(composer2).f4782a.d.b.f4798a), null, false, null, null, composer2, 48, 984);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.corerow.impl.b(str, i, 2);
        }
    }
}
