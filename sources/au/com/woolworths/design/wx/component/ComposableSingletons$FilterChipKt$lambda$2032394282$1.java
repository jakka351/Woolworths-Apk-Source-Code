package au.com.woolworths.design.wx.component;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
/* renamed from: au.com.woolworths.design.wx.component.ComposableSingletons$FilterChipKt$lambda$-2032394282$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$FilterChipKt$lambda$2032394282$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
            Modifier modifierH = PaddingKt.h(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, 2);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            FilterChipKt.a(true, true, (Function0) objG, modifierH, roundedCornerShape, 0L, 0L, null, null, null, ComposableSingletons$FilterChipKt.e, composer, 3510, 48, 2016);
        }
        return Unit.f24250a;
    }
}
