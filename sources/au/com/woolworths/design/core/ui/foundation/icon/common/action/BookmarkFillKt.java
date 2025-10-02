package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BookmarkFillKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4899a;

    public static final ImageVector a() {
        ImageVector imageVector = f4899a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-bookmark-fill", CollectionsKt.Q(new PathData("m12,18 l-4.2,1.8q-1,0.426 -1.9,-0.163 -0.9,-0.587 -0.9,-1.662V5q0,-0.824 0.588,-1.412A1.93,1.93 0,0 1,7 3h10q0.824,0 1.413,0.587Q19,4.176 19,5v12.975q0,1.075 -0.9,1.662 -0.9,0.588 -1.9,0.163z", 0)));
        f4899a = imageVectorA;
        return imageVectorA;
    }
}
