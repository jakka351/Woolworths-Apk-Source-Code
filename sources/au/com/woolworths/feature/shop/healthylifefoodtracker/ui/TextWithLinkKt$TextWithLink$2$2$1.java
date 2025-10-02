package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.VerticalAnchorable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class TextWithLinkKt$TextWithLink$2$2$1 implements Function1<ConstrainScope, Unit> {
    public static final TextWithLinkKt$TextWithLink$2$2$1 d = new TextWithLinkKt$TextWithLink$2$2$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstrainScope constrainAs = (ConstrainScope) obj;
        Intrinsics.h(constrainAs, "$this$constrainAs");
        VerticalAnchorable verticalAnchorable = constrainAs.f;
        ConstrainedLayoutReference constrainedLayoutReference = constrainAs.c;
        float f = 16;
        VerticalAnchorable.a(verticalAnchorable, constrainedLayoutReference.e, f, 4);
        HorizontalAnchorable.a(constrainAs.e, constrainedLayoutReference.d, f, 4);
        return Unit.f24250a;
    }
}
