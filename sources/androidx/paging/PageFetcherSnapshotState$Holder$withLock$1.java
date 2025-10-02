package androidx.paging;

import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshotState$Holder", f = "PageFetcherSnapshotState.kt", l = {WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE}, m = "withLock")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PageFetcherSnapshotState$Holder$withLock$1<T> extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.q |= Integer.MIN_VALUE;
        throw null;
    }
}
