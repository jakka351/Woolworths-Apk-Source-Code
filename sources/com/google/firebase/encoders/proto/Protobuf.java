package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.annotations.ExtraProperty;

@ExtraProperty
/* loaded from: classes6.dex */
public @interface Protobuf {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class IntEncoding {
        public static final IntEncoding d;
        public static final /* synthetic */ IntEncoding[] e;

        static {
            IntEncoding intEncoding = new IntEncoding("DEFAULT", 0);
            d = intEncoding;
            e = new IntEncoding[]{intEncoding, new IntEncoding("SIGNED", 1), new IntEncoding("FIXED", 2)};
        }

        public static IntEncoding valueOf(String str) {
            return (IntEncoding) Enum.valueOf(IntEncoding.class, str);
        }

        public static IntEncoding[] values() {
            return (IntEncoding[]) e.clone();
        }
    }

    IntEncoding intEncoding() default IntEncoding.d;

    int tag();
}
