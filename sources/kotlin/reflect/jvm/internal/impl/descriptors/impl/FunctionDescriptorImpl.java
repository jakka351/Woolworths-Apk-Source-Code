package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes.dex */
public abstract class FunctionDescriptorImpl extends DeclarationDescriptorNonRootImpl implements FunctionDescriptor {
    public boolean A;
    public Collection B;
    public volatile Function0 C;
    public final FunctionDescriptor D;
    public final CallableMemberDescriptor.Kind E;
    public FunctionDescriptor F;
    public Map G;
    public List h;
    public List i;
    public KotlinType j;
    public List k;
    public ReceiverParameterDescriptor l;
    public ReceiverParameterDescriptor m;
    public Modality n;
    public DescriptorVisibility o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* loaded from: classes7.dex */
    public class CopyConfiguration implements FunctionDescriptor.CopyBuilder<FunctionDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public TypeSubstitution f24359a;
        public DeclarationDescriptor b;
        public Modality c;
        public DescriptorVisibility d;
        public FunctionDescriptor e;
        public CallableMemberDescriptor.Kind f;
        public List g;
        public final List h;
        public ReceiverParameterDescriptor i;
        public ReceiverParameterDescriptor j;
        public KotlinType k;
        public Name l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public EmptyList r;
        public Annotations s;
        public boolean t;
        public final LinkedHashMap u;
        public Boolean v;
        public boolean w;
        public final /* synthetic */ FunctionDescriptorImpl x;

        public CopyConfiguration(FunctionDescriptorImpl functionDescriptorImpl, TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, List list, List list2, ReceiverParameterDescriptor receiverParameterDescriptor, KotlinType kotlinType) {
            if (typeSubstitution == null) {
                s(0);
                throw null;
            }
            if (declarationDescriptor == null) {
                s(1);
                throw null;
            }
            if (modality == null) {
                s(2);
                throw null;
            }
            if (descriptorVisibility == null) {
                s(3);
                throw null;
            }
            if (kind == null) {
                s(4);
                throw null;
            }
            if (list == null) {
                s(5);
                throw null;
            }
            if (list2 == null) {
                s(6);
                throw null;
            }
            if (kotlinType == null) {
                s(7);
                throw null;
            }
            this.x = functionDescriptorImpl;
            this.e = null;
            this.j = functionDescriptorImpl.m;
            this.m = true;
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = functionDescriptorImpl.w;
            this.r = null;
            this.s = null;
            this.t = functionDescriptorImpl.x;
            this.u = new LinkedHashMap();
            this.v = null;
            this.w = false;
            this.f24359a = typeSubstitution;
            this.b = declarationDescriptor;
            this.c = modality;
            this.d = descriptorVisibility;
            this.f = kind;
            this.g = list;
            this.h = list2;
            this.i = receiverParameterDescriptor;
            this.k = kotlinType;
            this.l = null;
        }

