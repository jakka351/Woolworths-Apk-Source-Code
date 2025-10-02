package au.com.woolworths.design.core.ui.component.stable.corerow;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.component.experimental.badge.BadgeVariant;
import au.com.woolworths.design.core.ui.component.stable.CheckBoxState;
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
/* loaded from: classes3.dex */
public final class ComposableSingletons$CheckboxRowKt$lambda$469610777$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CoreRowSpec.Image.LocalImage localImage = new CoreRowSpec.Image.LocalImage(CoreTheme.e(composer).e.c, null, BitmapDescriptorFactory.HUE_RED, 6);
            BadgeVariant[] badgeVariantArr = BadgeVariant.d;
            CoreRowSpec.TrailingDisplay.Badge badge = new CoreRowSpec.TrailingDisplay.Badge();
            CheckBoxState checkBoxState = CheckBoxState.d;
            CoreRowSpec.DividerType dividerType = CoreRowSpec.DividerType.e;
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new c(0);
                composer.A(objG);
            }
            composer.l();
            CheckboxRowKt.a("Title", checkBoxState, (Function1) objG, null, false, "Description", null, null, localImage, badge, dividerType, composer, 197046, 6, 216);
        }
        return Unit.f24250a;
    }
}
