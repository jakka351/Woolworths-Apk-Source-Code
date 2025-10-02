package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okio.Buffer;
import retrofit2.Converter;
import retrofit2.http.Streaming;

/* loaded from: classes2.dex */
final class BuiltInConverters extends Converter.Factory {

    /* loaded from: classes8.dex */
    public static final class BufferingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final BufferingResponseBodyConverter f26967a = new BufferingResponseBodyConverter();

        @Override // retrofit2.Converter
        public final Object a(Object obj) {
            ResponseBody responseBody = (ResponseBody) obj;
            try {
                Buffer buffer = new Buffer();
                responseBody.U0().t2(buffer);
                MediaType mediaTypeC = responseBody.getG();
                long jB = responseBody.getH();
                ResponseBody.e.getClass();
                return new ResponseBody$Companion$asResponseBody$1(mediaTypeC, jB, buffer);
            } finally {
                responseBody.close();
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class RequestBodyConverter implements Converter<RequestBody, RequestBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final RequestBodyConverter f26968a = new RequestBodyConverter();

        @Override // retrofit2.Converter
        public final Object a(Object obj) {
            return (RequestBody) obj;
        }
    }

    /* loaded from: classes8.dex */
    public static final class StreamingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final StreamingResponseBodyConverter f26969a = new StreamingResponseBodyConverter();

        @Override // retrofit2.Converter
        public final Object a(Object obj) {
            return (ResponseBody) obj;
        }
    }

    /* loaded from: classes8.dex */
    public static final class ToStringConverter implements Converter<Object, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final ToStringConverter f26970a = new ToStringConverter();

        @Override // retrofit2.Converter
        public final Object a(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes8.dex */
    public static final class UnitResponseBodyConverter implements Converter<ResponseBody, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final UnitResponseBodyConverter f26971a = new UnitResponseBodyConverter();

        @Override // retrofit2.Converter
        public final Object a(Object obj) {
            ((ResponseBody) obj).close();
            return Unit.f24250a;
        }
    }

    /* loaded from: classes8.dex */
    public static final class VoidResponseBodyConverter implements Converter<ResponseBody, Void> {

        /* renamed from: a, reason: collision with root package name */
        public static final VoidResponseBodyConverter f26972a = new VoidResponseBodyConverter();

        @Override // retrofit2.Converter
        public final Object a(Object obj) {
            ((ResponseBody) obj).close();
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    public final Converter a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(Utils.e(type))) {
            return RequestBodyConverter.f26968a;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public final Converter b(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            return Utils.h(annotationArr, Streaming.class) ? StreamingResponseBodyConverter.f26969a : BufferingResponseBodyConverter.f26967a;
        }
        if (type == Void.class) {
            return VoidResponseBodyConverter.f26972a;
        }
        if (Utils.b && type == Unit.class) {
            return UnitResponseBodyConverter.f26971a;
        }
        return null;
    }
}
