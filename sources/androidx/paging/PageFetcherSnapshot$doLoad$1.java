package androidx.paging;

import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {647, 658, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, 424, 679, 720, 472, 741, 495, 521, 752}, m = "doLoad")
/* loaded from: classes2.dex */
final class PageFetcherSnapshot$doLoad$1 extends ContinuationImpl {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ PageFetcherSnapshot D;
    public int E;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public MutexImpl z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$doLoad$1(PageFetcherSnapshot pageFetcherSnapshot, Continuation continuation) {
        super(continuation);
        this.D = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return PageFetcherSnapshot.b(this.D, null, null, this);
    }
}
