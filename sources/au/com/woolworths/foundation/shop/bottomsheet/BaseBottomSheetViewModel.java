package au.com.woolworths.foundation.shop.bottomsheet;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.handlers.LinkHandler;
import au.com.woolworths.android.onesite.ui.HtmlTextListener;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$CtaClickListener;", "Lau/com/woolworths/android/onesite/ui/HtmlTextListener;", "Lau/com/woolworths/android/onesite/handlers/LinkHandler;", "<init>", "()V", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class BaseBottomSheetViewModel extends ViewModel implements BaseBottomSheetContract.CtaClickListener, HtmlTextListener, LinkHandler {
    public final MutableLiveData e;
    public final MutableLiveData f;
    public final SharedFlowImpl g;
    public final SharedFlowImpl h;

    public BaseBottomSheetViewModel() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.e = mutableLiveData;
        this.f = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.g = sharedFlowImplB;
        this.h = sharedFlowImplB;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract.CtaClickListener
    public void B4(ContentCta cta) {
        Intrinsics.h(cta, "cta");
        p6(cta);
    }

    @Override // au.com.woolworths.android.onesite.handlers.LinkHandler
    public final boolean U3(String url, String linkText) {
        Intrinsics.h(url, "url");
        Intrinsics.h(linkText, "linkText");
        this.g.f(BaseBottomSheetContract.Actions.Dismiss.f8662a);
        return false;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract.CtaClickListener
    public void c4(ContentCta cta) {
        Intrinsics.h(cta, "cta");
        p6(cta);
    }

    @Override // au.com.woolworths.android.onesite.ui.HtmlTextListener
    public final void h4(String label, String url) {
        Intrinsics.h(label, "label");
        Intrinsics.h(url, "url");
        this.g.f(new BaseBottomSheetContract.Actions.OpenCustomTab(url));
        r6(label);
    }

    public final void p6(ContentCta contentCta) {
        String url = contentCta.getUrl();
        SharedFlowImpl sharedFlowImpl = this.g;
        if (url != null) {
            sharedFlowImpl.f(new BaseBottomSheetContract.Actions.OpenAppLink(url));
        }
        sharedFlowImpl.f(BaseBottomSheetContract.Actions.Dismiss.f8662a);
        q6(contentCta);
    }

    public abstract void q6(ContentCta contentCta);

    public abstract void r6(String str);

    public abstract void s6();
}
