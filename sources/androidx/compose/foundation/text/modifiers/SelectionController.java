package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/runtime/RememberObserver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SelectionController implements RememberObserver {
    public final long d;
    public final SelectionRegistrar e;
    public final long f;
    public StaticTextSelectionParams g = StaticTextSelectionParams.c;
    public Selectable h;
    public final Modifier i;

    public SelectionController(long j, SelectionRegistrar selectionRegistrar, long j2) {
        this.d = j;
        this.e = selectionRegistrar;
        this.f = j2;
        this.i = PointerIconKt.a(SelectionControllerKt.a(j, selectionRegistrar, new SelectionController$modifier$1(this)), TextPointerIcon_androidKt.f1140a);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
        this.h = this.e.h(new MultiWidgetSelectionDelegate(this.d, new Function0<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.g.f1194a;
            }
        }, new Function0<TextLayoutResult>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.g.b;
            }
        }));
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
        Selectable selectable = this.h;
        if (selectable != null) {
            this.e.b(selectable);
            this.h = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        Selectable selectable = this.h;
        if (selectable != null) {
            this.e.b(selectable);
            this.h = null;
        }
    }
}
