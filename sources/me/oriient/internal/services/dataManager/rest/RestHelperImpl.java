package me.oriient.internal.services.dataManager.rest;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.HttpRequestBody;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JL\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00110\u000f\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002H\u00100\u0018H\u0096@¢\u0006\u0002\u0010\u001aJ£\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00110\u000f\"\b\b\u0000\u0010\u001c*\u00020\u001d\"\u0004\b\u0001\u0010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132?\u0010\u001e\u001a;\b\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0018¢\u0006\u0002\b\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u00020\u00110\u000f0#\u0012\u0006\u0012\u0004\u0018\u00010$0\u001f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010%\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u00100\u0018H\u0082@¢\u0006\u0002\u0010&JL\u0010'\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00110\u000f\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002H\u00100\u0018H\u0096@¢\u0006\u0002\u0010\u001aJ\u00ad\u0001\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00110\u000f\"\b\b\u0000\u0010\u001c*\u00020\u001d\"\u0004\b\u0001\u0010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010*2?\u0010+\u001a;\b\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020!0\u0018¢\u0006\u0002\b\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u00020\u00110\u000f0#\u0012\u0006\u0012\u0004\u0018\u00010$0\u001f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010%\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u00100\u0018H\u0082@¢\u0006\u0002\u0010-JV\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00110\u000f\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002H\u00100\u0018H\u0096@¢\u0006\u0002\u0010/R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u00060"}, d2 = {"Lme/oriient/internal/services/dataManager/rest/RestHelperImpl;", "Lme/oriient/internal/services/dataManager/rest/RestHelper;", "()V", "eLog", "Lme/oriient/internal/services/elog/ELog;", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "Lkotlin/Lazy;", "rest", "Lme/oriient/internal/infra/rest/RestService;", "getRest", "()Lme/oriient/internal/infra/rest/RestService;", "rest$delegate", "getBytesData", "Lme/oriient/internal/infra/utils/core/Outcome;", "Data", "Lme/oriient/internal/infra/utils/core/OriientError;", "tag", "", "url", "removeContentTypeHeader", "", "parseResponse", "Lkotlin/Function1;", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getData", "HttpResponseType", "Lme/oriient/internal/infra/rest/HttpResponse;", "getFunc", "Lkotlin/Function2;", "Lme/oriient/internal/infra/rest/RequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/coroutines/Continuation;", "", "logResponseBody", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStringData", "postData", "body", "Lme/oriient/internal/infra/rest/HttpRequestBody;", "postFunc", "Lme/oriient/internal/infra/rest/PostRequestBuilder;", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/infra/rest/HttpRequestBody;Lkotlin/jvm/functions/Function2;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postStringData", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/infra/rest/HttpRequestBody;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RestHelperImpl implements RestHelper {

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    /* renamed from: rest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rest;

    public RestHelperImpl() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.rest = di.inject(reflectionFactory.b(RestService.class));
        this.eLog = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <HttpResponseType extends me.oriient.internal.infra.rest.HttpResponse, Data> java.lang.Object getData(java.lang.String r6, java.lang.String r7, kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super me.oriient.internal.infra.rest.RequestBuilder, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<HttpResponseType, me.oriient.internal.infra.utils.core.OriientError>>, ? extends java.lang.Object> r8, boolean r9, boolean r10, kotlin.jvm.functions.Function1<? super HttpResponseType, ? extends Data> r11, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<Data, me.oriient.internal.infra.utils.core.OriientError>> r12) {
        /*
            r5 = this;
            boolean r0 = r12 instanceof me.oriient.internal.services.dataManager.rest.c
            if (r0 == 0) goto L13
            r0 = r12
            me.oriient.internal.services.dataManager.rest.c r0 = (me.oriient.internal.services.dataManager.rest.c) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.rest.c r0 = new me.oriient.internal.services.dataManager.rest.c
            r0.<init>(r5, r12)
        L18:
            java.lang.Object r12 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r12)
            return r12
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.jvm.functions.Function1 r11 = r0.d
            java.lang.String r7 = r0.c
            java.lang.String r6 = r0.b
            me.oriient.internal.services.dataManager.rest.RestHelperImpl r8 = r0.f25402a
            kotlin.ResultKt.b(r12)
            goto L58
        L3e:
            kotlin.ResultKt.b(r12)
            me.oriient.internal.services.dataManager.rest.d r12 = new me.oriient.internal.services.dataManager.rest.d
            r12.<init>(r7, r10, r9)
            r0.f25402a = r5
            r0.b = r6
            r0.c = r7
            r0.d = r11
            r0.g = r4
            java.lang.Object r12 = r8.invoke(r12, r0)
            if (r12 != r1) goto L57
            goto L9d
        L57:
            r8 = r5
        L58:
            me.oriient.internal.infra.utils.core.Outcome r12 = (me.oriient.internal.infra.utils.core.Outcome) r12
            boolean r9 = r12 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r9 == 0) goto L87
            r9 = r12
            me.oriient.internal.infra.utils.core.Outcome$Failure r9 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r9
            java.lang.Exception r9 = r9.getValue()
            me.oriient.internal.infra.utils.core.OriientError r9 = (me.oriient.internal.infra.utils.core.OriientError) r9
            boolean r10 = r9 instanceof me.oriient.internal.infra.utils.core.OperationCanceled
            if (r10 == 0) goto L6c
            goto L87
        L6c:
            boolean r10 = r9 instanceof me.oriient.internal.infra.utils.core.ServerError
            if (r10 == 0) goto L78
            r10 = r9
            me.oriient.internal.infra.utils.core.ServerError r10 = (me.oriient.internal.infra.utils.core.ServerError) r10
            int r10 = r10.getCode()
            goto L79
        L78:
            r10 = -1
        L79:
            me.oriient.internal.services.elog.ELog r8 = r8.getELog()
            me.oriient.internal.services.dataManager.rest.e r2 = new me.oriient.internal.services.dataManager.rest.e
            r2.<init>(r9, r10, r7)
            java.lang.String r7 = "REST failure"
            r8.e(r6, r7, r2)
        L87:
            me.oriient.internal.services.dataManager.rest.f r6 = new me.oriient.internal.services.dataManager.rest.f
            r7 = 0
            r6.<init>(r11, r7)
            r0.f25402a = r7
            r0.b = r7
            r0.c = r7
            r0.d = r7
            r0.g = r3
            java.lang.Object r6 = r12.then(r6, r0)
            if (r6 != r1) goto L9e
        L9d:
            return r1
        L9e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.rest.RestHelperImpl.getData(java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object getData$default(RestHelperImpl restHelperImpl, String str, String str2, Function2 function2, boolean z, boolean z2, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        return restHelperImpl.getData(str, str2, function2, z, z2, function1, continuation);
    }

    private final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    private final RestService getRest() {
        return (RestService) this.rest.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <HttpResponseType extends me.oriient.internal.infra.rest.HttpResponse, Data> java.lang.Object postData(java.lang.String r6, java.lang.String r7, me.oriient.internal.infra.rest.HttpRequestBody r8, kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super me.oriient.internal.infra.rest.PostRequestBuilder, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<HttpResponseType, me.oriient.internal.infra.utils.core.OriientError>>, ? extends java.lang.Object> r9, boolean r10, boolean r11, kotlin.jvm.functions.Function1<? super HttpResponseType, ? extends Data> r12, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<Data, me.oriient.internal.infra.utils.core.OriientError>> r13) {
        /*
            r5 = this;
            boolean r0 = r13 instanceof me.oriient.internal.services.dataManager.rest.i
            if (r0 == 0) goto L13
            r0 = r13
            me.oriient.internal.services.dataManager.rest.i r0 = (me.oriient.internal.services.dataManager.rest.i) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.rest.i r0 = new me.oriient.internal.services.dataManager.rest.i
            r0.<init>(r5, r13)
        L18:
            java.lang.Object r13 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r13)
            return r13
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.jvm.functions.Function1 r12 = r0.d
            java.lang.String r7 = r0.c
            java.lang.String r6 = r0.b
            me.oriient.internal.services.dataManager.rest.RestHelperImpl r8 = r0.f25407a
            kotlin.ResultKt.b(r13)
            goto L58
        L3e:
            kotlin.ResultKt.b(r13)
            me.oriient.internal.services.dataManager.rest.j r13 = new me.oriient.internal.services.dataManager.rest.j
            r13.<init>(r7, r8, r11, r10)
            r0.f25407a = r5
            r0.b = r6
            r0.c = r7
            r0.d = r12
            r0.g = r4
            java.lang.Object r13 = r9.invoke(r13, r0)
            if (r13 != r1) goto L57
            goto L9d
        L57:
            r8 = r5
        L58:
            me.oriient.internal.infra.utils.core.Outcome r13 = (me.oriient.internal.infra.utils.core.Outcome) r13
            boolean r9 = r13 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r9 == 0) goto L87
            r9 = r13
            me.oriient.internal.infra.utils.core.Outcome$Failure r9 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r9
            java.lang.Exception r9 = r9.getValue()
            me.oriient.internal.infra.utils.core.OriientError r9 = (me.oriient.internal.infra.utils.core.OriientError) r9
            boolean r10 = r9 instanceof me.oriient.internal.infra.utils.core.OperationCanceled
            if (r10 == 0) goto L6c
            goto L87
        L6c:
            boolean r10 = r9 instanceof me.oriient.internal.infra.utils.core.ServerError
            if (r10 == 0) goto L78
            r10 = r9
            me.oriient.internal.infra.utils.core.ServerError r10 = (me.oriient.internal.infra.utils.core.ServerError) r10
            int r10 = r10.getCode()
            goto L79
        L78:
            r10 = -1
        L79:
            me.oriient.internal.services.elog.ELog r8 = r8.getELog()
            me.oriient.internal.services.dataManager.rest.k r11 = new me.oriient.internal.services.dataManager.rest.k
            r11.<init>(r9, r10, r7)
            java.lang.String r7 = "REST failure"
            r8.e(r6, r7, r11)
        L87:
            me.oriient.internal.services.dataManager.rest.l r6 = new me.oriient.internal.services.dataManager.rest.l
            r7 = 0
            r6.<init>(r12, r7)
            r0.f25407a = r7
            r0.b = r7
            r0.c = r7
            r0.d = r7
            r0.g = r3
            java.lang.Object r6 = r13.then(r6, r0)
            if (r6 != r1) goto L9e
        L9d:
            return r1
        L9e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.rest.RestHelperImpl.postData(java.lang.String, java.lang.String, me.oriient.internal.infra.rest.HttpRequestBody, kotlin.jvm.functions.Function2, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object postData$default(RestHelperImpl restHelperImpl, String str, String str2, HttpRequestBody httpRequestBody, Function2 function2, boolean z, boolean z2, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        return restHelperImpl.postData(str, str2, httpRequestBody, function2, z, z2, function1, continuation);
    }

    @Override // me.oriient.internal.services.dataManager.rest.RestHelper
    @Nullable
    public <Data> Object getBytesData(@NotNull String str, @NotNull String str2, boolean z, @NotNull Function1<? super byte[], ? extends Data> function1, @NotNull Continuation<? super Outcome<Data, OriientError>> continuation) {
        return getData(str, str2, new a(getRest()), z, false, new b(function1), continuation);
    }

    @Override // me.oriient.internal.services.dataManager.rest.RestHelper
    @Nullable
    public <Data> Object getStringData(@NotNull String str, @NotNull String str2, boolean z, @NotNull Function1<? super String, ? extends Data> function1, @NotNull Continuation<? super Outcome<Data, OriientError>> continuation) {
        return getData$default(this, str, str2, new g(getRest()), z, false, new h(function1), continuation, 16, null);
    }

    @Override // me.oriient.internal.services.dataManager.rest.RestHelper
    @Nullable
    public <Data> Object postStringData(@NotNull String str, @NotNull String str2, @Nullable HttpRequestBody httpRequestBody, boolean z, @NotNull Function1<? super String, ? extends Data> function1, @NotNull Continuation<? super Outcome<Data, OriientError>> continuation) {
        return postData$default(this, str, str2, httpRequestBody, new m(getRest()), z, false, new n(function1), continuation, 32, null);
    }
}
