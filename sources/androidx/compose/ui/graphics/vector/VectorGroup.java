package androidx.compose.ui.graphics.vector;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Immutable
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorGroup;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, KMappedMarker {
    public final String d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final List l;
    public final List m;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/ui/graphics/vector/VectorGroup$iterator$1", "", "Landroidx/compose/ui/graphics/vector/VectorNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorGroup$iterator$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 implements Iterator<VectorNode>, KMappedMarker {
        public final Iterator d;

        public AnonymousClass1(VectorGroup vectorGroup) {
            this.d = vectorGroup.m.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final VectorNode next() {
            return (VectorNode) this.d.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public VectorGroup(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.d = str;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = f5;
        this.j = f6;
        this.k = f7;
        this.l = list;
        this.m = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) obj;
            return Intrinsics.c(this.d, vectorGroup.d) && this.e == vectorGroup.e && this.f == vectorGroup.f && this.g == vectorGroup.g && this.h == vectorGroup.h && this.i == vectorGroup.i && this.j == vectorGroup.j && this.k == vectorGroup.k && Intrinsics.c(this.l, vectorGroup.l) && Intrinsics.c(this.m, vectorGroup.m);
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode() + b.d(a.b(this.k, a.b(this.j, a.b(this.i, a.b(this.h, a.b(this.g, a.b(this.f, a.b(this.e, this.d.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.l);
    }

    @Override // java.lang.Iterable
    public final Iterator<VectorNode> iterator() {
        return new AnonymousClass1(this);
    }
}