        public static /* synthetic */ void s(int i) {
            String str;
            int i2;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        public final void A(FunctionDescriptor functionDescriptor) {
            this.e = functionDescriptor;
        }

        public final void B() {
            this.o = true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder a(ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.j = receiverParameterDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder b(TypeSubstitution typeSubstitution) {
            if (typeSubstitution != null) {
                this.f24359a = typeSubstitution;
                return this;
            }
            s(37);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor build() {
            return this.x.J0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder c() {
            this.q = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder d(Name name) {
            if (name != null) {
                this.l = name;
                return this;
            }
            s(17);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder e(ClassConstructorDescriptor classConstructorDescriptor) {
            this.e = classConstructorDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder f() {
            this.o = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder g(KotlinType kotlinType) {
            if (kotlinType != null) {
                this.k = kotlinType;
                return this;
            }
            s(23);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder h() {
            this.u.put(JavaMethodDescriptor.K, Boolean.TRUE);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder i(Annotations annotations) {
            if (annotations != null) {
                this.s = annotations;
                return this;
            }
            s(35);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder j(List list) {
            this.g = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder k() {
            this.t = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder l() {
            this.m = false;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder m(DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility != null) {
                this.d = descriptorVisibility;
                return this;
            }
            s(12);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder n() {
            this.r = EmptyList.d;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder o(Modality modality) {
            if (modality != null) {
                this.c = modality;
                return this;
            }
            s(10);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder p(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                this.b = declarationDescriptor;
                return this;
            }
            s(8);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder q(CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.f = kind;
                return this;
            }
            s(14);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public final FunctionDescriptor.CopyBuilder r() {
            this.n = true;
            return this;
        }

        public final void z() {
            this.w = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionDescriptorImpl(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (declarationDescriptor == null) {
            n0(0);
            throw null;
        }
        if (annotations == null) {
            n0(1);
            throw null;
        }
        if (name == null) {
            n0(2);
            throw null;
        }
        if (kind == null) {
            n0(3);
            throw null;
        }
        if (sourceElement == null) {
            n0(4);
            throw null;
        }
        this.o = DescriptorVisibilities.i;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = false;
        this.B = null;
        this.C = null;
        this.F = null;
        this.G = null;
        this.D = functionDescriptor == null ? this : functionDescriptor;
        this.E = kind;
    }

    public static ArrayList K0(FunctionDescriptor functionDescriptor, List list, TypeSubstitutor typeSubstitutor, boolean z, boolean z2, boolean[] zArr) {
        Function0<List<VariableDescriptor>> function0;
        if (list == null) {
            n0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) it.next();
            KotlinType type = valueParameterDescriptor.getType();
            Variance variance = Variance.g;
            KotlinType kotlinTypeK = typeSubstitutor.k(type, variance);
            KotlinType kotlinTypeY0 = valueParameterDescriptor.y0();
            KotlinType kotlinTypeK2 = kotlinTypeY0 == null ? null : typeSubstitutor.k(kotlinTypeY0, variance);
            if (kotlinTypeK == null) {
                return null;
            }
            if ((kotlinTypeK != valueParameterDescriptor.getType() || kotlinTypeY0 != kotlinTypeK2) && zArr != null) {
                zArr[0] = true;
            }
            if (valueParameterDescriptor instanceof ValueParameterDescriptorImpl.WithDestructuringDeclaration) {
                final List listJ0 = ((ValueParameterDescriptorImpl.WithDestructuringDeclaration) valueParameterDescriptor).J0();
                function0 = new Function0<List<VariableDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return listJ0;
                    }
                };
            } else {
                function0 = null;
            }
            arrayList.add(ValueParameterDescriptorImpl.I0(functionDescriptor, z ? null : valueParameterDescriptor, valueParameterDescriptor.getIndex(), valueParameterDescriptor.getAnnotations(), valueParameterDescriptor.getName(), kotlinTypeK, valueParameterDescriptor.P(), valueParameterDescriptor.v0(), valueParameterDescriptor.t0(), kotlinTypeK2, z2 ? valueParameterDescriptor.g() : SourceElement.f24343a, function0));
        }
        return arrayList;
    }

    public static /* synthetic */ void n0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List A0() {
        List list = this.k;
        if (list != null) {
            return list;
        }
        n0(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean D0() {
        return this.w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public FunctionDescriptor F0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility) {
        FunctionDescriptor functionDescriptorBuild = S().p(declarationDescriptor).o(modality).m(descriptorVisibility).q(CallableMemberDescriptor.Kind.e).l().build();
        if (functionDescriptorBuild != null) {
            return functionDescriptorBuild;
        }
        n0(26);
        throw null;
    }

    public abstract FunctionDescriptorImpl I0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0215  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl J0(kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration r21) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.J0(kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl$CopyConfiguration):kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl");
    }

    public void L0(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List list, List list2, List list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            n0(5);
            throw null;
        }
        if (list2 == null) {
            n0(6);
            throw null;
        }
        if (list3 == null) {
            n0(7);
            throw null;
        }
        if (descriptorVisibility == null) {
            n0(8);
            throw null;
        }
        this.h = CollectionsKt.G0(list2);
        this.i = CollectionsKt.G0(list3);
        this.j = kotlinType;
        this.n = modality;
        this.o = descriptorVisibility;
        this.l = receiverParameterDescriptor;
        this.m = receiverParameterDescriptor2;
        this.k = list;
        for (int i = 0; i < list2.size(); i++) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) list2.get(i);
            if (typeParameterDescriptor.getIndex() != i) {
                throw new IllegalStateException(typeParameterDescriptor + " index is " + typeParameterDescriptor.getIndex() + " but position is " + i);
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) list3.get(i2);
            if (valueParameterDescriptor.getIndex() != i2) {
                throw new IllegalStateException(valueParameterDescriptor + "index is " + valueParameterDescriptor.getIndex() + " but position is " + i2);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Object M(CallableDescriptor.UserDataKey userDataKey) {
        Map map = this.G;
        if (map == null) {
            return null;
        }
        return map.get(userDataKey);
    }

    public final CopyConfiguration M0(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return new CopyConfiguration(this, typeSubstitutor.g(), e(), k(), getVisibility(), f(), h(), A0(), this.l, getReturnType());
        }
        n0(24);
        throw null;
    }

    public final void N0(CallableDescriptor.UserDataKey userDataKey, Object obj) {
        if (this.G == null) {
            this.G = new LinkedHashMap();
        }
        this.G.put(userDataKey, obj);
    }

    public void O0(boolean z) {
        this.z = z;
    }

    public void P0(boolean z) {
        this.A = z;
    }

    public void Q(Collection collection) {
        if (collection == null) {
            n0(17);
            throw null;
        }
        this.B = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((FunctionDescriptor) it.next()).R()) {
                this.x = true;
                return;
            }
        }
    }

    public final void Q0(SimpleType simpleType) {
        if (simpleType != null) {
            this.j = simpleType;
        } else {
            n0(11);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean R() {
        return this.x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor.CopyBuilder S() {
        return M0(TypeSubstitutor.b);
    }

    public Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.l(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final ReceiverParameterDescriptor c0() {
        return this.m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final ReceiverParameterDescriptor e0() {
        return this.l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor.Kind f() {
        CallableMemberDescriptor.Kind kind = this.E;
        if (kind != null) {
            return kind;
        }
        n0(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List getTypeParameters() {
        List list = this.h;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.o;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        n0(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List h() {
        List list = this.i;
        if (list != null) {
            return list;
        }
        n0(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean h0() {
        return this.v;
    }

    public boolean isExternal() {
        return this.r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isInfix() {
        if (this.q) {
            return true;
        }
        Iterator it = H0().q().iterator();
        while (it.hasNext()) {
            if (((FunctionDescriptor) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isOperator() {
        if (this.p) {
            return true;
        }
        Iterator it = H0().q().iterator();
        while (it.hasNext()) {
            if (((FunctionDescriptor) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return this.y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality k() {
        Modality modality = this.n;
        if (modality != null) {
            return modality;
        }
        n0(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean m0() {
        return this.A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean p0() {
        return this.u;
    }

    public Collection q() {
        Function0 function0 = this.C;
        if (function0 != null) {
            this.B = (Collection) function0.invoke();
            this.C = null;
        }
        Collection collection = this.B;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        n0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final FunctionDescriptor w0() {
        return this.F;
    }

    public boolean y() {
        return this.t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public FunctionDescriptor b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            n0(22);
            throw null;
        }
        if (typeSubstitutor.h()) {
            return this;
        }
        CopyConfiguration copyConfigurationM0 = M0(typeSubstitutor);
        copyConfigurationM0.A(H0());
        copyConfigurationM0.B();
        copyConfigurationM0.z();
        return copyConfigurationM0.build();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public FunctionDescriptor H0() {
        FunctionDescriptor functionDescriptor = this.D;
        FunctionDescriptor functionDescriptorA = functionDescriptor == this ? this : functionDescriptor.H0();
        if (functionDescriptorA != null) {
            return functionDescriptorA;
        }
        n0(20);
        throw null;
    }
}
