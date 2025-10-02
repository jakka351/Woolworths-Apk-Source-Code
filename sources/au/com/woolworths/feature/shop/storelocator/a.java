package au.com.woolworths.feature.shop.storelocator;

import au.com.woolworths.feature.shop.storelocator.StoreLocatorContract;
import au.com.woolworths.feature.shop.storelocator.databinding.ActivityStoreLocatorBinding;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import com.airbnb.epoxy.DiffResult;
import com.airbnb.epoxy.OnModelBuildFinishedListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ StoreLocatorActivity e;

    public /* synthetic */ a(StoreLocatorActivity storeLocatorActivity, int i) {
        this.d = i;
        this.e = storeLocatorActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.d;
        Unit unit = Unit.f24250a;
        final StoreLocatorActivity storeLocatorActivity = this.e;
        switch (i2) {
            case 0:
                StoreLocatorContract.ViewState viewState = (StoreLocatorContract.ViewState) obj;
                int i3 = StoreLocatorActivity.J;
                if (viewState.b == StoreLocatorContract.StoreListDisplayMode.e && storeLocatorActivity.F == null) {
                    ((SupportMapFragment) storeLocatorActivity.E.getD()).getMapAsync(storeLocatorActivity);
                }
                int iOrdinal = viewState.b.ordinal();
                if (iOrdinal == 0) {
                    i = com.woolworths.R.id.list_mode_button;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = com.woolworths.R.id.map_mode_button;
                }
                ActivityStoreLocatorBinding activityStoreLocatorBinding = storeLocatorActivity.C;
                if (activityStoreLocatorBinding == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                activityStoreLocatorBinding.G.b(i, true);
                StoreLocatorEpoxyController storeLocatorEpoxyController = storeLocatorActivity.G;
                if (storeLocatorEpoxyController == null) {
                    Intrinsics.p("epoxyController");
                    throw null;
                }
                storeLocatorEpoxyController.setData(viewState, storeLocatorActivity.O4().l);
                StoreLocatorEpoxyController storeLocatorEpoxyController2 = storeLocatorActivity.G;
                if (storeLocatorEpoxyController2 != null) {
                    storeLocatorEpoxyController2.addModelBuildListener(new OnModelBuildFinishedListener() { // from class: au.com.woolworths.feature.shop.storelocator.e
                        @Override // com.airbnb.epoxy.OnModelBuildFinishedListener
                        public final void a(DiffResult it) {
                            int i4 = StoreLocatorActivity.J;
                            Intrinsics.h(it, "it");
                            ActivityStoreLocatorBinding activityStoreLocatorBinding2 = storeLocatorActivity.C;
                            if (activityStoreLocatorBinding2 != null) {
                                activityStoreLocatorBinding2.z.o0(0);
                            } else {
                                Intrinsics.p("binding");
                                throw null;
                            }
                        }
                    });
                    return unit;
                }
                Intrinsics.p("epoxyController");
                throw null;
            default:
                StoreLocatorContract.MapState mapState = (StoreLocatorContract.MapState) obj;
                GoogleMap googleMap = storeLocatorActivity.F;
                if (googleMap == null) {
                    Intrinsics.p("googleMap");
                    throw null;
                }
                googleMap.clear();
                if (!mapState.f8126a.isEmpty()) {
                    LatLngBounds.Builder builder = LatLngBounds.builder();
                    Intrinsics.g(builder, "builder(...)");
                    for (Store store : mapState.f8126a) {
                        LatLng latLng = new LatLng(store.h, store.i);
                        builder.include(latLng);
                        String string = storeLocatorActivity.getString(com.woolworths.R.string.marker_content_description, store.f, store.g);
                        Intrinsics.g(string, "getString(...)");
                        GoogleMap googleMap2 = storeLocatorActivity.F;
                        if (googleMap2 == null) {
                            Intrinsics.p("googleMap");
                            throw null;
                        }
                        Marker markerAddMarker = googleMap2.addMarker(new MarkerOptions().position(latLng).icon(BitmapDescriptorFactory.fromResource(store.e.b())).title(string));
                        if (markerAddMarker != null) {
                            markerAddMarker.setTag(store);
                        }
                    }
                    GoogleMap googleMap3 = storeLocatorActivity.F;
                    if (googleMap3 == null) {
                        Intrinsics.p("googleMap");
                        throw null;
                    }
                    googleMap3.animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), storeLocatorActivity.getResources().getDimensionPixelSize(com.woolworths.R.dimen.double_default_padding)));
                }
                return unit;
        }
    }
}
