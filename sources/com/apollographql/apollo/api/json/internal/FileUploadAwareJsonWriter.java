package com.apollographql.apollo.api.json.internal;

import com.apollographql.apollo.api.Upload;
import com.apollographql.apollo.api.json.JsonNumber;
import com.apollographql.apollo.api.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/json/internal/FileUploadAwareJsonWriter;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileUploadAwareJsonWriter implements JsonWriter {
    public final JsonWriter d;
    public final LinkedHashMap e = new LinkedHashMap();

    public FileUploadAwareJsonWriter(JsonWriter jsonWriter) {
        this.d = jsonWriter;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter A1(JsonNumber value) {
        Intrinsics.h(value, "value");
        this.d.A1(value);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter F1(String str) {
        this.d.F1(str);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter G() {
        this.d.G();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter K() {
        this.d.K();
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter d1(long j) {
        this.d.d1(j);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter e1(int i) {
        this.d.e1(i);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final String getPath() {
        return this.d.getPath();
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter h1(double d) {
        this.d.h1(d);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter q1(boolean z) {
        this.d.q1(z);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter s2() {
        this.d.s2();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter v0(String value) {
        Intrinsics.h(value, "value");
        this.d.v0(value);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter w() {
        this.d.w();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter y() {
        this.d.y();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter z1(Upload value) {
        Intrinsics.h(value, "value");
        JsonWriter jsonWriter = this.d;
        this.e.put(jsonWriter.getPath(), value);
        jsonWriter.s2();
        return this;
    }
}
