package org.tensorflow.lite;

/* loaded from: classes8.dex */
class DataTypeUtils {

    /* renamed from: org.tensorflow.lite.DataTypeUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26912a;

        static {
            int[] iArr = new int[DataType.values().length];
            f26912a = iArr;
            try {
                DataType dataType = DataType.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f26912a;
                DataType dataType2 = DataType.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f26912a;
                DataType dataType3 = DataType.d;
                iArr3[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f26912a;
                DataType dataType4 = DataType.d;
                iArr4[7] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f26912a;
                DataType dataType5 = DataType.d;
                iArr5[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f26912a;
                DataType dataType6 = DataType.d;
                iArr6[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f26912a;
                DataType dataType7 = DataType.d;
                iArr7[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = f26912a;
                DataType dataType8 = DataType.d;
                iArr8[4] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static String a(DataType dataType) {
        switch (dataType.ordinal()) {
            case 0:
                return "float";
            case 1:
                return "int";
            case 2:
            case 7:
                return "byte";
            case 3:
                return "long";
            case 4:
                return "string";
            case 5:
                return "bool";
            case 6:
                return "short";
            default:
                throw new IllegalArgumentException("DataType error: DataType " + dataType + " is not supported yet");
        }
    }
}
