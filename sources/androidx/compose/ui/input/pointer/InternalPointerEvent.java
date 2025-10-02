package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class InternalPointerEvent {

    /* renamed from: a, reason: collision with root package name */
    public final LongSparseArray f1848a;
    public final PointerInputEvent b;
    public boolean c;

    public InternalPointerEvent(LongSparseArray longSparseArray, PointerInputEvent pointerInputEvent) {
        this.f1848a = longSparseArray;
        this.b = pointerInputEvent;
    }

    public final boolean a(long j) {
        Object obj;
        List list = this.b.f1858a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (PointerId.a(((PointerInputEventData) obj).f1859a, j)) {
                break;
            }
            i++;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        if (pointerInputEventData != null) {
            return pointerInputEventData.h;
        }
        return false;
    }
}
