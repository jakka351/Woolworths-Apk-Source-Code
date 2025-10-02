package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderRepositoryImpl;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderRepository;", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductFinderRepositoryImpl implements ProductFinderRepository {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f7437a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderRepositoryImpl$Companion;", "", "", "KEY_PRODUCT_FINDER_HUB_ONBOARDING_SHOWN", "Ljava/lang/String;", "KEY_TAPPABLE_AISLE_FEATURE_HIGHLIGHT_SHOWN", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductFinderRepositoryImpl(SharedPreferences sharedPreferences) {
        this.f7437a = sharedPreferences;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderRepository
    public final boolean a() {
        return this.f7437a.getBoolean("productFinderHubOnboardingShown", false);
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderRepository
    public final void b() {
        SharedPreferences.Editor editorEdit = this.f7437a.edit();
        editorEdit.putBoolean("productFinderHubOnboardingShown", true);
        editorEdit.commit();
    }
}
