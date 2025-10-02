package coil.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;

@LayoutScopeMarker
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcoil/compose/SubcomposeAsyncImageScope;", "Landroidx/compose/foundation/layout/BoxScope;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SubcomposeAsyncImageScope extends BoxScope {
    float a();

    AsyncImagePainter b();

    ColorFilter c();

    ContentScale d();

    Alignment getAlignment();

    String getContentDescription();
}
