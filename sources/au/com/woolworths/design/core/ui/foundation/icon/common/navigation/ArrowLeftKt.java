package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ArrowLeftKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4950a;

    public static final ImageVector a() {
        ImageVector imageVector = f4950a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-arrow-left", CollectionsKt.Q(new PathData("m7.5,12.458 l4.695,4.696a0.88,0.88 0,0 1,0.275 0.671,0.97 0.97,0 0,1 -0.3,0.67 1,1 0,0 1,-0.67 0.276,0.88 0.88,0 0,1 -0.67,-0.275L4.503,12.17a0.84,0.84 0,0 1,-0.203 -0.312,1 1,0 0,1 -0.06,-0.359q0,-0.192 0.06,-0.36a0.84,0.84 0,0 1,0.203 -0.31l6.325,-6.326a0.9,0.9 0,0 1,0.66 -0.263q0.394,0 0.682,0.263 0.288,0.288 0.287,0.683a0.93,0.93 0,0 1,-0.287 0.683l-4.672,4.672h10.71q0.407,0 0.682,0.275a0.93,0.93 0,0 1,0.276 0.683q0,0.408 -0.276,0.683a0.93,0.93 0,0 1,-0.683 0.275z", 0)));
        f4950a = imageVectorA;
        return imageVectorA;
    }
}
