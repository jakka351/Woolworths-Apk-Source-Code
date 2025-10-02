package au.com.woolworths.feature.shop.wpay.data.json.parser;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.wpay.data.json.deserializer.CreditCardFormWebEventDeserializer;
import au.com.woolworths.feature.shop.wpay.domain.model.CreditCardFormWebEvent;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/data/json/parser/CreditCardFormEventParser;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditCardFormEventParser {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f8261a;

    public CreditCardFormEventParser() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.b(new CreditCardFormWebEventDeserializer(), CreditCardFormWebEvent.class);
        this.f8261a = gsonBuilder.a();
    }

    public final CreditCardFormWebEvent a(String json) {
        Intrinsics.h(json, "json");
        try {
            Object objD = this.f8261a.d(CreditCardFormWebEvent.class, json);
            Intrinsics.e(objD);
            return (CreditCardFormWebEvent) objD;
        } catch (Exception e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.h(new ReportOwner(ReportOwner.Squad.h), e, null, 28);
            return new CreditCardFormWebEvent.Invalid(e);
        }
    }
}
