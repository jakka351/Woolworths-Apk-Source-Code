package au.com.woolworths.foundation.shop.olive.voice.ui.permission;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.foundation.shop.olive.voice.ui.permission.ComposableSingletons$PermissionRationaleContentKt$lambda$-268252734$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$PermissionRationaleContentKt$lambda$268252734$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$PermissionRationaleContentKt$lambda$268252734$1 d = new ComposableSingletons$PermissionRationaleContentKt$lambda$268252734$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope TextButton = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(TextButton, "$this$TextButton");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            long j = CoreTheme.b(composer).f4782a.d.c.f4800a;
            String upperCase = StringResources_androidKt.c(composer, R.string.olive_voice_permission_action_secondary).toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            TextKt.a(upperCase, CoreTheme.f(composer).f5120a.b.b, null, j, null, 0, 0, false, 0, null, composer, 0, 1012);
        }
        return Unit.f24250a;
    }
}
