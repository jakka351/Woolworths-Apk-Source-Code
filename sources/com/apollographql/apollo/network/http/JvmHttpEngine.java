package com.apollographql.apollo.network.http;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/network/http/JvmHttpEngine;", "Lcom/apollographql/apollo/network/http/HttpEngine;", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class JvmHttpEngine implements HttpEngine {
    public static final Companion f = new Companion();
    public final a d;
    public final Lazy e = LazyKt.b(new a(this, 0));

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/http/JvmHttpEngine$Companion;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public JvmHttpEngine(OkHttpClient okHttpClient) {
        this.d = new a(okHttpClient, 1);
    }

    @Override // com.apollographql.apollo.network.http.HttpEngine, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.apollographql.apollo.network.http.HttpEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y2(com.apollographql.apollo.api.http.HttpRequest r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.http.JvmHttpEngine.y2(com.apollographql.apollo.api.http.HttpRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
