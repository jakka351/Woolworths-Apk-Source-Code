package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 extends BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor {
    public final HashMap b;
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl c;
    public final /* synthetic */ ClassDescriptor d;
    public final /* synthetic */ ClassId e;
    public final /* synthetic */ List f;
    public final /* synthetic */ SourceElement g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, ClassDescriptor classDescriptor, ClassId classId, List list, SourceElement sourceElement) {
        super();
        this.c = binaryClassAnnotationAndConstantLoaderImpl;
        this.d = classDescriptor;
        this.e = classId;
        this.f = list;
        this.g = sourceElement;
        this.b = new HashMap();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void a() {
        HashMap arguments = this.b;
        Intrinsics.h(arguments, "arguments");
        ClassId classId = SpecialJvmAnnotations.b;
        ClassId classId2 = this.e;
        boolean zEquals = classId2.equals(classId);
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = this.c;
        boolean zQ = false;
        if (zEquals) {
            Object obj = arguments.get(Name.e("value"));
            KClassValue kClassValue = obj instanceof KClassValue ? (KClassValue) obj : null;
            if (kClassValue != null) {
                Object obj2 = kClassValue.f24539a;
                KClassValue.Value.NormalClass normalClass = obj2 instanceof KClassValue.Value.NormalClass ? (KClassValue.Value.NormalClass) obj2 : null;
                if (normalClass != null) {
                    zQ = binaryClassAnnotationAndConstantLoaderImpl.q(normalClass.f24542a.f24538a);
                }
            }
        }
        if (zQ || binaryClassAnnotationAndConstantLoaderImpl.q(classId2)) {
            return;
        }
        this.f.add(new AnnotationDescriptorImpl(this.d.t(), arguments, this.g));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
    public final void g(ArrayList elements, Name name) {
        Intrinsics.h(elements, "elements");
        ValueParameterDescriptor valueParameterDescriptorB = DescriptorResolverUtils.b(name, this.d);
        if (valueParameterDescriptorB != null) {
            List listB = CollectionsKt.b(elements);
            KotlinType type = valueParameterDescriptorB.getType();
            Intrinsics.g(type, "getType(...)");
            this.b.put(name, new TypedArrayValue(listB, type));
            return;
        }
        if (this.c.q(this.e) && Intrinsics.c(name.b(), "value")) {
            ArrayList arrayList = new ArrayList();
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof AnnotationValue) {
                    arrayList.add(next);
                }
            }
            List list = this.f;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                list.add((AnnotationDescriptor) ((AnnotationValue) it2.next()).f24539a);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
    public final void h(Name name, ConstantValue constantValue) {
        this.b.put(name, constantValue);
    }
}
