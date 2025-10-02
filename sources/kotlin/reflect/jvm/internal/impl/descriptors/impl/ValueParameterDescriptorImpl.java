package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

@SourceDebugExtension
/* loaded from: classes7.dex */
public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final KotlinType m;
    public final ValueParameterDescriptor n;

    public static final class Companion {
    }

    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {
        public final Lazy o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(CallableDescriptor callableDescriptor, ValueParameterDescriptor valueParameterDescriptor, int i, Annotations annotations, Name name, KotlinType kotlinType, boolean z, boolean z2, boolean z3, KotlinType kotlinType2, SourceElement source, Function0 destructuringVariables) {
            super(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, source);
            Intrinsics.h(annotations, "annotations");
            Intrinsics.h(name, "name");
            Intrinsics.h(source, "source");
            Intrinsics.h(destructuringVariables, "destructuringVariables");
            this.o = LazyKt.b(destructuringVariables);
        }

        public final List J0() {
            return (List) this.o.getD();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
        public final ValueParameterDescriptor X(FunctionInvokeDescriptor functionInvokeDescriptor, Name name, int i) {
            Annotations annotations = getAnnotations();
            Intrinsics.g(annotations, "<get-annotations>(...)");
            KotlinType type = getType();
            Intrinsics.g(type, "getType(...)");
            return new WithDestructuringDeclaration(functionInvokeDescriptor, null, i, annotations, name, type, P(), this.k, this.l, this.m, SourceElement.f24343a, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$WithDestructuringDeclaration$$Lambda$0
                public final ValueParameterDescriptorImpl.WithDestructuringDeclaration d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.d.J0();
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(CallableDescriptor containingDeclaration, ValueParameterDescriptor valueParameterDescriptor, int i, Annotations annotations, Name name, KotlinType outType, boolean z, boolean z2, boolean z3, KotlinType kotlinType, SourceElement source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.h(containingDeclaration, "containingDeclaration");
        Intrinsics.h(annotations, "annotations");
        Intrinsics.h(name, "name");
        Intrinsics.h(outType, "outType");
        Intrinsics.h(source, "source");
        this.i = i;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = kotlinType;
        this.n = valueParameterDescriptor == null ? this : valueParameterDescriptor;
    }

    public static final ValueParameterDescriptorImpl I0(CallableDescriptor callableDescriptor, ValueParameterDescriptor valueParameterDescriptor, int i, Annotations annotations, Name name, KotlinType kotlinType, boolean z, boolean z2, boolean z3, KotlinType kotlinType2, SourceElement source, Function0 function0) {
        Intrinsics.h(annotations, "annotations");
        Intrinsics.h(name, "name");
        Intrinsics.h(source, "source");
        return function0 == null ? new ValueParameterDescriptorImpl(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, source) : new WithDestructuringDeclaration(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, source, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final boolean C() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public final boolean P() {
        if (!this.j) {
            return false;
        }
        CallableMemberDescriptor.Kind kindF = ((CallableMemberDescriptor) e()).f();
        kindF.getClass();
        return kindF != CallableMemberDescriptor.Kind.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.j(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public ValueParameterDescriptor X(FunctionInvokeDescriptor functionInvokeDescriptor, Name name, int i) {
        Annotations annotations = getAnnotations();
        Intrinsics.g(annotations, "<get-annotations>(...)");
        KotlinType type = getType();
        Intrinsics.g(type, "getType(...)");
        return new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i, annotations, name, type, P(), this.k, this.l, this.m, SourceElement.f24343a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final DeclarationDescriptorNonRoot b(TypeSubstitutor substitutor) {
        Intrinsics.h(substitutor, "substitutor");
        if (substitutor.f24619a.f()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public final int getIndex() {
        return this.i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility LOCAL = DescriptorVisibilities.f;
        Intrinsics.g(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Collection q() {
        Collection collectionQ = e().q();
        Intrinsics.g(collectionQ, "getOverriddenDescriptors(...)");
        Collection collection = collectionQ;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((ValueParameterDescriptor) ((CallableDescriptor) it.next()).h().get(this.i));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final /* bridge */ /* synthetic */ ConstantValue s0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public final boolean t0() {
        return this.l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public final boolean v0() {
        return this.k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public final KotlinType y0() {
        return this.m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final CallableDescriptor e() {
        DeclarationDescriptor declarationDescriptorE = super.e();
        Intrinsics.f(declarationDescriptorE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (CallableDescriptor) declarationDescriptorE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ValueParameterDescriptor H0() {
        ValueParameterDescriptor valueParameterDescriptor = this.n;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final VariableDescriptor b(TypeSubstitutor substitutor) {
        Intrinsics.h(substitutor, "substitutor");
        if (substitutor.f24619a.f()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }
}
