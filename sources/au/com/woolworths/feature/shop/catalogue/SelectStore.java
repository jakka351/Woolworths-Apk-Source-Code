package au.com.woolworths.feature.shop.catalogue;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/SelectStore;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/os/Parcelable;", "Lau/com/woolworths/feature/shop/catalogue/CatalogueStoreSelectionResult;", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SelectStore extends ActivityResultContract<Parcelable, CatalogueStoreSelectionResult> {

    /* renamed from: a, reason: collision with root package name */
    public final Class f6783a;
    public final String b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/SelectStore$Companion;", "", "", "EXTRA_STORE_INFO", "Ljava/lang/String;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public SelectStore() {
        this.f6783a = CatalogueStoreSelectorActivity.class;
        this.b = null;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Parcelable parcelable = (Parcelable) obj;
        Intent intent = new Intent(context, (Class<?>) this.f6783a);
        if (parcelable != null) {
            intent.putExtra(this.b, parcelable);
        }
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final CatalogueStoreSelectionResult parseResult(int i, Intent intent) {
        return new CatalogueStoreSelectionResult(i, intent != null ? (CatalogueStoreInfo) intent.getParcelableExtra("extra_store_info") : null);
    }

    public SelectStore(Class cls, String str) {
        this.f6783a = cls;
        this.b = str;
    }
}
