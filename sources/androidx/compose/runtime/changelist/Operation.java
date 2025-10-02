package androidx.compose.runtime.changelist;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PausedCompositionRemembers;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:&\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'\u0082\u0001%()*+,-./0123456789:;<=>?@ABCDEFGHIJKL¨\u0006M"}, d2 = {"Landroidx/compose/runtime/changelist/Operation;", "", "AdvanceSlotsBy", "AppendValue", "ApplyChangeList", "CopyNodesToNewAnchorLocation", "CopySlotTableToAnchorLocation", "DeactivateCurrentGroup", "DetermineMovableContentNodeIndex", "Downs", "EndCompositionScope", "EndCurrentGroup", "EndMovableContentPlacement", "EndResumingScope", "EnsureGroupStarted", "EnsureRootGroupStarted", "InsertNodeFixup", "InsertSlots", "InsertSlotsWithFixups", "MoveCurrentGroup", "MoveNode", "ObjectParameter", "PostInsertNodeFixup", "ReleaseMovableGroupAtCurrent", "Remember", "RememberPausingScope", "RemoveCurrentGroup", "RemoveNode", "ResetSlots", "SideEffect", "SkipToEndOfCurrentGroup", "StartResumingScope", "TestOperation", "TrimParentValues", "UpdateAnchoredValue", "UpdateAuxData", "UpdateNode", "UpdateValue", "Ups", "UseCurrentNode", "Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation$AppendValue;", "Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation$EndResumingScope;", "Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation$RememberPausingScope;", "Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$StartResumingScope;", "Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation$TrimParentValues;", "Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;", "Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Operation {

    /* renamed from: a, reason: collision with root package name */
    public final int f1675a;
    public final int b;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class AdvanceSlotsBy extends Operation {
        public static final AdvanceSlotsBy c = new AdvanceSlotsBy(1, 0, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            slotWriter.a(opIterator.a(0));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String b(int i) {
            return i == 0 ? "distance" : super.b(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$AppendValue;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class AppendValue extends Operation {
        public static final AppendValue c = new AppendValue(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            Anchor anchor = (Anchor) opIterator.b(0);
            Object objB = opIterator.b(1);
            if (objB instanceof RememberObserverHolder) {
                rememberEventDispatcher.e((RememberObserverHolder) objB);
            }
            if (slotWriter.n != 0) {
                ComposerKt.c("Can only append a slot if not current inserting");
            }
            int i = slotWriter.i;
            int i2 = slotWriter.j;
            int iC = slotWriter.c(anchor);
            int iF = slotWriter.f(slotWriter.q(iC + 1), slotWriter.b);
            slotWriter.i = iF;
            slotWriter.j = iF;
            slotWriter.v(1, iC);
            if (i >= iF) {
                i++;
                i2++;
            }
            slotWriter.c[iF] = objB;
            slotWriter.i = i;
            slotWriter.j = i2;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "anchor" : i == 1 ? "value" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class ApplyChangeList extends Operation {
        public static final ApplyChangeList c = new ApplyChangeList(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            IntRef intRef = (IntRef) opIterator.b(1);
            int i = intRef != null ? intRef.f1689a : 0;
            ChangeList changeList = (ChangeList) opIterator.b(0);
            if (i > 0) {
                applier = new OffsetApplier(applier, i);
            }
            changeList.b(applier, slotWriter, rememberEventDispatcher);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "changes" : i == 1 ? "effectiveNodeIndex" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final CopyNodesToNewAnchorLocation c = new CopyNodesToNewAnchorLocation(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            int i = ((IntRef) opIterator.b(0)).f1689a;
            List list = (List) opIterator.b(1);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                int i3 = i + i2;
                applier.h(i3, obj);
                applier.f(i3, obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "effectiveNodeIndex" : i == 1 ? "nodes" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class CopySlotTableToAnchorLocation extends Operation {
        public static final CopySlotTableToAnchorLocation c = new CopySlotTableToAnchorLocation(0, 4, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) opIterator.b(2);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) opIterator.b(3);
            CompositionContext compositionContext = (CompositionContext) opIterator.b(1);
            MovableContentState movableContentStateN = (MovableContentState) opIterator.b(0);
            if (movableContentStateN == null && (movableContentStateN = compositionContext.n(movableContentStateReference)) == null) {
                ComposerKt.d("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            SlotTable slotTable = movableContentStateN.f1646a;
            if (slotWriter.n > 0 || slotWriter.s(slotWriter.t + 1) != 1) {
                ComposerKt.c("Check failed");
            }
            int i = slotWriter.t;
            int i2 = slotWriter.i;
            int i3 = slotWriter.j;
            slotWriter.a(1);
            slotWriter.P();
            slotWriter.d();
            SlotWriter slotWriterM = slotTable.m();
            try {
                List listA = SlotWriter.Companion.a(slotWriterM, 2, slotWriter, false, true, true);
                slotWriterM.e(true);
                slotWriter.j();
                slotWriter.i();
                slotWriter.t = i;
                slotWriter.i = i2;
                slotWriter.j = i3;
                RecomposeScopeImpl.Companion.a(slotWriter, listA, movableContentStateReference2.c);
            } catch (Throwable th) {
                slotWriterM.e(false);
                throw th;
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "resolvedState" : i == 1 ? "resolvedCompositionContext" : i == 2 ? "from" : i == 3 ? "to" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DeactivateCurrentGroup extends Operation {
        public static final DeactivateCurrentGroup c;

        static {
            int i = 0;
            c = new DeactivateCurrentGroup(i, i, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            ComposerKt.e(slotWriter, rememberEventDispatcher);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final DetermineMovableContentNodeIndex c = new DetermineMovableContentNodeIndex(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            int i;
            IntRef intRef = (IntRef) opIterator.b(0);
            int iC = slotWriter.c((Anchor) opIterator.b(1));
            if (slotWriter.t >= iC) {
                ComposerKt.c("Check failed");
            }
            OperationKt.a(slotWriter, applier, iC);
            int i2 = slotWriter.t;
            int iE = slotWriter.v;
            while (iE >= 0 && !slotWriter.w(iE)) {
                iE = slotWriter.E(iE, slotWriter.b);
            }
            int iS = iE + 1;
            int iK = 0;
            while (iS < i2) {
                if (slotWriter.t(i2, iS)) {
                    if (slotWriter.w(iS)) {
                        iK = 0;
                    }
                    iS++;
                } else {
                    iK += slotWriter.w(iS) ? 1 : slotWriter.D(iS);
                    iS += slotWriter.s(iS);
                }
            }
            while (true) {
                i = slotWriter.t;
                if (i >= iC) {
                    break;
                }
                if (slotWriter.t(iC, i)) {
                    int i3 = slotWriter.t;
                    if (i3 < slotWriter.u && (slotWriter.b[(slotWriter.q(i3) * 5) + 1] & 1073741824) != 0) {
                        applier.i(slotWriter.C(slotWriter.t));
                        iK = 0;
                    }
                    slotWriter.P();
                } else {
                    iK += slotWriter.K();
                }
            }
            if (i != iC) {
                ComposerKt.c("Check failed");
            }
            intRef.f1689a = iK;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "effectiveNodeIndexOut" : i == 1 ? "anchor" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class Downs extends Operation {
        public static final Downs c;

        static {
            int i = 1;
            c = new Downs(0, i, i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            for (Object obj : (Object[]) opIterator.b(0)) {
                applier.i(obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "nodes" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class EndCompositionScope extends Operation {
        public static final EndCompositionScope c = new EndCompositionScope(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            ((Function1) opIterator.b(0)).invoke((Composition) opIterator.b(1));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "anchor" : i == 1 ? "composition" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class EndCurrentGroup extends Operation {
        public static final EndCurrentGroup c;

        static {
            int i = 0;
            c = new EndCurrentGroup(i, i, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            slotWriter.i();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class EndMovableContentPlacement extends Operation {
        public static final EndMovableContentPlacement c;

        static {
            int i = 0;
            c = new EndMovableContentPlacement(i, i, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            OperationKt.a(slotWriter, applier, 0);
            slotWriter.i();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndResumingScope;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class EndResumingScope extends Operation {
        public static final EndResumingScope c;

        static {
            int i = 1;
            c = new EndResumingScope(0, i, i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            MutableVector mutableVector;
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) opIterator.b(0);
            MutableScatterMap mutableScatterMap = rememberEventDispatcher.g;
            if (mutableScatterMap == null || ((PausedCompositionRemembers) mutableScatterMap.e(recomposeScopeImpl)) == null) {
                return;
            }
            ArrayList arrayList = rememberEventDispatcher.k;
            if (arrayList != null && (mutableVector = (MutableVector) arrayList.remove(arrayList.size() - 1)) != null) {
                rememberEventDispatcher.c = mutableVector;
            }
            mutableScatterMap.k(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "scope" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class EnsureGroupStarted extends Operation {
        public static final EnsureGroupStarted c;

        static {
            int i = 1;
            c = new EnsureGroupStarted(0, i, i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            Anchor anchor = (Anchor) opIterator.b(0);
            anchor.getClass();
            slotWriter.k(slotWriter.c(anchor));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "anchor" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class EnsureRootGroupStarted extends Operation {
        public static final EnsureRootGroupStarted c;

        static {
            int i = 0;
            c = new EnsureRootGroupStarted(i, i, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            slotWriter.k(0);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class InsertNodeFixup extends Operation {
        public static final InsertNodeFixup c = new InsertNodeFixup(1, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            Object objInvoke = ((Function0) opIterator.b(0)).invoke();
            Anchor anchor = (Anchor) opIterator.b(1);
            int iA = opIterator.a(0);
            anchor.getClass();
            slotWriter.V(slotWriter.c(anchor), objInvoke);
            applier.f(iA, objInvoke);
            applier.i(objInvoke);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String b(int i) {
            return i == 0 ? "insertIndex" : super.b(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "factory" : i == 1 ? "groupAnchor" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class InsertSlots extends Operation {
        public static final InsertSlots c = new InsertSlots(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            SlotTable slotTable = (SlotTable) opIterator.b(1);
            Anchor anchor = (Anchor) opIterator.b(0);
            slotWriter.d();
            anchor.getClass();
            slotWriter.y(slotTable, slotTable.j(anchor));
            slotWriter.j();
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "anchor" : i == 1 ? "from" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class InsertSlotsWithFixups extends Operation {
        public static final InsertSlotsWithFixups c = new InsertSlotsWithFixups(0, 3, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            SlotTable slotTable = (SlotTable) opIterator.b(1);
            Anchor anchor = (Anchor) opIterator.b(0);
            FixupList fixupList = (FixupList) opIterator.b(2);
            SlotWriter slotWriterM = slotTable.m();
            try {
                if (!fixupList.b.e()) {
                    ComposerKt.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                }
                fixupList.f1674a.c(applier, slotWriterM, rememberEventDispatcher);
                slotWriterM.e(true);
                slotWriter.d();
                anchor.getClass();
                slotWriter.y(slotTable, slotTable.j(anchor));
                slotWriter.j();
            } catch (Throwable th) {
                slotWriterM.e(false);
                throw th;
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "anchor" : i == 1 ? "from" : i == 2 ? "fixups" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class MoveCurrentGroup extends Operation {
        public static final MoveCurrentGroup c = new MoveCurrentGroup(1, 0, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            Anchor anchor;
            int iC;
            int iA = opIterator.a(0);
            if (slotWriter.n != 0) {
                ComposerKt.c("Cannot move a group while inserting");
            }
            if (iA < 0) {
                ComposerKt.c("Parameter offset is out of bounds");
            }
            if (iA == 0) {
                return;
            }
            int i = slotWriter.t;
            int i2 = slotWriter.v;
            int i3 = slotWriter.u;
            int i4 = i;
            while (iA > 0) {
                i4 += slotWriter.b[(slotWriter.q(i4) * 5) + 3];
                if (i4 > i3) {
                    ComposerKt.c("Parameter offset is out of bounds");
                }
                iA--;
            }
            int i5 = slotWriter.b[(slotWriter.q(i4) * 5) + 3];
            int iF = slotWriter.f(slotWriter.q(slotWriter.t), slotWriter.b);
            int iF2 = slotWriter.f(slotWriter.q(i4), slotWriter.b);
            int i6 = i4 + i5;
            int iF3 = slotWriter.f(slotWriter.q(i6), slotWriter.b);
            int i7 = iF3 - iF2;
            slotWriter.v(i7, Math.max(slotWriter.t - 1, 0));
            slotWriter.u(i5);
            int[] iArr = slotWriter.b;
            int iQ = slotWriter.q(i6) * 5;
            ArraysKt.q(slotWriter.q(i) * 5, iQ, (i5 * 5) + iQ, iArr, iArr);
            if (i7 > 0) {
                Object[] objArr = slotWriter.c;
                int iG = slotWriter.g(iF2 + i7);
                System.arraycopy(objArr, iG, objArr, iF, slotWriter.g(iF3 + i7) - iG);
            }
            int i8 = iF2 + i7;
            int i9 = i8 - iF;
            int i10 = slotWriter.k;
            int i11 = slotWriter.l;
            int length = slotWriter.c.length;
            int i12 = slotWriter.m;
            int i13 = i + i5;
            int i14 = i;
            while (i14 < i13) {
                int iQ2 = slotWriter.q(i14);
                int i15 = i9;
                int[] iArr2 = iArr;
                iArr2[(iQ2 * 5) + 4] = SlotWriter.h(SlotWriter.h(slotWriter.f(iQ2, iArr) - i15, i12 < iQ2 ? 0 : i10, i11, length), slotWriter.k, slotWriter.l, slotWriter.c.length);
                i14++;
                i9 = i15;
                i10 = i10;
                iArr = iArr2;
            }
            int i16 = i6 + i5;
            int iN = slotWriter.n();
            int iB = SlotTableKt.b(i6, iN, slotWriter.d);
            ArrayList arrayList = new ArrayList();
            if (iB >= 0) {
                while (iB < slotWriter.d.size() && (iC = slotWriter.c((anchor = (Anchor) slotWriter.d.get(iB)))) >= i6 && iC < i16) {
                    arrayList.add(anchor);
                    slotWriter.d.remove(iB);
                }
            }
            int i17 = i - i6;
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                Anchor anchor2 = (Anchor) arrayList.get(i18);
                int iC2 = slotWriter.c(anchor2) + i17;
                if (iC2 >= slotWriter.g) {
                    anchor2.f1619a = -(iN - iC2);
                } else {
                    anchor2.f1619a = iC2;
                }
                slotWriter.d.add(SlotTableKt.b(iC2, iN, slotWriter.d), anchor2);
            }
            if (slotWriter.I(i6, i5)) {
                ComposerKt.c("Unexpectedly removed anchors");
            }
            slotWriter.l(i2, slotWriter.u, i);
            if (i7 > 0) {
                slotWriter.J(i8, i7, i6 - 1);
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String b(int i) {
            return i == 0 ? "offset" : super.b(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class MoveNode extends Operation {
        public static final MoveNode c = new MoveNode(3, 0, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            applier.e(opIterator.a(0), opIterator.a(1), opIterator.a(2));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String b(int i) {
            return i == 0 ? "from" : i == 1 ? "to" : i == 2 ? "count" : super.b(i);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "offset", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class ObjectParameter<T> {
        public final boolean equals(Object obj) {
            return obj instanceof ObjectParameter;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "ObjectParameter(offset=0)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class PostInsertNodeFixup extends Operation {
        public static final PostInsertNodeFixup c = new PostInsertNodeFixup(1, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            Anchor anchor = (Anchor) opIterator.b(0);
            int iA = opIterator.a(0);
            applier.j();
            anchor.getClass();
            applier.h(iA, slotWriter.C(slotWriter.c(anchor)));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String b(int i) {
            return i == 0 ? "insertIndex" : super.b(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "groupAnchor" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final ReleaseMovableGroupAtCurrent c = new ReleaseMovableGroupAtCurrent(0, 3, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            ControlledComposition controlledComposition = (ControlledComposition) opIterator.b(0);
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) opIterator.b(2);
            ((CompositionContext) opIterator.b(1)).m(movableContentStateReference, ComposerKt.f(controlledComposition, movableContentStateReference, slotWriter, null), applier);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "composition" : i == 1 ? "parentCompositionContext" : i == 2 ? "reference" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Remember extends Operation {
        public static final Remember c;

        static {
            int i = 1;
            c = new Remember(0, i, i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            rememberEventDispatcher.e((RememberObserverHolder) opIterator.b(0));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "value" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RememberPausingScope;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class RememberPausingScope extends Operation {
        static {
            int i = 1;
            new RememberPausingScope(0, i, i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) opIterator.b(0);
            PausedCompositionRemembers pausedCompositionRemembers = new PausedCompositionRemembers(rememberEventDispatcher.f1690a);
            MutableScatterMap mutableScatterMap = rememberEventDispatcher.g;
            if (mutableScatterMap == null) {
                long[] jArr = ScatterMapKt.f699a;
                mutableScatterMap = new MutableScatterMap();
                rememberEventDispatcher.g = mutableScatterMap;
            }
            mutableScatterMap.m(recomposeScopeImpl, pausedCompositionRemembers);
            rememberEventDispatcher.c.c(new RememberObserverHolder(pausedCompositionRemembers, null));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "scope" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class RemoveCurrentGroup extends Operation {
        public static final RemoveCurrentGroup c;

        static {
            int i = 0;
            c = new RemoveCurrentGroup(i, i, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            ComposerKt.h(slotWriter, rememberEventDispatcher);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class RemoveNode extends Operation {
        public static final RemoveNode c;

        static {
            int i = 2;
            c = new RemoveNode(i, 0, i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            applier.b(opIterator.a(0), opIterator.a(1));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String b(int i) {
            return i == 0 ? "removeIndex" : i == 1 ? "count" : super.b(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ResetSlots extends Operation {
        public static final ResetSlots c;

        static {
            int i = 0;
            c = new ResetSlots(i, i, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            if (slotWriter.n != 0) {
                ComposerKt.c("Cannot reset when inserting");
            }
            slotWriter.G();
            slotWriter.t = 0;
            slotWriter.u = slotWriter.m() - slotWriter.h;
            slotWriter.i = 0;
            slotWriter.j = 0;
            slotWriter.o = 0;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class SideEffect extends Operation {
        public static final SideEffect c;

        static {
            int i = 1;
            c = new SideEffect(0, i, i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            rememberEventDispatcher.e.c((Function0) opIterator.b(0));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "effect" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SkipToEndOfCurrentGroup extends Operation {
        public static final SkipToEndOfCurrentGroup c;

        static {
            int i = 0;
            c = new SkipToEndOfCurrentGroup(i, i, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            slotWriter.L();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$StartResumingScope;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class StartResumingScope extends Operation {
        public static final StartResumingScope c;

        static {
            int i = 1;
            c = new StartResumingScope(0, i, i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) opIterator.b(0);
            MutableScatterMap mutableScatterMap = rememberEventDispatcher.g;
            PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? (PausedCompositionRemembers) mutableScatterMap.e(recomposeScopeImpl) : null;
            if (pausedCompositionRemembers != null) {
                ArrayList arrayList = rememberEventDispatcher.k;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    rememberEventDispatcher.k = arrayList;
                }
                arrayList.add(rememberEventDispatcher.c);
                rememberEventDispatcher.c = pausedCompositionRemembers.e;
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "scope" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class TestOperation extends Operation {

        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/runtime/Applier;", "<anonymous parameter 1>", "Landroidx/compose/runtime/SlotWriter;", "<anonymous parameter 2>", "Landroidx/compose/runtime/RememberManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.changelist.Operation$TestOperation$1, reason: invalid class name */
        final class AnonymousClass1 extends Lambda implements Function3<Applier<?>, SlotWriter, RememberManager, Unit> {
            @Override // kotlin.jvm.functions.Function3
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return Unit.f24250a;
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            throw null;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String toString() {
            return "TestOperation(ints = " + this.f1675a + ", objects = " + this.b + ")@" + System.identityHashCode(this);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$TrimParentValues;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class TrimParentValues extends Operation {
        public static final TrimParentValues c = new TrimParentValues(1, 0, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            int iC;
            int iO;
            int iA = opIterator.a(0);
            int iO2 = slotWriter.o();
            int i = slotWriter.v;
            int iM = slotWriter.M(slotWriter.q(i), slotWriter.b);
            int iF = slotWriter.f(slotWriter.q(i + 1), slotWriter.b);
            for (int iMax = Math.max(iM, iF - iA); iMax < iF; iMax++) {
                Object obj = slotWriter.c[slotWriter.g(iMax)];
                if (obj instanceof RememberObserverHolder) {
                    int i2 = iO2 - iMax;
                    RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                    Anchor anchor = rememberObserverHolder.b;
                    if (anchor == null || !anchor.a()) {
                        iC = -1;
                        iO = -1;
                    } else {
                        iC = slotWriter.c(anchor);
                        iO = slotWriter.o() - slotWriter.O(iC);
                    }
                    rememberEventDispatcher.d(i2, iC, iO, rememberObserverHolder);
                } else if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).d();
                }
            }
            if (iA <= 0) {
                ComposerKt.c("Check failed");
            }
            int i3 = slotWriter.v;
            int iM2 = slotWriter.M(slotWriter.q(i3), slotWriter.b);
            int iF2 = slotWriter.f(slotWriter.q(i3 + 1), slotWriter.b) - iA;
            if (iF2 < iM2) {
                ComposerKt.c("Check failed");
            }
            slotWriter.J(iF2, iA, i3);
            int i4 = slotWriter.i;
            if (i4 >= iM2) {
                slotWriter.i = i4 - iA;
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String b(int i) {
            return i == 0 ? "count" : super.b(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class UpdateAnchoredValue extends Operation {
        public static final UpdateAnchoredValue c = new UpdateAnchoredValue(1, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            int iC;
            int iO;
            Object objB = opIterator.b(0);
            Anchor anchor = (Anchor) opIterator.b(1);
            int iA = opIterator.a(0);
            if (objB instanceof RememberObserverHolder) {
                rememberEventDispatcher.e((RememberObserverHolder) objB);
            }
            int iC2 = slotWriter.c(anchor);
            int iG = slotWriter.g(slotWriter.N(iC2, iA));
            Object[] objArr = slotWriter.c;
            Object obj = objArr[iG];
            objArr[iG] = objB;
            if (!(obj instanceof RememberObserverHolder)) {
                if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).d();
                    return;
                }
                return;
            }
            int iO2 = slotWriter.o() - slotWriter.N(iC2, iA);
            RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
            Anchor anchor2 = rememberObserverHolder.b;
            if (anchor2 == null || !anchor2.a()) {
                iC = -1;
                iO = -1;
            } else {
                iC = slotWriter.c(anchor2);
                iO = slotWriter.o() - slotWriter.O(iC);
            }
            rememberEventDispatcher.d(iO2, iC, iO, rememberObserverHolder);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String b(int i) {
            return i == 0 ? "groupSlotIndex" : super.b(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "value" : i == 1 ? "anchor" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class UpdateAuxData extends Operation {
        public static final UpdateAuxData c;

        static {
            int i = 1;
            c = new UpdateAuxData(0, i, i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            slotWriter.T(opIterator.b(0));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "data" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class UpdateNode extends Operation {
        public static final UpdateNode c = new UpdateNode(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            applier.a(opIterator.b(0), (Function2) opIterator.b(1));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "value" : i == 1 ? "block" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class UpdateValue extends Operation {
        public static final UpdateValue c = new UpdateValue(1, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            Object objB = opIterator.b(0);
            int iA = opIterator.a(0);
            if (objB instanceof RememberObserverHolder) {
                rememberEventDispatcher.e((RememberObserverHolder) objB);
            }
            int iG = slotWriter.g(slotWriter.N(slotWriter.t, iA));
            Object[] objArr = slotWriter.c;
            Object obj = objArr[iG];
            objArr[iG] = objB;
            if (obj instanceof RememberObserverHolder) {
                rememberEventDispatcher.d(slotWriter.o() - slotWriter.N(slotWriter.t, iA), -1, -1, (RememberObserverHolder) obj);
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).d();
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String b(int i) {
            return i == 0 ? "groupSlotIndex" : super.b(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i) {
            return i == 0 ? "value" : super.c(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class Ups extends Operation {
        public static final Ups c = new Ups(1, 0, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            int iA = opIterator.a(0);
            for (int i = 0; i < iA; i++) {
                applier.j();
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String b(int i) {
            return i == 0 ? "count" : super.b(i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "Landroidx/compose/runtime/changelist/Operation;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class UseCurrentNode extends Operation {
        public static final UseCurrentNode c;

        static {
            int i = 0;
            c = new UseCurrentNode(i, i, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
            applier.d();
        }
    }

    public Operation(int i, int i2) {
        this.f1675a = i;
        this.b = i2;
    }

    public abstract void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher);

    public String b(int i) {
        return "IntParameter(" + i + ')';
    }

    public String c(int i) {
        return "ObjectParameter(" + i + ')';
    }

    public String toString() {
        String strB = Reflection.f24268a.b(getClass()).B();
        return strB == null ? "" : strB;
    }

    public /* synthetic */ Operation(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
