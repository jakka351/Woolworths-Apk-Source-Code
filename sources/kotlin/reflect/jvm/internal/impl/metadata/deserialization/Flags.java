package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* loaded from: classes.dex */
public class Flags {
    public static final BooleanFlagField A;
    public static final BooleanFlagField B;
    public static final BooleanFlagField C;
    public static final BooleanFlagField D;
    public static final BooleanFlagField E;
    public static final BooleanFlagField F;
    public static final BooleanFlagField G;
    public static final BooleanFlagField H;
    public static final BooleanFlagField I;
    public static final BooleanFlagField J;
    public static final BooleanFlagField K;
    public static final BooleanFlagField L;
    public static final BooleanFlagField M;
    public static final BooleanFlagField N;

    /* renamed from: a, reason: collision with root package name */
    public static final BooleanFlagField f24486a;
    public static final BooleanFlagField b;
    public static final BooleanFlagField c;
    public static final FlagField d;
    public static final FlagField e;
    public static final FlagField f;
    public static final BooleanFlagField g;
    public static final BooleanFlagField h;
    public static final BooleanFlagField i;
    public static final BooleanFlagField j;
    public static final BooleanFlagField k;
    public static final BooleanFlagField l;
    public static final BooleanFlagField m;
    public static final BooleanFlagField n;
    public static final BooleanFlagField o;
    public static final FlagField p;
    public static final BooleanFlagField q;
    public static final BooleanFlagField r;
    public static final BooleanFlagField s;
    public static final BooleanFlagField t;
    public static final BooleanFlagField u;
    public static final BooleanFlagField v;
    public static final BooleanFlagField w;
    public static final BooleanFlagField x;
    public static final BooleanFlagField y;
    public static final BooleanFlagField z;

    public static class BooleanFlagField extends FlagField<Boolean> {
        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public final /* bridge */ /* synthetic */ Object c(int i) {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public final /* bridge */ /* synthetic */ int d(Object obj) {
            throw null;
        }

        public final Boolean e(int i) {
            return Boolean.valueOf((i & (1 << this.f24487a)) != 0);
        }
    }

    public static class EnumLiteFlagField<E extends Internal.EnumLite> extends FlagField<E> {
        public final Internal.EnumLite[] c;

