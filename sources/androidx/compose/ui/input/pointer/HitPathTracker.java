package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class HitPathTracker {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutCoordinates f1847a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final MutableObjectList f = new MutableObjectList();
    public final NodeParent g = new NodeParent();
    public final MutableLongObjectMap h = new MutableLongObjectMap(10);

    public HitPathTracker(LayoutCoordinates layoutCoordinates) {
        this.f1847a = layoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r18, java.util.List r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.HitPathTracker.a(long, java.util.List, boolean):void");
    }

    public final boolean b(InternalPointerEvent internalPointerEvent, boolean z) {
        LongSparseArray longSparseArray = internalPointerEvent.f1848a;
        LayoutCoordinates layoutCoordinates = this.f1847a;
        NodeParent nodeParent = this.g;
        boolean zA = nodeParent.a(longSparseArray, layoutCoordinates, internalPointerEvent, z);
        MutableVector mutableVector = nodeParent.f1850a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = mutableVector.d;
        int i = mutableVector.f;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((Node) objArr[i2]).e(internalPointerEvent, z) || z3;
        }
        Object[] objArr2 = mutableVector.d;
        int i3 = mutableVector.f;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((Node) objArr2[i4]).d(internalPointerEvent) || z4;
        }
        nodeParent.b(internalPointerEvent);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            MutableObjectList mutableObjectList = this.f;
            int i5 = mutableObjectList.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((Modifier.Node) mutableObjectList.b(i6));
            }
            mutableObjectList.j();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            nodeParent.f1850a.h();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        NodeParent nodeParent = this.g;
        MutableVector mutableVector = nodeParent.f1850a;
        Object[] objArr = mutableVector.d;
        int i = mutableVector.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((Node) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            nodeParent.f1850a.h();
        }
    }

    public final void d(Modifier.Node node) {
        if (this.b) {
            this.e = true;
            this.f.g(node);
            return;
        }
        NodeParent nodeParent = this.g;
        MutableObjectList mutableObjectList = nodeParent.b;
        mutableObjectList.j();
        mutableObjectList.g(nodeParent);
        while (mutableObjectList.e()) {
            NodeParent nodeParent2 = (NodeParent) mutableObjectList.l(mutableObjectList.b - 1);
            int i = 0;
            while (true) {
                MutableVector mutableVector = nodeParent2.f1850a;
                if (i < mutableVector.f) {
                    Node node2 = (Node) mutableVector.d[i];
                    if (Intrinsics.c(node2.c, node)) {
                        nodeParent2.f1850a.k(node2);
                        node2.c();
                    } else {
                        mutableObjectList.g(node2);
                        i++;
                    }
                }
            }
        }
    }
}
