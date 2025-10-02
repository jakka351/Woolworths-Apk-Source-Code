package au.com.woolworths.foundation.shop.collectionmode;

import android.content.SharedPreferences;
import androidx.camera.camera2.interop.e;
import au.com.woolworths.android.onesite.AddressLevel;
import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.collectionmode.api.FulfilmentResponse;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.android.onesite.utils.Strings;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.models.address.AddressInput;
import au.com.woolworths.base.shopapp.models.address.AddressResult;
import au.com.woolworths.base.shopapp.models.address.DeleteAddressResult;
import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import au.com.woolworths.base.shopapp.modules.collectionmode.AddressInteractor;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.base.shopapp.modules.collectionmode.ShoppingModeApi;
import au.com.woolworths.feature.product.list.legacy.k;
import com.google.gson.Gson;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.internal.operators.completable.CompletableEmpty;
import io.reactivex.internal.operators.completable.CompletableFromSingle;
import io.reactivex.internal.operators.observable.ObservableFromCallable;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleFromCallable;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class LegacyShoppingModeRepositoryImpl implements LegacyShoppingModeRepository {

    /* renamed from: a, reason: collision with root package name */
    public final SchedulersProvider f8704a;
    public final SharedPreferences b;
    public final AccountInteractor c;
    public final ShoppingModeApi d;
    public final CollectionModeInteractor e;
    public final Gson f;
    public ArrayList g = null;
    public final AddressInteractor h;
    public final FeatureToggleManager i;

    public LegacyShoppingModeRepositoryImpl(SharedPreferences sharedPreferences, ShoppingModeApi shoppingModeApi, AccountInteractor accountInteractor, CollectionModeInteractor collectionModeInteractor, Gson gson, SchedulersProvider schedulersProvider, AddressInteractor addressInteractor, FeatureToggleManager featureToggleManager) {
        this.c = accountInteractor;
        this.d = shoppingModeApi;
        this.e = collectionModeInteractor;
        this.f8704a = schedulersProvider;
        this.b = sharedPreferences;
        this.f = gson;
        this.h = addressInteractor;
        this.i = featureToggleManager;
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final SingleObserveOn a(AddressResult.ManualAddressToSave manualAddressToSave) {
        Single<SaveAddressResult.Address> singleA;
        if (this.i.c(BaseShopAppFeature.n)) {
            singleA = this.h.c(new AddressInput(null, Boolean.valueOf(manualAddressToSave.e()), Boolean.valueOf(manualAddressToSave.f()), manualAddressToSave.a(), manualAddressToSave.b(), manualAddressToSave.c(), Integer.valueOf(manualAddressToSave.d())));
        } else {
            singleA = this.d.a(manualAddressToSave);
        }
        SchedulersProvider schedulersProvider = this.f8704a;
        return singleA.h(schedulersProvider.d()).f(schedulersProvider.b());
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final Observable b(String str) throws Exception {
        if (Strings.b(str)) {
            return Observable.e(new ArrayList());
        }
        Observable observableC = new ObservableFromCallable(new androidx.webkit.internal.a(str, 4)).c(new a(this, 0), Integer.MAX_VALUE).c(new au.com.woolworths.feature.shop.delivery.address.a(str, 23), Integer.MAX_VALUE);
        SchedulersProvider schedulersProvider = this.f8704a;
        return observableC.i(schedulersProvider.d()).f(schedulersProvider.b());
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final Observable c(String str) throws Exception {
        if (Strings.b(str)) {
            return Observable.e(new ArrayList());
        }
        Observable observableC = new ObservableFromCallable(new androidx.webkit.internal.a(str, 4)).c(new e(26, this, str), Integer.MAX_VALUE).c(new k(19), Integer.MAX_VALUE);
        SchedulersProvider schedulersProvider = this.f8704a;
        return observableC.i(schedulersProvider.d()).f(schedulersProvider.b());
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final SingleObserveOn d() {
        if (m() == null) {
            throw new NullPointerException("Delivery address cannot be null");
        }
        SaveAddressResult.Address addressM = m();
        HashMap map = new HashMap();
        map.put("address", String.valueOf(addressM.a()));
        Single<FulfilmentResponse> singleE = this.d.e(map);
        SchedulersProvider schedulersProvider = this.f8704a;
        return singleE.h(schedulersProvider.d()).f(schedulersProvider.b());
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final boolean e() {
        ArrayList arrayList = this.g;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final Completable f() {
        SaveAddressResult.Address addressM = m();
        return addressM == null ? CompletableEmpty.d : new CompletableFromSingle(new SingleFlatMap(a(new AddressResult.ManualAddressToSave(addressM.c(), addressM.d(), addressM.b(), addressM.e(), false, false)), new a(this, 2)));
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final void g(SaveAddressResult.Address address) {
        address.i(true);
        SaveAddressResult.Address addressM = m();
        if (addressM == null || addressM.a() != address.a()) {
            this.e.r(address.f());
            p(address);
        }
        if (addressM == null || addressM.a() == address.a()) {
            return;
        }
        ArrayList arrayList = this.g;
        if (arrayList != null && arrayList.size() > 0) {
            int i = 0;
            while (true) {
                if (i >= this.g.size()) {
                    i = -1;
                    break;
                } else if (((SaveAddressResult.Address) this.g.get(i)).a() == address.a()) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                this.g.remove(i);
            }
        }
        if (this.g == null) {
            this.g = new ArrayList();
            addressM.i(false);
            this.g.add(0, addressM);
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.g.size()) {
                i2 = -1;
                break;
            } else if (((SaveAddressResult.Address) this.g.get(i2)).a() == addressM.a()) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            addressM.i(false);
            this.g.add(0, addressM);
        }
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final SingleObserveOn h(SaveAddressResult.Address address) {
        SingleFromCallable singleFromCallable = new SingleFromCallable(new c(0, this, address));
        SchedulersProvider schedulersProvider = this.f8704a;
        return singleFromCallable.h(schedulersProvider.c()).f(schedulersProvider.b());
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final SingleObserveOn i(SaveAddressResult.Address address) {
        if (address == null) {
            throw new NullPointerException("Delivery address cannot be null");
        }
        HashMap map = new HashMap();
        map.put("address", String.valueOf(address.a()));
        Single<FulfilmentResponse> singleE = this.d.e(map);
        b bVar = new b(this, address, 1);
        singleE.getClass();
        SingleMap singleMap = new SingleMap(singleE, bVar);
        SchedulersProvider schedulersProvider = this.f8704a;
        return singleMap.h(schedulersProvider.d()).f(schedulersProvider.b());
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final Single j(SaveAddressResult.Address address) {
        ArrayList arrayList;
        if (address == null || address.g() || (arrayList = this.g) == null) {
            throw new IllegalArgumentException("Address is primary or is not present in previously known addresses");
        }
        if (!arrayList.contains(address)) {
            return Single.e(this.g);
        }
        Single<DeleteAddressResult> singleA = this.i.c(BaseShopAppFeature.n) ? this.h.a(Math.toIntExact(address.a())) : this.d.h(String.valueOf(address.a()));
        b bVar = new b(this, address, 0);
        singleA.getClass();
        SingleMap singleMap = new SingleMap(singleA, bVar);
        SchedulersProvider schedulersProvider = this.f8704a;
        return singleMap.h(schedulersProvider.d()).f(schedulersProvider.b());
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final SingleObserveOn k(AddressResult.Address address, boolean z, boolean z2) {
        Single<SaveAddressResult.Address> singleD;
        AddressResult.AmasAddressToSave amasAddressToSave = new AddressResult.AmasAddressToSave(address.a(), address.c(), z, z2);
        if (this.i.c(BaseShopAppFeature.n)) {
            singleD = this.h.c(new AddressInput(address.a(), Boolean.valueOf(z2), Boolean.valueOf(z), null, null, null, null));
        } else {
            singleD = this.d.d(amasAddressToSave);
        }
        SchedulersProvider schedulersProvider = this.f8704a;
        return singleD.h(schedulersProvider.d()).f(schedulersProvider.b());
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final SingleObserveOn l(SaveAddressResult.Address address) {
        if (address == null) {
            throw new NullPointerException("Delivery address cannot be null");
        }
        Single<SaveAddressResult.Address> singleG = this.d.g(new AddressResult.AlternateAddressToSave(address.a()));
        SchedulersProvider schedulersProvider = this.f8704a;
        return singleG.h(schedulersProvider.d()).f(schedulersProvider.b());
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final SaveAddressResult.Address m() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences.getString("delivery_address", null) == null) {
            return null;
        }
        return (SaveAddressResult.Address) this.f.d(SaveAddressResult.Address.class, sharedPreferences.getString("delivery_address", null));
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final AddressLevel n() {
        return m() != null ? AddressLevel.e : AddressLevel.d;
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository
    public final Single o(boolean z) {
        ArrayList arrayList = this.g;
        if (arrayList != null && !z) {
            return Single.e(arrayList);
        }
        Single<SaveAddressResult> singleB = this.i.c(BaseShopAppFeature.n) ? this.h.b() : this.d.f();
        SchedulersProvider schedulersProvider = this.f8704a;
        return new SingleMap(singleB.h(schedulersProvider.d()).f(schedulersProvider.b()), new a(this, 1));
    }

    public final void p(SaveAddressResult.Address address) {
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putString("delivery_address", this.f.k(address, SaveAddressResult.Address.class));
        editorEdit.apply();
    }
}
