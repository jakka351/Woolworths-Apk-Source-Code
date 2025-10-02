package au.com.woolworths.feature.rewards.offers.listpage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractorKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsActivity;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsActivityLegacy;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageActivity;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel;
import au.com.woolworths.feature.rewards.offers.listpage.ui.OffersListPageScreenKt;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OfferListPageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Page", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferListPageActivity extends Hilt_OfferListPageActivity {
    public FeatureToggleManager x;
    public RewardsAccountInteractor y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(OfferListPageViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.OfferListPageActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.OfferListPageActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.OfferListPageActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final OfferListPageActivity offerListPageActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<OfferListPageViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.OfferListPageActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    OfferListPageViewModel.Factory factory = (OfferListPageViewModel.Factory) obj;
                    Intent intent = offerListPageActivity.getIntent();
                    Intrinsics.g(intent, "getIntent(...)");
                    if (Build.VERSION.SDK_INT >= 33) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            parcelable = (Parcelable) extras.getParcelable("ArgOfferListPage", OfferListPageActivity.Page.class);
                        }
                    } else {
                        Bundle extras2 = intent.getExtras();
                        Parcelable parcelable = extras2 != null ? extras2.getParcelable("ArgOfferListPage") : null;
                        parcelable = (OfferListPageActivity.Page) (parcelable instanceof OfferListPageActivity.Page ? parcelable : null);
                    }
                    OfferListPageActivity.Page page = (OfferListPageActivity.Page) parcelable;
                    if (page != null) {
                        return factory.a(page.d, page.e);
                    }
                    throw new IllegalArgumentException("ArgOfferListPage must be provided");
                }
            });
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OfferListPageActivity$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OfferListPageActivity$Page;", "Landroid/os/Parcelable;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Page implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Page> CREATOR = new Creator();
        public final String d;
        public final String e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Page> {
            @Override // android.os.Parcelable.Creator
            public final Page createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Page(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Page[] newArray(int i) {
                return new Page[i];
            }
        }

        public Page(String pageName, String title) {
            Intrinsics.h(pageName, "pageName");
            Intrinsics.h(title, "title");
            this.d = pageName;
            this.e = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Page)) {
                return false;
            }
            Page page = (Page) obj;
            return Intrinsics.c(this.d, page.d) && Intrinsics.c(this.e, page.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Page(pageName=", this.d, ", title=", this.e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6354a;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion2 = Region.h;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6354a = iArr;
        }
    }

    @Override // au.com.woolworths.feature.rewards.offers.listpage.Hilt_OfferListPageActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.b(this);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.OfferListPageActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final OfferListPageActivity offerListPageActivity = OfferListPageActivity.this;
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(1480991406, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.OfferListPageActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final OfferListPageActivity offerListPageActivity2 = offerListPageActivity;
                                OfferListPageViewModel offerListPageViewModel = (OfferListPageViewModel) offerListPageActivity2.z.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(offerListPageActivity2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    final int i = 0;
                                    objG = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.listpage.a
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            boolean zC;
                                            int i2 = i;
                                            Unit unit = Unit.f24250a;
                                            OfferListPageActivity offerListPageActivity3 = offerListPageActivity2;
                                            String url = (String) obj6;
                                            switch (i2) {
                                                case 0:
                                                    Intrinsics.h(url, "url");
                                                    ContextExtKt.e(offerListPageActivity3, url);
                                                    return unit;
                                                default:
                                                    Intrinsics.h(url, "offerId");
                                                    RewardsAccountInteractor rewardsAccountInteractor = offerListPageActivity3.y;
                                                    if (rewardsAccountInteractor == null) {
                                                        Intrinsics.p("rewardsAccountInteractor");
                                                        throw null;
                                                    }
                                                    Region regionA = RewardsAccountInteractorKt.a(rewardsAccountInteractor);
                                                    int i3 = regionA == null ? -1 : OfferListPageActivity.WhenMappings.f6354a[regionA.ordinal()];
                                                    if (i3 == 1) {
                                                        FeatureToggleManager featureToggleManager = offerListPageActivity3.x;
                                                        if (featureToggleManager == null) {
                                                            Intrinsics.p("featureToggleManager");
                                                            throw null;
                                                        }
                                                        zC = featureToggleManager.c(RewardsBaseFeature.m);
                                                    } else if (i3 != 2) {
                                                        zC = false;
                                                    } else {
                                                        FeatureToggleManager featureToggleManager2 = offerListPageActivity3.x;
                                                        if (featureToggleManager2 == null) {
                                                            Intrinsics.p("featureToggleManager");
                                                            throw null;
                                                        }
                                                        zC = featureToggleManager2.c(RewardsBaseFeature.l);
                                                    }
                                                    if (zC) {
                                                        int i4 = OfferDetailsActivity.x;
                                                        OfferDetailsActivity.Companion.a(offerListPageActivity3, url);
                                                    } else {
                                                        int i5 = RewardsOfferDetailsActivityLegacy.x;
                                                        RewardsOfferDetailsActivityLegacy.Companion.a(offerListPageActivity3, url);
                                                    }
                                                    return unit;
                                            }
                                        }
                                    };
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(offerListPageActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == obj5) {
                                    objG2 = new f(offerListPageActivity2, 1);
                                    composer2.A(objG2);
                                }
                                Function0 function0 = (Function0) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(offerListPageActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == obj5) {
                                    final int i2 = 1;
                                    objG3 = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.listpage.a
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            boolean zC;
                                            int i22 = i2;
                                            Unit unit = Unit.f24250a;
                                            OfferListPageActivity offerListPageActivity3 = offerListPageActivity2;
                                            String url = (String) obj6;
                                            switch (i22) {
                                                case 0:
                                                    Intrinsics.h(url, "url");
                                                    ContextExtKt.e(offerListPageActivity3, url);
                                                    return unit;
                                                default:
                                                    Intrinsics.h(url, "offerId");
                                                    RewardsAccountInteractor rewardsAccountInteractor = offerListPageActivity3.y;
                                                    if (rewardsAccountInteractor == null) {
                                                        Intrinsics.p("rewardsAccountInteractor");
                                                        throw null;
                                                    }
                                                    Region regionA = RewardsAccountInteractorKt.a(rewardsAccountInteractor);
                                                    int i3 = regionA == null ? -1 : OfferListPageActivity.WhenMappings.f6354a[regionA.ordinal()];
                                                    if (i3 == 1) {
                                                        FeatureToggleManager featureToggleManager = offerListPageActivity3.x;
                                                        if (featureToggleManager == null) {
                                                            Intrinsics.p("featureToggleManager");
                                                            throw null;
                                                        }
                                                        zC = featureToggleManager.c(RewardsBaseFeature.m);
                                                    } else if (i3 != 2) {
                                                        zC = false;
                                                    } else {
                                                        FeatureToggleManager featureToggleManager2 = offerListPageActivity3.x;
                                                        if (featureToggleManager2 == null) {
                                                            Intrinsics.p("featureToggleManager");
                                                            throw null;
                                                        }
                                                        zC = featureToggleManager2.c(RewardsBaseFeature.l);
                                                    }
                                                    if (zC) {
                                                        int i4 = OfferDetailsActivity.x;
                                                        OfferDetailsActivity.Companion.a(offerListPageActivity3, url);
                                                    } else {
                                                        int i5 = RewardsOfferDetailsActivityLegacy.x;
                                                        RewardsOfferDetailsActivityLegacy.Companion.a(offerListPageActivity3, url);
                                                    }
                                                    return unit;
                                            }
                                        }
                                    };
                                    composer2.A(objG3);
                                }
                                composer2.l();
                                OffersListPageScreenKt.a(offerListPageViewModel, function1, function0, (Function1) objG3, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -149399263));
    }
}
