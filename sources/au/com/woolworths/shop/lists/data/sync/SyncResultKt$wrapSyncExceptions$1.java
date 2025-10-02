package au.com.woolworths.shop.lists.data.sync;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.sync.SyncResultKt", f = "SyncResult.kt", l = {18}, m = "wrapSyncExceptions")
/* loaded from: classes4.dex */
final class SyncResultKt$wrapSyncExceptions$1<T> extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.q |= Integer.MIN_VALUE;
        return SyncResultKt.a(null, this);
    }
}
