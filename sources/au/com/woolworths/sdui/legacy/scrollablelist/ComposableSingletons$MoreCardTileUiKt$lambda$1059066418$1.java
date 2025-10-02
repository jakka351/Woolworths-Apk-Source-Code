package au.com.woolworths.sdui.legacy.scrollablelist;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.deeplink.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$MoreCardTileUiKt$lambda$1059066418$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierG = SizeKt.g(Modifier.Companion.d, 260);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            MoreCardTileUiKt.a("", modifierG, null, BitmapDescriptorFactory.HUE_RED, (Function0) objG, composer, 24630, 12);
        }
        return Unit.f24250a;
    }
}
