package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import android.view.View;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorContract;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpSuburb;
import com.dynatrace.android.callback.Callback;
import com.xwray.groupie.databinding.BindableItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ BindableItem e;

    public /* synthetic */ a(BindableItem bindableItem, int i) {
        this.d = i;
        this.e = bindableItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.d;
        BindableItem bindableItem = this.e;
        switch (i) {
            case 0:
                PickUpLocationItem pickUpLocationItem = (PickUpLocationItem) bindableItem;
                int i2 = PickUpLocationItem.j;
                Callback.g(view);
                try {
                    pickUpLocationItem.h.invoke(pickUpLocationItem);
                    return;
                } finally {
                }
            default:
                PickUpSuburbItem pickUpSuburbItem = (PickUpSuburbItem) bindableItem;
                int i3 = PickUpSuburbItem.i;
                Callback.g(view);
                try {
                    PickUpLocatorViewModel pickUpLocatorViewModel = pickUpSuburbItem.h;
                    PickUpSuburb suburb = pickUpSuburbItem.g;
                    pickUpLocatorViewModel.getClass();
                    Intrinsics.h(suburb, "suburb");
                    pickUpLocatorViewModel.l.onNext(new PickUpLocatorContract.Actions.LaunchLocationResult(suburb));
                    return;
                } finally {
                }
        }
    }
}
