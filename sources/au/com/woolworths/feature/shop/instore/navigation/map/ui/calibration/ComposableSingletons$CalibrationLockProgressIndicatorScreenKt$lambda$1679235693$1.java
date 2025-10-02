package au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$CalibrationLockProgressIndicatorScreenKt$lambda$1679235693$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$CalibrationLockProgressIndicatorScreenKt$lambda$1679235693$1 d = new ComposableSingletons$CalibrationLockProgressIndicatorScreenKt$lambda$1679235693$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope TextButton = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(TextButton, "$this$TextButton");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            TextKt.b(StringResources_androidKt.c(composer, R.string.dismiss), null, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer).l, composer, 0, 0, 65022);
        }
        return Unit.f24250a;
    }
}
