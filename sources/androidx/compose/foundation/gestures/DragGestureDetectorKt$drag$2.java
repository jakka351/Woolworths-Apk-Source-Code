package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1048}, m = "drag-VnAYq1g")
/* loaded from: classes2.dex */
final class DragGestureDetectorKt$drag$2 extends ContinuationImpl {
    public AwaitPointerEventScope p;
    public Function1 q;
    public Orientation r;
    public Function1 s;
    public AwaitPointerEventScope t;
    public Ref.LongRef u;
    public /* synthetic */ Object v;
    public int w;

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        PointerInputChange pointerInputChange;
        Object obj2;
        Object obj3;
        Object objX1 = obj;
        this.v = objX1;
        int i = this.w | Integer.MIN_VALUE;
        this.w = i;
        float f = DragGestureDetectorKt.f889a;
        int i2 = i - Integer.MIN_VALUE;
        this.w = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (i2 == 0) {
            ResultKt.b(objX1);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.LongRef longRef = this.u;
        AwaitPointerEventScope awaitPointerEventScope2 = this.t;
        Function1 function1 = this.s;
        Orientation orientation = this.r;
        Function1 function12 = this.q;
        AwaitPointerEventScope awaitPointerEventScope3 = this.p;
        ResultKt.b(objX1);
        do {
            PointerEvent pointerEvent = (PointerEvent) objX1;
            ?? r11 = pointerEvent.f1851a;
            int size = ((Collection) r11).size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    awaitPointerEventScope = awaitPointerEventScope2;
                    pointerInputChange = null;
                    obj2 = null;
                    break;
                }
                obj2 = r11.get(i3);
                pointerInputChange = null;
                int i4 = i3;
                awaitPointerEventScope = awaitPointerEventScope2;
                if (PointerId.a(((PointerInputChange) obj2).f1855a, longRef.d)) {
                    break;
                }
                i3 = i4 + 1;
                awaitPointerEventScope2 = awaitPointerEventScope;
            }
            PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
            if (pointerInputChange2 == null) {
                pointerInputChange2 = pointerInputChange;
            } else {
                if (PointerEventKt.c(pointerInputChange2)) {
                    ?? r1 = pointerEvent.f1851a;
                    int size2 = ((Collection) r1).size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size2) {
                            obj3 = pointerInputChange;
                            break;
                        }
                        obj3 = r1.get(i5);
                        if (((PointerInputChange) obj3).d) {
                            break;
                        }
                        i5++;
                    }
                    PointerInputChange pointerInputChange3 = (PointerInputChange) obj3;
                    if (pointerInputChange3 != null) {
                        longRef.d = pointerInputChange3.f1855a;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                    }
                } else {
                    long jE = PointerEventKt.e(pointerInputChange2, true);
                    if ((orientation == null ? Offset.d(jE) : orientation == Orientation.d ? Float.intBitsToFloat((int) (jE & 4294967295L)) : Float.intBitsToFloat((int) (jE >> 32))) == BitmapDescriptorFactory.HUE_RED) {
                        awaitPointerEventScope2 = awaitPointerEventScope;
                    }
                }
                this.p = awaitPointerEventScope3;
                this.q = function12;
                this.r = orientation;
                this.s = function1;
                this.t = awaitPointerEventScope2;
                this.u = longRef;
                this.w = 1;
                objX1 = awaitPointerEventScope2.x1(PointerEventPass.e, this);
            }
            if (pointerInputChange2 == null || ((Boolean) function1.invoke(pointerInputChange2)).booleanValue()) {
                return pointerInputChange;
            }
            if (PointerEventKt.c(pointerInputChange2)) {
                return pointerInputChange2;
            }
            function12.invoke(pointerInputChange2);
            long j = pointerInputChange2.f1855a;
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.d = j;
            longRef = longRef2;
            awaitPointerEventScope2 = awaitPointerEventScope3;
            this.p = awaitPointerEventScope3;
            this.q = function12;
            this.r = orientation;
            this.s = function1;
            this.t = awaitPointerEventScope2;
            this.u = longRef;
            this.w = 1;
            objX1 = awaitPointerEventScope2.x1(PointerEventPass.e, this);
        } while (objX1 != coroutineSingletons);
        return coroutineSingletons;
    }
}
