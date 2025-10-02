package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/* loaded from: classes2.dex */
public final class Retrofit {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f27003a = new ConcurrentHashMap();
    public final Call.Factory b;
    public final HttpUrl c;
    public final List d;
    public final List e;
    public final Executor f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Call.Factory f27005a;
        public HttpUrl b;
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();

        public final void a(RxJava2CallAdapterFactory rxJava2CallAdapterFactory) {
            this.d.add(rxJava2CallAdapterFactory);
        }

        public final void b(String str) throws NumberFormatException {
            Objects.requireNonNull(str, "baseUrl == null");
            HttpUrl.j.getClass();
            HttpUrl httpUrlC = HttpUrl.Companion.c(str);
            if ("".equals(httpUrlC.f.get(r0.size() - 1))) {
                this.b = httpUrlC;
            } else {
                throw new IllegalArgumentException("baseUrl must end in /: " + httpUrlC);
            }
        }

        public final Retrofit c() {
            if (this.b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory okHttpClient = this.f27005a;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            Call.Factory factory = okHttpClient;
            Executor executor = Platform.f26998a;
            BuiltInFactories builtInFactories = Platform.c;
            ArrayList arrayList = new ArrayList(this.d);
            List listA = builtInFactories.a(executor);
            arrayList.addAll(listA);
            List listB = builtInFactories.b();
            int size = listB.size();
            ArrayList arrayList2 = this.c;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
            arrayList3.add(new BuiltInConverters());
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(listB);
            HttpUrl httpUrl = this.b;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            listA.size();
            return new Retrofit(factory, httpUrl, listUnmodifiableList, listUnmodifiableList2, executor);
        }
    }

    public Retrofit(Call.Factory factory, HttpUrl httpUrl, List list, List list2, Executor executor) {
        this.b = factory;
        this.c = httpUrl;
        this.d = list;
        this.e = list2;
        this.f = executor;
    }

    public final CallAdapter a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            CallAdapter callAdapterA = ((CallAdapter.Factory) list.get(i)).a(type, annotationArr);
            if (callAdapterA != null) {
                return callAdapterA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((CallAdapter.Factory) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final Object b(final Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: retrofit2.Retrofit.1

            /* renamed from: a, reason: collision with root package name */
            public final Object[] f27004a = new Object[0];

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
            
                r2 = retrofit2.ServiceMethod.b(r1, r0, r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
            
                r1.f27003a.put(r6, r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0065, code lost:
            
                r6 = (retrofit2.ServiceMethod) r3;
             */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.reflect.InvocationHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r5, java.lang.reflect.Method r6, java.lang.Object[] r7) {
                /*
                    r4 = this;
                    java.lang.Class r0 = r2
                    java.lang.Class r1 = r6.getDeclaringClass()
                    java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                    if (r1 != r2) goto Lf
                    java.lang.Object r5 = r6.invoke(r4, r7)
                    return r5
                Lf:
                    if (r7 == 0) goto L12
                    goto L14
                L12:
                    java.lang.Object[] r7 = r4.f27004a
                L14:
                    retrofit2.Reflection r1 = retrofit2.Platform.b
                    boolean r2 = r1.c(r6)
                    if (r2 == 0) goto L21
                    java.lang.Object r5 = r1.b(r6, r0, r5, r7)
                    return r5
                L21:
                    retrofit2.Retrofit r1 = retrofit2.Retrofit.this
                L23:
                    java.util.concurrent.ConcurrentHashMap r2 = r1.f27003a
                    java.lang.Object r2 = r2.get(r6)
                    boolean r3 = r2 instanceof retrofit2.ServiceMethod
                    if (r3 == 0) goto L30
                    retrofit2.ServiceMethod r2 = (retrofit2.ServiceMethod) r2
                    goto L6a
                L30:
                    if (r2 != 0) goto L58
                    java.lang.Object r3 = new java.lang.Object
                    r3.<init>()
                    monitor-enter(r3)
                    java.util.concurrent.ConcurrentHashMap r2 = r1.f27003a     // Catch: java.lang.Throwable -> L4b
                    java.lang.Object r2 = r2.putIfAbsent(r6, r3)     // Catch: java.lang.Throwable -> L4b
                    if (r2 != 0) goto L54
                    retrofit2.HttpServiceMethod r2 = retrofit2.ServiceMethod.b(r1, r0, r6)     // Catch: java.lang.Throwable -> L4d
                    java.util.concurrent.ConcurrentHashMap r0 = r1.f27003a     // Catch: java.lang.Throwable -> L4b
                    r0.put(r6, r2)     // Catch: java.lang.Throwable -> L4b
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L4b
                    goto L6a
                L4b:
                    r5 = move-exception
                    goto L56
                L4d:
                    r5 = move-exception
                    java.util.concurrent.ConcurrentHashMap r7 = r1.f27003a     // Catch: java.lang.Throwable -> L4b
                    r7.remove(r6)     // Catch: java.lang.Throwable -> L4b
                    throw r5     // Catch: java.lang.Throwable -> L4b
                L54:
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L4b
                    goto L58
                L56:
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L4b
                    throw r5
                L58:
                    monitor-enter(r2)
                    java.util.concurrent.ConcurrentHashMap r3 = r1.f27003a     // Catch: java.lang.Throwable -> L63
                    java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.Throwable -> L63
                    if (r3 != 0) goto L65
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                    goto L23
                L63:
                    r5 = move-exception
                    goto L6f
                L65:
                    r6 = r3
                    retrofit2.ServiceMethod r6 = (retrofit2.ServiceMethod) r6     // Catch: java.lang.Throwable -> L63
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                    r2 = r6
                L6a:
                    java.lang.Object r5 = r2.a(r7, r5)
                    return r5
                L6f:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: retrofit2.Retrofit.AnonymousClass1.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
            }
        });
    }

    public final Converter c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            Converter converterA = ((Converter.Factory) list.get(i)).a(type, annotationArr, annotationArr2, this);
            if (converterA != null) {
                return converterA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((Converter.Factory) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final Converter d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            Converter converterB = ((Converter.Factory) list.get(i)).b(type, annotationArr, this);
            if (converterB != null) {
                return converterB;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((Converter.Factory) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Converter.Factory) list.get(i)).getClass();
        }
    }
}
