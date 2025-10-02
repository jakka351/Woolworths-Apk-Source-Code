package com.woolworths.scanlibrary.ui.home.homeview;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.configuration.AppConfigurations;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.ui.home.homeview.HomeContract;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/homeview/HomePresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/home/homeview/HomeContract$View;", "Lcom/woolworths/scanlibrary/ui/home/homeview/HomeContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {
    public final AuthenticatedUser c;
    public final Store d;
    public final FeatureToggleManager e;
    public final AppConfigurations f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePresenter(HomeContract.View view, AuthenticatedUser authenticatedUser, Store currentStore, FeatureToggleManager featureToggleManager, AppConfigurations appConfigurations) {
        super(view);
        Intrinsics.h(currentStore, "currentStore");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.c = authenticatedUser;
        this.d = currentStore;
        this.e = featureToggleManager;
        this.f = appConfigurations;
    }

    @Override // com.woolworths.scanlibrary.base.BasePresenter, com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void M0() {
        HomeContract.View view = (HomeContract.View) this.f21139a;
        view.r2(this.d.getName());
        String strB = this.c.b();
        Locale locale = Locale.getDefault();
        Intrinsics.g(locale, "getDefault(...)");
        if (strB.length() > 0) {
            char cCharAt = strB.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(cCharAt);
                if (titleCase != Character.toUpperCase(cCharAt)) {
                    sb.append(titleCase);
                } else {
                    String strSubstring = strB.substring(0, 1);
                    Intrinsics.g(strSubstring, "substring(...)");
                    String upperCase = strSubstring.toUpperCase(locale);
                    Intrinsics.g(upperCase, "toUpperCase(...)");
                    sb.append(upperCase);
                }
                String strSubstring2 = strB.substring(1);
                Intrinsics.g(strSubstring2, "substring(...)");
                sb.append(strSubstring2);
                strB = sb.toString();
            }
        }
        view.B1(strB);
    }

    @Override // com.woolworths.scanlibrary.ui.home.homeview.HomeContract.Presenter
    public final boolean P0() {
        AppConfigurations appConfigurations = this.f;
        return ((Boolean) appConfigurations.f21147a.getValue(appConfigurations, AppConfigurations.b[1])).booleanValue();
    }
}
