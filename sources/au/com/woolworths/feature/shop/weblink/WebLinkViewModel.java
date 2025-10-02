package au.com.woolworths.feature.shop.weblink;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.feature.shop.weblink.WebLinkContract;
import au.com.woolworths.feature.shop.weblink.model.WebLink;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/weblink/WebLinkViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebLinkViewModel extends ViewModel implements FullPageErrorStateClickHandler {
    public final WebLinkInteractor e;
    public final MutableLiveData f;
    public String g;
    public final MutableLiveData h;

    public WebLinkViewModel(WebLinkInteractor webLinkInteractor) {
        this.e = webLinkInteractor;
        MutableLiveData mutableLiveData = new MutableLiveData(new WebLinkContract.ViewState(null, false, null));
        this.f = mutableLiveData;
        this.h = mutableLiveData;
    }

    public static void p6(MutableLiveData mutableLiveData, WebLink webLink, WebLinkErrorState webLinkErrorState, int i) {
        if ((i & 1) != 0) {
            WebLinkContract.ViewState viewState = (WebLinkContract.ViewState) mutableLiveData.e();
            webLink = viewState != null ? viewState.f8255a : null;
        }
        if ((i & 4) != 0) {
            WebLinkContract.ViewState viewState2 = (WebLinkContract.ViewState) mutableLiveData.e();
            webLinkErrorState = viewState2 != null ? viewState2.c : null;
        }
        mutableLiveData.m(((WebLinkContract.ViewState) mutableLiveData.e()) != null ? new WebLinkContract.ViewState(webLink, false, webLinkErrorState) : null);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        String str = this.g;
        if (str != null) {
            this.g = str;
            BuildersKt.c(ViewModelKt.a(this), null, null, new WebLinkViewModel$loadWebLink$1(this, str, null, null), 3);
        }
    }
}
