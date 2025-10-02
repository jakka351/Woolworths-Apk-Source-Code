package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputFilter;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PointerInputFilter {

    /* renamed from: a, reason: collision with root package name */
    public LayoutCoordinates f1861a;

    public boolean a() {
        return this instanceof PointerInteropFilter$pointerInputFilter$1;
    }

    public final void b(LayoutCoordinates layoutCoordinates) {
        this.f1861a = layoutCoordinates;
    }
}
