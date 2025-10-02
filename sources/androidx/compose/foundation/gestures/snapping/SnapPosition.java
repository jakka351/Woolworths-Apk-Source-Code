package androidx.compose.foundation.gestures.snapping;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "", "Center", "End", "Start", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SnapPosition {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPosition$Center;", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Center implements SnapPosition {

        /* renamed from: a, reason: collision with root package name */
        public static final Center f916a = new Center();

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public final int a(int i, int i2, int i3, int i4, int i5, int i6) {
            return (((i - i3) - i4) / 2) - (i2 / 2);
        }

        public final String toString() {
            return "Center";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPosition$End;", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class End implements SnapPosition {
        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public final int a(int i, int i2, int i3, int i4, int i5, int i6) {
            return ((i - i3) - i4) - i2;
        }

        public final String toString() {
            return "End";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPosition$Start;", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Start implements SnapPosition {

        /* renamed from: a, reason: collision with root package name */
        public static final Start f917a = new Start();

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public final int a(int i, int i2, int i3, int i4, int i5, int i6) {
            return 0;
        }

        public final String toString() {
            return "Start";
        }
    }

    int a(int i, int i2, int i3, int i4, int i5, int i6);
}
