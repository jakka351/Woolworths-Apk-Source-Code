package au.com.woolworths.foundation.ui.image.gallery;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.ColorPainter;
import au.com.woolworths.feature.product.list.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"", "scale", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "isZoomed", "image-gallery_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GalleryImagesCarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.util.List r24, final androidx.compose.ui.graphics.painter.ColorPainter r25, final kotlin.jvm.functions.Function2 r26, final androidx.compose.foundation.pager.PagerState r27, kotlin.jvm.functions.Function1 r28, androidx.compose.ui.Modifier r29, final kotlin.jvm.functions.Function2 r30, boolean r31, boolean r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt.a(java.util.List, androidx.compose.ui.graphics.painter.ColorPainter, kotlin.jvm.functions.Function2, androidx.compose.foundation.pager.PagerState, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(List list, PagerState pagerState, ColorPainter colorPainter, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        PagerState pagerState2;
        Function1 function12;
        LazyListState lazyListState;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1844098921);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            pagerState2 = pagerState;
            i2 |= composerImplV.n(pagerState2) ? 32 : 16;
        } else {
            pagerState2 = pagerState;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(colorPainter) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function12 = function1;
            i2 |= composerImplV.I(function12) ? 16384 : 8192;
        } else {
            function12 = function1;
        }
        int i3 = i2;
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objG;
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(8);
            composerImplV.o(-1224400529);
            boolean zI = ((i3 & 112) == 32) | composerImplV.I(list) | composerImplV.I(coroutineScope) | composerImplV.n(lazyListStateA) | ((57344 & i3) == 16384) | composerImplV.I(colorPainter);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                lazyListState = lazyListStateA;
                c cVar = new c(list, pagerState2, coroutineScope, lazyListState, function12, colorPainter);
                composerImplV.A(cVar);
                objG2 = cVar;
            } else {
                lazyListState = lazyListStateA;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyDslKt.d(modifier, lazyListState, null, false, spacedAlignedG, null, null, false, null, (Function1) objG2, composerImpl, ((i3 >> 9) & 14) | 24576, 492);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(list, pagerState, colorPainter, modifier, function1, i);
        }
    }
}
