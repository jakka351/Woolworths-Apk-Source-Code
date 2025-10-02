package me.oriient.internal.services.auth;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.rest.HttpResponse;
import me.oriient.internal.infra.rest.PostRequestBuilder;
import me.oriient.internal.infra.rest.PutRequestBuilder;
import me.oriient.internal.infra.rest.RequestBuilder;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001VB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0080\u0001\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e\"\b\b\u0000\u0010\u0006*\u00020\u00052\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2?\u0010\u0011\u001a;\b\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00100\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0080\u0001\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e\"\b\b\u0000\u0010\u0006*\u00020\u00052\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2?\u0010\u0015\u001a;\b\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00100\fH\u0082@¢\u0006\u0004\b\u0016\u0010\u0013J\u0080\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e\"\b\b\u0000\u0010\u0006*\u00020\u00052\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2?\u0010\u0018\u001a;\b\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00100\fH\u0082@¢\u0006\u0004\b\u0019\u0010\u0013J)\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0#H\u0002¢\u0006\u0004\b%\u0010&J5\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000f0\u000e2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0096@¢\u0006\u0004\b(\u0010)J5\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000f0\u000e2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0096@¢\u0006\u0004\b+\u0010)J5\u0010,\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000f0\u000e2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0096@¢\u0006\u0004\b,\u0010)J5\u0010-\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000f0\u000e2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0096@¢\u0006\u0004\b-\u0010)J5\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000f0\u000e2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0096@¢\u0006\u0004\b/\u0010)J5\u00100\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000f0\u000e2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0096@¢\u0006\u0004\b0\u0010)J5\u00101\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000f0\u000e2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0096@¢\u0006\u0004\b1\u0010)J5\u00102\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000f0\u000e2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0096@¢\u0006\u0004\b2\u0010)R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010?\u001a\u00020:8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010B\u001a\u00020:8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u001c\u0010H\u001a\u00020C8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010N\u001a\u0004\u0018\u00010I8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010Q\u001a\u00020:8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bO\u0010<\"\u0004\bP\u0010>R\u001c\u0010T\u001a\u00020:8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bR\u0010<\"\u0004\bS\u0010>¨\u0006W"}, d2 = {"Lme/oriient/internal/services/auth/AuthenticatedRestServiceImpl;", "Lme/oriient/internal/infra/rest/RestService;", "restService", "<init>", "(Lme/oriient/internal/infra/rest/RestService;)V", "Lme/oriient/internal/infra/rest/HttpResponse;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lme/oriient/internal/infra/rest/RequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "requestConfig", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/infra/utils/core/OriientError;", "", "getFunc", "getImpl", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/infra/rest/PostRequestBuilder;", "postFunc", "postImpl", "Lme/oriient/internal/infra/rest/PutRequestBuilder;", "putFunc", "putImpl", "requestBuilder", "Lme/oriient/internal/services/auth/Credentials;", "credentials", "Lme/oriient/internal/services/auth/V;", "jwtInfo", "addAuth", "(Lme/oriient/internal/infra/rest/RequestBuilder;Lme/oriient/internal/services/auth/Credentials;Lme/oriient/internal/services/auth/V;)V", "", "baseUrl", "", "toAppend", "appendQueryParams", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Lme/oriient/internal/infra/rest/HttpResponse$BytesResponse;", "getBytes", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/infra/rest/HttpResponse$StringResponse;", "getString", "postReturningBytes", "postReturningString", "Lme/oriient/internal/infra/rest/HttpResponse$EmptyResponse;", "postReturningUnit", "putReturningBytes", "putReturningString", "putReturningUnit", "Lme/oriient/internal/infra/rest/RestService;", "Lme/oriient/internal/services/auth/U;", "authManager$delegate", "Lkotlin/Lazy;", "getAuthManager", "()Lme/oriient/internal/services/auth/U;", "authManager", "", "getCallTimeoutMillis", "()J", "setCallTimeoutMillis", "(J)V", "callTimeoutMillis", "getConnectTimeoutMillis", "setConnectTimeoutMillis", "connectTimeoutMillis", "", "getEnableHttpClientLogging", "()Z", "setEnableHttpClientLogging", "(Z)V", "enableHttpClientLogging", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "setLogger", "(Lme/oriient/internal/infra/utils/core/Logger;)V", "logger", "getReadTimeoutMillis", "setReadTimeoutMillis", "readTimeoutMillis", "getWriteTimeoutMillis", "setWriteTimeoutMillis", "writeTimeoutMillis", "Companion", "me/oriient/internal/services/auth/E", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AuthenticatedRestServiceImpl implements RestService {

    @NotNull
    private static final E Companion = new E();

    @NotNull
    private static final String REQUEST_HEADER_AUTH = "Authorization";

    @NotNull
    private static final String TAG = "AuthenticatedRestServic";

    /* renamed from: authManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy authManager;

    @NotNull
    private final RestService restService;

    public AuthenticatedRestServiceImpl(@NotNull RestService restService) {
        Intrinsics.h(restService, "restService");
        this.restService = restService;
        this.authManager = InternalDiKt.getDi().inject(Reflection.f24268a.b(U.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAuth(RequestBuilder requestBuilder, Credentials credentials, V jwtInfo) {
        if (credentials == null) {
            return;
        }
        requestBuilder.url(appendQueryParams(requestBuilder.getUrl(), androidx.constraintlayout.core.state.a.s("spaceId", credentials.getSpaceId())));
        requestBuilder.header(REQUEST_HEADER_AUTH, "Bearer " + jwtInfo.f25021a.f25022a);
    }

    private final String appendQueryParams(String baseUrl, Map<String, String> toAppend) {
        String str;
        boolean zP = StringsKt.p(baseUrl, '?');
        if (zP) {
            str = "&";
        } else {
            if (zP) {
                throw new NoWhenBranchMatchedException();
            }
            str = "?";
        }
        StringBuilder sbS = YU.a.s(baseUrl);
        for (Map.Entry<String, String> entry : toAppend.entrySet()) {
            if (!StringsKt.o(baseUrl, entry.getKey(), false)) {
                sbS.append(str);
                sbS.append(entry.getKey());
                sbS.append("=");
                sbS.append(entry.getValue());
                str = "&";
            }
        }
        String string = sbS.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    private final U getAuthManager() {
        return (U) this.authManager.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T extends me.oriient.internal.infra.rest.HttpResponse> java.lang.Object getImpl(kotlin.jvm.functions.Function1<? super me.oriient.internal.infra.rest.RequestBuilder, kotlin.Unit> r9, kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super me.oriient.internal.infra.rest.RequestBuilder, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<T, me.oriient.internal.infra.utils.core.OriientError>>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<T, me.oriient.internal.infra.utils.core.OriientError>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof me.oriient.internal.services.auth.G
            if (r0 == 0) goto L13
            r0 = r11
            me.oriient.internal.services.auth.G r0 = (me.oriient.internal.services.auth.G) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            me.oriient.internal.services.auth.G r0 = new me.oriient.internal.services.auth.G
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.g
            java.lang.String r3 = "AuthenticatedRestServic"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r11)
            return r11
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            me.oriient.internal.services.auth.Credentials r9 = r0.d
            kotlin.jvm.functions.Function2 r10 = r0.c
            kotlin.jvm.functions.Function1 r2 = r0.b
            me.oriient.internal.services.auth.AuthenticatedRestServiceImpl r5 = r0.f25015a
            kotlin.ResultKt.b(r11)
            r7 = r11
            r11 = r9
            r9 = r2
            r2 = r7
            goto L84
        L44:
            kotlin.ResultKt.b(r11)
            me.oriient.internal.services.auth.U r11 = r8.getAuthManager()
            me.oriient.internal.services.auth.D r11 = (me.oriient.internal.services.auth.D) r11
            kotlinx.coroutines.flow.MutableStateFlow r11 = r11.f25014a
            java.lang.Object r11 = r11.getValue()
            me.oriient.internal.services.auth.Credentials r11 = (me.oriient.internal.services.auth.Credentials) r11
            if (r11 != 0) goto L6c
            me.oriient.internal.infra.utils.core.Logger r9 = r8.getLogger()
            if (r9 == 0) goto L62
            java.lang.String r10 = "get - no credentials"
            r9.e(r3, r10)
        L62:
            me.oriient.internal.infra.utils.core.AuthError r9 = new me.oriient.internal.infra.utils.core.AuthError
            r9.<init>()
            me.oriient.internal.infra.utils.core.Outcome r9 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeFailure(r9)
            return r9
        L6c:
            me.oriient.internal.services.auth.U r2 = r8.getAuthManager()
            r0.f25015a = r8
            r0.b = r9
            r0.c = r10
            r0.d = r11
            r0.g = r5
            me.oriient.internal.services.auth.D r2 = (me.oriient.internal.services.auth.D) r2
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L83
            goto La8
        L83:
            r5 = r8
        L84:
            me.oriient.internal.infra.utils.core.Outcome r2 = (me.oriient.internal.infra.utils.core.Outcome) r2
            boolean r6 = r2 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r6 == 0) goto Laa
            me.oriient.internal.infra.utils.core.Outcome$Success r2 = (me.oriient.internal.infra.utils.core.Outcome.Success) r2
            java.lang.Object r2 = r2.getValue()
            me.oriient.internal.services.auth.V r2 = (me.oriient.internal.services.auth.V) r2
            me.oriient.internal.services.auth.H r3 = new me.oriient.internal.services.auth.H
            r3.<init>(r9, r5, r11, r2)
            r9 = 0
            r0.f25015a = r9
            r0.b = r9
            r0.c = r9
            r0.d = r9
            r0.g = r4
            java.lang.Object r9 = r10.invoke(r3, r0)
            if (r9 != r1) goto La9
        La8:
            return r1
        La9:
            return r9
        Laa:
            boolean r9 = r2 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r9 == 0) goto Lc9
            me.oriient.internal.infra.utils.core.Logger r9 = r5.getLogger()
            if (r9 == 0) goto Lbf
            me.oriient.internal.infra.utils.core.Outcome$Failure r2 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r2
            java.lang.Exception r10 = r2.getValue()
            java.lang.String r11 = "get - invalid jwt"
            r9.e(r3, r11, r10)
        Lbf:
            me.oriient.internal.infra.utils.core.AuthError r9 = new me.oriient.internal.infra.utils.core.AuthError
            r9.<init>()
            me.oriient.internal.infra.utils.core.Outcome r9 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeFailure(r9)
            return r9
        Lc9:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.auth.AuthenticatedRestServiceImpl.getImpl(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T extends me.oriient.internal.infra.rest.HttpResponse> java.lang.Object postImpl(kotlin.jvm.functions.Function1<? super me.oriient.internal.infra.rest.PostRequestBuilder, kotlin.Unit> r9, kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super me.oriient.internal.infra.rest.PostRequestBuilder, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<T, me.oriient.internal.infra.utils.core.OriientError>>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<T, me.oriient.internal.infra.utils.core.OriientError>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof me.oriient.internal.services.auth.J
            if (r0 == 0) goto L13
            r0 = r11
            me.oriient.internal.services.auth.J r0 = (me.oriient.internal.services.auth.J) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            me.oriient.internal.services.auth.J r0 = new me.oriient.internal.services.auth.J
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.g
            java.lang.String r3 = "AuthenticatedRestServic"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r11)
            return r11
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            me.oriient.internal.services.auth.Credentials r9 = r0.d
            kotlin.jvm.functions.Function2 r10 = r0.c
            kotlin.jvm.functions.Function1 r2 = r0.b
            me.oriient.internal.services.auth.AuthenticatedRestServiceImpl r5 = r0.f25017a
            kotlin.ResultKt.b(r11)
            r7 = r11
            r11 = r9
            r9 = r2
            r2 = r7
            goto L84
        L44:
            kotlin.ResultKt.b(r11)
            me.oriient.internal.services.auth.U r11 = r8.getAuthManager()
            me.oriient.internal.services.auth.D r11 = (me.oriient.internal.services.auth.D) r11
            kotlinx.coroutines.flow.MutableStateFlow r11 = r11.f25014a
            java.lang.Object r11 = r11.getValue()
            me.oriient.internal.services.auth.Credentials r11 = (me.oriient.internal.services.auth.Credentials) r11
            if (r11 != 0) goto L6c
            me.oriient.internal.infra.utils.core.Logger r9 = r8.getLogger()
            if (r9 == 0) goto L62
            java.lang.String r10 = "post - no credentials"
            r9.e(r3, r10)
        L62:
            me.oriient.internal.infra.utils.core.AuthError r9 = new me.oriient.internal.infra.utils.core.AuthError
            r9.<init>()
            me.oriient.internal.infra.utils.core.Outcome r9 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeFailure(r9)
            return r9
        L6c:
            me.oriient.internal.services.auth.U r2 = r8.getAuthManager()
            r0.f25017a = r8
            r0.b = r9
            r0.c = r10
            r0.d = r11
            r0.g = r5
            me.oriient.internal.services.auth.D r2 = (me.oriient.internal.services.auth.D) r2
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L83
            goto La8
        L83:
            r5 = r8
        L84:
            me.oriient.internal.infra.utils.core.Outcome r2 = (me.oriient.internal.infra.utils.core.Outcome) r2
            boolean r6 = r2 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r6 == 0) goto Laa
            me.oriient.internal.infra.utils.core.Outcome$Success r2 = (me.oriient.internal.infra.utils.core.Outcome.Success) r2
            java.lang.Object r2 = r2.getValue()
            me.oriient.internal.services.auth.V r2 = (me.oriient.internal.services.auth.V) r2
            me.oriient.internal.services.auth.K r3 = new me.oriient.internal.services.auth.K
            r3.<init>(r9, r5, r11, r2)
            r9 = 0
            r0.f25017a = r9
            r0.b = r9
            r0.c = r9
            r0.d = r9
            r0.g = r4
            java.lang.Object r9 = r10.invoke(r3, r0)
            if (r9 != r1) goto La9
        La8:
            return r1
        La9:
            return r9
        Laa:
            boolean r9 = r2 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r9 == 0) goto Lc9
            me.oriient.internal.infra.utils.core.Logger r9 = r5.getLogger()
            if (r9 == 0) goto Lbf
            me.oriient.internal.infra.utils.core.Outcome$Failure r2 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r2
            java.lang.Exception r10 = r2.getValue()
            java.lang.String r11 = "post - invalid jwt"
            r9.e(r3, r11, r10)
        Lbf:
            me.oriient.internal.infra.utils.core.AuthError r9 = new me.oriient.internal.infra.utils.core.AuthError
            r9.<init>()
            me.oriient.internal.infra.utils.core.Outcome r9 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeFailure(r9)
            return r9
        Lc9:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.auth.AuthenticatedRestServiceImpl.postImpl(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T extends me.oriient.internal.infra.rest.HttpResponse> java.lang.Object putImpl(kotlin.jvm.functions.Function1<? super me.oriient.internal.infra.rest.PutRequestBuilder, kotlin.Unit> r9, kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super me.oriient.internal.infra.rest.PutRequestBuilder, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<T, me.oriient.internal.infra.utils.core.OriientError>>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<T, me.oriient.internal.infra.utils.core.OriientError>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof me.oriient.internal.services.auth.O
            if (r0 == 0) goto L13
            r0 = r11
            me.oriient.internal.services.auth.O r0 = (me.oriient.internal.services.auth.O) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            me.oriient.internal.services.auth.O r0 = new me.oriient.internal.services.auth.O
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.g
            java.lang.String r3 = "AuthenticatedRestServic"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r11)
            return r11
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            me.oriient.internal.services.auth.Credentials r9 = r0.d
            kotlin.jvm.functions.Function2 r10 = r0.c
            kotlin.jvm.functions.Function1 r2 = r0.b
            me.oriient.internal.services.auth.AuthenticatedRestServiceImpl r5 = r0.f25019a
            kotlin.ResultKt.b(r11)
            r7 = r11
            r11 = r9
            r9 = r2
            r2 = r7
            goto L84
        L44:
            kotlin.ResultKt.b(r11)
            me.oriient.internal.services.auth.U r11 = r8.getAuthManager()
            me.oriient.internal.services.auth.D r11 = (me.oriient.internal.services.auth.D) r11
            kotlinx.coroutines.flow.MutableStateFlow r11 = r11.f25014a
            java.lang.Object r11 = r11.getValue()
            me.oriient.internal.services.auth.Credentials r11 = (me.oriient.internal.services.auth.Credentials) r11
            if (r11 != 0) goto L6c
            me.oriient.internal.infra.utils.core.Logger r9 = r8.getLogger()
            if (r9 == 0) goto L62
            java.lang.String r10 = "put - no credentials"
            r9.e(r3, r10)
        L62:
            me.oriient.internal.infra.utils.core.AuthError r9 = new me.oriient.internal.infra.utils.core.AuthError
            r9.<init>()
            me.oriient.internal.infra.utils.core.Outcome r9 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeFailure(r9)
            return r9
        L6c:
            me.oriient.internal.services.auth.U r2 = r8.getAuthManager()
            r0.f25019a = r8
            r0.b = r9
            r0.c = r10
            r0.d = r11
            r0.g = r5
            me.oriient.internal.services.auth.D r2 = (me.oriient.internal.services.auth.D) r2
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L83
            goto La8
        L83:
            r5 = r8
        L84:
            me.oriient.internal.infra.utils.core.Outcome r2 = (me.oriient.internal.infra.utils.core.Outcome) r2
            boolean r6 = r2 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r6 == 0) goto Laa
            me.oriient.internal.infra.utils.core.Outcome$Success r2 = (me.oriient.internal.infra.utils.core.Outcome.Success) r2
            java.lang.Object r2 = r2.getValue()
            me.oriient.internal.services.auth.V r2 = (me.oriient.internal.services.auth.V) r2
            me.oriient.internal.services.auth.P r3 = new me.oriient.internal.services.auth.P
            r3.<init>(r9, r5, r11, r2)
            r9 = 0
            r0.f25019a = r9
            r0.b = r9
            r0.c = r9
            r0.d = r9
            r0.g = r4
            java.lang.Object r9 = r10.invoke(r3, r0)
            if (r9 != r1) goto La9
        La8:
            return r1
        La9:
            return r9
        Laa:
            boolean r9 = r2 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r9 == 0) goto Lc9
            me.oriient.internal.infra.utils.core.Logger r9 = r5.getLogger()
            if (r9 == 0) goto Lbf
            me.oriient.internal.infra.utils.core.Outcome$Failure r2 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r2
            java.lang.Exception r10 = r2.getValue()
            java.lang.String r11 = "put - invalid jwt"
            r9.e(r3, r11, r10)
        Lbf:
            me.oriient.internal.infra.utils.core.AuthError r9 = new me.oriient.internal.infra.utils.core.AuthError
            r9.<init>()
            me.oriient.internal.infra.utils.core.Outcome r9 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeFailure(r9)
            return r9
        Lc9:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.auth.AuthenticatedRestServiceImpl.putImpl(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object getBytes(@NotNull Function1<? super RequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.BytesResponse, OriientError>> continuation) {
        return getImpl(function1, new F(this.restService), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public long getCallTimeoutMillis() {
        return this.restService.getCallTimeoutMillis();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public long getConnectTimeoutMillis() {
        return this.restService.getConnectTimeoutMillis();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public boolean getEnableHttpClientLogging() {
        return this.restService.getEnableHttpClientLogging();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Logger getLogger() {
        return this.restService.getLogger();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public long getReadTimeoutMillis() {
        return this.restService.getReadTimeoutMillis();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object getString(@NotNull Function1<? super RequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.StringResponse, OriientError>> continuation) {
        return getImpl(function1, new I(this.restService), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public long getWriteTimeoutMillis() {
        return this.restService.getWriteTimeoutMillis();
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object postReturningBytes(@NotNull Function1<? super PostRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.BytesResponse, OriientError>> continuation) {
        return postImpl(function1, new L(this.restService), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object postReturningString(@NotNull Function1<? super PostRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.StringResponse, OriientError>> continuation) {
        return postImpl(function1, new M(this.restService), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object postReturningUnit(@NotNull Function1<? super PostRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.EmptyResponse, OriientError>> continuation) {
        return postImpl(function1, new N(this.restService), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object putReturningBytes(@NotNull Function1<? super PutRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.BytesResponse, OriientError>> continuation) {
        return putImpl(function1, new Q(this.restService), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object putReturningString(@NotNull Function1<? super PutRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.StringResponse, OriientError>> continuation) {
        return putImpl(function1, new S(this.restService), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    @Nullable
    public Object putReturningUnit(@NotNull Function1<? super PutRequestBuilder, Unit> function1, @NotNull Continuation<? super Outcome<HttpResponse.EmptyResponse, OriientError>> continuation) {
        return putImpl(function1, new T(this.restService), continuation);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setCallTimeoutMillis(long j) {
        this.restService.setCallTimeoutMillis(j);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setConnectTimeoutMillis(long j) {
        this.restService.setConnectTimeoutMillis(j);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setEnableHttpClientLogging(boolean z) {
        this.restService.setEnableHttpClientLogging(z);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setLogger(@Nullable Logger logger) {
        this.restService.setLogger(logger);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setReadTimeoutMillis(long j) {
        this.restService.setReadTimeoutMillis(j);
    }

    @Override // me.oriient.internal.infra.rest.RestService
    public void setWriteTimeoutMillis(long j) {
        this.restService.setWriteTimeoutMillis(j);
    }
}
