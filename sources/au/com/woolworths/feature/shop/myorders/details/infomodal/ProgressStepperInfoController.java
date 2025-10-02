package au.com.woolworths.feature.shop.myorders.details.infomodal;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.details.epoxy.ProgressStepperInfoItem;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/infomodal/ProgressStepperInfoController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lau/com/woolworths/feature/shop/myorders/details/epoxy/ProgressStepperInfoItem;", "<init>", "()V", "buildModels", "", "data", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProgressStepperInfoController extends TypedEpoxyController<List<? extends ProgressStepperInfoItem>> {
    public static final int $stable = 8;

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable List<? extends ProgressStepperInfoItem> data) {
        if (data != null) {
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                ((ProgressStepperInfoItem) it.next()).a(this);
            }
        }
    }
}
