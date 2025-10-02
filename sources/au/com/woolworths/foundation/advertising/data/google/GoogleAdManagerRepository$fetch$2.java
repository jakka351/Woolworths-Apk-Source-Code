package au.com.woolworths.foundation.advertising.data.google;

import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository", f = "GoogleAdManagerRepository.kt", l = {93}, m = "fetch")
/* loaded from: classes4.dex */
final class GoogleAdManagerRepository$fetch$2<T> extends ContinuationImpl {
    public String p;
    public String q;
    public GoogleAdCustomTargeting r;
    public Class s;
    public /* synthetic */ Object t;
    public final /* synthetic */ GoogleAdManagerRepository u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerRepository$fetch$2(GoogleAdManagerRepository googleAdManagerRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = googleAdManagerRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(null, null, null, null, null, this);
    }
}
