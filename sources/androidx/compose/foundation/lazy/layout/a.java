package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return Intrinsics.j(((LazyLayoutMeasuredItem) obj).getF1015a(), ((LazyLayoutMeasuredItem) obj2).getF1015a());
            case 1:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.V;
                float f = layoutNode.L.p.I;
                float f2 = layoutNode2.L.p.I;
                return f == f2 ? Intrinsics.j(layoutNode.L(), layoutNode2.L()) : Float.compare(f, f2);
            case 2:
                String str = (String) obj2;
                Intrinsics.e(str);
                return ((String) obj).compareTo(str);
            default:
                Charset charset = CrashlyticsReportPersistence.e;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    }
}
