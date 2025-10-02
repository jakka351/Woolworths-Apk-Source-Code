package androidx.emoji2.text.flatbuffer;

/* loaded from: classes2.dex */
public abstract class Utf8 {

    /* renamed from: a, reason: collision with root package name */
    public static Utf8Safe f2720a;

    public static class DecodeUtil {
        public static boolean a(byte b) {
            return b > -65;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
    }
}
