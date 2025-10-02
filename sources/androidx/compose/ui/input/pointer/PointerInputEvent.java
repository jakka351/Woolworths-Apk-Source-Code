package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEvent;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerInputEvent {

    /* renamed from: a, reason: collision with root package name */
    public final List f1858a;
    public final MotionEvent b;

    public PointerInputEvent(ArrayList arrayList, MotionEvent motionEvent) {
        this.f1858a = arrayList;
        this.b = motionEvent;
    }
}
