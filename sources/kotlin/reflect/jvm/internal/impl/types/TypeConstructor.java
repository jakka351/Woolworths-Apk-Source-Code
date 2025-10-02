package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;

/* loaded from: classes.dex */
public interface TypeConstructor extends TypeConstructorMarker {
    Collection a();

    ClassifierDescriptor c();

    boolean d();

    List getParameters();

    KotlinBuiltIns p();
}
