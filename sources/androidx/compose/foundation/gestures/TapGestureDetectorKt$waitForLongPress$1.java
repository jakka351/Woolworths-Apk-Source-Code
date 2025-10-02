package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {KyberEngine.KyberPolyBytes}, m = "waitForLongPress")
/* loaded from: classes2.dex */
final class TapGestureDetectorKt$waitForLongPress$1 extends ContinuationImpl {
    public Ref.ObjectRef p;
    public /* synthetic */ Object q;
    public int r;

    public TapGestureDetectorKt$waitForLongPress$1(BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.j(null, null, this);
    }
}
