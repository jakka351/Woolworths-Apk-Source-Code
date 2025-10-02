package kotlinx.serialization.json.internal;

import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JavaStreamSerialReader;", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JavaStreamSerialReader implements InternalJsonReader {

    /* renamed from: a, reason: collision with root package name */
    public final CharsetReader f24860a;

    public JavaStreamSerialReader(ByteArrayInputStream byteArrayInputStream) {
        this.f24860a = new CharsetReader(byteArrayInputStream, Charsets.f24671a);
    }

    public final void a() {
        CharsetReader charsetReader = this.f24860a;
        charsetReader.getClass();
        ByteArrayPool8k byteArrayPool8k = ByteArrayPool8k.c;
        byte[] bArrArray = charsetReader.c.array();
        Intrinsics.g(bArrArray, "array(...)");
        byteArrayPool8k.getClass();
        synchronized (byteArrayPool8k) {
            int i = byteArrayPool8k.b;
            if (bArrArray.length + i < ArrayPoolsKt.f24852a) {
                byteArrayPool8k.b = i + (bArrArray.length / 2);
                byteArrayPool8k.f24853a.addLast(bArrArray);
            }
        }
    }
}
