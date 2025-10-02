package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Executable.Data;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/Executable;", "Lcom/apollographql/apollo/api/Executable$Data;", "D", "", "Data", "Variables", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Executable<D extends Data> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/Executable$Data;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Data {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/Executable$Variables;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Variables {

        /* renamed from: a, reason: collision with root package name */
        public final Map f13516a;

        public Variables(Map map) {
            this.f13516a = map;
        }
    }

    Adapter adapter();

    void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z);
}
