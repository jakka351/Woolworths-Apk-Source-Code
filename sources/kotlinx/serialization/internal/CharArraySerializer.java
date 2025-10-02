package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/CharArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/CharArrayBuilder;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class CharArraySerializer extends PrimitiveArraySerializer<Character, char[], CharArrayBuilder> implements KSerializer<char[]> {
    public static final CharArraySerializer c = new CharArraySerializer(CharSerializer.f24785a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.h(cArr, "<this>");
        return cArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void f(CompositeDecoder compositeDecoder, int i, Object obj) {
        CharArrayBuilder builder = (CharArrayBuilder) obj;
        Intrinsics.h(builder, "builder");
        char cE = compositeDecoder.e(this.b, i);
        builder.b(builder.getB() + 1);
        char[] cArr = builder.f24784a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        cArr[i2] = cE;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.h(cArr, "<this>");
        CharArrayBuilder charArrayBuilder = new CharArrayBuilder();
        charArrayBuilder.f24784a = cArr;
        charArrayBuilder.b = cArr.length;
        charArrayBuilder.b(10);
        return charArrayBuilder;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object j() {
        return new char[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void k(CompositeEncoder encoder, Object obj, int i) {
        char[] content = (char[]) obj;
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.f(this.b, i2, content[i2]);
        }
    }
}
