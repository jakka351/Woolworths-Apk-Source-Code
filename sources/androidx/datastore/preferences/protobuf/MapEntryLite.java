package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;

/* loaded from: classes.dex */
public class MapEntryLite<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Metadata f2656a;

    /* renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2657a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2657a = iArr;
            try {
                iArr[WireFormat.FieldType.p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2657a[WireFormat.FieldType.s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2657a[WireFormat.FieldType.o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class Metadata<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f2658a;
        public final WireFormat.FieldType b;
        public final Object c;

        public Metadata(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, Object obj) {
            this.f2658a = fieldType;
            this.b = fieldType2;
            this.c = obj;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, GeneratedMessageLite generatedMessageLite) {
        this.f2656a = new Metadata(fieldType, fieldType2, generatedMessageLite);
    }

    public static int a(Metadata metadata, Object obj, Object obj2) {
        return FieldSet.b(metadata.f2658a, 1, obj) + FieldSet.b(metadata.b, 2, obj2);
    }

    public static void b(CodedOutputStream codedOutputStream, Metadata metadata, Object obj, Object obj2) {
        FieldSet.n(codedOutputStream, metadata.f2658a, 1, obj);
        FieldSet.n(codedOutputStream, metadata.b, 2, obj2);
    }
}
