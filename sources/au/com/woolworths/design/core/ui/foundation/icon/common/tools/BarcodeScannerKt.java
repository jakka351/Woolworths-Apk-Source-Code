package au.com.woolworths.design.core.ui.foundation.icon.common.tools;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BarcodeScannerKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5031a;

    public static final ImageVector a() {
        ImageVector imageVector = f5031a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-tools-barcode-scanner", CollectionsKt.Q(new PathData("M1,21v-5h2v3h3v2zM18,21v-2h3v-3h2v5zM4,18L4,6h2v12zM7,18L7,6h1v12zM10,18L10,6h2v12zM13,18L13,6h3v12zM17,18L17,6h1v12zM19,18L19,6h1v12zM1,8L1,3h5v2L3,5v3zM21,8L21,5h-3L18,3h5v5z", 0)));
        f5031a = imageVectorA;
        return imageVectorA;
    }
}
