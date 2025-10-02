package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;

/* loaded from: classes7.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24465a = new ArrayList();
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl b;
    public final /* synthetic */ Name c;
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor d;

    public BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, Name name, BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor abstractAnnotationArgumentVisitor) {
        this.b = binaryClassAnnotationAndConstantLoaderImpl;
        this.c = name;
        this.d = abstractAnnotationArgumentVisitor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void a() {
        Name name = this.c;
        this.d.g(this.f24465a, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void b(Object obj) {
        Object objC = ConstantValueFactory.c(obj, this.b.c);
        if (objC == null) {
            objC = ErrorValue.Companion.a("Unsupported annotation argument: " + this.c);
        }
        this.f24465a.add(objC);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor c(ClassId classId) {
        final ArrayList arrayList = new ArrayList();
        final BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 binaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1R = this.b.r(classId, SourceElement.f24343a, arrayList);
        return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1$visitAnnotation$1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 f24466a;
            public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 c;
            public final /* synthetic */ ArrayList d;

            {
                this.c = this;
                this.d = arrayList;
                this.f24466a = this.b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void a() {
                this.b.a();
                this.c.f24465a.add(new AnnotationValue((AnnotationDescriptor) CollectionsKt.n0(this.d)));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId2, Name name) {
                return this.f24466a.b(classId2, name);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void c(Name name, ClassId classId2, Name name2) {
                this.f24466a.h(name, new EnumValue(classId2, name2));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void d(Name name, ClassLiteralValue classLiteralValue) {
                this.f24466a.d(name, classLiteralValue);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void e(Object obj, Name name) {
                this.f24466a.e(obj, name);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
                return this.f24466a.f(name);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void d(ClassId classId, Name name) {
        this.f24465a.add(new EnumValue(classId, name));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void e(ClassLiteralValue classLiteralValue) {
        this.f24465a.add(new KClassValue(new KClassValue.Value.NormalClass(classLiteralValue)));
    }
}
