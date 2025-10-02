package org.tensorflow.lite.support.image;

/* loaded from: classes8.dex */
public final class BoundingBoxUtil {

    /* renamed from: org.tensorflow.lite.support.image.BoundingBoxUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26921a;

        static {
            int[] iArr = new int[Type.values().length];
            f26921a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26921a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26921a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CoordinateType {
        public static final /* synthetic */ CoordinateType[] d = {new CoordinateType("RATIO", 0), new CoordinateType("PIXEL", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        CoordinateType EF5;

        public static CoordinateType valueOf(String str) {
            return (CoordinateType) Enum.valueOf(CoordinateType.class, str);
        }

        public static CoordinateType[] values() {
            return (CoordinateType[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final /* synthetic */ Type[] d = {new Type("BOUNDARIES", 0), new Type("UPPER_LEFT", 1), new Type("CENTER", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) d.clone();
        }
    }
}
