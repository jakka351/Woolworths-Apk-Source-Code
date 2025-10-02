package au.com.woolworths.foundation.advertising.data.google;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor", f = "GoogleAdManagerInteractor.kt", l = {86, 94}, m = "resolve")
/* loaded from: classes4.dex */
final class GoogleAdManagerInteractor$resolve$1 extends ContinuationImpl {
    public List p;
    public Object q;
    public CopyOnWriteArrayList r;
    public /* synthetic */ Object s;
    public final /* synthetic */ GoogleAdManagerInteractor t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerInteractor$resolve$1(GoogleAdManagerInteractor googleAdManagerInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = googleAdManagerInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.i(null, null, false, this);
    }
}
