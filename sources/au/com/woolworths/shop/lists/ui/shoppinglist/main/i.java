package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.core.state.a;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics;
import au.com.woolworths.analytics.supers.specials.SpecialsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.utils.TextViewExtKt;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MemberPriceInfoKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardKt;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.graphql.type.AlternativeProductsMode;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel;
import au.com.woolworths.shop.product.details.ProductDetailsContract;
import au.com.woolworths.shop.product.details.ProductDetailsEvent;
import au.com.woolworths.shop.product.details.ProductDetailsViewModel;
import au.com.woolworths.shop.product.details.data.ButtonActionData;
import au.com.woolworths.shop.product.details.data.ButtonData;
import au.com.woolworths.shop.product.details.data.FooterButtonAction;
import au.com.woolworths.shop.product.details.data.NutritionInfo;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowAccordion;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowLink;
import au.com.woolworths.shop.product.details.data.ProductImage;
import au.com.woolworths.shop.productcard.data.MarketplaceInfo;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler;
import au.com.woolworths.shop.ratingsandreviews.data.Cta;
import au.com.woolworths.shop.rewards.promo.PromoAppActivity;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import au.com.woolworths.shop.specials.SpecialsHomeViewModelKt;
import coil3.Image;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.base.mvvm.CommonViewAction;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.data.launch.ScanAndGoUserData;
import com.woolworths.scanlibrary.databinding.ActivityAvailableStoresBinding;
import com.woolworths.scanlibrary.databinding.FragmentTapOnBinding;
import com.woolworths.scanlibrary.domain.cart.AddToCartUseCase;
import com.woolworths.scanlibrary.domain.cart.CheckoutCartUseCase;
import com.woolworths.scanlibrary.domain.cart.ClearCartUseCase;
import com.woolworths.scanlibrary.domain.cart.GetCartUseCase;
import com.woolworths.scanlibrary.domain.launch.FetchScanAndGoInteractor;
import com.woolworths.scanlibrary.domain.login.SignInUC;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.domain.productsearch.AutoCompleteUC;
import com.woolworths.scanlibrary.models.authentication.Token;
import com.woolworths.scanlibrary.models.cart.CartResponse;
import com.woolworths.scanlibrary.models.cart.Coupon;
import com.woolworths.scanlibrary.models.cart.CouponStatus;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.cart.ShoppingCartActivity;
import com.woolworths.scanlibrary.ui.cart.ShoppingCartContract;
import com.woolworths.scanlibrary.ui.checkout.CheckOutActivity;
import com.woolworths.scanlibrary.ui.splash.SngInitializerActivity;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreContract;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreViewModel;
import com.woolworths.scanlibrary.ui.stores.AvailableStoresActivity;
import com.woolworths.scanlibrary.ui.stores.AvailableStoresActivity$getAvailableStoreLocationListView$1;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import com.woolworths.scanlibrary.ui.tap.analytics.TapOnActionData;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnPresenter;
import com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner;
import com.woolworths.scanlibrary.util.exceptions.ErrorHandlingDelegate;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.payment.DefaultRetryService;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.StringSerializer;
import okhttp3.WebSocket;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(DefaultRetryService defaultRetryService, Retryable retryable) {
        this.d = 23;
        this.e = retryable;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnalyticsData analyticsData;
        AnalyticsData analyticsData2;
        AnalyticsData analyticsData3;
        AnalyticsData analyticsData4;
        AnalyticsData analyticsData5;
        AnalyticsData analytics;
        AnalyticsData analytics2;
        AnalyticsData analytics3;
        String strH;
        int i = this.d;
        TapOnContract.ViewState.TIMEOUT_LOCATE_TAP_ON_DEVICE timeout_locate_tap_on_device = TapOnContract.ViewState.TIMEOUT_LOCATE_TAP_ON_DEVICE.f21354a;
        int i2 = 2;
        z = true;
        boolean z = true;
        Unit unit = Unit.f24250a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return ShoppingListDetailsListController.buildListDetailsEmptyScreen$lambda$2((ShoppingListDetailsListController) obj2, (String) obj);
            case 1:
                ViewSimilarProductsActivity viewSimilarProductsActivity = (ViewSimilarProductsActivity) obj2;
                String it = (String) obj;
                int i3 = ViewSimilarProductsActivity.C;
                Intrinsics.h(it, "it");
                ViewSimilarProductsViewModel viewSimilarProductsViewModelT4 = viewSimilarProductsActivity.T4();
                AlternativeProductsMode alternativeProductsMode = (AlternativeProductsMode) viewSimilarProductsActivity.B.getD();
                Intrinsics.h(alternativeProductsMode, "alternativeProductsMode");
                viewSimilarProductsViewModelT4.t6(it, alternativeProductsMode);
                return unit;
            case 2:
                ProductDetailsViewModel productDetailsViewModel = (ProductDetailsViewModel) obj2;
                SharedFlowImpl sharedFlowImpl = productDetailsViewModel.s;
                ProductDetailsEvent event = (ProductDetailsEvent) obj;
                Intrinsics.h(event, "event");
                if (event instanceof ProductDetailsEvent.OnAlertActionClick) {
                    ActionData actionData = ((ProductDetailsEvent.OnAlertActionClick) event).f12568a;
                    if (actionData != null && (analytics3 = actionData.getAnalytics()) != null) {
                        productDetailsViewModel.C6(AnalyticsDataKt.a(analytics3));
                    }
                    if (actionData != null) {
                        sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchLink(actionData.getAction()));
                    }
                } else if (event instanceof ProductDetailsEvent.OnProductRowActionClick) {
                    ActionData actionData2 = ((ProductDetailsEvent.OnProductRowActionClick) event).f12582a;
                    if (actionData2 != null && (analytics2 = actionData2.getAnalytics()) != null) {
                        productDetailsViewModel.C6(AnalyticsDataKt.a(analytics2));
                    }
                    if (actionData2 != null) {
                        sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchLink(actionData2.getAction()));
                    }
                } else if (event instanceof ProductDetailsEvent.OnWriteReviewClick) {
                    ProductDetailsEvent.OnWriteReviewClick onWriteReviewClick = (ProductDetailsEvent.OnWriteReviewClick) event;
                    String link = onWriteReviewClick.f12588a;
                    final String linkLabel = onWriteReviewClick.b;
                    Intrinsics.h(link, "link");
                    Intrinsics.h(linkLabel, "linkLabel");
                    final ProductDetailsAnalytics.Details.Action action = new ProductDetailsAnalytics.Details(productDetailsViewModel.x6()).g;
                    action.getClass();
                    productDetailsViewModel.C6(new Event(action, linkLabel) { // from class: au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics$Details$Action$ratingsAndReviewsSummaryButtonClicked$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                            spreadBuilder.b(action.f4045a.f);
                            androidx.constraintlayout.core.state.a.z("event.Category", "Product Ratings and Reviews", spreadBuilder, "event.Action", "link_click");
                            androidx.constraintlayout.core.state.a.y("event.Label", String.valueOf(linkLabel), spreadBuilder);
                            ArrayList arrayList = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getE() {
                            return "productratings&reviews_linkclick";
                        }

                        public final boolean equals(Object obj3) {
                            if (!(obj3 instanceof Event)) {
                                return false;
                            }
                            Event event2 = (Event) obj3;
                            return "productratings&reviews_linkclick".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    });
                    sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchLink(link));
                } else if (event instanceof ProductDetailsEvent.OnReadReviewsClick) {
                    String str = ((ProductDetailsEvent.OnReadReviewsClick) event).f12583a;
                    final ProductDetailsAnalytics.Details.Action action2 = new ProductDetailsAnalytics.Details(productDetailsViewModel.x6()).g;
                    action2.getClass();
                    final String str2 = "read reviews";
                    productDetailsViewModel.C6(new Event(action2, str2) { // from class: au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics$Details$Action$ratingsAndReviewsSummaryButtonClicked$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                            spreadBuilder.b(action2.f4045a.f);
                            androidx.constraintlayout.core.state.a.z("event.Category", "Product Ratings and Reviews", spreadBuilder, "event.Action", "link_click");
                            androidx.constraintlayout.core.state.a.y("event.Label", String.valueOf(str2), spreadBuilder);
                            ArrayList arrayList = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getE() {
                            return "productratings&reviews_linkclick";
                        }

                        public final boolean equals(Object obj3) {
                            if (!(obj3 instanceof Event)) {
                                return false;
                            }
                            Event event2 = (Event) obj3;
                            return "productratings&reviews_linkclick".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    });
                    sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchLink(str));
                } else if (event instanceof ProductDetailsEvent.OnAccordionClicked) {
                    ProductDetailsEvent.OnAccordionClicked onAccordionClicked = (ProductDetailsEvent.OnAccordionClicked) event;
                    boolean z2 = onAccordionClicked.f12567a;
                    ProductDetailsRowAccordion productDetailsRowAccordion = onAccordionClicked.b;
                    if (z2) {
                        AnalyticsData analyticsData6 = productDetailsRowAccordion.e;
                        if (analyticsData6 != null) {
                            productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsData6));
                        }
                    } else {
                        AnalyticsData analyticsData7 = productDetailsRowAccordion.f;
                        if (analyticsData7 != null) {
                            productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsData7));
                        }
                    }
                } else if (event instanceof ProductDetailsEvent.OnBannerActionClick) {
                    ActionData actionData3 = ((ProductDetailsEvent.OnBannerActionClick) event).f12569a;
                    if (actionData3 != null && (analytics = actionData3.getAnalytics()) != null) {
                        productDetailsViewModel.C6(AnalyticsDataKt.a(analytics));
                    }
                    if (actionData3 != null) {
                        sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchLink(actionData3.getAction()));
                    }
                } else if (event instanceof ProductDetailsEvent.OnCartClick) {
                    sharedFlowImpl.f(ProductDetailsContract.Action.ShowCartScreen.f12564a);
                } else if (event instanceof ProductDetailsEvent.OnCloseImageGallery) {
                    ProductImage productImageW6 = productDetailsViewModel.w6(((ProductDetailsEvent.OnCloseImageGallery) event).f12571a);
                    if (productImageW6 != null && (analyticsData5 = productImageW6.e) != null) {
                        productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsData5));
                    }
                } else if (event instanceof ProductDetailsEvent.OnErrorTryAgain) {
                    productDetailsViewModel.r6(false);
                } else if (event instanceof ProductDetailsEvent.OnEverydayMarketCouponCodeClicked) {
                    String couponCode = ((ProductDetailsEvent.OnEverydayMarketCouponCodeClicked) event).f12573a;
                    Intrinsics.h(couponCode, "couponCode");
                    sharedFlowImpl.f(new ProductDetailsContract.Action.CopyEverydayMarketCouponCode(couponCode));
                } else if (event instanceof ProductDetailsEvent.OnEverydayMarketTermsAndConditionsClicked) {
                    String url = ((ProductDetailsEvent.OnEverydayMarketTermsAndConditionsClicked) event).f12574a;
                    Intrinsics.h(url, "url");
                    sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchLink(url));
                } else if (event instanceof ProductDetailsEvent.OnFooterButtonClick) {
                    ButtonData buttonData = ((ProductDetailsEvent.OnFooterButtonClick) event).f12575a;
                    Intrinsics.h(buttonData, "buttonData");
                    ButtonActionData buttonActionData = buttonData.d;
                    FooterButtonAction footerButtonAction = buttonActionData != null ? buttonActionData.b : null;
                    switch (footerButtonAction != null ? ProductDetailsViewModel.WhenMappings.f12592a[footerButtonAction.ordinal()] : -1) {
                        case 1:
                            AnalyticsData analyticsDataV6 = productDetailsViewModel.v6(FooterButtonAction.f);
                            if (analyticsDataV6 != null) {
                                productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsDataV6));
                            }
                            ProductCard productCardU6 = productDetailsViewModel.u6();
                            if (productCardU6 != null) {
                                productDetailsViewModel.z6(productCardU6);
                                break;
                            }
                            break;
                        case 2:
                            AnalyticsData analyticsDataV62 = productDetailsViewModel.v6(FooterButtonAction.g);
                            if (analyticsDataV62 != null) {
                                productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsDataV62));
                            }
                            ProductCard productCardU62 = productDetailsViewModel.u6();
                            if (productCardU62 != null) {
                                productDetailsViewModel.A6(productCardU62);
                                break;
                            }
                            break;
                        case 3:
                            AnalyticsData analyticsDataV63 = productDetailsViewModel.v6(FooterButtonAction.e);
                            if (analyticsDataV63 != null) {
                                productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsDataV63));
                            }
                            ProductCard productCardU63 = productDetailsViewModel.u6();
                            if (productCardU63 != null) {
                                sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchListsBottomSheet(productCardU63));
                                break;
                            }
                            break;
                        case 4:
                            AnalyticsData analyticsDataV64 = productDetailsViewModel.v6(FooterButtonAction.h);
                            if (analyticsDataV64 != null) {
                                productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsDataV64));
                            }
                            ProductCard productCardU64 = productDetailsViewModel.u6();
                            if (productCardU64 != null) {
                                sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchSeeInStoreBottomSheet(productCardU64));
                                break;
                            }
                            break;
                        case 5:
                            sharedFlowImpl.f(ProductDetailsContract.Action.LaunchProductAlternativesScreen.f12557a);
                            break;
                        case 6:
                            AnalyticsData analyticsDataV65 = productDetailsViewModel.v6(FooterButtonAction.j);
                            if (analyticsDataV65 != null) {
                                productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsDataV65));
                            }
                            ProductCard productCardU65 = productDetailsViewModel.u6();
                            if (productCardU65 != null) {
                                sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchCheckStockScreen(productCardU65));
                                break;
                            }
                            break;
                    }
                } else if (event instanceof ProductDetailsEvent.OnHealthierOptionCtaClicked) {
                    ProductDetailsEvent.OnHealthierOptionCtaClicked onHealthierOptionCtaClicked = (ProductDetailsEvent.OnHealthierOptionCtaClicked) event;
                    String str3 = onHealthierOptionCtaClicked.f12576a;
                    AnalyticsData analyticsData8 = onHealthierOptionCtaClicked.b;
                    if (analyticsData8 != null) {
                        productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsData8));
                    }
                    if (str3 != null) {
                        sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchLink(str3));
                    }
                } else if (event instanceof ProductDetailsEvent.OnLinkRowClicked) {
                    ProductDetailsRowLink rowLinkData = ((ProductDetailsEvent.OnLinkRowClicked) event).f12578a;
                    MutableStateFlow mutableStateFlow = productDetailsViewModel.q;
                    Intrinsics.h(rowLinkData, "rowLinkData");
                    AnalyticsData analyticsData9 = rowLinkData.d;
                    if (analyticsData9 != null) {
                        productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsData9));
                    }
                    Object obj3 = rowLinkData.b;
                    if (obj3 instanceof ParagraphTextItemData) {
                        ProductDetailsViewModel.E6(productDetailsViewModel, mutableStateFlow, false, null, false, rowLinkData, null, null, null, null, null, 1007);
                    } else if (obj3 instanceof NutritionInfo) {
                        ProductDetailsViewModel.E6(productDetailsViewModel, mutableStateFlow, false, null, false, null, (NutritionInfo) obj3, null, null, null, null, 991);
                    } else if (obj3 instanceof InfoSection) {
                        ProductDetailsViewModel.E6(productDetailsViewModel, mutableStateFlow, false, null, false, null, null, (InfoSection) obj3, null, null, null, 959);
                    }
                } else if (event instanceof ProductDetailsEvent.OnLocationInfoClick) {
                    ProductCard productCardU66 = productDetailsViewModel.u6();
                    if (productCardU66 != null) {
                        final String instoreLocationText = ProductCardKt.getInstoreLocationText(productCardU66);
                        if (instoreLocationText != null) {
                            final ProductDetailsAnalytics.Details.Action action3 = new ProductDetailsAnalytics.Details(productDetailsViewModel.x6()).g;
                            action3.getClass();
                            productDetailsViewModel.C6(new Event(action3, instoreLocationText) { // from class: au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics$Details$Action$aisleButtonClick$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                    spreadBuilder.b(action3.f4045a.f);
                                    spreadBuilder.a(new Pair("event.Category", "button"));
                                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                                    androidx.constraintlayout.core.state.a.z("event.Label", "Aisle", spreadBuilder, "event.Description", instoreLocationText);
                                    ArrayList arrayList = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getE() {
                                    return "button_click";
                                }

                                public final boolean equals(Object obj4) {
                                    if (!(obj4 instanceof Event)) {
                                        return false;
                                    }
                                    Event event2 = (Event) obj4;
                                    return "button_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            });
                        }
                        sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchInStoreMap(productCardU66));
                    }
                } else if (event instanceof ProductDetailsEvent.OnOpenImageGallery) {
                    ProductImage productImageW62 = productDetailsViewModel.w6(((ProductDetailsEvent.OnOpenImageGallery) event).f12580a);
                    if (productImageW62 != null && (analyticsData4 = productImageW62.c) != null) {
                        productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsData4));
                    }
                } else if (event instanceof ProductDetailsEvent.OnSeeAllRatingsAndReviewsClicked) {
                    ProductDetailsEvent.OnSeeAllRatingsAndReviewsClicked onSeeAllRatingsAndReviewsClicked = (ProductDetailsEvent.OnSeeAllRatingsAndReviewsClicked) event;
                    String link2 = onSeeAllRatingsAndReviewsClicked.f12584a;
                    final String linkLabel2 = onSeeAllRatingsAndReviewsClicked.b;
                    Intrinsics.h(link2, "link");
                    Intrinsics.h(linkLabel2, "linkLabel");
                    final ProductDetailsAnalytics.Details.Action action4 = new ProductDetailsAnalytics.Details(productDetailsViewModel.x6()).g;
                    action4.getClass();
                    productDetailsViewModel.C6(new Event(action4, linkLabel2) { // from class: au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics$Details$Action$seeAllReviewButtonClicked$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                            spreadBuilder.b(action4.f4045a.f);
                            androidx.constraintlayout.core.state.a.z("event.Category", "Product Ratings and Reviews", spreadBuilder, "event.Action", "link_click");
                            androidx.constraintlayout.core.state.a.y("event.Label", String.valueOf(linkLabel2), spreadBuilder);
                            ArrayList arrayList = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getE() {
                            return "seeall_linkclick";
                        }

                        public final boolean equals(Object obj4) {
                            if (!(obj4 instanceof Event)) {
                                return false;
                            }
                            Event event2 = (Event) obj4;
                            return "seeall_linkclick".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    });
                    sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchLink(link2));
                } else if (event instanceof ProductDetailsEvent.OnShareClick) {
                    productDetailsViewModel.C6((Event) new ProductDetailsAnalytics.Details(productDetailsViewModel.x6()).g.c.getD());
                    sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchShareProductIntent(productDetailsViewModel.e));
                } else if (event instanceof ProductDetailsEvent.OnShowAllReviewsClicked) {
                    String link3 = ((ProductDetailsEvent.OnShowAllReviewsClicked) event).f12586a;
                    Intrinsics.h(link3, "link");
                    productDetailsViewModel.C6((Event) new ProductDetailsAnalytics.Details(productDetailsViewModel.x6()).g.b.getD());
                    sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchLink(link3));
                } else if (event instanceof ProductDetailsEvent.OnSwipeImageGallery) {
                    ProductDetailsEvent.OnSwipeImageGallery onSwipeImageGallery = (ProductDetailsEvent.OnSwipeImageGallery) event;
                    int i4 = onSwipeImageGallery.f12587a;
                    int i5 = onSwipeImageGallery.b;
                    ProductImage productImageW63 = productDetailsViewModel.w6(i5);
                    if (productImageW63 != null && (analyticsData3 = productImageW63.d) != null) {
                        productDetailsViewModel.C6(AnalyticsDataKt.a(AnalyticsData.a(analyticsData3, i5 > i4 ? "right navigation" : "left navigation", null, null, null, 2015)));
                    }
                } else if (event instanceof ProductDetailsEvent.OnProductDetailsThumbnailClicked) {
                    ProductImage productImageW64 = productDetailsViewModel.w6(((ProductDetailsEvent.OnProductDetailsThumbnailClicked) event).f12581a);
                    if (productImageW64 != null && (analyticsData2 = productImageW64.g) != null) {
                        productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsData2));
                    }
                } else {
                    if (!(event instanceof ProductDetailsEvent.OnImageGalleryThumbnailClicked)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ProductImage productImageW65 = productDetailsViewModel.w6(((ProductDetailsEvent.OnImageGalleryThumbnailClicked) event).f12577a);
                    if (productImageW65 != null && (analyticsData = productImageW65.f) != null) {
                        productDetailsViewModel.C6(AnalyticsDataKt.a(analyticsData));
                    }
                }
                return unit;
            case 3:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, MemberPriceInfoKt.contentDescription((MemberPriceInfo) obj2));
                return unit;
            case 4:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics, ((MarketplaceInfo) obj2).b.b);
                return unit;
            case 5:
                String errorMessage = (String) obj;
                Intrinsics.h(errorMessage, "errorMessage");
                ((RatingReviewHandler) obj2).r5(errorMessage);
                return unit;
            case 6:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.k(semantics2, ((Cta) obj2).e.e);
                return unit;
            case 7:
                String it2 = (String) obj;
                Intrinsics.h(it2, "it");
                ContextExtKt.e((PromoAppActivity) obj2, it2);
                return unit;
            case 8:
                SpecialsHomeViewModel specialsHomeViewModel = (SpecialsHomeViewModel) obj2;
                List seen = (List) obj;
                Intrinsics.h(seen, "seen");
                ArrayList arrayList = new ArrayList();
                Iterator it3 = seen.iterator();
                while (it3.hasNext()) {
                    Object contentType = ((LazyListItemInfo) it3.next()).getM();
                    if (contentType != null) {
                        arrayList.add(contentType);
                    }
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Object item = it4.next();
                    LinkedHashSet linkedHashSet = specialsHomeViewModel.n;
                    AnalyticsManager analyticsManager = specialsHomeViewModel.i;
                    Intrinsics.h(item, "item");
                    if (specialsHomeViewModel.m.add(item)) {
                        if (item instanceof HorizontalListData) {
                            HorizontalListData horizontalListData = (HorizontalListData) item;
                            if (SpecialsHomeViewModelKt.a(horizontalListData)) {
                                SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
                                final String title = horizontalListData.getD();
                                if (title == null) {
                                    title = "";
                                }
                                companion.getClass();
                                analyticsManager.g(new Event(title) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$productCarouselImpression$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(SpecialsAnalytics.Home.f);
                                        spreadBuilder.a(new Pair("event.Category", "specials-hub-body"));
                                        spreadBuilder.a(new Pair("event.Action", "product_impression"));
                                        a.z("event.Label", "Product List Data Loaded", spreadBuilder, "event.Description", title);
                                        ArrayList arrayList2 = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "specialshub_productimpression";
                                    }

                                    public final boolean equals(Object obj4) {
                                        if (!(obj4 instanceof Event)) {
                                            return false;
                                        }
                                        Event event2 = (Event) obj4;
                                        return "specialshub_productimpression".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                });
                            } else if (SpecialsHomeViewModelKt.b(horizontalListData)) {
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(linkedHashSet, 10));
                                Iterator it5 = linkedHashSet.iterator();
                                while (it5.hasNext()) {
                                    arrayList2.add(((PromotionCard) it5.next()).getProductCard());
                                }
                                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(linkedHashSet, 10));
                                Iterator it6 = linkedHashSet.iterator();
                                while (it6.hasNext()) {
                                    arrayList3.add(((PromotionCard) it6.next()).getOfferId());
                                }
                                SpecialsAnalytics.Home.Action.Companion companion2 = SpecialsAnalytics.Home.Action.d;
                                final String title2 = horizontalListData.getD();
                                if (title2 == null) {
                                    title2 = "";
                                }
                                final String offerId = CollectionsKt.M(arrayList3, " | ", null, null, null, 62);
                                companion2.getClass();
                                Intrinsics.h(offerId, "offerId");
                                analyticsManager.i(new Event(title2, offerId) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionCarouselImpression$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                        spreadBuilder.b(SpecialsAnalytics.Home.f);
                                        spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                                        spreadBuilder.a(new Pair("event.Action", "show"));
                                        spreadBuilder.a(new Pair("event.Category", "universal_product_list_price_family_variants"));
                                        a.z("event.Label", title2.concat(" - Product List Data Loaded"), spreadBuilder, "event.Description", offerId);
                                        ArrayList arrayList4 = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList4.toArray(new Pair[arrayList4.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "show_universal_product_list";
                                    }

                                    public final boolean equals(Object obj4) {
                                        if (!(obj4 instanceof Event)) {
                                            return false;
                                        }
                                        Event event2 = (Event) obj4;
                                        return "show_universal_product_list".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                }, ProductAnalyticsExtKt.f(arrayList2));
                                linkedHashSet.clear();
                            }
                        } else if (item instanceof CatalogueCard) {
                            SpecialsAnalytics.Home.Action.Companion companion3 = SpecialsAnalytics.Home.Action.d;
                            CatalogueCard catalogueCard = (CatalogueCard) item;
                            final String title3 = catalogueCard.b + " " + catalogueCard.f10140a;
                            companion3.getClass();
                            Intrinsics.h(title3, "title");
                            analyticsManager.g(new Event(title3) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$catalogueImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                    spreadBuilder.b(SpecialsAnalytics.Home.f);
                                    spreadBuilder.a(new Pair("event.Category", "catalogue"));
                                    spreadBuilder.a(new Pair("event.Action", "banner_impression"));
                                    a.y("event.Label", title3, spreadBuilder);
                                    ArrayList arrayList4 = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList4.toArray(new Pair[arrayList4.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getE() {
                                    return "specialshub_bannerimpression";
                                }

                                public final boolean equals(Object obj4) {
                                    if (!(obj4 instanceof Event)) {
                                        return false;
                                    }
                                    Event event2 = (Event) obj4;
                                    return "specialshub_bannerimpression".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            });
                        } else if (item instanceof ActionableCard) {
                            SpecialsAnalytics.Home.Action.Companion companion4 = SpecialsAnalytics.Home.Action.d;
                            final String description = ((ActionableCard) item).getAltText();
                            companion4.getClass();
                            Intrinsics.h(description, "description");
                            analyticsManager.g(new Event(description) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$actionableCardImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                    spreadBuilder.b(SpecialsAnalytics.Home.f);
                                    spreadBuilder.a(new Pair("event.Category", "specials-hub-body"));
                                    spreadBuilder.a(new Pair("event.Action", "banner_impression"));
                                    a.z("event.Label", "Actionable Card", spreadBuilder, "event.Description", description);
                                    ArrayList arrayList4 = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList4.toArray(new Pair[arrayList4.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getE() {
                                    return "specialshub_bannerimpression";
                                }

                                public final boolean equals(Object obj4) {
                                    if (!(obj4 instanceof Event)) {
                                        return false;
                                    }
                                    Event event2 = (Event) obj4;
                                    return "specialshub_bannerimpression".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            });
                        }
                    }
                }
                return unit;
            case 9:
                return (Image) obj2;
            case 10:
                ((WebSocket) obj2).e(1001, null);
                return unit;
            case 11:
                DaggerBaseMvvmActivity daggerBaseMvvmActivity = (DaggerBaseMvvmActivity) obj2;
                Lazy lazy = daggerBaseMvvmActivity.C;
                com.woolworths.scanlibrary.util.event.Event event2 = (com.woolworths.scanlibrary.util.event.Event) obj;
                int i6 = DaggerBaseMvvmActivity.D;
                CommonViewAction commonViewAction = event2 != null ? (CommonViewAction) event2.a() : null;
                if (commonViewAction instanceof CommonViewAction.ApplicationError) {
                    CommonViewAction.ApplicationError applicationError = (CommonViewAction.ApplicationError) commonViewAction;
                    int i7 = applicationError.f21144a;
                    ApigeeErrorResponse apigeeErrorResponse = applicationError.b;
                    int i8 = applicationError.c;
                    Function0 function0 = applicationError.d;
                    daggerBaseMvvmActivity.N3(false);
                    ((ErrorHandlingDelegate) lazy.getD()).a(i7, i8, apigeeErrorResponse, function0);
                } else if (commonViewAction instanceof CommonViewAction.NonApplicationError) {
                    MvpView.ErrorType errorType = ((CommonViewAction.NonApplicationError) commonViewAction).f21145a;
                    daggerBaseMvvmActivity.N3(false);
                    ((ErrorHandlingDelegate) lazy.getD()).b(errorType);
                } else if (commonViewAction instanceof CommonViewAction.ShowTapOff) {
                    Timber.f27013a.h("showTapOff() from " + daggerBaseMvvmActivity, new Object[0]);
                    CheckOutActivity.Companion.a(daggerBaseMvvmActivity);
                } else if (commonViewAction instanceof CommonViewAction.ShowTapOnView) {
                    TapActivity.Companion.a(daggerBaseMvvmActivity, null, null, 12);
                } else if (commonViewAction instanceof CommonViewAction.ShowSignInView) {
                    SngInitializerActivity.Companion.a(daggerBaseMvvmActivity, false);
                } else {
                    if (commonViewAction instanceof CommonViewAction.ShowError) {
                        daggerBaseMvvmActivity.T4(null, null);
                        throw null;
                    }
                    if (commonViewAction instanceof CommonViewAction.ShowGenericError) {
                        Intrinsics.h(null, "listenerAction");
                        String string = daggerBaseMvvmActivity.getString(R.string.sng_error_unhandled);
                        Intrinsics.g(string, "getString(...)");
                        daggerBaseMvvmActivity.T4(string, new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(22, null));
                        throw null;
                    }
                    if (commonViewAction instanceof CommonViewAction.ShowNetworkError) {
                        Intrinsics.h(null, "listenerAction");
                        String string2 = daggerBaseMvvmActivity.getString(R.string.sng_no_network);
                        Intrinsics.g(string2, "getString(...)");
                        daggerBaseMvvmActivity.T4(string2, new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(23, null));
                        throw null;
                    }
                    if (commonViewAction instanceof CommonViewAction.SetLoadingIndicator) {
                        daggerBaseMvvmActivity.N3(false);
                    }
                }
                return unit;
            case 12:
                Cart cart = ((AddToCartUseCase) obj2).d;
                CartResponse response = (CartResponse) obj;
                Intrinsics.h(response, "response");
                if (response.getItems().isEmpty()) {
                    return !response.getCoupons().isEmpty() ? Single.e(new AddToCartUseCase.CouponResponseValue(response.getCoupons().get(0))) : Single.c(new RuntimeException("Invalid Product Item"));
                }
                Item item2 = response.getItems().get(0);
                cart.F(response);
                cart.I(item2, !item2.getItemIs().getWeightrequired() || item2.getItemIs().getWeighed());
                if (response.getCoupons().isEmpty()) {
                    return Single.e(new AddToCartUseCase.ItemResponseValue(null, item2, false));
                }
                Coupon coupon = response.getCoupons().get(0);
                return Single.e(new AddToCartUseCase.ItemResponseValue(coupon, item2, coupon.getStatus() == CouponStatus.REDEEMED));
            case 13:
                CartResponse response2 = (CartResponse) obj;
                Intrinsics.h(response2, "response");
                Cart cart2 = ((CheckoutCartUseCase) obj2).d;
                cart2.a();
                Iterator<T> it7 = response2.getItems().iterator();
                while (it7.hasNext()) {
                    cart2.I((Item) it7.next(), false);
                }
                cart2.F(response2);
                cart2.D(response2.getDiscounts());
                cart2.y(response2.getTotalDiscount());
                return Single.e(new CheckoutCartUseCase.ResponseValue(response2));
            case 14:
                CartResponse response3 = (CartResponse) obj;
                Intrinsics.h(response3, "response");
                Cart cart3 = ((ClearCartUseCase) obj2).d;
                cart3.a();
                cart3.F(response3);
                return Single.e(new ClearCartUseCase.ResponseValue());
            case 15:
                CartResponse response4 = (CartResponse) obj;
                Intrinsics.h(response4, "response");
                Cart cart4 = ((GetCartUseCase) obj2).d;
                cart4.a();
                Iterator<T> it8 = response4.getItems().iterator();
                while (it8.hasNext()) {
                    cart4.I((Item) it8.next(), false);
                }
                cart4.F(response4);
                return Single.e(new GetCartUseCase.ResponseValue());
            case 16:
                FetchScanAndGoInteractor fetchScanAndGoInteractor = (FetchScanAndGoInteractor) obj2;
                fetchScanAndGoInteractor.b((ScanAndGoUserData) ((Component) obj).b());
                fetchScanAndGoInteractor.f21181a.c.b("");
                return unit;
            case 17:
                SignInUC.ResponseValue response5 = (SignInUC.ResponseValue) obj;
                Intrinsics.h(response5, "response");
                ((UserManager) obj2).c();
                return Single.e(response5);
            case 18:
                List it9 = (List) obj;
                Intrinsics.h(it9, "it");
                return Observable.e(new AutoCompleteUC.ResponseValue(it9, ((AutoCompleteUC.RequestValues) obj2).f21195a));
            case 19:
                ShoppingCartActivity shoppingCartActivity = (ShoppingCartActivity) obj2;
                com.woolworths.scanlibrary.util.event.Event event3 = (com.woolworths.scanlibrary.util.event.Event) obj;
                int i9 = ShoppingCartActivity.V;
                if ((event3 != null ? (ShoppingCartContract.ShoppingCartEvent) event3.a() : null) instanceof ShoppingCartContract.ShoppingCartEvent.ShowTapOnViewEvent) {
                    shoppingCartActivity.N3(false);
                    shoppingCartActivity.b5();
                }
                return unit;
            case 20:
                AvailableStoresActivity availableStoresActivity = (AvailableStoresActivity) obj2;
                com.woolworths.scanlibrary.util.event.Event event4 = (com.woolworths.scanlibrary.util.event.Event) obj;
                int i10 = AvailableStoresActivity.L;
                AvailableStoreContract.Actions actions = event4 != null ? (AvailableStoreContract.Actions) event4.a() : null;
                if (actions instanceof AvailableStoreContract.Actions.AvailableStoreLoadingSuccess) {
                    AvailableStoreViewModel availableStoreViewModelV4 = availableStoresActivity.V4();
                    List list = availableStoresActivity.I;
                    if (list == null) {
                        Intrinsics.p("sateStringList");
                        throw null;
                    }
                    List listS6 = availableStoreViewModelV4.s6((String) list.get(0));
                    availableStoresActivity.G = listS6;
                    AvailableStoresActivity$getAvailableStoreLocationListView$1 availableStoresActivity$getAvailableStoreLocationListView$1 = availableStoresActivity.H;
                    if (availableStoresActivity$getAvailableStoreLocationListView$1 == null) {
                        Intrinsics.p("availableStoreListAdapter");
                        throw null;
                    }
                    availableStoresActivity$getAvailableStoreLocationListView$1.H(listS6);
                    availableStoresActivity.X4(listS6);
                    ActivityAvailableStoresBinding activityAvailableStoresBinding = availableStoresActivity.E;
                    if (activityAvailableStoresBinding == null) {
                        Intrinsics.p("viewBinding");
                        throw null;
                    }
                    RecyclerView availableStores = activityAvailableStoresBinding.z;
                    Intrinsics.g(availableStores, "availableStores");
                    AvailableStoresActivity.W4(R.anim.layout_animation_fall_down, availableStores);
                } else if (actions instanceof AvailableStoreContract.Actions.AvailableStoreLoadingFail) {
                    EmptyList emptyList = EmptyList.d;
                    availableStoresActivity.G = emptyList;
                    AvailableStoresActivity$getAvailableStoreLocationListView$1 availableStoresActivity$getAvailableStoreLocationListView$12 = availableStoresActivity.H;
                    if (availableStoresActivity$getAvailableStoreLocationListView$12 == null) {
                        Intrinsics.p("availableStoreListAdapter");
                        throw null;
                    }
                    availableStoresActivity$getAvailableStoreLocationListView$12.H(emptyList);
                    availableStoresActivity.X4(emptyList);
                    ActivityAvailableStoresBinding activityAvailableStoresBinding2 = availableStoresActivity.E;
                    if (activityAvailableStoresBinding2 == null) {
                        Intrinsics.p("viewBinding");
                        throw null;
                    }
                    activityAvailableStoresBinding2.A.setImageDrawable(availableStoresActivity.getDrawable(R.drawable.sng_ic_attention));
                    ActivityAvailableStoresBinding activityAvailableStoresBinding3 = availableStoresActivity.E;
                    if (activityAvailableStoresBinding3 == null) {
                        Intrinsics.p("viewBinding");
                        throw null;
                    }
                    TextView storeEmptyMsg = activityAvailableStoresBinding3.D;
                    Intrinsics.g(storeEmptyMsg, "storeEmptyMsg");
                    String string3 = availableStoresActivity.getString(R.string.sng_label_store_info_loading_fail);
                    Intrinsics.g(string3, "getString(...)");
                    String string4 = availableStoresActivity.getString(R.string.sng_label_retry);
                    Intrinsics.g(string4, "getString(...)");
                    Locale locale = Locale.US;
                    TextViewExtKt.a(storeEmptyMsg, availableStoresActivity, string3, androidx.constraintlayout.core.state.a.m(locale, "US", string4, locale, "toLowerCase(...)"), R.color.sng_charcoal, R.color.sng_color_primary, new com.woolworths.scanlibrary.ui.stores.c(availableStoresActivity, z ? 1 : 0));
                } else if (actions != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return unit;
            case 21:
                TapOnFragment tapOnFragment = (TapOnFragment) obj2;
                AtomicBoolean atomicBoolean = tapOnFragment.x;
                com.woolworths.scanlibrary.util.event.Event event5 = (com.woolworths.scanlibrary.util.event.Event) obj;
                TapOnContract.ViewState viewState = event5 != null ? (TapOnContract.ViewState) event5.a() : null;
                if (Intrinsics.c(viewState, TapOnContract.ViewState.SUCCESS_WITH_STORE_DETAILS.f21353a)) {
                    tapOnFragment.q = false;
                    if (tapOnFragment.s != -1) {
                        tapOnFragment.n2();
                    } else {
                        ((TapOnContract.Presenter) tapOnFragment.Q1()).J();
                        if (((TapOnContract.Presenter) tapOnFragment.Q1()).j0()) {
                            FragmentActivity activity = tapOnFragment.getActivity();
                            if (activity != null) {
                                String string5 = tapOnFragment.getString(R.string.sng_label_bag_as_you_go);
                                Intrinsics.g(string5, "getString(...)");
                                String string6 = tapOnFragment.getString(R.string.sng_remind_scan_and_bag);
                                Intrinsics.g(string6, "getString(...)");
                                String string7 = tapOnFragment.getString(R.string.sng_label_ok);
                                Intrinsics.g(string7, "getString(...)");
                                com.woolworths.scanlibrary.ui.tap.tapon.a aVar = new com.woolworths.scanlibrary.ui.tap.tapon.a(tapOnFragment, z ? 1 : 0);
                                String string8 = tapOnFragment.getString(R.string.sng_label_do_not_remind_me_again);
                                Intrinsics.g(string8, "getString(...)");
                                AppCompatActivityExtKt.b(activity, string5, string6, string7, aVar, string8, new com.woolworths.scanlibrary.ui.tap.tapon.a(tapOnFragment, i2), false);
                            }
                        } else {
                            tapOnFragment.n2();
                        }
                    }
                } else if (Intrinsics.c(viewState, TapOnContract.ViewState.CANNOT_FETCH_STORE_DETAILS.f21348a)) {
                    atomicBoolean.set(false);
                    FragmentActivity fragmentActivityRequireActivity = tapOnFragment.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                    String string9 = tapOnFragment.getString(R.string.sng_error_store_details_failure);
                    Intrinsics.g(string9, "getString(...)");
                    String string10 = tapOnFragment.getString(R.string.sng_label_ok);
                    Intrinsics.g(string10, "getString(...)");
                    AppCompatActivityExtKt.d(fragmentActivityRequireActivity, string9, string10, new au.com.woolworths.android.onesite.deeplink.h(20));
                    tapOnFragment.q = false;
                    tapOnFragment.d3();
                } else if (viewState instanceof TapOnContract.ViewState.GUEST_ACCESS_UNAVAILABLE) {
                    atomicBoolean.set(false);
                    tapOnFragment.q = false;
                    TapOnFragment.TapOnFragmentInteraction tapOnFragmentInteraction = tapOnFragment.u;
                    if (tapOnFragmentInteraction != null) {
                        tapOnFragmentInteraction.X2();
                    }
                    tapOnFragment.d3();
                    FragmentTapOnBinding fragmentTapOnBinding = tapOnFragment.o;
                    if (fragmentTapOnBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    fragmentTapOnBinding.A.setVisibility(0);
                    FragmentTapOnBinding fragmentTapOnBinding2 = tapOnFragment.o;
                    if (fragmentTapOnBinding2 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    TapOnContract.ViewState.GUEST_ACCESS_UNAVAILABLE guest_access_unavailable = (TapOnContract.ViewState.GUEST_ACCESS_UNAVAILABLE) viewState;
                    fragmentTapOnBinding2.z.B.setText(guest_access_unavailable.f21349a);
                    FragmentTapOnBinding fragmentTapOnBinding3 = tapOnFragment.o;
                    if (fragmentTapOnBinding3 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    fragmentTapOnBinding3.z.A.setText(guest_access_unavailable.b);
                    FragmentTapOnBinding fragmentTapOnBinding4 = tapOnFragment.o;
                    if (fragmentTapOnBinding4 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    fragmentTapOnBinding4.z.y.setImageResource(R.drawable.sng_ic_exclamation);
                    FragmentTapOnBinding fragmentTapOnBinding5 = tapOnFragment.o;
                    if (fragmentTapOnBinding5 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    fragmentTapOnBinding5.z.z.setOnClickListener(new com.woolworths.scanlibrary.ui.tap.tapon.c(tapOnFragment, z ? 1 : 0));
                } else if (Intrinsics.c(viewState, timeout_locate_tap_on_device)) {
                    tapOnFragment.q = false;
                    atomicBoolean.set(false);
                    tapOnFragment.o2();
                    tapOnFragment.d3();
                    ((BlueCatsBeaconScanner) tapOnFragment.i2()).e();
                } else if (Intrinsics.c(viewState, TapOnContract.ViewState.NON_APPLICATION_FAILURE.f21350a)) {
                    tapOnFragment.q = false;
                    atomicBoolean.set(false);
                    tapOnFragment.o2();
                    tapOnFragment.d3();
                } else if (Intrinsics.c(viewState, TapOnContract.ViewState.PARKING_AVAILABLE.f21351a)) {
                    Menu menu = tapOnFragment.t;
                    if (menu == null) {
                        Intrinsics.p("mainMenu");
                        throw null;
                    }
                    MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_parking);
                    if (menuItemFindItem != null) {
                        menuItemFindItem.setEnabled(true);
                    }
                } else if (Intrinsics.c(viewState, TapOnContract.ViewState.PARKING_NOT_AVAILABLE.f21352a)) {
                    Menu menu2 = tapOnFragment.t;
                    if (menu2 == null) {
                        Intrinsics.p("mainMenu");
                        throw null;
                    }
                    MenuItem menuItemFindItem2 = menu2.findItem(R.id.menu_item_parking);
                    if (menuItemFindItem2 != null) {
                        menuItemFindItem2.setEnabled(false);
                    }
                } else if (viewState != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return unit;
            case 22:
                TapOnPresenter tapOnPresenter = (TapOnPresenter) obj2;
                tapOnPresenter.r.j(new com.woolworths.scanlibrary.util.event.Event(timeout_locate_tap_on_device));
                tapOnPresenter.p.f4059a.remove("sng_beacon_scan_native");
                tapOnPresenter.k.j(TapOnActionData.f, TrackingMetadata.Companion.a(TrackableValue.l0, "beacon timeout"));
                return unit;
            case 23:
                Retryable retryable = (Retryable) obj2;
                Token token = (Token) obj;
                if (token != null) {
                    retryable.a(token.getAccessToken());
                }
                return unit;
            case 24:
                return obj == ((AbstractCollection) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 25:
                AbstractMap abstractMap = (AbstractMap) obj2;
                Map.Entry it10 = (Map.Entry) obj;
                Intrinsics.h(it10, "it");
                StringBuilder sb = new StringBuilder();
                Object key = it10.getKey();
                sb.append(key == abstractMap ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = it10.getValue();
                sb.append(value != abstractMap ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 26:
                KTypeProjection it11 = (KTypeProjection) obj;
                Intrinsics.h(it11, "it");
                ((TypeReference) obj2).getClass();
                KVariance kVariance = it11.f24271a;
                KType kType = it11.b;
                if (kVariance == null) {
                    return "*";
                }
                TypeReference typeReference = kType instanceof TypeReference ? (TypeReference) kType : null;
                String strValueOf = (typeReference == null || (strH = typeReference.h(true)) == null) ? String.valueOf(kType) : strH;
                int i11 = TypeReference.WhenMappings.f24270a[kVariance.ordinal()];
                if (i11 == 1) {
                    return strValueOf;
                }
                if (i11 == 2) {
                    return "in ".concat(strValueOf);
                }
                if (i11 == 3) {
                    return "out ".concat(strValueOf);
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) obj2;
                if (!booleanRef.d && Intrinsics.c(obj, null)) {
                    booleanRef.d = true;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) obj2;
                ClassSerialDescriptorBuilder buildSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                Intrinsics.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "type", StringSerializer.b);
                ClassSerialDescriptorBuilder.a(buildSerialDescriptor, "value", SerialDescriptorsKt.e("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.f24750a.B() + '>', SerialKind.CONTEXTUAL.f24772a, new SerialDescriptor[0]));
                List list2 = polymorphicSerializer.b;
                Intrinsics.h(list2, "<set-?>");
                buildSerialDescriptor.b = list2;
                return unit;
            default:
                SerialDescriptorImpl serialDescriptorImpl = (SerialDescriptorImpl) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return serialDescriptorImpl.f[iIntValue] + ": " + serialDescriptorImpl.g[iIntValue].getF24814a();
        }
    }

    public /* synthetic */ i(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}
