package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public abstract class zzfx implements InvocationHandler {

    @Nullable
    private final Object zza;

    public zzfx(@Nullable Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    @NotNull
    public final Object invoke(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        Object obj2;
        if (Intrinsics.c(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (Intrinsics.c(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (Intrinsics.c(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z = false;
            if (objArr != null && objArr.length != 0) {
                Object obj3 = objArr[0];
                if ((obj3 != null ? obj3.hashCode() : 0) == obj.hashCode()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        boolean zZza = zza(obj, method, objArr);
        Unit unit = Unit.f24250a;
        if (!zZza) {
            return unit;
        }
        if ((this.zza == null && Intrinsics.c(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && Intrinsics.c(zzkm.zza(obj2.getClass()), zzkm.zza(method.getReturnType())))) {
            Object obj4 = this.zza;
            return obj4 == null ? unit : obj4;
        }
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr);
}
