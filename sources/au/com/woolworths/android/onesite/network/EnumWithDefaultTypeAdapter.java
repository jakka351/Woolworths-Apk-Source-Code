package au.com.woolworths.android.onesite.network;

import au.com.woolworths.graphql.DefaultValue;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/network/EnumWithDefaultTypeAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/gson/TypeAdapter;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnumWithDefaultTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class f4565a;

    public EnumWithDefaultTypeAdapter(Class cls) {
        this.f4565a = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader in) throws IllegalAccessException, IOException, IllegalArgumentException {
        Intrinsics.h(in, "in");
        Class cls = this.f4565a;
        if (!cls.isEnum()) {
            throw new UnsupportedOperationException(cls + " is not an enum");
        }
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        HashMap map = new HashMap();
        Iterator itA = ArrayIteratorKt.a(cls.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            if (field.isEnumConstant()) {
                Object obj = field.get(null);
                if (field.isAnnotationPresent(DefaultValue.class)) {
                    map.put(null, obj);
                } else {
                    if (!field.isAnnotationPresent(SerializedName.class)) {
                        throw new IllegalStateException(YU.a.h("Every value of enum ", cls.getSimpleName(), " should be annotated with either @DefaultValue or @SerializedName(). Un-annotated values are not allowed."));
                    }
                    Annotation annotation = field.getAnnotation(SerializedName.class);
                    Intrinsics.e(annotation);
                    map.put(((SerializedName) annotation).value(), obj);
                }
            }
        }
        Object obj2 = map.get(in.nextString());
        return obj2 == null ? map.get(null) : obj2;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        throw new UnsupportedOperationException("EnumWithDefaultTypeAdapter doesn't support writing");
    }
}
