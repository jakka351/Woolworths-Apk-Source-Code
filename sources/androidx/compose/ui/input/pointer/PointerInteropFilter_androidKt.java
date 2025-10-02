package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PointerInteropFilter_androidKt {
    public static final Modifier a(Modifier modifier, final AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.d = new Function1<MotionEvent, Boolean>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zDispatchTouchEvent;
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                AndroidViewHolder androidViewHolder2 = androidViewHolder;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = androidViewHolder2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = androidViewHolder2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            }
        };
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new RequestDisallowInterceptTouchEvent();
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2 = pointerInteropFilter.e;
        if (requestDisallowInterceptTouchEvent2 != null) {
            requestDisallowInterceptTouchEvent2.d = null;
        }
        pointerInteropFilter.e = requestDisallowInterceptTouchEvent;
        requestDisallowInterceptTouchEvent.d = pointerInteropFilter;
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent);
        return modifier.x0(pointerInteropFilter);
    }

    public static Modifier b(Modifier modifier, final Function1 function1) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                composer.o(374375707);
                Object objG = composer.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new PointerInteropFilter();
                    composer.A(objG);
                }
                PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) objG;
                pointerInteropFilter.d = function1;
                RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = pointerInteropFilter.e;
                if (requestDisallowInterceptTouchEvent != null) {
                    requestDisallowInterceptTouchEvent.d = null;
                }
                pointerInteropFilter.e = null;
                composer.l();
                return pointerInteropFilter;
            }
        });
    }
}
