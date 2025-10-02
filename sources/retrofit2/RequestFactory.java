package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;

/* loaded from: classes2.dex */
final class RequestFactory {

    /* renamed from: a, reason: collision with root package name */
    public final Class f27000a;
    public final Method b;
    public final HttpUrl c;
    public final String d;
    public final String e;
    public final Headers f;
    public final MediaType g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final ParameterHandler[] k;
    public final boolean l;

    public static final class Builder {
        public static final Pattern y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a, reason: collision with root package name */
        public final Retrofit f27001a;
        public final Class b;
        public final Method c;
        public final Annotation[] d;
        public final Annotation[][] e;
        public final Type[] f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public String o;
        public boolean p;
        public boolean q;
        public boolean r;
        public String s;
        public Headers t;
        public MediaType u;
        public LinkedHashSet v;
        public ParameterHandler[] w;
        public boolean x;

        public Builder(Retrofit retrofit, Class cls, Method method) {
            this.f27001a = retrofit;
            this.b = cls;
            this.c = method;
            this.d = method.getAnnotations();
            this.f = method.getGenericParameterTypes();
            this.e = method.getParameterAnnotations();
        }

        public static Class a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z2) {
            String str3 = this.o;
            Method method = this.c;
            if (str3 != null) {
                throw Utils.i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.o = str;
            this.p = z2;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            Pattern pattern = y;
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw Utils.i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.s = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.v = linkedHashSet;
        }

        public final void c(int i, Type type) {
            if (Utils.g(type)) {
                throw Utils.j(this.c, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public RequestFactory(Builder builder) {
        this.f27000a = builder.b;
        this.b = builder.c;
        this.c = builder.f27001a.c;
        this.d = builder.o;
        this.e = builder.s;
        this.f = builder.t;
        this.g = builder.u;
        this.h = builder.p;
        this.i = builder.q;
        this.j = builder.r;
        this.k = builder.w;
        this.l = builder.x;
    }
}
