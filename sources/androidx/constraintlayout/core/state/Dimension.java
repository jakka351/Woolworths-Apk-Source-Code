package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes2.dex */
public class Dimension {
    public static final String h = new String("FIXED_DIMENSION");
    public static final String i = new String("WRAP_DIMENSION");
    public static final String j = new String("SPREAD_DIMENSION");
    public static final String k = new String("PARENT_DIMENSION");
    public static final String l = new String("PERCENT_DIMENSION");
    public static final String m = new String("RATIO_DIMENSION");
    public String f;

    /* renamed from: a, reason: collision with root package name */
    public int f2299a = 0;
    public int b = Integer.MAX_VALUE;
    public float c = 1.0f;
    public int d = 0;
    public String e = null;
    public boolean g = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final /* synthetic */ Type[] d = {new Type("FIXED", 0), new Type("WRAP", 1), new Type("MATCH_PARENT", 2), new Type("MATCH_CONSTRAINT", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) d.clone();
        }
    }

    public Dimension(String str) {
        this.f = str;
    }

    public static Dimension b(int i2) {
        Dimension dimension = new Dimension(h);
        dimension.f = null;
        dimension.d = i2;
        return dimension;
    }

    public static Dimension c(String str) {
        Dimension dimension = new Dimension();
        dimension.f2299a = 0;
        dimension.b = Integer.MAX_VALUE;
        dimension.c = 1.0f;
        dimension.d = 0;
        dimension.e = null;
        dimension.f = str;
        dimension.g = true;
        return dimension;
    }

    public static Dimension d() {
        return new Dimension(i);
    }

    public final void a(ConstraintWidget constraintWidget, int i2) throws NumberFormatException {
        String str = this.e;
        if (str != null) {
            constraintWidget.O(str);
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.g;
        String str2 = k;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.e;
        int i3 = 2;
        String str3 = l;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f;
        String str4 = i;
        if (i2 == 0) {
            if (this.g) {
                constraintWidget.S(dimensionBehaviour4);
                String str5 = this.f;
                if (str5 == str4) {
                    i3 = 1;
                } else if (str5 != str3) {
                    i3 = 0;
                }
                constraintWidget.T(this.c, i3, this.f2299a, this.b);
                return;
            }
            int i4 = this.f2299a;
            if (i4 > 0) {
                if (i4 < 0) {
                    constraintWidget.e0 = 0;
                } else {
                    constraintWidget.e0 = i4;
                }
            }
            int i5 = this.b;
            if (i5 < Integer.MAX_VALUE) {
                constraintWidget.D[0] = i5;
            }
            String str6 = this.f;
            if (str6 == str4) {
                constraintWidget.S(dimensionBehaviour3);
                return;
            }
            if (str6 == str2) {
                constraintWidget.S(dimensionBehaviour2);
                return;
            } else {
                if (str6 == null) {
                    constraintWidget.S(dimensionBehaviour);
                    constraintWidget.W(this.d);
                    return;
                }
                return;
            }
        }
        if (this.g) {
            constraintWidget.U(dimensionBehaviour4);
            String str7 = this.f;
            if (str7 == str4) {
                i3 = 1;
            } else if (str7 != str3) {
                i3 = 0;
            }
            constraintWidget.V(this.c, i3, this.f2299a, this.b);
            return;
        }
        int i6 = this.f2299a;
        if (i6 > 0) {
            if (i6 < 0) {
                constraintWidget.f0 = 0;
            } else {
                constraintWidget.f0 = i6;
            }
        }
        int i7 = this.b;
        if (i7 < Integer.MAX_VALUE) {
            constraintWidget.D[1] = i7;
        }
        String str8 = this.f;
        if (str8 == str4) {
            constraintWidget.U(dimensionBehaviour3);
            return;
        }
        if (str8 == str2) {
            constraintWidget.U(dimensionBehaviour2);
        } else if (str8 == null) {
            constraintWidget.U(dimensionBehaviour);
            constraintWidget.R(this.d);
        }
    }
}
