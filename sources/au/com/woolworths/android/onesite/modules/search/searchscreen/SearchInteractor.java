package au.com.woolworths.android.onesite.modules.search.searchscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.appdata.AppBuildConfig;
import au.com.woolworths.android.onesite.network.ApiInterface;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchInteractor;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final AppBuildConfig f4424a;
    public final ApiInterface b;
    public final SchedulersProvider c;

    public SearchInteractor(AppBuildConfig appBuildConfig, ApiInterface apiInterface, SchedulersProvider schedulersProvider) {
        Intrinsics.h(appBuildConfig, "appBuildConfig");
        Intrinsics.h(apiInterface, "apiInterface");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        this.f4424a = appBuildConfig;
        this.b = apiInterface;
        this.c = schedulersProvider;
    }
}
