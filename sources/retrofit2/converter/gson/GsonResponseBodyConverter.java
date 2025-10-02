package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes2.dex */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f27012a;
    public final TypeAdapter b;

    public GsonResponseBodyConverter(Gson gson, TypeAdapter typeAdapter) {
        this.f27012a = gson;
        this.b = typeAdapter;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // retrofit2.Converter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5) {
        /*
            r4 = this;
            okhttp3.ResponseBody r5 = (okhttp3.ResponseBody) r5
            okhttp3.ResponseBody$BomAwareReader r0 = r5.d
            if (r0 != 0) goto L22
            okhttp3.ResponseBody$BomAwareReader r0 = new okhttp3.ResponseBody$BomAwareReader
            okio.BufferedSource r1 = r5.U0()
            okhttp3.MediaType r2 = r5.getG()
            if (r2 == 0) goto L1b
            okhttp3.MediaType$Companion r3 = okhttp3.MediaType.e
            r3 = 0
            java.nio.charset.Charset r2 = r2.a(r3)
            if (r2 != 0) goto L1d
        L1b:
            java.nio.charset.Charset r2 = kotlin.text.Charsets.f24671a
        L1d:
            r0.<init>(r1, r2)
            r5.d = r0
        L22:
            com.google.gson.Gson r1 = r4.f27012a
            r1.getClass()
            com.google.gson.stream.JsonReader r1 = new com.google.gson.stream.JsonReader
            r1.<init>(r0)
            r0 = 0
            r1.setLenient(r0)
            com.google.gson.TypeAdapter r0 = r4.b     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L4a
            com.google.gson.stream.JsonToken r1 = r1.peek()     // Catch: java.lang.Throwable -> L4a
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.lang.Throwable -> L4a
            if (r1 != r2) goto L42
            r5.close()
            return r0
        L42:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "JSON document was not fully consumed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.Throwable -> L4a
        L4a:
            r0 = move-exception
            r5.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.converter.gson.GsonResponseBodyConverter.a(java.lang.Object):java.lang.Object");
    }
}
