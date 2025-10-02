package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes.dex */
public interface PackageFragmentProvider {
    List a(FqName fqName);

    Collection r(FqName fqName, Function1 function1);
}
