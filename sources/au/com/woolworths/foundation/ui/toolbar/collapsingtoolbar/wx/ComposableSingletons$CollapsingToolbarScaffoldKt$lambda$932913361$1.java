package au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.wx;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.wx.ComposableSingletons$CollapsingToolbarScaffoldKt$lambda$-932913361$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$CollapsingToolbarScaffoldKt$lambda$932913361$1 implements Function3<Float, Composer, Integer, Unit> {
    public static final ComposableSingletons$CollapsingToolbarScaffoldKt$lambda$932913361$1 d = new ComposableSingletons$CollapsingToolbarScaffoldKt$lambda$932913361$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj).floatValue();
        Composer composer = (Composer) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && composer.c()) {
            composer.j();
        }
        return Unit.f24250a;
    }
}
