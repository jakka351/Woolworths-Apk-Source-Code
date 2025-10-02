package com.google.common.eventbus;

import com.google.common.base.Strings;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Primitives;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class SubscriberRegistry {

    /* renamed from: a, reason: collision with root package name */
    public static final LoadingCache f14913a;
    public static final LoadingCache b;

    /* renamed from: com.google.common.eventbus.SubscriberRegistry$1, reason: invalid class name */
    public class AnonymousClass1 extends CacheLoader<Class<?>, ImmutableList<Method>> {
        @Override // com.google.common.cache.CacheLoader
        public final Object a(Object obj) throws SecurityException {
            LoadingCache loadingCache = SubscriberRegistry.f14913a;
            Set setF2 = new TypeToken.TypeSet().f2();
            HashMap map = new HashMap();
            Iterator it = setF2.iterator();
            while (it.hasNext()) {
                for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                    if (method.isAnnotationPresent(Subscribe.class) && !method.isSynthetic()) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        boolean z = parameterTypes.length == 1;
                        int length = parameterTypes.length;
                        if (!z) {
                            throw new IllegalArgumentException(Strings.b("Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", method, Integer.valueOf(length)));
                        }
                        boolean zIsPrimitive = parameterTypes[0].isPrimitive();
                        String name = parameterTypes[0].getName();
                        Class<?> cls = parameterTypes[0];
                        Map map2 = Primitives.f14942a;
                        cls.getClass();
                        Class<?> cls2 = (Class) Primitives.f14942a.get(cls);
                        if (cls2 != null) {
                            cls = cls2;
                        }
                        String simpleName = cls.getSimpleName();
                        if (zIsPrimitive) {
                            throw new IllegalArgumentException(Strings.b("@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, name, simpleName));
                        }
                        MethodIdentifier methodIdentifier = new MethodIdentifier(method);
                        if (!map.containsKey(methodIdentifier)) {
                            map.put(methodIdentifier, method);
                        }
                    }
                }
            }
            return ImmutableList.o(map.values());
        }
    }

    /* renamed from: com.google.common.eventbus.SubscriberRegistry$2, reason: invalid class name */
    public class AnonymousClass2 extends CacheLoader<Class<?>, ImmutableSet<Class<?>>> {
        @Override // com.google.common.cache.CacheLoader
        public final Object a(Object obj) {
            return ImmutableSet.q(new TypeToken.TypeSet().f2());
        }
    }

    public static final class MethodIdentifier {

        /* renamed from: a, reason: collision with root package name */
        public final String f14914a;
        public final List b;

        public MethodIdentifier(Method method) {
            this.f14914a = method.getName();
            this.b = Arrays.asList(method.getParameterTypes());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof MethodIdentifier) {
                MethodIdentifier methodIdentifier = (MethodIdentifier) obj;
                if (this.f14914a.equals(methodIdentifier.f14914a) && this.b.equals(methodIdentifier.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f14914a, this.b});
        }
    }

    static {
        CacheBuilder cacheBuilderC = CacheBuilder.c();
        cacheBuilderC.d();
        f14913a = cacheBuilderC.a(new AnonymousClass1());
        CacheBuilder cacheBuilderC2 = CacheBuilder.c();
        cacheBuilderC2.d();
        b = cacheBuilderC2.a(new AnonymousClass2());
    }
}
