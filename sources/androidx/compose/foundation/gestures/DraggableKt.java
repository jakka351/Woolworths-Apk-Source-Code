package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DraggableKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Function3 f890a = new DraggableKt$NoOpOnDragStarted$1(3, null);
    public static final Function3 b = new DraggableKt$NoOpOnDragStopped$1(3, null);

    public static final DraggableState a(Function1 function1) {
        return new DefaultDraggableState(function1);
    }

    public static Modifier b(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3 function3, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            mutableInteractionSource = null;
        }
        return modifier.x0(new DraggableElement(draggableState, orientation, z4, mutableInteractionSource, (i & 16) != 0 ? false : z2, f890a, function3, (i & 128) != 0 ? false : z3));
    }

    public static final DraggableState c(Composer composer, Function1 function1) {
        final MutableState mutableStateL = SnapshotStateKt.l(function1, composer);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            DefaultDraggableState defaultDraggableState = new DefaultDraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((Function1) mutableStateL.getD()).invoke(Float.valueOf(((Number) obj).floatValue()));
                    return Unit.f24250a;
                }
            });
            composer.A(defaultDraggableState);
            objG = defaultDraggableState;
        }
        return (DraggableState) objG;
    }
}
