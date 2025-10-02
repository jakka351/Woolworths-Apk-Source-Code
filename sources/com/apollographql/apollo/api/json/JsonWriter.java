package com.apollographql.apollo.api.json;

import com.apollographql.apollo.api.Upload;
import java.io.Closeable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonWriter;", "Ljava/io/Closeable;", "Lokio/Closeable;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface JsonWriter extends Closeable {
    JsonWriter A1(JsonNumber jsonNumber);

    JsonWriter F1(String str);

    JsonWriter G();

    JsonWriter K();

    JsonWriter d1(long j);

    JsonWriter e1(int i);

    String getPath();

    JsonWriter h1(double d);

    JsonWriter q1(boolean z);

    JsonWriter s2();

    JsonWriter v0(String str);

    JsonWriter w();

    JsonWriter y();

    JsonWriter z1(Upload upload);
}
