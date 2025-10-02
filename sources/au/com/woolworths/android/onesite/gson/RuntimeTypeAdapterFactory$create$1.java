package au.com.woolworths.android.onesite.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/gson/RuntimeTypeAdapterFactory$create$1", "Lcom/google/gson/TypeAdapter;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RuntimeTypeAdapterFactory$create$1 extends TypeAdapter<Object> {
    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        if (jsonReader == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Intrinsics.e(null);
        throw null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        if (jsonWriter == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        throw null;
    }
}
