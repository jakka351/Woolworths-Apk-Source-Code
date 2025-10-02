package au.com.woolworths.android.onesite.jwt;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl", f = "JwtRepositoryImpl.kt", l = {56}, m = "resolvePublicKeys")
/* loaded from: classes3.dex */
final class JwtRepositoryImpl$resolvePublicKeys$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ JwtRepositoryImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JwtRepositoryImpl$resolvePublicKeys$1(JwtRepositoryImpl jwtRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = jwtRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(this);
    }
}
