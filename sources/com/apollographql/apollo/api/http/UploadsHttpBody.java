package com.apollographql.apollo.api.http;

import com.apollographql.apollo.annotations.ApolloInternal;
import com.apollographql.apollo.api.Upload;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonWriters;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.RealBufferedSink;

@ApolloInternal
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/http/UploadsHttpBody;", "Lcom/apollographql/apollo/api/http/HttpBody;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class UploadsHttpBody implements HttpBody {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13533a;
    public final ByteString b;
    public final String c;
    public final String d;
    public final Lazy e;

    public UploadsHttpBody(LinkedHashMap linkedHashMap, ByteString operationByteString) {
        Intrinsics.h(operationByteString, "operationByteString");
        this.f13533a = linkedHashMap;
        this.b = operationByteString;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.g(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        Intrinsics.g(string, "toString(...)");
        this.c = string;
        this.d = "multipart/form-data; boundary=".concat(string);
        this.e = LazyKt.b(new Function0() { // from class: com.apollographql.apollo.api.http.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws EOFException {
                CountingSink countingSink = new CountingSink(Okio.a());
                RealBufferedSink realBufferedSinkB = Okio.b(countingSink);
                UploadsHttpBody uploadsHttpBody = this.d;
                uploadsHttpBody.b(realBufferedSinkB, false);
                realBufferedSinkB.flush();
                long j = countingSink.e;
                Iterator it = uploadsHttpBody.f13533a.values().iterator();
                while (it.hasNext()) {
                    ((Upload) it.next()).getClass();
                }
                return Long.valueOf(j);
            }
        });
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public final void a(BufferedSink bufferedSink) throws EOFException {
        b(bufferedSink, true);
    }

    public final void b(BufferedSink bufferedSink, boolean z) throws EOFException {
        StringBuilder sb = new StringBuilder("--");
        String str = this.c;
        sb.append(str);
        sb.append("\r\n");
        bufferedSink.r1(sb.toString());
        bufferedSink.r1("Content-Disposition: form-data; name=\"operations\"\r\n");
        bufferedSink.r1("Content-Type: application/json\r\n");
        StringBuilder sb2 = new StringBuilder("Content-Length: ");
        ByteString byteString = this.b;
        sb2.append(byteString.c());
        sb2.append("\r\n");
        bufferedSink.r1(sb2.toString());
        bufferedSink.r1("\r\n");
        bufferedSink.S0(byteString);
        Buffer buffer = new Buffer();
        BufferedSinkJsonWriter bufferedSinkJsonWriter = new BufferedSinkJsonWriter(buffer);
        LinkedHashMap linkedHashMap = this.f13533a;
        Set setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(setEntrySet, 10));
        int i = 0;
        int i2 = 0;
        for (Object obj : setEntrySet) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            arrayList.add(new Pair(String.valueOf(i2), CollectionsKt.Q(((Map.Entry) obj).getKey())));
            i2 = i3;
        }
        JsonWriters.a(bufferedSinkJsonWriter, MapsKt.p(arrayList));
        ByteString byteStringP0 = buffer.p0(buffer.e);
        bufferedSink.r1("\r\n--" + str + "\r\n");
        bufferedSink.r1("Content-Disposition: form-data; name=\"map\"\r\n");
        bufferedSink.r1("Content-Type: application/json\r\n");
        bufferedSink.r1("Content-Length: " + byteStringP0.c() + "\r\n");
        bufferedSink.r1("\r\n");
        bufferedSink.S0(byteStringP0);
        for (Object obj2 : linkedHashMap.values()) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            Upload upload = (Upload) obj2;
            bufferedSink.r1("\r\n--" + str + "\r\n");
            bufferedSink.r1("Content-Disposition: form-data; name=\"" + i + '\"');
            upload.getClass();
            bufferedSink.r1("\r\n");
            bufferedSink.r1("Content-Type: null\r\n");
            bufferedSink.r1("Content-Length: 0\r\n");
            bufferedSink.r1("\r\n");
            if (z) {
                upload.a(bufferedSink);
                throw null;
            }
            i = i4;
        }
        bufferedSink.r1("\r\n--" + str + "--\r\n");
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public final long getContentLength() {
        return ((Number) this.e.getD()).longValue();
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    /* renamed from: getContentType, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
