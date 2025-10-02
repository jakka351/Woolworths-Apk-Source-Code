package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$StandardPopUpUiKt$lambda$1005809531$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$StandardPopUpUiKt$lambda$1005809531$1 d = new ComposableSingletons$StandardPopUpUiKt$lambda$1005809531$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_cancel, 0, composer), StringResources_androidKt.c(composer, R.string.content_description_close_button), null, null, null, BitmapDescriptorFactory.HUE_RED, null, composer, 0, 124);
        }
        return Unit.f24250a;
    }
}
