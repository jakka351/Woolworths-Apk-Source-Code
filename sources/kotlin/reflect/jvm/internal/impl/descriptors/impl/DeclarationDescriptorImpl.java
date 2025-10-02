package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* loaded from: classes.dex */
public abstract class DeclarationDescriptorImpl extends AnnotatedImpl implements DeclarationDescriptor {
    public final Name e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeclarationDescriptorImpl(Annotations annotations, Name name) {
        super(annotations);
        if (annotations == null) {
            n0(0);
            throw null;
        }
        if (name == null) {
            n0(1);
            throw null;
        }
        this.e = name;
    }

    public static /* synthetic */ void n0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String o0(DeclarationDescriptor declarationDescriptor) {
        try {
            String str = DescriptorRenderer.c.z(declarationDescriptor) + "[" + declarationDescriptor.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(declarationDescriptor)) + "]";
            if (str != null) {
                return str;
            }
            n0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = declarationDescriptor.getClass().getSimpleName() + " " + declarationDescriptor.getName();
            if (str2 != null) {
                return str2;
            }
            n0(6);
            throw null;
        }
    }

    public DeclarationDescriptor a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final Name getName() {
        Name name = this.e;
        if (name != null) {
            return name;
        }
        n0(2);
        throw null;
    }

    public String toString() {
        return o0(this);
    }
}
