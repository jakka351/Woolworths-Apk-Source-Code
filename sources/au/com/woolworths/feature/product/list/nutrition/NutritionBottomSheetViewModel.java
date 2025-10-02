package au.com.woolworths.feature.product.list.nutrition;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/product/list/nutrition/NutritionBottomSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NutritionBottomSheetViewModel extends ViewModel {
    public final MutableLiveData e;
    public final MutableLiveData f;

    @Inject
    public NutritionBottomSheetViewModel() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.e = mutableLiveData;
        this.f = mutableLiveData;
    }
}
