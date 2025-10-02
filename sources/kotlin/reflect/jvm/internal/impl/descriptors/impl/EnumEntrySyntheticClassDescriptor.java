package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes7.dex */
public class EnumEntrySyntheticClassDescriptor extends ClassDescriptorBase {
    public final ClassTypeConstructorImpl j;
    public final MemberScope k;
    public final NotNullLazyValue l;
    public final Annotations m;

    public class EnumEntryScope extends MemberScopeImpl {
        public final MemoizedFunctionToNotNull b;
        public final MemoizedFunctionToNotNull c;
        public final NotNullLazyValue d;
        public final /* synthetic */ EnumEntrySyntheticClassDescriptor e;

        public EnumEntryScope(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, StorageManager storageManager) {
            if (storageManager == null) {
                h(0);
                throw null;
            }
            this.e = enumEntrySyntheticClassDescriptor;
            this.b = storageManager.g(new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Name name = (Name) obj;
                    if (name != null) {
                        EnumEntryScope enumEntryScope = EnumEntryScope.this;
                        return enumEntryScope.j(name, enumEntryScope.i().e(name, NoLookupLocation.i));
                    }
                    EnumEntryScope.h(8);
                    throw null;
                }
            });
            this.c = storageManager.g(new Function1<Name, Collection<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Name name = (Name) obj;
                    if (name != null) {
                        EnumEntryScope enumEntryScope = EnumEntryScope.this;
                        return enumEntryScope.j(name, enumEntryScope.i().b(name, NoLookupLocation.i));
                    }
                    EnumEntryScope.h(4);
                    throw null;
                }
            });
            this.d = storageManager.d(new Function0<Collection<DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    HashSet hashSet = new HashSet();
                    EnumEntryScope enumEntryScope = EnumEntryScope.this;
                    for (Name name : (Set) enumEntryScope.e.l.invoke()) {
                        NoLookupLocation noLookupLocation = NoLookupLocation.i;
                        hashSet.addAll(enumEntryScope.e(name, noLookupLocation));
                        hashSet.addAll(enumEntryScope.b(name, noLookupLocation));
                    }
                    return hashSet;
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.h(int):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set a() {
            Set set = (Set) this.e.l.invoke();
            if (set != null) {
                return set;
            }
            h(17);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection b(Name name, NoLookupLocation noLookupLocation) {
            if (name == null) {
                h(1);
                throw null;
            }
            Collection collection = (Collection) this.c.invoke(name);
            if (collection != null) {
                return collection;
            }
            h(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set c() {
            Set set = (Set) this.e.l.invoke();
            if (set != null) {
                return set;
            }
            h(19);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set d() {
            Set set = Collections.EMPTY_SET;
            if (set != null) {
                return set;
            }
            h(18);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection e(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                h(5);
                throw null;
            }
            Collection collection = (Collection) this.b.invoke(name);
            if (collection != null) {
                return collection;
            }
            h(7);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public final Collection g(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
            if (descriptorKindFilter == null) {
                h(13);
                throw null;
            }
            Collection collection = (Collection) this.d.invoke();
            if (collection != null) {
                return collection;
            }
            h(15);
            throw null;
        }

        public final MemberScope i() {
            MemberScope memberScopeS = ((KotlinType) ((AbstractTypeConstructor) this.e.m()).a().iterator().next()).s();
            if (memberScopeS != null) {
                return memberScopeS;
            }
            h(9);
            throw null;
        }

        public final LinkedHashSet j(Name name, Collection collection) {
            if (name == null) {
                h(10);
                throw null;
            }
            if (collection == null) {
                h(11);
                throw null;
            }
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.c.h(name, collection, Collections.EMPTY_SET, this.e, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.4
                public static /* synthetic */ void e(int i) {
                    Object[] objArr = new Object[3];
                    if (i == 1) {
                        objArr[0] = "fromSuper";
                    } else if (i != 2) {
                        objArr[0] = "fakeOverride";
                    } else {
                        objArr[0] = "fromCurrent";
                    }
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                    if (i == 1 || i == 2) {
                        objArr[2] = "conflict";
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
                    OverridingUtil.r(callableMemberDescriptor, null);
                    linkedHashSet.add(callableMemberDescriptor);
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumEntrySyntheticClassDescriptor(StorageManager storageManager, ClassDescriptor classDescriptor, SimpleType simpleType, Name name, NotNullLazyValue notNullLazyValue, Annotations annotations, SourceElement sourceElement) {
        super(storageManager, classDescriptor, name, sourceElement);
        if (storageManager == null) {
            E0(6);
            throw null;
        }
        if (classDescriptor == null) {
            E0(7);
            throw null;
        }
        if (simpleType == null) {
            E0(8);
            throw null;
        }
        if (name == null) {
            E0(9);
            throw null;
        }
        if (notNullLazyValue == null) {
            E0(10);
            throw null;
        }
        if (sourceElement == null) {
            E0(12);
            throw null;
        }
        this.m = annotations;
        this.j = new ClassTypeConstructorImpl(this, Collections.EMPTY_LIST, Collections.singleton(simpleType), storageManager);
        this.k = new EnumEntryScope(this, storageManager);
        this.l = notNullLazyValue;
    }

    public static /* synthetic */ void E0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static EnumEntrySyntheticClassDescriptor I0(StorageManager storageManager, ClassDescriptor classDescriptor, Name name, NotNullLazyValue notNullLazyValue, Annotations annotations, SourceElement sourceElement) {
        if (storageManager == null) {
            E0(0);
            throw null;
        }
        if (classDescriptor == null) {
            E0(1);
            throw null;
        }
        if (name == null) {
            E0(2);
            throw null;
        }
        if (notNullLazyValue == null) {
            E0(3);
            throw null;
        }
        if (sourceElement != null) {
            return new EnumEntrySyntheticClassDescriptor(storageManager, classDescriptor, classDescriptor.t(), name, notNullLazyValue, annotations, sourceElement);
        }
        E0(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean G0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassKind f() {
        return ClassKind.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ValueClassRepresentation f0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        Annotations annotations = this.m;
        if (annotations != null) {
            return annotations;
        }
        E0(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.e;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        E0(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean i() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean j0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality k() {
        return Modality.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean l0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor m() {
        ClassTypeConstructorImpl classTypeConstructorImpl = this.j;
        if (classTypeConstructorImpl != null) {
            return classTypeConstructorImpl;
        }
        E0(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection n() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        E0(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection o() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        E0(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope o0(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            E0(13);
            throw null;
        }
        MemberScope memberScope = this.k;
        if (memberScope != null) {
            return memberScope;
        }
        E0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean p0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope q0() {
        return MemberScope.Empty.b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassDescriptor r0() {
        return null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final List u() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        E0(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean w() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassConstructorDescriptor z() {
        return null;
    }
}
