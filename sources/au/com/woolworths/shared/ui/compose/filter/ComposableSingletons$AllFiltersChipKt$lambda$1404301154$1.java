package au.com.woolworths.shared.ui.compose.filter;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$AllFiltersChipKt$lambda$1404301154$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AllFiltersChipKt$lambda$1404301154$1 d = new ComposableSingletons$AllFiltersChipKt$lambda$1404301154$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.b(KeyboardArrowDownKt.a(), null, SizeKt.q(Modifier.Companion.d, 14), WxTheme.a(composer).h(), composer, 432, 0);
        }
        return Unit.f24250a;
    }
}
