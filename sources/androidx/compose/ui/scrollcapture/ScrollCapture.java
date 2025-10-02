package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.z;
import androidx.camera.core.internal.compat.workaround.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.unit.IntRectKt;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/scrollcapture/ScrollCapture;", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScrollCapture implements ComposeScrollCaptureCallback.ScrollCaptureSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f2007a = SnapshotStateKt.f(Boolean.FALSE);

    public final void a(AndroidComposeView androidComposeView, SemanticsOwner semanticsOwner, CoroutineContext coroutineContext, Consumer consumer) {
        MutableVector mutableVector = new MutableVector(new ScrollCaptureCandidate[16], 0);
        ScrollCapture_androidKt.a(semanticsOwner.a(), 0, new ScrollCapture$onScrollCaptureSearch$1(mutableVector));
        mutableVector.o(new a(new Function1[]{ScrollCapture$onScrollCaptureSearch$2.h, ScrollCapture$onScrollCaptureSearch$3.h}, 2));
        int i = mutableVector.f;
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (i == 0 ? null : mutableVector.d[i - 1]);
        if (scrollCaptureCandidate == null) {
            return;
        }
        ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(scrollCaptureCandidate.getF2008a(), scrollCaptureCandidate.getC(), CoroutineScopeKt.a(coroutineContext), this, androidComposeView);
        LayoutCoordinates layoutCoordinatesA = scrollCaptureCandidate.a();
        Rect rectD = LayoutCoordinatesKt.c(layoutCoordinatesA).D(layoutCoordinatesA, true);
        long jC = scrollCaptureCandidate.getC().c();
        ScrollCaptureTarget scrollCaptureTargetI = z.i(androidComposeView, RectHelper_androidKt.b(IntRectKt.b(rectD)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), composeScrollCaptureCallback);
        scrollCaptureTargetI.setScrollBounds(RectHelper_androidKt.b(scrollCaptureCandidate.getC()));
        consumer.accept(scrollCaptureTargetI);
    }
}
