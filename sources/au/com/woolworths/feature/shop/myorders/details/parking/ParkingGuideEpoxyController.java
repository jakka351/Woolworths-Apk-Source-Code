package au.com.woolworths.feature.shop.myorders.details.parking;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.ItemParkingMapBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemParkingStepBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemParkingStepTitleBindingModel_;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionParkingDetails;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/parking/ParkingGuideEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderCollectionParkingDetails;", "<init>", "()V", "buildModels", "", "data", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ParkingGuideEpoxyController extends TypedEpoxyController<OrderCollectionParkingDetails> {
    public static final int $stable = 8;

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable OrderCollectionParkingDetails data) {
        if (data != null) {
            List list = data.e;
            ItemParkingMapBindingModel_ itemParkingMapBindingModel_ = new ItemParkingMapBindingModel_();
            itemParkingMapBindingModel_.M();
            String str = data.d;
            itemParkingMapBindingModel_.t();
            itemParkingMapBindingModel_.n = str;
            add(itemParkingMapBindingModel_);
            if (list.isEmpty()) {
                return;
            }
            ItemParkingStepTitleBindingModel_ itemParkingStepTitleBindingModel_ = new ItemParkingStepTitleBindingModel_();
            itemParkingStepTitleBindingModel_.M();
            add(itemParkingStepTitleBindingModel_);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                ItemParkingStepBindingModel_ itemParkingStepBindingModel_ = new ItemParkingStepBindingModel_();
                itemParkingStepBindingModel_.M(i);
                itemParkingStepBindingModel_.t();
                itemParkingStepBindingModel_.n = i2;
                itemParkingStepBindingModel_.t();
                itemParkingStepBindingModel_.o = (String) obj;
                add(itemParkingStepBindingModel_);
                i = i2;
            }
        }
    }
}
