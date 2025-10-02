package androidx.compose.material3.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/internal/MapDraggableAnchors;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/material3/internal/DraggableAnchors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class MapDraggableAnchors<T> implements DraggableAnchors<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Map f1560a;

    public MapDraggableAnchors(Map map) {
        this.f1560a = map;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final Object a(float f, boolean z) {
        T next;
        Iterator<T> it = this.f1560a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z ? fFloatValue - f : f - fFloatValue;
                if (f2 < BitmapDescriptorFactory.HUE_RED) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? fFloatValue2 - f : f - fFloatValue2;
                    if (f3 < BitmapDescriptorFactory.HUE_RED) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final Object b(float f) {
        T next;
        Iterator<T> it = this.f1560a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final float c(Object obj) {
        Float f = (Float) this.f1560a.get(obj);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final boolean d(Object obj) {
        return this.f1560a.containsKey(obj);
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final float e() {
        Float fW = CollectionsKt.W(this.f1560a.values());
        if (fW != null) {
            return fW.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapDraggableAnchors)) {
            return false;
        }
        return Intrinsics.c(this.f1560a, ((MapDraggableAnchors) obj).f1560a);
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final float f() {
        Float fU = CollectionsKt.U(this.f1560a.values());
        if (fU != null) {
            return fU.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final int getSize() {
        return this.f1560a.size();
    }

    public final int hashCode() {
        return this.f1560a.hashCode() * 31;
    }

    public final String toString() {
        return android.support.v4.media.session.a.u(new StringBuilder("MapDraggableAnchors("), this.f1560a, ')');
    }
}
