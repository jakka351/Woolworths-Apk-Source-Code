package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class UpdatableAnimationState {
    public static final AnimationVector1D f = new AnimationVector1D(BitmapDescriptorFactory.HUE_RED);

    /* renamed from: a, reason: collision with root package name */
    public final VectorizedAnimationSpec f909a;
    public long b = Long.MIN_VALUE;
    public AnimationVector1D c = f;
    public boolean d;
    public float e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "", "VisibilityThreshold", "F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public UpdatableAnimationState(SpringSpec springSpec) {
        this.f909a = springSpec.a(VectorConvertersKt.f788a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.a(r2.getF()).e(r0, r2) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: all -> 0x00f9, PHI: r0 r2 r13 r14 r15
  0x0084: PHI (r0v9 kotlin.jvm.functions.Function0) = (r0v3 kotlin.jvm.functions.Function0), (r0v10 kotlin.jvm.functions.Function0) binds: [B:31:0x007d, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
  (r2v2 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
  (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
 binds: [B:31:0x007d, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r13v6 float) = (r13v3 float), (r13v7 float) binds: [B:31:0x007d, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r14v6 kotlin.jvm.functions.Function1) = (r14v3 kotlin.jvm.functions.Function1), (r14v7 kotlin.jvm.functions.Function1) binds: [B:31:0x007d, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r15v19 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
  (r15v8 androidx.compose.foundation.gestures.UpdatableAnimationState)
  (r15v20 androidx.compose.foundation.gestures.UpdatableAnimationState)
 binds: [B:31:0x007d, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00f9, blocks: (B:38:0x00ba, B:32:0x0084, B:35:0x0096), top: B:59:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[PHI: r0 r2 r14 r15
  0x0091: PHI (r0v4 kotlin.jvm.functions.Function0) = (r0v9 kotlin.jvm.functions.Function0), (r0v10 kotlin.jvm.functions.Function0) binds: [B:33:0x008f, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r2v3 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
  (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
  (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
 binds: [B:33:0x008f, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r14v4 kotlin.jvm.functions.Function1) = (r14v6 kotlin.jvm.functions.Function1), (r14v7 kotlin.jvm.functions.Function1) binds: [B:33:0x008f, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r15v11 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
  (r15v19 androidx.compose.foundation.gestures.UpdatableAnimationState)
  (r15v20 androidx.compose.foundation.gestures.UpdatableAnimationState)
 binds: [B:33:0x008f, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: all -> 0x00f9, TryCatch #2 {all -> 0x00f9, blocks: (B:38:0x00ba, B:32:0x0084, B:35:0x0096), top: B:59:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b7 -> B:59:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 r13, kotlin.jvm.functions.Function0 r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.a(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
