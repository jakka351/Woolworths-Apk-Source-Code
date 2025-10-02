package au.com.woolworths.android.onesite.gson;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/gson/RuntimeTypeAdapterFactory;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/gson/TypeAdapterFactory;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RuntimeTypeAdapterFactory<T> implements TypeAdapterFactory {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/gson/RuntimeTypeAdapterFactory$Companion;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter a(Gson gson, TypeToken typeToken) {
        if (typeToken == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        gson.g(TypeToken.get(JsonElement.class));
        typeToken.getRawType();
        throw null;
    }
}
