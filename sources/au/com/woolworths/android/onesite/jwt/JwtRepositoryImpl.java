package au.com.woolworths.android.onesite.jwt;

import android.util.Base64;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/jwt/JwtRepositoryImpl;", "Lau/com/woolworths/android/onesite/jwt/JwtRepository;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class JwtRepositoryImpl implements JwtRepository {

    /* renamed from: a, reason: collision with root package name */
    public final JwtApi f4260a;

    public JwtRepositoryImpl(JwtApi jwtApi) {
        Intrinsics.h(jwtApi, "jwtApi");
        this.f4260a = jwtApi;
    }

    public static String b(String str) {
        try {
            byte[] bArrDecode = Base64.decode((String) StringsKt.U(str, new char[]{JwtParser.SEPARATOR_CHAR}).get(1), 8);
            Intrinsics.g(bArrDecode, "decode(...)");
            return new String(bArrDecode, Charsets.f24671a);
        } catch (IllegalArgumentException e) {
            throw new RewardsJwtException("Error decoding JWT payload", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws au.com.woolworths.android.onesite.network.NoConnectivityException, java.lang.IllegalArgumentException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl$decodeAndVerifyJwt$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl$decodeAndVerifyJwt$1 r0 = (au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl$decodeAndVerifyJwt$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl$decodeAndVerifyJwt$1 r0 = new au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl$decodeAndVerifyJwt$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.p
            kotlin.ResultKt.b(r6)     // Catch: io.jsonwebtoken.JwtException -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L65
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r6)
            r0.p = r5     // Catch: io.jsonwebtoken.JwtException -> L29
            r0.s = r3     // Catch: io.jsonwebtoken.JwtException -> L29
            java.lang.Object r6 = r4.c(r0)     // Catch: io.jsonwebtoken.JwtException -> L29
            if (r6 != r1) goto L41
            return r1
        L41:
            au.com.woolworths.android.onesite.jwt.JwksKeyResponse r6 = (au.com.woolworths.android.onesite.jwt.JwksKeyResponse) r6     // Catch: io.jsonwebtoken.JwtException -> L29
            io.jsonwebtoken.JwtParserBuilder r0 = io.jsonwebtoken.Jwts.parserBuilder()     // Catch: io.jsonwebtoken.JwtException -> L29
            au.com.woolworths.android.onesite.jwt.RsaSigningKeyResolver r1 = new au.com.woolworths.android.onesite.jwt.RsaSigningKeyResolver     // Catch: io.jsonwebtoken.JwtException -> L29
            java.util.List r6 = r6.getKeys()     // Catch: io.jsonwebtoken.JwtException -> L29
            r1.<init>(r6)     // Catch: io.jsonwebtoken.JwtException -> L29
            io.jsonwebtoken.JwtParserBuilder r6 = r0.setSigningKeyResolver(r1)     // Catch: io.jsonwebtoken.JwtException -> L29
            io.jsonwebtoken.JwtParser r6 = r6.build()     // Catch: io.jsonwebtoken.JwtException -> L29
            r6.parseClaimsJws(r5)     // Catch: io.jsonwebtoken.JwtException -> L29
            au.com.woolworths.android.onesite.jwt.RewardsJwtResponse$Verified r6 = new au.com.woolworths.android.onesite.jwt.RewardsJwtResponse$Verified     // Catch: io.jsonwebtoken.JwtException -> L29
            java.lang.String r5 = b(r5)     // Catch: io.jsonwebtoken.JwtException -> L29
            r6.<init>(r5)     // Catch: io.jsonwebtoken.JwtException -> L29
            return r6
        L65:
            au.com.woolworths.android.onesite.jwt.RewardsJwtResponse$Rejected r6 = new au.com.woolworths.android.onesite.jwt.RewardsJwtResponse$Rejected
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws au.com.woolworths.android.onesite.network.NoConnectivityException {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl$resolvePublicKeys$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl$resolvePublicKeys$1 r0 = (au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl$resolvePublicKeys$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl$resolvePublicKeys$1 r0 = new au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl$resolvePublicKeys$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            java.lang.String r3 = "Error retrieving public keys"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 retrofit2.HttpException -> L2b java.io.IOException -> L2d
            goto L45
        L29:
            r6 = move-exception
            goto L61
        L2b:
            r6 = move-exception
            goto L48
        L2d:
            r6 = move-exception
            goto L5b
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.android.onesite.jwt.JwtApi r6 = r5.f4260a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 retrofit2.HttpException -> L2b java.io.IOException -> L2d
            r0.r = r4     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 retrofit2.HttpException -> L2b java.io.IOException -> L2d
            java.lang.Object r6 = r6.a(r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 retrofit2.HttpException -> L2b java.io.IOException -> L2d
            if (r6 != r1) goto L45
            return r1
        L45:
            au.com.woolworths.android.onesite.jwt.JwksKeyResponse r6 = (au.com.woolworths.android.onesite.jwt.JwksKeyResponse) r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 retrofit2.HttpException -> L2b java.io.IOException -> L2d
            return r6
        L48:
            au.com.woolworths.android.onesite.network.ServerError r0 = new au.com.woolworths.android.onesite.network.ServerError     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 au.com.woolworths.android.onesite.network.NoConnectivityException -> L59
            au.com.woolworths.android.onesite.network.ServerErrorCode r1 = au.com.woolworths.android.onesite.network.ServerErrorCode.e     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 au.com.woolworths.android.onesite.network.NoConnectivityException -> L59
            java.lang.String r2 = r6.getMessage()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 au.com.woolworths.android.onesite.network.NoConnectivityException -> L59
            r0.<init>(r1, r2)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 au.com.woolworths.android.onesite.network.NoConnectivityException -> L59
            au.com.woolworths.android.onesite.network.ServerErrorException r1 = new au.com.woolworths.android.onesite.network.ServerErrorException     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 au.com.woolworths.android.onesite.network.NoConnectivityException -> L59
            r1.<init>(r0, r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 au.com.woolworths.android.onesite.network.NoConnectivityException -> L59
            throw r1     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 au.com.woolworths.android.onesite.network.NoConnectivityException -> L59
        L59:
            r6 = move-exception
            goto L67
        L5b:
            au.com.woolworths.android.onesite.network.NoConnectivityException r0 = new au.com.woolworths.android.onesite.network.NoConnectivityException     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 au.com.woolworths.android.onesite.network.NoConnectivityException -> L59
            r0.<init>(r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 au.com.woolworths.android.onesite.network.NoConnectivityException -> L59
            throw r0     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L29 au.com.woolworths.android.onesite.network.NoConnectivityException -> L59
        L61:
            au.com.woolworths.android.onesite.jwt.RewardsJwtException r0 = new au.com.woolworths.android.onesite.jwt.RewardsJwtException
            r0.<init>(r3, r6)
            throw r0
        L67:
            au.com.woolworths.android.onesite.jwt.RewardsJwtException r0 = new au.com.woolworths.android.onesite.jwt.RewardsJwtException
            r0.<init>(r3, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
