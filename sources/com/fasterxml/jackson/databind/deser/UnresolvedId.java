package com.fasterxml.jackson.databind.deser;

import YU.a;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;

/* loaded from: classes4.dex */
public class UnresolvedId {
    public final String toString() {
        Annotation[] annotationArr = ClassUtil.f14330a;
        return a.h("Object id [null] (for ", "[null]", ") at null");
    }
}
