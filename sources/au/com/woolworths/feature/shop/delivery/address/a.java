package au.com.woolworths.feature.shop.delivery.address;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.lifecycle.compose.b;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.models.address.SuburbResult;
import au.com.woolworths.feature.shop.homepage.presentation.HomeController;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel;
import au.com.woolworths.feature.shop.homepage.presentation.j;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.d;
import au.com.woolworths.feature.shop.login.c;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceContract;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceFragment;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplacePagerAdapter;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultActivity;
import au.com.woolworths.foundation.barcode.reader.BarcodeReader;
import au.com.woolworths.foundation.barcode.reader.mlkit.MlKitBarcodeScannerView;
import au.com.woolworths.foundation.barcode.reader.view.BarcodeReaderActivity;
import au.com.woolworths.product.ItemProductCardTileBindingModel_;
import au.com.woolworths.product.details.ItemHealthierProductCardBindingModel_;
import au.com.woolworths.product.details.ProductDetailsEpoxyController;
import au.com.woolworths.product.details.models.HealthierOption;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.swrve.sdk.SwrveResourcesListener;
import io.reactivex.MaybeOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Consumer, OnModelBoundListener, Function, Predicate, TabLayoutMediator.TabConfigurationStrategy, SwrveResourcesListener, OnSuccessListener, MaybeOnSubscribe {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.swrve.sdk.SwrveResourcesListener
    public void a() {
        ((ProducerScope) this.e).k(Unit.f24250a);
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) throws Exception {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a) obj2).invoke(obj);
                break;
            case 1:
            case 7:
            case 9:
            case 12:
            case 13:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                ((au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a) obj2).invoke(obj);
                break;
            case 2:
                ((j) obj2).invoke(obj);
                break;
            case 3:
                ((j) obj2).invoke(obj);
                break;
            case 4:
                ((HomePageViewModel) obj2).v6();
                break;
            case 5:
                ((c) obj2).invoke(obj);
                break;
            case 6:
                ((c) obj2).invoke(obj);
                break;
            case 8:
                ((au.com.woolworths.feature.shop.login.guest.a) obj2).invoke(obj);
                break;
            case 10:
                ((b) obj2).invoke(obj);
                break;
            case 11:
                ((au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a) obj2).invoke(obj);
                break;
            case 14:
                ((au.com.woolworths.feature.shop.instore.navigation.map.utils.a) obj2).invoke(obj);
                break;
            case 15:
                int i2 = PickUpLocationResultActivity.I;
                ((au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.a) obj2).invoke(obj);
                break;
            case 16:
                ((au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.b) obj2).invoke(obj);
                break;
            case 17:
                ((au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.b) obj2).invoke(obj);
                break;
            case 25:
                ((au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a) obj2).invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public Object mo0apply(Object p0) {
        switch (this.d) {
            case 7:
                au.com.woolworths.feature.shop.login.guest.a aVar = (au.com.woolworths.feature.shop.login.guest.a) this.e;
                Intrinsics.h(p0, "p0");
                break;
            case 23:
                String str = (String) this.e;
                SuburbResult suburbResult = (SuburbResult) p0;
                if (suburbResult.a() == null || suburbResult.a().size() <= 0) {
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (SuburbResult.Suburb suburb : suburbResult.a()) {
                        suburb.c(str);
                        arrayList.add(suburb);
                    }
                    break;
                }
            case 24:
                break;
        }
        return (Result) ((au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a) this.e).invoke(p0);
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void c(TabLayout.Tab tab, int i) {
        tab.b(((MarketplaceContract.Tab) ((MarketplacePagerAdapter) ((MarketplaceFragment) this.e).l.getD()).p.get(i)).f7492a);
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void g(int i, EpoxyModel epoxyModel, Object obj) {
        switch (this.d) {
            case 1:
                HomeController.buildProductCardTile$lambda$13$lambda$12((HomeController) this.e, (ItemProductCardTileBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            default:
                ProductDetailsEpoxyController.buildHealthierHorizontalList$lambda$17$lambda$15((HealthierOption) this.e, (ItemHealthierProductCardBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.appcompat.app.AppCompatActivity, au.com.woolworths.foundation.barcode.reader.BarcodeScanningHandler] */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ?? r0;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 19:
                ((au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a) obj2).invoke(obj);
                return;
            case 20:
                ((au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a) obj2).invoke(obj);
                return;
            case 21:
                MlKitBarcodeScannerView mlKitBarcodeScannerView = (MlKitBarcodeScannerView) obj2;
                List list = (List) obj;
                int i2 = MlKitBarcodeScannerView.m;
                Intrinsics.e(list);
                if (list.isEmpty() || (r0 = mlKitBarcodeScannerView.j) == 0) {
                    return;
                }
                r0.h2(list);
                return;
            default:
                BarcodeReaderActivity barcodeReaderActivity = (BarcodeReaderActivity) obj2;
                List list2 = (List) obj;
                String[] strArr = BarcodeReaderActivity.z;
                Intrinsics.e(list2);
                Barcode barcode = (Barcode) CollectionsKt.F(list2);
                if (barcode == null || barcode.f15990a.c() == null || barcodeReaderActivity.y) {
                    return;
                }
                BarcodeReader.BarcodeValidator barcodeValidator = barcodeReaderActivity.x;
                BarcodeReader.BarcodeScanResult barcodeScanResult = barcodeValidator == null ? new BarcodeReader.BarcodeScanResult() : barcodeValidator.validate();
                if (barcodeScanResult != null) {
                    barcodeReaderActivity.y = true;
                    ResultReceiver resultReceiver = barcodeReaderActivity.v;
                    if (resultReceiver == null) {
                        Intrinsics.p("resultReceiver");
                        throw null;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("extra_result_uri", barcodeScanResult);
                    resultReceiver.send(-1, bundle);
                    barcodeReaderActivity.finish();
                    return;
                }
                return;
        }
    }

    @Override // io.reactivex.functions.Predicate
    public boolean test(Object p0) {
        switch (this.d) {
            case 9:
                d dVar = (d) this.e;
                Intrinsics.h(p0, "p0");
                dVar.invoke(p0);
                return Boolean.TRUE.booleanValue();
            default:
                d dVar2 = (d) this.e;
                Intrinsics.h(p0, "p0");
                return ((Boolean) dVar2.invoke(p0)).booleanValue();
        }
    }
}
