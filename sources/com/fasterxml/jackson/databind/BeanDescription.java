package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.util.Annotations;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class BeanDescription {

    /* renamed from: a, reason: collision with root package name */
    public final JavaType f14226a;

    public BeanDescription(JavaType javaType) {
        this.f14226a = javaType;
    }

    public abstract AnnotatedMember a();

    public abstract AnnotatedMember b();

    public abstract ArrayList c();

    public abstract AnnotatedConstructor d();

    public abstract Class[] e();

    public abstract JsonFormat.Value f();

    public abstract Map g();

    public abstract AnnotatedMember h();

    public abstract AnnotatedMethod i(String str, Class[] clsArr);

    public abstract List j();

    public abstract JsonInclude.Value k(JsonInclude.Value value);

    public abstract Annotations l();

    public abstract AnnotatedClass m();

    public abstract List n();

    public abstract List o();

    public abstract Set p();

    public abstract ObjectIdInfo q();

    public abstract boolean r();

    public abstract Object s(boolean z);
}
