package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.modeselector.ui.ComposableSingletons$ModeSelectorScreenKt$lambda$-1629483582$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ModeSelectorScreenKt$lambda$1629483582$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ModeSelectorScreenKt$lambda$1629483582$1 d = new ComposableSingletons$ModeSelectorScreenKt$lambda$1629483582$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope TextButton = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(TextButton, "$this$TextButton");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            String upperCase = StringResources_androidKt.c(composer, R.string.mode_selector_error_response_dialog_cancel).toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
        }
        return Unit.f24250a;
    }
}
