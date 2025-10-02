package au.com.woolworths.design.core.ui.component.stable.corerow;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.design.core.ui.component.stable.corerow.ComposableSingletons$SwitchRowKt$lambda$-1183387949$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$SwitchRowKt$lambda$1183387949$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CoreRowSpec.Image.LocalImage localImage = new CoreRowSpec.Image.LocalImage(CoreTheme.e(composer).c.c, null, BitmapDescriptorFactory.HUE_RED, 6);
            CoreRowSpec.TrailingDisplay.Text text = new CoreRowSpec.TrailingDisplay.Text("Count");
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.repository.b(10);
                composer.A(objG);
            }
            composer.l();
            SwitchRowKt.a("Title", false, (Function1) objG, null, null, "Overline", localImage, text, null, composer, 197046, 280);
        }
        return Unit.f24250a;
    }
}
