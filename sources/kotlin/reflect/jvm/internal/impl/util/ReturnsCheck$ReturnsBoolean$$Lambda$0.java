package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;

/* loaded from: classes7.dex */
class ReturnsCheck$ReturnsBoolean$$Lambda$0 implements Function1 {
    public static final ReturnsCheck$ReturnsBoolean$$Lambda$0 d = new ReturnsCheck$ReturnsBoolean$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) obj;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.c;
        Intrinsics.h(kotlinBuiltIns, "<this>");
        SimpleType simpleTypeT = kotlinBuiltIns.t(PrimitiveType.i);
        if (simpleTypeT != null) {
            return simpleTypeT;
        }
        KotlinBuiltIns.a(64);
        throw null;
    }
}
