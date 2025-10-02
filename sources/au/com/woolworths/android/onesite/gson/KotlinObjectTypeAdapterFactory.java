package au.com.woolworths.android.onesite.gson;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/gson/KotlinObjectTypeAdapterFactory;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/gson/TypeAdapterFactory;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KotlinObjectTypeAdapterFactory<T> implements TypeAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter a(Gson gson, TypeToken typeToken) {
        if (typeToken == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        typeToken.getRawType();
        throw null;
    }
}
