package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedAndMetadata;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AnnotatedAndMetadata annotatedAndMetadata = (AnnotatedAndMetadata) obj;
        return (((AnnotatedMethod) annotatedAndMetadata.f14268a).g.getParameterCount() == 1 && ((AnnotatedMethod) annotatedAndMetadata.f14268a).u(0) == String.class && annotatedAndMetadata.b != JsonCreator.Mode.f) ? false : true;
    }
}
