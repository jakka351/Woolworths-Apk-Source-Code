package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f872a = new MutableVector(new ContentInViewNode.Request[16], 0);

    public final void a(CancellationException cancellationException) {
        MutableVector mutableVector = this.f872a;
        int i = mutableVector.f;
        CancellableContinuation[] cancellableContinuationArr = new CancellableContinuation[i];
        for (int i2 = 0; i2 < i; i2++) {
            cancellableContinuationArr[i2] = ((ContentInViewNode.Request) mutableVector.d[i2]).continuation;
        }
        for (int i3 = 0; i3 < i; i3++) {
            cancellableContinuationArr[i3].cancel(cancellationException);
        }
        if (mutableVector.f == 0) {
            return;
        }
        InlineClassHelperKt.c("uncancelled requests present");
    }

    public final void b() {
        MutableVector mutableVector = this.f872a;
        IntRange intRangeO = RangesKt.o(0, mutableVector.f);
        int i = intRangeO.d;
        int i2 = intRangeO.e;
        if (i <= i2) {
            while (true) {
                ((ContentInViewNode.Request) mutableVector.d[i]).continuation.resumeWith(Unit.f24250a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        mutableVector.h();
    }
}
