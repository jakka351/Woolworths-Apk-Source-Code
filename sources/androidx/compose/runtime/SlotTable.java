package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {
    public int e;
    public int g;
    public int h;
    public boolean j;
    public int k;
    public HashMap m;
    public MutableIntObjectMap n;
    public int[] d = new int[0];
    public Object[] f = new Object[0];
    public final Object i = new Object();
    public ArrayList l = new ArrayList();

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final Iterable g() {
        return this;
    }

    public final Anchor h(int i) {
        if (this.j) {
            ComposerKt.c("use active SlotWriter to create an anchor location instead");
        }
        if (i < 0 || i >= this.e) {
            PreconditionsKt.a("Parameter index is out of range");
        }
        ArrayList arrayList = this.l;
        int iF = SlotTableKt.f(i, this.e, arrayList);
        if (iF >= 0) {
            return (Anchor) arrayList.get(iF);
        }
        Anchor anchor = new Anchor(i);
        arrayList.add(-(iF + 1), anchor);
        return anchor;
    }

    @Override // java.lang.Iterable
    public final Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.e);
    }

    public final int j(Anchor anchor) {
        if (this.j) {
            ComposerKt.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.a()) {
            PreconditionsKt.a("Anchor refers to a group that was removed");
        }
        return anchor.f1619a;
    }

    public final void k() {
        this.m = new HashMap();
    }

    public final SlotReader l() {
        if (this.j) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.h++;
        return new SlotReader(this);
    }

    public final SlotWriter m() {
        if (this.j) {
            ComposerKt.c("Cannot start a writer when another writer is pending");
        }
        if (this.h > 0) {
            ComposerKt.c("Cannot start a writer when a reader is pending");
        }
        this.j = true;
        this.k++;
        return new SlotWriter(this);
    }

    public final boolean n(Anchor anchor) {
        if (!anchor.a()) {
            return false;
        }
        int iF = SlotTableKt.f(anchor.f1619a, this.e, this.l);
        return iF >= 0 && Intrinsics.c(this.l.get(iF), anchor);
    }

    public final GroupSourceInformation o(int i) {
        int i2;
        ArrayList arrayList;
        int iF;
        HashMap map = this.m;
        if (map != null) {
            if (this.j) {
                ComposerKt.c("use active SlotWriter to crate an anchor for location instead");
            }
            Anchor anchor = (i < 0 || i >= (i2 = this.e) || (iF = SlotTableKt.f(i, i2, (arrayList = this.l))) < 0) ? null : (Anchor) arrayList.get(iF);
            if (anchor != null) {
                return (GroupSourceInformation) map.get(anchor);
            }
        }
        return null;
    }
}
