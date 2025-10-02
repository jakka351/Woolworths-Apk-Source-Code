package au.com.woolworths.feature.product.list;

import androidx.lifecycle.MediatorLiveData;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdUtilKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class VideoAdUnitComposeViewKt$VideoAdUnitCompose$1$1$3$1 extends FunctionReferenceImpl implements Function3<Float, Float, Float, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        float fFloatValue3 = ((Number) obj3).floatValue();
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        boolean zA = VideoAdUtilKt.a(fFloatValue, fFloatValue2, fFloatValue3, productListViewModel.R);
        MediatorLiveData mediatorLiveData = productListViewModel.C;
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
        if (viewState != null) {
            ProductListViewModel.H6(productListViewModel, mediatorLiveData, 0, null, null, null, null, null, null, null, null, null, null, null, VideoAdPlayerState.a(viewState.u, false, zA, 0L, false, false, BitmapDescriptorFactory.HUE_RED, 61), null, viewState.y, null, 56623103);
        }
        return Unit.f24250a;
    }
}
