package androidx.constraintlayout.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    public boolean d;
    public float h;
    public Type l;
    public int e = -1;
    public int f = -1;
    public int g = 0;
    public boolean i = false;
    public final float[] j = new float[9];
    public final float[] k = new float[9];
    public ArrayRow[] m = new ArrayRow[16];
    public int n = 0;
    public int o = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        public static final /* synthetic */ Type[] h;

        static {
            Type type = new Type("UNRESTRICTED", 0);
            d = type;
            Type type2 = new Type("CONSTANT", 1);
            Type type3 = new Type("SLACK", 2);
            e = type3;
            Type type4 = new Type("ERROR", 3);
            f = type4;
            Type type5 = new Type("UNKNOWN", 4);
            g = type5;
            h = new Type[]{type, type2, type3, type4, type5};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) h.clone();
        }
    }

    public SolverVariable(Type type) {
        this.l = type;
    }

    public final void a(ArrayRow arrayRow) {
        int i = 0;
        while (true) {
            int i2 = this.n;
            if (i >= i2) {
                ArrayRow[] arrayRowArr = this.m;
                if (i2 >= arrayRowArr.length) {
                    this.m = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.m;
                int i3 = this.n;
                arrayRowArr2[i3] = arrayRow;
                this.n = i3 + 1;
                return;
            }
            if (this.m[i] == arrayRow) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(ArrayRow arrayRow) {
        int i = this.n;
        int i2 = 0;
        while (i2 < i) {
            if (this.m[i2] == arrayRow) {
                while (i2 < i - 1) {
                    ArrayRow[] arrayRowArr = this.m;
                    int i3 = i2 + 1;
                    arrayRowArr[i2] = arrayRowArr[i3];
                    i2 = i3;
                }
                this.n--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.l = Type.g;
        this.g = 0;
        this.e = -1;
        this.f = -1;
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = false;
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            this.m[i2] = null;
        }
        this.n = 0;
        this.o = 0;
        this.d = false;
        Arrays.fill(this.k, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // java.lang.Comparable
    public final int compareTo(SolverVariable solverVariable) {
        return this.e - solverVariable.e;
    }

    public final void d(LinearSystem linearSystem, float f) {
        this.h = f;
        this.i = true;
        int i = this.n;
        this.f = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.m[i2].h(linearSystem, this, false);
        }
        this.n = 0;
    }

    public final void e(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            this.m[i2].i(linearSystem, arrayRow, false);
        }
        this.n = 0;
    }

    public final String toString() {
        return "" + this.e;
    }
}
