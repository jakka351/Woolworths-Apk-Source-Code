package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;

/* loaded from: classes.dex */
public interface DeclarationDescriptor extends Named, Annotated {
    Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj);

    DeclarationDescriptor a();

    DeclarationDescriptor e();
}
