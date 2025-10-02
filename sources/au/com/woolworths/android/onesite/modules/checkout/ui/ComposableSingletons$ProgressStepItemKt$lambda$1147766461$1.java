package au.com.woolworths.android.onesite.modules.checkout.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import au.com.woolworths.shop.checkout.domain.model.ProgressStep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProgressStepItemKt$lambda$1147766461$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProgressStepItemKt$lambda$1147766461$1 d = new ComposableSingletons$ProgressStepItemKt$lambda$1147766461$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProgressStepItemKt.a(new ProgressStep(ProgressId.g, "4", "Pay", new PlainText("4"), false), null, composer, 0);
        }
        return Unit.f24250a;
    }
}
