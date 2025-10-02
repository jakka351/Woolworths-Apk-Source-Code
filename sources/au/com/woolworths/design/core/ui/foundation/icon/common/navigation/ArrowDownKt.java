package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ArrowDownKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4949a;

    public static final ImageVector a() {
        ImageVector imageVector = f4949a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-arrow-down", CollectionsKt.Q(new PathData("M10.542,15.501V4.791q0,-0.405 0.275,-0.682a0.93,0.93 0,0 1,0.683 -0.276q0.408,0 0.683,0.276a0.93,0.93 0,0 1,0.275 0.683V15.5l4.696,-4.696a0.88,0.88 0,0 1,0.671 -0.275q0.385,0.011 0.67,0.3 0.265,0.285 0.276,0.67a0.88,0.88 0,0 1,-0.275 0.67l-6.325,6.326a0.84,0.84 0,0 1,-0.311 0.204q-0.168,0.06 -0.36,0.06t-0.36,-0.06a0.84,0.84 0,0 1,-0.31 -0.204L4.503,12.17a0.9,0.9 0,0 1,-0.263 -0.659q0,-0.396 0.263,-0.683a0.93,0.93 0,0 1,0.683 -0.287q0.395,0 0.683,0.287z", 0)));
        f4949a = imageVectorA;
        return imageVectorA;
    }
}
