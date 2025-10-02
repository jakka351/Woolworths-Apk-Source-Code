package au.com.woolworths.foundation.shop.nhp.ui.pp;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ByteStreamsKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/ui/pp/ProductCarouselSessionSerializer;", "Landroidx/datastore/core/Serializer;", "Lau/com/woolworths/foundation/shop/nhp/ui/pp/ProductCarouselSession;", "nhp-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ProductCarouselSessionSerializer implements Serializer<ProductCarouselSession> {

    /* renamed from: a, reason: collision with root package name */
    public static final ProductCarouselSessionSerializer f8792a = new ProductCarouselSessionSerializer();
    public static final ProductCarouselSession b = new ProductCarouselSession(true);

    @Override // androidx.datastore.core.Serializer
    public final /* bridge */ /* synthetic */ Object getDefaultValue() {
        return b;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            return (ProductCarouselSession) Json.d.b(ProductCarouselSession.INSTANCE.serializer(), StringsKt.r(ByteStreamsKt.b(inputStream)));
        } catch (SerializationException e) {
            throw new CorruptionException("Unable to read ProductCarouselSession", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        outputStream.write(StringsKt.u(Json.d.c(ProductCarouselSession.INSTANCE.serializer(), (ProductCarouselSession) obj)));
        return Unit.f24250a;
    }
}
