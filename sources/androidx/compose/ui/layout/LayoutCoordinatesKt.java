package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    public static final Rect a(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesE = layoutCoordinates.E();
        return layoutCoordinatesE != null ? layoutCoordinatesE.D(layoutCoordinates, true) : new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (layoutCoordinates.a() >> 32), (int) (layoutCoordinates.a() & 4294967295L));
    }

    public static final Rect b(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesC = c(layoutCoordinates);
        float fA = (int) (layoutCoordinatesC.a() >> 32);
        float fA2 = (int) (layoutCoordinatesC.a() & 4294967295L);
        Rect rectD = layoutCoordinatesC.D(layoutCoordinates, true);
        float f = rectD.f1752a;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        if (f > fA) {
            f = fA;
        }
        float f3 = rectD.b;
        if (f3 < BitmapDescriptorFactory.HUE_RED) {
            f3 = 0.0f;
        }
        if (f3 > fA2) {
            f3 = fA2;
        }
        float f4 = rectD.c;
        if (f4 < BitmapDescriptorFactory.HUE_RED) {
            f4 = 0.0f;
        }
        if (f4 <= fA) {
            fA = f4;
        }
        float f5 = rectD.d;
        if (f5 >= BitmapDescriptorFactory.HUE_RED) {
            f2 = f5;
        }
        if (f2 <= fA2) {
            fA2 = f2;
        }
        if (f == fA || f3 == fA2) {
            return Rect.e;
        }
        long jY = layoutCoordinatesC.y((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long jY2 = layoutCoordinatesC.y((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32));
        long jY3 = layoutCoordinatesC.y((Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fA2) & 4294967295L));
        long jY4 = layoutCoordinatesC.y((Float.floatToRawIntBits(fA2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jY >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jY2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jY4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jY3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jY & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jY2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jY4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jY3 & 4294967295L));
        return new Rect(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final LayoutCoordinates c(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates layoutCoordinatesE = layoutCoordinates.E();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = layoutCoordinatesE;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            layoutCoordinatesE = layoutCoordinates.E();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.t;
        while (true) {
            NodeCoordinator nodeCoordinator3 = nodeCoordinator2;
            NodeCoordinator nodeCoordinator4 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator3;
            if (nodeCoordinator == null) {
                return nodeCoordinator4;
            }
            nodeCoordinator2 = nodeCoordinator.t;
        }
    }

    public static final long d(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesE = layoutCoordinates.E();
        if (layoutCoordinatesE != null) {
            return layoutCoordinatesE.M(layoutCoordinates, 0L);
        }
        return 0L;
    }
}
