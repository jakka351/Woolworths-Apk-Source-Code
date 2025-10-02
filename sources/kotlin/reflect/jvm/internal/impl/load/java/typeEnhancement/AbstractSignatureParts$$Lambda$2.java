package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* loaded from: classes7.dex */
class AbstractSignatureParts$$Lambda$2 implements Function1 {
    public final AbstractSignatureParts d;
    public final TypeSystemContext e;

    public AbstractSignatureParts$$Lambda$2(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext) {
        this.d = abstractSignatureParts;
        this.e = typeSystemContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TypeConstructor typeConstructorA;
        AbstractSignatureParts.TypeAndDefaultQualifiers it = (AbstractSignatureParts.TypeAndDefaultQualifiers) obj;
        Intrinsics.h(it, "it");
        JavaTypeQualifiersByElementType javaTypeQualifiersByElementType = it.b;
        KotlinTypeMarker kotlinTypeMarker = it.f24442a;
        AbstractSignatureParts abstractSignatureParts = this.d;
        boolean zP = abstractSignatureParts.p();
        TypeSystemContext typeSystemContext = this.e;
        if ((zP && kotlinTypeMarker != null && typeSystemContext.h(kotlinTypeMarker)) || kotlinTypeMarker == null || (typeConstructorA = typeSystemContext.A(kotlinTypeMarker)) == null) {
            return null;
        }
        List listM0 = typeSystemContext.m0(typeConstructorA);
        List listX = typeSystemContext.X(kotlinTypeMarker);
        Iterator it2 = listM0.iterator();
        Iterator it3 = listX.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.s(listM0, 10), CollectionsKt.s(listX, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            TypeParameterMarker typeParameterMarker = (TypeParameterMarker) it2.next();
            UnwrappedType unwrappedTypeO = typeSystemContext.O((TypeArgumentMarker) it3.next());
            arrayList.add(unwrappedTypeO == null ? new AbstractSignatureParts.TypeAndDefaultQualifiers(null, javaTypeQualifiersByElementType, typeParameterMarker) : new AbstractSignatureParts.TypeAndDefaultQualifiers(unwrappedTypeO, abstractSignatureParts.d().b(javaTypeQualifiersByElementType, abstractSignatureParts.e(unwrappedTypeO)), typeParameterMarker));
        }
        return arrayList;
    }
}
