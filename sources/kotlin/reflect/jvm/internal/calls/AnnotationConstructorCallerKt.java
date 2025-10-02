package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "hashCode", "", "toString", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AnnotationConstructorCallerKt {
    public static final Object a(final Class annotationClass, final Map map, final List methods) throws IllegalArgumentException {
        Intrinsics.h(annotationClass, "annotationClass");
        Intrinsics.h(methods, "methods");
        final Lazy lazyB = LazyKt.b(new Function0(map) { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$0
            public final Map d;

            {
                this.d = map;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iHashCode = 0;
                for (Map.Entry entry : this.d.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode);
            }
        });
        final Lazy lazyB2 = LazyKt.b(new Function0(annotationClass, map) { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$1
            public final Class d;
            public final Map e;

            {
                this.d = annotationClass;
                this.e = map;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(this.d.getCanonicalName());
                CollectionsKt.L(this.e.entrySet(), sb, ", ", "(", ")", AnnotationConstructorCallerKt$$Lambda$3.d, 48);
                return sb.toString();
            }
        });
        Object objNewProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new InvocationHandler(annotationClass, map, lazyB2, lazyB, methods) { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$2

            /* renamed from: a, reason: collision with root package name */
            public final Class f24298a;
            public final Map b;
            public final Lazy c;
            public final Lazy d;
            public final List e;

            {
                this.f24298a = annotationClass;
                this.b = map;
                this.c = lazyB2;
                this.d = lazyB;
                this.e = methods;
            }

            /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
            @Override // java.lang.reflect.InvocationHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
                /*
                    Method dump skipped, instructions count: 411
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$2.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
            }
        });
        Intrinsics.f(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static /* synthetic */ Object b(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return a(cls, map, arrayList);
    }
}
