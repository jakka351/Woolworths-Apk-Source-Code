package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes7.dex */
public abstract class AbstractTypeParameterDescriptor extends DeclarationDescriptorNonRootImpl implements TypeParameterDescriptor {
    public final Variance h;
    public final boolean i;
    public final int j;
    public final NotNullLazyValue k;
    public final NotNullLazyValue l;
    public final StorageManager m;

    public class TypeParameterTypeConstructor extends AbstractTypeConstructor {
        public final SupertypeLoopChecker c;
        public final /* synthetic */ AbstractTypeParameterDescriptor d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypeParameterTypeConstructor(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
            super(storageManager);
            if (storageManager == null) {
                m(0);
                throw null;
            }
            this.d = abstractTypeParameterDescriptor;
            this.c = supertypeLoopChecker;
        }

        public static /* synthetic */ void m(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final ClassifierDescriptor c() {
            AbstractTypeParameterDescriptor abstractTypeParameterDescriptor = this.d;
            if (abstractTypeParameterDescriptor != null) {
                return abstractTypeParameterDescriptor;
            }
            m(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean d() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
        public final boolean e(ClassifierDescriptor classifierDescriptor) {
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                return DescriptorEquivalenceForOverrides.f24528a.b(this.d, (TypeParameterDescriptor) classifierDescriptor, true, DescriptorEquivalenceForOverrides$$Lambda$0.d);
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection f() {
            List listJ0 = this.d.J0();
            if (listJ0 != null) {
                return listJ0;
            }
            m(1);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final KotlinType g() {
            return ErrorUtils.c(ErrorTypeKind.j, new String[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            m(2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final SupertypeLoopChecker i() {
            SupertypeLoopChecker supertypeLoopChecker = this.c;
            if (supertypeLoopChecker != null) {
                return supertypeLoopChecker;
            }
            m(5);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final List k(List list) {
            List listH0 = this.d.H0(list);
            if (listH0 != null) {
                return listH0;
            }
            m(8);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final void l(KotlinType kotlinType) {
            if (kotlinType != null) {
                this.d.I0(kotlinType);
            } else {
                m(6);
                throw null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final KotlinBuiltIns p() {
            KotlinBuiltIns kotlinBuiltInsE = DescriptorUtilsKt.e(this.d);
            if (kotlinBuiltInsE != null) {
                return kotlinBuiltInsE;
            }
            m(4);
            throw null;
        }

        public final String toString() {
            return this.d.getName().d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeParameterDescriptor(final StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Annotations annotations, final Name name, Variance variance, boolean z, int i, final SupertypeLoopChecker supertypeLoopChecker) {
        super(declarationDescriptor, annotations, name, SourceElement.f24343a);
        if (storageManager == null) {
            n0(0);
            throw null;
        }
        if (declarationDescriptor == null) {
            n0(1);
            throw null;
        }
        if (annotations == null) {
            n0(2);
            throw null;
        }
        if (name == null) {
            n0(3);
            throw null;
        }
        if (variance == null) {
            n0(4);
            throw null;
        }
        if (supertypeLoopChecker == null) {
            n0(6);
            throw null;
        }
        this.h = variance;
        this.i = z;
        this.j = i;
        this.k = storageManager.d(new Function0<TypeConstructor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new TypeParameterTypeConstructor(AbstractTypeParameterDescriptor.this, storageManager, supertypeLoopChecker);
            }
        });
        this.l = storageManager.d(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TypeAttributes.e.getClass();
                TypeAttributes typeAttributes = TypeAttributes.f;
                TypeConstructor typeConstructorM = AbstractTypeParameterDescriptor.this.m();
                return KotlinTypeFactory.e(Collections.EMPTY_LIST, new LazyScopeAdapter(LockBasedStorageManager.e, new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.2.1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("Scope for type parameter ");
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        sb.append(name.b());
                        return TypeIntersectionScope.Companion.a(sb.toString(), AbstractTypeParameterDescriptor.this.getUpperBounds());
                    }
                }), typeAttributes, typeConstructorM, false);
            }
        });
        this.m = storageManager;
    }

    public static /* synthetic */ void n0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean E() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* renamed from: E0 */
    public final DeclarationDescriptorWithSource a() {
        return this;
    }

    public List H0(List list) {
        return list;
    }

    public abstract void I0(KotlinType kotlinType);

    public abstract List J0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.m(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final ClassifierDescriptor a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final StorageManager d0() {
        StorageManager storageManager = this.m;
        if (storageManager != null) {
            return storageManager;
        }
        n0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final int getIndex() {
        return this.j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final List getUpperBounds() {
        List listA = ((TypeParameterTypeConstructor) m()).a();
        if (listA != null) {
            return listA;
        }
        n0(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final Variance j() {
        Variance variance = this.h;
        if (variance != null) {
            return variance;
        }
        n0(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor m() {
        TypeConstructor typeConstructor = (TypeConstructor) this.k.invoke();
        if (typeConstructor != null) {
            return typeConstructor;
        }
        n0(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final SimpleType t() {
        SimpleType simpleType = (SimpleType) this.l.invoke();
        if (simpleType != null) {
            return simpleType;
        }
        n0(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean x() {
        return this.i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final TypeParameterDescriptor a() {
        return this;
    }
}
