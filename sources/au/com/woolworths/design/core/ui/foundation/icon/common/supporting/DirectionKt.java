package au.com.woolworths.design.core.ui.foundation.icon.common.supporting;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DirectionKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5017a;

    public static final ImageVector a() {
        ImageVector imageVector = f5017a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-supporting-direction", CollectionsKt.Q(new PathData("M10,12h3.5v1.3q0,0.35 0.3,0.475t0.55,-0.125l1.95,-1.95q0.3,-0.3 0.3,-0.7t-0.3,-0.7l-1.95,-1.95q-0.25,-0.25 -0.55,-0.125t-0.3,0.475L13.5,10L9,10a0.97,0.97 0,0 0,-0.713 0.287A0.97,0.97 0,0 0,8 11v3q0,0.424 0.287,0.713Q8.576,15 9,15t0.713,-0.287A0.97,0.97 0,0 0,10 14zM12,22q-0.375,0 -0.738,-0.15 -0.362,-0.15 -0.662,-0.45l-8,-8q-0.3,-0.3 -0.45,-0.662T2,12t0.15,-0.738 0.45,-0.662l8,-8q0.3,-0.3 0.662,-0.45T12,2t0.738,0.15 0.662,0.45l8,8q0.3,0.3 0.45,0.662T22,12t-0.15,0.738 -0.45,0.662l-8,8q-0.3,0.3 -0.662,0.45T12,22m-4,-6 l4,4 8,-8 -8,-8 -8,8z", 0)));
        f5017a = imageVectorA;
        return imageVectorA;
    }
}
