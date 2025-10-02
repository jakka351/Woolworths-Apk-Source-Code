package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class PrimitiveSet<P> {
    public static final Charset d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f14981a = new ConcurrentHashMap();
    public Entry b;
    public final Class c;

    public static final class Entry<P> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f14982a;
        public final byte[] b;
        public final KeyStatusType c;
        public final OutputPrefixType d;
        public final int e;

        public Entry(Object obj, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType, int i) {
            this.f14982a = obj;
            this.b = Arrays.copyOf(bArr, bArr.length);
            this.c = keyStatusType;
            this.d = outputPrefixType;
            this.e = i;
        }

        public final byte[] a() {
            byte[] bArr = this.b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public PrimitiveSet(Class cls) {
        this.c = cls;
    }

    public final List a(byte[] bArr) {
        List list = (List) this.f14981a.get(new String(bArr, d));
        return list != null ? list : Collections.EMPTY_LIST;
    }
}
