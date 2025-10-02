package curtains.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class WindowManagerSpy$mViewsField$2 extends Lambda implements Function0<Field> {
    public static final WindowManagerSpy$mViewsField$2 h = new WindowManagerSpy$mViewsField$2(0);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchFieldException, SecurityException {
        Class cls = (Class) WindowManagerSpy.f23765a.getD();
        if (cls == null) {
            return null;
        }
        Field declaredField = cls.getDeclaredField("mViews");
        declaredField.setAccessible(true);
        return declaredField;
    }
}
