package coil.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcoil/compose/RealSubcomposeAsyncImageScope;", "Lcoil/compose/SubcomposeAsyncImageScope;", "Landroidx/compose/foundation/layout/BoxScope;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class RealSubcomposeAsyncImageScope implements SubcomposeAsyncImageScope, BoxScope {
    @Override // coil.compose.SubcomposeAsyncImageScope
    public final float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public final AsyncImagePainter b() {
        return null;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public final ColorFilter c() {
        return null;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public final ContentScale d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RealSubcomposeAsyncImageScope) {
            throw null;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier g(Modifier modifier, Alignment alignment) {
        throw null;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public final Alignment getAlignment() {
        return null;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public final String getContentDescription() {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
