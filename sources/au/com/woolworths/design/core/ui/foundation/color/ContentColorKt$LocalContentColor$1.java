package au.com.woolworths.design.core.ui.foundation.color;

import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.foundation.CoreThemeDefaults;
import au.com.woolworths.design.core.ui.foundation.CoreThemeDefaultsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentColorKt$LocalContentColor$1 implements Function0<Color> {
    public static final ContentColorKt$LocalContentColor$1 d = new ContentColorKt$LocalContentColor$1();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CoreThemeDefaultsKt.a();
        return new Color(CoreThemeDefaults.f4772a.e.d.d);
    }
}
