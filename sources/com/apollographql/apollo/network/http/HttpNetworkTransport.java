package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.ExecutionContext;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.http.DefaultHttpRequestComposer;
import com.apollographql.apollo.api.http.HttpBody;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpMethod;
import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.UploadsHttpBody;
import com.apollographql.apollo.api.http.internal.UrlEncodeKt;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.internal.FileUploadAwareJsonWriter;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.network.NetworkTransport;
import com.apollographql.apollo.network.OkHttpExtensionsKt;
import com.google.android.gms.actions.SearchIntents;
import com.medallia.digital.mobilesdk.l8;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import me.oriient.internal.infra.rest.RequestBuilder;
import okhttp3.OkHttpClient;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport;", "Lcom/apollographql/apollo/network/NetworkTransport;", "EngineInterceptor", "Builder", "TransportHeadersInterceptor", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class HttpNetworkTransport implements NetworkTransport {

    /* renamed from: a, reason: collision with root package name */
    public final DefaultHttpRequestComposer f13629a;
    public final HttpEngine b;
    public final List c;
    public final boolean d;
    public final EngineInterceptor e = new EngineInterceptor();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f13630a;
        public HttpEngine b;
        public boolean d;
        public final ArrayList c = new ArrayList();
        public final ArrayList e = new ArrayList();

        public final HttpNetworkTransport a() {
            String str = this.f13630a;
            DefaultHttpRequestComposer defaultHttpRequestComposer = str != null ? new DefaultHttpRequestComposer(str) : null;
            if (defaultHttpRequestComposer == null) {
                throw new IllegalStateException("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'");
            }
            ArrayList arrayList = this.e;
            boolean zIsEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.c;
            if (!zIsEmpty) {
                arrayList2.add(new TransportHeadersInterceptor(arrayList));
            }
            HttpEngine jvmHttpEngine = this.b;
            if (jvmHttpEngine == null) {
                OkHttpClient.Builder builder = (OkHttpClient.Builder) OkHttpExtensionsKt.f13624a.getD();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                builder.c(l8.b.b, timeUnit);
                builder.d(l8.b.b, timeUnit);
                jvmHttpEngine = new JvmHttpEngine(new OkHttpClient(builder));
            }
            return new HttpNetworkTransport(defaultHttpRequestComposer, jvmHttpEngine, arrayList2, this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Companion;", "", "Kind", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Companion$Kind;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Kind {
            public static final /* synthetic */ Kind[] d;
            public static final /* synthetic */ EnumEntries e;

            static {
                Kind[] kindArr = {new Kind("EMPTY", 0), new Kind("PAYLOAD", 1), new Kind("OTHER", 2)};
                d = kindArr;
                e = EnumEntriesKt.a(kindArr);
            }

            public static Kind valueOf(String str) {
                return (Kind) Enum.valueOf(Kind.class, str);
            }

            public static Kind[] values() {
                return (Kind[]) d.clone();
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$EngineInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class EngineInterceptor implements HttpInterceptor {
        public EngineInterceptor() {
        }

        @Override // com.apollographql.apollo.network.http.HttpInterceptor
        public final Object a(HttpRequest httpRequest, DefaultHttpInterceptorChain defaultHttpInterceptorChain, ContinuationImpl continuationImpl) {
            return HttpNetworkTransport.this.b.y2(httpRequest, continuationImpl);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$TransportHeadersInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TransportHeadersInterceptor implements HttpInterceptor {

        /* renamed from: a, reason: collision with root package name */
        public final List f13632a;

        public TransportHeadersInterceptor(ArrayList headers) {
            Intrinsics.h(headers, "headers");
            this.f13632a = headers;
        }

        @Override // com.apollographql.apollo.network.http.HttpInterceptor
        public final Object a(HttpRequest httpRequest, DefaultHttpInterceptorChain defaultHttpInterceptorChain, ContinuationImpl continuationImpl) {
            HttpRequest.Builder builderA = HttpRequest.a(httpRequest);
            builderA.a(this.f13632a);
            return defaultHttpInterceptorChain.a(builderA.b(), continuationImpl);
        }
    }

    public HttpNetworkTransport(DefaultHttpRequestComposer defaultHttpRequestComposer, HttpEngine httpEngine, ArrayList arrayList, boolean z) {
        this.f13629a = defaultHttpRequestComposer;
        this.b = httpEngine;
        this.c = arrayList;
        this.d = z;
    }

    public static ApolloResponse b(Operation operation, Throwable th) {
        ApolloException apolloNetworkException = th instanceof ApolloException ? (ApolloException) th : new ApolloNetworkException("Error while reading JSON response", th);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.g(uuidRandomUUID, "randomUUID(...)");
        ApolloResponse.Builder builder = new ApolloResponse.Builder(operation, uuidRandomUUID);
        builder.f = apolloNetworkException;
        builder.h = true;
        return builder.a();
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final Flow a(ApolloRequest apolloRequest) throws EOFException {
        boolean z;
        HttpRequest.Builder builder;
        ExecutionContext executionContext = apolloRequest.f;
        CustomScalarAdapters.Key key = CustomScalarAdapters.f;
        ExecutionContext.Element elementC = executionContext.c(key);
        Intrinsics.e(elementC);
        CustomScalarAdapters customScalarAdapters = (CustomScalarAdapters) elementC;
        String str = this.f13629a.f13526a;
        Operation operation = apolloRequest.d;
        CustomScalarAdapters customScalarAdapters2 = (CustomScalarAdapters) executionContext.c(key);
        if (customScalarAdapters2 == null) {
            customScalarAdapters2 = CustomScalarAdapters.g;
        }
        ArrayList arrayList = new ArrayList();
        if (operation instanceof Subscription) {
            arrayList.add(new HttpHeader(RequestBuilder.ACCEPT, "multipart/mixed;subscriptionSpec=1.0, application/graphql-response+json, application/json"));
        } else {
            arrayList.add(new HttpHeader(RequestBuilder.ACCEPT, "multipart/mixed;deferSpec=20220824, application/graphql-response+json, application/json"));
        }
        List list = apolloRequest.h;
        if (list != null) {
            arrayList.addAll(list);
        }
        Boolean bool = apolloRequest.i;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = apolloRequest.j;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        HttpMethod httpMethod = apolloRequest.g;
        if (httpMethod == null) {
            httpMethod = HttpMethod.e;
        }
        int iOrdinal = httpMethod.ordinal();
        if (iOrdinal == 0) {
            HttpMethod httpMethod2 = HttpMethod.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operationName", operation.name());
            Buffer buffer = new Buffer();
            FileUploadAwareJsonWriter fileUploadAwareJsonWriter = new FileUploadAwareJsonWriter(new BufferedSinkJsonWriter(buffer));
            fileUploadAwareJsonWriter.G();
            operation.serializeVariables(fileUploadAwareJsonWriter, customScalarAdapters2, false);
            fileUploadAwareJsonWriter.K();
            if (!fileUploadAwareJsonWriter.e.isEmpty()) {
                throw new IllegalStateException("FileUpload and Http GET are not supported at the same time");
            }
            linkedHashMap.put("variables", buffer.v());
            if (zBooleanValue2) {
                linkedHashMap.put(SearchIntents.EXTRA_QUERY, operation.document());
            }
            if (zBooleanValue) {
                Buffer buffer2 = new Buffer();
                BufferedSinkJsonWriter bufferedSinkJsonWriter = new BufferedSinkJsonWriter(buffer2);
                bufferedSinkJsonWriter.G();
                bufferedSinkJsonWriter.F1("persistedQuery");
                bufferedSinkJsonWriter.G();
                bufferedSinkJsonWriter.F1("version");
                z = true;
                bufferedSinkJsonWriter.e1(1);
                bufferedSinkJsonWriter.F1("sha256Hash");
                bufferedSinkJsonWriter.v0(operation.id());
                bufferedSinkJsonWriter.K();
                bufferedSinkJsonWriter.K();
                linkedHashMap.put("extensions", buffer2.v());
            } else {
                z = true;
            }
            Intrinsics.h(str, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            boolean zO = StringsKt.o(str, "?", false);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (zO) {
                    sb.append('&');
                } else {
                    sb.append('?');
                    zO = z;
                }
                sb.append(UrlEncodeKt.a((String) entry.getKey()));
                sb.append('=');
                sb.append(UrlEncodeKt.a((String) entry.getValue()));
            }
            String string = sb.toString();
            Intrinsics.g(string, "toString(...)");
            HttpRequest.Builder builder2 = new HttpRequest.Builder(httpMethod2, string);
            builder2.d.add(new HttpHeader("Apollo-Require-Preflight", "true"));
            builder = builder2;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            String strDocument = zBooleanValue2 ? operation.document() : null;
            Intrinsics.h(customScalarAdapters2, "customScalarAdapters");
            com.apollographql.apollo.api.http.a aVar = new com.apollographql.apollo.api.http.a(zBooleanValue, operation.id());
            Buffer buffer3 = new Buffer();
            LinkedHashMap linkedHashMapB = DefaultHttpRequestComposer.Companion.b(new BufferedSinkJsonWriter(buffer3), operation, customScalarAdapters2, strDocument, aVar);
            final ByteString byteStringP0 = buffer3.p0(buffer3.e);
            HttpBody uploadsHttpBody = linkedHashMapB.isEmpty() ? new HttpBody() { // from class: com.apollographql.apollo.api.http.DefaultHttpRequestComposer$Companion$buildPostBody$1

                /* renamed from: a, reason: collision with root package name */
                public final long f13527a;

                {
                    this.f13527a = this.b.c();
                }

                @Override // com.apollographql.apollo.api.http.HttpBody
                public final void a(BufferedSink bufferedSink) {
                    bufferedSink.S0(this.b);
                }

                @Override // com.apollographql.apollo.api.http.HttpBody
                /* renamed from: getContentLength, reason: from getter */
                public final long getF13527a() {
                    return this.f13527a;
                }

                @Override // com.apollographql.apollo.api.http.HttpBody
                /* renamed from: getContentType */
                public final String getD() {
                    return "application/json";
                }
            } : new UploadsHttpBody(linkedHashMapB, byteStringP0);
            builder = new HttpRequest.Builder(HttpMethod.e, str);
            builder.c = uploadsHttpBody;
            if (StringsKt.W(uploadsHttpBody.getD(), "multipart/form-data", false)) {
                builder.d.add(new HttpHeader("Apollo-Require-Preflight", "true"));
            }
        }
        builder.a(arrayList);
        builder.e = builder.e.d(executionContext);
        return FlowKt.B(new HttpNetworkTransport$execute$1(this, builder.b(), apolloRequest, customScalarAdapters, null));
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final void dispose() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((HttpInterceptor) it.next()).dispose();
        }
        this.b.close();
    }
}
