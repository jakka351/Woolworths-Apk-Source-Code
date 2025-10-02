package au.com.woolworths.design.core.ui.foundation.icon.common.social;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FacebookKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4996a;

    public static final ImageVector a() {
        ImageVector imageVector = f4996a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-social-facebook", CollectionsKt.Q(new PathData("M12,2.04c-5.5,0 -10,4.49 -10,10.02 0,5 3.66,9.15 8.44,9.9v-7H7.9v-2.9h2.54V9.85c0,-2.51 1.49,-3.89 3.78,-3.89 1.09,0 2.23,0.19 2.23,0.19v2.47h-1.26c-1.24,0 -1.63,0.77 -1.63,1.56v1.88h2.78l-0.45,2.9h-2.33v7a10,10 0,0 0,8.44 -9.9c0,-5.53 -4.5,-10.02 -10,-10.02", 0)));
        f4996a = imageVectorA;
        return imageVectorA;
    }
}
