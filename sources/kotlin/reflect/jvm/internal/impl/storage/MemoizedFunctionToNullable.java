package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes.dex */
public interface MemoizedFunctionToNullable<P, R> extends Function1<P, R> {
    boolean h(FqName fqName);
}
