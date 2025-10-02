package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {
    public final ModuleDescriptorImpl c;
    public final NotFoundClasses d;
    public final AnnotationDeserializer e;
    public MetadataVersion f;

    /* loaded from: classes7.dex */
    public abstract class AbstractAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public AbstractAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId, final Name name) {
            final ArrayList arrayList = new ArrayList();
            final BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 binaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1R = BinaryClassAnnotationAndConstantLoaderImpl.this.r(classId, SourceElement.f24343a, arrayList);
            return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitAnnotation$1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 f24464a;
                public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor c;
                public final /* synthetic */ Name d;
                public final /* synthetic */ ArrayList e;

                {
                    this.c = this;
                    this.d = name;
                    this.e = arrayList;
                    this.f24464a = this.b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final void a() {
                    this.b.a();
                    this.c.h(this.d, new AnnotationValue((AnnotationDescriptor) CollectionsKt.n0(this.e)));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId2, Name name2) {
                    return this.f24464a.b(classId2, name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final void c(Name name2, ClassId classId2, Name name3) {
                    this.f24464a.h(name2, new EnumValue(classId2, name3));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final void d(Name name2, ClassLiteralValue classLiteralValue) {
                    this.f24464a.d(name2, classLiteralValue);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final void e(Object obj, Name name2) {
                    this.f24464a.e(obj, name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name2) {
                    return this.f24464a.f(name2);
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void c(Name name, ClassId classId, Name name2) {
            h(name, new EnumValue(classId, name2));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void d(Name name, ClassLiteralValue classLiteralValue) {
            h(name, new KClassValue(new KClassValue.Value.NormalClass(classLiteralValue)));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void e(Object obj, Name name) {
            ConstantValue constantValueC = ConstantValueFactory.c(obj, BinaryClassAnnotationAndConstantLoaderImpl.this.c);
            if (constantValueC == null) {
                constantValueC = ErrorValue.Companion.a("Unsupported annotation argument: " + name);
            }
            h(name, constantValueC);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
            return new BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl.this, name, this);
        }

        public abstract void g(ArrayList arrayList, Name name);

        public abstract void h(Name name, ConstantValue constantValue);
    }

    public BinaryClassAnnotationAndConstantLoaderImpl(ModuleDescriptorImpl moduleDescriptorImpl, NotFoundClasses notFoundClasses, LockBasedStorageManager lockBasedStorageManager, ReflectKotlinClassFinder reflectKotlinClassFinder) {
        super(lockBasedStorageManager, reflectKotlinClassFinder);
        this.c = moduleDescriptorImpl;
        this.d = notFoundClasses;
        this.e = new AnnotationDeserializer(moduleDescriptorImpl, notFoundClasses);
        this.f = MetadataVersion.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public final MetadataVersion p() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public final BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 r(ClassId classId, SourceElement sourceElement, List result) {
        Intrinsics.h(result, "result");
        return new BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1(this, FindClassInModuleKt.c(this.c, classId, this.d), classId, result, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public final ConstantValue v(Object obj) {
        ConstantValue constantValue = (ConstantValue) obj;
        return constantValue instanceof ByteValue ? new UByteValue(((Number) ((ByteValue) constantValue).b()).byteValue()) : constantValue instanceof ShortValue ? new UShortValue(((Number) ((ShortValue) constantValue).b()).shortValue()) : constantValue instanceof IntValue ? new UIntValue(((Number) ((IntValue) constantValue).b()).intValue()) : constantValue instanceof LongValue ? new ULongValue(((Number) ((LongValue) constantValue).b()).longValue()) : constantValue;
    }
}
