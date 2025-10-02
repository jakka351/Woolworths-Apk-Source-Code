package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002*(\b\u0002\u0010\u0002\"\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000¨\u0006\u0003"}, d2 = {"Lkotlin/Function1;", "", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ExceptionsConstructorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final int f24721a;

    static {
        WeakMapCtorCache weakMapCtorCache = WeakMapCtorCache.f24735a;
        f24721a = b(Throwable.class, -1);
        try {
            int i = FastServiceLoaderKt.f24722a;
        } catch (Throwable unused) {
            WeakMapCtorCache weakMapCtorCache2 = WeakMapCtorCache.f24735a;
        }
    }

    public static final Function1 a(Class cls) throws SecurityException {
        Object next;
        Function1 function1;
        Pair pair;
        Pair pair2;
        if (f24721a == b(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i = 0;
            while (true) {
                next = null;
                if (i >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 != 0) {
                    if (length2 == 1) {
                        Class<?> cls2 = parameterTypes[0];
                        if (Intrinsics.c(cls2, String.class)) {
                            final int i2 = 1;
                            pair = new Pair(new au.com.woolworths.shop.rewards.promo.composable.a(2, new Function1() { // from class: kotlinx.coroutines.internal.a
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                    int i3 = i2;
                                    Constructor constructor2 = constructor;
                                    Throwable th = (Throwable) obj;
                                    switch (i3) {
                                        case 0:
                                            int i4 = ExceptionsConstructorKt.f24721a;
                                            Object objNewInstance = constructor2.newInstance(th.getMessage(), th);
                                            Intrinsics.f(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                            return (Throwable) objNewInstance;
                                        case 1:
                                            int i5 = ExceptionsConstructorKt.f24721a;
                                            Object objNewInstance2 = constructor2.newInstance(th.getMessage());
                                            Intrinsics.f(objNewInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                                            Throwable th2 = (Throwable) objNewInstance2;
                                            th2.initCause(th);
                                            return th2;
                                        case 2:
                                            int i6 = ExceptionsConstructorKt.f24721a;
                                            Object objNewInstance3 = constructor2.newInstance(th);
                                            Intrinsics.f(objNewInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                                            return (Throwable) objNewInstance3;
                                        default:
                                            int i7 = ExceptionsConstructorKt.f24721a;
                                            Object objNewInstance4 = constructor2.newInstance(null);
                                            Intrinsics.f(objNewInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                                            Throwable th3 = (Throwable) objNewInstance4;
                                            th3.initCause(th);
                                            return th3;
                                    }
                                }
                            }), 2);
                        } else if (Intrinsics.c(cls2, Throwable.class)) {
                            final int i3 = 2;
                            pair = new Pair(new au.com.woolworths.shop.rewards.promo.composable.a(2, new Function1() { // from class: kotlinx.coroutines.internal.a
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                    int i32 = i3;
                                    Constructor constructor2 = constructor;
                                    Throwable th = (Throwable) obj;
                                    switch (i32) {
                                        case 0:
                                            int i4 = ExceptionsConstructorKt.f24721a;
                                            Object objNewInstance = constructor2.newInstance(th.getMessage(), th);
                                            Intrinsics.f(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                            return (Throwable) objNewInstance;
                                        case 1:
                                            int i5 = ExceptionsConstructorKt.f24721a;
                                            Object objNewInstance2 = constructor2.newInstance(th.getMessage());
                                            Intrinsics.f(objNewInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                                            Throwable th2 = (Throwable) objNewInstance2;
                                            th2.initCause(th);
                                            return th2;
                                        case 2:
                                            int i6 = ExceptionsConstructorKt.f24721a;
                                            Object objNewInstance3 = constructor2.newInstance(th);
                                            Intrinsics.f(objNewInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                                            return (Throwable) objNewInstance3;
                                        default:
                                            int i7 = ExceptionsConstructorKt.f24721a;
                                            Object objNewInstance4 = constructor2.newInstance(null);
                                            Intrinsics.f(objNewInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                                            Throwable th3 = (Throwable) objNewInstance4;
                                            th3.initCause(th);
                                            return th3;
                                    }
                                }
                            }), 1);
                        } else {
                            pair2 = new Pair(null, -1);
                        }
                    } else if (length2 != 2) {
                        pair2 = new Pair(null, -1);
                    } else if (Intrinsics.c(parameterTypes[0], String.class) && Intrinsics.c(parameterTypes[1], Throwable.class)) {
                        final int i4 = 0;
                        pair = new Pair(new au.com.woolworths.shop.rewards.promo.composable.a(2, new Function1() { // from class: kotlinx.coroutines.internal.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                int i32 = i4;
                                Constructor constructor2 = constructor;
                                Throwable th = (Throwable) obj;
                                switch (i32) {
                                    case 0:
                                        int i42 = ExceptionsConstructorKt.f24721a;
                                        Object objNewInstance = constructor2.newInstance(th.getMessage(), th);
                                        Intrinsics.f(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                        return (Throwable) objNewInstance;
                                    case 1:
                                        int i5 = ExceptionsConstructorKt.f24721a;
                                        Object objNewInstance2 = constructor2.newInstance(th.getMessage());
                                        Intrinsics.f(objNewInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                                        Throwable th2 = (Throwable) objNewInstance2;
                                        th2.initCause(th);
                                        return th2;
                                    case 2:
                                        int i6 = ExceptionsConstructorKt.f24721a;
                                        Object objNewInstance3 = constructor2.newInstance(th);
                                        Intrinsics.f(objNewInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                                        return (Throwable) objNewInstance3;
                                    default:
                                        int i7 = ExceptionsConstructorKt.f24721a;
                                        Object objNewInstance4 = constructor2.newInstance(null);
                                        Intrinsics.f(objNewInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                                        Throwable th3 = (Throwable) objNewInstance4;
                                        th3.initCause(th);
                                        return th3;
                                }
                            }
                        }), 3);
                    } else {
                        pair2 = new Pair(null, -1);
                    }
                    arrayList.add(pair2);
                    i++;
                } else {
                    final int i5 = 3;
                    pair = new Pair(new au.com.woolworths.shop.rewards.promo.composable.a(2, new Function1() { // from class: kotlinx.coroutines.internal.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                            int i32 = i5;
                            Constructor constructor2 = constructor;
                            Throwable th = (Throwable) obj;
                            switch (i32) {
                                case 0:
                                    int i42 = ExceptionsConstructorKt.f24721a;
                                    Object objNewInstance = constructor2.newInstance(th.getMessage(), th);
                                    Intrinsics.f(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                    return (Throwable) objNewInstance;
                                case 1:
                                    int i52 = ExceptionsConstructorKt.f24721a;
                                    Object objNewInstance2 = constructor2.newInstance(th.getMessage());
                                    Intrinsics.f(objNewInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                                    Throwable th2 = (Throwable) objNewInstance2;
                                    th2.initCause(th);
                                    return th2;
                                case 2:
                                    int i6 = ExceptionsConstructorKt.f24721a;
                                    Object objNewInstance3 = constructor2.newInstance(th);
                                    Intrinsics.f(objNewInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                                    return (Throwable) objNewInstance3;
                                default:
                                    int i7 = ExceptionsConstructorKt.f24721a;
                                    Object objNewInstance4 = constructor2.newInstance(null);
                                    Intrinsics.f(objNewInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                                    Throwable th3 = (Throwable) objNewInstance4;
                                    th3.initCause(th);
                                    return th3;
                            }
                        }
                    }), 0);
                }
                pair2 = pair;
                arrayList.add(pair2);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Pair) next).e).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Pair) next2).e).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair3 = (Pair) next;
            if (pair3 != null && (function1 = (Function1) pair3.d) != null) {
                return function1;
            }
        }
        return ExceptionsConstructorKt$createConstructor$nullResult$1.d;
    }

    public static final int b(Class cls, int i) {
        Object objA;
        JvmClassMappingKt.e(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
        } while (cls != null);
        objA = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (objA instanceof Result.Failure) {
            objA = objValueOf;
        }
        return ((Number) objA).intValue();
    }
}
