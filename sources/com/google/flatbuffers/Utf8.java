package com.google.flatbuffers;

/* loaded from: classes6.dex */
public abstract class Utf8 {

    public static class DecodeUtil {
        public static boolean a(byte b) {
            return b > -65;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
    }
}
