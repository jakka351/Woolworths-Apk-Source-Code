package au.com.woolworths.feature.shop.myorders.details.substitutionrating;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferencesKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/substitutionrating/SubstitutionRatingRepository;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SubstitutionRatingRepository {

    /* renamed from: a, reason: collision with root package name */
    public final DataStore f7790a;

    @Inject
    public SubstitutionRatingRepository(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f7790a = (DataStore) SubstitutionRatingDataStoreKt.b.getValue(context, SubstitutionRatingDataStoreKt.f7789a[0]);
    }

    public final Object a(String str, String str2, boolean z, Continuation continuation) {
        Object objA = PreferencesKt.a(this.f7790a, new SubstitutionRatingRepository$addSubstitutionRating$2(str, str2, z, null), continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
