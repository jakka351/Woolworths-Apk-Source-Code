package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
class AbstractAnnotationTypeQualifierResolver$$Lambda$1 implements Function1 {
    public static final AbstractAnnotationTypeQualifierResolver$$Lambda$1 d = new AbstractAnnotationTypeQualifierResolver$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object extractNullability) {
        LinkedHashMap linkedHashMap = AbstractAnnotationTypeQualifierResolver.c;
        Intrinsics.h(extractNullability, "$this$extractNullability");
        return Boolean.FALSE;
    }
}
