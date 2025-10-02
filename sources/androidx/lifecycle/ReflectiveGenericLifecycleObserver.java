package androidx.lifecycle;

import androidx.lifecycle.ClassesInfoCache;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {
    public final Object d;
    public final ClassesInfoCache.CallbackInfo e;

    public ReflectiveGenericLifecycleObserver(LifecycleObserver lifecycleObserver) {
        this.d = lifecycleObserver;
        ClassesInfoCache classesInfoCache = ClassesInfoCache.c;
        Class<?> cls = lifecycleObserver.getClass();
        ClassesInfoCache.CallbackInfo callbackInfo = (ClassesInfoCache.CallbackInfo) classesInfoCache.f2781a.get(cls);
        this.e = callbackInfo == null ? classesInfoCache.a(cls, null) : callbackInfo;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HashMap map = this.e.f2782a;
        List list = (List) map.get(event);
        Object obj = this.d;
        ClassesInfoCache.CallbackInfo.a(list, lifecycleOwner, event, obj);
        ClassesInfoCache.CallbackInfo.a((List) map.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
    }
}
