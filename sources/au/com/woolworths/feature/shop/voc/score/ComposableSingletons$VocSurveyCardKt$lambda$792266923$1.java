package au.com.woolworths.feature.shop.voc.score;

import androidx.compose.runtime.Composer;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.feature.shop.voc.utils.VocSurveyTestDataKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.voc.score.ComposableSingletons$VocSurveyCardKt$lambda$-792266923$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$VocSurveyCardKt$lambda$792266923$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            VocSurveyCardKt.j(VocSurveyTestDataKt.a("Thanks, let us know more about your response in the feedback", "It will only take a minute.", ButtonStyleApiData.PRIMARY), null, null, null, null, null, null, composer, 0, 126);
        }
        return Unit.f24250a;
    }
}
