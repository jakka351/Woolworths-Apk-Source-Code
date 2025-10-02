package androidx.compose.ui;

import androidx.compose.foundation.FocusableNode;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.internal.ContextScope;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "Companion", "Element", "Node", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Modifier {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements Modifier {
        public static final /* synthetic */ Companion d = new Companion();

        @Override // androidx.compose.ui.Modifier
        public final boolean E(Function1 function1) {
            return false;
        }

        public final String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.Modifier
        public final Object w(Object obj, Function2 function2) {
            return obj;
        }

        @Override // androidx.compose.ui.Modifier
        public final Modifier x0(Modifier modifier) {
            return modifier;
        }

        @Override // androidx.compose.ui.Modifier
        public final boolean y(Function1 function1) {
            return true;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Element extends Modifier {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class DefaultImpls {
        }

        @Override // androidx.compose.ui.Modifier
        default boolean E(Function1 function1) {
            return ((Boolean) function1.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default Object w(Object obj, Function2 function2) {
            return function2.invoke(obj, this);
        }

        @Override // androidx.compose.ui.Modifier
        default boolean y(Function1 function1) {
            return ((Boolean) function1.invoke(this)).booleanValue();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static abstract class Node implements DelegatableNode {
        public ContextScope e;
        public int f;
        public Node h;
        public Node i;
        public ObserverNodeOwnerScope j;
        public NodeCoordinator k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public Function0 p;
        public boolean q;
        public Node d = this;
        public int g = -1;

        public final CoroutineScope g2() {
            ContextScope contextScope = this.e;
            if (contextScope != null) {
                return contextScope;
            }
            ContextScope contextScopeA = CoroutineScopeKt.a(DelegatableNodeKt.h(this).getCoroutineContext().plus(new JobImpl((Job) DelegatableNodeKt.h(this).getCoroutineContext().get(Job.Key.d))));
            this.e = contextScopeA;
            return contextScopeA;
        }

        public boolean h2() {
            return !(this instanceof FocusableNode);
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        /* renamed from: i, reason: from getter */
        public final Node getD() {
            return this.d;
        }

        public void i2() {
            if (this.q) {
                InlineClassHelperKt.b("node attached multiple times");
            }
            if (this.k == null) {
                InlineClassHelperKt.b("attach invoked on a node without a coordinator");
            }
            this.q = true;
            this.n = true;
        }

        public void j2() {
            if (!this.q) {
                InlineClassHelperKt.b("Cannot detach a node that is not attached");
            }
            if (this.n) {
                InlineClassHelperKt.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.o) {
                InlineClassHelperKt.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.q = false;
            ContextScope contextScope = this.e;
            if (contextScope != null) {
                CoroutineScopeKt.b(contextScope, new ModifierNodeDetachedCancellationException());
                this.e = null;
            }
        }

        public void k2() {
        }

        public void l2() {
        }

        public void m2() {
        }

        public void n2() {
            if (!this.q) {
                InlineClassHelperKt.b("reset() called on an unattached node");
            }
            m2();
        }

        public void o2() {
            if (!this.q) {
                InlineClassHelperKt.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.n) {
                InlineClassHelperKt.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.n = false;
            k2();
            this.o = true;
        }

        public void p2() {
            if (!this.q) {
                InlineClassHelperKt.b("node detached multiple times");
            }
            if (this.k == null) {
                InlineClassHelperKt.b("detach invoked on a node without a coordinator");
            }
            if (!this.o) {
                InlineClassHelperKt.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.o = false;
            Function0 function0 = this.p;
            if (function0 != null) {
                function0.invoke();
            }
            l2();
        }

        public void q2(Node node) {
            this.d = node;
        }

        public void r2(NodeCoordinator nodeCoordinator) {
            this.k = nodeCoordinator;
        }
    }

    boolean E(Function1 function1);

    Object w(Object obj, Function2 function2);

    default Modifier x0(Modifier modifier) {
        return modifier == Companion.d ? this : new CombinedModifier(this, modifier);
    }

    boolean y(Function1 function1);
}
