package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes7.dex */
public class TypeParameterDescriptorImpl extends AbstractTypeParameterDescriptor {
    public final ArrayList n;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeParameterDescriptorImpl(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z, Variance variance, Name name, int i, StorageManager storageManager) {
        super(storageManager, declarationDescriptor, annotations, name, variance, z, i, SupertypeLoopChecker.EMPTY.f24345a);
        if (declarationDescriptor == null) {
            n0(19);
            throw null;
        }
        if (annotations == null) {
            n0(20);
            throw null;
        }
        if (variance == null) {
            n0(21);
            throw null;
        }
        if (name == null) {
            n0(22);
            throw null;
        }
        if (storageManager == null) {
            n0(25);
            throw null;
        }
        this.n = new ArrayList(1);
        this.o = false;
    }

    public static TypeParameterDescriptorImpl K0(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z, Variance variance, Name name, int i, StorageManager storageManager) {
        if (declarationDescriptor == null) {
            n0(6);
            throw null;
        }
        if (annotations == null) {
            n0(7);
            throw null;
        }
        if (variance == null) {
            n0(8);
            throw null;
        }
        if (name == null) {
            n0(9);
            throw null;
        }
        if (storageManager != null) {
            return new TypeParameterDescriptorImpl(declarationDescriptor, annotations, z, variance, name, i, storageManager);
        }
        n0(11);
        throw null;
    }

    public static TypeParameterDescriptorImpl L0(AbstractClassDescriptor abstractClassDescriptor, Variance variance, Name name, int i, StorageManager storageManager) {
        if (storageManager == null) {
            n0(4);
            throw null;
        }
        TypeParameterDescriptorImpl typeParameterDescriptorImplK0 = K0(abstractClassDescriptor, Annotations.Companion.f24350a, false, variance, name, i, storageManager);
        SimpleType simpleTypeN = DescriptorUtilsKt.e(abstractClassDescriptor).n();
        if (typeParameterDescriptorImplK0.o) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + typeParameterDescriptorImplK0.M0());
        }
        if (!KotlinTypeKt.a(simpleTypeN)) {
            typeParameterDescriptorImplK0.n.add(simpleTypeN);
        }
        if (!typeParameterDescriptorImplK0.o) {
            typeParameterDescriptorImplK0.o = true;
            return typeParameterDescriptorImplK0;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + typeParameterDescriptorImplK0.M0());
    }

    public static /* synthetic */ void n0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final void I0(KotlinType kotlinType) {
        if (kotlinType != null) {
            return;
        }
        n0(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final List J0() {
        if (!this.o) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + M0());
        }
        ArrayList arrayList = this.n;
        if (arrayList != null) {
            return arrayList;
        }
        n0(28);
        throw null;
    }

    public final String M0() {
        return getName() + " declared in " + DescriptorUtils.g(e());
    }
}
