package com.google.zxing.qrcode.decoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
abstract class DataMask {
    public static final /* synthetic */ DataMask[] d = {new DataMask() { // from class: com.google.zxing.qrcode.decoder.DataMask.1
        @Override // com.google.zxing.qrcode.decoder.DataMask
        public final boolean a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }, new DataMask() { // from class: com.google.zxing.qrcode.decoder.DataMask.2
        @Override // com.google.zxing.qrcode.decoder.DataMask
        public final boolean a(int i, int i2) {
            return (i & 1) == 0;
        }
    }, new DataMask() { // from class: com.google.zxing.qrcode.decoder.DataMask.3
        @Override // com.google.zxing.qrcode.decoder.DataMask
        public final boolean a(int i, int i2) {
            return i2 % 3 == 0;
        }
    }, new DataMask() { // from class: com.google.zxing.qrcode.decoder.DataMask.4
        @Override // com.google.zxing.qrcode.decoder.DataMask
        public final boolean a(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    }, new DataMask() { // from class: com.google.zxing.qrcode.decoder.DataMask.5
        @Override // com.google.zxing.qrcode.decoder.DataMask
        public final boolean a(int i, int i2) {
            return (((i2 / 3) + (i / 2)) & 1) == 0;
        }
    }, new DataMask() { // from class: com.google.zxing.qrcode.decoder.DataMask.6
        @Override // com.google.zxing.qrcode.decoder.DataMask
        public final boolean a(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    }, new DataMask() { // from class: com.google.zxing.qrcode.decoder.DataMask.7
        @Override // com.google.zxing.qrcode.decoder.DataMask
        public final boolean a(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    }, new DataMask() { // from class: com.google.zxing.qrcode.decoder.DataMask.8
        @Override // com.google.zxing.qrcode.decoder.DataMask
        public final boolean a(int i, int i2) {
            return ((((i * i2) % 3) + (i + i2)) & 1) == 0;
        }
    }};

    /* JADX INFO: Fake field, exist only in values array */
    DataMask EF2;

    public static DataMask valueOf(String str) {
        return (DataMask) Enum.valueOf(DataMask.class, str);
    }

    public static DataMask[] values() {
        return (DataMask[]) d.clone();
    }

    public abstract boolean a(int i, int i2);
}
