package au.com.woolworths.design.core.ui.foundation.icon.common.social;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InstagramKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4997a;

    public static final ImageVector a() {
        ImageVector imageVector = f4997a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-social-instagram", CollectionsKt.R(new PathData("M15,12a3,3 0,1 1,-6 0,3 3,0 0,1 6,0", 0), new PathData("M2,7.7A5.7,5.7 0,0 1,7.7 2h8.6A5.7,5.7 0,0 1,22 7.7v8.6a5.7,5.7 0,0 1,-5.7 5.7L7.7,22A5.7,5.7 0,0 1,2 16.3zM18.5,6.75a1.25,1.25 0,1 1,-2.5 0,1.25 1.25,0 0,1 2.5,0M17,12a5,5 0,1 1,-10 0,5 5,0 0,1 10,0", 1)));
        f4997a = imageVectorA;
        return imageVectorA;
    }
}
