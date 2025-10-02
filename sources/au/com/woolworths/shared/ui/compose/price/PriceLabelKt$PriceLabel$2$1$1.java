package au.com.woolworths.shared.ui.compose.price;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PriceLabelKt$PriceLabel$2$1$1 implements Function1<ConstrainScope, Unit> {
    public static final PriceLabelKt$PriceLabel$2$1$1 d = new PriceLabelKt$PriceLabel$2$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstrainScope constrainAs = (ConstrainScope) obj;
        Intrinsics.h(constrainAs, "$this$constrainAs");
        VerticalAnchorable verticalAnchorable = constrainAs.d;
        ConstrainedLayoutReference constrainedLayoutReference = constrainAs.c;
        VerticalAnchorable.a(verticalAnchorable, constrainedLayoutReference.c, BitmapDescriptorFactory.HUE_RED, 6);
        HorizontalAnchorable.a(constrainAs.e, constrainedLayoutReference.d, BitmapDescriptorFactory.HUE_RED, 6);
        return Unit.f24250a;
    }
}
