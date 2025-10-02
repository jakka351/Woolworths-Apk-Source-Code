package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.PointerInputModifierNode;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Node extends NodeParent {
    public final Modifier.Node c;
    public final PointerIdArray d;
    public final LongSparseArray e;
    public NodeCoordinator f;
    public PointerEvent g;
    public boolean h;
    public boolean i;
    public boolean j;

    public Node(Modifier.Node node) {
        this.c = node;
        PointerIdArray pointerIdArray = new PointerIdArray();
        pointerIdArray.b = new long[2];
        this.d = pointerIdArray;
        this.e = new LongSparseArray(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [int] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(androidx.collection.LongSparseArray r51, androidx.compose.ui.layout.LayoutCoordinates r52, androidx.compose.ui.input.pointer.InternalPointerEvent r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.a(androidx.collection.LongSparseArray, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public final void b(InternalPointerEvent internalPointerEvent) {
        super.b(internalPointerEvent);
        PointerEvent pointerEvent = this.g;
        if (pointerEvent == null) {
            return;
        }
        this.h = this.i;
        ?? r1 = pointerEvent.f1851a;
        int size = ((Collection) r1).size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = (PointerInputChange) r1.get(i);
            boolean z = pointerInputChange.d;
            long j = pointerInputChange.f1855a;
            boolean zA = internalPointerEvent.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.c(j);
            }
        }
        this.i = false;
        this.j = pointerEvent.e == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.runtime.collection.MutableVector] */
    public final void c() {
        MutableVector mutableVector = this.f1850a;
        Object[] objArr = mutableVector.d;
        int i = mutableVector.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((Node) objArr[i2]).c();
        }
        DelegatingNode delegatingNodeB = this.c;
        ?? mutableVector2 = 0;
        while (delegatingNodeB != 0) {
            if (delegatingNodeB instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNodeB).D0();
            } else if ((delegatingNodeB.f & 16) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                Modifier.Node node = delegatingNodeB.s;
                int i3 = 0;
                delegatingNodeB = delegatingNodeB;
                mutableVector2 = mutableVector2;
                while (node != null) {
                    if ((node.f & 16) != 0) {
                        i3++;
                        mutableVector2 = mutableVector2;
                        if (i3 == 1) {
                            delegatingNodeB = node;
                        } else {
                            if (mutableVector2 == 0) {
                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNodeB != 0) {
                                mutableVector2.c(delegatingNodeB);
                                delegatingNodeB = 0;
                            }
                            mutableVector2.c(node);
                        }
                    }
                    node = node.i;
                    delegatingNodeB = delegatingNodeB;
                    mutableVector2 = mutableVector2;
                }
                if (i3 == 1) {
                }
            }
            delegatingNodeB = DelegatableNodeKt.b(mutableVector2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(InternalPointerEvent internalPointerEvent) {
        LongSparseArray longSparseArray = this.e;
        boolean z = false;
        z = false;
        if (!longSparseArray.f()) {
            Modifier.Node node = this.c;
            if (node.q) {
                PointerEvent pointerEvent = this.g;
                Intrinsics.e(pointerEvent);
                NodeCoordinator nodeCoordinator = this.f;
                Intrinsics.e(nodeCoordinator);
                long j = nodeCoordinator.f;
                DelegatingNode delegatingNodeB = node;
                ?? mutableVector = 0;
                while (delegatingNodeB != 0) {
                    if (delegatingNodeB instanceof PointerInputModifierNode) {
                        ((PointerInputModifierNode) delegatingNodeB).f1(pointerEvent, PointerEventPass.f, j);
                    } else if ((delegatingNodeB.f & 16) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                        Modifier.Node node2 = delegatingNodeB.s;
                        int i = 0;
                        delegatingNodeB = delegatingNodeB;
                        mutableVector = mutableVector;
                        while (node2 != null) {
                            if ((node2.f & 16) != 0) {
                                i++;
                                mutableVector = mutableVector;
                                if (i == 1) {
                                    delegatingNodeB = node2;
                                } else {
                                    if (mutableVector == 0) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNodeB != 0) {
                                        mutableVector.c(delegatingNodeB);
                                        delegatingNodeB = 0;
                                    }
                                    mutableVector.c(node2);
                                }
                            }
                            node2 = node2.i;
                            delegatingNodeB = delegatingNodeB;
                            mutableVector = mutableVector;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNodeB = DelegatableNodeKt.b(mutableVector);
                }
                if (node.q) {
                    MutableVector mutableVector2 = this.f1850a;
                    Object[] objArr = mutableVector2.d;
                    int i2 = mutableVector2.f;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((Node) objArr[i3]).d(internalPointerEvent);
                    }
                }
                z = true;
            }
        }
        b(internalPointerEvent);
        longSparseArray.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(InternalPointerEvent internalPointerEvent, boolean z) {
        if (!this.e.f()) {
            DelegatingNode delegatingNodeB = this.c;
            if (delegatingNodeB.q) {
                PointerEvent pointerEvent = this.g;
                Intrinsics.e(pointerEvent);
                NodeCoordinator nodeCoordinator = this.f;
                Intrinsics.e(nodeCoordinator);
                long j = nodeCoordinator.f;
                DelegatingNode delegatingNodeB2 = delegatingNodeB;
                ?? mutableVector = 0;
                while (delegatingNodeB2 != 0) {
                    if (delegatingNodeB2 instanceof PointerInputModifierNode) {
                        ((PointerInputModifierNode) delegatingNodeB2).f1(pointerEvent, PointerEventPass.d, j);
                    } else if ((delegatingNodeB2.f & 16) != 0 && (delegatingNodeB2 instanceof DelegatingNode)) {
                        Modifier.Node node = delegatingNodeB2.s;
                        int i = 0;
                        delegatingNodeB2 = delegatingNodeB2;
                        mutableVector = mutableVector;
                        while (node != null) {
                            if ((node.f & 16) != 0) {
                                i++;
                                mutableVector = mutableVector;
                                if (i == 1) {
                                    delegatingNodeB2 = node;
                                } else {
                                    if (mutableVector == 0) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNodeB2 != 0) {
                                        mutableVector.c(delegatingNodeB2);
                                        delegatingNodeB2 = 0;
                                    }
                                    mutableVector.c(node);
                                }
                            }
                            node = node.i;
                            delegatingNodeB2 = delegatingNodeB2;
                            mutableVector = mutableVector;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNodeB2 = DelegatableNodeKt.b(mutableVector);
                }
                if (delegatingNodeB.q) {
                    MutableVector mutableVector2 = this.f1850a;
                    Object[] objArr = mutableVector2.d;
                    int i2 = mutableVector2.f;
                    for (int i3 = 0; i3 < i2; i3++) {
                        Node node2 = (Node) objArr[i3];
                        Intrinsics.e(this.f);
                        node2.e(internalPointerEvent, z);
                    }
                }
                if (delegatingNodeB.q) {
                    ?? mutableVector3 = 0;
                    while (delegatingNodeB != 0) {
                        if (delegatingNodeB instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNodeB).f1(pointerEvent, PointerEventPass.e, j);
                        } else if ((delegatingNodeB.f & 16) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                            Modifier.Node node3 = delegatingNodeB.s;
                            int i4 = 0;
                            delegatingNodeB = delegatingNodeB;
                            mutableVector3 = mutableVector3;
                            while (node3 != null) {
                                if ((node3.f & 16) != 0) {
                                    i4++;
                                    mutableVector3 = mutableVector3;
                                    if (i4 == 1) {
                                        delegatingNodeB = node3;
                                    } else {
                                        if (mutableVector3 == 0) {
                                            mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodeB != 0) {
                                            mutableVector3.c(delegatingNodeB);
                                            delegatingNodeB = 0;
                                        }
                                        mutableVector3.c(node3);
                                    }
                                }
                                node3 = node3.i;
                                delegatingNodeB = delegatingNodeB;
                                mutableVector3 = mutableVector3;
                            }
                            if (i4 == 1) {
                            }
                        }
                        delegatingNodeB = DelegatableNodeKt.b(mutableVector3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, MutableObjectList mutableObjectList) {
        PointerIdArray pointerIdArray = this.d;
        if (pointerIdArray.b(j) && mutableObjectList.c(this) < 0) {
            pointerIdArray.c(j);
            this.e.i(j);
        }
        MutableVector mutableVector = this.f1850a;
        Object[] objArr = mutableVector.d;
        int i = mutableVector.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((Node) objArr[i2]).f(j, mutableObjectList);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.f1850a + ", pointerIds=" + this.d + ')';
    }
}
