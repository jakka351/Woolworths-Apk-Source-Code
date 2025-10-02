package au.com.woolworths.shop.aem.components.ui.morecard;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.morecard.MoreCardData;
import au.com.woolworths.shop.aem.components.model.morecard.MoreCardStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$MoreCardKt$lambda$1762813085$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierR = SizeKt.r(Modifier.Companion.d, 220, DilithiumEngine.DilithiumPolyT1PackedBytes);
            MoreCardData moreCardData = new MoreCardData(MoreCardStyle.e, new ActionData("", ActionType.e, null, null));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.aem.components.ui.merchcard.a(5);
                composer.A(objG);
            }
            composer.l();
            MoreCardKt.a(moreCardData, "", (Function1) objG, modifierR, composer, 3504, 0);
        }
        return Unit.f24250a;
    }
}
