package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class XMarkKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4931a;

    public static final ImageVector a() {
        ImageVector imageVector = f4931a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-x-mark", CollectionsKt.Q(new PathData("m12,13.4 l-4.9,4.9a0.95,0.95 0,0 1,-0.7 0.275,0.95 0.95,0 0,1 -0.7,-0.275 0.95,0.95 0,0 1,-0.275 -0.7q0,-0.425 0.275,-0.7l4.9,-4.9 -4.9,-4.9a0.95,0.95 0,0 1,-0.275 -0.7q0,-0.425 0.275,-0.7a0.95,0.95 0,0 1,0.7 -0.275q0.425,0 0.7,0.275l4.9,4.9 4.9,-4.9a0.95,0.95 0,0 1,0.7 -0.275q0.425,0 0.7,0.275a0.95,0.95 0,0 1,0.275 0.7,0.95 0.95,0 0,1 -0.275,0.7L13.4,12l4.9,4.9a0.95,0.95 0,0 1,0.275 0.7,0.95 0.95,0 0,1 -0.275,0.7 0.95,0.95 0,0 1,-0.7 0.275,0.95 0.95,0 0,1 -0.7,-0.275z", 0)));
        f4931a = imageVectorA;
        return imageVectorA;
    }
}
