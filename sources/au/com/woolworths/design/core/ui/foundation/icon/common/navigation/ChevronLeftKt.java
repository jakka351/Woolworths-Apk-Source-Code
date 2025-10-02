package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChevronLeftKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4961a;

    public static final ImageVector a() {
        ImageVector imageVector = f4961a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-chevron-left", CollectionsKt.Q(new PathData("m10.35,12 l3.738,3.9a0.97,0.97 0,0 1,0.263 0.7,0.97 0.97,0 0,1 -0.263,0.7 0.9,0.9 0,0 1,-0.671 0.275,0.9 0.9,0 0,1 -0.67,-0.275l-4.41,-4.6a0.9,0.9 0,0 1,-0.203 -0.325,1.2 1.2,0 0,1 -0.06,-0.375q0,-0.2 0.06,-0.375a0.9,0.9 0,0 1,0.204 -0.325l4.408,-4.6a0.9,0.9 0,0 1,0.67 -0.275q0.408,0 0.672,0.275a0.97,0.97 0,0 1,0.263 0.7,0.97 0.97,0 0,1 -0.263,0.7z", 0)));
        f4961a = imageVectorA;
        return imageVectorA;
    }
}
