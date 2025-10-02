package coil3.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/compose/RealSubcomposeAsyncImageScope;", "Lcoil3/compose/SubcomposeAsyncImageScope;", "Landroidx/compose/foundation/layout/BoxScope;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RealSubcomposeAsyncImageScope implements SubcomposeAsyncImageScope, BoxScope {

    /* renamed from: a, reason: collision with root package name */
    public final BoxScope f13067a;
    public final AsyncImagePainter b;
    public final String c;
    public final Alignment d;
    public final ContentScale e;

    public RealSubcomposeAsyncImageScope(BoxScope boxScope, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale) {
        this.f13067a = boxScope;
        this.b = asyncImagePainter;
        this.c = str;
        this.d = alignment;
        this.e = contentScale;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    public final float a() {
        return 1.0f;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    /* renamed from: b, reason: from getter */
    public final AsyncImagePainter getB() {
        return this.b;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    public final ColorFilter c() {
        return null;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    /* renamed from: d, reason: from getter */
    public final ContentScale getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealSubcomposeAsyncImageScope)) {
            return false;
        }
        RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope = (RealSubcomposeAsyncImageScope) obj;
        return Intrinsics.c(this.f13067a, realSubcomposeAsyncImageScope.f13067a) && this.b.equals(realSubcomposeAsyncImageScope.b) && Intrinsics.c(this.c, realSubcomposeAsyncImageScope.c) && Intrinsics.c(this.d, realSubcomposeAsyncImageScope.d) && Intrinsics.c(this.e, realSubcomposeAsyncImageScope.e) && Float.compare(1.0f, 1.0f) == 0;
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier g(Modifier modifier, Alignment alignment) {
        return this.f13067a.g(modifier, alignment);
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    /* renamed from: getAlignment, reason: from getter */
    public final Alignment getD() {
        return this.d;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    /* renamed from: getContentDescription, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f13067a.hashCode() * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(true) + android.support.v4.media.session.a.b(1.0f, (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 961);
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    public final boolean p() {
        return true;
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.f13067a + ", painter=" + this.b + ", contentDescription=" + this.c + ", alignment=" + this.d + ", contentScale=" + this.e + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
