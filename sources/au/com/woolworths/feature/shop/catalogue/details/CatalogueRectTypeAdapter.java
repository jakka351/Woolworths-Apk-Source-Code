package au.com.woolworths.feature.shop.catalogue.details;

import YU.a;
import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueRectTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Landroid/graphics/Rect;", "<init>", "()V", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueRectTypeAdapter extends TypeAdapter<Rect> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueRectTypeAdapter$Companion;", "", "", "RECT_STR_SIZE", "I", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public static Rect a(List list) {
        if (list.size() != 4) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        Rect rect = new Rect();
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            int iIntValue = ((Number) next).intValue();
            if (i == 0) {
                rect.left = iIntValue;
            } else if (i == 1) {
                rect.top = iIntValue;
            } else if (i != 2) {
                rect.bottom = iIntValue;
            } else {
                rect.right = iIntValue;
            }
            i = i2;
        }
        return rect;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        String strNextString;
        if (jsonReader != null && jsonReader.hasNext()) {
            try {
                try {
                    strNextString = jsonReader.nextString();
                } catch (NumberFormatException e) {
                    e = e;
                    strNextString = null;
                }
            } catch (IllegalStateException e2) {
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.k), e2, "The next token is not a string or this reader is closed", 8);
            }
            try {
                Intrinsics.e(strNextString);
                return a(StringsKt.T(strNextString, new String[]{" ", ","}, 6));
            } catch (NumberFormatException e3) {
                e = e3;
                Bark.Companion companion2 = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.k), e, a.h("The coordinates string '", strNextString, "' are not valid representations of numbers"), 8);
                return null;
            }
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        String strFlattenToString;
        String strM;
        Rect rect = (Rect) obj;
        if (jsonWriter == null) {
            return;
        }
        jsonWriter.beginObject();
        if (rect == null || (strFlattenToString = rect.flattenToString()) == null || (strM = CollectionsKt.M(StringsKt.T(strFlattenToString, new String[]{" "}, 6), ",", null, null, null, 62)) == null || jsonWriter.value(strM) == null) {
            jsonWriter.nullValue();
        }
        jsonWriter.endObject();
    }
}
