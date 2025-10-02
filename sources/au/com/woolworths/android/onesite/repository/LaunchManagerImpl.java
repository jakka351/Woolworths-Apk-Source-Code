package au.com.woolworths.android.onesite.repository;

import au.com.woolworths.android.onesite.AddressLevel;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import au.com.woolworths.android.onesite.utils.Strings;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.storelocator.PickUpLocatorRepository;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.Lazy;

/* loaded from: classes3.dex */
public class LaunchManagerImpl implements LaunchManager {

    /* renamed from: a, reason: collision with root package name */
    public Lazy f4586a;
    public Lazy b;
    public Lazy c;
    public Lazy d;
    public Lazy e;
    public PreferencesManager f;
    public LaunchManager.LaunchState g;
    public FeatureToggleManager h;
    public PickUpLocatorRepository i;

    @Override // au.com.woolworths.android.onesite.repository.LaunchManager
    public final void a(LaunchManager.LaunchState launchState) {
        this.g = launchState;
        this.f.i(launchState);
    }

    @Override // au.com.woolworths.android.onesite.repository.LaunchManager
    public final boolean b() {
        Lazy lazy = this.d;
        CollectionMode collectionModeW = ((CollectionModeInteractor) this.b.get()).w();
        if (!(collectionModeW instanceof CollectionMode.Delivery)) {
            return collectionModeW instanceof CollectionMode.PickUp ? this.i.a() != null : (collectionModeW instanceof CollectionMode.InStore) && ((RepositoryManager) this.c.get()).d();
        }
        ((LegacyShoppingModeRepository) lazy.get()).n();
        return ((LegacyShoppingModeRepository) lazy.get()).n() != AddressLevel.d;
    }

    @Override // au.com.woolworths.android.onesite.repository.LaunchManager
    public final void c() {
        Lazy lazy = this.f4586a;
        PreferencesManager preferencesManager = this.f;
        LaunchManager.LaunchState launchState = this.g;
        LaunchManager.LaunchState launchState2 = LaunchManager.LaunchState.h;
        if (launchState == launchState2) {
            return;
        }
        this.g = LaunchManager.LaunchState.d;
        if (preferencesManager.f()) {
            this.g = launchState2;
            preferencesManager.h();
        } else {
            boolean zD = ((ShopAccountInteractor) this.e.get()).d();
            LaunchManager.LaunchState launchState3 = LaunchManager.LaunchState.e;
            if (zD) {
                this.g = launchState3;
            }
            LaunchManager.LaunchState launchState4 = this.g;
            RewardsCardData cardData = ((RewardsAccountInteractor) lazy.get()).getCardData();
            LaunchManager.LaunchState launchState5 = LaunchManager.LaunchState.f;
            if (cardData != null && !Strings.b(((RewardsAccountInteractor) lazy.get()).getCardData().getNumber())) {
                launchState4 = launchState5;
            }
            LaunchManager.LaunchState launchState6 = this.g;
            boolean zB = b();
            LaunchManager.LaunchState launchState7 = LaunchManager.LaunchState.g;
            if (zB) {
                launchState6 = launchState7;
            }
            LaunchManager.LaunchState launchState8 = this.g;
            if (launchState8 == launchState3 && launchState6 == launchState7 && launchState4 == launchState5) {
                this.g = launchState2;
            } else if (launchState6 != launchState8) {
                this.g = launchState6;
            } else if (launchState4 != launchState8) {
                this.g = launchState4;
            }
        }
        a(this.g);
    }

    @Override // au.com.woolworths.android.onesite.repository.LaunchManager
    public final LaunchManager.LaunchState d() {
        LaunchManager.LaunchState launchState = this.g;
        if (launchState == null || launchState == LaunchManager.LaunchState.d) {
            c();
        }
        return this.g;
    }
}
