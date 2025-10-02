package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u000b\fB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "oldCaller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "BoxUnboxData", "MultiFieldValueClassPrimaryConstructorCaller", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ValueClassAwareCaller<M extends Member> implements Caller<M> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24302a;
    public final Caller b;
    public final Member c;
    public final BoxUnboxData d;
    public final IntRange[] e;
    public final boolean f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$BoxUnboxData;", "", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoxUnboxData {

        /* renamed from: a, reason: collision with root package name */
        public final IntRange f24303a;
        public final List[] b;
        public final Method c;

        public BoxUnboxData(IntRange argumentRange, List[] listArr, Method method) {
            Intrinsics.h(argumentRange, "argumentRange");
            this.f24303a = argumentRange;
            this.b = listArr;
            this.c = method;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "constructorDesc", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "originalParameters", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/util/List;)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class MultiFieldValueClassPrimaryConstructorCaller implements Caller {

        /* renamed from: a, reason: collision with root package name */
        public final Method f24304a;
        public final Method b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
        public MultiFieldValueClassPrimaryConstructorCaller(FunctionDescriptor functionDescriptor, KDeclarationContainerImpl container, String constructorDesc, List list) throws NoSuchMethodException, SecurityException {
            ?? Q;
            Intrinsics.h(container, "container");
            Intrinsics.h(constructorDesc, "constructorDesc");
            Method methodQ = container.q("constructor-impl", constructorDesc);
            Intrinsics.e(methodQ);
            this.f24304a = methodQ;
            Method methodQ2 = container.q("box-impl", StringsKt.N(constructorDesc, "V") + ReflectClassUtilKt.b(container.getE()));
            Intrinsics.e(methodQ2);
            this.b = methodQ2;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                List listQ = null;
                if (!it.hasNext()) {
                    break;
                }
                KotlinType type = ((ParameterDescriptor) it.next()).getType();
                Intrinsics.g(type, "getType(...)");
                SimpleType simpleTypeA = TypeSubstitutionKt.a(type);
                ArrayList arrayListE = ValueClassAwareCallerKt.e(simpleTypeA);
                if (arrayListE == null) {
                    Class clsH = ValueClassAwareCallerKt.h(simpleTypeA);
                    if (clsH != null) {
                        listQ = CollectionsKt.Q(ValueClassAwareCallerKt.d(clsH, functionDescriptor));
                    }
                } else {
                    listQ = arrayListE;
                }
                arrayList.add(listQ);
            }
            this.c = arrayList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                ClassifierDescriptor classifierDescriptorC = ((ParameterDescriptor) obj).getType().J0().c();
                Intrinsics.f(classifierDescriptorC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorC;
                List list3 = (List) this.c.get(i);
                if (list3 != null) {
                    List list4 = list3;
                    Q = new ArrayList(CollectionsKt.s(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        Q.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class clsK = UtilKt.k(classDescriptor);
                    Intrinsics.e(clsK);
                    Q = CollectionsKt.Q(clsK);
                }
                arrayList2.add(Q);
                i = i2;
            }
            this.d = arrayList2;
            this.e = CollectionsKt.G(arrayList2);
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Member getC() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final boolean b() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        /* renamed from: c */
        public final List getD() {
            return this.e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ?? Q;
            Intrinsics.h(args, "args");
            ArrayList other = this.c;
            Intrinsics.h(other, "other");
            int length = args.length;
            ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.s(other, 10), length));
            Iterator it = other.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i >= length) {
                    break;
                }
                arrayList.add(new Pair(args[i], next));
                i++;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                Object obj = pair.d;
                List list = (List) pair.e;
                if (list != null) {
                    List list2 = list;
                    Q = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        Q.add(((Method) it3.next()).invoke(obj, null));
                    }
                } else {
                    Q = CollectionsKt.Q(obj);
                }
                CollectionsKt.h((Iterable) Q, arrayList2);
            }
            Object[] array = arrayList2.toArray(new Object[0]);
            this.f24304a.invoke(null, Arrays.copyOf(array, array.length));
            return this.b.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        /* renamed from: getReturnType */
        public final Type getB() {
            Class<?> returnType = this.b.getReturnType();
            Intrinsics.g(returnType, "getReturnType(...)");
            return returnType;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[LOOP:1: B:25:0x0075->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ValueClassAwareCaller(kotlin.reflect.jvm.internal.calls.Caller r11, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r12, boolean r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller.<init>(kotlin.reflect.jvm.internal.calls.Caller, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, boolean):void");
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: a, reason: from getter */
    public final Member getC() {
        return this.c;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final boolean b() {
        return this.b instanceof CallerImpl.Method.BoundInstance;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: c */
    public final List getD() {
        return this.b.getD();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        Object objE;
        Object objE2;
        Intrinsics.h(args, "args");
        BoxUnboxData boxUnboxData = this.d;
        IntRange intRange = boxUnboxData.f24303a;
        List[] listArr = boxUnboxData.b;
        Method method = boxUnboxData.c;
        boolean zIsEmpty = intRange.isEmpty();
        int i = intRange.e;
        int i2 = intRange.d;
        if (!zIsEmpty) {
            if (this.f) {
                ListBuilder listBuilder = new ListBuilder(args.length);
                for (int i3 = 0; i3 < i2; i3++) {
                    listBuilder.add(args[i3]);
                }
                if (i2 <= i) {
                    while (true) {
                        List<Method> list = listArr[i2];
                        Object obj = args[i2];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objE2 = method2.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    Intrinsics.g(returnType, "getReturnType(...)");
                                    objE2 = UtilKt.e(returnType);
                                }
                                listBuilder.add(objE2);
                            }
                        } else {
                            listBuilder.add(obj);
                        }
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                int i4 = i + 1;
                int length = args.length - 1;
                if (i4 <= length) {
                    while (true) {
                        listBuilder.add(args[i4]);
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
                args = CollectionsKt.q(listBuilder).toArray(new Object[0]);
            } else {
                int length2 = args.length;
                Object[] objArr = new Object[length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    if (i5 > i || i2 > i5) {
                        objE = args[i5];
                    } else {
                        List list2 = listArr[i5];
                        Method method3 = list2 != null ? (Method) CollectionsKt.n0(list2) : null;
                        objE = args[i5];
                        if (method3 != null) {
                            if (objE != null) {
                                objE = method3.invoke(objE, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                Intrinsics.g(returnType2, "getReturnType(...)");
                                objE = UtilKt.e(returnType2);
                            }
                        }
                    }
                    objArr[i5] = objE;
                }
                args = objArr;
            }
        }
        Object objCall = this.b.call(args);
        return (objCall == CoroutineSingletons.d || method == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    public final IntRange d(int i) {
        IntRange[] intRangeArr = this.e;
        if (i >= 0 && i < intRangeArr.length) {
            return intRangeArr[i];
        }
        if (intRangeArr.length == 0) {
            return new IntRange(i, i, 1);
        }
        int length = ((IntRange) ArraysKt.V(intRangeArr)).e + 1 + (i - intRangeArr.length);
        return new IntRange(length, length, 1);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: getReturnType */
    public final Type getB() {
        return this.b.getB();
    }
}
