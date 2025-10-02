package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChevronUpKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4963a;

    public static final ImageVector a() {
        ImageVector imageVector = f4963a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-chevron-up", CollectionsKt.Q(new PathData("m11.5,10.775 l-3.738,3.9a0.9,0.9 0,0 1,-0.67 0.275,0.9 0.9,0 0,1 -0.671,-0.275 0.97,0.97 0,0 1,-0.264 -0.7,0.97 0.97,0 0,1 0.264,-0.7l4.408,-4.6q0.144,-0.15 0.312,-0.213A1,1 0,0 1,11.5 8.4q0.192,0 0.36,0.062a0.84,0.84 0,0 1,0.31 0.213l4.41,4.6a0.97,0.97 0,0 1,0.263 0.7,0.97 0.97,0 0,1 -0.264,0.7 0.9,0.9 0,0 1,-0.67 0.275,0.9 0.9,0 0,1 -0.672,-0.275z", 0)));
        f4963a = imageVectorA;
        return imageVectorA;
    }
}
