package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class LegacyDragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1 extends FunctionReferenceImpl implements Function1<CacheDrawScope, DrawResult> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((CacheDrawScopeDragShadowCallback) this.receiver).a((CacheDrawScope) obj);
    }
}
