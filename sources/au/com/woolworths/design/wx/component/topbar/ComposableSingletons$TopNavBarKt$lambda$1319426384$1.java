package au.com.woolworths.design.wx.component.topbar;

import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.design.wx.component.topbar.ComposableSingletons$TopNavBarKt$lambda$-1319426384$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$TopNavBarKt$lambda$1319426384$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            TopNavBarKt.b("Title", null, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, null, composer, 6, 0, 2046);
        }
        return Unit.f24250a;
    }
}
