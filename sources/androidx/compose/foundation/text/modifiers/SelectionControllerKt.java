package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionControllerKt {
    public static final Modifier a(final long j, final SelectionRegistrar selectionRegistrar, final Function0 function0) {
        TextDragObserver textDragObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1

            /* renamed from: a, reason: collision with root package name */
            public long f1192a = 0;
            public long b = 0;

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void a() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void b(long j2) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((SelectionController$modifier$1) function0).invoke();
                if (layoutCoordinates == null || !layoutCoordinates.q()) {
                    return;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (SelectionRegistrarKt.a(selectionRegistrar2, j)) {
                    long jH = Offset.h(this.b, j2);
                    this.b = jH;
                    long jH2 = Offset.h(this.f1192a, jH);
                    if (selectionRegistrar2.d(layoutCoordinates, jH2, this.f1192a, SelectionAdjustment.Companion.b, true)) {
                        this.f1192a = jH2;
                        this.b = 0L;
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void c(long j2) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((SelectionController$modifier$1) function0).invoke();
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (layoutCoordinates != null) {
                    if (!layoutCoordinates.q()) {
                        return;
                    }
                    selectionRegistrar2.i(layoutCoordinates, j2, SelectionAdjustment.Companion.b, true);
                    this.f1192a = j2;
                }
                if (SelectionRegistrarKt.a(selectionRegistrar2, j)) {
                    this.b = 0L;
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void d() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
                long j2 = j;
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (SelectionRegistrarKt.a(selectionRegistrar2, j2)) {
                    selectionRegistrar2.c();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                long j2 = j;
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (SelectionRegistrarKt.a(selectionRegistrar2, j2)) {
                    selectionRegistrar2.c();
                }
            }
        };
        return SelectionGesturesKt.i(Modifier.Companion.d, new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1

            /* renamed from: a, reason: collision with root package name */
            public long f1193a = 0;

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final boolean a(long j2, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((SelectionController$modifier$1) function0).invoke();
                if (layoutCoordinates == null) {
                    return true;
                }
                if (!layoutCoordinates.q()) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (!SelectionRegistrarKt.a(selectionRegistrar2, j)) {
                    return false;
                }
                if (!selectionRegistrar2.d(layoutCoordinates, j2, this.f1193a, selectionAdjustment, false)) {
                    return true;
                }
                this.f1193a = j2;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final void b() {
                selectionRegistrar.c();
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final boolean c(long j2, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((SelectionController$modifier$1) function0).invoke();
                if (layoutCoordinates == null || !layoutCoordinates.q()) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                selectionRegistrar2.i(layoutCoordinates, j2, selectionAdjustment, false);
                this.f1193a = j2;
                return SelectionRegistrarKt.a(selectionRegistrar2, j);
            }
        }, textDragObserver);
    }
}
