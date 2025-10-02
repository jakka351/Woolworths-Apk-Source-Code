package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TwoDimensionalFocusSearchKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FocusStateImpl focusStateImpl = FocusStateImpl.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FocusStateImpl focusStateImpl2 = FocusStateImpl.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FocusStateImpl focusStateImpl3 = FocusStateImpl.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final boolean a(Rect rect, Rect rect2, Rect rect3, int i) {
        float f;
        float f2;
        boolean zB = b(i, rect3, rect);
        float f3 = rect3.b;
        float f4 = rect3.d;
        float f5 = rect3.f1752a;
        float f6 = rect3.c;
        float f7 = rect.d;
        float f8 = rect.b;
        float f9 = rect.c;
        float f10 = rect.f1752a;
        if (zB || !b(i, rect2, rect)) {
            return false;
        }
        if (i == 3) {
            if (f10 < f6) {
                return true;
            }
        } else if (i == 4) {
            if (f9 > f5) {
                return true;
            }
        } else if (i == 5) {
            if (f8 < f4) {
                return true;
            }
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f7 > f3) {
                return true;
            }
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 3) {
            f = f10 - rect2.c;
        } else if (i == 4) {
            f = rect2.f1752a - f9;
        } else if (i == 5) {
            f = f8 - rect2.d;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = rect2.b - f7;
        }
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        if (i == 3) {
            f2 = f10 - f5;
        } else if (i == 4) {
            f2 = f6 - f9;
        } else if (i == 5) {
            f2 = f8 - f3;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f2 = f4 - f7;
        }
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        return f < f2;
    }

    public static final boolean b(int i, Rect rect, Rect rect2) {
        if (i == 3 || i == 4) {
            return rect.d > rect2.b && rect.b < rect2.d;
        }
        if (i == 5 || i == 6) {
            return rect.c > rect2.f1752a && rect.f1752a < rect2.c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final void c(FocusTargetNode focusTargetNode, MutableVector mutableVector) {
        if (!focusTargetNode.d.q) {
            InlineClassHelperKt.b("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node node = focusTargetNode.d;
        Modifier.Node node2 = node.i;
        if (node2 == null) {
            DelegatableNodeKt.a(mutableVector2, node);
        } else {
            mutableVector2.c(node2);
        }
        while (true) {
            int i = mutableVector2.f;
            if (i == 0) {
                return;
            }
            Modifier.Node nodeB = (Modifier.Node) mutableVector2.l(i - 1);
            if ((nodeB.g & 1024) == 0) {
                DelegatableNodeKt.a(mutableVector2, nodeB);
            } else {
                while (true) {
                    if (nodeB == null) {
                        break;
                    }
                    if ((nodeB.f & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodeB != null) {
                            if (nodeB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeB;
                                if (focusTargetNode2.q && !DelegatableNodeKt.g(focusTargetNode2).U) {
                                    if (focusTargetNode2.t2().f1748a) {
                                        mutableVector.c(focusTargetNode2);
                                    } else {
                                        c(focusTargetNode2, mutableVector);
                                    }
                                }
                            } else if ((nodeB.f & 1024) != 0 && (nodeB instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node node3 = ((DelegatingNode) nodeB).s; node3 != null; node3 = node3.i) {
                                    if ((node3.f & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodeB = node3;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeB != null) {
                                                mutableVector3.c(nodeB);
                                                nodeB = null;
                                            }
                                            mutableVector3.c(node3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodeB = DelegatableNodeKt.b(mutableVector3);
                        }
                    } else {
                        nodeB = nodeB.i;
                    }
                }
            }
        }
    }

    public static final FocusTargetNode d(MutableVector mutableVector, Rect rect, int i) {
        Rect rectJ;
        if (i == 3) {
            rectJ = rect.j((rect.c - rect.f1752a) + 1, BitmapDescriptorFactory.HUE_RED);
        } else if (i == 4) {
            rectJ = rect.j(-((rect.c - rect.f1752a) + 1), BitmapDescriptorFactory.HUE_RED);
        } else if (i == 5) {
            rectJ = rect.j(BitmapDescriptorFactory.HUE_RED, (rect.d - rect.b) + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            rectJ = rect.j(BitmapDescriptorFactory.HUE_RED, -((rect.d - rect.b) + 1));
        }
        Object[] objArr = mutableVector.d;
        int i2 = mutableVector.f;
        FocusTargetNode focusTargetNode = null;
        for (int i3 = 0; i3 < i2; i3++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
            if (FocusTraversalKt.f(focusTargetNode2)) {
                Rect rectC = FocusTraversalKt.c(focusTargetNode2);
                if (g(rectC, rectJ, rect, i)) {
                    focusTargetNode = focusTargetNode2;
                    rectJ = rectC;
                }
            }
        }
        return focusTargetNode;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, int i, Function1 function1) {
        Rect rect;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        c(focusTargetNode, mutableVector);
        int i2 = mutableVector.f;
        if (i2 <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (i2 == 0 ? null : mutableVector.d[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) function1.invoke(focusTargetNode2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                Rect rectC = FocusTraversalKt.c(focusTargetNode);
                float f = rectC.f1752a;
                float f2 = rectC.b;
                rect = new Rect(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                Rect rectC2 = FocusTraversalKt.c(focusTargetNode);
                float f3 = rectC2.c;
                float f4 = rectC2.d;
                rect = new Rect(f3, f4, f3, f4);
            }
            FocusTargetNode focusTargetNodeD = d(mutableVector, rect, i);
            if (focusTargetNodeD != null) {
                return ((Boolean) function1.invoke(focusTargetNodeD)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean f(final int i, final FocusTargetNode focusTargetNode, final Rect rect, final Function1 function1) {
        if (j(i, focusTargetNode, rect, function1)) {
            return true;
        }
        final FocusTransactionManager focusTransactionManagerA = DelegatableNodeKt.h(focusTargetNode).getFocusOwner().getH();
        focusTransactionManagerA.getClass();
        final FocusTargetNode focusTargetNodeC = DelegatableNodeKt.h(focusTargetNode).getFocusOwner().getL();
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.a(focusTargetNode, i, new Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean>(focusTransactionManagerA, focusTargetNodeC, focusTargetNode, rect, i, function1) { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            public final /* synthetic */ FocusTargetNode h;
            public final /* synthetic */ FocusTargetNode i;
            public final /* synthetic */ Rect j;
            public final /* synthetic */ int k;
            public final /* synthetic */ Function1 l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.h = focusTargetNodeC;
                this.i = focusTargetNode;
                this.j = rect;
                this.k = i;
                this.l = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope = (BeyondBoundsLayout.BeyondBoundsScope) obj;
                FocusTargetNode focusTargetNode2 = this.i;
                if (this.h != DelegatableNodeKt.h(focusTargetNode2).getFocusOwner().getL()) {
                    return Boolean.TRUE;
                }
                boolean zJ = TwoDimensionalFocusSearchKt.j(this.k, focusTargetNode2, this.j, this.l);
                Boolean boolValueOf = Boolean.valueOf(zJ);
                if (zJ || !beyondBoundsScope.a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean g(Rect rect, Rect rect2, Rect rect3, int i) {
        if (!h(i, rect, rect3)) {
            return false;
        }
        if (h(i, rect2, rect3) && !a(rect3, rect, rect2, i)) {
            return !a(rect3, rect2, rect, i) && i(i, rect3, rect) < i(i, rect3, rect2);
        }
        return true;
    }

    public static final boolean h(int i, Rect rect, Rect rect2) {
        float f = rect.b;
        float f2 = rect.d;
        float f3 = rect.f1752a;
        float f4 = rect.c;
        if (i == 3) {
            float f5 = rect2.c;
            float f6 = rect2.f1752a;
            return (f5 > f4 || f6 >= f4) && f6 > f3;
        }
        if (i == 4) {
            float f7 = rect2.f1752a;
            float f8 = rect2.c;
            return (f7 < f3 || f8 <= f3) && f8 < f4;
        }
        if (i == 5) {
            float f9 = rect2.d;
            float f10 = rect2.b;
            return (f9 > f2 || f10 >= f2) && f10 > f;
        }
        if (i != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f11 = rect2.b;
        float f12 = rect2.d;
        return (f11 < f || f12 <= f) && f12 < f2;
    }

    public static final long i(int i, Rect rect, Rect rect2) {
        float f;
        float f2;
        float f3 = rect2.b;
        float f4 = rect2.d;
        float f5 = rect2.f1752a;
        float f6 = rect2.c;
        if (i == 3) {
            f = rect.f1752a - f6;
        } else if (i == 4) {
            f = f5 - rect.c;
        } else if (i == 5) {
            f = rect.b - f4;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = f3 - rect.d;
        }
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        long j = (long) f;
        if (i == 3 || i == 4) {
            float f7 = rect.b;
            float f8 = 2;
            f2 = (((rect.d - f7) / f8) + f7) - (((f4 - f3) / f8) + f3);
        } else {
            if (i != 5 && i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f9 = rect.f1752a;
            float f10 = 2;
            f2 = (((rect.c - f9) / f10) + f9) - (((f6 - f5) / f10) + f5);
        }
        long j2 = (long) f2;
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean j(int i, FocusTargetNode focusTargetNode, Rect rect, Function1 function1) {
        FocusTargetNode focusTargetNodeD;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        if (!focusTargetNode.d.q) {
            InlineClassHelperKt.b("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node node = focusTargetNode.d;
        Modifier.Node node2 = node.i;
        if (node2 == null) {
            DelegatableNodeKt.a(mutableVector2, node);
        } else {
            mutableVector2.c(node2);
        }
        while (true) {
            int i2 = mutableVector2.f;
            if (i2 == 0) {
                break;
            }
            Modifier.Node nodeB = (Modifier.Node) mutableVector2.l(i2 - 1);
            if ((nodeB.g & 1024) == 0) {
                DelegatableNodeKt.a(mutableVector2, nodeB);
            } else {
                while (true) {
                    if (nodeB == null) {
                        break;
                    }
                    if ((nodeB.f & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodeB != null) {
                            if (nodeB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeB;
                                if (focusTargetNode2.q) {
                                    mutableVector.c(focusTargetNode2);
                                }
                            } else if ((nodeB.f & 1024) != 0 && (nodeB instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node node3 = ((DelegatingNode) nodeB).s; node3 != null; node3 = node3.i) {
                                    if ((node3.f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodeB = node3;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeB != null) {
                                                mutableVector3.c(nodeB);
                                                nodeB = null;
                                            }
                                            mutableVector3.c(node3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            nodeB = DelegatableNodeKt.b(mutableVector3);
                        }
                    } else {
                        nodeB = nodeB.i;
                    }
                }
            }
        }
        while (mutableVector.f != 0 && (focusTargetNodeD = d(mutableVector, rect, i)) != null) {
            if (focusTargetNodeD.t2().f1748a) {
                return ((Boolean) ((FocusOwnerImpl$focusSearch$1) function1).invoke(focusTargetNodeD)).booleanValue();
            }
            if (f(i, focusTargetNodeD, rect, function1)) {
                return true;
            }
            mutableVector.k(focusTargetNodeD);
        }
        return false;
    }

    public static final Boolean k(int i, FocusTargetNode focusTargetNode, Rect rect, Function1 function1) {
        int iOrdinal = focusTargetNode.a1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeE = FocusTraversalKt.e(focusTargetNode);
                if (focusTargetNodeE == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = focusTargetNodeE.a1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolK = k(i, focusTargetNodeE, rect, function1);
                        if (!Intrinsics.c(boolK, Boolean.FALSE)) {
                            return boolK;
                        }
                        if (rect == null) {
                            if (focusTargetNodeE.a1() != FocusStateImpl.e) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            FocusTargetNode focusTargetNodeB = FocusTraversalKt.b(focusTargetNodeE);
                            if (focusTargetNodeB == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            rect = FocusTraversalKt.c(focusTargetNodeB);
                        }
                        return Boolean.valueOf(f(i, focusTargetNode, rect, function1));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (rect == null) {
                    rect = FocusTraversalKt.c(focusTargetNodeE);
                }
                return Boolean.valueOf(f(i, focusTargetNode, rect, function1));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetNode.t2().f1748a ? (Boolean) ((FocusOwnerImpl$focusSearch$1) function1).invoke(focusTargetNode) : rect == null ? Boolean.valueOf(e(focusTargetNode, i, function1)) : Boolean.valueOf(j(i, focusTargetNode, rect, function1));
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return Boolean.valueOf(e(focusTargetNode, i, function1));
    }
}
