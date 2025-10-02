package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Named;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class BeanPropertyDefinition implements Named {
    public static final JsonInclude.Value d = JsonInclude.Value.h;

    public boolean A(PropertyName propertyName) {
        return b().equals(propertyName);
    }

    public abstract boolean B();

    public abstract boolean C();

    public boolean D() {
        return C();
    }

    public boolean E() {
        return false;
    }

    public abstract PropertyName b();

    public boolean e() {
        Annotated annotatedQ = q();
        if (annotatedQ == null && (annotatedQ = w()) == null) {
            annotatedQ = s();
        }
        return annotatedQ != null;
    }

    public boolean f() {
        return p() != null;
    }

    public abstract PropertyMetadata getMetadata();

    public abstract JsonInclude.Value l();

    public ObjectIdInfo m() {
        return null;
    }

    public AnnotationIntrospector.ReferenceProperty n() {
        return null;
    }

    public Class[] o() {
        return null;
    }

    public final AnnotatedMember p() {
        AnnotatedMethod annotatedMethodT = t();
        return annotatedMethodT == null ? s() : annotatedMethodT;
    }

    public abstract AnnotatedParameter q();

    public Iterator r() {
        return ClassUtil.c;
    }

    public abstract AnnotatedField s();

    public abstract AnnotatedMethod t();

    public abstract JavaType u();

    public abstract Class v();

    public abstract AnnotatedMethod w();

    public abstract PropertyName x();

    public abstract boolean y();

    public abstract boolean z();
}
