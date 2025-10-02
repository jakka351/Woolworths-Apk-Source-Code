package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes.dex */
public class ClassTypeConstructorImpl extends AbstractClassTypeConstructor {
    public final ModuleAwareClassDescriptor c;
    public final List d;
    public final Collection e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassTypeConstructorImpl(ModuleAwareClassDescriptor moduleAwareClassDescriptor, List list, Collection collection, StorageManager storageManager) {
        super(storageManager);
        if (list == null) {
            m(1);
            throw null;
        }
        if (collection == null) {
            m(2);
            throw null;
        }
        if (storageManager == null) {
            m(3);
            throw null;
        }
        this.c = moduleAwareClassDescriptor;
        this.d = Collections.unmodifiableList(new ArrayList(list));
        this.e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void m(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean d() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection f() {
        Collection collection = this.e;
        if (collection != null) {
            return collection;
        }
        m(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        List list = this.d;
        if (list != null) {
            return list;
        }
        m(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final SupertypeLoopChecker i() {
        return SupertypeLoopChecker.EMPTY.f24345a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: n */
    public final ClassDescriptor c() {
        ModuleAwareClassDescriptor moduleAwareClassDescriptor = this.c;
        if (moduleAwareClassDescriptor != null) {
            return moduleAwareClassDescriptor;
        }
        m(5);
        throw null;
    }

    public final String toString() {
        return DescriptorUtils.g(this.c).f24501a;
    }
}
