package com.woolworths.scanlibrary.models.store;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/woolworths/scanlibrary/models/store/TradingHoursJSONDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/woolworths/scanlibrary/models/store/StoreTradingWeek;", "<init>", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TradingHoursJSONDeserializer implements JsonDeserializer<StoreTradingWeek> {
    public static final int $stable = 0;

    @Override // com.google.gson.JsonDeserializer
    @NotNull
    public StoreTradingWeek deserialize(@Nullable JsonElement json, @Nullable Type typeOfT, @Nullable JsonDeserializationContext context) {
        Date date;
        ArrayList arrayList = new ArrayList();
        Object objB = new Gson().b(json, new HashMap().getClass());
        Intrinsics.f(objB, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        for (Map.Entry entry : ((Map) objB).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Intrinsics.h(str, "<this>");
            try {
                date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse(str);
            } catch (Throwable th) {
                Timber.f27013a.p(th);
                date = null;
            }
            if (date != null) {
                if (StringsKt.C(str2, "-", 0, false, 6) > 0) {
                    List listT = StringsKt.T(str2, new String[]{"-"}, 6);
                    arrayList.add(new StoreTradingDateTime(date, (String) listT.get(0), (String) listT.get(1)));
                } else {
                    arrayList.add(new StoreTradingDateTime(date, str2, str2));
                }
            }
        }
        return new StoreTradingWeek(CollectionsKt.u0(new Comparator() { // from class: com.woolworths.scanlibrary.models.store.TradingHoursJSONDeserializer$deserialize$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.a(((StoreTradingDateTime) t).getDate(), ((StoreTradingDateTime) t2).getDate());
            }
        }, arrayList));
    }
}
