package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class AbstractSignatureParts<TAnnotation> {

    public static final class TypeAndDefaultQualifiers {

        /* renamed from: a, reason: collision with root package name */
        public final KotlinTypeMarker f24442a;
        public final JavaTypeQualifiersByElementType b;
        public final TypeParameterMarker c;

        public TypeAndDefaultQualifiers(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, TypeParameterMarker typeParameterMarker) {
            this.f24442a = kotlinTypeMarker;
            this.b = javaTypeQualifiersByElementType;
            this.c = typeParameterMarker;
        }
    }

    public static void b(Object obj, ArrayList arrayList, Function1 function1) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) ((AbstractSignatureParts$$Lambda$2) function1).invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b(it.next(), arrayList, function1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.jvm.functions.Function1 a(kotlin.reflect.jvm.internal.impl.types.KotlinType r22, java.lang.Iterable r23, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.a(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo, boolean):kotlin.jvm.functions.Function1");
    }

    public abstract boolean c(Object obj, KotlinTypeMarker kotlinTypeMarker);

    public abstract AnnotationTypeQualifierResolver d();

    public abstract Annotations e(KotlinTypeMarker kotlinTypeMarker);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus f(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r5) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.f(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    public abstract Iterable g();

    public abstract AnnotationQualifierApplicabilityType h();

    public abstract JavaTypeQualifiersByElementType i();

    public abstract boolean j();

    public abstract NullabilityQualifierWithMigrationStatus k(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus);

    public abstract boolean l();

    public abstract KotlinType m(KotlinTypeMarker kotlinTypeMarker);

    public abstract FqNameUnsafe n(RigidTypeMarker rigidTypeMarker);

    public final NullabilityQualifier o(KotlinTypeMarker kotlinTypeMarker) {
        SimpleClassicTypeSystemContext simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.f24629a;
        if (ClassicTypeSystemContext.DefaultImpls.G(simpleClassicTypeSystemContext.M(kotlinTypeMarker))) {
            return NullabilityQualifier.e;
        }
        if (ClassicTypeSystemContext.DefaultImpls.G(simpleClassicTypeSystemContext.i(kotlinTypeMarker))) {
            return null;
        }
        return NullabilityQualifier.f;
    }

    public abstract boolean p();

    public abstract boolean q(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean r();

    public abstract boolean s(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean t(TypeParameterMarker typeParameterMarker);

    public boolean u(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.h(kotlinTypeMarker, "<this>");
        return false;
    }

    public final ArrayList v(KotlinTypeMarker kotlinTypeMarker) {
        TypeAndDefaultQualifiers typeAndDefaultQualifiers = new TypeAndDefaultQualifiers(kotlinTypeMarker, d().b(i(), e(kotlinTypeMarker)), null);
        AbstractSignatureParts$$Lambda$2 abstractSignatureParts$$Lambda$2 = new AbstractSignatureParts$$Lambda$2(this, SimpleClassicTypeSystemContext.f24629a);
        ArrayList arrayList = new ArrayList(1);
        b(typeAndDefaultQualifiers, arrayList, abstractSignatureParts$$Lambda$2);
        return arrayList;
    }
}
