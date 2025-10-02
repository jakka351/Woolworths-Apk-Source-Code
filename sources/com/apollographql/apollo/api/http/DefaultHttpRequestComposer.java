package com.apollographql.apollo.api.http;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.MapJsonWriter;
import com.apollographql.apollo.api.json.internal.FileUploadAwareJsonWriter;
import com.google.android.gms.actions.SearchIntents;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer;", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "Companion", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultHttpRequestComposer implements HttpRequestComposer {

    /* renamed from: a, reason: collision with root package name */
    public final String f13526a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer$Companion;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static Map a(ApolloRequest apolloRequest) {
            Intrinsics.h(apolloRequest, "apolloRequest");
            Operation operation = apolloRequest.d;
            Boolean bool = apolloRequest.i;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = apolloRequest.j;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
            CustomScalarAdapters customScalarAdapters = (CustomScalarAdapters) apolloRequest.f.c(CustomScalarAdapters.f);
            if (customScalarAdapters == null) {
                customScalarAdapters = CustomScalarAdapters.g;
            }
            String strDocument = zBooleanValue2 ? operation.document() : null;
            MapJsonWriter mapJsonWriter = new MapJsonWriter();
            b(mapJsonWriter, operation, customScalarAdapters, strDocument, new a(zBooleanValue, operation.id()));
            if (!mapJsonWriter.e) {
                throw new IllegalStateException("Check failed.");
            }
            Object obj = mapJsonWriter.d;
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return (Map) obj;
        }

        public static LinkedHashMap b(JsonWriter jsonWriter, Operation operation, CustomScalarAdapters customScalarAdapters, String str, a aVar) {
            jsonWriter.G();
            jsonWriter.F1("operationName");
            jsonWriter.v0(operation.name());
            jsonWriter.F1("variables");
            FileUploadAwareJsonWriter fileUploadAwareJsonWriter = new FileUploadAwareJsonWriter(jsonWriter);
            fileUploadAwareJsonWriter.G();
            operation.serializeVariables(fileUploadAwareJsonWriter, customScalarAdapters, false);
            fileUploadAwareJsonWriter.K();
            if (str != null) {
                jsonWriter.F1(SearchIntents.EXTRA_QUERY);
                jsonWriter.v0(str);
            }
            aVar.invoke(jsonWriter);
            jsonWriter.K();
            return fileUploadAwareJsonWriter.e;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[HttpMethod.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HttpMethod httpMethod = HttpMethod.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public DefaultHttpRequestComposer(String serverUrl) {
        Intrinsics.h(serverUrl, "serverUrl");
        this.f13526a = serverUrl;
    }
}
