package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface JsonDecoder extends Decoder, CompositeDecoder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
    }

    /* renamed from: d */
    Json getF24869a();

    JsonElement s();
}
