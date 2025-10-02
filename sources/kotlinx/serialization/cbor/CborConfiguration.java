package kotlinx.serialization.cbor;

import YU.a;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/cbor/CborConfiguration;", "", "kotlinx-serialization-cbor"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes7.dex */
public final class CborConfiguration {
    public final String toString() {
        StringBuilder sb = new StringBuilder("CborConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, encodeKeyTags=");
        sb.append(false);
        sb.append(", encodeValueTags=");
        sb.append(false);
        sb.append(", encodeObjectTags=");
        sb.append(false);
        sb.append(", verifyKeyTags=");
        sb.append(false);
        sb.append(", verifyValueTags=");
        sb.append(false);
        sb.append(", verifyObjectTags=");
        sb.append(false);
        sb.append(", useDefiniteLengthEncoding=");
        sb.append(false);
        sb.append(", preferCborLabelsOverNames=");
        return a.k(", alwaysUseByteString=false)", sb, false);
    }
}
