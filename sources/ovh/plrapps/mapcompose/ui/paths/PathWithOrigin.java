package ovh.plrapps.mapcompose.ui.paths;

import android.graphics.Path;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/paths/PathWithOrigin;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class PathWithOrigin {

    /* renamed from: a, reason: collision with root package name */
    public final Path f26950a;
    public final long b;

    public PathWithOrigin(Path path, long j) {
        this.f26950a = path;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathWithOrigin)) {
            return false;
        }
        PathWithOrigin pathWithOrigin = (PathWithOrigin) obj;
        return Intrinsics.c(this.f26950a, pathWithOrigin.f26950a) && IntOffset.b(this.b, pathWithOrigin.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f26950a.hashCode() * 31);
    }

    public final String toString() {
        return "PathWithOrigin(path=" + this.f26950a + ", origin=" + IntOffset.e(this.b) + ")";
    }
}
