package androidx.compose.ui.scrollcapture;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ScrollCapture_androidKt {
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public static final void a(SemanticsNode semanticsNode, int i, Function1 function1) {
        SemanticsNode semanticsNode2;
        MutableVector mutableVector = new MutableVector(new SemanticsNode[16], 0);
        List listG = semanticsNode.g(false, false);
        while (true) {
            mutableVector.e(mutableVector.f, listG);
            while (true) {
                int i2 = mutableVector.f;
                if (i2 == 0) {
                    return;
                }
                semanticsNode2 = (SemanticsNode) mutableVector.l(i2 - 1);
                boolean zE = SemanticsUtils_androidKt.e(semanticsNode2);
                SemanticsConfiguration semanticsConfiguration = semanticsNode2.d;
                if (!zE) {
                    if (semanticsConfiguration.d.c(SemanticsProperties.i)) {
                        continue;
                    } else {
                        NodeCoordinator nodeCoordinatorC = semanticsNode2.c();
                        if (nodeCoordinatorC == null) {
                            InlineClassHelperKt.c("Expected semantics node to have a coordinator.");
                            throw new KotlinNothingValueException();
                        }
                        IntRect intRectB = IntRectKt.b(LayoutCoordinatesKt.b(nodeCoordinatorC));
                        if (intRectB.f2201a < intRectB.c && intRectB.b < intRectB.d) {
                            Function2 function2 = (Function2) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsActions.e);
                            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.t);
                            if (function2 == null || scrollAxisRange == null || ((Number) scrollAxisRange.b.invoke()).floatValue() <= BitmapDescriptorFactory.HUE_RED) {
                                break;
                            }
                            int i3 = i + 1;
                            ((ScrollCapture$onScrollCaptureSearch$1) function1).invoke(new ScrollCaptureCandidate(semanticsNode2, i3, intRectB, nodeCoordinatorC));
                            a(semanticsNode2, i3, function1);
                        }
                    }
                }
            }
            listG = semanticsNode2.g(false, false);
        }
    }
}
