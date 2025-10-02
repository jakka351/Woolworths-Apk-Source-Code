package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* loaded from: classes.dex */
public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {
    public PropertySetterDescriptor A;
    public FieldDescriptor B;
    public FieldDescriptor C;
    public final Modality l;
    public DescriptorVisibility m;
    public Collection n;
    public final PropertyDescriptor o;
    public final CallableMemberDescriptor.Kind p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public List v;
    public ReceiverParameterDescriptor w;
    public ReceiverParameterDescriptor x;
    public ArrayList y;
    public PropertyGetterDescriptorImpl z;

    /* loaded from: classes7.dex */
    public class CopyConfiguration {

        /* renamed from: a, reason: collision with root package name */
        public DeclarationDescriptor f24363a;
        public Modality b;
        public DescriptorVisibility c;
        public CallableMemberDescriptor.Kind e;
        public final ReceiverParameterDescriptor h;
        public final Name i;
        public final KotlinType j;
        public PropertyDescriptor d = null;
        public TypeSubstitution f = TypeSubstitution.f24618a;
        public boolean g = true;

        public CopyConfiguration() {
            this.f24363a = PropertyDescriptorImpl.this.e();
            this.b = PropertyDescriptorImpl.this.k();
            this.c = PropertyDescriptorImpl.this.getVisibility();
            this.e = PropertyDescriptorImpl.this.f();
            this.h = PropertyDescriptorImpl.this.w;
            this.i = PropertyDescriptorImpl.this.getName();
            this.j = PropertyDescriptorImpl.this.getType();
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable] */
        public final PropertyDescriptorImpl b() {
            AbstractReceiverParameterDescriptor abstractReceiverParameterDescriptor;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
            PropertySetterDescriptorImpl propertySetterDescriptorImpl;
            TypeSubstitutor typeSubstitutor;
            Function0 function0;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl3;
            DeclarationDescriptor declarationDescriptor = this.f24363a;
            Modality modality = this.b;
            DescriptorVisibility descriptorVisibility = this.c;
            PropertyDescriptor propertyDescriptor = this.d;
            CallableMemberDescriptor.Kind kind = this.e;
            Name name = this.i;
            PropertyDescriptorImpl propertyDescriptorImpl = PropertyDescriptorImpl.this;
            PropertyDescriptorImpl propertyDescriptorImplL0 = propertyDescriptorImpl.L0(declarationDescriptor, modality, descriptorVisibility, propertyDescriptor, kind, name);
            List typeParameters = propertyDescriptorImpl.getTypeParameters();
            ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
            TypeSubstitutor typeSubstitutorB = DescriptorSubstitutor.b(typeParameters, this.f, propertyDescriptorImplL0, arrayList);
            Variance variance = Variance.h;
            KotlinType kotlinType = this.j;
            KotlinType kotlinTypeK = typeSubstitutorB.k(kotlinType, variance);
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl4 = null;
            if (kotlinTypeK != null) {
                Variance variance2 = Variance.g;
                KotlinType kotlinTypeK2 = typeSubstitutorB.k(kotlinType, variance2);
                if (kotlinTypeK2 != null) {
                    propertyDescriptorImplL0.N0(kotlinTypeK2);
                }
                ReceiverParameterDescriptor receiverParameterDescriptor = this.h;
                if (receiverParameterDescriptor != null) {
                    AbstractReceiverParameterDescriptor abstractReceiverParameterDescriptorB = receiverParameterDescriptor.b(typeSubstitutorB);
                    abstractReceiverParameterDescriptor = abstractReceiverParameterDescriptorB != null ? abstractReceiverParameterDescriptorB : null;
                }
                ReceiverParameterDescriptor receiverParameterDescriptor2 = propertyDescriptorImpl.x;
                if (receiverParameterDescriptor2 != null) {
                    KotlinType kotlinTypeK3 = typeSubstitutorB.k(receiverParameterDescriptor2.getType(), variance2);
                    receiverParameterDescriptorImpl = kotlinTypeK3 == null ? null : new ReceiverParameterDescriptorImpl(propertyDescriptorImplL0, new ExtensionReceiver(propertyDescriptorImplL0, kotlinTypeK3, receiverParameterDescriptor2.getValue()), receiverParameterDescriptor2.getAnnotations());
                } else {
                    receiverParameterDescriptorImpl = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (ReceiverParameterDescriptor receiverParameterDescriptor3 : propertyDescriptorImpl.v) {
                    KotlinType kotlinTypeK4 = typeSubstitutorB.k(receiverParameterDescriptor3.getType(), Variance.g);
                    if (kotlinTypeK4 == null) {
                        receiverParameterDescriptorImpl2 = receiverParameterDescriptorImpl4;
                        receiverParameterDescriptorImpl3 = receiverParameterDescriptorImpl2;
                    } else {
                        receiverParameterDescriptorImpl3 = receiverParameterDescriptorImpl4;
                        receiverParameterDescriptorImpl2 = new ReceiverParameterDescriptorImpl(propertyDescriptorImplL0, new ContextReceiver(propertyDescriptorImplL0, kotlinTypeK4, ((ImplicitContextReceiver) receiverParameterDescriptor3.getValue()).a(), receiverParameterDescriptor3.getValue()), receiverParameterDescriptor3.getAnnotations());
                    }
                    if (receiverParameterDescriptorImpl2 != null) {
                        arrayList2.add(receiverParameterDescriptorImpl2);
                    }
                    receiverParameterDescriptorImpl4 = receiverParameterDescriptorImpl3;
                }
                ?? r19 = receiverParameterDescriptorImpl4;
                propertyDescriptorImplL0.O0(kotlinTypeK, arrayList, abstractReceiverParameterDescriptor, receiverParameterDescriptorImpl, arrayList2);
                PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = propertyDescriptorImpl.z;
                CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.e;
                SourceElement sourceElement = SourceElement.f24343a;
                if (propertyGetterDescriptorImpl2 == null) {
                    propertyGetterDescriptorImpl = r19;
                } else {
                    Annotations annotations = propertyGetterDescriptorImpl2.getAnnotations();
                    Modality modality2 = this.b;
                    DescriptorVisibility visibility = propertyDescriptorImpl.z.getVisibility();
                    if (this.e == kind2 && DescriptorVisibilities.e(visibility.d())) {
                        visibility = DescriptorVisibilities.h;
                    }
                    DescriptorVisibility descriptorVisibility2 = visibility;
                    PropertyGetterDescriptorImpl propertyGetterDescriptorImpl3 = propertyDescriptorImpl.z;
                    boolean z = propertyGetterDescriptorImpl3.h;
                    boolean z2 = propertyGetterDescriptorImpl3.i;
                    boolean z3 = propertyGetterDescriptorImpl3.l;
                    CallableMemberDescriptor.Kind kind3 = this.e;
                    PropertyDescriptor propertyDescriptor2 = this.d;
                    propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(propertyDescriptorImplL0, annotations, modality2, descriptorVisibility2, z, z2, z3, kind3, propertyDescriptor2 == null ? r19 : propertyDescriptor2.getGetter(), sourceElement);
                }
                if (propertyGetterDescriptorImpl != null) {
                    PropertyGetterDescriptorImpl propertyGetterDescriptorImpl4 = propertyDescriptorImpl.z;
                    KotlinType kotlinType2 = propertyGetterDescriptorImpl4.p;
                    if (propertyGetterDescriptorImpl4 == null) {
                        PropertyDescriptorImpl.n0(31);
                        throw r19;
                    }
                    propertyGetterDescriptorImpl.o = propertyGetterDescriptorImpl4.w0() != null ? propertyGetterDescriptorImpl4.w0().b(typeSubstitutorB) : r19;
                    propertyGetterDescriptorImpl.M0(kotlinType2 != null ? typeSubstitutorB.k(kotlinType2, Variance.h) : r19);
                }
                PropertySetterDescriptor propertySetterDescriptor = propertyDescriptorImpl.A;
                if (propertySetterDescriptor == null) {
                    propertySetterDescriptorImpl = r19;
                } else {
                    Annotations annotations2 = propertySetterDescriptor.getAnnotations();
                    Modality modality3 = this.b;
                    DescriptorVisibility visibility2 = propertyDescriptorImpl.A.getVisibility();
                    if (this.e == kind2 && DescriptorVisibilities.e(visibility2.d())) {
                        visibility2 = DescriptorVisibilities.h;
                    }
                    DescriptorVisibility descriptorVisibility3 = visibility2;
                    boolean zY = propertyDescriptorImpl.A.Y();
                    boolean zIsExternal = propertyDescriptorImpl.A.isExternal();
                    boolean zIsInline = propertyDescriptorImpl.A.isInline();
                    CallableMemberDescriptor.Kind kind4 = this.e;
                    PropertyDescriptor propertyDescriptor3 = this.d;
                    propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptorImplL0, annotations2, modality3, descriptorVisibility3, zY, zIsExternal, zIsInline, kind4, propertyDescriptor3 == null ? r19 : propertyDescriptor3.c(), sourceElement);
                }
                if (propertySetterDescriptorImpl != null) {
                    typeSubstitutor = typeSubstitutorB;
                    List listK0 = FunctionDescriptorImpl.K0(propertySetterDescriptorImpl, propertyDescriptorImpl.A.h(), typeSubstitutor, false, false, null);
                    if (listK0 == null) {
                        listK0 = Collections.singletonList(PropertySetterDescriptorImpl.L0(propertySetterDescriptorImpl, DescriptorUtilsKt.e(this.f24363a).o(), ((ValueParameterDescriptor) propertyDescriptorImpl.A.h().get(0)).getAnnotations()));
                    }
                    if (listK0.size() != 1) {
                        throw new IllegalStateException();
                    }
                    PropertySetterDescriptor propertySetterDescriptor2 = propertyDescriptorImpl.A;
                    if (propertySetterDescriptor2 == null) {
                        PropertyDescriptorImpl.n0(31);
                        throw r19;
                    }
                    propertySetterDescriptorImpl.o = propertySetterDescriptor2.w0() != null ? propertySetterDescriptor2.w0().b(typeSubstitutor) : r19;
                    propertySetterDescriptorImpl.N0((ValueParameterDescriptor) listK0.get(0));
                } else {
                    typeSubstitutor = typeSubstitutorB;
                }
                FieldDescriptor fieldDescriptor = propertyDescriptorImpl.B;
                FieldDescriptorImpl fieldDescriptorImpl = fieldDescriptor == null ? r19 : new FieldDescriptorImpl(fieldDescriptor.getAnnotations(), propertyDescriptorImplL0);
                FieldDescriptor fieldDescriptor2 = propertyDescriptorImpl.C;
                propertyDescriptorImplL0.M0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, fieldDescriptorImpl, fieldDescriptor2 == null ? r19 : new FieldDescriptorImpl(fieldDescriptor2.getAnnotations(), propertyDescriptorImplL0));
                if (this.g) {
                    int i = SmartSet.f;
                    SmartSet smartSetA = SmartSet.Companion.a();
                    Iterator it = propertyDescriptorImpl.q().iterator();
                    while (it.hasNext()) {
                        smartSetA.add(((PropertyDescriptor) it.next()).b(typeSubstitutor));
                    }
                    propertyDescriptorImplL0.n = smartSetA;
                }
                if (propertyDescriptorImpl.isConst() && (function0 = propertyDescriptorImpl.k) != null) {
                    propertyDescriptorImplL0.I0(propertyDescriptorImpl.j, function0);
                }
                return propertyDescriptorImplL0;
            }
            return null;
        }

        public final void c() {
            this.g = false;
        }

        public final void d() {
            this.e = CallableMemberDescriptor.Kind.e;
        }

        public final void e(Modality modality) {
            this.b = modality;
        }

        public final void f(PropertyDescriptor propertyDescriptor) {
            this.d = propertyDescriptor;
        }

        public final void g(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                this.f24363a = declarationDescriptor;
            } else {
                a(0);
                throw null;
            }
        }

        public final void h(TypeSubstitution typeSubstitution) {
            if (typeSubstitution != null) {
                this.f = typeSubstitution;
            } else {
                a(15);
                throw null;
            }
        }

        public final void i(DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility != null) {
                this.c = descriptorVisibility;
            } else {
                a(8);
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyDescriptorImpl(DeclarationDescriptor declarationDescriptor, PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(declarationDescriptor, annotations, name, z, sourceElement);
        if (declarationDescriptor == null) {
            n0(0);
            throw null;
        }
        if (annotations == null) {
            n0(1);
            throw null;
        }
        if (modality == null) {
            n0(2);
            throw null;
        }
        if (descriptorVisibility == null) {
            n0(3);
            throw null;
        }
        if (name == null) {
            n0(4);
            throw null;
        }
        if (kind == null) {
            n0(5);
            throw null;
        }
        if (sourceElement == null) {
            n0(6);
            throw null;
        }
        this.n = null;
        this.v = Collections.EMPTY_LIST;
        this.l = modality;
        this.m = descriptorVisibility;
        this.o = propertyDescriptor == null ? this : propertyDescriptor;
        this.p = kind;
        this.q = z2;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        this.u = z6;
    }

    public static PropertyDescriptorImpl K0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, boolean z, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            n0(7);
            throw null;
        }
        if (descriptorVisibility == null) {
            n0(10);
            throw null;
        }
        if (name == null) {
            n0(11);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyDescriptorImpl(declarationDescriptor, null, Annotations.Companion.f24350a, modality, descriptorVisibility, z, name, kind, sourceElement, false, false, false, false, false);
        }
        n0(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void n0(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.n0(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List A0() {
        List list = this.v;
        if (list != null) {
            return list;
        }
        n0(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final boolean B0() {
        return this.q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final FieldDescriptor D() {
        return this.C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final PropertyDescriptorImpl F0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility) {
        CopyConfiguration copyConfiguration = new CopyConfiguration();
        copyConfiguration.g(declarationDescriptor);
        copyConfiguration.f(null);
        copyConfiguration.e(modality);
        copyConfiguration.i(descriptorVisibility);
        copyConfiguration.d();
        copyConfiguration.c();
        PropertyDescriptorImpl propertyDescriptorImplB = copyConfiguration.b();
        if (propertyDescriptorImplB != null) {
            return propertyDescriptorImplB;
        }
        n0(42);
        throw null;
    }

    public PropertyDescriptorImpl L0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name name) {
        if (declarationDescriptor == null) {
            n0(32);
            throw null;
        }
        if (modality == null) {
            n0(33);
            throw null;
        }
        if (descriptorVisibility == null) {
            n0(34);
            throw null;
        }
        if (kind == null) {
            n0(35);
            throw null;
        }
        if (name == null) {
            n0(36);
            throw null;
        }
        return new PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, descriptorVisibility, this.i, name, kind, SourceElement.f24343a, this.q, isConst(), this.s, isExternal(), this.u);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Object M(CallableDescriptor.UserDataKey userDataKey) {
        return null;
    }

    public final void M0(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptorImpl propertySetterDescriptorImpl, FieldDescriptor fieldDescriptor, FieldDescriptor fieldDescriptor2) {
        this.z = propertyGetterDescriptorImpl;
        this.A = propertySetterDescriptorImpl;
        this.B = fieldDescriptor;
        this.C = fieldDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final FieldDescriptor N() {
        return this.B;
    }

    public void N0(KotlinType kotlinType) {
    }

    public final void O0(KotlinType kotlinType, List list, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl, List list2) {
        if (kotlinType == null) {
            n0(17);
            throw null;
        }
        if (list == null) {
            n0(18);
            throw null;
        }
        if (list2 == null) {
            n0(19);
            throw null;
        }
        this.h = kotlinType;
        this.y = new ArrayList(list);
        this.x = receiverParameterDescriptorImpl;
        this.w = receiverParameterDescriptor;
        this.v = list2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void Q(Collection collection) {
        if (collection != null) {
            this.n = collection;
        } else {
            n0(40);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.b(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public final boolean W() {
        return this.u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final PropertySetterDescriptor c() {
        return this.A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final ReceiverParameterDescriptor c0() {
        return this.w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final ReceiverParameterDescriptor e0() {
        return this.x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor.Kind f() {
        CallableMemberDescriptor.Kind kind = this.p;
        if (kind != null) {
            return kind;
        }
        n0(39);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final PropertyGetterDescriptorImpl getGetter() {
        return this.z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final KotlinType getReturnType() {
        KotlinType type = getType();
        if (type != null) {
            return type;
        }
        n0(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List getTypeParameters() {
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.m;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        n0(25);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality k() {
        Modality modality = this.l;
        if (modality != null) {
            return modality;
        }
        n0(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean p0() {
        return this.s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Collection q() {
        Collection collection = this.n;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        n0(41);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final ArrayList v() {
        ArrayList arrayList = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.z;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        PropertySetterDescriptor propertySetterDescriptor = this.A;
        if (propertySetterDescriptor != null) {
            arrayList.add(propertySetterDescriptor);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final PropertyDescriptor b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            if (typeSubstitutor.h()) {
                return this;
            }
            CopyConfiguration copyConfiguration = new CopyConfiguration();
            copyConfiguration.h(typeSubstitutor.g());
            copyConfiguration.f(a());
            return copyConfiguration.b();
        }
        n0(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final PropertyDescriptor a() {
        PropertyDescriptor propertyDescriptor = this.o;
        PropertyDescriptor propertyDescriptorA = propertyDescriptor == this ? this : propertyDescriptor.a();
        if (propertyDescriptorA != null) {
            return propertyDescriptorA;
        }
        n0(38);
        throw null;
    }
}
