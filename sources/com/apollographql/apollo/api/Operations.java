package com.apollographql.apollo.api;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.internal.ResponseParser;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.JsonDataException;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Operations {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final ApolloResponse a(JsonReader jsonReader, Operation operation, UUID uuid, CustomScalarAdapters customScalarAdapters, Set set) {
        ApolloResponse apolloResponseA;
        ?? r4;
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        ApolloResponse th = null;
        try {
            apolloResponseA = ResponseParser.a(jsonReader, operation, uuid, customScalarAdapters, set);
        } catch (Throwable th2) {
            if (uuid == null) {
                try {
                    uuid = UUID.randomUUID();
                    Intrinsics.g(uuid, "randomUUID(...)");
                } catch (Throwable th3) {
                    try {
                        jsonReader.close();
                        r4 = th3;
                    } catch (Throwable th4) {
                        ExceptionsKt.a(th3, th4);
                        r4 = th3;
                    }
                }
            }
            ApolloResponse.Builder builder = new ApolloResponse.Builder(operation, uuid);
            builder.f = th2 instanceof ApolloException ? th2 : new ApolloNetworkException("Error while reading JSON response", th2);
            builder.h = true;
            apolloResponseA = builder.a();
        }
        if (jsonReader.getF() != JsonReader.Token.n) {
            throw new JsonDataException("Expected END_DOCUMENT but was " + jsonReader.getF());
        }
        try {
            jsonReader.close();
        } catch (Throwable th5) {
            th = th5;
        }
        r4 = th;
        th = apolloResponseA;
        if (r4 == 0) {
            return th;
        }
        throw r4;
    }

    public static /* synthetic */ ApolloResponse b(JsonReader jsonReader, Operation operation, UUID uuid, CustomScalarAdapters customScalarAdapters, Set set, int i) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 8) != 0) {
            set = null;
        }
        return a(jsonReader, operation, uuid, customScalarAdapters, set);
    }
}
