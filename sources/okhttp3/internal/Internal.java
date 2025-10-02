package okhttp3.internal;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.MediaType;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class Internal {
    public static final Pair a(MediaType mediaType) {
        Charset charset = Charsets.f24671a;
        if (mediaType != null) {
            MediaType.Companion companion = MediaType.e;
            Charset charsetA = mediaType.a(null);
            if (charsetA == null) {
                String str = mediaType + "; charset=utf-8";
                MediaType.e.getClass();
                Intrinsics.h(str, "<this>");
                try {
                    mediaType = MediaType.Companion.a(str);
                } catch (IllegalArgumentException unused) {
                    mediaType = null;
                }
            } else {
                charset = charsetA;
            }
        }
        return new Pair(charset, mediaType);
    }
}
