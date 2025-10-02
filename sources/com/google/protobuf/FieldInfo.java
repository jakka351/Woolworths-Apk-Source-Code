package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes6.dex */
final class FieldInfo implements Comparable<FieldInfo> {

    /* renamed from: com.google.protobuf.FieldInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16047a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f16047a = iArr;
            try {
                iArr[FieldType.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16047a[FieldType.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16047a[FieldType.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16047a[FieldType.j.ordinal()] = 4;
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
