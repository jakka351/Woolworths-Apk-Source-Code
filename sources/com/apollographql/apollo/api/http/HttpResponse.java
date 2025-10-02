package com.apollographql.apollo.api.http;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpResponse;", "", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class HttpResponse {

    /* renamed from: a, reason: collision with root package name */
    public final int f13531a;
    public final List b;
    public final BufferedSource c;
    public final ByteString d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpResponse$Builder;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final int f13532a;
        public BufferedSource b;
        public final ArrayList c = new ArrayList();

        public Builder(int i) {
            this.f13532a = i;
        }
    }

    public HttpResponse(int i, ArrayList arrayList, BufferedSource bufferedSource, ByteString byteString) {
        this.f13531a = i;
        this.b = arrayList;
        this.c = bufferedSource;
        this.d = byteString;
    }

    public final BufferedSource a() {
        BufferedSource bufferedSource = this.c;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        ByteString byteString = this.d;
        if (byteString == null) {
            return null;
        }
        Buffer buffer = new Buffer();
        buffer.T(byteString);
        return buffer;
    }
}
