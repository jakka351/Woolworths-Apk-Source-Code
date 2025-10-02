package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldScrollerPosition {
    public static final SaverKt$Saver$1 g = ListSaverKt.a(TextFieldScrollerPosition$Companion$Saver$2.h, TextFieldScrollerPosition$Companion$Saver$1.h);

    /* renamed from: a, reason: collision with root package name */
    public final MutableFloatState f1133a;
    public final MutableFloatState b = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
    public final MutableIntState c = SnapshotIntStateKt.a(0);
    public Rect d = Rect.e;
    public long e = TextRange.b;
    public final MutableState f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public TextFieldScrollerPosition(Orientation orientation, float f) {
        this.f1133a = PrimitiveSnapshotStateKt.a(f);
        this.f = SnapshotStateKt.e(orientation, SnapshotStateKt.n());
    }

    public final void a(Orientation orientation, Rect rect, int i, int i2) {
        float f = i2 - i;
        ((SnapshotMutableFloatStateImpl) this.b).p(f);
        float f2 = rect.f1752a;
        float f3 = rect.b;
        Rect rect2 = this.d;
        float f4 = rect2.f1752a;
        MutableFloatState mutableFloatState = this.f1133a;
        if (f2 != f4 || f3 != rect2.b) {
            boolean z = orientation == Orientation.d;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? rect.d : rect.c;
            SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) mutableFloatState;
            float fA = snapshotMutableFloatStateImpl.a();
            float f6 = i;
            float f7 = fA + f6;
            ((SnapshotMutableFloatStateImpl) mutableFloatState).p(snapshotMutableFloatStateImpl.a() + ((f5 <= f7 && (f2 >= fA || f5 - f2 <= f6)) ? (f2 >= fA || f5 - f2 > f6) ? 0.0f : f2 - fA : f5 - f7));
            this.d = rect;
        }
        ((SnapshotMutableFloatStateImpl) mutableFloatState).p(RangesKt.b(((SnapshotMutableFloatStateImpl) mutableFloatState).a(), BitmapDescriptorFactory.HUE_RED, f));
        ((SnapshotMutableIntStateImpl) this.c).i(i);
    }
}
