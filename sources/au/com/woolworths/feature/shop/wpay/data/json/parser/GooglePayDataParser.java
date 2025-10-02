package au.com.woolworths.feature.shop.wpay.data.json.parser;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.wpay.data.json.deserializer.GooglePayDataDeserializer;
import au.com.woolworths.feature.shop.wpay.domain.model.GooglePayData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/data/json/parser/GooglePayDataParser;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayDataParser {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f8262a;

    public GooglePayDataParser() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.b(new GooglePayDataDeserializer(), GooglePayData.class);
        this.f8262a = gsonBuilder.a();
    }
}
