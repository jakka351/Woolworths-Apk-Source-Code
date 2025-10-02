package androidx.activity;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "hint", "Landroid/graphics/Rect;", "emit", "(Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PipHintTrackerKt$trackPipAnimationHintView$2<T> implements FlowCollector {
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Rect hint = (Rect) obj;
        Intrinsics.h(null, "activity");
        Intrinsics.h(hint, "hint");
        new PictureInPictureParams.Builder().setSourceRectHint(hint).build();
        throw null;
    }
}
