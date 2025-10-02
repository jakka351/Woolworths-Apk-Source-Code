package au.com.woolworths.design.core.ui.foundation.icon.common.services;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LeaveUnattendedKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4993a;

    public static final ImageVector a() {
        ImageVector imageVector = f4993a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-services-leave-unattended", CollectionsKt.R(new PathData("M10,11a1,1 0,0 1,1 1v1a1,1 0,1 1,-2 0v-1a1,1 0,0 1,1 -1", 0), new PathData("M18,2a1,1 0,0 1,1 1v17h2a1,1 0,1 1,0 2H3a1,1 0,1 1,0 -2h2V3a1,1 0,0 1,1 -1zM7,20h10V4H7z", 1)));
        f4993a = imageVectorA;
        return imageVectorA;
    }
}
