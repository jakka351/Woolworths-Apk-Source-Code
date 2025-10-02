package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes7.dex */
final class CapturedTypeParameterDescriptor implements TypeParameterDescriptor {
    public final TypeParameterDescriptor d;
    public final ClassifierDescriptorWithTypeParameters e;
    public final int f;

    public CapturedTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i) {
        this.d = typeParameterDescriptor;
        this.e = classifierDescriptorWithTypeParameters;
        this.f = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean E() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return this.d.V(declarationDescriptorVisitor, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public final ClassifierDescriptor H0() {
        return this.d.H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final StorageManager d0() {
        StorageManager storageManagerD0 = this.d.d0();
        Intrinsics.g(storageManagerD0, "getStorageManager(...)");
        return storageManagerD0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor e() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement g() {
        SourceElement sourceElementG = this.d.g();
        Intrinsics.g(sourceElementG, "getSource(...)");
        return sourceElementG;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.d.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final int getIndex() {
        return this.d.getIndex() + this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final Name getName() {
        Name name = this.d.getName();
        Intrinsics.g(name, "getName(...)");
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final List getUpperBounds() {
        List upperBounds = this.d.getUpperBounds();
        Intrinsics.g(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final Variance j() {
        Variance varianceJ = this.d.j();
        Intrinsics.g(varianceJ, "getVariance(...)");
        return varianceJ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor m() {
        TypeConstructor typeConstructorM = this.d.m();
        Intrinsics.g(typeConstructorM, "getTypeConstructor(...)");
        return typeConstructorM;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final SimpleType t() {
        SimpleType simpleTypeT = this.d.t();
        Intrinsics.g(simpleTypeT, "getDefaultType(...)");
        return simpleTypeT;
    }

    public final String toString() {
        return this.d + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean x() {
        return this.d.x();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public final DeclarationDescriptor H0() {
        return this.d.H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public final TypeParameterDescriptor H0() {
        return this.d.H0();
    }
}
