package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CaretDownKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4956a;

    public static final ImageVector a() {
        ImageVector imageVector = f4956a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-caret-down", CollectionsKt.Q(new PathData("M12.078,15.225a0.72,0.72 0,0 1,-1.065 0L6.12,9.826a0.719,0.719 0,0 1,0.533 -1.201h9.784c0.624,0 0.952,0.74 0.533,1.201z", 0)));
        f4956a = imageVectorA;
        return imageVectorA;
    }
}
