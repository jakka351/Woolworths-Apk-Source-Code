package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    public PointerInteropFilter.DispatchToViewState b = PointerInteropFilter.DispatchToViewState.d;
    public final /* synthetic */ PointerInteropFilter c;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.c = pointerInteropFilter;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void c(PointerEvent pointerEvent) {
        ?? r0 = pointerEvent.f1851a;
        Collection collection = (Collection) r0;
        int size = collection.size();
        int i = 0;
        while (true) {
            final PointerInteropFilter pointerInteropFilter = this.c;
            if (i >= size) {
                LayoutCoordinates layoutCoordinates = this.f1861a;
                if (layoutCoordinates == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                PointerInteropUtils_androidKt.a(pointerEvent, layoutCoordinates.G(0L), new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        MotionEvent motionEvent = (MotionEvent) obj;
                        int actionMasked = motionEvent.getActionMasked();
                        PointerInteropFilter pointerInteropFilter2 = pointerInteropFilter;
                        if (actionMasked == 0) {
                            Function1 function1 = pointerInteropFilter2.d;
                            if (function1 == null) {
                                Intrinsics.p("onTouchEvent");
                                throw null;
                            }
                            this.h.b = ((Boolean) function1.invoke(motionEvent)).booleanValue() ? PointerInteropFilter.DispatchToViewState.e : PointerInteropFilter.DispatchToViewState.f;
                        } else {
                            Function1 function12 = pointerInteropFilter2.d;
                            if (function12 == null) {
                                Intrinsics.p("onTouchEvent");
                                throw null;
                            }
                            function12.invoke(motionEvent);
                        }
                        return Unit.f24250a;
                    }
                }, false);
                if (this.b == PointerInteropFilter.DispatchToViewState.e) {
                    int size2 = collection.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((PointerInputChange) r0.get(i2)).a();
                    }
                    InternalPointerEvent internalPointerEvent = pointerEvent.b;
                    if (internalPointerEvent == null) {
                        return;
                    }
                    internalPointerEvent.c = !pointerInteropFilter.f;
                    return;
                }
                return;
            }
            if (((PointerInputChange) r0.get(i)).b()) {
                if (this.b == PointerInteropFilter.DispatchToViewState.e) {
                    LayoutCoordinates layoutCoordinates2 = this.f1861a;
                    if (layoutCoordinates2 == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    PointerInteropUtils_androidKt.a(pointerEvent, layoutCoordinates2.G(0L), new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            MotionEvent motionEvent = (MotionEvent) obj;
                            Function1 function1 = pointerInteropFilter.d;
                            if (function1 != null) {
                                function1.invoke(motionEvent);
                                return Unit.f24250a;
                            }
                            Intrinsics.p("onTouchEvent");
                            throw null;
                        }
                    }, true);
                }
                this.b = PointerInteropFilter.DispatchToViewState.f;
                return;
            }
            i++;
        }
    }

    public final void d() {
        if (this.b == PointerInteropFilter.DispatchToViewState.e) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.c;
            Function1<MotionEvent, Unit> function1 = new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    MotionEvent motionEvent = (MotionEvent) obj;
                    Function1 function12 = pointerInteropFilter.d;
                    if (function12 != null) {
                        function12.invoke(motionEvent);
                        return Unit.f24250a;
                    }
                    Intrinsics.p("onTouchEvent");
                    throw null;
                }
            };
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            motionEventObtain.setSource(0);
            function1.invoke(motionEventObtain);
            motionEventObtain.recycle();
            this.b = PointerInteropFilter.DispatchToViewState.d;
            pointerInteropFilter.f = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void e(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        boolean z;
        ?? r0 = pointerEvent.f1851a;
        PointerInteropFilter pointerInteropFilter = this.c;
        if (pointerInteropFilter.f) {
            z = true;
            break;
        }
        int size = ((Collection) r0).size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = (PointerInputChange) r0.get(i);
            if (PointerEventKt.a(pointerInputChange) || PointerEventKt.c(pointerInputChange)) {
                z = true;
                break;
            }
        }
        z = false;
        if (this.b != PointerInteropFilter.DispatchToViewState.f) {
            if (pointerEventPass == PointerEventPass.d && z) {
                c(pointerEvent);
            }
            if (pointerEventPass == PointerEventPass.f && !z) {
                c(pointerEvent);
            }
        }
        if (pointerEventPass == PointerEventPass.f) {
            int size2 = ((Collection) r0).size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!PointerEventKt.c((PointerInputChange) r0.get(i2))) {
                    return;
                }
            }
            this.b = PointerInteropFilter.DispatchToViewState.d;
            pointerInteropFilter.f = false;
        }
    }
}
