package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.CallableId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes7.dex */
public final class SuspendFunctionTypeUtilKt {

    /* renamed from: a, reason: collision with root package name */
    public static final FqName f24585a = new FqName("kotlin.suspend");

    static {
        new CallableId(StandardNames.l, Name.e("suspend"));
    }
}
