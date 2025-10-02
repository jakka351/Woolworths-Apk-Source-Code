package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {226}, m = "clearSource$lifecycle_livedata_release")
/* loaded from: classes2.dex */
final class CoroutineLiveData$clearSource$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CoroutineLiveData q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$clearSource$1(CoroutineLiveData coroutineLiveData, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = coroutineLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.p(this);
    }
}
