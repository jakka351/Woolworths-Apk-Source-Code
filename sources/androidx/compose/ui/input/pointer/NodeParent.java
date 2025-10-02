package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/NodeParent;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class NodeParent {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f1850a = new MutableVector(new Node[16], 0);
    public final MutableObjectList b = new MutableObjectList(10);

    public boolean a(LongSparseArray longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        MutableVector mutableVector = this.f1850a;
        Object[] objArr = mutableVector.d;
        int i = mutableVector.f;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((Node) objArr[i2]).a(longSparseArray, layoutCoordinates, internalPointerEvent, z) || z2;
        }
        return z2;
    }

    public void b(InternalPointerEvent internalPointerEvent) {
        MutableVector mutableVector = this.f1850a;
        int i = mutableVector.f;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((Node) mutableVector.d[i]).d.f1866a == 0) {
                mutableVector.l(i);
            }
        }
    }
}
