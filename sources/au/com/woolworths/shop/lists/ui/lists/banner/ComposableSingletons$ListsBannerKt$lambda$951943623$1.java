package au.com.woolworths.shop.lists.ui.lists.banner;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ListsBannerKt$lambda$951943623$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ListsBannerKt$lambda$951943623$1 d = new ComposableSingletons$ListsBannerKt$lambda$951943623$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierG = PaddingKt.g(Modifier.Companion.d, 6, 1);
            String upperCase = StringResources_androidKt.c(composer, R.string.shop_lists_banner_label_new).toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            TextKt.b(upperCase, modifierG, WxTheme.a(composer).a(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composer).z, 0L, TextUnitKt.c(10), null, null, 0L, 0L, null, null, 0, 16777213), composer, 48, 0, 65528);
        }
        return Unit.f24250a;
    }
}
