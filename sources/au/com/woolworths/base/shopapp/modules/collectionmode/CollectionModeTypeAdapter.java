package au.com.woolworths.base.shopapp.modules.collectionmode;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/CollectionModeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;", "<init>", "()V", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CollectionModeTypeAdapter extends TypeAdapter<CollectionMode> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/CollectionModeTypeAdapter$Companion;", "", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "VARIANT", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        CollectionMode delivery;
        Intrinsics.h(jsonReader, "jsonReader");
        jsonReader.beginObject();
        if (Intrinsics.c(jsonReader.nextName(), "type")) {
            String strNextString = jsonReader.nextString();
            delivery = CollectionMode.PickUp.d;
            if (!Intrinsics.c(strNextString, delivery.getModeName())) {
                delivery = CollectionMode.InStore.d;
                if (!Intrinsics.c(strNextString, delivery.getModeName())) {
                    delivery = CollectionMode.NotSet.d;
                    if (!Intrinsics.c(strNextString, delivery.getModeName())) {
                        Intrinsics.e(strNextString);
                        if (jsonReader.hasNext() && Intrinsics.c(jsonReader.nextName(), "variant")) {
                            DeliveryModeVariant.Companion companion = DeliveryModeVariant.e;
                            String strNextString2 = jsonReader.nextString();
                            Intrinsics.g(strNextString2, "nextString(...)");
                            companion.getClass();
                            DeliveryModeVariant deliveryModeVariant = (DeliveryModeVariant) DeliveryModeVariant.f.get(strNextString2);
                            if (deliveryModeVariant != null && Intrinsics.c(new CollectionMode.Delivery(deliveryModeVariant).getModeName(), strNextString)) {
                                delivery = new CollectionMode.Delivery(deliveryModeVariant);
                            }
                        }
                    }
                }
            }
        } else {
            delivery = CollectionMode.NotSet.d;
        }
        jsonReader.endObject();
        return delivery;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter out, Object obj) throws IOException {
        CollectionMode value = (CollectionMode) obj;
        Intrinsics.h(out, "out");
        Intrinsics.h(value, "value");
        out.beginObject();
        out.name("type").value(value.getModeName());
        if (value instanceof CollectionMode.Delivery) {
            out.name("variant").value(((CollectionMode.Delivery) value).getVariant().d);
        }
        out.endObject();
    }
}
