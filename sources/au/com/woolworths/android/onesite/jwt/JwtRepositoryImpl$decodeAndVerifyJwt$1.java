package au.com.woolworths.android.onesite.jwt;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl", f = "JwtRepositoryImpl.kt", l = {31}, m = "decodeAndVerifyJwt")
/* loaded from: classes3.dex */
final class JwtRepositoryImpl$decodeAndVerifyJwt$1 extends ContinuationImpl {
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ JwtRepositoryImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JwtRepositoryImpl$decodeAndVerifyJwt$1(JwtRepositoryImpl jwtRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = jwtRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, this);
    }
}
