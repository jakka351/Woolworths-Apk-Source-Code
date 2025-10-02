package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class LockToggleKt$LockTogglePreview$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        composer.o(1849434622);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = new au.com.woolworths.android.onesite.repository.b(10);
            composer.A(objG);
        }
        composer.l();
        float f = 16;
        LockToggleKt.a(null, (Function1) objG, PaddingKt.h(PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, f, 5), f, BitmapDescriptorFactory.HUE_RED, 2), composer, PreferenceToggleData.$stable | 432);
        throw null;
    }
}
