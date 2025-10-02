package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerInputEventProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f1860a;
    public final HitPathTracker b;
    public final PointerInputChangeEventProducer c = new PointerInputChangeEventProducer();
    public final HitTestResult d = new HitTestResult();
    public boolean e;

    public PointerInputEventProcessor(LayoutNode layoutNode) {
        this.f1860a = layoutNode;
        this.b = new HitPathTracker(layoutNode.K.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(PointerInputEvent pointerInputEvent, AndroidComposeView androidComposeView, boolean z) {
        byte b;
        HitPathTracker hitPathTracker;
        int i;
        HitTestResult hitTestResult = this.d;
        if (this.e) {
            return 0;
        }
        try {
            this.e = true;
            InternalPointerEvent internalPointerEventA = this.c.a(pointerInputEvent, androidComposeView);
            LongSparseArray longSparseArray = internalPointerEventA.f1848a;
            int iJ = longSparseArray.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                PointerInputChange pointerInputChange = (PointerInputChange) longSparseArray.k(i2);
                if (!pointerInputChange.d && !pointerInputChange.h) {
                }
                b = false;
                break;
            }
            b = true;
            int iJ2 = longSparseArray.j();
            int i3 = 0;
            while (true) {
                hitPathTracker = this.b;
                if (i3 >= iJ2) {
                    break;
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) longSparseArray.k(i3);
                if (b != false || PointerEventKt.a(pointerInputChange2)) {
                    LayoutNode layoutNode = this.f1860a;
                    long j = pointerInputChange2.c;
                    HitTestResult hitTestResult2 = this.d;
                    int i4 = pointerInputChange2.i;
                    LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.V;
                    layoutNode.O(j, hitTestResult2, i4, true);
                    if (!hitTestResult.d.d()) {
                        hitPathTracker.a(pointerInputChange2.f1855a, hitTestResult, PointerEventKt.a(pointerInputChange2));
                        hitTestResult.clear();
                    }
                }
                i3++;
            }
            boolean zB = hitPathTracker.b(internalPointerEventA, z);
            if (internalPointerEventA.c) {
                i = 0;
            } else {
                int iJ3 = longSparseArray.j();
                for (int i5 = 0; i5 < iJ3; i5++) {
                    PointerInputChange pointerInputChange3 = (PointerInputChange) longSparseArray.k(i5);
                    if (!Offset.c(PointerEventKt.e(pointerInputChange3, true), 0L) && pointerInputChange3.b()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            int i6 = (zB ? 1 : 0) | (i << 1);
            this.e = false;
            return i6;
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }

    public final void b() {
        if (this.e) {
            return;
        }
        this.c.f1856a.a();
        this.b.c();
    }
}
