package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/* loaded from: classes4.dex */
public abstract class Annotated {
    public abstract AnnotatedElement b();

    public abstract Annotation c(Class cls);

    public abstract String d();

    public abstract Class e();

    public abstract boolean equals(Object obj);

    public abstract JavaType f();

    public abstract int hashCode();

    public abstract String toString();
}
