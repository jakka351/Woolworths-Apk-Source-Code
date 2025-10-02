package au.com.woolworths.shop.aem.components.ui.herobanner;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class HeroBannerKt$HeroBanner$3$5$1 implements Function1<Modifier, Modifier> {
    public static final HeroBannerKt$HeroBanner$3$5$1 d = new HeroBannerKt$HeroBanner$3$5$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Modifier conditional = (Modifier) obj;
        Intrinsics.h(conditional, "$this$conditional");
        return PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 44, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
    }
}
