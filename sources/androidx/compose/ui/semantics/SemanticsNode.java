package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.SemanticsModifierNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SemanticsNode {

    /* renamed from: a, reason: collision with root package name */
    public final Modifier.Node f2018a;
    public final boolean b;
    public final LayoutNode c;
    public final SemanticsConfiguration d;
    public boolean e;
    public SemanticsNode f;
    public final int g;

    public SemanticsNode(Modifier.Node node, boolean z, LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        this.f2018a = node;
        this.b = z;
        this.c = layoutNode;
        this.d = semanticsConfiguration;
        this.g = layoutNode.e;
    }

    public static /* synthetic */ List h(int i, SemanticsNode semanticsNode) {
        return semanticsNode.g((i & 1) != 0 ? !semanticsNode.b : false, (i & 2) == 0);
    }

    public final SemanticsNode a(Role role, Function1 function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f = false;
        semanticsConfiguration.g = false;
        function1.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(function1), false, new LayoutNode(true, this.g + (role != null ? 1000000000 : 2000000000)), semanticsConfiguration);
        semanticsNode.e = true;
        semanticsNode.f = this;
        return semanticsNode;
    }

    public final void b(LayoutNode layoutNode, ArrayList arrayList) {
        MutableVector mutableVectorM = layoutNode.M();
        Object[] objArr = mutableVectorM.d;
        int i = mutableVectorM.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.q() && !layoutNode2.U) {
                if (layoutNode2.K.d(8)) {
                    arrayList.add(SemanticsNodeKt.a(layoutNode2, this.b));
                } else {
                    b(layoutNode2, arrayList);
                }
            }
        }
    }

    public final NodeCoordinator c() {
        if (!this.e) {
            SemanticsModifierNode semanticsModifierNodeB = SemanticsNodeKt.b(this.c);
            return DelegatableNodeKt.e(semanticsModifierNodeB != null ? semanticsModifierNodeB : this.f2018a, 8);
        }
        SemanticsNode semanticsNodeJ = j();
        if (semanticsNodeJ != null) {
            return semanticsNodeJ.c();
        }
        return null;
    }

    public final void d(ArrayList arrayList, ArrayList arrayList2) {
        n(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = (SemanticsNode) arrayList.get(size2);
            if (semanticsNode.k()) {
                arrayList2.add(semanticsNode);
            } else if (!semanticsNode.d.g) {
                semanticsNode.d(arrayList, arrayList2);
            }
        }
    }

    public final Rect e() {
        NodeCoordinator nodeCoordinatorC = c();
        if (nodeCoordinatorC != null) {
            if (!nodeCoordinatorC.j1().q) {
                nodeCoordinatorC = null;
            }
            if (nodeCoordinatorC != null) {
                return LayoutCoordinatesKt.c(nodeCoordinatorC).D(nodeCoordinatorC, true);
            }
        }
        return Rect.e;
    }

    public final Rect f() {
        NodeCoordinator nodeCoordinatorC = c();
        if (nodeCoordinatorC != null) {
            if (!nodeCoordinatorC.j1().q) {
                nodeCoordinatorC = null;
            }
            if (nodeCoordinatorC != null) {
                return LayoutCoordinatesKt.b(nodeCoordinatorC);
            }
        }
        return Rect.e;
    }

    public final List g(boolean z, boolean z2) {
        if (!z && this.d.g) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList();
        if (!k()) {
            return n(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        d(arrayList, arrayList2);
        return arrayList2;
    }

    public final SemanticsConfiguration i() {
        boolean zK = k();
        SemanticsConfiguration semanticsConfiguration = this.d;
        if (!zK) {
            return semanticsConfiguration;
        }
        SemanticsConfiguration semanticsConfigurationD = semanticsConfiguration.d();
        m(new ArrayList(), semanticsConfigurationD);
        return semanticsConfigurationD;
    }

    public final SemanticsNode j() {
        LayoutNode layoutNodeK;
        SemanticsNode semanticsNode = this.f;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNode = this.c;
        boolean z = this.b;
        if (z) {
            layoutNodeK = layoutNode.K();
            while (layoutNodeK != null) {
                SemanticsConfiguration semanticsConfigurationR = layoutNodeK.R();
                if (semanticsConfigurationR != null && semanticsConfigurationR.f) {
                    break;
                }
                layoutNodeK = layoutNodeK.K();
            }
            layoutNodeK = null;
        } else {
            layoutNodeK = null;
        }
        if (layoutNodeK == null) {
            LayoutNode layoutNodeK2 = layoutNode.K();
            while (true) {
                if (layoutNodeK2 == null) {
                    layoutNodeK = null;
                    break;
                }
                if (layoutNodeK2.K.d(8)) {
                    layoutNodeK = layoutNodeK2;
                    break;
                }
                layoutNodeK2 = layoutNodeK2.K();
            }
        }
        if (layoutNodeK == null) {
            return null;
        }
        return SemanticsNodeKt.a(layoutNodeK, z);
    }

    public final boolean k() {
        return this.b && this.d.f;
    }

    public final boolean l() {
        if (this.e || !h(4, this).isEmpty()) {
            return false;
        }
        LayoutNode layoutNodeK = this.c.K();
        while (true) {
            if (layoutNodeK == null) {
                layoutNodeK = null;
                break;
            }
            SemanticsConfiguration semanticsConfigurationR = layoutNodeK.R();
            if (semanticsConfigurationR != null && semanticsConfigurationR.f) {
                break;
            }
            layoutNodeK = layoutNodeK.K();
        }
        return layoutNodeK == null;
    }

    public final void m(ArrayList arrayList, SemanticsConfiguration semanticsConfiguration) {
        if (this.d.g) {
            return;
        }
        n(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = (SemanticsNode) arrayList.get(size2);
            if (!semanticsNode.k()) {
                semanticsConfiguration.i(semanticsNode.d);
                semanticsNode.m(arrayList, semanticsConfiguration);
            }
        }
    }

    public final List n(ArrayList arrayList, boolean z) {
        if (this.e) {
            return EmptyList.d;
        }
        b(this.c, arrayList);
        if (z) {
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.w;
            SemanticsConfiguration semanticsConfiguration = this.d;
            final Role role = (Role) SemanticsConfigurationKt.a(semanticsConfiguration, semanticsPropertyKey);
            if (role != null && semanticsConfiguration.f && !arrayList.isEmpty()) {
                arrayList.add(a(role, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        SemanticsPropertiesKt.r((SemanticsPropertyReceiver) obj, role.f2014a);
                        return Unit.f24250a;
                    }
                }));
            }
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f2020a;
            if (semanticsConfiguration.d.c(semanticsPropertyKey2) && !arrayList.isEmpty() && semanticsConfiguration.f) {
                List list = (List) SemanticsConfigurationKt.a(semanticsConfiguration, semanticsPropertyKey2);
                final String str = list != null ? (String) CollectionsKt.F(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            SemanticsPropertiesKt.k((SemanticsPropertyReceiver) obj, str);
                            return Unit.f24250a;
                        }
                    }));
                }
            }
        }
        return arrayList;
    }
}
