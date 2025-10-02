package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ArrowUpKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4952a;

    public static final ImageVector a() {
        ImageVector imageVector = f4952a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-arrow-up", CollectionsKt.Q(new PathData("m11,7.499 l-4.9,4.696a0.94,0.94 0,0 1,-0.7 0.275,1.03 1.03,0 0,1 -0.7,-0.3 1,1 0,0 1,-0.287 -0.67,0.86 0.86,0 0,1 0.287,-0.67l6.6,-6.326a0.9,0.9 0,0 1,0.325 -0.203q0.176,-0.06 0.375,-0.06 0.2,0 0.375,0.06t0.325,0.203l6.6,6.325a0.88,0.88 0,0 1,0.275 0.66,0.95 0.95,0 0,1 -0.275,0.682 1,1 0,0 1,-0.712 0.287,1 1,0 0,1 -0.713,-0.287L13,7.499v10.71q0,0.406 -0.287,0.682a1,1 0,0 1,-0.713 0.276,1 1,0 0,1 -0.712,-0.276 0.9,0.9 0,0 1,-0.288 -0.683z", 0)));
        f4952a = imageVectorA;
        return imageVectorA;
    }
}
