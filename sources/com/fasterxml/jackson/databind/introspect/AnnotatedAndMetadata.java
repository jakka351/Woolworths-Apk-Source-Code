package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.introspect.Annotated;

/* loaded from: classes4.dex */
public class AnnotatedAndMetadata<A extends Annotated, M> {

    /* renamed from: a, reason: collision with root package name */
    public final Annotated f14268a;
    public final Object b;

    public AnnotatedAndMetadata(AnnotatedWithParams annotatedWithParams, JsonCreator.Mode mode) {
        this.f14268a = annotatedWithParams;
        this.b = mode;
    }
}
