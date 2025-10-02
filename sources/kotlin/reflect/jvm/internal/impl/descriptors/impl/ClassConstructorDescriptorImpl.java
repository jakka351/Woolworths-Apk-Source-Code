package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes.dex */
public class ClassConstructorDescriptorImpl extends FunctionDescriptorImpl implements ClassConstructorDescriptor {
    public final boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassConstructorDescriptorImpl(ClassDescriptor classDescriptor, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(kind, classDescriptor, constructorDescriptor, sourceElement, annotations, SpecialNames.e);
        if (classDescriptor == null) {
            n0(0);
            throw null;
        }
        if (annotations == null) {
            n0(1);
            throw null;
        }
        if (kind == null) {
            n0(2);
            throw null;
        }
        if (sourceElement == null) {
            n0(3);
            throw null;
        }
        this.H = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void n0(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl.n0(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor F0(ClassDescriptor classDescriptor, Modality modality, DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        return (ClassConstructorDescriptor) super.F0(classDescriptor, modality, delegatedDescriptorVisibility);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: H0 */
    public final FunctionDescriptor F0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility) {
        return (ClassConstructorDescriptor) super.F0(declarationDescriptor, modality, descriptorVisibility);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public final ClassDescriptor I() {
        ClassDescriptor classDescriptorE = e();
        if (classDescriptorE != null) {
            return classDescriptorE;
        }
        n0(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void Q(Collection collection) {
        if (collection != null) {
            return;
        }
        n0(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public ClassConstructorDescriptorImpl I0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        if (declarationDescriptor == null) {
            n0(23);
            throw null;
        }
        if (kind == null) {
            n0(24);
            throw null;
        }
        if (annotations == null) {
            n0(25);
            throw null;
        }
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.d;
        if (kind == kind2 || kind == CallableMemberDescriptor.Kind.g) {
            return new ClassConstructorDescriptorImpl((ClassDescriptor) declarationDescriptor, this, annotations, this.H, kind2, sourceElement);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final ClassDescriptor e() {
        ClassDescriptor classDescriptor = (ClassDescriptor) super.e();
        if (classDescriptor != null) {
            return classDescriptor;
        }
        n0(17);
        throw null;
    }

    public final void T0(List list, DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            n0(13);
            throw null;
        }
        if (descriptorVisibility != null) {
            U0(list, descriptorVisibility, e().u());
        } else {
            n0(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0(java.util.List r12, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r13, java.util.List r14) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L61
            if (r13 == 0) goto L5b
            if (r14 == 0) goto L55
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r1 = r11.e()
            boolean r2 = r1.i()
            if (r2 == 0) goto L21
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r1.e()
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            if (r2 == 0) goto L21
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r1
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r1 = r1.U()
            r4 = r1
            goto L22
        L21:
            r4 = r0
        L22:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r1 = r11.e()
            java.util.List r2 = r1.i0()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3e
            java.util.List r1 = r1.i0()
            if (r1 == 0) goto L38
        L36:
            r5 = r1
            goto L43
        L38:
            r12 = 15
            n0(r12)
            throw r0
        L3e:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            if (r1 == 0) goto L4f
            goto L36
        L43:
            r8 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r9 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.e
            r3 = 0
            r2 = r11
            r7 = r12
            r10 = r13
            r6 = r14
            r2.L0(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L4f:
            r12 = 16
            n0(r12)
            throw r0
        L55:
            r12 = 12
            n0(r12)
            throw r0
        L5b:
            r12 = 11
            n0(r12)
            throw r0
        L61:
            r12 = 10
            n0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl.U0(java.util.List, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility, java.util.List):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.k(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public final boolean k0() {
        return this.H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Collection q() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        n0(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final ClassConstructorDescriptor b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return (ClassConstructorDescriptor) super.b(typeSubstitutor);
        }
        n0(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public final ClassConstructorDescriptor H0() {
        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) super.H0();
        if (classConstructorDescriptor != null) {
            return classConstructorDescriptor;
        }
        n0(19);
        throw null;
    }
}
