package au.com.woolworths.foundation.rewards.common.ui.tabrow;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.wx.foundation.WxTheme;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RewardsTabRowKt$PagerHeaderElement$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope Tab = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(Tab, "$this$Tab");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        TextStyle.a(WxTheme.b(composer).o, 0L, 0L, null, null, RewardsTabRowKt.f8600a, 0L, null, null, 0, 16777087);
        Locale locale = Locale.ROOT;
        throw null;
    }
}
