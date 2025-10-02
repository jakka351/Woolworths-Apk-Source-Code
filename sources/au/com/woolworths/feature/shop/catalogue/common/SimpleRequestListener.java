package au.com.woolworths.feature.shop.catalogue.common;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/common/SimpleRequestListener;", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SimpleRequestListener implements RequestListener<Drawable> {
    public abstract void a();

    public abstract void b();

    @Override // com.bumptech.glide.request.RequestListener
    public final boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z) {
        Intrinsics.h(target, "target");
        a();
        return false;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final boolean onResourceReady(Object obj, Object model, Target target, DataSource dataSource, boolean z) {
        Intrinsics.h(model, "model");
        Intrinsics.h(dataSource, "dataSource");
        b();
        return false;
    }
}
