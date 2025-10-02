package au.com.woolworths.design.core.ui.foundation.icon.common.payment;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EReceiptKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4979a;

    public static final ImageVector a() {
        ImageVector imageVector = f4979a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-payment-e-receipt", CollectionsKt.R(new PathData("M9,8a1,1 0,0 0,0 2h6a1,1 0,1 0,0 -2zM9,13a1,1 0,1 0,0 2h6a1,1 0,1 0,0 -2z", 0), new PathData("M5,2a2,2 0,0 0,-2 2v15.538a1.5,1.5 0,0 0,1.738 1.481l6.133,-0.985 4.289,1.849a2,2 0,0 0,1.74 -0.076l3.049,-1.643A2,2 0,0 0,21 18.403L21,4a2,2 0,0 0,-2 -2zM5,4h14v14.403l-3.049,1.643 -4.822,-2.08L5,18.952z", 1)));
        f4979a = imageVectorA;
        return imageVectorA;
    }
}
