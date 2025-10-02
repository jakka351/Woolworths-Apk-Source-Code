package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$1;
import okio.Buffer;
import okio.ByteString;
import retrofit2.Converter;

/* loaded from: classes2.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    public static final MediaType c;

    /* renamed from: a, reason: collision with root package name */
    public final Gson f27011a;
    public final TypeAdapter b;

    static {
        MediaType.e.getClass();
        c = MediaType.Companion.a("application/json; charset=UTF-8");
    }

    public GsonRequestBodyConverter(Gson gson, TypeAdapter typeAdapter) {
        this.f27011a = gson;
        this.b = typeAdapter;
    }

    @Override // retrofit2.Converter
    public final Object a(Object obj) throws IOException {
        final Buffer buffer = new Buffer();
        JsonWriter jsonWriterI = this.f27011a.i(new OutputStreamWriter(new OutputStream() { // from class: okio.Buffer$outputStream$1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
            }

            public final String toString() {
                return buffer + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public final void write(int i) {
                buffer.Y(i);
            }

            @Override // java.io.OutputStream
            public final void write(byte[] data, int i, int i2) {
                Intrinsics.h(data, "data");
                buffer.write(data, i, i2);
            }
        }, StandardCharsets.UTF_8));
        this.b.write(jsonWriterI, obj);
        jsonWriterI.close();
        ByteString content = buffer.p0(buffer.e);
        RequestBody.f26692a.getClass();
        Intrinsics.h(content, "content");
        return new RequestBody$Companion$toRequestBody$1(c, content);
    }
}
