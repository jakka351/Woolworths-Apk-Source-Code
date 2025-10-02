package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.wx.component.SurfaceKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shared.instore.wifi.ui.ComposableSingletons$InstoreWifiScreenKt$lambda$-1015754688$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$InstoreWifiScreenKt$lambda$1015754688$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableSingletons$InstoreWifiScreenKt.f, composer, 1572864, 63);
        }
        return Unit.f24250a;
    }
}
