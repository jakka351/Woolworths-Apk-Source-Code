package retrofit2;

import androidx.camera.core.impl.b;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.internal._HeadersCommonKt;
import retrofit2.BuiltInConverters;

/* loaded from: classes2.dex */
abstract class ParameterHandler<T> {

    public static final class Body<T> extends ParameterHandler<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f26983a;
        public final int b;
        public final Converter c;

        public Body(Method method, int i, Converter converter) {
            this.f26983a = method;
            this.b = i;
            this.c = converter;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            int i = this.b;
            Method method = this.f26983a;
            if (obj == null) {
                throw Utils.j(method, i, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                requestBuilder.k = (RequestBody) this.c.a(obj);
            } catch (IOException e) {
                throw Utils.k(method, e, i, b.n(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class Field<T> extends ParameterHandler<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f26984a;
        public final Converter b;
        public final boolean c;

        public Field(String str, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f26984a = str;
            this.b = BuiltInConverters.ToStringConverter.f26970a;
            this.c = z;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            if (obj == null) {
                return;
            }
            ((BuiltInConverters.ToStringConverter) this.b).getClass();
            String string = obj.toString();
            if (string == null) {
                return;
            }
            FormBody.Builder builder = requestBuilder.j;
            String str = this.f26984a;
            if (this.c) {
                builder.b(str, string);
            } else {
                builder.a(str, string);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f26985a;
        public final int b;
        public final Converter c = BuiltInConverters.ToStringConverter.f26970a;
        public final boolean d;

        public FieldMap(int i, Method method, boolean z) {
            this.f26985a = method;
            this.b = i;
            this.d = z;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.f26985a;
            if (map == null) {
                throw Utils.j(method, i, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Utils.j(method, i, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Utils.j(method, i, YU.a.h("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw Utils.j(method, i, "Field map value '" + value + "' converted to null by " + BuiltInConverters.ToStringConverter.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                FormBody.Builder builder = requestBuilder.j;
                if (this.d) {
                    builder.b(str, string);
                } else {
                    builder.a(str, string);
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class Header<T> extends ParameterHandler<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f26986a;
        public final Converter b;
        public final boolean c;

        public Header(String str, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f26986a = str;
            this.b = BuiltInConverters.ToStringConverter.f26970a;
            this.c = z;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            if (obj == null) {
                return;
            }
            ((BuiltInConverters.ToStringConverter) this.b).getClass();
            String string = obj.toString();
            if (string == null) {
                return;
            }
            requestBuilder.a(this.f26986a, string, this.c);
        }
    }

    /* loaded from: classes8.dex */
    public static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f26987a;
        public final int b;
        public final Converter c = BuiltInConverters.ToStringConverter.f26970a;
        public final boolean d;

        public HeaderMap(int i, Method method, boolean z) {
            this.f26987a = method;
            this.b = i;
            this.d = z;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.f26987a;
            if (map == null) {
                throw Utils.j(method, i, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Utils.j(method, i, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Utils.j(method, i, YU.a.h("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                requestBuilder.a(str, value.toString(), this.d);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class Headers extends ParameterHandler<okhttp3.Headers> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f26988a;
        public final int b;

        public Headers(int i, Method method) {
            this.f26988a = method;
            this.b = i;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            okhttp3.Headers headers = (okhttp3.Headers) obj;
            if (headers == null) {
                throw Utils.j(this.f26988a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
            Headers.Builder builder = requestBuilder.f;
            builder.getClass();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                _HeadersCommonKt.a(builder, headers.d(i), headers.i(i));
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class Part<T> extends ParameterHandler<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f26989a;
        public final int b;
        public final okhttp3.Headers c;
        public final Converter d;

        public Part(Method method, int i, okhttp3.Headers headers, Converter converter) {
            this.f26989a = method;
            this.b = i;
            this.c = headers;
            this.d = converter;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                RequestBody requestBody = (RequestBody) this.d.a(obj);
                requestBuilder.i.a(this.c, requestBody);
            } catch (IOException e) {
                throw Utils.j(this.f26989a, this.b, b.n(obj, "Unable to convert ", " to RequestBody"), e);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class PartMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f26990a;
        public final int b;
        public final Converter c;
        public final String d;

        public PartMap(Method method, int i, Converter converter, String str) {
            this.f26990a = method;
            this.b = i;
            this.c = converter;
            this.d = str;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.f26990a;
            if (map == null) {
                throw Utils.j(method, i, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Utils.j(method, i, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Utils.j(method, i, YU.a.h("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                String[] strArr = {"Content-Disposition", YU.a.h("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.d};
                okhttp3.Headers.e.getClass();
                requestBuilder.i.a(Headers.Companion.a(strArr), (RequestBody) this.c.a(value));
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class Path<T> extends ParameterHandler<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f26991a;
        public final int b;
        public final String c;
        public final Converter d;
        public final boolean e;

        public Path(Method method, int i, String str, boolean z) {
            this.f26991a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.c = str;
            this.d = BuiltInConverters.ToStringConverter.f26970a;
            this.e = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
        @Override // retrofit2.ParameterHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(retrofit2.RequestBuilder r18, java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit2.ParameterHandler.Path.a(retrofit2.RequestBuilder, java.lang.Object):void");
        }
    }

    /* loaded from: classes8.dex */
    public static final class Query<T> extends ParameterHandler<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f26992a;
        public final Converter b;
        public final boolean c;

        public Query(String str, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f26992a = str;
            this.b = BuiltInConverters.ToStringConverter.f26970a;
            this.c = z;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            if (obj == null) {
                return;
            }
            ((BuiltInConverters.ToStringConverter) this.b).getClass();
            String string = obj.toString();
            if (string == null) {
                return;
            }
            requestBuilder.b(this.f26992a, string, this.c);
        }
    }

    /* loaded from: classes8.dex */
    public static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f26993a;
        public final int b;
        public final Converter c = BuiltInConverters.ToStringConverter.f26970a;
        public final boolean d;

        public QueryMap(int i, Method method, boolean z) {
            this.f26993a = method;
            this.b = i;
            this.d = z;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.f26993a;
            if (map == null) {
                throw Utils.j(method, i, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Utils.j(method, i, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Utils.j(method, i, YU.a.h("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw Utils.j(method, i, "Query map value '" + value + "' converted to null by " + BuiltInConverters.ToStringConverter.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                requestBuilder.b(str, string, this.d);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class QueryName<T> extends ParameterHandler<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Converter f26994a = BuiltInConverters.ToStringConverter.f26970a;
        public final boolean b;

        public QueryName(boolean z) {
            this.b = z;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            if (obj == null) {
                return;
            }
            requestBuilder.b(obj.toString(), null, this.b);
        }
    }

    /* loaded from: classes8.dex */
    public static final class RawPart extends ParameterHandler<MultipartBody.Part> {

        /* renamed from: a, reason: collision with root package name */
        public static final RawPart f26995a = new RawPart();

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            MultipartBody.Part part = (MultipartBody.Part) obj;
            if (part != null) {
                requestBuilder.i.b(part);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class RelativeUrl extends ParameterHandler<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f26996a;
        public final int b;

        public RelativeUrl(int i, Method method) {
            this.f26996a = method;
            this.b = i;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                requestBuilder.c = obj.toString();
            } else {
                throw Utils.j(this.f26996a, this.b, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class Tag<T> extends ParameterHandler<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class f26997a;

        public Tag(Class cls) {
            this.f26997a = cls;
        }

        @Override // retrofit2.ParameterHandler
        public final void a(RequestBuilder requestBuilder, Object obj) {
            requestBuilder.e.g(this.f26997a, obj);
        }
    }

    public abstract void a(RequestBuilder requestBuilder, Object obj);
}
