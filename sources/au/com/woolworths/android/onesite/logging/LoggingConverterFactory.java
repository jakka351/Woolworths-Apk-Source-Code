package au.com.woolworths.android.onesite.logging;

import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.google.gson.JsonParseException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/logging/LoggingConverterFactory;", "Lretrofit2/Converter$Factory;", "LoggingResponseConverter", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoggingConverterFactory extends Converter.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final GsonConverterFactory f4268a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/logging/LoggingConverterFactory$LoggingResponseConverter;", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoggingResponseConverter implements Converter<ResponseBody, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final Converter f4269a;

        public LoggingResponseConverter(Converter converter) {
            this.f4269a = converter;
        }

        @Override // retrofit2.Converter
        public final Object a(Object obj) {
            ResponseBody value = (ResponseBody) obj;
            Intrinsics.h(value, "value");
            try {
                return this.f4269a.a(value);
            } catch (JsonParseException e) {
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(ReportOwner.Squad.m.a(), e, "Invalid Json received", 8);
                throw e;
            }
        }
    }

    public LoggingConverterFactory(GsonConverterFactory gsonConverterFactory) {
        this.f4268a = gsonConverterFactory;
    }

    @Override // retrofit2.Converter.Factory
    public final Converter a(Type type, Annotation[] annotationArr, Annotation[] methodAnnotations, Retrofit retrofit) {
        Intrinsics.h(type, "type");
        Intrinsics.h(methodAnnotations, "methodAnnotations");
        return this.f4268a.a(type, annotationArr, methodAnnotations, retrofit);
    }

    @Override // retrofit2.Converter.Factory
    public final Converter b(Type type, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.h(annotations, "annotations");
        return new LoggingResponseConverter(this.f4268a.b(type, annotations, retrofit));
    }
}
