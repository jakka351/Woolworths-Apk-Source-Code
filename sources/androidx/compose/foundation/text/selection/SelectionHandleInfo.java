package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionHandleInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Handle f1210a;
    public final long b;
    public final SelectionHandleAnchor c;
    public final boolean d;

    public SelectionHandleInfo(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.f1210a = handle;
        this.b = j;
        this.c = selectionHandleAnchor;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.f1210a == selectionHandleInfo.f1210a && Offset.c(this.b, selectionHandleInfo.b) && this.c == selectionHandleInfo.c && this.d == selectionHandleInfo.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + androidx.camera.core.impl.b.b(this.f1210a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f1210a);
        sb.append(", position=");
        sb.append((Object) Offset.j(this.b));
        sb.append(", anchor=");
        sb.append(this.c);
        sb.append(", visible=");
        return androidx.camera.core.impl.b.s(sb, this.d, ')');
    }
}
