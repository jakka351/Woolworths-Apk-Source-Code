package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8Old;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = Utf8Old.b;
        Utf8Old.Cache cache = new Utf8Old.Cache();
        Charset charset = StandardCharsets.UTF_8;
        charset.newEncoder();
        charset.newDecoder();
        return cache;
    }
}
