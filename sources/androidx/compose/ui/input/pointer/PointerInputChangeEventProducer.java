package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "", "PointerInputData", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class PointerInputChangeEventProducer {

    /* renamed from: a, reason: collision with root package name */
    public final LongSparseArray f1856a = new LongSparseArray((Object) null);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PointerInputData {

        /* renamed from: a, reason: collision with root package name */
        public final long f1857a;
        public final long b;
        public final boolean c;

        public PointerInputData(long j, long j2, boolean z) {
            this.f1857a = j;
            this.b = j2;
            this.c = z;
        }
    }

    public final InternalPointerEvent a(PointerInputEvent pointerInputEvent, AndroidComposeView androidComposeView) {
        int i;
        long jN;
        long j;
        boolean z;
        List list = pointerInputEvent.f1858a;
        LongSparseArray longSparseArray = new LongSparseArray(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            PointerInputEventData pointerInputEventData = (PointerInputEventData) list.get(i2);
            long j2 = pointerInputEventData.f1859a;
            LongSparseArray longSparseArray2 = this.f1856a;
            PointerInputData pointerInputData = (PointerInputData) longSparseArray2.c(j2);
            if (pointerInputData == null) {
                i = i2;
                j = pointerInputEventData.b;
                jN = pointerInputEventData.d;
                z = false;
            } else {
                long j3 = pointerInputData.f1857a;
                boolean z2 = pointerInputData.c;
                i = i2;
                jN = androidComposeView.n(pointerInputData.b);
                j = j3;
                z = z2;
            }
            long j4 = pointerInputEventData.f1859a;
            List list2 = list;
            int i3 = size;
            longSparseArray.h(j4, new PointerInputChange(j4, pointerInputEventData.b, pointerInputEventData.d, pointerInputEventData.e, pointerInputEventData.f, j, jN, z, pointerInputEventData.g, pointerInputEventData.i, pointerInputEventData.j, pointerInputEventData.k));
            boolean z3 = pointerInputEventData.e;
            if (z3) {
                longSparseArray2.h(j2, new PointerInputData(pointerInputEventData.b, pointerInputEventData.c, z3));
            } else {
                longSparseArray2.i(j2);
            }
            i2 = i + 1;
            list = list2;
            size = i3;
        }
        return new InternalPointerEvent(longSparseArray, pointerInputEvent);
    }
}
