package androidx.window.layout;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/WindowLayoutInfo;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WindowLayoutInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3889a;

    public WindowLayoutInfo(List list) {
        this.f3889a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !WindowLayoutInfo.class.equals(obj.getClass())) {
            return false;
        }
        return this.f3889a.equals(((WindowLayoutInfo) obj).f3889a);
    }

    public final int hashCode() {
        return this.f3889a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.M((Iterable) this.f3889a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
