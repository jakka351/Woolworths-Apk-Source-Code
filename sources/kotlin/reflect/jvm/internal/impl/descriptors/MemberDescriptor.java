package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes.dex */
public interface MemberDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    DescriptorVisibility getVisibility();

    boolean h0();

    boolean isExternal();

    Modality k();

    boolean p0();
}
