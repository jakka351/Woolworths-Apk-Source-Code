package androidx.constraintlayout.widget;

import YU.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.medallia.digital.mobilesdk.q2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class ConstraintSet {
    public static final int[] h = {0, 4, 8};
    public static final SparseIntArray i;
    public static final SparseIntArray j;

    /* renamed from: a, reason: collision with root package name */
    public String f2369a;
    public String b = "";
    public String[] c = new String[0];
    public int d = 0;
    public final HashMap e = new HashMap();
    public boolean f = true;
    public final HashMap g = new HashMap();

    public static class Constraint {

        /* renamed from: a, reason: collision with root package name */
        public int f2370a;
        public String b;
        public final PropertySet c;
        public final Motion d;
        public final Layout e;
        public final Transform f;
        public HashMap g;
        public Delta h;

        public static class Delta {

            /* renamed from: a, reason: collision with root package name */
            public int[] f2371a;
            public int[] b;
            public int c;
            public int[] d;
            public float[] e;
            public int f;
            public int[] g;
            public String[] h;
            public int i;
            public int[] j;
            public boolean[] k;
            public int l;

            public final void a(float f, int i) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public final void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.f2371a;
                if (i3 >= iArr.length) {
                    this.f2371a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2371a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public final void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }

            public final void e(Constraint constraint) {
                for (int i = 0; i < this.c; i++) {
                    int i2 = this.f2371a[i];
                    int i3 = this.b[i];
                    int[] iArr = ConstraintSet.h;
                    if (i2 == 6) {
                        constraint.e.D = i3;
                    } else if (i2 == 7) {
                        constraint.e.E = i3;
                    } else if (i2 == 8) {
                        constraint.e.K = i3;
                    } else if (i2 == 27) {
                        constraint.e.F = i3;
                    } else if (i2 == 28) {
                        constraint.e.H = i3;
                    } else if (i2 == 41) {
                        constraint.e.W = i3;
                    } else if (i2 == 42) {
                        constraint.e.X = i3;
                    } else if (i2 == 61) {
                        constraint.e.A = i3;
                    } else if (i2 == 62) {
                        constraint.e.B = i3;
                    } else if (i2 == 72) {
                        constraint.e.g0 = i3;
                    } else if (i2 == 73) {
                        constraint.e.h0 = i3;
                    } else if (i2 == 2) {
                        constraint.e.J = i3;
                    } else if (i2 == 31) {
                        constraint.e.L = i3;
                    } else if (i2 == 34) {
                        constraint.e.I = i3;
                    } else if (i2 == 38) {
                        constraint.f2370a = i3;
                    } else if (i2 == 64) {
                        constraint.d.b = i3;
                    } else if (i2 == 66) {
                        constraint.d.f = i3;
                    } else if (i2 == 76) {
                        constraint.d.e = i3;
                    } else if (i2 == 78) {
                        constraint.c.c = i3;
                    } else if (i2 == 97) {
                        constraint.e.p0 = i3;
                    } else if (i2 == 93) {
                        constraint.e.M = i3;
                    } else if (i2 != 94) {
                        switch (i2) {
                            case 11:
                                constraint.e.Q = i3;
                                break;
                            case 12:
                                constraint.e.R = i3;
                                break;
                            case 13:
                                constraint.e.N = i3;
                                break;
                            case 14:
                                constraint.e.P = i3;
                                break;
                            case 15:
                                constraint.e.S = i3;
                                break;
                            case 16:
                                constraint.e.O = i3;
                                break;
                            case 17:
                                constraint.e.e = i3;
                                break;
                            case 18:
                                constraint.e.f = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 21:
                                        constraint.e.d = i3;
                                        break;
                                    case 22:
                                        constraint.c.b = i3;
                                        break;
                                    case 23:
                                        constraint.e.c = i3;
                                        break;
                                    case 24:
                                        constraint.e.G = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 54:
                                                constraint.e.Y = i3;
                                                break;
                                            case 55:
                                                constraint.e.Z = i3;
                                                break;
                                            case 56:
                                                constraint.e.a0 = i3;
                                                break;
                                            case 57:
                                                constraint.e.b0 = i3;
                                                break;
                                            case 58:
                                                constraint.e.c0 = i3;
                                                break;
                                            case 59:
                                                constraint.e.d0 = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 82:
                                                        constraint.d.c = i3;
                                                        break;
                                                    case 83:
                                                        constraint.f.i = i3;
                                                        break;
                                                    case 84:
                                                        constraint.d.j = i3;
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                constraint.d.l = i3;
                                                                break;
                                                            case 89:
                                                                constraint.d.m = i3;
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                    } else {
                        constraint.e.T = i3;
                    }
                }
                for (int i4 = 0; i4 < this.f; i4++) {
                    int i5 = this.d[i4];
                    float f = this.e[i4];
                    int[] iArr2 = ConstraintSet.h;
                    if (i5 == 19) {
                        constraint.e.g = f;
                    } else if (i5 == 20) {
                        constraint.e.x = f;
                    } else if (i5 == 37) {
                        constraint.e.y = f;
                    } else if (i5 == 60) {
                        constraint.f.b = f;
                    } else if (i5 == 63) {
                        constraint.e.C = f;
                    } else if (i5 == 79) {
                        constraint.d.g = f;
                    } else if (i5 == 85) {
                        constraint.d.i = f;
                    } else if (i5 != 87) {
                        if (i5 == 39) {
                            constraint.e.V = f;
                        } else if (i5 != 40) {
                            switch (i5) {
                                case 43:
                                    constraint.c.d = f;
                                    break;
                                case 44:
                                    Transform transform = constraint.f;
                                    transform.n = f;
                                    transform.m = true;
                                    break;
                                case 45:
                                    constraint.f.c = f;
                                    break;
                                case 46:
                                    constraint.f.d = f;
                                    break;
                                case 47:
                                    constraint.f.e = f;
                                    break;
                                case 48:
                                    constraint.f.f = f;
                                    break;
                                case 49:
                                    constraint.f.g = f;
                                    break;
                                case 50:
                                    constraint.f.h = f;
                                    break;
                                case 51:
                                    constraint.f.j = f;
                                    break;
                                case 52:
                                    constraint.f.k = f;
                                    break;
                                case 53:
                                    constraint.f.l = f;
                                    break;
                                default:
                                    switch (i5) {
                                        case 67:
                                            constraint.d.h = f;
                                            break;
                                        case 68:
                                            constraint.c.e = f;
                                            break;
                                        case 69:
                                            constraint.e.e0 = f;
                                            break;
                                        case 70:
                                            constraint.e.f0 = f;
                                            break;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                            }
                        } else {
                            constraint.e.U = f;
                        }
                    }
                }
                for (int i6 = 0; i6 < this.i; i6++) {
                    int i7 = this.g[i6];
                    String str = this.h[i6];
                    int[] iArr3 = ConstraintSet.h;
                    if (i7 == 5) {
                        constraint.e.z = str;
                    } else if (i7 == 65) {
                        constraint.d.d = str;
                    } else if (i7 == 74) {
                        Layout layout = constraint.e;
                        layout.k0 = str;
                        layout.j0 = null;
                    } else if (i7 == 77) {
                        constraint.e.l0 = str;
                    } else if (i7 != 87) {
                        if (i7 != 90) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            constraint.d.k = str;
                        }
                    }
                }
                for (int i8 = 0; i8 < this.l; i8++) {
                    int i9 = this.j[i8];
                    boolean z = this.k[i8];
                    int[] iArr4 = ConstraintSet.h;
                    if (i9 == 44) {
                        constraint.f.m = z;
                    } else if (i9 == 75) {
                        constraint.e.o0 = z;
                    } else if (i9 != 87) {
                        if (i9 == 80) {
                            constraint.e.m0 = z;
                        } else if (i9 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            constraint.e.n0 = z;
                        }
                    }
                }
            }
        }

        public Constraint() {
            PropertySet propertySet = new PropertySet();
            propertySet.f2374a = false;
            propertySet.b = 0;
            propertySet.c = 0;
            propertySet.d = 1.0f;
            propertySet.e = Float.NaN;
            this.c = propertySet;
            Motion motion = new Motion();
            motion.f2373a = false;
            motion.b = -1;
            motion.c = 0;
            motion.d = null;
            motion.e = -1;
            motion.f = 0;
            motion.g = Float.NaN;
            motion.h = Float.NaN;
            motion.i = Float.NaN;
            motion.j = -1;
            motion.k = null;
            motion.l = -3;
            motion.m = -1;
            this.d = motion;
            Layout layout = new Layout();
            layout.f2372a = false;
            layout.b = false;
            layout.e = -1;
            layout.f = -1;
            layout.g = -1.0f;
            layout.h = true;
            layout.i = -1;
            layout.j = -1;
            layout.k = -1;
            layout.l = -1;
            layout.m = -1;
            layout.n = -1;
            layout.o = -1;
            layout.p = -1;
            layout.q = -1;
            layout.r = -1;
            layout.s = -1;
            layout.t = -1;
            layout.u = -1;
            layout.v = -1;
            layout.w = -1;
            layout.x = 0.5f;
            layout.y = 0.5f;
            layout.z = null;
            layout.A = -1;
            layout.B = 0;
            layout.C = BitmapDescriptorFactory.HUE_RED;
            layout.D = -1;
            layout.E = -1;
            layout.F = -1;
            layout.G = 0;
            layout.H = 0;
            layout.I = 0;
            layout.J = 0;
            layout.K = 0;
            layout.L = 0;
            layout.M = 0;
            layout.N = Integer.MIN_VALUE;
            layout.O = Integer.MIN_VALUE;
            layout.P = Integer.MIN_VALUE;
            layout.Q = Integer.MIN_VALUE;
            layout.R = Integer.MIN_VALUE;
            layout.S = Integer.MIN_VALUE;
            layout.T = Integer.MIN_VALUE;
            layout.U = -1.0f;
            layout.V = -1.0f;
            layout.W = 0;
            layout.X = 0;
            layout.Y = 0;
            layout.Z = 0;
            layout.a0 = 0;
            layout.b0 = 0;
            layout.c0 = 0;
            layout.d0 = 0;
            layout.e0 = 1.0f;
            layout.f0 = 1.0f;
            layout.g0 = -1;
            layout.h0 = 0;
            layout.i0 = -1;
            layout.m0 = false;
            layout.n0 = false;
            layout.o0 = true;
            layout.p0 = 0;
            this.e = layout;
            Transform transform = new Transform();
            transform.f2375a = false;
            transform.b = BitmapDescriptorFactory.HUE_RED;
            transform.c = BitmapDescriptorFactory.HUE_RED;
            transform.d = BitmapDescriptorFactory.HUE_RED;
            transform.e = 1.0f;
            transform.f = 1.0f;
            transform.g = Float.NaN;
            transform.h = Float.NaN;
            transform.i = -1;
            transform.j = BitmapDescriptorFactory.HUE_RED;
            transform.k = BitmapDescriptorFactory.HUE_RED;
            transform.l = BitmapDescriptorFactory.HUE_RED;
            transform.m = false;
            transform.n = BitmapDescriptorFactory.HUE_RED;
            this.f = transform;
            this.g = new HashMap();
        }

        public final void a(Constraint constraint) {
            Delta delta = this.h;
            if (delta != null) {
                delta.e(constraint);
            }
        }

        public final void b(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.e;
            layoutParams.e = layout.i;
            layoutParams.f = layout.j;
            layoutParams.g = layout.k;
            layoutParams.h = layout.l;
            layoutParams.i = layout.m;
            layoutParams.j = layout.n;
            layoutParams.k = layout.o;
            layoutParams.l = layout.p;
            layoutParams.m = layout.q;
            layoutParams.n = layout.r;
            layoutParams.o = layout.s;
            layoutParams.s = layout.t;
            layoutParams.t = layout.u;
            layoutParams.u = layout.v;
            layoutParams.v = layout.w;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.G;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.H;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.I;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.J;
            layoutParams.A = layout.S;
            layoutParams.B = layout.R;
            layoutParams.x = layout.O;
            layoutParams.z = layout.Q;
            layoutParams.E = layout.x;
            layoutParams.F = layout.y;
            layoutParams.p = layout.A;
            layoutParams.q = layout.B;
            layoutParams.r = layout.C;
            layoutParams.G = layout.z;
            layoutParams.T = layout.D;
            layoutParams.U = layout.E;
            layoutParams.I = layout.U;
            layoutParams.H = layout.V;
            layoutParams.K = layout.X;
            layoutParams.J = layout.W;
            layoutParams.W = layout.m0;
            layoutParams.X = layout.n0;
            layoutParams.L = layout.Y;
            layoutParams.M = layout.Z;
            layoutParams.P = layout.a0;
            layoutParams.Q = layout.b0;
            layoutParams.N = layout.c0;
            layoutParams.O = layout.d0;
            layoutParams.R = layout.e0;
            layoutParams.S = layout.f0;
            layoutParams.V = layout.F;
            layoutParams.c = layout.g;
            layoutParams.f2362a = layout.e;
            layoutParams.b = layout.f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.d;
            String str = layout.l0;
            if (str != null) {
                layoutParams.Y = str;
            }
            layoutParams.Z = layout.p0;
            layoutParams.setMarginStart(layout.L);
            layoutParams.setMarginEnd(layout.K);
            layoutParams.a();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Constraint clone() {
            Constraint constraint = new Constraint();
            constraint.e.a(this.e);
            constraint.d.a(this.d);
            PropertySet propertySet = this.c;
            boolean z = propertySet.f2374a;
            PropertySet propertySet2 = constraint.c;
            propertySet2.f2374a = z;
            propertySet2.b = propertySet.b;
            propertySet2.d = propertySet.d;
            propertySet2.e = propertySet.e;
            propertySet2.c = propertySet.c;
            constraint.f.a(this.f);
            constraint.f2370a = this.f2370a;
            constraint.h = this.h;
            return constraint;
        }

        public final void d(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f2370a = i;
            int i2 = layoutParams.e;
            Layout layout = this.e;
            layout.i = i2;
            layout.j = layoutParams.f;
            layout.k = layoutParams.g;
            layout.l = layoutParams.h;
            layout.m = layoutParams.i;
            layout.n = layoutParams.j;
            layout.o = layoutParams.k;
            layout.p = layoutParams.l;
            layout.q = layoutParams.m;
            layout.r = layoutParams.n;
            layout.s = layoutParams.o;
            layout.t = layoutParams.s;
            layout.u = layoutParams.t;
            layout.v = layoutParams.u;
            layout.w = layoutParams.v;
            layout.x = layoutParams.E;
            layout.y = layoutParams.F;
            layout.z = layoutParams.G;
            layout.A = layoutParams.p;
            layout.B = layoutParams.q;
            layout.C = layoutParams.r;
            layout.D = layoutParams.T;
            layout.E = layoutParams.U;
            layout.F = layoutParams.V;
            layout.g = layoutParams.c;
            layout.e = layoutParams.f2362a;
            layout.f = layoutParams.b;
            layout.c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.G = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.H = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.I = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.J = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.M = layoutParams.D;
            layout.U = layoutParams.I;
            layout.V = layoutParams.H;
            layout.X = layoutParams.K;
            layout.W = layoutParams.J;
            layout.m0 = layoutParams.W;
            layout.n0 = layoutParams.X;
            layout.Y = layoutParams.L;
            layout.Z = layoutParams.M;
            layout.a0 = layoutParams.P;
            layout.b0 = layoutParams.Q;
            layout.c0 = layoutParams.N;
            layout.d0 = layoutParams.O;
            layout.e0 = layoutParams.R;
            layout.f0 = layoutParams.S;
            layout.l0 = layoutParams.Y;
            layout.O = layoutParams.x;
            layout.Q = layoutParams.z;
            layout.N = layoutParams.w;
            layout.P = layoutParams.y;
            layout.S = layoutParams.A;
            layout.R = layoutParams.B;
            layout.T = layoutParams.C;
            layout.p0 = layoutParams.Z;
            layout.K = layoutParams.getMarginEnd();
            layout.L = layoutParams.getMarginStart();
        }

        public final void e(int i, Constraints.LayoutParams layoutParams) {
            d(i, layoutParams);
            this.c.d = layoutParams.r0;
            float f = layoutParams.u0;
            Transform transform = this.f;
            transform.b = f;
            transform.c = layoutParams.v0;
            transform.d = layoutParams.w0;
            transform.e = layoutParams.x0;
            transform.f = layoutParams.y0;
            transform.g = layoutParams.z0;
            transform.h = layoutParams.A0;
            transform.j = layoutParams.B0;
            transform.k = layoutParams.C0;
            transform.l = layoutParams.D0;
            transform.n = layoutParams.t0;
            transform.m = layoutParams.s0;
        }
    }

    public static class Layout {
        public static final SparseIntArray q0;
        public int A;
        public int B;
        public float C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public float U;
        public float V;
        public int W;
        public int X;
        public int Y;
        public int Z;

        /* renamed from: a, reason: collision with root package name */
        public boolean f2372a;
        public int a0;
        public boolean b;
        public int b0;
        public int c;
        public int c0;
        public int d;
        public int d0;
        public int e;
        public float e0;
        public int f;
        public float f0;
        public float g;
        public int g0;
        public boolean h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int[] j0;
        public int k;
        public String k0;
        public int l;
        public String l0;
        public int m;
        public boolean m0;
        public int n;
        public boolean n0;
        public int o;
        public boolean o0;
        public int p;
        public int p0;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public float x;
        public float y;
        public String z;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 87);
            sparseIntArray.append(16, 88);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
            sparseIntArray.append(58, 84);
            sparseIntArray.append(59, 86);
            sparseIntArray.append(58, 83);
            sparseIntArray.append(37, 85);
            sparseIntArray.append(56, 87);
            sparseIntArray.append(34, 88);
            sparseIntArray.append(91, 89);
            sparseIntArray.append(15, 90);
        }

        public final void a(Layout layout) {
            this.f2372a = layout.f2372a;
            this.c = layout.c;
            this.b = layout.b;
            this.d = layout.d;
            this.e = layout.e;
            this.f = layout.f;
            this.g = layout.g;
            this.h = layout.h;
            this.i = layout.i;
            this.j = layout.j;
            this.k = layout.k;
            this.l = layout.l;
            this.m = layout.m;
            this.n = layout.n;
            this.o = layout.o;
            this.p = layout.p;
            this.q = layout.q;
            this.r = layout.r;
            this.s = layout.s;
            this.t = layout.t;
            this.u = layout.u;
            this.v = layout.v;
            this.w = layout.w;
            this.x = layout.x;
            this.y = layout.y;
            this.z = layout.z;
            this.A = layout.A;
            this.B = layout.B;
            this.C = layout.C;
            this.D = layout.D;
            this.E = layout.E;
            this.F = layout.F;
            this.G = layout.G;
            this.H = layout.H;
            this.I = layout.I;
            this.J = layout.J;
            this.K = layout.K;
            this.L = layout.L;
            this.M = layout.M;
            this.N = layout.N;
            this.O = layout.O;
            this.P = layout.P;
            this.Q = layout.Q;
            this.R = layout.R;
            this.S = layout.S;
            this.T = layout.T;
            this.U = layout.U;
            this.V = layout.V;
            this.W = layout.W;
            this.X = layout.X;
            this.Y = layout.Y;
            this.Z = layout.Z;
            this.a0 = layout.a0;
            this.b0 = layout.b0;
            this.c0 = layout.c0;
            this.d0 = layout.d0;
            this.e0 = layout.e0;
            this.f0 = layout.f0;
            this.g0 = layout.g0;
            this.h0 = layout.h0;
            this.i0 = layout.i0;
            this.l0 = layout.l0;
            int[] iArr = layout.j0;
            if (iArr == null || layout.k0 != null) {
                this.j0 = null;
            } else {
                this.j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.k0 = layout.k0;
            this.m0 = layout.m0;
            this.n0 = layout.n0;
            this.o0 = layout.o0;
            this.p0 = layout.p0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.p);
            this.b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = q0;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.q = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.q);
                        break;
                    case 2:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.p = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.p);
                        break;
                    case 4:
                        this.o = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.o);
                        break;
                    case 5:
                        this.z = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        this.w = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.w);
                        break;
                    case 10:
                        this.v = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.v);
                        break;
                    case 11:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case 18:
                        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 19:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 20:
                        this.x = typedArrayObtainStyledAttributes.getFloat(index, this.x);
                        break;
                    case 21:
                        this.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 22:
                        this.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case 23:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.i = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                    case 25:
                        this.j = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.j);
                        break;
                    case 26:
                        this.F = typedArrayObtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.k = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.k);
                        break;
                    case 29:
                        this.l = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.l);
                        break;
                    case 30:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        this.t = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.t);
                        break;
                    case 32:
                        this.u = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.u);
                        break;
                    case 33:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        this.n = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.n);
                        break;
                    case 35:
                        this.m = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.m);
                        break;
                    case 36:
                        this.y = typedArrayObtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 37:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        ConstraintSet.p(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        ConstraintSet.p(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.A = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.A);
                                break;
                            case 62:
                                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            case 63:
                                this.C = typedArrayObtainStyledAttributes.getFloat(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.g0 = typedArrayObtainStyledAttributes.getInt(index, this.g0);
                                        break;
                                    case 73:
                                        this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                        break;
                                    case 74:
                                        this.k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case 76:
                                        this.p0 = typedArrayObtainStyledAttributes.getInt(index, this.p0);
                                        break;
                                    case 77:
                                        this.r = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.r);
                                        break;
                                    case 78:
                                        this.s = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.s);
                                        break;
                                    case 79:
                                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        break;
                                    case 80:
                                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        break;
                                    case 81:
                                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 82:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 83:
                                        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 84:
                                        this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                        break;
                                    case 85:
                                        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case 86:
                                        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 87:
                                        this.m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.m0);
                                        break;
                                    case 88:
                                        this.n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case 89:
                                        this.l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.h = typedArrayObtainStyledAttributes.getBoolean(index, this.h);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Motion {
        public static final SparseIntArray n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f2373a;
        public int b;
        public int c;
        public String d;
        public int e;
        public int f;
        public float g;
        public float h;
        public float i;
        public int j;
        public String k;
        public int l;
        public int m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Motion motion) {
            this.f2373a = motion.f2373a;
            this.b = motion.b;
            this.d = motion.d;
            this.e = motion.e;
            this.f = motion.f;
            this.h = motion.h;
            this.g = motion.g;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.r);
            this.f2373a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (n.get(index)) {
                    case 1:
                        this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 2:
                        this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.d = Easing.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = typedArrayObtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.j = typedArrayObtainStyledAttributes.getInteger(index, this.j);
                        break;
                    case 9:
                        this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.m = resourceId;
                            if (resourceId != -1) {
                                this.l = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.k = string;
                            if (string.indexOf(q2.c) > 0) {
                                this.m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.l = -2;
                                break;
                            } else {
                                this.l = -1;
                                break;
                            }
                        } else {
                            this.l = typedArrayObtainStyledAttributes.getInteger(index, this.m);
                            break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class PropertySet {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2374a;
        public int b;
        public int c;
        public float d;
        public float e;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.A);
            this.f2374a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                } else if (index == 0) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.b);
                    this.b = i2;
                    this.b = ConstraintSet.h[i2];
                } else if (index == 4) {
                    this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                } else if (index == 3) {
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Transform {
        public static final SparseIntArray o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f2375a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int i;
        public float j;
        public float k;
        public float l;
        public boolean m;
        public float n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Transform transform) {
            this.f2375a = transform.f2375a;
            this.b = transform.b;
            this.c = transform.c;
            this.d = transform.d;
            this.e = transform.e;
            this.f = transform.f;
            this.g = transform.g;
            this.h = transform.h;
            this.i = transform.i;
            this.j = transform.j;
            this.k = transform.k;
            this.l = transform.l;
            this.m = transform.m;
            this.n = transform.n;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.D);
            this.f2375a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = ConstraintSet.o(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class WriteJsonEngine {
    }

    public class WriteXmlEngine {
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        j = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static Constraint e(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        Constraint constraint = new Constraint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, R.styleable.f);
        r(constraint, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    public static int[] i(Barrier barrier, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            try {
                iIntValue = R.id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static Constraint j(Context context, AttributeSet attributeSet, boolean z) {
        Constraint constraint = new Constraint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? R.styleable.f : R.styleable.b);
        if (z) {
            r(constraint, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (true) {
                Layout layout = constraint.e;
                if (i2 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i2);
                    PropertySet propertySet = constraint.c;
                    Transform transform = constraint.f;
                    Motion motion = constraint.d;
                    if (index != 1 && 23 != index && 24 != index) {
                        motion.f2373a = true;
                        layout.b = true;
                        propertySet.f2374a = true;
                        transform.f2375a = true;
                    }
                    SparseIntArray sparseIntArray = i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            layout.q = o(typedArrayObtainStyledAttributes, index, layout.q);
                            break;
                        case 2:
                            layout.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.J);
                            break;
                        case 3:
                            layout.p = o(typedArrayObtainStyledAttributes, index, layout.p);
                            break;
                        case 4:
                            layout.o = o(typedArrayObtainStyledAttributes, index, layout.o);
                            break;
                        case 5:
                            layout.z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            layout.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.D);
                            break;
                        case 7:
                            layout.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.E);
                            break;
                        case 8:
                            layout.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.K);
                            break;
                        case 9:
                            layout.w = o(typedArrayObtainStyledAttributes, index, layout.w);
                            break;
                        case 10:
                            layout.v = o(typedArrayObtainStyledAttributes, index, layout.v);
                            break;
                        case 11:
                            layout.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.Q);
                            break;
                        case 12:
                            layout.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.R);
                            break;
                        case 13:
                            layout.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.N);
                            break;
                        case 14:
                            layout.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.P);
                            break;
                        case 15:
                            layout.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.S);
                            break;
                        case 16:
                            layout.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.O);
                            break;
                        case 17:
                            layout.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.e);
                            break;
                        case 18:
                            layout.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.f);
                            break;
                        case 19:
                            layout.g = typedArrayObtainStyledAttributes.getFloat(index, layout.g);
                            break;
                        case 20:
                            layout.x = typedArrayObtainStyledAttributes.getFloat(index, layout.x);
                            break;
                        case 21:
                            layout.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, layout.d);
                            break;
                        case 22:
                            int i3 = typedArrayObtainStyledAttributes.getInt(index, propertySet.b);
                            propertySet.b = i3;
                            propertySet.b = h[i3];
                            break;
                        case 23:
                            layout.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, layout.c);
                            break;
                        case 24:
                            layout.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.G);
                            break;
                        case 25:
                            layout.i = o(typedArrayObtainStyledAttributes, index, layout.i);
                            break;
                        case 26:
                            layout.j = o(typedArrayObtainStyledAttributes, index, layout.j);
                            break;
                        case 27:
                            layout.F = typedArrayObtainStyledAttributes.getInt(index, layout.F);
                            break;
                        case 28:
                            layout.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.H);
                            break;
                        case 29:
                            layout.k = o(typedArrayObtainStyledAttributes, index, layout.k);
                            break;
                        case 30:
                            layout.l = o(typedArrayObtainStyledAttributes, index, layout.l);
                            break;
                        case 31:
                            layout.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.L);
                            break;
                        case 32:
                            layout.t = o(typedArrayObtainStyledAttributes, index, layout.t);
                            break;
                        case 33:
                            layout.u = o(typedArrayObtainStyledAttributes, index, layout.u);
                            break;
                        case 34:
                            layout.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.I);
                            break;
                        case 35:
                            layout.n = o(typedArrayObtainStyledAttributes, index, layout.n);
                            break;
                        case 36:
                            layout.m = o(typedArrayObtainStyledAttributes, index, layout.m);
                            break;
                        case 37:
                            layout.y = typedArrayObtainStyledAttributes.getFloat(index, layout.y);
                            break;
                        case 38:
                            constraint.f2370a = typedArrayObtainStyledAttributes.getResourceId(index, constraint.f2370a);
                            break;
                        case 39:
                            layout.V = typedArrayObtainStyledAttributes.getFloat(index, layout.V);
                            break;
                        case 40:
                            layout.U = typedArrayObtainStyledAttributes.getFloat(index, layout.U);
                            break;
                        case 41:
                            layout.W = typedArrayObtainStyledAttributes.getInt(index, layout.W);
                            break;
                        case 42:
                            layout.X = typedArrayObtainStyledAttributes.getInt(index, layout.X);
                            break;
                        case 43:
                            propertySet.d = typedArrayObtainStyledAttributes.getFloat(index, propertySet.d);
                            break;
                        case 44:
                            transform.m = true;
                            transform.n = typedArrayObtainStyledAttributes.getDimension(index, transform.n);
                            break;
                        case 45:
                            transform.c = typedArrayObtainStyledAttributes.getFloat(index, transform.c);
                            break;
                        case 46:
                            transform.d = typedArrayObtainStyledAttributes.getFloat(index, transform.d);
                            break;
                        case 47:
                            transform.e = typedArrayObtainStyledAttributes.getFloat(index, transform.e);
                            break;
                        case 48:
                            transform.f = typedArrayObtainStyledAttributes.getFloat(index, transform.f);
                            break;
                        case 49:
                            transform.g = typedArrayObtainStyledAttributes.getDimension(index, transform.g);
                            break;
                        case 50:
                            transform.h = typedArrayObtainStyledAttributes.getDimension(index, transform.h);
                            break;
                        case 51:
                            transform.j = typedArrayObtainStyledAttributes.getDimension(index, transform.j);
                            break;
                        case 52:
                            transform.k = typedArrayObtainStyledAttributes.getDimension(index, transform.k);
                            break;
                        case 53:
                            transform.l = typedArrayObtainStyledAttributes.getDimension(index, transform.l);
                            break;
                        case 54:
                            layout.Y = typedArrayObtainStyledAttributes.getInt(index, layout.Y);
                            break;
                        case 55:
                            layout.Z = typedArrayObtainStyledAttributes.getInt(index, layout.Z);
                            break;
                        case 56:
                            layout.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.a0);
                            break;
                        case 57:
                            layout.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.b0);
                            break;
                        case 58:
                            layout.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.c0);
                            break;
                        case 59:
                            layout.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.d0);
                            break;
                        case 60:
                            transform.b = typedArrayObtainStyledAttributes.getFloat(index, transform.b);
                            break;
                        case 61:
                            layout.A = o(typedArrayObtainStyledAttributes, index, layout.A);
                            break;
                        case 62:
                            layout.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.B);
                            break;
                        case 63:
                            layout.C = typedArrayObtainStyledAttributes.getFloat(index, layout.C);
                            break;
                        case 64:
                            motion.b = o(typedArrayObtainStyledAttributes, index, motion.b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                motion.d = Easing.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                                break;
                            } else {
                                motion.d = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            }
                        case 66:
                            motion.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            motion.h = typedArrayObtainStyledAttributes.getFloat(index, motion.h);
                            break;
                        case 68:
                            propertySet.e = typedArrayObtainStyledAttributes.getFloat(index, propertySet.e);
                            break;
                        case 69:
                            layout.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            layout.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            layout.g0 = typedArrayObtainStyledAttributes.getInt(index, layout.g0);
                            break;
                        case 73:
                            layout.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.h0);
                            break;
                        case 74:
                            layout.k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            layout.o0 = typedArrayObtainStyledAttributes.getBoolean(index, layout.o0);
                            break;
                        case 76:
                            motion.e = typedArrayObtainStyledAttributes.getInt(index, motion.e);
                            break;
                        case 77:
                            layout.l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            propertySet.c = typedArrayObtainStyledAttributes.getInt(index, propertySet.c);
                            break;
                        case 79:
                            motion.g = typedArrayObtainStyledAttributes.getFloat(index, motion.g);
                            break;
                        case 80:
                            layout.m0 = typedArrayObtainStyledAttributes.getBoolean(index, layout.m0);
                            break;
                        case 81:
                            layout.n0 = typedArrayObtainStyledAttributes.getBoolean(index, layout.n0);
                            break;
                        case 82:
                            motion.c = typedArrayObtainStyledAttributes.getInteger(index, motion.c);
                            break;
                        case 83:
                            transform.i = o(typedArrayObtainStyledAttributes, index, transform.i);
                            break;
                        case 84:
                            motion.j = typedArrayObtainStyledAttributes.getInteger(index, motion.j);
                            break;
                        case 85:
                            motion.i = typedArrayObtainStyledAttributes.getFloat(index, motion.i);
                            break;
                        case 86:
                            int i4 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i4 != 1) {
                                if (i4 != 3) {
                                    motion.l = typedArrayObtainStyledAttributes.getInteger(index, motion.m);
                                    break;
                                } else {
                                    String string = typedArrayObtainStyledAttributes.getString(index);
                                    motion.k = string;
                                    if (string.indexOf(q2.c) <= 0) {
                                        motion.l = -1;
                                        break;
                                    } else {
                                        motion.m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        motion.l = -2;
                                        break;
                                    }
                                }
                            } else {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                motion.m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    motion.l = -2;
                                    break;
                                }
                            }
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            layout.r = o(typedArrayObtainStyledAttributes, index, layout.r);
                            break;
                        case 92:
                            layout.s = o(typedArrayObtainStyledAttributes, index, layout.s);
                            break;
                        case 93:
                            layout.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.M);
                            break;
                        case 94:
                            layout.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.T);
                            break;
                        case 95:
                            p(layout, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            p(layout, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            layout.p0 = typedArrayObtainStyledAttributes.getInt(index, layout.p0);
                            break;
                    }
                    i2++;
                } else if (layout.k0 != null) {
                    layout.j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    public static int o(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.p(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void q(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i2 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > BitmapDescriptorFactory.HUE_RED && f2 > BitmapDescriptorFactory.HUE_RED) {
                            if (i2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.G = str;
    }

    public static void r(Constraint constraint, TypedArray typedArray) {
        char c;
        int indexCount = typedArray.getIndexCount();
        Constraint.Delta delta = new Constraint.Delta();
        delta.f2371a = new int[10];
        delta.b = new int[10];
        delta.c = 0;
        delta.d = new int[10];
        delta.e = new float[10];
        delta.f = 0;
        delta.g = new int[5];
        delta.h = new String[5];
        delta.i = 0;
        delta.j = new int[4];
        delta.k = new boolean[4];
        delta.l = 0;
        constraint.h = delta;
        Motion motion = constraint.d;
        motion.f2373a = false;
        Layout layout = constraint.e;
        layout.b = false;
        PropertySet propertySet = constraint.c;
        propertySet.f2374a = false;
        Transform transform = constraint.f;
        transform.f2375a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = j.get(index);
            SparseIntArray sparseIntArray = i;
            switch (i3) {
                case 2:
                    c = 5;
                    delta.b(2, typedArray.getDimensionPixelSize(index, layout.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c = 5;
                    break;
                case 5:
                    c = 5;
                    delta.c(5, typedArray.getString(index));
                    break;
                case 6:
                    delta.b(6, typedArray.getDimensionPixelOffset(index, layout.D));
                    c = 5;
                    break;
                case 7:
                    delta.b(7, typedArray.getDimensionPixelOffset(index, layout.E));
                    c = 5;
                    break;
                case 8:
                    delta.b(8, typedArray.getDimensionPixelSize(index, layout.K));
                    c = 5;
                    break;
                case 11:
                    delta.b(11, typedArray.getDimensionPixelSize(index, layout.Q));
                    c = 5;
                    break;
                case 12:
                    delta.b(12, typedArray.getDimensionPixelSize(index, layout.R));
                    c = 5;
                    break;
                case 13:
                    delta.b(13, typedArray.getDimensionPixelSize(index, layout.N));
                    c = 5;
                    break;
                case 14:
                    delta.b(14, typedArray.getDimensionPixelSize(index, layout.P));
                    c = 5;
                    break;
                case 15:
                    delta.b(15, typedArray.getDimensionPixelSize(index, layout.S));
                    c = 5;
                    break;
                case 16:
                    delta.b(16, typedArray.getDimensionPixelSize(index, layout.O));
                    c = 5;
                    break;
                case 17:
                    delta.b(17, typedArray.getDimensionPixelOffset(index, layout.e));
                    c = 5;
                    break;
                case 18:
                    delta.b(18, typedArray.getDimensionPixelOffset(index, layout.f));
                    c = 5;
                    break;
                case 19:
                    delta.a(typedArray.getFloat(index, layout.g), 19);
                    c = 5;
                    break;
                case 20:
                    delta.a(typedArray.getFloat(index, layout.x), 20);
                    c = 5;
                    break;
                case 21:
                    delta.b(21, typedArray.getLayoutDimension(index, layout.d));
                    c = 5;
                    break;
                case 22:
                    delta.b(22, h[typedArray.getInt(index, propertySet.b)]);
                    c = 5;
                    break;
                case 23:
                    delta.b(23, typedArray.getLayoutDimension(index, layout.c));
                    c = 5;
                    break;
                case 24:
                    delta.b(24, typedArray.getDimensionPixelSize(index, layout.G));
                    c = 5;
                    break;
                case 27:
                    delta.b(27, typedArray.getInt(index, layout.F));
                    c = 5;
                    break;
                case 28:
                    delta.b(28, typedArray.getDimensionPixelSize(index, layout.H));
                    c = 5;
                    break;
                case 31:
                    delta.b(31, typedArray.getDimensionPixelSize(index, layout.L));
                    c = 5;
                    break;
                case 34:
                    delta.b(34, typedArray.getDimensionPixelSize(index, layout.I));
                    c = 5;
                    break;
                case 37:
                    delta.a(typedArray.getFloat(index, layout.y), 37);
                    c = 5;
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, constraint.f2370a);
                    constraint.f2370a = resourceId;
                    delta.b(38, resourceId);
                    c = 5;
                    break;
                case 39:
                    delta.a(typedArray.getFloat(index, layout.V), 39);
                    c = 5;
                    break;
                case 40:
                    delta.a(typedArray.getFloat(index, layout.U), 40);
                    c = 5;
                    break;
                case 41:
                    delta.b(41, typedArray.getInt(index, layout.W));
                    c = 5;
                    break;
                case 42:
                    delta.b(42, typedArray.getInt(index, layout.X));
                    c = 5;
                    break;
                case 43:
                    delta.a(typedArray.getFloat(index, propertySet.d), 43);
                    c = 5;
                    break;
                case 44:
                    delta.d(44, true);
                    delta.a(typedArray.getDimension(index, transform.n), 44);
                    c = 5;
                    break;
                case 45:
                    delta.a(typedArray.getFloat(index, transform.c), 45);
                    c = 5;
                    break;
                case 46:
                    delta.a(typedArray.getFloat(index, transform.d), 46);
                    c = 5;
                    break;
                case 47:
                    delta.a(typedArray.getFloat(index, transform.e), 47);
                    c = 5;
                    break;
                case 48:
                    delta.a(typedArray.getFloat(index, transform.f), 48);
                    c = 5;
                    break;
                case 49:
                    delta.a(typedArray.getDimension(index, transform.g), 49);
                    c = 5;
                    break;
                case 50:
                    delta.a(typedArray.getDimension(index, transform.h), 50);
                    c = 5;
                    break;
                case 51:
                    delta.a(typedArray.getDimension(index, transform.j), 51);
                    c = 5;
                    break;
                case 52:
                    delta.a(typedArray.getDimension(index, transform.k), 52);
                    c = 5;
                    break;
                case 53:
                    delta.a(typedArray.getDimension(index, transform.l), 53);
                    c = 5;
                    break;
                case 54:
                    delta.b(54, typedArray.getInt(index, layout.Y));
                    c = 5;
                    break;
                case 55:
                    delta.b(55, typedArray.getInt(index, layout.Z));
                    c = 5;
                    break;
                case 56:
                    delta.b(56, typedArray.getDimensionPixelSize(index, layout.a0));
                    c = 5;
                    break;
                case 57:
                    delta.b(57, typedArray.getDimensionPixelSize(index, layout.b0));
                    c = 5;
                    break;
                case 58:
                    delta.b(58, typedArray.getDimensionPixelSize(index, layout.c0));
                    c = 5;
                    break;
                case 59:
                    delta.b(59, typedArray.getDimensionPixelSize(index, layout.d0));
                    c = 5;
                    break;
                case 60:
                    delta.a(typedArray.getFloat(index, transform.b), 60);
                    c = 5;
                    break;
                case 62:
                    delta.b(62, typedArray.getDimensionPixelSize(index, layout.B));
                    c = 5;
                    break;
                case 63:
                    delta.a(typedArray.getFloat(index, layout.C), 63);
                    c = 5;
                    break;
                case 64:
                    delta.b(64, o(typedArray, index, motion.b));
                    c = 5;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        delta.c(65, typedArray.getString(index));
                    } else {
                        delta.c(65, Easing.c[typedArray.getInteger(index, 0)]);
                    }
                    c = 5;
                    break;
                case 66:
                    delta.b(66, typedArray.getInt(index, 0));
                    c = 5;
                    break;
                case 67:
                    delta.a(typedArray.getFloat(index, motion.h), 67);
                    c = 5;
                    break;
                case 68:
                    delta.a(typedArray.getFloat(index, propertySet.e), 68);
                    c = 5;
                    break;
                case 69:
                    delta.a(typedArray.getFloat(index, 1.0f), 69);
                    c = 5;
                    break;
                case 70:
                    delta.a(typedArray.getFloat(index, 1.0f), 70);
                    c = 5;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    c = 5;
                    break;
                case 72:
                    delta.b(72, typedArray.getInt(index, layout.g0));
                    c = 5;
                    break;
                case 73:
                    delta.b(73, typedArray.getDimensionPixelSize(index, layout.h0));
                    c = 5;
                    break;
                case 74:
                    delta.c(74, typedArray.getString(index));
                    c = 5;
                    break;
                case 75:
                    delta.d(75, typedArray.getBoolean(index, layout.o0));
                    c = 5;
                    break;
                case 76:
                    delta.b(76, typedArray.getInt(index, motion.e));
                    c = 5;
                    break;
                case 77:
                    delta.c(77, typedArray.getString(index));
                    c = 5;
                    break;
                case 78:
                    delta.b(78, typedArray.getInt(index, propertySet.c));
                    c = 5;
                    break;
                case 79:
                    delta.a(typedArray.getFloat(index, motion.g), 79);
                    c = 5;
                    break;
                case 80:
                    delta.d(80, typedArray.getBoolean(index, layout.m0));
                    c = 5;
                    break;
                case 81:
                    delta.d(81, typedArray.getBoolean(index, layout.n0));
                    c = 5;
                    break;
                case 82:
                    delta.b(82, typedArray.getInteger(index, motion.c));
                    c = 5;
                    break;
                case 83:
                    delta.b(83, o(typedArray, index, transform.i));
                    c = 5;
                    break;
                case 84:
                    delta.b(84, typedArray.getInteger(index, motion.j));
                    c = 5;
                    break;
                case 85:
                    delta.a(typedArray.getFloat(index, motion.i), 85);
                    c = 5;
                    break;
                case 86:
                    int i4 = typedArray.peekValue(index).type;
                    if (i4 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        motion.m = resourceId2;
                        delta.b(89, resourceId2);
                        if (motion.m != -1) {
                            motion.l = -2;
                            delta.b(88, -2);
                        }
                    } else if (i4 == 3) {
                        String string = typedArray.getString(index);
                        motion.k = string;
                        delta.c(90, string);
                        if (motion.k.indexOf(q2.c) > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            motion.m = resourceId3;
                            delta.b(89, resourceId3);
                            motion.l = -2;
                            delta.b(88, -2);
                        } else {
                            motion.l = -1;
                            delta.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, motion.m);
                        motion.l = integer;
                        delta.b(88, integer);
                    }
                    c = 5;
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c = 5;
                    break;
                case 93:
                    delta.b(93, typedArray.getDimensionPixelSize(index, layout.M));
                    c = 5;
                    break;
                case 94:
                    delta.b(94, typedArray.getDimensionPixelSize(index, layout.T));
                    c = 5;
                    break;
                case 95:
                    p(delta, typedArray, index, 0);
                    c = 5;
                    break;
                case 96:
                    p(delta, typedArray, index, 1);
                    c = 5;
                    break;
                case 97:
                    delta.b(97, typedArray.getInt(index, layout.p0));
                    c = 5;
                    break;
                case 98:
                    if (MotionLayout.s0) {
                        int resourceId4 = typedArray.getResourceId(index, constraint.f2370a);
                        constraint.f2370a = resourceId4;
                        if (resourceId4 == -1) {
                            constraint.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        constraint.b = typedArray.getString(index);
                    } else {
                        constraint.f2370a = typedArray.getResourceId(index, constraint.f2370a);
                    }
                    c = 5;
                    break;
                case 99:
                    delta.d(99, typedArray.getBoolean(index, layout.h));
                    c = 5;
                    break;
            }
        }
    }

    public static String s(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    public final void a(MotionLayout motionLayout) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Constraint constraint;
        int childCount = motionLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.g;
            if (!map.containsKey(numValueOf)) {
                Log.w("ConstraintSet", "id unknown " + Debug.d(childAt));
            } else {
                if (this.f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id)) && (constraint = (Constraint) map.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.e(childAt, constraint.g);
                }
            }
        }
    }

    public final void b(ConstraintSet constraintSet) {
        for (Constraint constraint : constraintSet.g.values()) {
            if (constraint.h != null) {
                if (constraint.b == null) {
                    constraint.h.e(l(constraint.f2370a));
                } else {
                    Iterator it = this.g.keySet().iterator();
                    while (it.hasNext()) {
                        Constraint constraintL = l(((Integer) it.next()).intValue());
                        String str = constraintL.e.l0;
                        if (str != null && constraint.b.matches(str)) {
                            constraint.h.e(constraintL);
                            constraintL.g.putAll((HashMap) constraint.g.clone());
                        }
                    }
                }
            }
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        d(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void d(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.g;
        HashSet hashSet = new HashSet(map.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + Debug.d(childAt));
            } else {
                if (this.f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        Constraint constraint = (Constraint) map.get(Integer.valueOf(id));
                        if (constraint != null) {
                            PropertySet propertySet = constraint.c;
                            Layout layout = constraint.e;
                            Transform transform = constraint.f;
                            if (childAt instanceof Barrier) {
                                layout.i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(layout.g0);
                                barrier.setMargin(layout.h0);
                                barrier.setAllowsGoneWidget(layout.o0);
                                int[] iArr = layout.j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = layout.k0;
                                    if (str != null) {
                                        int[] iArrI = i(barrier, str);
                                        layout.j0 = iArrI;
                                        barrier.setReferencedIds(iArrI);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.a();
                            constraint.b(layoutParams);
                            ConstraintAttribute.e(childAt, constraint.g);
                            childAt.setLayoutParams(layoutParams);
                            if (propertySet.c == 0) {
                                childAt.setVisibility(propertySet.b);
                            }
                            childAt.setAlpha(propertySet.d);
                            childAt.setRotation(transform.b);
                            childAt.setRotationX(transform.c);
                            childAt.setRotationY(transform.d);
                            childAt.setScaleX(transform.e);
                            childAt.setScaleY(transform.f);
                            if (transform.i != -1) {
                                if (((View) childAt.getParent()).findViewById(transform.i) != null) {
                                    float bottom = (r5.getBottom() + r5.getTop()) / 2.0f;
                                    float right = (r5.getRight() + r5.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(transform.g)) {
                                    childAt.setPivotX(transform.g);
                                }
                                if (!Float.isNaN(transform.h)) {
                                    childAt.setPivotY(transform.h);
                                }
                            }
                            childAt.setTranslationX(transform.j);
                            childAt.setTranslationY(transform.k);
                            childAt.setTranslationZ(transform.l);
                            if (transform.m) {
                                childAt.setElevation(transform.n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            Constraint constraint2 = (Constraint) map.get(num);
            if (constraint2 != null) {
                Layout layout2 = constraint2.e;
                if (layout2.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = layout2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = layout2.k0;
                        if (str2 != null) {
                            int[] iArrI2 = i(barrier2, str2);
                            layout2.j0 = iArrI2;
                            barrier2.setReferencedIds(iArrI2);
                        }
                    }
                    barrier2.setType(layout2.g0);
                    barrier2.setMargin(layout2.h0);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.q();
                    constraint2.b(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (layout2.f2372a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.b(layoutParamsGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).g(constraintLayout);
            }
        }
    }

    public final void f(int i2) {
        Constraint constraint;
        Integer numValueOf = Integer.valueOf(com.woolworths.R.id.promotion_view);
        HashMap map = this.g;
        if (!map.containsKey(numValueOf) || (constraint = (Constraint) map.get(numValueOf)) == null) {
            return;
        }
        Layout layout = constraint.e;
        switch (i2) {
            case 1:
                layout.j = -1;
                layout.i = -1;
                layout.G = -1;
                layout.N = Integer.MIN_VALUE;
                return;
            case 2:
                layout.l = -1;
                layout.k = -1;
                layout.H = -1;
                layout.P = Integer.MIN_VALUE;
                return;
            case 3:
                layout.n = -1;
                layout.m = -1;
                layout.I = 0;
                layout.O = Integer.MIN_VALUE;
                return;
            case 4:
                layout.o = -1;
                layout.p = -1;
                layout.J = 0;
                layout.Q = Integer.MIN_VALUE;
                return;
            case 5:
                layout.q = -1;
                layout.r = -1;
                layout.s = -1;
                layout.M = 0;
                layout.T = Integer.MIN_VALUE;
                return;
            case 6:
                layout.t = -1;
                layout.u = -1;
                layout.L = 0;
                layout.S = Integer.MIN_VALUE;
                return;
            case 7:
                layout.v = -1;
                layout.w = -1;
                layout.K = 0;
                layout.R = Integer.MIN_VALUE;
                return;
            case 8:
                layout.C = -1.0f;
                layout.B = -1;
                layout.A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void g(ConstraintLayout constraintLayout) {
        int i2;
        HashMap map;
        int i3;
        ConstraintSet constraintSet = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = constraintSet.g;
        map2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (constraintSet.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = (Constraint) map2.get(Integer.valueOf(id));
            if (constraint == null) {
                i2 = childCount;
                map = map2;
                i3 = i4;
            } else {
                PropertySet propertySet = constraint.c;
                Layout layout = constraint.e;
                Transform transform = constraint.f;
                i2 = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i3 = i4;
                HashMap map4 = constraintSet.e;
                for (String str : map4.keySet()) {
                    ConstraintAttribute constraintAttribute = (ConstraintAttribute) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbU = a.u(" Custom Attribute \"", str, "\" not found on ");
                        sbU.append(cls.getName());
                        Log.e("TransitionLayout", sbU.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbU2 = a.u(" Custom Attribute \"", str, "\" not found on ");
                        sbU2.append(cls.getName());
                        Log.e("TransitionLayout", sbU2.toString(), e3);
                    }
                    map4 = map5;
                }
                constraint.g = map3;
                constraint.d(id, layoutParams);
                propertySet.b = childAt.getVisibility();
                propertySet.d = childAt.getAlpha();
                transform.b = childAt.getRotation();
                transform.c = childAt.getRotationX();
                transform.d = childAt.getRotationY();
                transform.e = childAt.getScaleX();
                transform.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    transform.g = pivotX;
                    transform.h = pivotY;
                }
                transform.j = childAt.getTranslationX();
                transform.k = childAt.getTranslationY();
                transform.l = childAt.getTranslationZ();
                if (transform.m) {
                    transform.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    layout.o0 = barrier.getAllowsGoneWidget();
                    layout.j0 = barrier.getReferencedIds();
                    layout.g0 = barrier.getType();
                    layout.h0 = barrier.getMargin();
                }
            }
            i4 = i3 + 1;
            constraintSet = this;
            childCount = i2;
            map2 = map;
        }
    }

    public final void h(int i2, int i3, int i4, int i5) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i2), new Constraint());
        }
        Constraint constraint = (Constraint) map.get(Integer.valueOf(i2));
        if (constraint == null) {
            return;
        }
        Layout layout = constraint.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    layout.i = i4;
                    layout.j = -1;
                    return;
                } else if (i5 == 2) {
                    layout.j = i4;
                    layout.i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + s(i5) + " undefined");
                }
            case 2:
                if (i5 == 1) {
                    layout.k = i4;
                    layout.l = -1;
                    return;
                } else if (i5 == 2) {
                    layout.l = i4;
                    layout.k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
            case 3:
                if (i5 == 3) {
                    layout.m = i4;
                    layout.n = -1;
                    layout.q = -1;
                    layout.r = -1;
                    layout.s = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
                layout.n = i4;
                layout.m = -1;
                layout.q = -1;
                layout.r = -1;
                layout.s = -1;
                return;
            case 4:
                if (i5 == 4) {
                    layout.p = i4;
                    layout.o = -1;
                    layout.q = -1;
                    layout.r = -1;
                    layout.s = -1;
                    return;
                }
                if (i5 != 3) {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
                layout.o = i4;
                layout.p = -1;
                layout.q = -1;
                layout.r = -1;
                layout.s = -1;
                return;
            case 5:
                if (i5 == 5) {
                    layout.q = i4;
                    layout.p = -1;
                    layout.o = -1;
                    layout.m = -1;
                    layout.n = -1;
                    return;
                }
                if (i5 == 3) {
                    layout.r = i4;
                    layout.p = -1;
                    layout.o = -1;
                    layout.m = -1;
                    layout.n = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
                layout.s = i4;
                layout.p = -1;
                layout.o = -1;
                layout.m = -1;
                layout.n = -1;
                return;
            case 6:
                if (i5 == 6) {
                    layout.u = i4;
                    layout.t = -1;
                    return;
                } else if (i5 == 7) {
                    layout.t = i4;
                    layout.u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
            case 7:
                if (i5 == 7) {
                    layout.w = i4;
                    layout.v = -1;
                    return;
                } else if (i5 == 6) {
                    layout.v = i4;
                    layout.w = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
            default:
                throw new IllegalArgumentException(s(i3) + " to " + s(i5) + " unknown");
        }
    }

    public final Constraint k(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i2), new Constraint());
        }
        return (Constraint) map.get(Integer.valueOf(i2));
    }

    public final Constraint l(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (map.containsKey(numValueOf)) {
            return (Constraint) map.get(Integer.valueOf(i2));
        }
        return null;
    }

    public final void m(int i2, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    Constraint constraintJ = j(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        constraintJ.e.f2372a = true;
                    }
                    this.g.put(Integer.valueOf(constraintJ.f2370a), constraintJ);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01af, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.n(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
