package com.behaviosec.rl;

/* loaded from: classes4.dex */
public class ooooodd {
    public static int v00760076vv0076vv = 0;
    public static int v0076v0076v0076vv = 2;
    public static int vv0076vv0076vv = 32;
    public static int vvv0076v0076vv = 1;
    private float[] e00650065e00650065e = new float[3];
    private float[] eee006500650065e = new float[2];
    private float[] e0065e006500650065e = new float[2];
    private float[] ee0065006500650065e = new float[3];

    /* renamed from: com.behaviosec.rl.ooooodd$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] e00650065006500650065e;
        public static int v007600760076v0076vv = 21;
        public static int v0076vv00760076vv = 1;
        public static int vv0076v00760076vv = 2;
        public static int vvvv00760076vv;

        static {
            int[] iArr = new int[oodoodd.valuesCustom().length];
            e00650065006500650065e = iArr;
            try {
                iArr[oodoodd.LOW_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e00650065006500650065e[oodoodd.HIGH_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }

        public static int v00760076v00760076vv() {
            return 21;
        }
    }

    public enum oodoodd {
        LOW_PASS,
        HIGH_PASS;

        static {
            int iVvv007600760076vv = (vvv007600760076vv() * (vv0076007600760076vv() + vvv007600760076vv())) % v00760076007600760076vv();
            v0076v007600760076vv();
        }

        public static int v00760076007600760076vv() {
            return 2;
        }

        public static int v0076v007600760076vv() {
            return 0;
        }

        public static oodoodd valueOf(String str) {
            oodoodd oodooddVar = (oodoodd) odooooo.j006Ajjj006A006A(oodoodd.class, str);
            int iVvv007600760076vv = (vvv007600760076vv() * (vv0076007600760076vv() + vvv007600760076vv())) % v00760076007600760076vv();
            v0076v007600760076vv();
            return oodooddVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static oodoodd[] valuesCustom() {
            int iVvv007600760076vv = (vvv007600760076vv() * (vv0076007600760076vv() + vvv007600760076vv())) % v00760076007600760076vv();
            v0076v007600760076vv();
            return (oodoodd[]) values().clone();
        }

        public static int vv0076007600760076vv() {
            return 1;
        }

        public static int vvv007600760076vv() {
            return 2;
        }
    }

    public ooooodd(oodoodd oodooddVar, float f, float f2, float f3) {
        int i = AnonymousClass1.e00650065006500650065e[oodooddVar.ordinal()];
        if (i == 1) {
            float fTan = 1.0f / ((float) Math.tan((f * 3.141592653589793d) / f2));
            float[] fArr = this.e00650065e00650065e;
            float f4 = f3 * fTan;
            float f5 = fTan * fTan;
            float f6 = 1.0f / ((f4 + 1.0f) + f5);
            fArr[0] = f6;
            fArr[1] = f6 * 2.0f;
            fArr[2] = f6;
            float[] fArr2 = this.eee006500650065e;
            fArr2[0] = (1.0f - f5) * 2.0f * f6;
            fArr2[1] = ((1.0f - f4) + f5) * fArr[0];
            return;
        }
        if (i != 2) {
            return;
        }
        float fTan2 = (float) Math.tan((f * 3.141592653589793d) / f2);
        float[] fArr3 = this.e00650065e00650065e;
        float f7 = f3 * fTan2;
        float f8 = fTan2 * fTan2;
        float f9 = 1.0f / ((f7 + 1.0f) + f8);
        fArr3[0] = f9;
        fArr3[1] = (-2.0f) * f9;
        fArr3[2] = f9;
        float[] fArr4 = this.eee006500650065e;
        fArr4[0] = (f8 - 1.0f) * 2.0f * f9;
        fArr4[1] = ((1.0f - f7) + f8) * fArr3[0];
    }

    public static int vv00760076v0076vv() {
        return 48;
    }

    public float s0073sss0073s(float f) {
        float[] fArr = this.e00650065e00650065e;
        float f2 = fArr[0] * f;
        float f3 = fArr[1];
        float[] fArr2 = this.e0065e006500650065e;
        float f4 = fArr2[0];
        float f5 = (fArr[2] * fArr2[1]) + (f3 * f4) + f2;
        float[] fArr3 = this.eee006500650065e;
        float f6 = fArr3[0];
        float[] fArr4 = this.ee0065006500650065e;
        float f7 = (f5 - (f6 * fArr4[0])) - (fArr3[1] * fArr4[1]);
        fArr2[1] = f4;
        fArr2[0] = f;
        fArr4[2] = fArr4[1];
        fArr4[1] = fArr4[0];
        int i = vv0076vv0076vv;
        if (((vvv0076v0076vv + i) * i) % v0076v0076v0076vv != v00760076vv0076vv) {
            vv0076vv0076vv = 19;
            v00760076vv0076vv = vv00760076v0076vv();
        }
        fArr4[0] = f7;
        return f7;
    }
}
