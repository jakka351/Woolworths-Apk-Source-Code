package au.com.woolworths.android.onesite.network;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/network/DefaultEnumTypeAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "<init>", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultEnumTypeAdapterFactory implements TypeAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter a(Gson gson, TypeToken typeToken) {
        Intrinsics.h(typeToken, "typeToken");
        Class rawType = typeToken.getRawType();
        if (rawType == null) {
            rawType = null;
        }
        if (rawType == null || !Enum.class.isAssignableFrom(rawType) || rawType.equals(Enum.class)) {
            return null;
        }
        Iterator itA = ArrayIteratorKt.a(rawType.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            if (field.isEnumConstant() && field.isAnnotationPresent(DefaultValue.class)) {
                return new EnumWithDefaultTypeAdapter(rawType);
            }
        }
        return null;
    }
}
