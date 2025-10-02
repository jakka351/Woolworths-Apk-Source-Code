package au.com.woolworths.foundation.shop.instore.presence.util;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.instore.presence.util.DurationKt", f = "Duration.kt", l = {13, 17}, m = "coerceDuration")
/* loaded from: classes4.dex */
final class DurationKt$coerceDuration$1<T> extends ContinuationImpl {
    public long p;
    public long q;
    public Ref.ObjectRef r;
    public Ref.ObjectRef s;
    public /* synthetic */ Object t;
    public int u;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return DurationKt.a(0L, null, this);
    }
}
