package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes.dex */
public abstract class ClassDescriptorBase extends AbstractClassDescriptor {
    public final DeclarationDescriptor h;
    public final SourceElement i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDescriptorBase(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Name name, SourceElement sourceElement) {
        super(storageManager, name);
        if (storageManager == null) {
            E0(0);
            throw null;
        }
        if (declarationDescriptor == null) {
            E0(1);
            throw null;
        }
        if (name == null) {
            E0(2);
            throw null;
        }
        if (sourceElement == null) {
            E0(3);
            throw null;
        }
        this.h = declarationDescriptor;
        this.i = sourceElement;
    }

    public static /* synthetic */ void E0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor e() {
        DeclarationDescriptor declarationDescriptor = this.h;
        if (declarationDescriptor != null) {
            return declarationDescriptor;
        }
        E0(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement g() {
        SourceElement sourceElement = this.i;
        if (sourceElement != null) {
            return sourceElement;
        }
        E0(5);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }
}
