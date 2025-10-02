package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.inject.Provider;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15238a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.f15238a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() throws ClassNotFoundException {
        switch (this.f15238a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new InvalidRegistrarException(YU.a.h("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new InvalidRegistrarException(YU.a.h("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new InvalidRegistrarException(YU.a.A("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new InvalidRegistrarException(YU.a.A("Could not instantiate ", str), e4);
                }
            default:
                return (ComponentRegistrar) this.b;
        }
    }
}
