package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes2.dex */
public final class GsonConverterFactory extends Converter.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f27010a;

    public GsonConverterFactory(Gson gson) {
        this.f27010a = gson;
    }

    public static GsonConverterFactory c(Gson gson) {
        if (gson != null) {
            return new GsonConverterFactory(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // retrofit2.Converter.Factory
    public final Converter a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f27010a;
        return new GsonRequestBodyConverter(gson, gson.g(typeToken));
    }

    @Override // retrofit2.Converter.Factory
    public final Converter b(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f27010a;
        return new GsonResponseBodyConverter(gson, gson.g(typeToken));
    }
}
