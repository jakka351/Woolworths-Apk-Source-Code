package au.com.woolworths.design.core.ui.foundation.icon.common.location;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShareMyLocationKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4945a;

    public static final ImageVector a() {
        ImageVector imageVector = f4945a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-location-share-my-location", CollectionsKt.Q(new PathData("M6,23q-0.824,0 -1.412,-0.587A1.93,1.93 0,0 1,4 21L4,3q0,-0.824 0.588,-1.412A1.93,1.93 0,0 1,6 1h10q0.824,0 1.413,0.587Q18,2.176 18,3v4h-2L16,6L6,6v12h10v-1h2v4q0,0.824 -0.587,1.413A1.93,1.93 0,0 1,16 23zM6,20v1h10v-1zM14.95,13.2 L19.9,8.25a0.95,0.95 0,0 1,0.7 -0.275q0.425,0 0.7,0.275a0.95,0.95 0,0 1,0.275 0.7,0.95 0.95,0 0,1 -0.275,0.7l-5.65,5.65q-0.3,0.3 -0.7,0.3a0.96,0.96 0,0 1,-0.7 -0.3l-2.85,-2.85a0.95,0.95 0,0 1,-0.275 -0.7q0,-0.425 0.275,-0.7a0.95,0.95 0,0 1,0.7 -0.275q0.425,0 0.7,0.275zM6,4h10L16,3L6,3z", 0)));
        f4945a = imageVectorA;
        return imageVectorA;
    }
}
