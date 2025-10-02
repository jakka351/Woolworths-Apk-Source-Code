package au.com.woolworths.shared.ui.compose.rewards;

import androidx.compose.runtime.Composer;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ContentCtaButtonKt$lambda$518433699$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ContentCtaButtonKt$lambda$518433699$1 d = new ComposableSingletons$ContentCtaButtonKt$lambda$518433699$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ContentCta contentCta = new ContentCta("Secondary Extern", "https://goo.gle/", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            ContentCtaButtonKt.d(contentCta, (Function0) objG, null, false, composer, 48, 12);
        }
        return Unit.f24250a;
    }
}
