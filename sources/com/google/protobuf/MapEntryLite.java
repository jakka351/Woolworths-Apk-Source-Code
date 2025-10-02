package com.google.protobuf;

import com.google.protobuf.WireFormat;

/* loaded from: classes.dex */
public class MapEntryLite<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Metadata f16065a;
    public final Object b;

    /* renamed from: com.google.protobuf.MapEntryLite$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16066a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f16066a = iArr;
            try {
                iArr[WireFormat.FieldType.p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16066a[WireFormat.FieldType.s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16066a[WireFormat.FieldType.o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class Metadata<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f16067a;
        public final WireFormat.FieldType b;
        public final Object c;

        public Metadata(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, Object obj) {
            this.f16067a = fieldType;
            this.b = fieldType2;
            this.c = obj;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, Object obj) {
        this.f16065a = new Metadata(fieldType, fieldType2, obj);
        this.b = obj;
    }

    public static int a(Metadata metadata, Object obj, Object obj2) {
        return FieldSet.c(metadata.f16067a, 1, obj) + FieldSet.c(metadata.b, 2, obj2);
    }
}
