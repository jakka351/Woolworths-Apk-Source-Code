package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
final class ClassesInfoCache {
    public static final ClassesInfoCache c = new ClassesInfoCache();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2781a = new HashMap();
    public final HashMap b = new HashMap();

    @Deprecated
    public static class CallbackInfo {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f2782a = new HashMap();
        public final HashMap b;

        public CallbackInfo(HashMap map) {
            this.b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List arrayList = (List) this.f2782a.get(event);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f2782a.put(event, arrayList);
                }
                arrayList.add((MethodReference) entry.getKey());
            }
        }

        public static void a(List list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    MethodReference methodReference = (MethodReference) list.get(size);
                    Method method = methodReference.b;
                    try {
                        int i = methodReference.f2783a;
                        if (i == 0) {
                            method.invoke(obj, null);
                        } else if (i == 1) {
                            method.invoke(obj, lifecycleOwner);
                        } else if (i == 2) {
                            method.invoke(obj, lifecycleOwner, event);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class MethodReference {

        /* renamed from: a, reason: collision with root package name */
        public final int f2783a;
        public final Method b;

        public MethodReference(int i, Method method) throws SecurityException {
            this.f2783a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodReference)) {
                return false;
            }
            MethodReference methodReference = (MethodReference) obj;
            return this.f2783a == methodReference.f2783a && this.b.getName().equals(methodReference.b.getName());
        }

        public final int hashCode() {
            return this.b.getName().hashCode() + (this.f2783a * 31);
        }
    }

    public static void b(HashMap map, MethodReference methodReference, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(methodReference);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(methodReference, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + methodReference.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }

    public final CallbackInfo a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f2781a;
        if (superclass != null) {
            CallbackInfo callbackInfoA = (CallbackInfo) map2.get(superclass);
            if (callbackInfoA == null) {
                callbackInfoA = a(superclass, null);
            }
            map.putAll(callbackInfoA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            CallbackInfo callbackInfoA2 = (CallbackInfo) map2.get(cls2);
            if (callbackInfoA2 == null) {
                callbackInfoA2 = a(cls2, null);
            }
            for (Map.Entry entry : callbackInfoA2.b.entrySet()) {
                b(map, (MethodReference) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                Lifecycle.Event eventValue = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new MethodReference(i, method), eventValue, cls);
                z = true;
            }
        }
        CallbackInfo callbackInfo = new CallbackInfo(map);
        map2.put(cls, callbackInfo);
        this.b.put(cls, Boolean.valueOf(z));
        return callbackInfo;
    }
}
