package com.apollographql.apollo.network.http;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/network/http/LoggingInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "Level", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LoggingInterceptor implements HttpInterceptor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/http/LoggingInterceptor$Level;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Level {
        public static final /* synthetic */ Level[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            Level[] levelArr = {new Level("NONE", 0), new Level("BASIC", 1), new Level("HEADERS", 2), new Level("BODY", 3)};
            d = levelArr;
            e = EnumEntriesKt.a(levelArr);
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) d.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.apollographql.apollo.api.http.HttpRequest r4, com.apollographql.apollo.network.http.DefaultHttpInterceptorChain r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r3 = this;
            boolean r5 = r6 instanceof com.apollographql.apollo.network.http.LoggingInterceptor$intercept$2
            if (r5 == 0) goto L13
            r5 = r6
            com.apollographql.apollo.network.http.LoggingInterceptor$intercept$2 r5 = (com.apollographql.apollo.network.http.LoggingInterceptor$intercept$2) r5
            int r0 = r5.r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.r = r0
            goto L18
        L13:
            com.apollographql.apollo.network.http.LoggingInterceptor$intercept$2 r5 = new com.apollographql.apollo.network.http.LoggingInterceptor$intercept$2
            r5.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r5.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r5.r
            r0 = 0
            if (r5 == 0) goto L3b
            r4 = 1
            if (r5 == r4) goto L37
            r4 = 2
            if (r5 == r4) goto L2f
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r6)
            com.apollographql.apollo.api.http.HttpResponse r6 = (com.apollographql.apollo.api.http.HttpResponse) r6
            int r4 = r6.f13531a
            throw r0
        L37:
            kotlin.ResultKt.b(r6)
            return r6
        L3b:
            kotlin.ResultKt.b(r6)
            com.apollographql.apollo.network.http.LoggingInterceptor$Level[] r5 = com.apollographql.apollo.network.http.LoggingInterceptor.Level.d
            com.apollographql.apollo.api.http.HttpMethod r4 = r4.f13529a
            r4.name()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.http.LoggingInterceptor.a(com.apollographql.apollo.api.http.HttpRequest, com.apollographql.apollo.network.http.DefaultHttpInterceptorChain, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
