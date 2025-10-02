package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes7.dex */
public final class AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 implements KotlinJvmBinaryClass.MemberVisitor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader f24458a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ KotlinJvmBinaryClass c;

    public final class AnnotationVisitorForMethod extends MemberAnnotationVisitor implements KotlinJvmBinaryClass.MethodAnnotationVisitor {
        public AnnotationVisitorForMethod(MemberSignature memberSignature) {
            super(memberSignature);
        }

        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor c(int i, ClassId classId, ReflectAnnotationSource reflectAnnotationSource) {
            MemberSignature memberSignatureE = MemberSignature.Companion.e(this.f24459a, i);
            AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 = AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.this;
            HashMap map = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.b;
            List arrayList = (List) map.get(memberSignatureE);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(memberSignatureE, arrayList);
            }
            return abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.f24458a.s(classId, reflectAnnotationSource, arrayList);
        }
    }

    public class MemberAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

        /* renamed from: a, reason: collision with root package name */
        public final MemberSignature f24459a;
        public final ArrayList b = new ArrayList();

        public MemberAnnotationVisitor(MemberSignature memberSignature) {
            this.f24459a = memberSignature;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
        public final void a() {
            ArrayList arrayList = this.b;
            if (arrayList.isEmpty()) {
                return;
            }
            AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.this.b.put(this.f24459a, arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId, ReflectAnnotationSource reflectAnnotationSource) {
            return AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.this.f24458a.s(classId, reflectAnnotationSource, this.b);
        }
    }

    public AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, HashMap map, KotlinJvmBinaryClass kotlinJvmBinaryClass, HashMap map2) {
        this.f24458a = abstractBinaryClassAnnotationAndConstantLoader;
        this.b = map;
        this.c = kotlinJvmBinaryClass;
    }

    public final MemberAnnotationVisitor a(Name name, String desc) {
        Intrinsics.h(desc, "desc");
        String strB = name.b();
        Intrinsics.g(strB, "asString(...)");
        return new MemberAnnotationVisitor(MemberSignature.Companion.a(strB, desc));
    }

    public final AnnotationVisitorForMethod b(Name name, String str) {
        Intrinsics.h(name, "name");
        String strB = name.b();
        Intrinsics.g(strB, "asString(...)");
        return new AnnotationVisitorForMethod(MemberSignature.Companion.d(strB, str));
    }
}
