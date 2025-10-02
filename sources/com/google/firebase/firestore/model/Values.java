package com.google.firebase.firestore.model;

import androidx.constraintlayout.core.state.a;
import com.google.cloud.datastore.core.number.NumberComparisonHelper;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.ArrayValueOrBuilder;
import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;
import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public class Values {

    /* renamed from: a, reason: collision with root package name */
    public static final Value f15537a;
    public static final Value b;
    public static final Value c;
    public static final Value d;
    public static final Value e;
    public static final Value f;
    public static final Value g;
    public static final Value h;
    public static final Value i;
    public static final Value j;
    public static final Value k;
    public static final Value l;
    public static final Value m;
    public static final Value n;
    public static final Value o;
    public static final Value p;

    /* renamed from: com.google.firebase.firestore.model.Values$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15538a;

        static {
            int[] iArr = new int[Value.ValueTypeCase.values().length];
            f15538a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15538a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15538a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15538a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15538a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15538a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15538a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15538a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15538a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15538a[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15538a[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        Value.Builder builderJ0 = Value.j0();
        builderJ0.p();
        Value.V((Value) builderJ0.e, Double.NaN);
        f15537a = (Value) builderJ0.m();
        Value.Builder builderJ02 = Value.j0();
        builderJ02.p();
        Value.S((Value) builderJ02.e);
        Value value = (Value) builderJ02.m();
        b = value;
        c = value;
        Value.Builder builderJ03 = Value.j0();
        builderJ03.p();
        Value.M((Value) builderJ03.e, "__max__");
        Value value2 = (Value) builderJ03.m();
        d = value2;
        Value.Builder builderJ04 = Value.j0();
        MapValue.Builder builderR = MapValue.R();
        builderR.t(value2, "__type__");
        builderJ04.t(builderR);
        e = (Value) builderJ04.m();
        Value.Builder builderJ05 = Value.j0();
        builderJ05.p();
        Value.M((Value) builderJ05.e, "__vector__");
        Value value3 = (Value) builderJ05.m();
        f = value3;
        Value.Builder builderJ06 = Value.j0();
        MapValue.Builder builderR2 = MapValue.R();
        builderR2.t(value3, "__type__");
        Value.Builder builderJ07 = Value.j0();
        ArrayValue.Builder builderR3 = ArrayValue.R();
        builderJ07.p();
        Value.Q((ArrayValue) builderR3.m(), (Value) builderJ07.e);
        builderR2.t((Value) builderJ07.m(), "value");
        builderJ06.t(builderR2);
        g = (Value) builderJ06.m();
        Value.Builder builderJ08 = Value.j0();
        builderJ08.p();
        Value.T((Value) builderJ08.e);
        h = (Value) builderJ08.m();
        Value.Builder builderJ09 = Value.j0();
        builderJ09.p();
        Value.V((Value) builderJ09.e, Double.NaN);
        i = (Value) builderJ09.m();
        Value.Builder builderJ010 = Value.j0();
        Timestamp.Builder builderQ = Timestamp.Q();
        builderQ.p();
        Timestamp.L((Timestamp) builderQ.e, Long.MIN_VALUE);
        builderJ010.p();
        Value.L((Value) builderJ010.e, (Timestamp) builderQ.m());
        j = (Value) builderJ010.m();
        Value.Builder builderJ011 = Value.j0();
        builderJ011.p();
        Value.M((Value) builderJ011.e, "");
        k = (Value) builderJ011.m();
        Value.Builder builderJ012 = Value.j0();
        ByteString byteString = ByteString.e;
        builderJ012.p();
        Value.N((Value) builderJ012.e, byteString);
        l = (Value) builderJ012.m();
        DocumentKey documentKeyB = DocumentKey.b();
        Value.Builder builderJ013 = Value.j0();
        String str = "projects//databases//documents/" + documentKeyB.d.b();
        builderJ013.p();
        Value.O((Value) builderJ013.e, str);
        m = (Value) builderJ013.m();
        Value.Builder builderJ014 = Value.j0();
        LatLng.Builder builderQ2 = LatLng.Q();
        builderQ2.p();
        LatLng.L((LatLng) builderQ2.e);
        builderQ2.p();
        LatLng.M((LatLng) builderQ2.e);
        builderJ014.p();
        Value.P((Value) builderJ014.e, (LatLng) builderQ2.m());
        n = (Value) builderJ014.m();
        Value.Builder builderJ015 = Value.j0();
        ArrayValue arrayValueO = ArrayValue.O();
        builderJ015.p();
        Value.Q(arrayValueO, (Value) builderJ015.e);
        o = (Value) builderJ015.m();
        Value.Builder builderJ016 = Value.j0();
        MapValue mapValueM = MapValue.M();
        builderJ016.p();
        Value.R((Value) builderJ016.e, mapValueM);
        p = (Value) builderJ016.m();
    }

    public static void a(StringBuilder sb, Value value) {
        boolean z = true;
        switch (value.h0().ordinal()) {
            case 0:
                sb.append("null");
                return;
            case 1:
                sb.append(value.X());
                return;
            case 2:
                sb.append(value.c0());
                return;
            case 3:
                sb.append(value.a0());
                return;
            case 4:
                Timestamp timestampG0 = value.g0();
                sb.append("time(" + timestampG0.P() + "," + timestampG0.O() + ")");
                return;
            case 5:
                sb.append(value.f0());
                return;
            case 6:
                sb.append(Util.h(value.Y()));
                return;
            case 7:
                Assert.b(i(value), "Value should be a ReferenceValue", new Object[0]);
                sb.append(DocumentKey.c(value.e0()));
                return;
            case 8:
                LatLng latLngB0 = value.b0();
                double dO = latLngB0.O();
                double dP = latLngB0.P();
                StringBuilder sbN = a.n(dO, "geo(", ",");
                sbN.append(dP);
                sbN.append(")");
                sb.append(sbN.toString());
                return;
            case 9:
                ArrayValue arrayValueW = value.W();
                sb.append("[");
                for (int i2 = 0; i2 < arrayValueW.Q(); i2++) {
                    a(sb, arrayValueW.P(i2));
                    if (i2 != arrayValueW.Q() - 1) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                return;
            case 10:
                MapValue mapValueD0 = value.d0();
                ArrayList arrayList = new ArrayList(mapValueD0.O().keySet());
                Collections.sort(arrayList);
                sb.append("{");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (z) {
                        z = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(str);
                    sb.append(":");
                    a(sb, mapValueD0.Q(str));
                }
                sb.append("}");
                return;
            default:
                Assert.a("Invalid value type: " + value.h0(), new Object[0]);
                throw null;
        }
    }

    public static int b(Value value, Value value2) {
        int iK = k(value);
        int iK2 = k(value2);
        if (iK != iK2) {
            return Integer.compare(iK, iK2);
        }
        if (iK != Integer.MAX_VALUE) {
            switch (iK) {
                case 0:
                    break;
                case 1:
                    boolean zX = value.X();
                    boolean zX2 = value2.X();
                    int i2 = Util.f15603a;
                    if (zX == zX2) {
                        return 0;
                    }
                    return zX ? 1 : -1;
                case 2:
                    Value.ValueTypeCase valueTypeCaseH0 = value.h0();
                    Value.ValueTypeCase valueTypeCase = Value.ValueTypeCase.f;
                    Value.ValueTypeCase valueTypeCase2 = Value.ValueTypeCase.g;
                    if (valueTypeCaseH0 == valueTypeCase2) {
                        double dA0 = value.a0();
                        if (value2.h0() == valueTypeCase2) {
                            double dA02 = value2.a0();
                            int i3 = Util.f15603a;
                            return NumberComparisonHelper.a(dA0, dA02);
                        }
                        if (value2.h0() == valueTypeCase) {
                            return Util.d(dA0, value2.c0());
                        }
                    } else if (value.h0() == valueTypeCase) {
                        long jC0 = value.c0();
                        if (value2.h0() == valueTypeCase) {
                            return Long.compare(jC0, value2.c0());
                        }
                        if (value2.h0() == valueTypeCase2) {
                            return Util.d(value2.a0(), jC0) * (-1);
                        }
                    }
                    Assert.a("Unexpected values: %s vs %s", value, value2);
                    throw null;
                case 3:
                    Timestamp timestampG0 = value.g0();
                    Timestamp timestampG02 = value2.g0();
                    int iCompare = Long.compare(timestampG0.P(), timestampG02.P());
                    return iCompare != 0 ? iCompare : Integer.compare(timestampG0.O(), timestampG02.O());
                case 4:
                    Timestamp timestampA = ServerTimestamps.a(value);
                    Timestamp timestampA2 = ServerTimestamps.a(value2);
                    int iCompare2 = Long.compare(timestampA.P(), timestampA2.P());
                    return iCompare2 != 0 ? iCompare2 : Integer.compare(timestampA.O(), timestampA2.O());
                case 5:
                    return Util.e(value.f0(), value2.f0());
                case 6:
                    return Util.c(value.Y(), value2.Y());
                case 7:
                    String strE0 = value.e0();
                    String strE02 = value2.e0();
                    String[] strArrSplit = strE0.split(q2.c, -1);
                    String[] strArrSplit2 = strE02.split(q2.c, -1);
                    int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
                    for (int i4 = 0; i4 < iMin; i4++) {
                        int iCompareTo = strArrSplit[i4].compareTo(strArrSplit2[i4]);
                        if (iCompareTo != 0) {
                            return iCompareTo;
                        }
                    }
                    return Integer.compare(strArrSplit.length, strArrSplit2.length);
                case 8:
                    LatLng latLngB0 = value.b0();
                    LatLng latLngB02 = value2.b0();
                    double dO = latLngB0.O();
                    double dO2 = latLngB02.O();
                    int i5 = Util.f15603a;
                    int iA = NumberComparisonHelper.a(dO, dO2);
                    return iA == 0 ? NumberComparisonHelper.a(latLngB0.P(), latLngB02.P()) : iA;
                case 9:
                    return c(value.W(), value2.W());
                case 10:
                    MapValue mapValueD0 = value.d0();
                    MapValue mapValueD02 = value2.d0();
                    Map mapO = mapValueD0.O();
                    Map mapO2 = mapValueD02.O();
                    ArrayValue arrayValueW = ((Value) mapO.get("value")).W();
                    ArrayValue arrayValueW2 = ((Value) mapO2.get("value")).W();
                    int iCompare3 = Integer.compare(arrayValueW.Q(), arrayValueW2.Q());
                    return iCompare3 != 0 ? iCompare3 : c(arrayValueW, arrayValueW2);
                case 11:
                    MapValue mapValueD03 = value.d0();
                    MapValue mapValueD04 = value2.d0();
                    Iterator it = new TreeMap(mapValueD03.O()).entrySet().iterator();
                    Iterator it2 = new TreeMap(mapValueD04.O()).entrySet().iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int iE = Util.e((String) entry.getKey(), (String) entry2.getKey());
                        if (iE != 0) {
                            return iE;
                        }
                        int iB = b((Value) entry.getValue(), (Value) entry2.getValue());
                        if (iB != 0) {
                            return iB;
                        }
                    }
                    boolean zHasNext = it.hasNext();
                    boolean zHasNext2 = it2.hasNext();
                    int i6 = Util.f15603a;
                    if (zHasNext == zHasNext2) {
                        return 0;
                    }
                    return zHasNext ? 1 : -1;
                default:
                    Assert.a(YU.a.d(iK, "Invalid value type: "), new Object[0]);
                    throw null;
            }
        }
        return 0;
    }

    public static int c(ArrayValue arrayValue, ArrayValue arrayValue2) {
        int iMin = Math.min(arrayValue.Q(), arrayValue2.Q());
        for (int i2 = 0; i2 < iMin; i2++) {
            int iB = b(arrayValue.P(i2), arrayValue2.P(i2));
            if (iB != 0) {
                return iB;
            }
        }
        return Integer.compare(arrayValue.Q(), arrayValue2.Q());
    }

    public static boolean d(ArrayValueOrBuilder arrayValueOrBuilder, Value value) {
        Iterator it = arrayValueOrBuilder.i().iterator();
        while (it.hasNext()) {
            if (e((Value) it.next(), value)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8 A[ADDED_TO_REGION, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(com.google.firestore.v1.Value r5, com.google.firestore.v1.Value r6) {
        /*
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto Le8
            if (r6 != 0) goto Lb
            goto Le8
        Lb:
            int r2 = k(r5)
            int r3 = k(r6)
            if (r2 == r3) goto L16
            return r1
        L16:
            r3 = 2
            if (r2 == r3) goto Laa
            r3 = 4
            if (r2 == r3) goto L9d
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L9c
            switch(r2) {
                case 9: goto L70;
                case 10: goto L29;
                case 11: goto L29;
                default: goto L24;
            }
        L24:
            boolean r5 = r5.equals(r6)
            return r5
        L29:
            com.google.firestore.v1.MapValue r5 = r5.d0()
            com.google.firestore.v1.MapValue r6 = r6.d0()
            int r2 = r5.N()
            int r3 = r6.N()
            if (r2 == r3) goto L3c
            goto L6e
        L3c:
            java.util.Map r5 = r5.O()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L48:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map r3 = r6.O()
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r3 = r3.get(r4)
            com.google.firestore.v1.Value r3 = (com.google.firestore.v1.Value) r3
            java.lang.Object r2 = r2.getValue()
            com.google.firestore.v1.Value r2 = (com.google.firestore.v1.Value) r2
            boolean r2 = e(r2, r3)
            if (r2 != 0) goto L48
        L6e:
            return r1
        L6f:
            return r0
        L70:
            com.google.firestore.v1.ArrayValue r5 = r5.W()
            com.google.firestore.v1.ArrayValue r6 = r6.W()
            int r2 = r5.Q()
            int r3 = r6.Q()
            if (r2 == r3) goto L83
            goto L98
        L83:
            r2 = r1
        L84:
            int r3 = r5.Q()
            if (r2 >= r3) goto L9c
            com.google.firestore.v1.Value r3 = r5.P(r2)
            com.google.firestore.v1.Value r4 = r6.P(r2)
            boolean r3 = e(r3, r4)
            if (r3 != 0) goto L99
        L98:
            return r1
        L99:
            int r2 = r2 + 1
            goto L84
        L9c:
            return r0
        L9d:
            com.google.protobuf.Timestamp r5 = com.google.firebase.firestore.model.ServerTimestamps.a(r5)
            com.google.protobuf.Timestamp r6 = com.google.firebase.firestore.model.ServerTimestamps.a(r6)
            boolean r5 = r5.equals(r6)
            return r5
        Laa:
            com.google.firestore.v1.Value$ValueTypeCase r2 = r5.h0()
            com.google.firestore.v1.Value$ValueTypeCase r3 = com.google.firestore.v1.Value.ValueTypeCase.f
            if (r2 != r3) goto Lc5
            com.google.firestore.v1.Value$ValueTypeCase r2 = r6.h0()
            if (r2 != r3) goto Lc5
            long r2 = r5.c0()
            long r5 = r6.c0()
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto Le8
            goto Le7
        Lc5:
            com.google.firestore.v1.Value$ValueTypeCase r2 = r5.h0()
            com.google.firestore.v1.Value$ValueTypeCase r3 = com.google.firestore.v1.Value.ValueTypeCase.g
            if (r2 != r3) goto Le8
            com.google.firestore.v1.Value$ValueTypeCase r2 = r6.h0()
            if (r2 != r3) goto Le8
            double r2 = r5.a0()
            long r2 = java.lang.Double.doubleToLongBits(r2)
            double r5 = r6.a0()
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto Le8
        Le7:
            return r0
        Le8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.model.Values.e(com.google.firestore.v1.Value, com.google.firestore.v1.Value):boolean");
    }

    public static boolean f(Value value) {
        return value != null && value.h0() == Value.ValueTypeCase.m;
    }

    public static boolean g(Value value) {
        return value != null && value.h0() == Value.ValueTypeCase.g;
    }

    public static boolean h(Value value) {
        return value != null && value.h0() == Value.ValueTypeCase.f;
    }

    public static boolean i(Value value) {
        return value != null && value.h0() == Value.ValueTypeCase.k;
    }

    public static boolean j(Value value) {
        return f.equals(value.d0().O().get("__type__"));
    }

    public static int k(Value value) {
        switch (value.h0().ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                if (ServerTimestamps.c(value)) {
                    return 4;
                }
                if (d.equals(value.d0().O().get("__type__"))) {
                    return Integer.MAX_VALUE;
                }
                return j(value) ? 10 : 11;
            default:
                Assert.a("Invalid value type: " + value.h0(), new Object[0]);
                throw null;
        }
    }
}
