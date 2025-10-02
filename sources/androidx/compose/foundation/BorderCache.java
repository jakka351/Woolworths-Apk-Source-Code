package androidx.compose.foundation;

import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/BorderCache;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final /* data */ class BorderCache {

    /* renamed from: a, reason: collision with root package name */
    public AndroidImageBitmap f827a = null;
    public AndroidCanvas b = null;
    public CanvasDrawScope c = null;
    public AndroidPath d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) obj;
        return Intrinsics.c(this.f827a, borderCache.f827a) && Intrinsics.c(this.b, borderCache.b) && Intrinsics.c(this.c, borderCache.c) && Intrinsics.c(this.d, borderCache.d);
    }

    public final Path g() {
        AndroidPath androidPath = this.d;
        if (androidPath != null) {
            return androidPath;
        }
        AndroidPath androidPathA = AndroidPath_androidKt.a();
        this.d = androidPathA;
        return androidPathA;
    }

    public final int hashCode() {
        AndroidImageBitmap androidImageBitmap = this.f827a;
        int iHashCode = (androidImageBitmap == null ? 0 : androidImageBitmap.hashCode()) * 31;
        AndroidCanvas androidCanvas = this.b;
        int iHashCode2 = (iHashCode + (androidCanvas == null ? 0 : androidCanvas.hashCode())) * 31;
        CanvasDrawScope canvasDrawScope = this.c;
        int iHashCode3 = (iHashCode2 + (canvasDrawScope == null ? 0 : canvasDrawScope.hashCode())) * 31;
        AndroidPath androidPath = this.d;
        return iHashCode3 + (androidPath != null ? androidPath.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f827a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
