package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.runtime.Composer;
import au.com.woolworths.dynamic.page.utils.DynamicPageStubs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.dynamic.page.ui.content.ComposableSingletons$ScreenContentKt$lambda$-1941373821$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ScreenContentKt$lambda$1941373821$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ScreenContentKt.d(BitmapDescriptorFactory.HUE_RED, 48, 4, composer, null, DynamicPageStubs.DynamicPageFeedDataProvider.f5202a.f5185a.b);
        }
        return Unit.f24250a;
    }
}
