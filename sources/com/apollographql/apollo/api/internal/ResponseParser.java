package com.apollographql.apollo.api.internal;

import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Executable;
import com.apollographql.apollo.api.Executables;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonReaders;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/internal/ResponseParser;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ResponseParser {
    public static ApolloResponse a(JsonReader jsonReader, Operation operation, UUID uuid, CustomScalarAdapters customScalarAdapters, Set set) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonReader.G();
        Operation.Data data = null;
        List listA = null;
        Map map = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1809421292) {
                if (iHashCode != -1294635157) {
                    if (iHashCode == 3076010 && strNextName.equals("data")) {
                        Map map2 = Executables.a(operation, customScalarAdapters, true).f13516a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map2.entrySet()) {
                            if (Intrinsics.c(entry.getValue(), Boolean.FALSE)) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Set setKeySet = linkedHashMap.keySet();
                        CustomScalarAdapters.Builder builder = new CustomScalarAdapters.Builder();
                        builder.f13511a.putAll(customScalarAdapters.e);
                        builder.c = setKeySet;
                        builder.d = set;
                        builder.e = listA;
                        data = (Operation.Data) ((Executable.Data) Adapters.b(operation.adapter()).fromJson(jsonReader, builder.a()));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("errors")) {
                    listA = ResponseParserKt.a(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            } else if (strNextName.equals("extensions")) {
                Object objB = JsonReaders.b(jsonReader);
                map = objB instanceof Map ? (Map) objB : null;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.K();
        if (uuid == null) {
            uuid = UUID.randomUUID();
            Intrinsics.g(uuid, "randomUUID(...)");
        }
        ApolloResponse.Builder builder2 = new ApolloResponse.Builder(operation, uuid);
        builder2.d = listA;
        builder2.c = data;
        builder2.e = map;
        return builder2.a();
    }
}
