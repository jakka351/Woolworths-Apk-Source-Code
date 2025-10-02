package androidx.navigation;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import androidx.navigation.NavArgs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/NavArgsLazy;", "Landroidx/navigation/NavArgs;", "Args", "Lkotlin/Lazy;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavArgsLazy<Args extends NavArgs> implements Lazy<Args> {
    public final KClass d;
    public final Function0 e;
    public NavArgs f;

    public NavArgsLazy(KClass navArgsClass, Function0 function0) {
        Intrinsics.h(navArgsClass, "navArgsClass");
        this.d = navArgsClass;
        this.e = function0;
    }

    @Override // kotlin.Lazy
    /* renamed from: getValue */
    public final Object getD() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        NavArgs navArgs = this.f;
        if (navArgs != null) {
            return navArgs;
        }
        Bundle bundle = (Bundle) this.e.invoke();
        ArrayMap arrayMap = NavArgsLazy_androidKt.b;
        KClass kClass = this.d;
        Method method = (Method) arrayMap.get(kClass);
        if (method == null) {
            method = JvmClassMappingKt.b(kClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(NavArgsLazy_androidKt.f3471a, 1));
            arrayMap.put(kClass, method);
            Intrinsics.g(method, "also(...)");
        }
        Object objInvoke = method.invoke(null, bundle);
        Intrinsics.f(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        NavArgs navArgs2 = (NavArgs) objInvoke;
        this.f = navArgs2;
        return navArgs2;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f != null;
    }
}
