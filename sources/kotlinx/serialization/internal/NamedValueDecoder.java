package kotlinx.serialization.internal;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/NamedValueDecoder;", "Lkotlinx/serialization/internal/TaggedDecoder;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
/* loaded from: classes7.dex */
public abstract class NamedValueDecoder extends TaggedDecoder<String> {
    public String V(String str, String str2) {
        if (str.length() == 0) {
            return str2;
        }
        return str + JwtParser.SEPARATOR_CHAR + str2;
    }

    public String W(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return descriptor.g(i);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final String T(SerialDescriptor serialDescriptor, int i) {
        Intrinsics.h(serialDescriptor, "<this>");
        String nestedName = W(serialDescriptor, i);
        Intrinsics.h(nestedName, "nestedName");
        String str = (String) CollectionsKt.P(this.f24822a);
        if (str == null) {
            str = "";
        }
        return V(str, nestedName);
    }

    public final String Y() {
        ArrayList arrayList = this.f24822a;
        return arrayList.isEmpty() ? "$" : CollectionsKt.M(arrayList, ".", "$.", null, null, 60);
    }
}
