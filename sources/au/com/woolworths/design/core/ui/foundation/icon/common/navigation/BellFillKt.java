package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BellFillKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4954a;

    public static final ImageVector a() {
        ImageVector imageVector = f4954a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-bell-fill", CollectionsKt.Q(new PathData("M5,18.208a1,1 0,0 1,-0.713 -0.275A0.9,0.9 0,0 1,4 17.25q0,-0.407 0.287,-0.683A1,1 0,0 1,5 16.292h1L6,9.583Q6,7.596 7.25,6.05t3.25,-2.025v-0.67q0,-0.6 0.438,-1.02 0.437,-0.418 1.062,-0.418 0.624,0 1.063,0.419 0.437,0.42 0.437,1.018v0.671q2,0.48 3.25,2.024A5.46,5.46 0,0 1,18 9.583v6.709h1a1,1 0,0 1,0.712 0.275,0.9 0.9,0 0,1 0.288,0.683q0,0.407 -0.288,0.683a1,1 0,0 1,-0.712 0.275zM12,21.083q-0.825,0 -1.412,-0.563A1.8,1.8 0,0 1,10 19.167h4q0,0.79 -0.588,1.353a1.97,1.97 0,0 1,-1.412 0.563", 0)));
        f4954a = imageVectorA;
        return imageVectorA;
    }
}
