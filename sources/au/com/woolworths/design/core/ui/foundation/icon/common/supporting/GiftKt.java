package au.com.woolworths.design.core.ui.foundation.icon.common.supporting;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GiftKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5019a;

    public static final ImageVector a() {
        ImageVector imageVector = f5019a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-supporting-gift", CollectionsKt.Q(new PathData("M21,12v8a2,2 0,0 1,-2 2L5,22a2,2 0,0 1,-2 -2v-8a1,1 0,0 1,-1 -1L2,8a2,2 0,0 1,2 -2h2.17A3,3 0,0 1,9 2c1,0 1.88,0.5 2.43,1.24v-0.01L12,4l0.57,-0.77v0.01C13.12,2.5 14,2 15,2a3,3 0,0 1,2.83 4L20,6a2,2 0,0 1,2 2v3a1,1 0,0 1,-1 1M5,20h6v-8L5,12zM19,20v-8h-6v8zM9,4a1,1 0,1 0,0 2,1 1,0 0,0 0,-2m6,0a1,1 0,1 0,0 2,1 1,0 0,0 0,-2M4,8v2h7L11,8zM13,8v2h7L20,8z", 0)));
        f5019a = imageVectorA;
        return imageVectorA;
    }
}
