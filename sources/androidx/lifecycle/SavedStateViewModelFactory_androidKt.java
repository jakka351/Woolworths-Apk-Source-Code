package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class SavedStateViewModelFactory_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final List f2799a = CollectionsKt.R(Application.class, SavedStateHandle.class);
    public static final List b = CollectionsKt.Q(SavedStateHandle.class);

    public static final Constructor c(Class cls, List signature) {
        Intrinsics.h(signature, "signature");
        Iterator itA = ArrayIteratorKt.a(cls.getConstructors());
        while (itA.hasNext()) {
            Constructor constructor = (Constructor) itA.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.g(parameterTypes, "getParameterTypes(...)");
            List listL0 = ArraysKt.l0(parameterTypes);
            if (signature.equals(listL0)) {
                return constructor;
            }
            if (signature.size() == listL0.size() && listL0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final ViewModel d(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (ViewModel) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(androidx.constraintlayout.core.state.a.e(cls, "A ", " cannot be instantiated."), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
