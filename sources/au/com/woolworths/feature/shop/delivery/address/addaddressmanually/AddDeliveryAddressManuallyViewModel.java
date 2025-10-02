package au.com.woolworths.feature.shop.delivery.address.addaddressmanually;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.TrackableErrorType;
import au.com.woolworths.base.shopapp.models.address.AddressResult;
import au.com.woolworths.base.shopapp.models.address.SuburbResult;
import au.com.woolworths.feature.shop.delivery.address.DeliveryAddressInteractor;
import au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyContract;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyEventHandler;", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddDeliveryAddressManuallyViewModel extends AndroidViewModel implements AddDeliveryAddressManuallyEventHandler {
    public final DeliveryAddressInteractor f;
    public final CollectionModeInteractor g;
    public final AnalyticsManager h;
    public final MutableLiveData i;
    public final SharedFlowImpl j;
    public final SharedFlow k;
    public boolean l;
    public boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddDeliveryAddressManuallyViewModel(Application application, DeliveryAddressInteractor deliveryAddressInteractor, CollectionModeInteractor collectionModeInteractor, AnalyticsManager analyticsManager) {
        super(application);
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f = deliveryAddressInteractor;
        this.g = collectionModeInteractor;
        this.h = analyticsManager;
        this.i = new MutableLiveData();
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.f, 1);
        this.j = sharedFlowImplB;
        this.k = FlowKt.a(sharedFlowImplB);
    }

    public static final void q6(AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel) {
        w6(addDeliveryAddressManuallyViewModel, addDeliveryAddressManuallyViewModel.i, false, null, null, null, null, null, null, 126);
        addDeliveryAddressManuallyViewModel.j.f(new AddDeliveryAddressManuallyContract.Actions.ShowSnackbarMessage(R.string.error_no_network));
    }

    public static final void r6(AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel, AddDeliveryAddressManuallyActionData addDeliveryAddressManuallyActionData, String str) {
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.k0, TrackableErrorType.f);
        trackingMetadataA.b(TrackableValue.l0, str);
        addDeliveryAddressManuallyViewModel.h.j(addDeliveryAddressManuallyActionData, trackingMetadataA);
    }

    public static void w6(AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel, MutableLiveData mutableLiveData, boolean z, String str, String str2, String str3, List list, SuburbResult.Suburb suburb, String str4, int i) {
        SuburbResult.Suburb suburb2;
        String str5;
        String str6;
        String str7;
        String str8;
        if ((i & 1) != 0) {
            AddDeliveryAddressManuallyContract.ViewState viewState = (AddDeliveryAddressManuallyContract.ViewState) addDeliveryAddressManuallyViewModel.i.e();
            z = viewState != null ? viewState.f7049a : false;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            AddDeliveryAddressManuallyContract.ViewState viewState2 = (AddDeliveryAddressManuallyContract.ViewState) addDeliveryAddressManuallyViewModel.i.e();
            str = (viewState2 == null || (str8 = viewState2.b) == null) ? "" : str8;
        }
        String str9 = str;
        if ((i & 4) != 0) {
            AddDeliveryAddressManuallyContract.ViewState viewState3 = (AddDeliveryAddressManuallyContract.ViewState) addDeliveryAddressManuallyViewModel.i.e();
            str2 = (viewState3 == null || (str7 = viewState3.c) == null) ? "" : str7;
        }
        String str10 = str2;
        if ((i & 8) != 0) {
            AddDeliveryAddressManuallyContract.ViewState viewState4 = (AddDeliveryAddressManuallyContract.ViewState) addDeliveryAddressManuallyViewModel.i.e();
            str3 = (viewState4 == null || (str6 = viewState4.d) == null) ? "" : str6;
        }
        String str11 = str3;
        if ((i & 16) != 0) {
            AddDeliveryAddressManuallyContract.ViewState viewState5 = (AddDeliveryAddressManuallyContract.ViewState) addDeliveryAddressManuallyViewModel.i.e();
            list = viewState5 != null ? viewState5.e : EmptyList.d;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            AddDeliveryAddressManuallyContract.ViewState viewState6 = (AddDeliveryAddressManuallyContract.ViewState) addDeliveryAddressManuallyViewModel.i.e();
            suburb2 = viewState6 != null ? viewState6.f : null;
        } else {
            suburb2 = suburb;
        }
        if ((i & 64) != 0) {
            AddDeliveryAddressManuallyContract.ViewState viewState7 = (AddDeliveryAddressManuallyContract.ViewState) addDeliveryAddressManuallyViewModel.i.e();
            str5 = viewState7 != null ? viewState7.g : null;
        } else {
            str5 = str4;
        }
        addDeliveryAddressManuallyViewModel.getClass();
        mutableLiveData.m(new AddDeliveryAddressManuallyContract.ViewState(z2, str9, str10, str11, list2, suburb2, str5));
    }

    public final void s6() {
        MutableLiveData mutableLiveData = this.i;
        Object objE = mutableLiveData.e();
        if (objE == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AddDeliveryAddressManuallyContract.ViewState viewState = (AddDeliveryAddressManuallyContract.ViewState) objE;
        SuburbResult.Suburb suburb = viewState.f;
        if (suburb == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        w6(this, mutableLiveData, true, null, null, null, null, null, null, 126);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AddDeliveryAddressManuallyViewModel$onAddAddressClicked$1(this, new AddressResult.ManualAddressToSave(viewState.b, viewState.c, viewState.d, String.valueOf(suburb.a()), this.l, this.m), null), 3);
    }

    public final void t6(CharSequence postcode) {
        Intrinsics.h(postcode, "postcode");
        if (postcode.length() == 4) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AddDeliveryAddressManuallyViewModel$onPostcodeTextChanged$1(this, postcode, null), 3);
        } else {
            w6(this, this.i, false, null, null, postcode.toString(), EmptyList.d, null, null, 103);
        }
    }

    public final void u6(int i) {
        MutableLiveData mutableLiveData = this.i;
        Object objE = mutableLiveData.e();
        if (objE == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        w6(this, mutableLiveData, false, null, null, null, null, (SuburbResult.Suburb) ((AddDeliveryAddressManuallyContract.ViewState) objE).e.get(i), null, 95);
    }

    public final void v6(String str) {
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.k0, TrackableErrorType.e);
        trackingMetadataA.b(TrackableValue.l0, str);
        this.h.j(AddDeliveryAddressManuallyActionData.e, trackingMetadataA);
    }
}
