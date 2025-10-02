package org.tensorflow.lite;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class DataType {
    public static final DataType d;
    public static final DataType e;
    public static final DataType f;
    public static final DataType g;
    public static final DataType h;
    public static final DataType i;
    public static final DataType j;
    public static final DataType k;
    public static final /* synthetic */ DataType[] l;

    /* renamed from: org.tensorflow.lite.DataType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26911a;

        static {
            int[] iArr = new int[DataType.values().length];
            f26911a = iArr;
            try {
                DataType dataType = DataType.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f26911a;
                DataType dataType2 = DataType.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f26911a;
                DataType dataType3 = DataType.d;
                iArr3[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f26911a;
                DataType dataType4 = DataType.d;
                iArr4[7] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f26911a;
                DataType dataType5 = DataType.d;
                iArr5[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f26911a;
                DataType dataType6 = DataType.d;
                iArr6[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f26911a;
                DataType dataType7 = DataType.d;
                iArr7[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = f26911a;
                DataType dataType8 = DataType.d;
                iArr8[4] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        DataType dataType = new DataType("FLOAT32", 0);
        d = dataType;
        DataType dataType2 = new DataType("INT32", 1);
        e = dataType2;
        DataType dataType3 = new DataType("UINT8", 2);
        f = dataType3;
        DataType dataType4 = new DataType("INT64", 3);
        g = dataType4;
        DataType dataType5 = new DataType("STRING", 4);
        h = dataType5;
        DataType dataType6 = new DataType("BOOL", 5);
        i = dataType6;
        DataType dataType7 = new DataType("INT16", 6);
        j = dataType7;
        DataType dataType8 = new DataType("INT8", 7);
        k = dataType8;
        l = new DataType[]{dataType, dataType2, dataType3, dataType4, dataType5, dataType6, dataType7, dataType8};
        values();
    }

    public static DataType valueOf(String str) {
        return (DataType) Enum.valueOf(DataType.class, str);
    }

    public static DataType[] values() {
        return (DataType[]) l.clone();
    }

    public final int a() {
        switch (ordinal()) {
            case 0:
            case 1:
                return 4;
            case 2:
            case 7:
                return 1;
            case 3:
                return 8;
            case 4:
            case 5:
                return -1;
            case 6:
                return 2;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }
}
