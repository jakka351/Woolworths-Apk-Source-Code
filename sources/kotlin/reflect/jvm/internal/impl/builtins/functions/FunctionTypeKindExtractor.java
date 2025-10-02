package kotlin.reflect.jvm.internal.impl.builtins.functions;

import YU.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FunctionTypeKindExtractor {
    public static final FunctionTypeKindExtractor c = new FunctionTypeKindExtractor(CollectionsKt.R(FunctionTypeKind.Function.c, FunctionTypeKind.SuspendFunction.c, FunctionTypeKind.KFunction.c, FunctionTypeKind.KSuspendFunction.c));

    /* renamed from: a, reason: collision with root package name */
    public final List f24319a;
    public final LinkedHashMap b;

    public static final class Companion {
        public static FunctionTypeKindExtractor a() {
            return FunctionTypeKindExtractor.c;
        }
    }

    public static final class KindWithArity {

        /* renamed from: a, reason: collision with root package name */
        public final FunctionTypeKind f24320a;
        public final int b;

        public KindWithArity(FunctionTypeKind functionTypeKind, int i) {
            this.f24320a = functionTypeKind;
            this.b = i;
        }

        public final FunctionTypeKind a() {
            return this.f24320a;
        }

        public final int b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KindWithArity)) {
                return false;
            }
            KindWithArity kindWithArity = (KindWithArity) obj;
            return Intrinsics.c(this.f24320a, kindWithArity.f24320a) && this.b == kindWithArity.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.f24320a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("KindWithArity(kind=");
            sb.append(this.f24320a);
            sb.append(", arity=");
            return a.l(sb, this.b, ')');
        }
    }

    public FunctionTypeKindExtractor(List list) {
        this.f24319a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            FqName fqName = ((FunctionTypeKind) obj).f24318a;
            Object arrayList = linkedHashMap.get(fqName);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fqName, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.b = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.KindWithArity a(java.lang.String r9, kotlin.reflect.jvm.internal.impl.name.FqName r10) {
        /*
            r8 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.Intrinsics.h(r10, r0)
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.h(r9, r0)
            java.util.LinkedHashMap r0 = r8.b
            java.lang.Object r10 = r0.get(r10)
            java.util.List r10 = (java.util.List) r10
            r0 = 0
            if (r10 != 0) goto L16
            goto L6f
        L16:
            java.util.Iterator r10 = r10.iterator()
        L1a:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r10.next()
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind r1 = (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind) r1
            java.lang.String r2 = r1.b
            r3 = 0
            boolean r2 = kotlin.text.StringsKt.W(r9, r2, r3)
            if (r2 == 0) goto L1a
            java.lang.String r2 = r1.b
            int r2 = r2.length()
            java.lang.String r2 = r9.substring(r2)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.g(r2, r4)
            int r4 = r2.length()
            if (r4 != 0) goto L46
        L44:
            r2 = r0
            goto L63
        L46:
            int r4 = r2.length()
            r5 = r3
        L4b:
            if (r3 >= r4) goto L5f
            char r6 = r2.charAt(r3)
            int r6 = r6 + (-48)
            if (r6 < 0) goto L44
            r7 = 10
            if (r6 >= r7) goto L44
            int r5 = r5 * 10
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L4b
        L5f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L63:
            if (r2 == 0) goto L1a
            int r9 = r2.intValue()
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor$KindWithArity r10 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor$KindWithArity
            r10.<init>(r1, r9)
            return r10
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.a(java.lang.String, kotlin.reflect.jvm.internal.impl.name.FqName):kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor$KindWithArity");
    }
}
