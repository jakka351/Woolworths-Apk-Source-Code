package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

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
/* loaded from: classes3.dex */
final class IconListItemKt$IconListItem$1$1$1 implements Function1<ConstrainScope, Unit> {
    public static final IconListItemKt$IconListItem$1$1$1 d = new IconListItemKt$IconListItem$1$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstrainScope constrainAs = (ConstrainScope) obj;
        Intrinsics.h(constrainAs, "$this$constrainAs");
        HorizontalAnchorable horizontalAnchorable = constrainAs.e;
        ConstrainedLayoutReference constrainedLayoutReference = constrainAs.c;
        HorizontalAnchorable.a(horizontalAnchorable, constrainedLayoutReference.d, BitmapDescriptorFactory.HUE_RED, 6);
        VerticalAnchorable.a(constrainAs.d, constrainedLayoutReference.c, BitmapDescriptorFactory.HUE_RED, 6);
        return Unit.f24250a;
    }
}
