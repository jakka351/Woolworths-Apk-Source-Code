package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@InternalComposeApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/MovableContentStateReference;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MovableContentStateReference {

    /* renamed from: a, reason: collision with root package name */
    public final MovableContent f1647a;
    public final Object b;
    public final CompositionImpl c;
    public final SlotTable d;
    public final Anchor e;
    public Object f;
    public final PersistentCompositionLocalMap g;
    public final List h;

    public MovableContentStateReference(MovableContent movableContent, Object obj, CompositionImpl compositionImpl, SlotTable slotTable, Anchor anchor, List list, PersistentCompositionLocalMap persistentCompositionLocalMap, ArrayList arrayList) {
        this.f1647a = movableContent;
        this.b = obj;
        this.c = compositionImpl;
        this.d = slotTable;
        this.e = anchor;
        this.f = list;
        this.g = persistentCompositionLocalMap;
        this.h = arrayList;
    }

    /* renamed from: a, reason: from getter */
    public final Anchor getE() {
        return this.e;
    }

    public final ControlledComposition b() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final MovableContent getF1647a() {
        return this.f1647a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List d() {
        return this.f;
    }

    /* renamed from: e, reason: from getter */
    public final List getH() {
        return this.h;
    }

    /* renamed from: f, reason: from getter */
    public final Object getB() {
        return this.b;
    }

    /* renamed from: g, reason: from getter */
    public final SlotTable getD() {
        return this.d;
    }
}
