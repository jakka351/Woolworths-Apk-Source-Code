package au.com.woolworths.feature.shop.homepage.presentation;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "Lau/com/woolworths/feature/shop/homepage/presentation/ConnectionErrorState;", "Lau/com/woolworths/feature/shop/homepage/presentation/ServerErrorState;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class HomePageErrorState implements FullPageErrorCause {
    public abstract void a(HomePageViewModel homePageViewModel);

    public abstract void b(HomePageViewModel homePageViewModel);
}
