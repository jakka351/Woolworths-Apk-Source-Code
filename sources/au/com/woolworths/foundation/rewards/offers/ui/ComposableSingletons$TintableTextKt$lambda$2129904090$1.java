package au.com.woolworths.foundation.rewards.offers.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.foundation.rewards.offers.ui.ComposableSingletons$TintableTextKt$lambda$-2129904090$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$TintableTextKt$lambda$2129904090$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            TintableTextKt.a(new TintableTextSpec("Completed", WxTheme.b(composer).s, WxTheme.a(composer).h(), 0, 0, 56), BackgroundKt.b(ClipKt.a(Modifier.Companion.d, RoundedCornerShapeKt.b(4)), WxTheme.a(composer).a(), RectangleShapeKt.f1779a), composer, 0);
        }
        return Unit.f24250a;
    }
}
