package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.WireFormat;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public class MapEntryLite<K, V> {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.MapEntryLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15108a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15108a = iArr;
            try {
                iArr[WireFormat.FieldType.p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15108a[WireFormat.FieldType.s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15108a[WireFormat.FieldType.o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class Metadata<K, V> {
    }

    public static void a(int i, Object obj, Object obj2) {
        Logger logger = CodedOutputStream.b;
        b(null, obj, obj2);
        throw null;
    }

    public static int b(Metadata metadata, Object obj, Object obj2) {
        metadata.getClass();
        return FieldSet.c(null, 1, obj) + FieldSet.c(null, 2, obj2);
    }

    public static void c(CodedOutputStream codedOutputStream, Metadata metadata, Object obj, Object obj2) {
        metadata.getClass();
        FieldSet.t(codedOutputStream, 1, obj);
        FieldSet.t(codedOutputStream, 2, obj2);
    }
}
