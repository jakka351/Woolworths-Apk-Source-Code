package au.com.woolworths.shop.lists.data.sync;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.impl.WorkManagerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/ShoppingListSyncRepository;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShoppingListSyncRepository {

    /* renamed from: a, reason: collision with root package name */
    public final WorkManagerImpl f12286a;
    public final Constraints b;

    public ShoppingListSyncRepository(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f12286a = WorkManager.Companion.a(context);
        Constraints.Builder builder = new Constraints.Builder();
        builder.b(NetworkType.e);
        this.b = builder.a();
    }
}
