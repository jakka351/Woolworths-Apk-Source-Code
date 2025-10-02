package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/AndroidConfig;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AndroidConfig implements ScrollConfig {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f870a;

    public AndroidConfig(ViewConfiguration viewConfiguration) {
        this.f870a = viewConfiguration;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.gestures.ScrollConfig
    public final long a(PointerEvent pointerEvent) {
        ViewConfiguration viewConfiguration = this.f870a;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        ?? r10 = pointerEvent.f1851a;
        Offset offset = new Offset(0L);
        int size = ((Collection) r10).size();
        int i = 0;
        while (true) {
            long j = offset.f1751a;
            if (i >= size) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
                return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
            }
            offset = new Offset(Offset.h(j, ((PointerInputChange) r10.get(i)).j));
            i++;
        }
    }
}
