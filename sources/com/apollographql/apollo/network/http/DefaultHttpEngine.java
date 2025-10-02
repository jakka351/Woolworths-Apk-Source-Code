package com.apollographql.apollo.network.http;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class DefaultHttpEngine {
    public static final HttpEngine a(OkHttpClient okHttpClient) {
        return new JvmHttpEngine(okHttpClient);
    }
}
