package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
abstract class e8<T> implements x0 {
    private static final String d = "mdCParamNull";
    private static final int e = 3;
    private static final int f = 2;
    private static final int g = 1;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<c0> f16451a;
    private ArrayList<c0> b;
    private ArrayList<g6> c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16452a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] d;
        static final /* synthetic */ int[] e;
        static final /* synthetic */ int[] f;

        static {
            int[] iArr = new int[u1.i.values().length];
            f = iArr;
            try {
                iArr[u1.i.VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f[u1.i.TIMESTAMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[u1.h.values().length];
            e = iArr2;
            try {
                iArr2[u1.h.TIME_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr3 = new int[u1.j.values().length];
            d = iArr3;
            try {
                iArr3[u1.j.OS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[u1.j.CUSTOM_PARAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[u1.j.USER_JOURNEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[u1.j.OCQ_RULE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[u1.g.values().length];
            c = iArr4;
            try {
                iArr4[u1.g.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[u1.g.MULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[u1.g.DIVIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[u1.g.SUBSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[u1.g.LOWER_CASE.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                c[u1.g.UPPER_CASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                c[u1.g.ABS.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr5 = new int[u1.e.values().length];
            b = iArr5;
            try {
                iArr5[u1.e.MATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[u1.e.EQUALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[u1.e.DOES_NOT_EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[u1.e.CONTAINS.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[u1.e.ENDS_WITH.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[u1.e.HAS_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[u1.e.STARTS_WITH.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[u1.e.GREATER_THAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[u1.e.DOES_NOT_CONTAIN.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[u1.e.SMALLER_THAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                b[u1.e.DIFF.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            int[] iArr6 = new int[u1.k.values().length];
            f16452a = iArr6;
            try {
                iArr6[u1.k.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f16452a[u1.k.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f16452a[u1.k.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f16452a[u1.k.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    private c0 a(String str) {
        if (this.f16451a != null && str != null) {
            a4.b("TREV2 getEvent uj: " + this.f16451a);
            Iterator<c0> it = this.f16451a.iterator();
            while (it.hasNext()) {
                c0 next = it.next();
                if (next.getName().equals(str)) {
                    a4.b("TREV2 getEvent event name, value: " + next.getName() + " , " + next.i());
                    return next;
                }
            }
        }
        return null;
    }

    private String b(String str) {
        ArrayList<g6> arrayList;
        if (str != null && (arrayList = this.c) != null) {
            Iterator<g6> it = arrayList.iterator();
            while (it.hasNext()) {
                g6 next = it.next();
                if (str.equals(next.f16501a)) {
                    return String.valueOf(next.c);
                }
            }
        }
        return null;
    }

    private String c(String str) {
        u1.h hVarA;
        if (str == null || (hVarA = u1.h.a(str)) == null || a.e[hVarA.ordinal()] != 1) {
            return null;
        }
        return String.valueOf(System.currentTimeMillis());
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        return null;
    }

    private String b(String str, u1.k kVar) {
        if (this.b != null && str != null && kVar != null) {
            Pattern patternCompile = Pattern.compile("Name:\\s(.*)\\sValue:\\s(.*)");
            Iterator<c0> it = this.b.iterator();
            while (it.hasNext()) {
                c0 next = it.next();
                if (next.i() != null && patternCompile.matcher(next.i().toString()).matches() && next.i().toString().replaceAll("Name:\\s", "").replaceAll("\\sValue:\\s(.*)", "").equals(str)) {
                    u1.k kVarA = u1.k.a(next.j());
                    if (kVarA == null) {
                        return d;
                    }
                    u1.k kVar2 = u1.k.STRING;
                    if (kVar == kVar2 && kVarA != kVar2) {
                        return d;
                    }
                    u1.k kVar3 = u1.k.BOOLEAN;
                    if (kVar == kVar3 && kVarA != kVar3) {
                        return d;
                    }
                    u1.k kVar4 = u1.k.DOUBLE;
                    return (kVar != kVar4 || kVarA == kVar4 || kVarA == u1.k.INTEGER) ? next.i().toString().replaceAll("Name:\\s(.*)\\sValue:\\s", "") : d;
                }
            }
        }
        return d;
    }

    public <K> K a(Object obj, Class<K> cls) {
        try {
            return cls.cast(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a A[PHI: r7
  0x007a: PHI (r7v11 ??) = (r7v9 ??), (r7v76 ??), (r7v78 ??), (r7v82 ??), (r7v82 ??), (r7v88 ??), (r7v88 ??) binds: [B:73:0x00bb, B:55:0x008c, B:47:0x0073, B:44:0x006b, B:42:0x0068, B:25:0x003f, B:23:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ca  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v82 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v89 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r7v90 */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r7v93 */
    /* JADX WARN: Type inference failed for: r7v94 */
    /* JADX WARN: Type inference failed for: r7v95 */
    /* JADX WARN: Type inference failed for: r7v96 */
    /* JADX WARN: Type inference failed for: r7v97 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r7, java.lang.String r8, com.medallia.digital.mobilesdk.u1.k r9, com.medallia.digital.mobilesdk.u1.e r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.e8.a(java.lang.String, java.lang.String, com.medallia.digital.mobilesdk.u1$k, com.medallia.digital.mobilesdk.u1$e):java.lang.Object");
    }

    public T a(ArrayList<c0> arrayList, ArrayList<c0> arrayList2, ArrayList<g6> arrayList3) {
        this.f16451a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        return null;
    }

    private String a(c0 c0Var, String str) {
        u1.i iVarA;
        if (str == null || c0Var == null || (iVarA = u1.i.a(str)) == null) {
            return null;
        }
        int i = a.f[iVarA.ordinal()];
        if (i == 1) {
            return c0Var.i().toString();
        }
        if (i != 2) {
            return null;
        }
        return String.valueOf(c0Var.h());
    }

    private String a(u1.g gVar, String str, String str2) throws NumberFormatException {
        if (gVar != null) {
            switch (a.c[gVar.ordinal()]) {
                case 1:
                    if (str != null && str2 != null) {
                        return String.valueOf(Long.parseLong(str2) + Long.parseLong(str));
                    }
                    break;
                case 2:
                    if (str != null && str2 != null) {
                        return String.valueOf(Long.parseLong(str2) * Long.parseLong(str));
                    }
                    break;
                case 3:
                    if (str != null && str2 != null) {
                        return String.valueOf(Long.parseLong(str) / Long.parseLong(str2));
                    }
                    break;
                case 4:
                    if (str != null && str2 != null) {
                        return String.valueOf(Long.parseLong(str) - Long.parseLong(str2));
                    }
                    break;
                case 5:
                    if (str != null) {
                        return str.toLowerCase();
                    }
                    break;
                case 6:
                    if (str != null) {
                        return str.toUpperCase();
                    }
                    break;
                case 7:
                    if (str != null) {
                        return String.valueOf(Math.abs(Long.parseLong(str)));
                    }
                    break;
                default:
                    return null;
            }
        }
        return str;
    }

    public String a(String str, u1.k kVar) {
        String str2;
        u1.j jVarA;
        if (str == null) {
            return null;
        }
        if (!str.startsWith("$")) {
            return str;
        }
        String[] strArrSplit = (str.startsWith("$CUSTOM_PARAM.") || str.startsWith("$OCQ_RULE.")) ? str.replace("$", "").split("\\.", 2) : str.replace("$", "").split("\\.");
        if (strArrSplit.length == 0 || (str2 = strArrSplit[0]) == null || strArrSplit[1] == null || (jVarA = u1.j.a(str2)) == null) {
            return null;
        }
        int i = a.d[jVarA.ordinal()];
        if (i == 1) {
            return c(strArrSplit[1]);
        }
        if (i == 2) {
            return b(strArrSplit[1], kVar);
        }
        if (i != 3) {
            if (i != 4) {
                return null;
            }
            return b(strArrSplit[1]);
        }
        if (strArrSplit.length != 3) {
            return null;
        }
        String str3 = strArrSplit[1];
        String str4 = strArrSplit[2];
        c0 c0VarA = a(str3);
        a4.b("TREV2 getValueFrom: " + a(c0VarA, str4));
        return a(c0VarA, str4);
    }

    public String a(ArrayList<p6> arrayList, String str, u1.k kVar) throws NumberFormatException {
        if (arrayList != null && str != null) {
            Iterator<p6> it = arrayList.iterator();
            while (it.hasNext()) {
                p6 next = it.next();
                str = a(next.a(), str, a(next.b(), kVar));
            }
        }
        return str;
    }
}
