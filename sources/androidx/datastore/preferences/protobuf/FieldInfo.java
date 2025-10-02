package androidx.datastore.preferences.protobuf;

@CheckReturnValue
/* loaded from: classes2.dex */
final class FieldInfo implements Comparable<FieldInfo> {

    /* renamed from: androidx.datastore.preferences.protobuf.FieldInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2637a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f2637a = iArr;
            try {
                iArr[FieldType.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2637a[FieldType.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2637a[FieldType.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2637a[FieldType.j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Builder {
    }

    @Override // java.lang.Comparable
    public final int compareTo(FieldInfo fieldInfo) {
        fieldInfo.getClass();
        return 0;
    }
}
