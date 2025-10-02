package au.com.woolworths.design.core.ui.foundation.elevation;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.color.CoreColorTokensKt;
import au.com.woolworths.design.core.ui.foundation.color.CoreColors;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CoreElevationTokensKt {

    /* renamed from: a, reason: collision with root package name */
    public static final CoreElevationTokens f4877a;

    static {
        float f = 0;
        CoreElevation coreElevation = new CoreElevation(f);
        CoreColors coreColors = CoreColorTokensKt.f4781a;
        long jB = Color.b(coreColors.e.f4848a.b.f4851a, 0.83f);
        CoreColors.Interface r3 = coreColors.e;
        f4877a = new CoreElevationTokens(coreElevation, new CoreElevation(jB, 2, Color.b(r3.f4848a.b.f4851a, 0.83f)), new CoreElevation(Color.b(r3.f4848a.b.f4851a, 0.65f), 4, Color.b(r3.f4848a.b.f4851a, 0.65f)), new CoreElevation(Color.b(r3.f4848a.b.f4851a, 0.65f), 6, Color.b(r3.f4848a.b.f4851a, 0.65f)), new CoreElevation(Color.b(r3.f4848a.b.f4851a, 0.65f), 8, Color.b(r3.f4848a.b.f4851a, 0.65f)));
        new CoreElevation(f);
        CoreColors coreColors2 = CoreColorTokensKt.c;
        Color.b(coreColors2.e.f4848a.b.f4851a, 0.83f);
        CoreColors.Interface r0 = coreColors2.e;
        Color.b(r0.f4848a.b.f4851a, 0.83f);
        Color.b(r0.f4848a.b.f4851a, 0.65f);
        Color.b(r0.f4848a.b.f4851a, 0.65f);
        Color.b(r0.f4848a.b.f4851a, 0.65f);
        Color.b(r0.f4848a.b.f4851a, 0.65f);
        Color.b(r0.f4848a.b.f4851a, 0.65f);
        Color.b(r0.f4848a.b.f4851a, 0.65f);
    }

    public static final CoreElevationTokens a(Composer composer) {
        composer.o(1945147531);
        CoreElevationTokens coreElevationTokens = new CoreElevationTokens(new CoreElevation(0), new CoreElevation(Color.b(CoreTheme.b(composer).e.f4848a.b.f4851a, 0.83f), 2, Color.b(CoreTheme.b(composer).e.f4848a.b.f4851a, 0.83f)), new CoreElevation(Color.b(CoreTheme.b(composer).e.f4848a.b.f4851a, 0.65f), 4, Color.b(CoreTheme.b(composer).e.f4848a.b.f4851a, 0.65f)), new CoreElevation(Color.b(CoreTheme.b(composer).e.f4848a.b.f4851a, 0.65f), 6, Color.b(CoreTheme.b(composer).e.f4848a.b.f4851a, 0.65f)), new CoreElevation(Color.b(CoreTheme.b(composer).e.f4848a.b.f4851a, 0.65f), 8, Color.b(CoreTheme.b(composer).e.f4848a.b.f4851a, 0.65f)));
        composer.l();
        return coreElevationTokens;
    }
}
