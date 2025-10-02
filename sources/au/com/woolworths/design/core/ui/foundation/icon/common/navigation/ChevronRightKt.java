package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChevronRightKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4962a;

    public static final ImageVector a() {
        ImageVector imageVector = f4962a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-chevron-right", CollectionsKt.Q(new PathData("M12.075,12 L8.338,8.1a0.97,0.97 0,0 1,-0.264 -0.7,0.97 0.97,0 0,1 0.264,-0.7 0.9,0.9 0,0 1,0.67 -0.275q0.408,0 0.671,0.275l4.409,4.6q0.144,0.15 0.203,0.325t0.06,0.375 -0.06,0.375a0.9,0.9 0,0 1,-0.203 0.325l-4.409,4.6a0.9,0.9 0,0 1,-0.67 0.275,0.9 0.9,0 0,1 -0.671,-0.275 0.97,0.97 0,0 1,-0.264 -0.7,0.97 0.97,0 0,1 0.264,-0.7z", 0)));
        f4962a = imageVectorA;
        return imageVectorA;
    }
}
