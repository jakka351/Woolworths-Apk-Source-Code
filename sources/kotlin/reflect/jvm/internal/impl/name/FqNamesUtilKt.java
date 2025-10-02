package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class FqNamesUtilKt {

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State state = State.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                State state2 = State.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            kotlin.reflect.jvm.internal.impl.name.State r1 = kotlin.reflect.jvm.internal.impl.name.State.d
            r2 = r0
        L7:
            int r3 = r6.length()
            r4 = 1
            if (r2 >= r3) goto L3e
            char r3 = r6.charAt(r2)
            int r5 = r1.ordinal()
            if (r5 == 0) goto L32
            if (r5 == r4) goto L24
            r1 = 2
            if (r5 != r1) goto L1e
            goto L32
        L1e:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L24:
            r4 = 46
            if (r3 != r4) goto L2b
            kotlin.reflect.jvm.internal.impl.name.State r1 = kotlin.reflect.jvm.internal.impl.name.State.f
            goto L3b
        L2b:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
            if (r3 != 0) goto L3b
            return r0
        L32:
            boolean r1 = java.lang.Character.isJavaIdentifierStart(r3)
            if (r1 != 0) goto L39
            return r0
        L39:
            kotlin.reflect.jvm.internal.impl.name.State r1 = kotlin.reflect.jvm.internal.impl.name.State.e
        L3b:
            int r2 = r2 + 1
            goto L7
        L3e:
            kotlin.reflect.jvm.internal.impl.name.State r6 = kotlin.reflect.jvm.internal.impl.name.State.f
            if (r1 == r6) goto L43
            return r4
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.a(java.lang.String):boolean");
    }

    public static final FqName b(FqName fqName, FqName prefix) {
        Intrinsics.h(fqName, "<this>");
        FqNameUnsafe fqNameUnsafe = fqName.f24500a;
        Intrinsics.h(prefix, "prefix");
        FqNameUnsafe fqNameUnsafe2 = prefix.f24500a;
        if (!fqName.equals(prefix) && !fqNameUnsafe2.c()) {
            String str = fqNameUnsafe.f24501a;
            String str2 = fqNameUnsafe2.f24501a;
            if (!StringsKt.W(str, str2, false) || str.charAt(str2.length()) != '.') {
                return fqName;
            }
        }
        if (fqNameUnsafe2.c()) {
            return fqName;
        }
        if (fqName.equals(prefix)) {
            return FqName.c;
        }
        String strSubstring = fqNameUnsafe.f24501a.substring(fqNameUnsafe2.f24501a.length() + 1);
        Intrinsics.g(strSubstring, "substring(...)");
        return new FqName(strSubstring);
    }
}
