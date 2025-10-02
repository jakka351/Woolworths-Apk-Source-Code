package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChevronDownKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4960a;

    public static final ImageVector a() {
        ImageVector imageVector = f4960a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-chevron-down", CollectionsKt.Q(new PathData("M11.5,14.95a1,1 0,0 1,-0.36 -0.063,0.84 0.84,0 0,1 -0.31,-0.212l-4.41,-4.6a0.97,0.97 0,0 1,-0.263 -0.7,0.97 0.97,0 0,1 0.264,-0.7 0.9,0.9 0,0 1,0.67 -0.275q0.408,0 0.671,0.275l3.738,3.9 3.737,-3.9a0.9,0.9 0,0 1,0.671 -0.275q0.407,0 0.671,0.275a0.97,0.97 0,0 1,0.264 0.7,0.97 0.97,0 0,1 -0.264,0.7l-4.408,4.6a0.84,0.84 0,0 1,-0.312 0.212,1 1,0 0,1 -0.36,0.063", 0)));
        f4960a = imageVectorA;
        return imageVectorA;
    }
}
