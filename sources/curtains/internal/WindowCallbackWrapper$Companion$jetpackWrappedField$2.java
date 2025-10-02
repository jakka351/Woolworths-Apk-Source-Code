package curtains.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class WindowCallbackWrapper$Companion$jetpackWrappedField$2 extends Lambda implements Function0<Field> {
    public static final WindowCallbackWrapper$Companion$jetpackWrappedField$2 h = new WindowCallbackWrapper$Companion$jetpackWrappedField$2(0);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class cls = (Class) WindowCallbackWrapper.d.getD();
        if (cls == null) {
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField("mWrapped");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }
}
