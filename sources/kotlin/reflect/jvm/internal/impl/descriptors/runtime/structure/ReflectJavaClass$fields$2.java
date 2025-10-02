package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final /* synthetic */ class ReflectJavaClass$fields$2 extends FunctionReferenceImpl implements Function1<Field, ReflectJavaField> {
    public static final ReflectJavaClass$fields$2 d = new ReflectJavaClass$fields$2(1, ReflectJavaField.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Field p0 = (Field) obj;
        Intrinsics.h(p0, "p0");
        return new ReflectJavaField(p0);
    }
}