        /* JADX WARN: Illegal instructions before constructor call */
        public EnumLiteFlagField(int i, Internal.EnumLite[] enumLiteArr) {
            if (enumLiteArr == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            }
            int i2 = 1;
            int length = enumLiteArr.length - 1;
            if (length != 0) {
                for (int i3 = 31; i3 >= 0; i3--) {
                    if (((1 << i3) & length) != 0) {
                        i2 = 1 + i3;
                    }
                }
                throw new IllegalStateException("Empty enum: " + enumLiteArr.getClass());
            }
            super(i, i2);
            this.c = enumLiteArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public final Object c(int i) {
            int i2 = (1 << this.b) - 1;
            int i3 = this.f24487a;
            int i4 = (i & (i2 << i3)) >> i3;
            for (Internal.EnumLite enumLite : this.c) {
                if (enumLite.g() == i4) {
                    return enumLite;
                }
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public final int d(Object obj) {
            return ((Internal.EnumLite) obj).g() << this.f24487a;
        }
    }

    public static abstract class FlagField<E> {

        /* renamed from: a, reason: collision with root package name */
        public final int f24487a;
        public final int b;

        public FlagField(int i, int i2) {
            this.f24487a = i;
            this.b = i2;
        }

        public static BooleanFlagField a(FlagField flagField) {
            return new BooleanFlagField(flagField.f24487a + flagField.b, 1);
        }

        public static BooleanFlagField b() {
            return new BooleanFlagField(0, 1);
        }

        public abstract Object c(int i);

        public abstract int d(Object obj);
    }

    static {
        BooleanFlagField booleanFlagFieldB = FlagField.b();
        f24486a = booleanFlagFieldB;
        b = FlagField.a(booleanFlagFieldB);
        BooleanFlagField booleanFlagFieldB2 = FlagField.b();
        c = booleanFlagFieldB2;
        EnumLiteFlagField enumLiteFlagField = new EnumLiteFlagField(1, ProtoBuf.Visibility.values());
        d = enumLiteFlagField;
        ProtoBuf.Modality[] modalityArrValues = ProtoBuf.Modality.values();
        int i2 = 1 + enumLiteFlagField.b;
        EnumLiteFlagField enumLiteFlagField2 = new EnumLiteFlagField(i2, modalityArrValues);
        e = enumLiteFlagField2;
        ProtoBuf.Class.Kind[] kindArrValues = ProtoBuf.Class.Kind.values();
        int i3 = enumLiteFlagField2.b;
        EnumLiteFlagField enumLiteFlagField3 = new EnumLiteFlagField(i2 + i3, kindArrValues);
        f = enumLiteFlagField3;
        BooleanFlagField booleanFlagFieldA = FlagField.a(enumLiteFlagField3);
        g = booleanFlagFieldA;
        BooleanFlagField booleanFlagFieldA2 = FlagField.a(booleanFlagFieldA);
        h = booleanFlagFieldA2;
        BooleanFlagField booleanFlagFieldA3 = FlagField.a(booleanFlagFieldA2);
        i = booleanFlagFieldA3;
        BooleanFlagField booleanFlagFieldA4 = FlagField.a(booleanFlagFieldA3);
        j = booleanFlagFieldA4;
        BooleanFlagField booleanFlagFieldA5 = FlagField.a(booleanFlagFieldA4);
        k = booleanFlagFieldA5;
        BooleanFlagField booleanFlagFieldA6 = FlagField.a(booleanFlagFieldA5);
        l = booleanFlagFieldA6;
        m = FlagField.a(booleanFlagFieldA6);
        BooleanFlagField booleanFlagFieldA7 = FlagField.a(enumLiteFlagField);
        n = booleanFlagFieldA7;
        o = FlagField.a(booleanFlagFieldA7);
        EnumLiteFlagField enumLiteFlagField4 = new EnumLiteFlagField(i2 + i3, ProtoBuf.MemberKind.values());
        p = enumLiteFlagField4;
        BooleanFlagField booleanFlagFieldA8 = FlagField.a(enumLiteFlagField4);
        q = booleanFlagFieldA8;
        BooleanFlagField booleanFlagFieldA9 = FlagField.a(booleanFlagFieldA8);
        r = booleanFlagFieldA9;
        BooleanFlagField booleanFlagFieldA10 = FlagField.a(booleanFlagFieldA9);
        s = booleanFlagFieldA10;
        BooleanFlagField booleanFlagFieldA11 = FlagField.a(booleanFlagFieldA10);
        t = booleanFlagFieldA11;
        BooleanFlagField booleanFlagFieldA12 = FlagField.a(booleanFlagFieldA11);
        u = booleanFlagFieldA12;
        BooleanFlagField booleanFlagFieldA13 = FlagField.a(booleanFlagFieldA12);
        v = booleanFlagFieldA13;
        BooleanFlagField booleanFlagFieldA14 = FlagField.a(booleanFlagFieldA13);
        w = booleanFlagFieldA14;
        x = FlagField.a(booleanFlagFieldA14);
        BooleanFlagField booleanFlagFieldA15 = FlagField.a(enumLiteFlagField4);
        y = booleanFlagFieldA15;
        BooleanFlagField booleanFlagFieldA16 = FlagField.a(booleanFlagFieldA15);
        z = booleanFlagFieldA16;
        BooleanFlagField booleanFlagFieldA17 = FlagField.a(booleanFlagFieldA16);
        A = booleanFlagFieldA17;
        BooleanFlagField booleanFlagFieldA18 = FlagField.a(booleanFlagFieldA17);
        B = booleanFlagFieldA18;
        BooleanFlagField booleanFlagFieldA19 = FlagField.a(booleanFlagFieldA18);
        C = booleanFlagFieldA19;
        BooleanFlagField booleanFlagFieldA20 = FlagField.a(booleanFlagFieldA19);
        D = booleanFlagFieldA20;
        BooleanFlagField booleanFlagFieldA21 = FlagField.a(booleanFlagFieldA20);
        E = booleanFlagFieldA21;
        BooleanFlagField booleanFlagFieldA22 = FlagField.a(booleanFlagFieldA21);
        F = booleanFlagFieldA22;
        G = FlagField.a(booleanFlagFieldA22);
        BooleanFlagField booleanFlagFieldA23 = FlagField.a(booleanFlagFieldB2);
        H = booleanFlagFieldA23;
        BooleanFlagField booleanFlagFieldA24 = FlagField.a(booleanFlagFieldA23);
        I = booleanFlagFieldA24;
        J = FlagField.a(booleanFlagFieldA24);
        BooleanFlagField booleanFlagFieldA25 = FlagField.a(enumLiteFlagField2);
        K = booleanFlagFieldA25;
        BooleanFlagField booleanFlagFieldA26 = FlagField.a(booleanFlagFieldA25);
        L = booleanFlagFieldA26;
        M = FlagField.a(booleanFlagFieldA26);
        N = FlagField.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L2b
            if (r5 == r2) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r1] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r1] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r1] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r1] = r4
        L2f:
            java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r3] = r1
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r2] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r2] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r2] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r2] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r2] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.a(int):void");
    }
}
