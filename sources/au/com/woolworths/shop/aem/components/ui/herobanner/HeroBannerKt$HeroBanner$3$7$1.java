package au.com.woolworths.shop.aem.components.ui.herobanner;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HeroBannerKt$HeroBanner$3$7$1 implements Function1<ConstrainScope, Unit> {
    public static final HeroBannerKt$HeroBanner$3$7$1 d = new HeroBannerKt$HeroBanner$3$7$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstrainScope constrainAs = (ConstrainScope) obj;
        Intrinsics.h(constrainAs, "$this$constrainAs");
        HorizontalAnchorable.a(constrainAs.g, constrainAs.c.f, BitmapDescriptorFactory.HUE_RED, 6);
        return Unit.f24250a;
    }
}
