package au.com.woolworths.design.core.ui.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.design.core.ui.foundation.color.BrandColors;
import au.com.woolworths.design.core.ui.foundation.color.CoreColors;
import au.com.woolworths.design.core.ui.foundation.color.CoreThemeColorsKt;
import au.com.woolworths.design.core.ui.foundation.color.ExtendedColors;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevationTokens;
import au.com.woolworths.design.core.ui.foundation.elevation.LocalCoreElevationKt;
import au.com.woolworths.design.core.ui.foundation.icon.CoreIcons;
import au.com.woolworths.design.core.ui.foundation.icon.LocalCoreIconsKt;
import au.com.woolworths.design.core.ui.foundation.typography.CoreTypographyKt;
import au.com.woolworths.design.core.ui.foundation.typography.CoreTypographyTokens;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/CoreTheme;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CoreTheme {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4771a;

    public static BrandColors a(Composer composer) {
        return (BrandColors) composer.x(CoreThemeColorsKt.c);
    }

    public static CoreColors b(Composer composer) {
        return (CoreColors) composer.x(CoreThemeColorsKt.f4871a);
    }

    public static CoreElevationTokens c(Composer composer) {
        return (CoreElevationTokens) composer.x(LocalCoreElevationKt.f4878a);
    }

    public static ExtendedColors d(Composer composer) {
        return (ExtendedColors) composer.x(CoreThemeColorsKt.b);
    }

    public static CoreIcons e(Composer composer) {
        return (CoreIcons) composer.x(LocalCoreIconsKt.f4894a);
    }

    public static CoreTypographyTokens f(Composer composer) {
        return (CoreTypographyTokens) composer.x(CoreTypographyKt.f5119a);
    }
}
