package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1048}, m = "awaitVerticalDragOrCancellation-rnUCldI")
/* loaded from: classes2.dex */
final class DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 extends ContinuationImpl {
    public AwaitPointerEventScope p;
    public Ref.LongRef q;
    public /* synthetic */ Object r;
    public int s;

    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        this.r = obj;
        int i = this.s | Integer.MIN_VALUE;
        this.s = i;
        float f = DragGestureDetectorKt.f889a;
        int i2 = i - Integer.MIN_VALUE;
        this.s = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.LongRef longRef = this.q;
        AwaitPointerEventScope awaitPointerEventScope = this.p;
        ResultKt.b(obj);
        do {
            PointerEvent pointerEvent = (PointerEvent) obj;
            ?? r5 = pointerEvent.f1851a;
            int size = ((Collection) r5).size();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = r5.get(i4);
                if (PointerId.a(((PointerInputChange) obj2).f1855a, longRef.d)) {
                    break;
                }
                i4++;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) obj2;
            if (pointerInputChange == null) {
                pointerInputChange = null;
            } else if (PointerEventKt.c(pointerInputChange)) {
                ?? r15 = pointerEvent.f1851a;
                int size2 = ((Collection) r15).size();
                while (true) {
                    if (i3 >= size2) {
                        obj3 = null;
                        break;
                    }
                    obj3 = r15.get(i3);
                    if (((PointerInputChange) obj3).d) {
                        break;
                    }
                    i3++;
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj3;
                if (pointerInputChange2 != null) {
                    longRef.d = pointerInputChange2.f1855a;
                    this.p = awaitPointerEventScope;
                    this.q = longRef;
                    this.s = 1;
                    obj = awaitPointerEventScope.x1(PointerEventPass.e, this);
                }
            } else {
                if (Float.intBitsToFloat((int) (PointerEventKt.e(pointerInputChange, true) & 4294967295L)) != BitmapDescriptorFactory.HUE_RED) {
                }
                this.p = awaitPointerEventScope;
                this.q = longRef;
                this.s = 1;
                obj = awaitPointerEventScope.x1(PointerEventPass.e, this);
            }
            if (pointerInputChange == null || pointerInputChange.b()) {
                return null;
            }
            return pointerInputChange;
        } while (obj != coroutineSingletons);
        return coroutineSingletons;
    }
}
