package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/LayoutReference;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class LayoutReference {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2247a;

    public LayoutReference(Object obj) {
        this.f2247a = obj;
        new LinkedHashMap();
    }

    /* renamed from: a, reason: from getter */
    public Object getF2247a() {
        return this.f2247a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutReference) && Intrinsics.c(getF2247a(), ((LayoutReference) obj).getF2247a());
    }

    public final int hashCode() {
        return getF2247a().hashCode();
    }
}
