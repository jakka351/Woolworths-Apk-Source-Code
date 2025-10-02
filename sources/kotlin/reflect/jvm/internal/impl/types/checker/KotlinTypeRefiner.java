package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes.dex */
public abstract class KotlinTypeRefiner extends AbstractTypeRefiner {

    public static final class Default extends KotlinTypeRefiner {

        /* renamed from: a, reason: collision with root package name */
        public static final Default f24625a = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final void b(ClassId classId) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final void c(ModuleDescriptor moduleDescriptor) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final void d(DeclarationDescriptor declarationDescriptor) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final Collection e(ClassDescriptor classDescriptor) {
            Intrinsics.h(classDescriptor, "classDescriptor");
            Collection collectionA = classDescriptor.m().a();
            Intrinsics.g(collectionA, "getSupertypes(...)");
            return collectionA;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        /* renamed from: f */
        public final KotlinType a(KotlinTypeMarker type) {
            Intrinsics.h(type, "type");
            return (KotlinType) type;
        }
    }

    public abstract void b(ClassId classId);

    public abstract void c(ModuleDescriptor moduleDescriptor);

    public abstract void d(DeclarationDescriptor declarationDescriptor);

    public abstract Collection e(ClassDescriptor classDescriptor);

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public abstract KotlinType a(KotlinTypeMarker kotlinTypeMarker);
}
