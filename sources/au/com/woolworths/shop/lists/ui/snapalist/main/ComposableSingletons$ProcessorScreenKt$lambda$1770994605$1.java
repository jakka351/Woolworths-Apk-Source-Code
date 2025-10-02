package au.com.woolworths.shop.lists.ui.snapalist.main;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.lists.ui.snapalist.main.ComposableSingletons$ProcessorScreenKt$lambda$-1770994605$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProcessorScreenKt$lambda$1770994605$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProcessorScreenKt$lambda$1770994605$1 d = new ComposableSingletons$ProcessorScreenKt$lambda$1770994605$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope TextButton = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(TextButton, "$this$TextButton");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            TextKt.b(StringResources_androidKt.c(composer, R.string.shop_lists_snap_scanning_cancel), null, CoreTheme.b(composer).e.d.c.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer).e.b.b, composer, 0, 0, 65530);
        }
        return Unit.f24250a;
    }
}
