package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ModifierLocalManager {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f1900a;
    public final MutableVector b = new MutableVector(new BackwardsCompatNode[16], 0);
    public final MutableVector c = new MutableVector(new ModifierLocal[16], 0);
    public final MutableVector d = new MutableVector(new LayoutNode[16], 0);
    public final MutableVector e = new MutableVector(new ModifierLocal[16], 0);
    public boolean f;

    public ModifierLocalManager(AndroidComposeView androidComposeView) {
        this.f1900a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(Modifier.Node node, ModifierLocal modifierLocal, HashSet hashSet) {
        if (!node.d.q) {
            InlineClassHelperKt.b("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node node2 = node.d;
        Modifier.Node node3 = node2.i;
        if (node3 == null) {
            DelegatableNodeKt.a(mutableVector, node2);
        } else {
            mutableVector.c(node3);
        }
        while (true) {
            int i = mutableVector.f;
            if (i == 0) {
                return;
            }
            Modifier.Node node4 = (Modifier.Node) mutableVector.l(i - 1);
            if ((node4.g & 32) != 0) {
                for (Modifier.Node node5 = node4; node5 != null; node5 = node5.i) {
                    if ((node5.f & 32) != 0) {
                        DelegatingNode delegatingNodeB = node5;
                        ?? mutableVector2 = 0;
                        while (delegatingNodeB != 0) {
                            if (delegatingNodeB instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNodeB;
                                if (modifierLocalModifierNode instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) modifierLocalModifierNode;
                                    if ((backwardsCompatNode.r instanceof ModifierLocalConsumer) && backwardsCompatNode.u.contains(modifierLocal)) {
                                        hashSet.add(modifierLocalModifierNode);
                                    }
                                }
                                if (modifierLocalModifierNode.f0().a(modifierLocal)) {
                                    break;
                                }
                            } else if ((delegatingNodeB.f & 32) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                Modifier.Node node6 = delegatingNodeB.s;
                                int i2 = 0;
                                delegatingNodeB = delegatingNodeB;
                                mutableVector2 = mutableVector2;
                                while (node6 != null) {
                                    if ((node6.f & 32) != 0) {
                                        i2++;
                                        mutableVector2 = mutableVector2;
                                        if (i2 == 1) {
                                            delegatingNodeB = node6;
                                        } else {
                                            if (mutableVector2 == 0) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodeB != 0) {
                                                mutableVector2.c(delegatingNodeB);
                                                delegatingNodeB = 0;
                                            }
                                            mutableVector2.c(node6);
                                        }
                                    }
                                    node6 = node6.i;
                                    delegatingNodeB = delegatingNodeB;
                                    mutableVector2 = mutableVector2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNodeB = DelegatableNodeKt.b(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.a(mutableVector, node4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.f1900a.B(new Function0<Unit>() { // from class: androidx.compose.ui.modifier.ModifierLocalManager$invalidate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModifierLocalManager modifierLocalManager = this.h;
                MutableVector mutableVector = modifierLocalManager.c;
                MutableVector mutableVector2 = modifierLocalManager.b;
                MutableVector mutableVector3 = modifierLocalManager.e;
                modifierLocalManager.f = false;
                HashSet hashSet = new HashSet();
                MutableVector mutableVector4 = modifierLocalManager.d;
                Object[] objArr = mutableVector4.d;
                int i = mutableVector4.f;
                for (int i2 = 0; i2 < i; i2++) {
                    LayoutNode layoutNode = (LayoutNode) objArr[i2];
                    ModifierLocal modifierLocal = (ModifierLocal) mutableVector3.d[i2];
                    Modifier.Node node = layoutNode.K.e;
                    if (node.q) {
                        ModifierLocalManager.b(node, modifierLocal, hashSet);
                    }
                }
                mutableVector4.h();
                mutableVector3.h();
                Object[] objArr2 = mutableVector2.d;
                int i3 = mutableVector2.f;
                for (int i4 = 0; i4 < i3; i4++) {
                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) objArr2[i4];
                    ModifierLocal modifierLocal2 = (ModifierLocal) mutableVector.d[i4];
                    if (backwardsCompatNode.q) {
                        ModifierLocalManager.b(backwardsCompatNode, modifierLocal2, hashSet);
                    }
                }
                mutableVector2.h();
                mutableVector.h();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((BackwardsCompatNode) it.next()).u2();
                }
                return Unit.f24250a;
            }
        });
    }
}
