package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

/* loaded from: classes7.dex */
public interface TypeParameterDescriptor extends ClassifierDescriptor, TypeParameterMarker {
    boolean E();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    TypeParameterDescriptor a();

    StorageManager d0();

    int getIndex();

    List getUpperBounds();

    Variance j();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    TypeConstructor m();

    boolean x();
}
