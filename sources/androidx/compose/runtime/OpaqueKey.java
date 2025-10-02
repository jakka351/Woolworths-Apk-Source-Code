package androidx.compose.runtime;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/OpaqueKey;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OpaqueKey {

    /* renamed from: a, reason: collision with root package name */
    public final String f1652a;

    public OpaqueKey(String str) {
        this.f1652a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpaqueKey) && Intrinsics.c(this.f1652a, ((OpaqueKey) obj).f1652a);
    }

    public final int hashCode() {
        return this.f1652a.hashCode();
    }

    public final String toString() {
        return b.r(new StringBuilder("OpaqueKey(key="), this.f1652a, ')');
    }
}
