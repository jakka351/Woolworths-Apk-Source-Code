package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;

/* loaded from: classes7.dex */
class JavaDeprecatedAnnotationDescriptor$$Lambda$0 implements Function0 {
    public static final JavaDeprecatedAnnotationDescriptor$$Lambda$0 d = new JavaDeprecatedAnnotationDescriptor$$Lambda$0();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KProperty[] kPropertyArr = JavaDeprecatedAnnotationDescriptor.h;
        return MapsKt.i(new Pair(JavaAnnotationMapper.f24416a, new StringValue((Object) "Deprecated in Java")));
    }
}
