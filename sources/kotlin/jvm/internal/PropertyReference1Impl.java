package kotlin.jvm.internal;

import java.util.Objects;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(KClass kClass, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kClass).h(), str, str2, !Objects.nonNull(kClass) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }
}
