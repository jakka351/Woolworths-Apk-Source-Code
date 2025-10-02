package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;

/* loaded from: classes7.dex */
public final class DescriptorResolverUtils {
    public static /* synthetic */ void a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static ValueParameterDescriptor b(Name name, ClassDescriptor classDescriptor) {
        if (name == null) {
            a(19);
            throw null;
        }
        if (classDescriptor == null) {
            a(20);
            throw null;
        }
        Collection collectionN = classDescriptor.n();
        if (collectionN.size() != 1) {
            return null;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : ((ClassConstructorDescriptor) collectionN.iterator().next()).h()) {
            if (valueParameterDescriptor.getName().equals(name)) {
                return valueParameterDescriptor;
            }
        }
        return null;
    }

    public static LinkedHashSet c(Name name, Collection collection, Collection collection2, ClassDescriptor classDescriptor, final ErrorReporter errorReporter, OverridingUtil overridingUtil, final boolean z) {
        if (name == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (classDescriptor == null) {
            a(15);
            throw null;
        }
        if (errorReporter == null) {
            a(16);
            throw null;
        }
        if (overridingUtil == null) {
            a(17);
            throw null;
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.h(name, collection, collection2, classDescriptor, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.1
            public static /* synthetic */ void e(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i == 2) {
                    objArr[0] = "fromCurrent";
                } else if (i == 3) {
                    objArr[0] = "member";
                } else if (i != 4) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "overridden";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else if (i == 3 || i == 4) {
                    objArr[2] = "setOverriddenDescriptors";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
            public final void a(CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    e(0);
                    throw null;
                }
                OverridingUtil.r(callableMemberDescriptor, new Function1<CallableMemberDescriptor, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) obj;
                        if (callableMemberDescriptor2 == null) {
                            throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                        }
                        errorReporter.a(callableMemberDescriptor2);
                        return Unit.f24250a;
                    }
                });
                linkedHashSet.add(callableMemberDescriptor);
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
            public final void b(CallableMemberDescriptor callableMemberDescriptor, Collection collection3) {
                if (callableMemberDescriptor == null) {
                    e(3);
                    throw null;
                }
                if (!z || callableMemberDescriptor.f() == CallableMemberDescriptor.Kind.e) {
                    callableMemberDescriptor.Q(collection3);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
            public final void c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                if (callableMemberDescriptor2 != null) {
                    return;
                }
                e(2);
                throw null;
            }
        });
        return linkedHashSet;
    }

    public static LinkedHashSet d(Name name, AbstractCollection abstractCollection, Collection collection, ClassDescriptor classDescriptor, ErrorReporter errorReporter, OverridingUtil overridingUtil) {
        if (name == null) {
            a(0);
            throw null;
        }
        if (classDescriptor == null) {
            a(3);
            throw null;
        }
        if (errorReporter == null) {
            a(4);
            throw null;
        }
        if (overridingUtil != null) {
            return c(name, abstractCollection, collection, classDescriptor, errorReporter, overridingUtil, false);
        }
        a(5);
        throw null;
    }

    public static LinkedHashSet e(Name name, Collection collection, AbstractCollection abstractCollection, LazyJavaClassDescriptor lazyJavaClassDescriptor, ErrorReporter errorReporter, OverridingUtil overridingUtil) {
        if (name == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (lazyJavaClassDescriptor == null) {
            a(9);
            throw null;
        }
        if (errorReporter == null) {
            a(10);
            throw null;
        }
        if (overridingUtil != null) {
            return c(name, collection, abstractCollection, lazyJavaClassDescriptor, errorReporter, overridingUtil, true);
        }
        a(11);
        throw null;
    }
}
