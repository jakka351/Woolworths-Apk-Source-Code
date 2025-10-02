package androidx.constraintlayout.core.state;

import androidx.camera.core.impl.e;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ConstraintSetParser {

    public static class DesignElement {
    }

    public static class FiniteGenerator implements GeneratedValue {

        /* renamed from: a, reason: collision with root package name */
        public float f2296a;
        public boolean b;
        public String c;
        public String d;
        public float e;
        public float f;

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public final float value() {
            float f = this.e;
            if (f >= this.f) {
                this.b = true;
            }
            if (!this.b) {
                this.e = f + this.f2296a;
            }
            return this.e;
        }
    }

    public interface GeneratedValue {
        float value();
    }

    public static class Generator implements GeneratedValue {

        /* renamed from: a, reason: collision with root package name */
        public float f2297a;
        public float b;

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public final float value() {
            float f = this.b + this.f2297a;
            this.b = f;
            return f;
        }
    }

    public static class LayoutVariables {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f2298a = new HashMap();
        public final HashMap b = new HashMap();
        public final HashMap c = new HashMap();

        public final float a(CLElement cLElement) {
            if (!(cLElement instanceof CLString)) {
                return cLElement instanceof CLNumber ? ((CLNumber) cLElement).g() : BitmapDescriptorFactory.HUE_RED;
            }
            String strD = ((CLString) cLElement).d();
            HashMap map = this.b;
            if (map.containsKey(strD)) {
                return ((GeneratedValue) map.get(strD)).value();
            }
            HashMap map2 = this.f2298a;
            return map2.containsKey(strD) ? ((Integer) map2.get(strD)).floatValue() : BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MotionLayoutDebugFlags {
        public static final /* synthetic */ MotionLayoutDebugFlags[] d = {new MotionLayoutDebugFlags("NONE", 0), new MotionLayoutDebugFlags("SHOW_ALL", 1), new MotionLayoutDebugFlags("UNKNOWN", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        MotionLayoutDebugFlags EF5;

        public static MotionLayoutDebugFlags valueOf(String str) {
            return (MotionLayoutDebugFlags) Enum.valueOf(MotionLayoutDebugFlags.class, str);
        }

        public static MotionLayoutDebugFlags[] values() {
            return (MotionLayoutDebugFlags[]) d.clone();
        }
    }

    public static class OverrideValue implements GeneratedValue {
        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public final float value() {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(androidx.constraintlayout.core.parser.CLObject r21, androidx.constraintlayout.core.state.ConstraintReference r22, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r23, androidx.constraintlayout.core.state.State r24, java.lang.String r25) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.a(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.state.State, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(int r6, androidx.constraintlayout.core.state.State r7, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r8, androidx.constraintlayout.core.parser.CLArray r9) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            if (r6 != 0) goto Lb
            androidx.constraintlayout.core.state.State$Helper r6 = androidx.constraintlayout.core.state.State.Helper.d
            androidx.constraintlayout.core.state.HelperReference r6 = r7.f(r6)
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r6 = (androidx.constraintlayout.core.state.helpers.HorizontalChainReference) r6
            goto L13
        Lb:
            androidx.constraintlayout.core.state.State$Helper r6 = androidx.constraintlayout.core.state.State.Helper.e
            androidx.constraintlayout.core.state.HelperReference r6 = r7.f(r6)
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r6 = (androidx.constraintlayout.core.state.helpers.VerticalChainReference) r6
        L13:
            r0 = 1
            androidx.constraintlayout.core.parser.CLElement r1 = r9.o(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r2 == 0) goto Lbb
            androidx.constraintlayout.core.parser.CLArray r1 = (androidx.constraintlayout.core.parser.CLArray) r1
            java.util.ArrayList r2 = r1.h
            int r2 = r2.size()
            if (r2 >= r0) goto L28
            goto Lbb
        L28:
            r2 = 0
            r3 = r2
        L2a:
            java.util.ArrayList r4 = r1.h
            int r4 = r4.size()
            if (r3 >= r4) goto L40
            java.lang.String r4 = r1.B(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6.q(r4)
            int r3 = r3 + 1
            goto L2a
        L40:
            java.util.ArrayList r1 = r9.h
            int r1 = r1.size()
            r3 = 2
            if (r1 <= r3) goto Lbb
            androidx.constraintlayout.core.parser.CLElement r9 = r9.o(r3)
            boolean r1 = r9 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r1 != 0) goto L52
            goto Lbb
        L52:
            androidx.constraintlayout.core.parser.CLObject r9 = (androidx.constraintlayout.core.parser.CLObject) r9
            java.util.ArrayList r1 = r9.G()
            java.util.Iterator r1 = r1.iterator()
        L5c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lbb
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            java.lang.String r4 = "style"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L77
            d(r9, r6, r8, r7, r3)
            goto L5c
        L77:
            androidx.constraintlayout.core.parser.CLElement r3 = r9.q(r3)
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r4 == 0) goto L95
            r4 = r3
            androidx.constraintlayout.core.parser.CLArray r4 = (androidx.constraintlayout.core.parser.CLArray) r4
            java.util.ArrayList r5 = r4.h
            int r5 = r5.size()
            if (r5 <= r0) goto L95
            java.lang.String r3 = r4.B(r2)
            float r4 = r4.u(r0)
            r6.o0 = r4
            goto L99
        L95:
            java.lang.String r3 = r3.d()
        L99:
            r3.getClass()
            java.lang.String r4 = "packed"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto Lb6
            java.lang.String r4 = "spread_inside"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lb1
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.d
            r6.u0 = r3
            goto L5c
        Lb1:
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.e
            r6.u0 = r3
            goto L5c
        Lb6:
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.f
            r6.u0 = r3
            goto L5c
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.b(int, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLArray):void");
    }

    public static long c(String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        String strSubstring = str.substring(1);
        if (strSubstring.length() == 6) {
            strSubstring = "FF".concat(strSubstring);
        }
        return Long.parseLong(strSubstring, 16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x00ed. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0150  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(androidx.constraintlayout.core.parser.CLObject r24, androidx.constraintlayout.core.state.ConstraintReference r25, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r26, androidx.constraintlayout.core.state.State r27, java.lang.String r28) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.d(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.state.State, java.lang.String):void");
    }

    public static Dimension e(CLObject cLObject, String str, State state, e eVar) throws CLParsingException {
        CLElement cLElementQ = cLObject.q(str);
        Dimension dimensionB = Dimension.b(0);
        if (cLElementQ instanceof CLString) {
            return f(cLElementQ.d());
        }
        if (cLElementQ instanceof CLNumber) {
            return Dimension.b(state.d(Float.valueOf(eVar.g(cLObject.v(str)))));
        }
        if (cLElementQ instanceof CLObject) {
            CLObject cLObject2 = (CLObject) cLElementQ;
            String strD = cLObject2.D("value");
            if (strD != null) {
                dimensionB = f(strD);
            }
            CLElement cLElementA = cLObject2.A("min");
            if (cLElementA != null) {
                if (cLElementA instanceof CLNumber) {
                    int iD = state.d(Float.valueOf(eVar.g(((CLNumber) cLElementA).g())));
                    if (iD >= 0) {
                        dimensionB.f2299a = iD;
                    }
                } else if (cLElementA instanceof CLString) {
                    dimensionB.f2299a = -2;
                }
            }
            CLElement cLElementA2 = cLObject2.A("max");
            if (cLElementA2 != null) {
                if (cLElementA2 instanceof CLNumber) {
                    int iD2 = state.d(Float.valueOf(eVar.g(((CLNumber) cLElementA2).g())));
                    if (dimensionB.b >= 0) {
                        dimensionB.b = iD2;
                        return dimensionB;
                    }
                } else if ((cLElementA2 instanceof CLString) && dimensionB.g) {
                    dimensionB.f = Dimension.i;
                    dimensionB.b = Integer.MAX_VALUE;
                }
            }
        }
        return dimensionB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Dimension f(String str) {
        Dimension dimensionB = Dimension.b(0);
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    c = 0;
                    break;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    c = 1;
                    break;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    c = 2;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c = 3;
                    break;
                }
                break;
        }
        String str2 = Dimension.j;
        switch (c) {
            case 0:
                return Dimension.c(Dimension.i);
            case 1:
                return new Dimension(Dimension.k);
            case 2:
                return Dimension.c(str2);
            case 3:
                return Dimension.d();
            default:
                if (str.endsWith("%")) {
                    float f = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
                    Dimension dimension = new Dimension(Dimension.l);
                    dimension.c = f;
                    dimension.g = true;
                    dimension.b = 0;
                    return dimension;
                }
                if (!str.contains(":")) {
                    return dimensionB;
                }
                Dimension dimension2 = new Dimension(Dimension.m);
                dimension2.e = str;
                dimension2.f = str2;
                dimension2.g = true;
                return dimension2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(int r17, androidx.constraintlayout.core.state.State r18, java.lang.String r19, androidx.constraintlayout.core.parser.CLObject r20) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.g(int, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.parser.CLObject):void");
    }

    public static void h(State state, LayoutVariables layoutVariables, String str, CLObject cLObject) throws CLParsingException {
        ConstraintReference constraintReferenceC = state.c(str);
        if (constraintReferenceC.e0 == null) {
            constraintReferenceC.e0 = Dimension.d();
        }
        if (constraintReferenceC.f0 == null) {
            constraintReferenceC.f0 = Dimension.d();
        }
        Iterator it = cLObject.G().iterator();
        while (it.hasNext()) {
            a(cLObject, constraintReferenceC, layoutVariables, state, (String) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0bc8  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0c65  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x0ea8  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x0ed3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:831:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0183 A[PHI: r29
  0x0183: PHI (r29v15 java.util.Iterator) = 
  (r29v1 java.util.Iterator)
  (r29v2 java.util.Iterator)
  (r29v3 java.util.Iterator)
  (r29v4 java.util.Iterator)
  (r29v5 java.util.Iterator)
  (r29v6 java.util.Iterator)
  (r29v7 java.util.Iterator)
  (r29v8 java.util.Iterator)
  (r29v9 java.util.Iterator)
  (r29v10 java.util.Iterator)
  (r29v11 java.util.Iterator)
  (r29v12 java.util.Iterator)
  (r29v13 java.util.Iterator)
  (r29v16 java.util.Iterator)
 binds: [B:149:0x0238, B:145:0x022b, B:141:0x021e, B:137:0x0211, B:133:0x0204, B:129:0x01f7, B:125:0x01ea, B:121:0x01da, B:117:0x01cc, B:113:0x01bc, B:109:0x01ac, B:105:0x019e, B:101:0x018e, B:98:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(androidx.constraintlayout.core.parser.CLObject r35, androidx.constraintlayout.compose.State r36, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r37) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 4298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.i(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.compose.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables):void");
    }
}
