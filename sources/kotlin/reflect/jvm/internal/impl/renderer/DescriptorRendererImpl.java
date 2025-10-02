package kotlin.reflect.jvm.internal.impl.renderer;

import YU.a;
import androidx.compose.ui.platform.i;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {
    public static final /* synthetic */ int f = 0;
    public final DescriptorRendererOptionsImpl d;
    public final Lazy e = LazyKt.b(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$0
        public final DescriptorRendererImpl d;

        {
            this.d = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            int i = DescriptorRendererImpl.f;
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d.d;
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = new DescriptorRendererOptionsImpl();
            Iterator itA = ArrayIteratorKt.a(DescriptorRendererOptionsImpl.class.getDeclaredFields());
            while (itA.hasNext()) {
                Field field = (Field) itA.next();
                if ((field.getModifiers() & 8) == 0) {
                    field.setAccessible(true);
                    Object obj = field.get(descriptorRendererOptionsImpl);
                    ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                    if (observableProperty != null) {
                        String name = field.getName();
                        Intrinsics.g(name, "getName(...)");
                        StringsKt.W(name, "is", false);
                        KClass kClassB = Reflection.f24268a.b(DescriptorRendererOptionsImpl.class);
                        String name2 = field.getName();
                        StringBuilder sb = new StringBuilder("get");
                        String name3 = field.getName();
                        Intrinsics.g(name3, "getName(...)");
                        if (name3.length() > 0) {
                            char upperCase = Character.toUpperCase(name3.charAt(0));
                            String strSubstring = name3.substring(1);
                            Intrinsics.g(strSubstring, "substring(...)");
                            name3 = upperCase + strSubstring;
                        }
                        sb.append(name3);
                        field.set(descriptorRendererOptionsImpl2, new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(observableProperty.getValue(descriptorRendererOptionsImpl, new PropertyReference1Impl(kClassB, name2, sb.toString())), descriptorRendererOptionsImpl2));
                    }
                }
            }
            DescriptorRendererImpl$$Lambda$5.d.invoke(descriptorRendererOptionsImpl2);
            descriptorRendererOptionsImpl2.f24524a = true;
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl2);
        }
    });

    public final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<Unit, StringBuilder> {

        /* loaded from: classes7.dex */
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = PropertyAccessorRenderingPolicy.d;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy2 = PropertyAccessorRenderingPolicy.d;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object a(ModuleAwareClassDescriptor moduleAwareClassDescriptor, Object obj) {
            ClassConstructorDescriptor classConstructorDescriptorZ;
            String str;
            StringBuilder sb = (StringBuilder) obj;
            final DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.d;
            boolean z = moduleAwareClassDescriptor.f() == ClassKind.g;
            if (!descriptorRendererImpl.u()) {
                List listI0 = moduleAwareClassDescriptor.i0();
                Intrinsics.g(listI0, "getContextReceivers(...)");
                descriptorRendererImpl.D(sb, listI0);
                descriptorRendererImpl.A(sb, moduleAwareClassDescriptor, null);
                if (!z) {
                    DescriptorVisibility visibility = moduleAwareClassDescriptor.getVisibility();
                    Intrinsics.g(visibility, "getVisibility(...)");
                    descriptorRendererImpl.j0(visibility, sb);
                }
                if ((moduleAwareClassDescriptor.f() != ClassKind.e || moduleAwareClassDescriptor.k() != Modality.h) && (!moduleAwareClassDescriptor.f().a() || moduleAwareClassDescriptor.k() != Modality.e)) {
                    Modality modalityK = moduleAwareClassDescriptor.k();
                    Intrinsics.g(modalityK, "getModality(...)");
                    descriptorRendererImpl.N(modalityK, sb, DescriptorRendererImpl.y(moduleAwareClassDescriptor));
                }
                descriptorRendererImpl.M(moduleAwareClassDescriptor, sb);
                descriptorRendererImpl.P("inner", sb, descriptorRendererImpl.t().contains(DescriptorRendererModifier.k) && moduleAwareClassDescriptor.i());
                descriptorRendererImpl.P("data", sb, descriptorRendererImpl.t().contains(DescriptorRendererModifier.m) && moduleAwareClassDescriptor.G0());
                descriptorRendererImpl.P("inline", sb, descriptorRendererImpl.t().contains(DescriptorRendererModifier.n) && moduleAwareClassDescriptor.isInline());
                descriptorRendererImpl.P("value", sb, descriptorRendererImpl.t().contains(DescriptorRendererModifier.t) && moduleAwareClassDescriptor.w());
                descriptorRendererImpl.P("fun", sb, descriptorRendererImpl.t().contains(DescriptorRendererModifier.s) && moduleAwareClassDescriptor.l0());
                if (moduleAwareClassDescriptor instanceof TypeAliasDescriptor) {
                    str = "typealias";
                } else if (moduleAwareClassDescriptor.j0()) {
                    str = "companion object";
                } else {
                    int iOrdinal = moduleAwareClassDescriptor.f().ordinal();
                    if (iOrdinal == 0) {
                        str = "class";
                    } else if (iOrdinal == 1) {
                        str = "interface";
                    } else if (iOrdinal == 2) {
                        str = "enum class";
                    } else if (iOrdinal == 3) {
                        str = "enum entry";
                    } else if (iOrdinal == 4) {
                        str = "annotation class";
                    } else {
                        if (iOrdinal != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "object";
                    }
                }
                sb.append(descriptorRendererImpl.K(str));
            }
            if (DescriptorUtils.l(moduleAwareClassDescriptor)) {
                if (((Boolean) descriptorRendererOptionsImpl.G.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[31])).booleanValue()) {
                    if (descriptorRendererImpl.u()) {
                        sb.append("companion object");
                    }
                    DescriptorRendererImpl.Y(sb);
                    DeclarationDescriptor declarationDescriptorE = moduleAwareClassDescriptor.e();
                    if (declarationDescriptorE != null) {
                        sb.append("of ");
                        Name name = declarationDescriptorE.getName();
                        Intrinsics.g(name, "getName(...)");
                        sb.append(descriptorRendererImpl.Q(name, false));
                    }
                }
                if (descriptorRendererImpl.x() || !Intrinsics.c(moduleAwareClassDescriptor.getName(), SpecialNames.b)) {
                    if (!descriptorRendererImpl.u()) {
                        DescriptorRendererImpl.Y(sb);
                    }
                    Name name2 = moduleAwareClassDescriptor.getName();
                    Intrinsics.g(name2, "getName(...)");
                    sb.append(descriptorRendererImpl.Q(name2, true));
                }
            } else {
                if (!descriptorRendererImpl.u()) {
                    DescriptorRendererImpl.Y(sb);
                }
                descriptorRendererImpl.R(moduleAwareClassDescriptor, sb, true);
            }
            if (!z) {
                List listU = moduleAwareClassDescriptor.u();
                Intrinsics.g(listU, "getDeclaredTypeParameters(...)");
                descriptorRendererImpl.e0(listU, sb, false);
                descriptorRendererImpl.B(moduleAwareClassDescriptor, sb);
                if (!moduleAwareClassDescriptor.f().a() && ((Boolean) descriptorRendererOptionsImpl.i.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[7])).booleanValue() && (classConstructorDescriptorZ = moduleAwareClassDescriptor.z()) != null) {
                    sb.append(" ");
                    descriptorRendererImpl.A(sb, classConstructorDescriptorZ, null);
                    DescriptorVisibility visibility2 = classConstructorDescriptorZ.getVisibility();
                    Intrinsics.g(visibility2, "getVisibility(...)");
                    descriptorRendererImpl.j0(visibility2, sb);
                    sb.append(descriptorRendererImpl.K("constructor"));
                    List listH = classConstructorDescriptorZ.h();
                    Intrinsics.g(listH, "getValueParameters(...)");
                    descriptorRendererImpl.i0(listH, classConstructorDescriptorZ.m0(), sb);
                }
                if (!((Boolean) descriptorRendererOptionsImpl.x.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[22])).booleanValue() && !KotlinBuiltIns.F(moduleAwareClassDescriptor.t())) {
                    Collection collectionA = moduleAwareClassDescriptor.m().a();
                    Intrinsics.g(collectionA, "getSupertypes(...)");
                    if (!collectionA.isEmpty() && (collectionA.size() != 1 || !KotlinBuiltIns.y((KotlinType) collectionA.iterator().next()))) {
                        DescriptorRendererImpl.Y(sb);
                        sb.append(": ");
                        CollectionsKt.L(collectionA, sb, ", ", null, null, new Function1(descriptorRendererImpl) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$4
                            public final DescriptorRendererImpl d;

                            {
                                this.d = descriptorRendererImpl;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                KotlinType kotlinType = (KotlinType) obj2;
                                int i = DescriptorRendererImpl.f;
                                Intrinsics.e(kotlinType);
                                return this.d.Z(kotlinType);
                            }
                        }, 60);
                    }
                }
                descriptorRendererImpl.k0(sb, listU);
            }
            return Unit.f24250a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object b(PropertyDescriptorImpl descriptor, Object obj) {
            Intrinsics.h(descriptor, "descriptor");
            DescriptorRendererImpl.r(DescriptorRendererImpl.this, descriptor, (StringBuilder) obj);
            return Unit.f24250a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object c(PackageFragmentDescriptorImpl packageFragmentDescriptorImpl, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            int i = DescriptorRendererImpl.f;
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            FqName fqName = packageFragmentDescriptorImpl.h;
            sb.append(descriptorRendererImpl.K("package-fragment"));
            String strI = descriptorRendererImpl.I(fqName.f24500a);
            if (strI.length() > 0) {
                sb.append(" ");
                sb.append(strI);
            }
            if (descriptorRendererImpl.d.q()) {
                sb.append(" in ");
                descriptorRendererImpl.R(packageFragmentDescriptorImpl.e(), sb, false);
            }
            return Unit.f24250a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object d(AbstractReceiverParameterDescriptor abstractReceiverParameterDescriptor, Object obj) {
            ((StringBuilder) obj).append(abstractReceiverParameterDescriptor.getName());
            return Unit.f24250a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object e(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            int i = DescriptorRendererImpl.f;
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            FqName fqName = lazyPackageViewDescriptorImpl.g;
            sb.append(descriptorRendererImpl.K("package"));
            String strI = descriptorRendererImpl.I(fqName.f24500a);
            if (strI.length() > 0) {
                sb.append(" ");
                sb.append(strI);
            }
            if (descriptorRendererImpl.d.q()) {
                sb.append(" in context of ");
                descriptorRendererImpl.R(lazyPackageViewDescriptorImpl.f, sb, false);
            }
            return Unit.f24250a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object f(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            int i = DescriptorRendererImpl.f;
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            descriptorRendererImpl.getClass();
            descriptorRendererImpl.A(sb, abstractTypeAliasDescriptor, null);
            DescriptorVisibility visibility = abstractTypeAliasDescriptor.getVisibility();
            Intrinsics.g(visibility, "getVisibility(...)");
            descriptorRendererImpl.j0(visibility, sb);
            descriptorRendererImpl.M(abstractTypeAliasDescriptor, sb);
            sb.append(descriptorRendererImpl.K("typealias"));
            sb.append(" ");
            descriptorRendererImpl.R(abstractTypeAliasDescriptor, sb, true);
            descriptorRendererImpl.e0(abstractTypeAliasDescriptor.u(), sb, false);
            descriptorRendererImpl.B(abstractTypeAliasDescriptor, sb);
            sb.append(" = ");
            sb.append(descriptorRendererImpl.Z(((DeserializedTypeAliasDescriptor) abstractTypeAliasDescriptor).x0()));
            return Unit.f24250a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object g(Object obj, ModuleDescriptorImpl moduleDescriptorImpl) {
            int i = DescriptorRendererImpl.f;
            DescriptorRendererImpl.this.R(moduleDescriptorImpl, (StringBuilder) obj, true);
            return Unit.f24250a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object h(PropertySetterDescriptorImpl propertySetterDescriptorImpl, Object obj) {
            o(propertySetterDescriptorImpl, (StringBuilder) obj, "setter");
            return Unit.f24250a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object i(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, Object obj) {
            o(propertyGetterDescriptorImpl, (StringBuilder) obj, "getter");
            return Unit.f24250a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object j(ValueParameterDescriptorImpl valueParameterDescriptorImpl, Object obj) {
            int i = DescriptorRendererImpl.f;
            DescriptorRendererImpl.this.h0(valueParameterDescriptorImpl, true, (StringBuilder) obj, true);
            return Unit.f24250a;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object k(kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl r12, java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 309
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.RenderDeclarationDescriptorVisitor.k(kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final /* bridge */ /* synthetic */ Object l(FunctionDescriptor functionDescriptor, Object obj) {
            n(functionDescriptor, (StringBuilder) obj);
            return Unit.f24250a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public final Object m(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, Object obj) {
            int i = DescriptorRendererImpl.f;
            DescriptorRendererImpl.this.c0(abstractTypeParameterDescriptor, (StringBuilder) obj, true);
            return Unit.f24250a;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01a9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void n(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r12, java.lang.StringBuilder r13) {
            /*
                Method dump skipped, instructions count: 453
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.RenderDeclarationDescriptorVisitor.n(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.StringBuilder):void");
        }

        public final void o(PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl, StringBuilder sb, String str) {
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.d;
            int iOrdinal = ((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.H.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[32])).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    n(propertyAccessorDescriptorImpl, sb);
                    return;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            descriptorRendererImpl.M(propertyAccessorDescriptorImpl, sb);
            sb.append(str.concat(" for "));
            PropertyDescriptor propertyDescriptorG0 = propertyAccessorDescriptorImpl.g0();
            Intrinsics.g(propertyDescriptorG0, "getCorrespondingProperty(...)");
            DescriptorRendererImpl.r(descriptorRendererImpl, propertyDescriptorG0, sb);
        }
    }

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RenderingFormat renderingFormat = RenderingFormat.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ParameterNameRenderingPolicy parameterNameRenderingPolicy = ParameterNameRenderingPolicy.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ParameterNameRenderingPolicy parameterNameRenderingPolicy2 = ParameterNameRenderingPolicy.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        this.d = descriptorRendererOptionsImpl;
    }

    public static void Y(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean l0(KotlinType kotlinType) {
        if (!FunctionTypesKt.j(kotlinType)) {
            return false;
        }
        List listH0 = kotlinType.H0();
        if ((listH0 instanceof Collection) && listH0.isEmpty()) {
            return true;
        }
        Iterator it = listH0.iterator();
        while (it.hasNext()) {
            if (((TypeProjection) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    public static final void r(DescriptorRendererImpl descriptorRendererImpl, PropertyDescriptor propertyDescriptor, StringBuilder sb) {
        boolean zU = descriptorRendererImpl.u();
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.d;
        if (!zU) {
            DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 descriptorRendererOptionsImpl$property$$inlined$vetoable$1 = descriptorRendererOptionsImpl.g;
            KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.Y;
            if (!((Boolean) descriptorRendererOptionsImpl$property$$inlined$vetoable$1.getValue(descriptorRendererOptionsImpl, kPropertyArr[5])).booleanValue()) {
                List listA0 = propertyDescriptor.A0();
                Intrinsics.g(listA0, "getContextReceiverParameters(...)");
                descriptorRendererImpl.D(sb, listA0);
                if (descriptorRendererImpl.t().contains(DescriptorRendererModifier.j)) {
                    descriptorRendererImpl.A(sb, propertyDescriptor, null);
                    FieldDescriptor fieldDescriptorN = propertyDescriptor.N();
                    if (fieldDescriptorN != null) {
                        descriptorRendererImpl.A(sb, fieldDescriptorN, AnnotationUseSiteTarget.e);
                    }
                    FieldDescriptor fieldDescriptorD = propertyDescriptor.D();
                    if (fieldDescriptorD != null) {
                        descriptorRendererImpl.A(sb, fieldDescriptorD, AnnotationUseSiteTarget.m);
                    }
                    if (((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.H.getValue(descriptorRendererOptionsImpl, kPropertyArr[32])) == PropertyAccessorRenderingPolicy.e) {
                        PropertyGetterDescriptorImpl getter = propertyDescriptor.getGetter();
                        if (getter != null) {
                            descriptorRendererImpl.A(sb, getter, AnnotationUseSiteTarget.h);
                        }
                        PropertySetterDescriptor propertySetterDescriptorC = propertyDescriptor.c();
                        if (propertySetterDescriptorC != null) {
                            descriptorRendererImpl.A(sb, propertySetterDescriptorC, AnnotationUseSiteTarget.i);
                            List listH = propertySetterDescriptorC.h();
                            Intrinsics.g(listH, "getValueParameters(...)");
                            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.n0(listH);
                            Intrinsics.e(valueParameterDescriptor);
                            descriptorRendererImpl.A(sb, valueParameterDescriptor, AnnotationUseSiteTarget.l);
                        }
                    }
                }
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                Intrinsics.g(visibility, "getVisibility(...)");
                descriptorRendererImpl.j0(visibility, sb);
                descriptorRendererImpl.P("const", sb, descriptorRendererImpl.t().contains(DescriptorRendererModifier.q) && propertyDescriptor.isConst());
                descriptorRendererImpl.M(propertyDescriptor, sb);
                descriptorRendererImpl.O(sb, propertyDescriptor);
                descriptorRendererImpl.U(sb, propertyDescriptor);
                descriptorRendererImpl.P("lateinit", sb, descriptorRendererImpl.t().contains(DescriptorRendererModifier.r) && propertyDescriptor.B0());
                descriptorRendererImpl.L(sb, propertyDescriptor);
            }
            descriptorRendererImpl.g0(propertyDescriptor, sb, false);
            List typeParameters = propertyDescriptor.getTypeParameters();
            Intrinsics.g(typeParameters, "getTypeParameters(...)");
            descriptorRendererImpl.e0(typeParameters, sb, true);
            descriptorRendererImpl.W(sb, propertyDescriptor);
        }
        descriptorRendererImpl.R(propertyDescriptor, sb, true);
        sb.append(": ");
        KotlinType type = propertyDescriptor.getType();
        Intrinsics.g(type, "getType(...)");
        sb.append(descriptorRendererImpl.Z(type));
        descriptorRendererImpl.X(sb, propertyDescriptor);
        descriptorRendererImpl.J(propertyDescriptor, sb);
        List typeParameters2 = propertyDescriptor.getTypeParameters();
        Intrinsics.g(typeParameters2, "getTypeParameters(...)");
        descriptorRendererImpl.k0(sb, typeParameters2);
    }

    public static Modality y(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).f() == ClassKind.e ? Modality.h : Modality.e;
        }
        DeclarationDescriptor declarationDescriptorE = memberDescriptor.e();
        ClassDescriptor classDescriptor = declarationDescriptorE instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorE : null;
        if (classDescriptor != null && (memberDescriptor instanceof CallableMemberDescriptor)) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
            Collection collectionQ = callableMemberDescriptor.q();
            Intrinsics.g(collectionQ, "getOverriddenDescriptors(...)");
            if (!collectionQ.isEmpty() && classDescriptor.k() != Modality.e) {
                return Modality.g;
            }
            if (classDescriptor.f() != ClassKind.e || Intrinsics.c(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.f24332a)) {
                return Modality.e;
            }
            Modality modalityK = callableMemberDescriptor.k();
            Modality modality = Modality.h;
            return modalityK == modality ? modality : Modality.g;
        }
        return Modality.e;
    }

    public final void A(StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (t().contains(DescriptorRendererModifier.j)) {
            boolean z = annotated instanceof KotlinType;
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
            Set setB = z ? descriptorRendererOptionsImpl.b() : (Set) descriptorRendererOptionsImpl.K.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[35]);
            Function1 function1 = (Function1) descriptorRendererOptionsImpl.M.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[37]);
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!CollectionsKt.t(setB, annotationDescriptor.d()) && !Intrinsics.c(annotationDescriptor.d(), StandardNames.FqNames.r) && (function1 == null || ((Boolean) function1.invoke(annotationDescriptor)).booleanValue())) {
                    sb.append(q(annotationDescriptor, annotationUseSiteTarget));
                    if (((Boolean) descriptorRendererOptionsImpl.J.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[34])).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final void B(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb) {
        List listU = classifierDescriptorWithTypeParameters.u();
        Intrinsics.g(listU, "getDeclaredTypeParameters(...)");
        List parameters = classifierDescriptorWithTypeParameters.m().getParameters();
        Intrinsics.g(parameters, "getParameters(...)");
        if (x() && classifierDescriptorWithTypeParameters.i() && parameters.size() > listU.size()) {
            sb.append(" /*captured type parameters: ");
            d0(sb, parameters.subList(listU.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final String C(ConstantValue constantValue) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        Function1 function1 = (Function1) descriptorRendererOptionsImpl.v.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[20]);
        if (function1 != null) {
            return (String) function1.invoke(constantValue);
        }
        if (constantValue instanceof ArrayValue) {
            Iterable iterable = (Iterable) ((ArrayValue) constantValue).b();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strC = C((ConstantValue) it.next());
                if (strC != null) {
                    arrayList.add(strC);
                }
            }
            return CollectionsKt.M(arrayList, ", ", "{", "}", null, 56);
        }
        if (constantValue instanceof AnnotationValue) {
            return StringsKt.L("@", q((AnnotationDescriptor) ((AnnotationValue) constantValue).b(), null));
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value value = (KClassValue.Value) ((KClassValue) constantValue).b();
        if (value instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) value).a() + "::class";
        }
        if (!(value instanceof KClassValue.Value.NormalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value;
        String strA = normalClass.b().a().f24500a.f24501a;
        int iA = normalClass.a();
        for (int i = 0; i < iA; i++) {
            strA = i.a('>', "kotlin.Array<", strA);
        }
        return a.g(strA, "::class");
    }

    public final void D(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) it.next();
            A(sb, receiverParameterDescriptor, AnnotationUseSiteTarget.j);
            KotlinType type = receiverParameterDescriptor.getType();
            Intrinsics.g(type, "getType(...)");
            sb.append(H(type));
            if (i == CollectionsKt.I(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    public final void E(StringBuilder sb, SimpleType simpleType) {
        A(sb, simpleType, null);
        DefinitelyNotNullType definitelyNotNullType = simpleType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) simpleType : null;
        SimpleType simpleTypeV0 = definitelyNotNullType != null ? definitelyNotNullType.V0() : null;
        if (KotlinTypeKt.a(simpleType)) {
            boolean zM = TypeUtilsKt.m(simpleType);
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
            if (zM && ((Boolean) descriptorRendererOptionsImpl.V.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[47])).booleanValue()) {
                ErrorUtils errorUtils = ErrorUtils.f24634a;
                TypeUtilsKt.m(simpleType);
                TypeConstructor typeConstructorJ0 = simpleType.J0();
                Intrinsics.f(typeConstructorJ0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(F(((ErrorTypeConstructor) typeConstructorJ0).b[0]));
            } else {
                if (!(simpleType instanceof ErrorType) || ((Boolean) descriptorRendererOptionsImpl.X.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[49])).booleanValue()) {
                    sb.append(simpleType.J0().toString());
                } else {
                    sb.append(((ErrorType) simpleType).k);
                }
                sb.append(a0(simpleType.H0()));
            }
        } else if (simpleType instanceof StubTypeForBuilderInference) {
            sb.append(((StubTypeForBuilderInference) simpleType).S0().toString());
        } else if (simpleTypeV0 instanceof StubTypeForBuilderInference) {
            sb.append(((StubTypeForBuilderInference) simpleTypeV0).S0().toString());
        } else {
            TypeConstructor typeConstructorJ02 = simpleType.J0();
            PossiblyInnerType possiblyInnerTypeA = TypeParameterUtilsKt.a(simpleType);
            if (possiblyInnerTypeA == null) {
                sb.append(b0(typeConstructorJ02));
                sb.append(a0(simpleType.H0()));
            } else {
                V(sb, possiblyInnerTypeA);
            }
        }
        if (simpleType.K0()) {
            sb.append("?");
        }
        if (SpecialTypesKt.a(simpleType)) {
            sb.append(" & Any");
        }
    }

    public final String F(String str) {
        int iOrdinal = v().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return a.h("<font color=red><b>", str, "</b></font>");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String G(String lowerRendered, String upperRendered, KotlinBuiltIns kotlinBuiltIns) {
        Intrinsics.h(lowerRendered, "lowerRendered");
        Intrinsics.h(upperRendered, "upperRendered");
        if (RenderingUtilsKt.d(lowerRendered, upperRendered)) {
            return StringsKt.W(upperRendered, "(", false) ? a.h("(", lowerRendered, ")!") : lowerRendered.concat("!");
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 descriptorRendererOptionsImpl$property$$inlined$vetoable$1 = descriptorRendererOptionsImpl.b;
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.Y;
        String strD0 = StringsKt.d0(((ClassifierNamePolicy) descriptorRendererOptionsImpl$property$$inlined$vetoable$1.getValue(descriptorRendererOptionsImpl, kPropertyArr[0])).a(kotlinBuiltIns.j(StandardNames.FqNames.C), this), "Collection");
        String strC = RenderingUtilsKt.c(lowerRendered, strD0.concat("Mutable"), upperRendered, strD0, strD0.concat("(Mutable)"));
        if (strC != null) {
            return strC;
        }
        String strC2 = RenderingUtilsKt.c(lowerRendered, strD0.concat("MutableMap.MutableEntry"), upperRendered, strD0.concat("Map.Entry"), strD0.concat("(Mutable)Map.(Mutable)Entry"));
        if (strC2 != null) {
            return strC2;
        }
        ClassifierNamePolicy classifierNamePolicy = (ClassifierNamePolicy) descriptorRendererOptionsImpl.b.getValue(descriptorRendererOptionsImpl, kPropertyArr[0]);
        ClassDescriptor classDescriptorK = kotlinBuiltIns.k("Array");
        Intrinsics.g(classDescriptorK, "getArray(...)");
        String strD02 = StringsKt.d0(classifierNamePolicy.a(classDescriptorK, this), "Array");
        String strC3 = RenderingUtilsKt.c(lowerRendered, strD02.concat(s("Array<")), upperRendered, strD02.concat(s("Array<out ")), strD02.concat(s("Array<(out) ")));
        if (strC3 != null) {
            return strC3;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    public final String H(KotlinType kotlinType) {
        String strZ = Z(kotlinType);
        return ((!l0(kotlinType) || TypeUtils.f(kotlinType)) && !(kotlinType instanceof DefinitelyNotNullType)) ? strZ : i.a(')', "(", strZ);
    }

    public final String I(FqNameUnsafe fqName) {
        Intrinsics.h(fqName, "fqName");
        return s(RenderingUtilsKt.b(FqNameUnsafe.e(fqName)));
    }

    public final void J(VariableDescriptor variableDescriptor, StringBuilder sb) {
        ConstantValue constantValueS0;
        String strC;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (!((Boolean) descriptorRendererOptionsImpl.u.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[19])).booleanValue() || (constantValueS0 = variableDescriptor.s0()) == null || (strC = C(constantValueS0)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(s(strC));
    }

    public final String K(String str) {
        int iOrdinal = v().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
            if (!((Boolean) descriptorRendererOptionsImpl.W.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[48])).booleanValue()) {
                return a.h("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void L(StringBuilder sb, CallableMemberDescriptor callableMemberDescriptor) {
        if (t().contains(DescriptorRendererModifier.l) && x() && callableMemberDescriptor.f() != CallableMemberDescriptor.Kind.d) {
            sb.append("/*");
            sb.append(CapitalizeDecapitalizeKt.c(callableMemberDescriptor.f().name()));
            sb.append("*/ ");
        }
    }

    public final void M(MemberDescriptor memberDescriptor, StringBuilder sb) {
        P("external", sb, memberDescriptor.isExternal());
        boolean z = false;
        P("expect", sb, t().contains(DescriptorRendererModifier.o) && memberDescriptor.p0());
        if (t().contains(DescriptorRendererModifier.p) && memberDescriptor.h0()) {
            z = true;
        }
        P("actual", sb, z);
    }

    public final void N(Modality modality, StringBuilder sb, Modality modality2) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (((Boolean) descriptorRendererOptionsImpl.p.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[14])).booleanValue() || modality != modality2) {
            P(CapitalizeDecapitalizeKt.c(modality.name()), sb, t().contains(DescriptorRendererModifier.h));
        }
    }

    public final void O(StringBuilder sb, CallableMemberDescriptor callableMemberDescriptor) {
        if (DescriptorUtils.s(callableMemberDescriptor) && callableMemberDescriptor.k() == Modality.e) {
            return;
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (((OverrideRenderingPolicy) descriptorRendererOptionsImpl.B.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[26])) == OverrideRenderingPolicy.d && callableMemberDescriptor.k() == Modality.g && !callableMemberDescriptor.q().isEmpty()) {
            return;
        }
        Modality modalityK = callableMemberDescriptor.k();
        Intrinsics.g(modalityK, "getModality(...)");
        N(modalityK, sb, y(callableMemberDescriptor));
    }

    public final void P(String str, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(K(str));
            sb.append(" ");
        }
    }

    public final String Q(Name name, boolean z) {
        String strS = s(RenderingUtilsKt.a(name));
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        return (((Boolean) descriptorRendererOptionsImpl.W.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[48])).booleanValue() && v() == RenderingFormat.e && z) ? a.h("<b>", strS, "</b>") : strS;
    }

    public final void R(DeclarationDescriptor declarationDescriptor, StringBuilder sb, boolean z) {
        Name name = declarationDescriptor.getName();
        Intrinsics.g(name, "getName(...)");
        sb.append(Q(name, z));
    }

    public final void S(StringBuilder sb, KotlinType kotlinType) {
        UnwrappedType unwrappedTypeM0 = kotlinType.M0();
        AbbreviatedType abbreviatedType = unwrappedTypeM0 instanceof AbbreviatedType ? (AbbreviatedType) unwrappedTypeM0 : null;
        if (abbreviatedType == null) {
            T(sb, kotlinType);
            return;
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 descriptorRendererOptionsImpl$property$$inlined$vetoable$1 = descriptorRendererOptionsImpl.R;
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.Y;
        if (((Boolean) descriptorRendererOptionsImpl$property$$inlined$vetoable$1.getValue(descriptorRendererOptionsImpl, kPropertyArr[42])).booleanValue()) {
            T(sb, abbreviatedType.Z());
            if (((Boolean) descriptorRendererOptionsImpl.S.getValue(descriptorRendererOptionsImpl, kPropertyArr[43])).booleanValue()) {
                RenderingFormat renderingFormatV = v();
                RenderingFormat renderingFormat = RenderingFormat.e;
                if (renderingFormatV == renderingFormat) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                T(sb, abbreviatedType.V0());
                sb.append(" */");
                if (v() == renderingFormat) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        T(sb, abbreviatedType.V0());
        if (((Boolean) descriptorRendererOptionsImpl.Q.getValue(descriptorRendererOptionsImpl, kPropertyArr[41])).booleanValue()) {
            RenderingFormat renderingFormatV2 = v();
            RenderingFormat renderingFormat2 = RenderingFormat.e;
            if (renderingFormatV2 == renderingFormat2) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            T(sb, abbreviatedType.Z());
            sb.append(" */");
            if (v() == renderingFormat2) {
                sb.append("</i></font>");
            }
        }
    }

    public final void T(StringBuilder sb, KotlinType kotlinType) {
        Name nameC;
        String strS;
        boolean z = kotlinType instanceof WrappedType;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (z && descriptorRendererOptionsImpl.q() && !((WrappedType) kotlinType).O0()) {
            sb.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedTypeM0 = kotlinType.M0();
        if (unwrappedTypeM0 instanceof FlexibleType) {
            sb.append(((FlexibleType) unwrappedTypeM0).T0(this, this));
            return;
        }
        if (!(unwrappedTypeM0 instanceof SimpleType)) {
            throw new NoWhenBranchMatchedException();
        }
        SimpleType simpleType = (SimpleType) unwrappedTypeM0;
        if (simpleType.equals(TypeUtils.b) || simpleType.J0() == TypeUtils.f24621a.e) {
            sb.append("???");
            return;
        }
        TypeConstructor typeConstructorJ0 = simpleType.J0();
        if ((typeConstructorJ0 instanceof ErrorTypeConstructor) && ((ErrorTypeConstructor) typeConstructorJ0).f24633a == ErrorTypeKind.m) {
            if (!((Boolean) descriptorRendererOptionsImpl.t.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[18])).booleanValue()) {
                sb.append("???");
                return;
            }
            TypeConstructor typeConstructorJ02 = simpleType.J0();
            Intrinsics.f(typeConstructorJ02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb.append(F(((ErrorTypeConstructor) typeConstructorJ02).b[0]));
            return;
        }
        if (KotlinTypeKt.a(simpleType)) {
            E(sb, simpleType);
            return;
        }
        if (!l0(simpleType)) {
            E(sb, simpleType);
            return;
        }
        int length = sb.length();
        ((DescriptorRendererImpl) this.e.getD()).A(sb, simpleType, null);
        boolean z2 = sb.length() != length;
        KotlinType kotlinTypeF = FunctionTypesKt.f(simpleType);
        List listD = FunctionTypesKt.d(simpleType);
        boolean zL = FunctionTypesKt.l(simpleType);
        boolean zK0 = simpleType.K0();
        boolean z3 = zK0 || (z2 && kotlinTypeF != null);
        if (z3) {
            if (zL) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    CharsKt.c(StringsKt.E(sb));
                    if (sb.charAt(StringsKt.A(sb) - 1) != ')') {
                        sb.insert(StringsKt.A(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        if (!listD.isEmpty()) {
            sb.append("context(");
            Iterator it = listD.subList(0, CollectionsKt.I(listD)).iterator();
            while (it.hasNext()) {
                S(sb, (KotlinType) it.next());
                sb.append(", ");
            }
            S(sb, (KotlinType) CollectionsKt.O(listD));
            sb.append(") ");
        }
        P("suspend", sb, zL);
        if (kotlinTypeF != null) {
            boolean z4 = (l0(kotlinTypeF) && !kotlinTypeF.K0()) || FunctionTypesKt.l(kotlinTypeF) || !kotlinTypeF.getAnnotations().isEmpty() || (kotlinTypeF instanceof DefinitelyNotNullType);
            if (z4) {
                sb.append("(");
            }
            S(sb, kotlinTypeF);
            if (z4) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!FunctionTypesKt.i(simpleType) || simpleType.H0().size() > 1) {
            int i = 0;
            for (TypeProjection typeProjection : FunctionTypesKt.h(simpleType)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                if (((Boolean) descriptorRendererOptionsImpl.U.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[45])).booleanValue()) {
                    KotlinType type = typeProjection.getType();
                    Intrinsics.g(type, "getType(...)");
                    nameC = FunctionTypesKt.c(type);
                } else {
                    nameC = null;
                }
                if (nameC != null) {
                    sb.append(Q(nameC, false));
                    sb.append(": ");
                }
                sb.append(f0(typeProjection));
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int iOrdinal = v().ordinal();
        if (iOrdinal == 0) {
            strS = s("->");
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            strS = "&rarr;";
        }
        sb.append(strS);
        sb.append(" ");
        S(sb, FunctionTypesKt.g(simpleType));
        if (z3) {
            sb.append(")");
        }
        if (zK0) {
            sb.append("?");
        }
    }

    public final void U(StringBuilder sb, CallableMemberDescriptor callableMemberDescriptor) {
        if (t().contains(DescriptorRendererModifier.i) && !callableMemberDescriptor.q().isEmpty()) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
            if (((OverrideRenderingPolicy) descriptorRendererOptionsImpl.B.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[26])) != OverrideRenderingPolicy.e) {
                P("override", sb, true);
                if (x()) {
                    sb.append("/*");
                    sb.append(callableMemberDescriptor.q().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void V(StringBuilder sb, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType possiblyInnerTypeC = possiblyInnerType.c();
        if (possiblyInnerTypeC != null) {
            V(sb, possiblyInnerTypeC);
            sb.append(JwtParser.SEPARATOR_CHAR);
            Name name = possiblyInnerType.b().getName();
            Intrinsics.g(name, "getName(...)");
            sb.append(Q(name, false));
        } else {
            TypeConstructor typeConstructorM = possiblyInnerType.b().m();
            Intrinsics.g(typeConstructorM, "getTypeConstructor(...)");
            sb.append(b0(typeConstructorM));
        }
        sb.append(a0(possiblyInnerType.a()));
    }

    public final void W(StringBuilder sb, CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorE0 = callableMemberDescriptor.e0();
        if (receiverParameterDescriptorE0 != null) {
            A(sb, receiverParameterDescriptorE0, AnnotationUseSiteTarget.j);
            KotlinType type = receiverParameterDescriptorE0.getType();
            Intrinsics.g(type, "getType(...)");
            sb.append(H(type));
            sb.append(".");
        }
    }

    public final void X(StringBuilder sb, CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorE0;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (((Boolean) descriptorRendererOptionsImpl.F.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[30])).booleanValue() && (receiverParameterDescriptorE0 = callableMemberDescriptor.e0()) != null) {
            sb.append(" on ");
            KotlinType type = receiverParameterDescriptorE0.getType();
            Intrinsics.g(type, "getType(...)");
            sb.append(Z(type));
        }
    }

    public final String Z(KotlinType type) {
        Intrinsics.h(type, "type");
        StringBuilder sb = new StringBuilder();
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        S(sb, (KotlinType) ((Function1) descriptorRendererOptionsImpl.y.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[23])).invoke(type));
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void a(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.d.a(parameterNameRenderingPolicy);
    }

    public final String a0(List typeArguments) {
        Intrinsics.h(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s("<"));
        CollectionsKt.L(typeArguments, sb, ", ", null, null, new DescriptorRendererImpl$$Lambda$2(this), 60);
        sb.append(s(">"));
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final Set b() {
        return this.d.b();
    }

    public final String b0(TypeConstructor typeConstructor) {
        Intrinsics.h(typeConstructor, "typeConstructor");
        ClassifierDescriptor klass = typeConstructor.c();
        if ((klass instanceof TypeParameterDescriptor) || (klass instanceof ClassDescriptor) || (klass instanceof TypeAliasDescriptor)) {
            Intrinsics.h(klass, "klass");
            if (ErrorUtils.f(klass)) {
                return klass.m().toString();
            }
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
            return ((ClassifierNamePolicy) descriptorRendererOptionsImpl.b.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[0])).a(klass, this);
        }
        if (klass == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).h(DescriptorRendererImpl$$Lambda$1.d) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + klass.getClass()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final AnnotationArgumentsRenderingPolicy c() {
        return this.d.c();
    }

    public final void c0(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(s("<"));
        }
        if (x()) {
            sb.append("/*");
            sb.append(typeParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        P("reified", sb, typeParameterDescriptor.x());
        String str = typeParameterDescriptor.j().d;
        boolean z2 = true;
        P(str, sb, str.length() > 0);
        A(sb, typeParameterDescriptor, null);
        R(typeParameterDescriptor, sb, z);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            KotlinType kotlinType = (KotlinType) typeParameterDescriptor.getUpperBounds().iterator().next();
            if (kotlinType == null) {
                KotlinBuiltIns.a(141);
                throw null;
            }
            if (!KotlinBuiltIns.y(kotlinType) || !kotlinType.K0()) {
                sb.append(" : ");
                sb.append(Z(kotlinType));
            }
        } else if (z) {
            for (KotlinType kotlinType2 : typeParameterDescriptor.getUpperBounds()) {
                if (kotlinType2 == null) {
                    KotlinBuiltIns.a(141);
                    throw null;
                }
                if (!KotlinBuiltIns.y(kotlinType2) || !kotlinType2.K0()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(Z(kotlinType2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(s(">"));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void d() {
        this.d.d();
    }

    public final void d0(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0((TypeParameterDescriptor) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void e(Set set) {
        Intrinsics.h(set, "<set-?>");
        this.d.e(set);
    }

    public final void e0(List list, StringBuilder sb, boolean z) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (((Boolean) descriptorRendererOptionsImpl.w.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[21])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(s("<"));
        d0(sb, list);
        sb.append(s(">"));
        if (z) {
            sb.append(" ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void f(LinkedHashSet linkedHashSet) {
        this.d.f(linkedHashSet);
    }

    public final String f0(TypeProjection typeProjection) {
        Intrinsics.h(typeProjection, "typeProjection");
        StringBuilder sb = new StringBuilder();
        CollectionsKt.L(CollectionsKt.Q(typeProjection), sb, ", ", null, null, new DescriptorRendererImpl$$Lambda$2(this), 60);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void g() {
        this.d.g();
    }

    public final void g0(VariableDescriptor variableDescriptor, StringBuilder sb, boolean z) {
        if (z || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb.append(K(variableDescriptor.C() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void h() {
        this.d.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h0(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r11, boolean r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.h0(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void i() {
        this.d.i();
    }

    public final void i0(Collection collection, boolean z, StringBuilder sb) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        int iOrdinal = ((ParameterNameRenderingPolicy) descriptorRendererOptionsImpl.E.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[29])).ordinal();
        boolean z2 = true;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (z) {
            }
            z2 = false;
        }
        int size = collection.size();
        w().a(sb);
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) it.next();
            w().c(valueParameterDescriptor, sb);
            h0(valueParameterDescriptor, z2, sb, false);
            w().d(valueParameterDescriptor, i, size, sb);
            i++;
        }
        w().b(sb);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void j() {
        this.d.j();
    }

    public final boolean j0(DescriptorVisibility descriptorVisibility, StringBuilder sb) {
        if (!t().contains(DescriptorRendererModifier.g)) {
            return false;
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 descriptorRendererOptionsImpl$property$$inlined$vetoable$1 = descriptorRendererOptionsImpl.n;
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.Y;
        if (((Boolean) descriptorRendererOptionsImpl$property$$inlined$vetoable$1.getValue(descriptorRendererOptionsImpl, kPropertyArr[12])).booleanValue()) {
            descriptorVisibility = descriptorVisibility.d();
        }
        if (!((Boolean) descriptorRendererOptionsImpl.o.getValue(descriptorRendererOptionsImpl, kPropertyArr[13])).booleanValue() && descriptorVisibility.equals(DescriptorVisibilities.l)) {
            return false;
        }
        sb.append(K(descriptorVisibility.b()));
        sb.append(" ");
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void k() {
        this.d.k();
    }

    public final void k0(StringBuilder sb, List list) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (((Boolean) descriptorRendererOptionsImpl.w.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[21])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it.next();
            List upperBounds = typeParameterDescriptor.getUpperBounds();
            Intrinsics.g(upperBounds, "getUpperBounds(...)");
            for (KotlinType kotlinType : CollectionsKt.x(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                Name name = typeParameterDescriptor.getName();
                Intrinsics.g(name, "getName(...)");
                sb2.append(Q(name, false));
                sb2.append(" : ");
                Intrinsics.e(kotlinType);
                sb2.append(Z(kotlinType));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(K("where"));
        sb.append(" ");
        CollectionsKt.L(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void l() {
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = AnnotationArgumentsRenderingPolicy.f;
        this.d.l();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void m() {
        this.d.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void n() {
        this.d.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void o(ClassifierNamePolicy classifierNamePolicy) {
        this.d.o(classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void p() {
        RenderingFormat renderingFormat = RenderingFormat.d;
        this.d.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public final String q(AnnotationDescriptor annotation, AnnotationUseSiteTarget annotationUseSiteTarget) {
        ClassConstructorDescriptor classConstructorDescriptorZ;
        List listH;
        Intrinsics.h(annotation, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.a() + ':');
        }
        KotlinType type = annotation.getType();
        sb.append(Z(type));
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        if (DescriptorRendererOptions.DefaultImpls.a(descriptorRendererOptionsImpl)) {
            Map mapB = annotation.b();
            EmptyList emptyList = null;
            ClassDescriptor classDescriptorD = ((Boolean) descriptorRendererOptionsImpl.I.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[33])).booleanValue() ? DescriptorUtilsKt.d(annotation) : null;
            if (classDescriptorD != null && (classConstructorDescriptorZ = classDescriptorD.z()) != null && (listH = classConstructorDescriptorZ.h()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listH) {
                    if (((ValueParameterDescriptor) obj).P()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ValueParameterDescriptor) it.next()).getName());
                }
                emptyList = arrayList2;
            }
            if (emptyList == null) {
                emptyList = EmptyList.d;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : emptyList) {
                if (!mapB.containsKey((Name) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((Name) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapB.entrySet();
            ArrayList arrayList5 = new ArrayList(CollectionsKt.s(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                Name name = (Name) entry.getKey();
                ConstantValue constantValue = (ConstantValue) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name.b());
                sb2.append(" = ");
                sb2.append(!emptyList.contains(name) ? C(constantValue) : "...");
                arrayList5.add(sb2.toString());
            }
            List listT0 = CollectionsKt.t0(CollectionsKt.c0(arrayList5, arrayList4));
            if (DescriptorRendererOptions.DefaultImpls.b(descriptorRendererOptionsImpl) || !listT0.isEmpty()) {
                CollectionsKt.L(listT0, sb, ", ", "(", ")", null, 112);
            }
        }
        if (x() && (KotlinTypeKt.a(type) || (type.J0().c() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final String s(String str) {
        return v().a(str);
    }

    public final Set t() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        return (Set) descriptorRendererOptionsImpl.e.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[3]);
    }

    public final boolean u() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        return ((Boolean) descriptorRendererOptionsImpl.f.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[4])).booleanValue();
    }

    public final RenderingFormat v() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        return (RenderingFormat) descriptorRendererOptionsImpl.D.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[28]);
    }

    public final DescriptorRenderer.ValueParametersHandler w() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        return (DescriptorRenderer.ValueParametersHandler) descriptorRendererOptionsImpl.C.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[27]);
    }

    public final boolean x() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        return ((Boolean) descriptorRendererOptionsImpl.j.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[8])).booleanValue();
    }

    public final String z(DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor declarationDescriptorE;
        Intrinsics.h(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.V(new RenderDeclarationDescriptorVisitor(), sb);
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.d;
        DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 descriptorRendererOptionsImpl$property$$inlined$vetoable$1 = descriptorRendererOptionsImpl.c;
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.Y;
        if (((Boolean) descriptorRendererOptionsImpl$property$$inlined$vetoable$1.getValue(descriptorRendererOptionsImpl, kPropertyArr[1])).booleanValue() && !(declarationDescriptor instanceof PackageFragmentDescriptor) && !(declarationDescriptor instanceof PackageViewDescriptor) && (declarationDescriptorE = declarationDescriptor.e()) != null && !(declarationDescriptorE instanceof ModuleDescriptor)) {
            sb.append(" ");
            int iOrdinal = v().ordinal();
            String strH = "defined in";
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                strH = a.h("<i>", "defined in", "</i>");
            }
            sb.append(strH);
            sb.append(" ");
            FqNameUnsafe fqNameUnsafeG = DescriptorUtils.g(declarationDescriptorE);
            Intrinsics.g(fqNameUnsafeG, "getFqName(...)");
            sb.append(fqNameUnsafeG.c() ? "root package" : I(fqNameUnsafeG));
            if (((Boolean) descriptorRendererOptionsImpl.d.getValue(descriptorRendererOptionsImpl, kPropertyArr[2])).booleanValue() && (declarationDescriptorE instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource)) {
                ((DeclarationDescriptorWithSource) declarationDescriptor).g().getClass();
            }
        }
        return sb.toString();
    }
}
