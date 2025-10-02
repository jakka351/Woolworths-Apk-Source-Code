package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LayoutCoordinates {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    Rect D(LayoutCoordinates layoutCoordinates, boolean z);

    LayoutCoordinates E();

    long G(long j);

    long M(LayoutCoordinates layoutCoordinates, long j);

    LayoutCoordinates N();

    long P(long j);

    default void Q(LayoutCoordinates layoutCoordinates, float[] fArr) {
        InlineClassHelperKt.e("transformFrom is not implemented on this LayoutCoordinates");
    }

    default void V(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    long a();

    default long n(long j) {
        return 9205357640488583168L;
    }

    boolean q();

    long y(long j);
}
