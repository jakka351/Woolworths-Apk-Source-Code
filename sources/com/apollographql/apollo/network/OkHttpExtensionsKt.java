package com.apollographql.apollo.network;

import androidx.lifecycle.compose.d;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.network.http.DefaultHttpEngine;
import com.apollographql.apollo.network.ws.DefaultWebSocketEngine;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OkHttpExtensionsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f13624a = LazyKt.b(new d(22));

    public static final void a(ApolloClient.Builder builder, OkHttpClient okHttpClient) {
        builder.n = DefaultHttpEngine.a(okHttpClient);
        builder.p = new DefaultWebSocketEngine(okHttpClient);
    }

    public static final Headers b(List list) {
        Intrinsics.h(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HttpHeader httpHeader = (HttpHeader) it.next();
            builder.a(httpHeader.f13528a, httpHeader.b);
        }
        return builder.e();
    }
}
