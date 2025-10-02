package au.com.woolworths.feature.shop.catalogue.termsandconditions;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/termsandconditions/TermsAndConditionsViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TermsAndConditionsViewModel extends ViewModel {
    public final MutableStateFlow e = StateFlowKt.a(new TermsAndConditionsContract.ViewState(EmptyList.d));

    @Inject
    public TermsAndConditionsViewModel() {
    }
}
