package com.fasterxml.jackson.databind.jdk14;

import YU.a;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NativeImageUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class JDK14Util {

    public static class CreatorLocator {

        /* renamed from: a, reason: collision with root package name */
        public final BeanDescription f14287a;
        public final DeserializationConfig b;
        public final AnnotationIntrospector c;
        public final List d;
        public final AnnotatedConstructor e;
        public final RawTypeName[] f;

        public CreatorLocator(BeanDescription beanDescription, DeserializationContext deserializationContext) {
            RawTypeName[] rawTypeNameArr;
            this.f14287a = beanDescription;
            DeserializationConfig deserializationConfig = deserializationContext.f;
            this.c = deserializationConfig.d();
            this.b = deserializationConfig;
            RuntimeException runtimeException = RecordAccessor.e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            RecordAccessor recordAccessor = RecordAccessor.d;
            Class cls = beanDescription.f14226a.d;
            Object[] objArrA = recordAccessor.a(cls);
            AnnotatedConstructor annotatedConstructorD = null;
            if (objArrA == null) {
                rawTypeNameArr = null;
            } else {
                rawTypeNameArr = new RawTypeName[objArrA.length];
                for (int i = 0; i < objArrA.length; i++) {
                    try {
                        try {
                            rawTypeNameArr[i] = new RawTypeName((Class) recordAccessor.c.invoke(objArrA[i], null), (String) recordAccessor.b.invoke(objArrA[i], null));
                        } catch (Exception e) {
                            throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(objArrA.length), ClassUtil.B(cls)), e);
                        }
                    } catch (Exception e2) {
                        throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(objArrA.length), ClassUtil.B(cls)), e2);
                    }
                }
            }
            this.f = rawTypeNameArr;
            if (rawTypeNameArr == null) {
                this.d = beanDescription.n();
                this.e = null;
                return;
            }
            int length = rawTypeNameArr.length;
            if (length != 0) {
                List listN = beanDescription.n();
                this.d = listN;
                Iterator it = listN.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnnotatedConstructor annotatedConstructor = (AnnotatedConstructor) it.next();
                    if (annotatedConstructor.g.getParameterCount() == length) {
                        for (int i2 = 0; i2 < length; i2++) {
                            if (!annotatedConstructor.u(i2).equals(this.f[i2].f14288a)) {
                                break;
                            }
                        }
                        annotatedConstructorD = annotatedConstructor;
                        break loop0;
                    }
                }
            } else {
                annotatedConstructorD = beanDescription.d();
                this.d = Collections.singletonList(annotatedConstructorD);
            }
            if (annotatedConstructorD == null) {
                throw new IllegalArgumentException("Failed to find the canonical Record constructor of type " + ClassUtil.t(this.f14287a.f14226a));
            }
            this.e = annotatedConstructorD;
        }
    }

    public static class RawTypeName {

        /* renamed from: a, reason: collision with root package name */
        public final Class f14288a;
        public final String b;

        public RawTypeName(Class cls, String str) {
            this.f14288a = cls;
            this.b = str;
        }
    }

    public static class RecordAccessor {
        public static final RecordAccessor d;
        public static final RuntimeException e;

        /* renamed from: a, reason: collision with root package name */
        public final Method f14289a;
        public final Method b;
        public final Method c;

        static {
            RecordAccessor recordAccessor = null;
            try {
                e = null;
                recordAccessor = new RecordAccessor();
            } catch (RuntimeException e2) {
                e = e2;
            }
            d = recordAccessor;
            e = e;
        }

        public RecordAccessor() throws ClassNotFoundException {
            try {
                this.f14289a = Class.class.getMethod("getRecordComponents", null);
                Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
                this.b = cls.getMethod("getName", null);
                this.c = cls.getMethod("getType", null);
            } catch (Exception e2) {
                throw new RuntimeException(a.i("Failed to access Methods needed to support `java.lang.Record`: (", e2.getClass().getName(), ") ", e2.getMessage()), e2);
            }
        }

        public final Object[] a(Class cls) {
            boolean zEquals;
            try {
                return (Object[]) this.f14289a.invoke(cls, null);
            } catch (Exception e2) {
                e = e2;
                if (NativeImageUtil.f14335a && "runtime".equals(System.getProperty("org.graalvm.nativeimage.imagecode"))) {
                    if (e instanceof InvocationTargetException) {
                        e = e.getCause();
                    }
                    zEquals = e.getClass().getName().equals("com.oracle.svm.core.jdk.UnsupportedFeatureError");
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    return null;
                }
                throw new IllegalArgumentException("Failed to access RecordComponents of type " + ClassUtil.B(cls));
            }
        }
    }

    public static AnnotatedConstructor a(DeserializationContext deserializationContext, BeanDescription beanDescription, ArrayList arrayList) {
        CreatorLocator creatorLocator = new CreatorLocator(beanDescription, deserializationContext);
        Iterator it = creatorLocator.d.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            AnnotatedConstructor annotatedConstructor = creatorLocator.e;
            if (!zHasNext) {
                RawTypeName[] rawTypeNameArr = creatorLocator.f;
                if (rawTypeNameArr == null) {
                    return null;
                }
                for (RawTypeName rawTypeName : rawTypeNameArr) {
                    arrayList.add(rawTypeName.b);
                }
                return annotatedConstructor;
            }
            AnnotatedConstructor annotatedConstructor2 = (AnnotatedConstructor) it.next();
            JsonCreator.Mode modeE = creatorLocator.c.e(creatorLocator.b, annotatedConstructor2);
            if (modeE != null && JsonCreator.Mode.g != modeE && (JsonCreator.Mode.e == modeE || annotatedConstructor2 != annotatedConstructor)) {
                return null;
            }
        }
    }

    public static String[] b(Class cls) {
        RuntimeException runtimeException = RecordAccessor.e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        RecordAccessor recordAccessor = RecordAccessor.d;
        Object[] objArrA = recordAccessor.a(cls);
        if (objArrA == null) {
            return null;
        }
        String[] strArr = new String[objArrA.length];
        for (int i = 0; i < objArrA.length; i++) {
            try {
                strArr[i] = (String) recordAccessor.b.invoke(objArrA[i], null);
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(objArrA.length), ClassUtil.B(cls)), e);
            }
        }
        return strArr;
    }
}
