package au.com.woolworths.product.composeui;

import android.content.res.Resources;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InstoreDetailsData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductAisleInfoKt$lambda$-360986746$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductAisleInfoKt$lambda$360986746$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductAisleInfoKt$lambda$360986746$1 d = new ComposableSingletons$ProductAisleInfoKt$lambda$360986746$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            float f = 10;
            ProductAisleInfoKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, new InstoreDetailsData("Isle 3 and some very long descriptive text lorem ipsum is very long indeed", InStoreLocationType.AVAILABLE), null, null, null, null, null, null, null, null, -131073, 3), PaddingKt.j(Modifier.Companion.d, f, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 10), false, composer, 48, 4);
        }
        return Unit.f24250a;
    }
}
