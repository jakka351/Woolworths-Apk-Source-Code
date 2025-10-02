package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class CreatorCollector {
    public static final String[] j = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};

    /* renamed from: a, reason: collision with root package name */
    public final BeanDescription f14244a;
    public final boolean b;
    public final boolean c;
    public final AnnotatedWithParams[] d = new AnnotatedWithParams[11];
    public int e = 0;
    public boolean f = false;
    public SettableBeanProperty[] g;
    public SettableBeanProperty[] h;
    public SettableBeanProperty[] i;

    public CreatorCollector(BeanDescription beanDescription, MapperConfig mapperConfig) {
        this.f14244a = beanDescription;
        mapperConfig.getClass();
        this.b = mapperConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
        this.c = mapperConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public final JavaType a(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) {
        if (!this.f || annotatedWithParams == null) {
            return null;
        }
        int i = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (settableBeanPropertyArr[i2] == null) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        MapperConfig mapperConfig = deserializationContext.f;
        JavaType javaTypeT = annotatedWithParams.t(i);
        AnnotationIntrospector annotationIntrospectorD = mapperConfig.d();
        AnnotatedParameter annotatedParameterR = annotatedWithParams.r(i);
        Object objJ = annotationIntrospectorD.j(annotatedParameterR);
        return objJ != null ? javaTypeT.O(deserializationContext.m(annotatedParameterR, objJ)) : annotationIntrospectorD.t0(mapperConfig, annotatedParameterR, javaTypeT);
    }

    public final void b(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr, int i) {
        if (annotatedWithParams.t(i).x()) {
            if (e(annotatedWithParams, 10, z)) {
                this.h = settableBeanPropertyArr;
            }
        } else if (e(annotatedWithParams, 8, z)) {
            this.g = settableBeanPropertyArr;
        }
    }

    public final void c(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        if (e(annotatedWithParams, 9, z)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap map = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i = 0; i < length; i++) {
                    String str = settableBeanPropertyArr[i].f.d;
                    if ((!str.isEmpty() || settableBeanPropertyArr[i].n() == null) && (num = (Integer) map.put(str, Integer.valueOf(i))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", str, num, Integer.valueOf(i), ClassUtil.B(this.f14244a.f14226a.d)));
                    }
                }
            }
            this.i = settableBeanPropertyArr;
        }
    }

    public final StdValueInstantiator d(DeserializationContext deserializationContext) {
        AnnotatedWithParams[] annotatedWithParamsArr = this.d;
        JavaType javaTypeA = a(deserializationContext, annotatedWithParamsArr[8], this.g);
        JavaType javaTypeA2 = a(deserializationContext, annotatedWithParamsArr[10], this.h);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(this.f14244a.f14226a);
        AnnotatedWithParams annotatedWithParams = annotatedWithParamsArr[0];
        AnnotatedWithParams annotatedWithParams2 = annotatedWithParamsArr[8];
        SettableBeanProperty[] settableBeanPropertyArr = this.g;
        AnnotatedWithParams annotatedWithParams3 = annotatedWithParamsArr[9];
        SettableBeanProperty[] settableBeanPropertyArr2 = this.i;
        stdValueInstantiator.f = annotatedWithParams;
        stdValueInstantiator.j = annotatedWithParams2;
        stdValueInstantiator.i = javaTypeA;
        stdValueInstantiator.k = settableBeanPropertyArr;
        stdValueInstantiator.g = annotatedWithParams3;
        stdValueInstantiator.h = settableBeanPropertyArr2;
        AnnotatedWithParams annotatedWithParams4 = annotatedWithParamsArr[10];
        SettableBeanProperty[] settableBeanPropertyArr3 = this.h;
        stdValueInstantiator.m = annotatedWithParams4;
        stdValueInstantiator.l = javaTypeA2;
        stdValueInstantiator.n = settableBeanPropertyArr3;
        stdValueInstantiator.o = annotatedWithParamsArr[1];
        stdValueInstantiator.p = annotatedWithParamsArr[2];
        stdValueInstantiator.q = annotatedWithParamsArr[3];
        stdValueInstantiator.r = annotatedWithParamsArr[4];
        stdValueInstantiator.s = annotatedWithParamsArr[5];
        stdValueInstantiator.t = annotatedWithParamsArr[6];
        stdValueInstantiator.u = annotatedWithParamsArr[7];
        return stdValueInstantiator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        if (r4.isPrimitive() != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r13, int r14, boolean r15) throws java.lang.SecurityException {
        /*
            r12 = this;
            r0 = 1
            int r1 = r0 << r14
            r12.f = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] r2 = r12.d
            r3 = r2[r14]
            if (r3 == 0) goto Lb4
            int r4 = r12.e
            r4 = r4 & r1
            r5 = 0
            if (r4 == 0) goto L17
            if (r15 != 0) goto L15
            goto La0
        L15:
            r4 = r0
            goto L19
        L17:
            r4 = r15 ^ 1
        L19:
            if (r4 == 0) goto Lb4
            java.lang.Class r4 = r3.getClass()
            java.lang.Class r6 = r13.getClass()
            if (r4 != r6) goto Lb4
            java.lang.Class r4 = r3.u(r5)
            java.lang.Class r6 = r13.u(r5)
            java.lang.String r7 = "implicitly discovered"
            java.lang.String r8 = "explicitly marked"
            java.lang.String[] r9 = com.fasterxml.jackson.databind.deser.impl.CreatorCollector.j
            java.lang.String r10 = "Conflicting %s creators: already had %s creator %s, encountered another: %s"
            if (r4 != r6) goto L82
            java.lang.Class r4 = r13.h()
            java.lang.annotation.Annotation[] r6 = com.fasterxml.jackson.databind.util.ClassUtil.f14330a
            java.lang.Class<java.lang.Enum> r6 = java.lang.Enum.class
            boolean r4 = r6.isAssignableFrom(r4)
            java.lang.String r11 = "valueOf"
            if (r4 == 0) goto L53
            java.lang.String r4 = r13.d()
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L53
            r4 = r0
            goto L54
        L53:
            r4 = r5
        L54:
            if (r4 == 0) goto L57
            goto La0
        L57:
            java.lang.Class r4 = r3.h()
            boolean r4 = r6.isAssignableFrom(r4)
            if (r4 == 0) goto L6c
            java.lang.String r4 = r3.d()
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L6c
            r5 = r0
        L6c:
            if (r5 == 0) goto L6f
            goto Lb4
        L6f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r14 = r9[r14]
            if (r15 == 0) goto L76
            r7 = r8
        L76:
            java.lang.Object[] r13 = new java.lang.Object[]{r14, r7, r3, r13}
            java.lang.String r13 = java.lang.String.format(r10, r13)
            r0.<init>(r13)
            throw r0
        L82:
            boolean r11 = r6.isAssignableFrom(r4)
            if (r11 == 0) goto L89
            goto La0
        L89:
            boolean r11 = r4.isAssignableFrom(r6)
            if (r11 == 0) goto L90
            goto Lb4
        L90:
            boolean r11 = r4.isPrimitive()
            boolean r6 = r6.isPrimitive()
            if (r11 == r6) goto La1
            boolean r3 = r4.isPrimitive()
            if (r3 == 0) goto Lb4
        La0:
            return r5
        La1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r14 = r9[r14]
            if (r15 == 0) goto La8
            r7 = r8
        La8:
            java.lang.Object[] r13 = new java.lang.Object[]{r14, r7, r3, r13}
            java.lang.String r13 = java.lang.String.format(r10, r13)
            r0.<init>(r13)
            throw r0
        Lb4:
            if (r15 == 0) goto Lbb
            int r15 = r12.e
            r15 = r15 | r1
            r12.e = r15
        Lbb:
            if (r13 == 0) goto Lcc
            boolean r15 = r12.b
            if (r15 == 0) goto Lcc
            java.lang.reflect.AnnotatedElement r15 = r13.b()
            java.lang.reflect.Member r15 = (java.lang.reflect.Member) r15
            boolean r1 = r12.c
            com.fasterxml.jackson.databind.util.ClassUtil.e(r15, r1)
        Lcc:
            r2[r14] = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.CreatorCollector.e(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int, boolean):boolean");
    }
}
