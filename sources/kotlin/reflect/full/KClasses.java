package kotlin.reflect.full;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class KClasses {
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final KFunction a(KClass kClass) {
        Object next;
        ReflectProperties.LazySoftVal lazySoftVal = ((KClassImpl.Data) ((KClassImpl) kClass).f.getD()).f;
        KProperty kProperty = KClassImpl.Data.p[4];
        Object objInvoke = lazySoftVal.invoke();
        Intrinsics.g(objInvoke, "getValue(...)");
        Iterator it = ((Collection) objInvoke).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KFunction kFunction = (KFunction) next;
            Intrinsics.f(kFunction, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            if (((ConstructorDescriptor) ((KFunctionImpl) kFunction).t()).k0()) {
                break;
            }
        }
        return (KFunction) next;
    }
}
